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

/* renamed from: com.arlosoft.macrodroid.database.room.f */
/* compiled from: BlockedUserDao_Impl */
public final class C4394f implements C4393e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RoomDatabase f11194a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final EntityInsertionAdapter<C4391d> f11195b;

    /* renamed from: c */
    private final SharedSQLiteStatement f11196c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SharedSQLiteStatement f11197d;

    /* renamed from: com.arlosoft.macrodroid.database.room.f$a */
    /* compiled from: BlockedUserDao_Impl */
    class C4395a extends EntityInsertionAdapter<C4391d> {
        C4395a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C4391d dVar) {
            supportSQLiteStatement.bindLong(1, (long) dVar.mo28713a());
            if (dVar.mo28714b() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, dVar.mo28714b());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `BlockedUser` (`userId`,`username`) VALUES (?,?)";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.f$b */
    /* compiled from: BlockedUserDao_Impl */
    class C4396b extends SharedSQLiteStatement {
        C4396b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM BlockedUser";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.f$c */
    /* compiled from: BlockedUserDao_Impl */
    class C4397c extends SharedSQLiteStatement {
        C4397c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM BlockedUser WHERE userId == ?";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.f$d */
    /* compiled from: BlockedUserDao_Impl */
    class C4398d implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ C4391d f11201a;

        C4398d(C4391d dVar) {
            this.f11201a = dVar;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            C4394f.this.f11194a.beginTransaction();
            try {
                long insertAndReturnId = C4394f.this.f11195b.insertAndReturnId(this.f11201a);
                C4394f.this.f11194a.setTransactionSuccessful();
                return Long.valueOf(insertAndReturnId);
            } finally {
                C4394f.this.f11194a.endTransaction();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.f$e */
    /* compiled from: BlockedUserDao_Impl */
    class C4399e implements Callable<C13339u> {

        /* renamed from: a */
        final /* synthetic */ int f11203a;

        C4399e(int i) {
            this.f11203a = i;
        }

        /* renamed from: a */
        public C13339u call() throws Exception {
            SupportSQLiteStatement acquire = C4394f.this.f11197d.acquire();
            acquire.bindLong(1, (long) this.f11203a);
            C4394f.this.f11194a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                C4394f.this.f11194a.setTransactionSuccessful();
                return C13339u.f61331a;
            } finally {
                C4394f.this.f11194a.endTransaction();
                C4394f.this.f11197d.release(acquire);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.f$f */
    /* compiled from: BlockedUserDao_Impl */
    class C4400f implements Callable<List<C4391d>> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11205a;

        C4400f(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11205a = roomSQLiteQuery;
        }

        /* renamed from: a */
        public List<C4391d> call() throws Exception {
            String str;
            Cursor query = DBUtil.query(C4394f.this.f11194a, this.f11205a, false, (CancellationSignal) null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "userId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "username");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    int i = query.getInt(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow2);
                    }
                    arrayList.add(new C4391d(i, str));
                }
                return arrayList;
            } finally {
                query.close();
                this.f11205a.release();
            }
        }
    }

    public C4394f(RoomDatabase roomDatabase) {
        this.f11194a = roomDatabase;
        this.f11195b = new C4395a(roomDatabase);
        this.f11196c = new C4396b(roomDatabase);
        this.f11197d = new C4397c(roomDatabase);
    }

    /* renamed from: g */
    public static List<Class<?>> m17432g() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo28718a(C13635d<? super List<C4391d>> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM BlockedUser", 0);
        return CoroutinesRoom.execute(this.f11194a, false, DBUtil.createCancellationSignal(), new C4400f(acquire), dVar);
    }

    /* renamed from: b */
    public Object mo28719b(C4391d dVar, C13635d<? super Long> dVar2) {
        return CoroutinesRoom.execute(this.f11194a, true, new C4398d(dVar), dVar2);
    }

    /* renamed from: c */
    public Object mo28720c(int i, C13635d<? super C13339u> dVar) {
        return CoroutinesRoom.execute(this.f11194a, true, new C4399e(i), dVar);
    }
}
