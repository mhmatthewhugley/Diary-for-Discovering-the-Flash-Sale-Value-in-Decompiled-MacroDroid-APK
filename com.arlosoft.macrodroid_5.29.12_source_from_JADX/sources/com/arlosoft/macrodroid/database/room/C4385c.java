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

/* renamed from: com.arlosoft.macrodroid.database.room.c */
/* compiled from: BlockedMacroDao_Impl */
public final class C4385c implements C4384b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RoomDatabase f11180a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final EntityInsertionAdapter<C4382a> f11181b;

    /* renamed from: c */
    private final SharedSQLiteStatement f11182c;

    /* renamed from: d */
    private final SharedSQLiteStatement f11183d;

    /* renamed from: com.arlosoft.macrodroid.database.room.c$a */
    /* compiled from: BlockedMacroDao_Impl */
    class C4386a extends EntityInsertionAdapter<C4382a> {
        C4386a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, C4382a aVar) {
            supportSQLiteStatement.bindLong(1, (long) aVar.mo28701a());
            if (aVar.mo28702b() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, aVar.mo28702b());
            }
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `BlockedMacro` (`macroId`,`macroName`) VALUES (?,?)";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.c$b */
    /* compiled from: BlockedMacroDao_Impl */
    class C4387b extends SharedSQLiteStatement {
        C4387b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM BlockedMacro";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.c$c */
    /* compiled from: BlockedMacroDao_Impl */
    class C4388c extends SharedSQLiteStatement {
        C4388c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM BlockedMacro WHERE macroId == ?";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.c$d */
    /* compiled from: BlockedMacroDao_Impl */
    class C4389d implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ C4382a f11187a;

        C4389d(C4382a aVar) {
            this.f11187a = aVar;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            C4385c.this.f11180a.beginTransaction();
            try {
                long insertAndReturnId = C4385c.this.f11181b.insertAndReturnId(this.f11187a);
                C4385c.this.f11180a.setTransactionSuccessful();
                return Long.valueOf(insertAndReturnId);
            } finally {
                C4385c.this.f11180a.endTransaction();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.c$e */
    /* compiled from: BlockedMacroDao_Impl */
    class C4390e implements Callable<List<C4382a>> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11189a;

        C4390e(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11189a = roomSQLiteQuery;
        }

        /* renamed from: a */
        public List<C4382a> call() throws Exception {
            String str;
            Cursor query = DBUtil.query(C4385c.this.f11180a, this.f11189a, false, (CancellationSignal) null);
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
                    arrayList.add(new C4382a(i, str));
                }
                return arrayList;
            } finally {
                query.close();
                this.f11189a.release();
            }
        }
    }

    public C4385c(RoomDatabase roomDatabase) {
        this.f11180a = roomDatabase;
        this.f11181b = new C4386a(roomDatabase);
        this.f11182c = new C4387b(roomDatabase);
        this.f11183d = new C4388c(roomDatabase);
    }

    /* renamed from: e */
    public static List<Class<?>> m17418e() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo28706a(C13635d<? super List<C4382a>> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM BlockedMacro", 0);
        return CoroutinesRoom.execute(this.f11180a, false, DBUtil.createCancellationSignal(), new C4390e(acquire), dVar);
    }

    /* renamed from: b */
    public Object mo28707b(C4382a aVar, C13635d<? super Long> dVar) {
        return CoroutinesRoom.execute(this.f11180a, true, new C4389d(aVar), dVar);
    }
}
