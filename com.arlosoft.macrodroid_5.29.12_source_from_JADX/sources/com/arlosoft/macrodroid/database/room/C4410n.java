package com.arlosoft.macrodroid.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p010db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;

/* renamed from: com.arlosoft.macrodroid.database.room.n */
/* compiled from: MacroSubscriptionDao_Impl */
public final class C4410n implements C4409m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RoomDatabase f11224a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final EntityInsertionAdapter<C4407l> f11225b;

    /* renamed from: c */
    private final SharedSQLiteStatement f11226c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SharedSQLiteStatement f11227d;

    /* renamed from: com.arlosoft.macrodroid.database.room.n$a */
    /* compiled from: MacroSubscriptionDao_Impl */
    class C4411a extends EntityInsertionAdapter<C4407l> {
        C4411a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C4407l lVar) {
            supportSQLiteStatement.bindLong(1, (long) lVar.mo28736a());
            if (lVar.mo28737b() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, lVar.mo28737b());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `MacroSubscription` (`macroId`,`macroName`) VALUES (?,?)";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.n$b */
    /* compiled from: MacroSubscriptionDao_Impl */
    class C4412b extends SharedSQLiteStatement {
        C4412b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM MacroSubscription";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.n$c */
    /* compiled from: MacroSubscriptionDao_Impl */
    class C4413c extends SharedSQLiteStatement {
        C4413c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM MacroSubscription WHERE macroId == ?";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.n$d */
    /* compiled from: MacroSubscriptionDao_Impl */
    class C4414d implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ C4407l f11231a;

        C4414d(C4407l lVar) {
            this.f11231a = lVar;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            C4410n.this.f11224a.beginTransaction();
            try {
                long insertAndReturnId = C4410n.this.f11225b.insertAndReturnId(this.f11231a);
                C4410n.this.f11224a.setTransactionSuccessful();
                return Long.valueOf(insertAndReturnId);
            } finally {
                C4410n.this.f11224a.endTransaction();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.n$e */
    /* compiled from: MacroSubscriptionDao_Impl */
    class C4415e implements Callable<C13339u> {

        /* renamed from: a */
        final /* synthetic */ int f11233a;

        C4415e(int i) {
            this.f11233a = i;
        }

        /* renamed from: a */
        public C13339u call() throws Exception {
            SupportSQLiteStatement acquire = C4410n.this.f11227d.acquire();
            acquire.bindLong(1, (long) this.f11233a);
            C4410n.this.f11224a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                C4410n.this.f11224a.setTransactionSuccessful();
                return C13339u.f61331a;
            } finally {
                C4410n.this.f11224a.endTransaction();
                C4410n.this.f11227d.release(acquire);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.n$f */
    /* compiled from: MacroSubscriptionDao_Impl */
    class C4416f implements Callable<List<C4407l>> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11235a;

        C4416f(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11235a = roomSQLiteQuery;
        }

        /* renamed from: a */
        public List<C4407l> call() throws Exception {
            String str;
            Cursor query = DBUtil.query(C4410n.this.f11224a, this.f11235a, false, (CancellationSignal) null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "macroId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "macroName");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    int i = query.getInt(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    arrayList.add(new C4407l(i, str));
                }
                return arrayList;
            } finally {
                query.close();
                this.f11235a.release();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.n$g */
    /* compiled from: MacroSubscriptionDao_Impl */
    class C4417g implements Callable<C4407l> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11237a;

        C4417g(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11237a = roomSQLiteQuery;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.arlosoft.macrodroid.database.room.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.arlosoft.macrodroid.database.room.C4407l call() throws java.lang.Exception {
            /*
                r5 = this;
                com.arlosoft.macrodroid.database.room.n r0 = com.arlosoft.macrodroid.database.room.C4410n.this
                androidx.room.RoomDatabase r0 = r0.f11224a
                androidx.room.RoomSQLiteQuery r1 = r5.f11237a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = androidx.room.util.DBUtil.query(r0, r1, r2, r3)
                java.lang.String r1 = "macroId"
                int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r0, r1)     // Catch:{ all -> 0x003e }
                java.lang.String r2 = "macroName"
                int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r0, r2)     // Catch:{ all -> 0x003e }
                boolean r4 = r0.moveToFirst()     // Catch:{ all -> 0x003e }
                if (r4 == 0) goto L_0x0035
                int r1 = r0.getInt(r1)     // Catch:{ all -> 0x003e }
                boolean r4 = r0.isNull(r2)     // Catch:{ all -> 0x003e }
                if (r4 == 0) goto L_0x002b
                goto L_0x002f
            L_0x002b:
                java.lang.String r3 = r0.getString(r2)     // Catch:{ all -> 0x003e }
            L_0x002f:
                com.arlosoft.macrodroid.database.room.l r2 = new com.arlosoft.macrodroid.database.room.l     // Catch:{ all -> 0x003e }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x003e }
                r3 = r2
            L_0x0035:
                r0.close()
                androidx.room.RoomSQLiteQuery r0 = r5.f11237a
                r0.release()
                return r3
            L_0x003e:
                r1 = move-exception
                r0.close()
                androidx.room.RoomSQLiteQuery r0 = r5.f11237a
                r0.release()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.database.room.C4410n.C4417g.call():com.arlosoft.macrodroid.database.room.l");
        }
    }

    public C4410n(RoomDatabase roomDatabase) {
        this.f11224a = roomDatabase;
        this.f11225b = new C4411a(roomDatabase);
        this.f11226c = new C4412b(roomDatabase);
        this.f11227d = new C4413c(roomDatabase);
    }

    /* renamed from: h */
    public static List<Class<?>> m17459h() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo28741a(C4407l lVar, C13635d<? super Long> dVar) {
        return CoroutinesRoom.execute(this.f11224a, true, new C4414d(lVar), dVar);
    }

    /* renamed from: b */
    public Object mo28742b(int i, C13635d<? super C4407l> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM MacroSubscription WHERE macroId == ?", 1);
        acquire.bindLong(1, (long) i);
        return CoroutinesRoom.execute(this.f11224a, false, DBUtil.createCancellationSignal(), new C4417g(acquire), dVar);
    }

    /* renamed from: c */
    public Object mo28743c(int i, C13635d<? super C13339u> dVar) {
        return CoroutinesRoom.execute(this.f11224a, true, new C4415e(i), dVar);
    }

    /* renamed from: d */
    public Object mo28744d(C13635d<? super List<C4407l>> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM MacroSubscription", 0);
        return CoroutinesRoom.execute(this.f11224a, false, DBUtil.createCancellationSignal(), new C4416f(acquire), dVar);
    }
}
