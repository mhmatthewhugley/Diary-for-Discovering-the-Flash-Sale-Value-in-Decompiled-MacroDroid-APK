package com.arlosoft.macrodroid.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p010db.SupportSQLiteQuery;
import androidx.sqlite.p010db.SupportSQLiteStatement;
import com.arlosoft.macrodroid.database.room.C4429s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.C13635d;
import p297ja.C13339u;

/* renamed from: com.arlosoft.macrodroid.database.room.u */
/* compiled from: SystemLogEntryDao_Impl */
public final class C4433u implements C4429s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RoomDatabase f11271a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final EntityInsertionAdapter<SystemLogEntry> f11272b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4401g f11273c = new C4401g();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SharedSQLiteStatement f11274d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SharedSQLiteStatement f11275e;

    /* renamed from: com.arlosoft.macrodroid.database.room.u$a */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4434a extends LimitOffsetPagingSource<SystemLogEntry> {
        C4434a(SupportSQLiteQuery supportSQLiteQuery, RoomDatabase roomDatabase, String... strArr) {
            super(supportSQLiteQuery, roomDatabase, strArr);
        }

        /* access modifiers changed from: protected */
        public List<SystemLogEntry> convertRows(Cursor cursor) {
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                arrayList.add(C4433u.this.m17503i(cursor));
            }
            return arrayList;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.u$b */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4435b extends EntityInsertionAdapter<SystemLogEntry> {
        C4435b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SystemLogEntry systemLogEntry) {
            supportSQLiteStatement.bindLong(1, (long) C4433u.this.f11273c.mo28732e(systemLogEntry.mo28686d()));
            supportSQLiteStatement.bindLong(2, systemLogEntry.mo28691g());
            if (systemLogEntry.mo28688e() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, systemLogEntry.mo28688e());
            }
            supportSQLiteStatement.bindLong(4, systemLogEntry.mo28690f());
            if (systemLogEntry.mo28692h() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, systemLogEntry.mo28692h());
            }
            if (systemLogEntry.mo28684b() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, systemLogEntry.mo28684b());
            }
            if (systemLogEntry.mo28694i() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, systemLogEntry.mo28694i());
            }
            supportSQLiteStatement.bindLong(8, (long) C4433u.this.f11273c.mo28731d(systemLogEntry.mo28683a()));
            supportSQLiteStatement.bindLong(9, systemLogEntry.mo28685c());
        }

        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemLogEntry` (`logLevel`,`timeStamp`,`logText`,`macroId`,`variableName`,`geofenceId`,`webLink`,`flag`,`id`) VALUES (?,?,?,?,?,?,?,?,nullif(?, 0))";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.u$c */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4436c extends SharedSQLiteStatement {
        C4436c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM SystemLogEntry";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.u$d */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4437d extends SharedSQLiteStatement {
        C4437d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String createQuery() {
            return "DELETE FROM SystemLogEntry WHERE id < ?";
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.u$e */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4438e implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ SystemLogEntry f11280a;

        C4438e(SystemLogEntry systemLogEntry) {
            this.f11280a = systemLogEntry;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            C4433u.this.f11271a.beginTransaction();
            try {
                long insertAndReturnId = C4433u.this.f11272b.insertAndReturnId(this.f11280a);
                C4433u.this.f11271a.setTransactionSuccessful();
                return Long.valueOf(insertAndReturnId);
            } finally {
                C4433u.this.f11271a.endTransaction();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.u$f */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4439f implements Callable<C13339u> {
        C4439f() {
        }

        /* renamed from: a */
        public C13339u call() throws Exception {
            SupportSQLiteStatement acquire = C4433u.this.f11274d.acquire();
            C4433u.this.f11271a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                C4433u.this.f11271a.setTransactionSuccessful();
                return C13339u.f61331a;
            } finally {
                C4433u.this.f11271a.endTransaction();
                C4433u.this.f11274d.release(acquire);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.u$g */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4440g implements Callable<C13339u> {

        /* renamed from: a */
        final /* synthetic */ long f11283a;

        C4440g(long j) {
            this.f11283a = j;
        }

        /* renamed from: a */
        public C13339u call() throws Exception {
            SupportSQLiteStatement acquire = C4433u.this.f11275e.acquire();
            acquire.bindLong(1, this.f11283a);
            C4433u.this.f11271a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                C4433u.this.f11271a.setTransactionSuccessful();
                return C13339u.f61331a;
            } finally {
                C4433u.this.f11271a.endTransaction();
                C4433u.this.f11275e.release(acquire);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.u$h */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4441h implements Callable<List<SystemLogEntry>> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11285a;

        C4441h(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11285a = roomSQLiteQuery;
        }

        /* renamed from: a */
        public List<SystemLogEntry> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            Cursor query = DBUtil.query(C4433u.this.f11271a, this.f11285a, false, (CancellationSignal) null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "logLevel");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "timeStamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "logText");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "macroId");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "variableName");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "geofenceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "webLink");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "flag");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "id");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    C4403i a = C4433u.this.f11273c.mo28728a(query.getInt(columnIndexOrThrow));
                    long j = query.getLong(columnIndexOrThrow2);
                    if (query.isNull(columnIndexOrThrow3)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow3);
                    }
                    long j2 = query.getLong(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow7);
                    }
                    arrayList.add(new SystemLogEntry(a, j, str, j2, str2, str3, str4, C4433u.this.f11273c.mo28729b(query.getInt(columnIndexOrThrow8)), query.getLong(columnIndexOrThrow9)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f11285a.release();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.database.room.u$i */
    /* compiled from: SystemLogEntryDao_Impl */
    class C4442i implements Callable<List<SystemLogEntry>> {

        /* renamed from: a */
        final /* synthetic */ RoomSQLiteQuery f11287a;

        C4442i(RoomSQLiteQuery roomSQLiteQuery) {
            this.f11287a = roomSQLiteQuery;
        }

        /* renamed from: a */
        public List<SystemLogEntry> call() throws Exception {
            String str;
            String str2;
            String str3;
            String str4;
            Cursor query = DBUtil.query(C4433u.this.f11271a, this.f11287a, false, (CancellationSignal) null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "logLevel");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "timeStamp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "logText");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "macroId");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "variableName");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "geofenceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "webLink");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "flag");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "id");
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    C4403i a = C4433u.this.f11273c.mo28728a(query.getInt(columnIndexOrThrow));
                    long j = query.getLong(columnIndexOrThrow2);
                    if (query.isNull(columnIndexOrThrow3)) {
                        str = null;
                    } else {
                        str = query.getString(columnIndexOrThrow3);
                    }
                    long j2 = query.getLong(columnIndexOrThrow4);
                    if (query.isNull(columnIndexOrThrow5)) {
                        str2 = null;
                    } else {
                        str2 = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        str3 = null;
                    } else {
                        str3 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        str4 = null;
                    } else {
                        str4 = query.getString(columnIndexOrThrow7);
                    }
                    arrayList.add(new SystemLogEntry(a, j, str, j2, str2, str3, str4, C4433u.this.f11273c.mo28729b(query.getInt(columnIndexOrThrow8)), query.getLong(columnIndexOrThrow9)));
                }
                return arrayList;
            } finally {
                query.close();
                this.f11287a.release();
            }
        }
    }

    public C4433u(RoomDatabase roomDatabase) {
        this.f11271a = roomDatabase;
        this.f11272b = new C4435b(roomDatabase);
        this.f11274d = new C4436c(roomDatabase);
        this.f11275e = new C4437d(roomDatabase);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public SystemLogEntry m17503i(Cursor cursor) {
        C4403i iVar;
        long j;
        String str;
        long j2;
        String str2;
        String str3;
        String str4;
        long j3;
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("logLevel");
        int columnIndex2 = cursor2.getColumnIndex("timeStamp");
        int columnIndex3 = cursor2.getColumnIndex("logText");
        int columnIndex4 = cursor2.getColumnIndex("macroId");
        int columnIndex5 = cursor2.getColumnIndex("variableName");
        int columnIndex6 = cursor2.getColumnIndex("geofenceId");
        int columnIndex7 = cursor2.getColumnIndex("webLink");
        int columnIndex8 = cursor2.getColumnIndex("flag");
        int columnIndex9 = cursor2.getColumnIndex("id");
        C4402h hVar = null;
        if (columnIndex == -1) {
            iVar = null;
        } else {
            iVar = this.f11273c.mo28728a(cursor2.getInt(columnIndex));
        }
        if (columnIndex2 == -1) {
            j = 0;
        } else {
            j = cursor2.getLong(columnIndex2);
        }
        if (columnIndex3 != -1 && !cursor2.isNull(columnIndex3)) {
            str = cursor2.getString(columnIndex3);
        } else {
            str = null;
        }
        if (columnIndex4 == -1) {
            j2 = 0;
        } else {
            j2 = cursor2.getLong(columnIndex4);
        }
        if (columnIndex5 != -1 && !cursor2.isNull(columnIndex5)) {
            str2 = cursor2.getString(columnIndex5);
        } else {
            str2 = null;
        }
        if (columnIndex6 != -1 && !cursor2.isNull(columnIndex6)) {
            str3 = cursor2.getString(columnIndex6);
        } else {
            str3 = null;
        }
        if (columnIndex7 != -1 && !cursor2.isNull(columnIndex7)) {
            str4 = cursor2.getString(columnIndex7);
        } else {
            str4 = null;
        }
        if (columnIndex8 != -1) {
            hVar = this.f11273c.mo28729b(cursor2.getInt(columnIndex8));
        }
        C4402h hVar2 = hVar;
        if (columnIndex9 == -1) {
            j3 = 0;
        } else {
            j3 = cursor2.getLong(columnIndex9);
        }
        return new SystemLogEntry(iVar, j, str, j2, str2, str3, str4, hVar2, j3);
    }

    /* renamed from: p */
    public static List<Class<?>> m17510p() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m17511q(SystemLogEntry systemLogEntry, int i, C13635d dVar) {
        return C4429s.C4430a.m17501a(this, systemLogEntry, i, dVar);
    }

    /* renamed from: a */
    public Object mo28776a(C13635d<? super C13339u> dVar) {
        return CoroutinesRoom.execute(this.f11271a, true, new C4439f(), dVar);
    }

    /* renamed from: b */
    public Object mo28777b(C4403i iVar, C13635d<? super List<SystemLogEntry>> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM SystemLogEntry WHERE logLevel >= ?", 1);
        acquire.bindLong(1, (long) this.f11273c.mo28732e(iVar));
        return CoroutinesRoom.execute(this.f11271a, false, DBUtil.createCancellationSignal(), new C4442i(acquire), dVar);
    }

    /* renamed from: c */
    public Object mo28778c(int i, int i2, C13635d<? super List<SystemLogEntry>> dVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM SystemLogEntry WHERE logLevel >= ? ORDER BY id DESC LIMIT ?", 2);
        acquire.bindLong(1, (long) i2);
        acquire.bindLong(2, (long) i);
        return CoroutinesRoom.execute(this.f11271a, false, DBUtil.createCancellationSignal(), new C4441h(acquire), dVar);
    }

    /* renamed from: d */
    public Object mo28779d(SystemLogEntry systemLogEntry, int i, C13635d<? super C13339u> dVar) {
        return RoomDatabaseKt.withTransaction(this.f11271a, new C4432t(this, systemLogEntry, i), dVar);
    }

    /* renamed from: e */
    public Object mo28780e(SystemLogEntry systemLogEntry, C13635d<? super Long> dVar) {
        return CoroutinesRoom.execute(this.f11271a, true, new C4438e(systemLogEntry), dVar);
    }

    /* renamed from: f */
    public Object mo28781f(long j, C13635d<? super C13339u> dVar) {
        return CoroutinesRoom.execute(this.f11271a, true, new C4440g(j), dVar);
    }

    /* renamed from: g */
    public PagingSource<Integer, SystemLogEntry> mo28782g(SupportSQLiteQuery supportSQLiteQuery) {
        return new C4434a(supportSQLiteQuery, this.f11271a, "SystemLogEntry");
    }
}
