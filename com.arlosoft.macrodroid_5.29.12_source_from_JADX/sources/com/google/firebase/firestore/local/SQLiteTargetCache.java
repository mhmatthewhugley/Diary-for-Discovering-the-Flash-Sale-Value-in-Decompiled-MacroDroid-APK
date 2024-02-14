package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Iterator;

final class SQLiteTargetCache implements TargetCache {

    /* renamed from: a */
    private final SQLitePersistence f54411a;

    /* renamed from: b */
    private final LocalSerializer f54412b;

    /* renamed from: c */
    private int f54413c;

    /* renamed from: d */
    private long f54414d;

    /* renamed from: e */
    private SnapshotVersion f54415e = SnapshotVersion.f54468c;

    /* renamed from: f */
    private long f54416f;

    private static class DocumentKeysHolder {
        /* access modifiers changed from: package-private */

        /* renamed from: a */
        public ImmutableSortedSet<DocumentKey> f54417a;

        private DocumentKeysHolder() {
            this.f54417a = DocumentKey.m75847f();
        }
    }

    private static class TargetDataHolder {

        /* renamed from: a */
        TargetData f54418a;

        private TargetDataHolder() {
        }
    }

    SQLiteTargetCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f54411a = sQLitePersistence;
        this.f54412b = localSerializer;
    }

    /* renamed from: k */
    private TargetData m75768k(byte[] bArr) {
        try {
            return this.f54412b.mo62599f(Target.m76060m0(bArr));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.m76440a("TargetData failed to parse: %s", e);
        }
    }

    /* renamed from: q */
    static /* synthetic */ void m75771q(SQLiteTargetCache sQLiteTargetCache, com.google.firebase.firestore.core.Target target, TargetDataHolder targetDataHolder, Cursor cursor) {
        TargetData k = sQLiteTargetCache.m75768k(cursor.getBlob(0));
        if (target.equals(k.mo62787f())) {
            targetDataHolder.f54418a = k;
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m75772r(SQLiteTargetCache sQLiteTargetCache, SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i = cursor.getInt(0);
        if (sparseArray.get(i) == null) {
            sQLiteTargetCache.m75774u(i);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* renamed from: s */
    static /* synthetic */ void m75773s(SQLiteTargetCache sQLiteTargetCache, Cursor cursor) {
        sQLiteTargetCache.f54413c = cursor.getInt(0);
        sQLiteTargetCache.f54414d = (long) cursor.getInt(1);
        sQLiteTargetCache.f54415e = new SnapshotVersion(new Timestamp(cursor.getLong(2), cursor.getInt(3)));
        sQLiteTargetCache.f54416f = cursor.getLong(4);
    }

    /* renamed from: u */
    private void m75774u(int i) {
        mo62719j(i);
        this.f54411a.mo62744r("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i));
        this.f54416f--;
    }

    /* renamed from: v */
    private void m75775v(TargetData targetData) {
        int g = targetData.mo62788g();
        String a = targetData.mo62787f().mo23952a();
        Timestamp d = targetData.mo62785e().mo62876d();
        Target m = this.f54412b.mo62603m(targetData);
        this.f54411a.mo62744r("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(g), a, Long.valueOf(d.mo61973e()), Integer.valueOf(d.mo61971d()), targetData.mo62783c().mo64916V(), Long.valueOf(targetData.mo62784d()), m.mo64718h());
    }

    /* renamed from: x */
    private boolean m75776x(TargetData targetData) {
        boolean z;
        if (targetData.mo62788g() > this.f54413c) {
            this.f54413c = targetData.mo62788g();
            z = true;
        } else {
            z = false;
        }
        if (targetData.mo62784d() <= this.f54414d) {
            return z;
        }
        this.f54414d = targetData.mo62784d();
        return true;
    }

    /* renamed from: y */
    private void m75777y() {
        this.f54411a.mo62744r("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f54413c), Long.valueOf(this.f54414d), Long.valueOf(this.f54415e.mo62876d().mo61973e()), Integer.valueOf(this.f54415e.mo62876d().mo61971d()), Long.valueOf(this.f54416f));
    }

    /* renamed from: a */
    public void mo62710a(TargetData targetData) {
        m75775v(targetData);
        if (m75776x(targetData)) {
            m75777y();
        }
    }

    /* renamed from: b */
    public void mo62711b(SnapshotVersion snapshotVersion) {
        this.f54415e = snapshotVersion;
        m75777y();
    }

    /* renamed from: c */
    public void mo62712c(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i) {
        SQLiteStatement z = this.f54411a.mo62748z("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        SQLiteLruReferenceDelegate v = this.f54411a.mo62688d();
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            DocumentKey next = it.next();
            String c = EncodedPath.m75290c(next.mo62832k());
            this.f54411a.mo62743q(z, Integer.valueOf(i), c);
            v.mo62665p(next);
        }
    }

    /* renamed from: d */
    public void mo62713d(TargetData targetData) {
        m75775v(targetData);
        m75776x(targetData);
        this.f54416f++;
        m75777y();
    }

    @Nullable
    /* renamed from: e */
    public TargetData mo62714e(com.google.firebase.firestore.core.Target target) {
        String a = target.mo23952a();
        TargetDataHolder targetDataHolder = new TargetDataHolder();
        this.f54411a.mo62742A("SELECT target_proto FROM targets WHERE canonical_id = ?").mo62760a(a).mo62763d(SQLiteTargetCache$$Lambda$4.m75796a(this, target, targetDataHolder));
        return targetDataHolder.f54418a;
    }

    /* renamed from: f */
    public int mo62715f() {
        return this.f54413c;
    }

    /* renamed from: g */
    public ImmutableSortedSet<DocumentKey> mo62716g(int i) {
        DocumentKeysHolder documentKeysHolder = new DocumentKeysHolder();
        this.f54411a.mo62742A("SELECT path FROM target_documents WHERE target_id = ?").mo62760a(Integer.valueOf(i)).mo62763d(SQLiteTargetCache$$Lambda$5.m75797a(documentKeysHolder));
        return documentKeysHolder.f54417a;
    }

    /* renamed from: h */
    public SnapshotVersion mo62717h() {
        return this.f54415e;
    }

    /* renamed from: i */
    public void mo62718i(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i) {
        SQLiteStatement z = this.f54411a.mo62748z("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        SQLiteLruReferenceDelegate v = this.f54411a.mo62688d();
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            DocumentKey next = it.next();
            String c = EncodedPath.m75290c(next.mo62832k());
            this.f54411a.mo62743q(z, Integer.valueOf(i), c);
            v.mo62664o(next);
        }
    }

    /* renamed from: j */
    public void mo62719j(int i) {
        this.f54411a.mo62744r("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i));
    }

    /* renamed from: l */
    public void mo62776l(Consumer<TargetData> consumer) {
        this.f54411a.mo62742A("SELECT target_proto FROM targets").mo62763d(SQLiteTargetCache$$Lambda$2.m75794a(this, consumer));
    }

    /* renamed from: m */
    public long mo62777m() {
        return this.f54414d;
    }

    /* renamed from: n */
    public long mo62778n() {
        return this.f54416f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo62779t(long j, SparseArray<?> sparseArray) {
        int[] iArr = new int[1];
        this.f54411a.mo62742A("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").mo62760a(Long.valueOf(j)).mo62763d(SQLiteTargetCache$$Lambda$3.m75795a(this, sparseArray, iArr));
        m75777y();
        return iArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo62780w() {
        boolean z = true;
        if (this.f54411a.mo62742A("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").mo62761b(SQLiteTargetCache$$Lambda$1.m75793a(this)) != 1) {
            z = false;
        }
        Assert.m76443d(z, "Missing target_globals entry", new Object[0]);
    }
}
