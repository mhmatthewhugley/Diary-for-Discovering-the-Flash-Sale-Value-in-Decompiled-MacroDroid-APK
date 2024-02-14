package com.google.firebase.firestore.local;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.FileUtil;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SQLitePersistence extends Persistence {

    /* renamed from: c */
    private final SQLiteOpenHelper f54351c;

    /* renamed from: d */
    private final LocalSerializer f54352d;

    /* renamed from: e */
    private final SQLiteTargetCache f54353e;

    /* renamed from: f */
    private final SQLiteBundleCache f54354f;

    /* renamed from: g */
    private final SQLiteIndexManager f54355g;

    /* renamed from: h */
    private final SQLiteRemoteDocumentCache f54356h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final SQLiteLruReferenceDelegate f54357i;

    /* renamed from: j */
    private final SQLiteTransactionListener f54358j;

    /* renamed from: k */
    private SQLiteDatabase f54359k;

    /* renamed from: l */
    private boolean f54360l;

    private static class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: a */
        private final LocalSerializer f54368a;

        /* renamed from: c */
        private boolean f54369c;

        OpenHelper(Context context, LocalSerializer localSerializer, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 12);
            this.f54368a = localSerializer;
        }

        /* renamed from: b */
        private void m75689b(SQLiteDatabase sQLiteDatabase) {
            if (!this.f54369c) {
                onConfigure(sQLiteDatabase);
            }
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f54369c = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m75689b(sQLiteDatabase);
            new SQLiteSchema(sQLiteDatabase, this.f54368a).mo62767I(0);
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            m75689b(sQLiteDatabase);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            m75689b(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            m75689b(sQLiteDatabase);
            new SQLiteSchema(sQLiteDatabase, this.f54368a).mo62767I(i);
        }
    }

    static class Query {

        /* renamed from: a */
        private final SQLiteDatabase f54370a;

        /* renamed from: b */
        private final String f54371b;

        /* renamed from: c */
        private SQLiteDatabase.CursorFactory f54372c;

        Query(SQLiteDatabase sQLiteDatabase, String str) {
            this.f54370a = sQLiteDatabase;
            this.f54371b = str;
        }

        /* renamed from: g */
        private Cursor m75691g() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f54372c;
            if (cursorFactory != null) {
                return this.f54370a.rawQueryWithFactory(cursorFactory, this.f54371b, (String[]) null, (String) null);
            }
            return this.f54370a.rawQuery(this.f54371b, (String[]) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Query mo62760a(Object... objArr) {
            this.f54372c = SQLitePersistence$Query$$Lambda$1.m75699a(objArr);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x001d  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo62761b(com.google.firebase.firestore.util.Consumer<android.database.Cursor> r3) {
            /*
                r2 = this;
                android.database.Cursor r0 = r2.m75691g()     // Catch:{ all -> 0x0019 }
                boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x0012
                r3.accept(r0)     // Catch:{ all -> 0x0017 }
                r3 = 1
                r0.close()
                return r3
            L_0x0012:
                r3 = 0
                r0.close()
                return r3
            L_0x0017:
                r3 = move-exception
                goto L_0x001b
            L_0x0019:
                r3 = move-exception
                r0 = 0
            L_0x001b:
                if (r0 == 0) goto L_0x0020
                r0.close()
            L_0x0020:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLitePersistence.Query.mo62761b(com.google.firebase.firestore.util.Consumer):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x001d  */
        @androidx.annotation.Nullable
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> T mo62762c(com.google.firebase.firestore.util.Function<android.database.Cursor, T> r4) {
            /*
                r3 = this;
                r0 = 0
                android.database.Cursor r1 = r3.m75691g()     // Catch:{ all -> 0x001a }
                boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0017 }
                if (r2 == 0) goto L_0x0013
                java.lang.Object r4 = r4.apply(r1)     // Catch:{ all -> 0x0017 }
                r1.close()
                return r4
            L_0x0013:
                r1.close()
                return r0
            L_0x0017:
                r4 = move-exception
                r0 = r1
                goto L_0x001b
            L_0x001a:
                r4 = move-exception
            L_0x001b:
                if (r0 == 0) goto L_0x0020
                r0.close()
            L_0x0020:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLitePersistence.Query.mo62762c(com.google.firebase.firestore.util.Function):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo62763d(Consumer<Cursor> consumer) {
            Cursor g = m75691g();
            int i = 0;
            while (g.moveToNext()) {
                try {
                    i++;
                    consumer.accept(g);
                } catch (Throwable unused) {
                }
            }
            g.close();
            return i;
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo62764e() {
            /*
                r2 = this;
                android.database.Cursor r0 = r2.m75691g()     // Catch:{ all -> 0x0010 }
                boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x000e }
                r1 = r1 ^ 1
                r0.close()
                return r1
            L_0x000e:
                r1 = move-exception
                goto L_0x0012
            L_0x0010:
                r1 = move-exception
                r0 = 0
            L_0x0012:
                if (r0 == 0) goto L_0x0017
                r0.close()
            L_0x0017:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLitePersistence.Query.mo62764e():boolean");
        }
    }

    public SQLitePersistence(Context context, String str, DatabaseId databaseId, LocalSerializer localSerializer, LruGarbageCollector.Params params) {
        this(localSerializer, params, new OpenHelper(context, localSerializer, m75663p(str, databaseId)));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m75661n(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            String str = objArr[i];
            if (str == null) {
                sQLiteProgram.bindNull(i + 1);
            } else if (str instanceof String) {
                sQLiteProgram.bindString(i + 1, str);
            } else if (str instanceof Integer) {
                sQLiteProgram.bindLong(i + 1, (long) ((Integer) str).intValue());
            } else if (str instanceof Long) {
                sQLiteProgram.bindLong(i + 1, ((Long) str).longValue());
            } else if (str instanceof Double) {
                sQLiteProgram.bindDouble(i + 1, ((Double) str).doubleValue());
            } else if (str instanceof byte[]) {
                sQLiteProgram.bindBlob(i + 1, (byte[]) str);
            } else {
                throw Assert.m76440a("Unknown argument %s of type %s", str, str.getClass());
            }
        }
    }

    /* renamed from: o */
    public static void m75662o(Context context, DatabaseId databaseId, String str) throws FirebaseFirestoreException {
        String path = context.getDatabasePath(m75663p(str, databaseId)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            FileUtil.m76504a(file);
            FileUtil.m76504a(file2);
            FileUtil.m76504a(file3);
        } catch (IOException e) {
            throw new FirebaseFirestoreException("Failed to clear persistence." + e, FirebaseFirestoreException.Code.UNKNOWN);
        }
    }

    @VisibleForTesting
    /* renamed from: p */
    public static String m75663p(String str, DatabaseId databaseId) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(databaseId.mo62814e(), "utf-8") + "." + URLEncoder.encode(databaseId.mo62813d(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: t */
    private long m75664t() {
        return ((Long) mo62742A("PRAGMA page_count").mo62762c(SQLitePersistence$$Lambda$2.m75698a())).longValue();
    }

    /* renamed from: u */
    private long m75665u() {
        return ((Long) mo62742A("PRAGMA page_size").mo62762c(SQLitePersistence$$Lambda$1.m75697a())).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Query mo62742A(String str) {
        return new Query(this.f54359k, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public BundleCache mo62685a() {
        return this.f54354f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public IndexManager mo62686b() {
        return this.f54355g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public MutationQueue mo62687c(User user) {
        return new SQLiteMutationQueue(this, this.f54352d, user);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public RemoteDocumentCache mo62689e() {
        return this.f54356h;
    }

    /* renamed from: g */
    public boolean mo62691g() {
        return this.f54360l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <T> T mo62692h(String str, Supplier<T> supplier) {
        Logger.m76508a(Persistence.f54298a, "Starting transaction: %s", str);
        this.f54359k.beginTransactionWithListener(this.f54358j);
        try {
            T t = supplier.get();
            this.f54359k.setTransactionSuccessful();
            return t;
        } finally {
            this.f54359k.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo62693i(String str, Runnable runnable) {
        Logger.m76508a(Persistence.f54298a, "Starting transaction: %s", str);
        this.f54359k.beginTransactionWithListener(this.f54358j);
        try {
            runnable.run();
            this.f54359k.setTransactionSuccessful();
        } finally {
            this.f54359k.endTransaction();
        }
    }

    /* renamed from: j */
    public void mo62694j() {
        Assert.m76443d(this.f54360l, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f54360l = false;
        this.f54359k.close();
        this.f54359k = null;
    }

    /* renamed from: k */
    public void mo62695k() {
        Assert.m76443d(!this.f54360l, "SQLitePersistence double-started!", new Object[0]);
        this.f54360l = true;
        try {
            this.f54359k = this.f54351c.getWritableDatabase();
            this.f54353e.mo62780w();
            this.f54357i.mo62736w(this.f54353e.mo62777m());
        } catch (SQLiteDatabaseLockedException e) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo62743q(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        m75661n(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo62744r(String str, Object... objArr) {
        this.f54359k.execSQL(str, objArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public long mo62745s() {
        return m75664t() * m75665u();
    }

    /* renamed from: v */
    public SQLiteLruReferenceDelegate mo62688d() {
        return this.f54357i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public SQLiteTargetCache mo62690f() {
        return this.f54353e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public SQLiteStatement mo62748z(String str) {
        return this.f54359k.compileStatement(str);
    }

    public SQLitePersistence(LocalSerializer localSerializer, LruGarbageCollector.Params params, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f54358j = new SQLiteTransactionListener() {
            public void onBegin() {
                SQLitePersistence.this.f54357i.mo62660i();
            }

            public void onCommit() {
                SQLitePersistence.this.f54357i.mo62659h();
            }

            public void onRollback() {
            }
        };
        this.f54351c = sQLiteOpenHelper;
        this.f54352d = localSerializer;
        this.f54353e = new SQLiteTargetCache(this, localSerializer);
        this.f54355g = new SQLiteIndexManager(this);
        this.f54354f = new SQLiteBundleCache(this, localSerializer);
        this.f54356h = new SQLiteRemoteDocumentCache(this, localSerializer);
        this.f54357i = new SQLiteLruReferenceDelegate(this, params);
    }

    static class LongQuery {

        /* renamed from: a */
        private final SQLitePersistence f54362a;

        /* renamed from: b */
        private final String f54363b;

        /* renamed from: c */
        private final String f54364c;

        /* renamed from: d */
        private final List<Object> f54365d;

        /* renamed from: e */
        private int f54366e = 0;

        /* renamed from: f */
        private final Iterator<Object> f54367f;

        LongQuery(SQLitePersistence sQLitePersistence, String str, List<Object> list, String str2) {
            this.f54362a = sQLitePersistence;
            this.f54363b = str;
            this.f54365d = Collections.emptyList();
            this.f54364c = str2;
            this.f54367f = list.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo62752a() {
            return this.f54366e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo62753b() {
            return this.f54367f.hasNext();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Query mo62754c() {
            this.f54366e++;
            ArrayList arrayList = new ArrayList(this.f54365d);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (this.f54367f.hasNext() && i < 900 - this.f54365d.size()) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append("?");
                arrayList.add(this.f54367f.next());
                i++;
            }
            String sb2 = sb.toString();
            return this.f54362a.mo62742A(this.f54363b + sb2 + this.f54364c).mo62760a(arrayList.toArray());
        }

        LongQuery(SQLitePersistence sQLitePersistence, String str, List<Object> list, List<Object> list2, String str2) {
            this.f54362a = sQLitePersistence;
            this.f54363b = str;
            this.f54365d = list;
            this.f54364c = str2;
            this.f54367f = list2.iterator();
        }
    }
}
