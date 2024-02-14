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

/* renamed from: com.arlosoft.macrodroid.database.room.x */
/* compiled from: UserSubscriptionDao_Impl */
public final class C4446x implements C4445w {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RoomDatabase f11293a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final EntityInsertionAdapter<C4443v> f11294b;

    /* renamed from: c */
    private final SharedSQLiteStatement f11295c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SharedSQLiteStatement f11296d;

    /* renamed from: com.arlosoft.macrodroid.database.room.x$a */
    /* compiled from: UserSubscriptionDao_Impl */
    class C4447a extends EntityInsertionAdapter<C4443v> {
        C4447a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C4443v vVar) {
            supportSQLiteStatement.bindLong(1, (long) vVar.mo28794a());
            if (vVar.mo28796c() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, vVar.mo28796c());
            }
            if (vVar.mo28795b() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, vVar.mo28795b());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `UserSubscription` (`userId`,`userName`,`userImage`) VALUES (?,?,?)";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.x$b */
    /* compiled from: UserSubscriptionDao_Impl */
    class C4448b extends SharedSQLiteStatement {
        C4448b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM UserSubscription";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.x$c */
    /* compiled from: UserSubscriptionDao_Impl */
    class C4449c extends SharedSQLiteStatement {
        C4449c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM UserSubscription WHERE userId == ?";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.x$d */
    /* compiled from: UserSubscriptionDao_Impl */
    class C4450d implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ C4443v f11300a;

        C4450d(C4443v vVar) {
            this.f11300a = vVar;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            C4446x.this.f11293a.beginTransaction();
            try {
                long insertAndReturnId = C4446x.this.f11294b.insertAndReturnId(this.f11300a);
                C4446x.this.f11293a.setTransactionSuccessful();
                return Long.valueOf(insertAndReturnId);
            } finally {
                C4446x.this.f11293a.endTransaction();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.x$e */
    /* compiled from: UserSubscriptionDao_Impl */
    class C4451e implements Callable<C13339u> {

        /* renamed from: a */
        final /* synthetic */ int f11302a;

        C4451e(int i) {
            this.f11302a = i;
        }

        /* renamed from: a */
        public C13339u call() throws Exception {
            SupportSQLiteStatement acquire = C4446x.this.f11296d.acquire();
            acquire.bindLong(1, (long) this.f11302a);
            C4446x.this.f11293a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                C4446x.this.f11293a.setTransactionSuccessful();
                return C13339u.f61331a;
            } finally {
                C4446x.this.f11293a.endTransaction();
                C4446x.this.f11296d.release(acquire);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.x$f */
    /* compiled from: UserSubscriptionDao_Impl */
    class C4452f implements Callable<List<C4443v>> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11304a;

        C4452f(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11304a = roomSQLiteQuery;
        }

        /* renamed from: a */
        public List<C4443v> call() throws Exception {
            String str;
            String str2;
            Cursor query = DBUtil.query(C4446x.this.f11293a, this.f11304a, false, (CancellationSignal) null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "userId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "userName");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "userImage");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    int i = query.getInt(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow3);
                    }
                    arrayList.add(new C4443v(i, str, str2));
                }
                return arrayList;
            } finally {
                query.close();
                this.f11304a.release();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.x$g */
    /* compiled from: UserSubscriptionDao_Impl */
    class C4453g implements Callable<C4443v> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11306a;

        C4453g(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11306a = roomSQLiteQuery;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.arlosoft.macrodroid.database.room.v} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.arlosoft.macrodroid.database.room.C4443v call() throws java.lang.Exception {
            /*
                r6 = this;
                com.arlosoft.macrodroid.database.room.x r0 = com.arlosoft.macrodroid.database.room.C4446x.this
                androidx.room.RoomDatabase r0 = r0.f11293a
                androidx.room.RoomSQLiteQuery r1 = r6.f11306a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = androidx.room.util.DBUtil.query(r0, r1, r2, r3)
                java.lang.String r1 = "userId"
                int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r0, r1)     // Catch:{ all -> 0x0050 }
                java.lang.String r2 = "userName"
                int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r0, r2)     // Catch:{ all -> 0x0050 }
                java.lang.String r4 = "userImage"
                int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r0, r4)     // Catch:{ all -> 0x0050 }
                boolean r5 = r0.moveToFirst()     // Catch:{ all -> 0x0050 }
                if (r5 == 0) goto L_0x0047
                int r1 = r0.getInt(r1)     // Catch:{ all -> 0x0050 }
                boolean r5 = r0.isNull(r2)     // Catch:{ all -> 0x0050 }
                if (r5 == 0) goto L_0x0032
                r2 = r3
                goto L_0x0036
            L_0x0032:
                java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0050 }
            L_0x0036:
                boolean r5 = r0.isNull(r4)     // Catch:{ all -> 0x0050 }
                if (r5 == 0) goto L_0x003d
                goto L_0x0041
            L_0x003d:
                java.lang.String r3 = r0.getString(r4)     // Catch:{ all -> 0x0050 }
            L_0x0041:
                com.arlosoft.macrodroid.database.room.v r4 = new com.arlosoft.macrodroid.database.room.v     // Catch:{ all -> 0x0050 }
                r4.<init>(r1, r2, r3)     // Catch:{ all -> 0x0050 }
                r3 = r4
            L_0x0047:
                r0.close()
                androidx.room.RoomSQLiteQuery r0 = r6.f11306a
                r0.release()
                return r3
            L_0x0050:
                r1 = move-exception
                r0.close()
                androidx.room.RoomSQLiteQuery r0 = r6.f11306a
                r0.release()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.database.room.C4446x.C4453g.call():com.arlosoft.macrodroid.database.room.v");
        }
    }

    public C4446x(RoomDatabase roomDatabase) {
        this.f11293a = roomDatabase;
        this.f11294b = new C4447a(roomDatabase);
        this.f11295c = new C4448b(roomDatabase);
        this.f11296d = new C4449c(roomDatabase);
    }

    /* renamed from: h */
    public static List<Class<?>> m17535h() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo28800a(C4443v vVar, C13635d<? super Long> dVar) {
        return CoroutinesRoom.execute(this.f11293a, true, new C4450d(vVar), dVar);
    }

    /* renamed from: b */
    public Object mo28801b(int i, C13635d<? super C4443v> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM UserSubscription WHERE userId == ?", 1);
        acquire.bindLong(1, (long) i);
        return CoroutinesRoom.execute(this.f11293a, false, DBUtil.createCancellationSignal(), new C4453g(acquire), dVar);
    }

    /* renamed from: c */
    public Object mo28802c(C13635d<? super List<C4443v>> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM UserSubscription", 0);
        return CoroutinesRoom.execute(this.f11293a, false, DBUtil.createCancellationSignal(), new C4452f(acquire), dVar);
    }

    /* renamed from: d */
    public Object mo28803d(int i, C13635d<? super C13339u> dVar) {
        return CoroutinesRoom.execute(this.f11293a, true, new C4451e(i), dVar);
    }
}
