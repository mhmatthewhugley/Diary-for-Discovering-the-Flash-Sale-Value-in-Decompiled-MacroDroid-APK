package com.google.firebase.firestore.local;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.local.MemoryIndexManager;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.List;

class SQLiteSchema {

    /* renamed from: a */
    private final SQLiteDatabase f54390a;

    /* renamed from: b */
    private final LocalSerializer f54391b;

    SQLiteSchema(SQLiteDatabase sQLiteDatabase, LocalSerializer localSerializer) {
        this.f54390a = sQLiteDatabase;
        this.f54391b = localSerializer;
    }

    /* renamed from: B */
    static /* synthetic */ void m75716B(boolean[] zArr, SQLiteStatement sQLiteStatement, long j, Cursor cursor) {
        boolean z = true;
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j);
        if (sQLiteStatement.executeInsert() == -1) {
            z = false;
        }
        Assert.m76443d(z, "Failed to insert a sentinel row", new Object[0]);
    }

    /* renamed from: D */
    static /* synthetic */ void m75718D(SQLiteSchema sQLiteSchema, Cursor cursor) {
        String string = cursor.getString(0);
        long j = cursor.getLong(1);
        new SQLitePersistence.Query(sQLiteSchema.f54390a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").mo62760a(string, Long.valueOf(j)).mo62763d(SQLiteSchema$$Lambda$15.m75759a(sQLiteSchema, string));
    }

    /* renamed from: E */
    static /* synthetic */ void m75719E(SQLiteSchema sQLiteSchema, Cursor cursor) {
        int i = cursor.getInt(0);
        try {
            String a = sQLiteSchema.f54391b.mo62599f(Target.m76060m0(cursor.getBlob(1))).mo62787f().mo23952a();
            sQLiteSchema.f54390a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{a, Integer.valueOf(i)});
        } catch (InvalidProtocolBufferException unused) {
            throw Assert.m76440a("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    /* renamed from: F */
    private void m75720F() {
        new SQLitePersistence.Query(this.f54390a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").mo62763d(SQLiteSchema$$Lambda$2.m75760a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m75721G(String str, int i) {
        SQLiteStatement compileStatement = this.f54390a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        compileStatement.bindString(1, str);
        compileStatement.bindLong(2, (long) i);
        Assert.m76443d(compileStatement.executeUpdateDelete() != 0, "Mutatiohn batch (%s, %d) did not exist", str, Integer.valueOf(i));
        this.f54390a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i)});
    }

    /* renamed from: H */
    private void m75722H() {
        new SQLitePersistence.Query(this.f54390a, "SELECT target_id, target_proto FROM targets").mo62763d(SQLiteSchema$$Lambda$13.m75757a(this));
    }

    /* renamed from: K */
    private boolean m75723K(String str, String str2) {
        return mo62769n(str).indexOf(str2) != -1;
    }

    /* renamed from: L */
    private boolean m75724L(String str) {
        return !new SQLitePersistence.Query(this.f54390a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").mo62760a(str).mo62764e();
    }

    /* renamed from: a */
    private void m75725a() {
        this.f54390a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f54390a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    /* renamed from: b */
    private void m75726b() {
        if (!m75723K("target_documents", "sequence_number")) {
            this.f54390a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
        }
    }

    /* renamed from: c */
    private void m75727c() {
        if (!m75723K("target_globals", "target_count")) {
            this.f54390a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long queryNumEntries = DatabaseUtils.queryNumEntries(this.f54390a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(queryNumEntries));
        this.f54390a.update("target_globals", contentValues, (String) null, (String[]) null);
    }

    /* renamed from: d */
    private void m75728d() {
        m75739p(new String[]{"bundles", "named_queries"}, SQLiteSchema$$Lambda$14.m75758a(this));
    }

    /* renamed from: e */
    private void m75729e() {
        m75739p(new String[]{"collection_index"}, SQLiteSchema$$Lambda$5.m75763a(this));
    }

    /* renamed from: f */
    private void m75730f() {
        m75739p(new String[]{"mutation_queues", "mutations", "document_mutations"}, SQLiteSchema$$Lambda$1.m75753a(this));
    }

    /* renamed from: g */
    private void m75731g() {
        m75739p(new String[]{"remote_documents"}, SQLiteSchema$$Lambda$4.m75762a(this));
    }

    /* renamed from: h */
    private void m75732h() {
        m75739p(new String[]{"targets", "target_globals", "target_documents"}, SQLiteSchema$$Lambda$3.m75761a(this));
    }

    /* renamed from: i */
    private void m75733i() {
        m75739p(new String[]{"collection_parents"}, SQLiteSchema$$Lambda$9.m75767a(this));
        Consumer a = SQLiteSchema$$Lambda$10.m75754a(new MemoryIndexManager.MemoryCollectionParentIndex(), this.f54390a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"));
        new SQLitePersistence.Query(this.f54390a, "SELECT path FROM remote_documents").mo62763d(SQLiteSchema$$Lambda$11.m75755a(a));
        new SQLitePersistence.Query(this.f54390a, "SELECT path FROM document_mutations").mo62763d(SQLiteSchema$$Lambda$12.m75756a(a));
    }

    /* renamed from: j */
    private void m75734j() {
        new SQLitePersistence.Query(this.f54390a, "SELECT target_id, target_proto FROM targets").mo62763d(SQLiteSchema$$Lambda$6.m75764a(this));
    }

    /* renamed from: k */
    private void m75735k() {
        if (m75724L("targets")) {
            this.f54390a.execSQL("DROP TABLE targets");
        }
        if (m75724L("target_globals")) {
            this.f54390a.execSQL("DROP TABLE target_globals");
        }
        if (m75724L("target_documents")) {
            this.f54390a.execSQL("DROP TABLE target_documents");
        }
    }

    /* renamed from: l */
    private void m75736l() {
        Long l = (Long) new SQLitePersistence.Query(this.f54390a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").mo62762c(SQLiteSchema$$Lambda$7.m75765a());
        Assert.m76443d(l != null, "Missing highest sequence number", new Object[0]);
        long longValue = l.longValue();
        SQLiteStatement compileStatement = this.f54390a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        SQLitePersistence.Query a = new SQLitePersistence.Query(this.f54390a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").mo62760a(100);
        boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            a.mo62763d(SQLiteSchema$$Lambda$8.m75766a(zArr, compileStatement, longValue));
        } while (zArr[0]);
    }

    /* renamed from: m */
    private void m75737m() {
        if (!(DatabaseUtils.queryNumEntries(this.f54390a, "target_globals") == 1)) {
            this.f54390a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
        }
    }

    /* renamed from: o */
    private boolean m75738o() {
        boolean K = m75723K("remote_documents", "read_time_seconds");
        boolean K2 = m75723K("remote_documents", "read_time_nanos");
        Assert.m76443d(K == K2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        if (!K || !K2) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private void m75739p(String[] strArr, Runnable runnable) {
        String str;
        String str2 = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            boolean L = m75724L(str3);
            if (i == 0) {
                z = L;
            } else if (L != z) {
                String str4 = "Expected all of " + str2 + " to either exist or not, but ";
                if (z) {
                    str = str4 + strArr[0] + " exists and " + str3 + " does not";
                } else {
                    str = str4 + strArr[0] + " does not exist and " + str3 + " does";
                }
                throw new IllegalStateException(str);
            }
        }
        if (!z) {
            runnable.run();
            return;
        }
        Logger.m76508a("SQLiteSchema", "Skipping migration because all of " + str2 + " already exist", new Object[0]);
    }

    /* renamed from: q */
    static /* synthetic */ void m75740q(SQLiteSchema sQLiteSchema) {
        sQLiteSchema.f54390a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        sQLiteSchema.f54390a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* renamed from: s */
    static /* synthetic */ void m75742s(SQLiteSchema sQLiteSchema) {
        sQLiteSchema.f54390a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        sQLiteSchema.f54390a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        sQLiteSchema.f54390a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* renamed from: u */
    static /* synthetic */ void m75744u(SQLiteSchema sQLiteSchema) {
        sQLiteSchema.f54390a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        sQLiteSchema.f54390a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        sQLiteSchema.f54390a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        sQLiteSchema.f54390a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        sQLiteSchema.f54390a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* renamed from: v */
    static /* synthetic */ void m75745v(MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex, SQLiteStatement sQLiteStatement, ResourcePath resourcePath) {
        if (memoryCollectionParentIndex.mo62666a(resourcePath)) {
            String i = resourcePath.mo62802i();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, i);
            sQLiteStatement.bindString(2, EncodedPath.m75290c((ResourcePath) resourcePath.mo62809q()));
            sQLiteStatement.execute();
        }
    }

    /* renamed from: z */
    static /* synthetic */ void m75749z(SQLiteSchema sQLiteSchema, Cursor cursor) {
        int i = cursor.getInt(0);
        try {
            sQLiteSchema.f54390a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) ((Target.Builder) Target.m76060m0(cursor.getBlob(1)).mo65173b()).mo62969N().build()).mo64718h(), Integer.valueOf(i)});
        } catch (InvalidProtocolBufferException unused) {
            throw Assert.m76440a("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo62767I(int i) {
        mo62768J(i, 12);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo62768J(int i, int i2) {
        if (i < 1 && i2 >= 1) {
            m75730f();
            m75732h();
            m75731g();
        }
        if (i < 3 && i2 >= 3 && i != 0) {
            m75735k();
            m75732h();
        }
        if (i < 4 && i2 >= 4) {
            m75737m();
            m75727c();
        }
        if (i < 5 && i2 >= 5) {
            m75726b();
        }
        if (i < 6 && i2 >= 6) {
            m75720F();
        }
        if (i < 7 && i2 >= 7) {
            m75736l();
        }
        if (i < 8 && i2 >= 8) {
            m75733i();
        }
        if (i < 9 && i2 >= 9) {
            if (!m75738o()) {
                m75725a();
            } else {
                m75734j();
            }
        }
        if (i == 9 && i2 >= 10) {
            m75734j();
        }
        if (i < 11 && i2 >= 11) {
            m75722H();
        }
        if (i < 12 && i2 >= 12) {
            m75728d();
        }
        if (i < 13 && i2 >= 13) {
            Preconditions.m76515d(Persistence.f54299b);
            m75729e();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: n */
    public List<String> mo62769n(String str) {
        ArrayList arrayList = new ArrayList();
        ? r1 = 0;
        try {
            SQLiteDatabase sQLiteDatabase = this.f54390a;
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ")", r1);
            int columnIndex = rawQuery.getColumnIndex("name");
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(columnIndex));
            }
            rawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }
}
