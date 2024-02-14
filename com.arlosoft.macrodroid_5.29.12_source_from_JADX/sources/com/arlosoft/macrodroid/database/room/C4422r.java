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
import org.apache.http.cookie.ClientCookie;
import p297ja.C13339u;

/* renamed from: com.arlosoft.macrodroid.database.room.r */
/* compiled from: SubscriptionUpdateItemDao_Impl */
public final class C4422r implements C4421q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RoomDatabase f11254a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final EntityInsertionAdapter<C4419p> f11255b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4401g f11256c = new C4401g();

    /* renamed from: d */
    private final SharedSQLiteStatement f11257d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SharedSQLiteStatement f11258e;

    /* renamed from: com.arlosoft.macrodroid.database.room.r$a */
    /* compiled from: SubscriptionUpdateItemDao_Impl */
    class C4423a extends EntityInsertionAdapter<C4419p> {
        C4423a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C4419p pVar) {
            supportSQLiteStatement.bindLong(1, pVar.mo28755b());
            supportSQLiteStatement.bindLong(2, (long) C4422r.this.f11256c.mo28733f(pVar.mo28760f()));
            supportSQLiteStatement.bindLong(3, (long) pVar.mo28756c());
            if (pVar.mo28757d() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, pVar.mo28757d());
            }
            if (pVar.mo28764i() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, pVar.mo28764i());
            }
            supportSQLiteStatement.bindLong(6, (long) pVar.mo28761g());
            if (pVar.mo28762h() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, pVar.mo28762h());
            }
            if (pVar.mo28754a() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, pVar.mo28754a());
            }
            supportSQLiteStatement.bindLong(9, pVar.mo28758e());
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `SubscriptionUpdateItem` (`id`,`type`,`macroId`,`macroName`,`username`,`userId`,`userImage`,`comment`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.r$b */
    /* compiled from: SubscriptionUpdateItemDao_Impl */
    class C4424b extends SharedSQLiteStatement {
        C4424b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM SubscriptionUpdateItem";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.r$c */
    /* compiled from: SubscriptionUpdateItemDao_Impl */
    class C4425c extends SharedSQLiteStatement {
        C4425c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM SubscriptionUpdateItem WHERE id == ?";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.r$d */
    /* compiled from: SubscriptionUpdateItemDao_Impl */
    class C4426d implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ C4419p f11262a;

        C4426d(C4419p pVar) {
            this.f11262a = pVar;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            C4422r.this.f11254a.beginTransaction();
            try {
                long insertAndReturnId = C4422r.this.f11255b.insertAndReturnId(this.f11262a);
                C4422r.this.f11254a.setTransactionSuccessful();
                return Long.valueOf(insertAndReturnId);
            } finally {
                C4422r.this.f11254a.endTransaction();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.r$e */
    /* compiled from: SubscriptionUpdateItemDao_Impl */
    class C4427e implements Callable<C13339u> {

        /* renamed from: a */
        final /* synthetic */ long f11264a;

        C4427e(long j) {
            this.f11264a = j;
        }

        /* renamed from: a */
        public C13339u call() throws Exception {
            SupportSQLiteStatement acquire = C4422r.this.f11258e.acquire();
            acquire.bindLong(1, this.f11264a);
            C4422r.this.f11254a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                C4422r.this.f11254a.setTransactionSuccessful();
                return C13339u.f61331a;
            } finally {
                C4422r.this.f11254a.endTransaction();
                C4422r.this.f11258e.release(acquire);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.r$f */
    /* compiled from: SubscriptionUpdateItemDao_Impl */
    class C4428f implements Callable<List<C4419p>> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11266a;

        C4428f(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11266a = roomSQLiteQuery;
        }

        /* renamed from: a */
        public List<C4419p> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            Cursor query = DBUtil.query(C4422r.this.f11254a, this.f11266a, false, (CancellationSignal) null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "type");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "macroId");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "macroName");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "username");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "userImage");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, ClientCookie.COMMENT_ATTR);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "timestamp");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(columnIndexOrThrow);
                    C4418o c = C4422r.this.f11256c.mo28730c(query.getInt(columnIndexOrThrow2));
                    int i = query.getInt(columnIndexOrThrow3);
                    if (query.isNull(columnIndexOrThrow4)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow5);
                    }
                    int i2 = query.getInt(columnIndexOrThrow6);
                    if (query.isNull(columnIndexOrThrow7)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow8);
                    }
                    arrayList.add(new C4419p(j, c, i, str, str2, i2, str3, str4, query.getLong(columnIndexOrThrow9)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f11266a.release();
            }
        }
    }

    public C4422r(RoomDatabase roomDatabase) {
        this.f11254a = roomDatabase;
        this.f11255b = new C4423a(roomDatabase);
        this.f11257d = new C4424b(roomDatabase);
        this.f11258e = new C4425c(roomDatabase);
    }

    /* renamed from: h */
    public static List<Class<?>> m17486h() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo28766a(long j, C13635d<? super C13339u> dVar) {
        return CoroutinesRoom.execute(this.f11254a, true, new C4427e(j), dVar);
    }

    /* renamed from: b */
    public Object mo28767b(C4419p pVar, C13635d<? super Long> dVar) {
        return CoroutinesRoom.execute(this.f11254a, true, new C4426d(pVar), dVar);
    }

    /* renamed from: c */
    public Object mo28768c(C13635d<? super List<C4419p>> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM SubscriptionUpdateItem ORDER BY timestamp DESC", 0);
        return CoroutinesRoom.execute(this.f11254a, false, DBUtil.createCancellationSignal(), new C4428f(acquire), dVar);
    }
}
