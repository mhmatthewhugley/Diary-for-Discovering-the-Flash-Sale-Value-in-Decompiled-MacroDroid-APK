package com.arlosoft.macrodroid.database.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p010db.SupportSQLiteDatabase;
import androidx.sqlite.p010db.SupportSQLiteOpenHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;

public final class MacroDroidRoomDatabase_Impl extends MacroDroidRoomDatabase {

    /* renamed from: a */
    private volatile C4429s f11160a;

    /* renamed from: b */
    private volatile C4445w f11161b;

    /* renamed from: c */
    private volatile C4409m f11162c;

    /* renamed from: d */
    private volatile C4421q f11163d;

    /* renamed from: e */
    private volatile C4393e f11164e;

    /* renamed from: f */
    private volatile C4384b f11165f;

    /* renamed from: com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase_Impl$a */
    class C4379a extends RoomOpenHelper.Delegate {
        C4379a(int i) {
            super(i);
        }

        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemLogEntry` (`logLevel` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, `logText` TEXT NOT NULL, `macroId` INTEGER NOT NULL, `variableName` TEXT, `geofenceId` TEXT, `webLink` TEXT, `flag` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `UserSubscription` (`userId` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userImage` TEXT NOT NULL, PRIMARY KEY(`userId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `MacroSubscription` (`macroId` INTEGER NOT NULL, `macroName` TEXT NOT NULL, PRIMARY KEY(`macroId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SubscriptionUpdateItem` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` INTEGER NOT NULL, `macroId` INTEGER NOT NULL, `macroName` TEXT NOT NULL, `username` TEXT NOT NULL, `userId` INTEGER NOT NULL, `userImage` TEXT NOT NULL, `comment` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `BlockedUser` (`userId` INTEGER NOT NULL, `username` TEXT NOT NULL, PRIMARY KEY(`userId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `BlockedMacro` (`macroId` INTEGER NOT NULL, `macroName` TEXT NOT NULL, PRIMARY KEY(`macroId`))");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a77368d9f4d19a5941822017a97d8c40')");
        }

        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemLogEntry`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `UserSubscription`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `MacroSubscription`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SubscriptionUpdateItem`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `BlockedUser`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `BlockedMacro`");
            if (MacroDroidRoomDatabase_Impl.this.mCallbacks != null) {
                int size = MacroDroidRoomDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) MacroDroidRoomDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (MacroDroidRoomDatabase_Impl.this.mCallbacks != null) {
                int size = MacroDroidRoomDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) MacroDroidRoomDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase unused = MacroDroidRoomDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
            MacroDroidRoomDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (MacroDroidRoomDatabase_Impl.this.mCallbacks != null) {
                int size = MacroDroidRoomDatabase_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) MacroDroidRoomDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        /* access modifiers changed from: protected */
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
            HashMap hashMap = new HashMap(9);
            hashMap.put("logLevel", new TableInfo.Column("logLevel", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("logText", new TableInfo.Column("logText", "TEXT", true, 0, (String) null, 1));
            hashMap.put("macroId", new TableInfo.Column("macroId", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("variableName", new TableInfo.Column("variableName", "TEXT", false, 0, (String) null, 1));
            hashMap.put("geofenceId", new TableInfo.Column("geofenceId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("webLink", new TableInfo.Column("webLink", "TEXT", false, 0, (String) null, 1));
            hashMap.put("flag", new TableInfo.Column("flag", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
            TableInfo tableInfo = new TableInfo("SystemLogEntry", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase2, "SystemLogEntry");
            if (!tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(false, "SystemLogEntry(com.arlosoft.macrodroid.database.room.SystemLogEntry).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("userId", new TableInfo.Column("userId", "INTEGER", true, 1, (String) null, 1));
            hashMap2.put("userName", new TableInfo.Column("userName", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("userImage", new TableInfo.Column("userImage", "TEXT", true, 0, (String) null, 1));
            TableInfo tableInfo2 = new TableInfo("UserSubscription", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(supportSQLiteDatabase2, "UserSubscription");
            if (!tableInfo2.equals(read2)) {
                return new RoomOpenHelper.ValidationResult(false, "UserSubscription(com.arlosoft.macrodroid.database.room.UserSubscription).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
            }
            HashMap hashMap3 = new HashMap(2);
            TableInfo.Column column = r10;
            TableInfo.Column column2 = new TableInfo.Column("macroId", "INTEGER", true, 1, (String) null, 1);
            hashMap3.put("macroId", column);
            hashMap3.put("macroName", new TableInfo.Column("macroName", "TEXT", true, 0, (String) null, 1));
            TableInfo tableInfo3 = new TableInfo("MacroSubscription", hashMap3, new HashSet(0), new HashSet(0));
            TableInfo read3 = TableInfo.read(supportSQLiteDatabase2, "MacroSubscription");
            if (!tableInfo3.equals(read3)) {
                return new RoomOpenHelper.ValidationResult(false, "MacroSubscription(com.arlosoft.macrodroid.database.room.MacroSubscription).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
            }
            HashMap hashMap4 = new HashMap(9);
            hashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
            hashMap4.put("type", new TableInfo.Column("type", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("macroId", new TableInfo.Column("macroId", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("macroName", new TableInfo.Column("macroName", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("username", new TableInfo.Column("username", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("userImage", new TableInfo.Column("userImage", "TEXT", true, 0, (String) null, 1));
            hashMap4.put(ClientCookie.COMMENT_ATTR, new TableInfo.Column(ClientCookie.COMMENT_ATTR, "TEXT", true, 0, (String) null, 1));
            hashMap4.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, (String) null, 1));
            TableInfo tableInfo4 = new TableInfo("SubscriptionUpdateItem", hashMap4, new HashSet(0), new HashSet(0));
            TableInfo read4 = TableInfo.read(supportSQLiteDatabase2, "SubscriptionUpdateItem");
            if (!tableInfo4.equals(read4)) {
                return new RoomOpenHelper.ValidationResult(false, "SubscriptionUpdateItem(com.arlosoft.macrodroid.database.room.SubscriptionUpdateItem).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("userId", new TableInfo.Column("userId", "INTEGER", true, 1, (String) null, 1));
            hashMap5.put("username", new TableInfo.Column("username", "TEXT", true, 0, (String) null, 1));
            TableInfo tableInfo5 = new TableInfo("BlockedUser", hashMap5, new HashSet(0), new HashSet(0));
            TableInfo read5 = TableInfo.read(supportSQLiteDatabase2, "BlockedUser");
            if (!tableInfo5.equals(read5)) {
                return new RoomOpenHelper.ValidationResult(false, "BlockedUser(com.arlosoft.macrodroid.database.room.BlockedUser).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("macroId", new TableInfo.Column("macroId", "INTEGER", true, 1, (String) null, 1));
            hashMap6.put("macroName", new TableInfo.Column("macroName", "TEXT", true, 0, (String) null, 1));
            TableInfo tableInfo6 = new TableInfo("BlockedMacro", hashMap6, new HashSet(0), new HashSet(0));
            TableInfo read6 = TableInfo.read(supportSQLiteDatabase2, "BlockedMacro");
            if (tableInfo6.equals(read6)) {
                return new RoomOpenHelper.ValidationResult(true, (String) null);
            }
            return new RoomOpenHelper.ValidationResult(false, "BlockedMacro(com.arlosoft.macrodroid.database.room.BlockedMacro).\n Expected:\n" + tableInfo6 + "\n Found:\n" + read6);
        }
    }

    /* renamed from: c */
    public C4384b mo28677c() {
        C4384b bVar;
        if (this.f11165f != null) {
            return this.f11165f;
        }
        synchronized (this) {
            if (this.f11165f == null) {
                this.f11165f = new C4385c(this);
            }
            bVar = this.f11165f;
        }
        return bVar;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `SystemLogEntry`");
            writableDatabase.execSQL("DELETE FROM `UserSubscription`");
            writableDatabase.execSQL("DELETE FROM `MacroSubscription`");
            writableDatabase.execSQL("DELETE FROM `SubscriptionUpdateItem`");
            writableDatabase.execSQL("DELETE FROM `BlockedUser`");
            writableDatabase.execSQL("DELETE FROM `BlockedMacro`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "SystemLogEntry", "UserSubscription", "MacroSubscription", "SubscriptionUpdateItem", "BlockedUser", "BlockedMacro");
    }

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new C4379a(3), "a77368d9f4d19a5941822017a97d8c40", "1063590cb38e771246ac6917e2482b95")).build());
    }

    /* renamed from: d */
    public C4393e mo28678d() {
        C4393e eVar;
        if (this.f11164e != null) {
            return this.f11164e;
        }
        synchronized (this) {
            if (this.f11164e == null) {
                this.f11164e = new C4394f(this);
            }
            eVar = this.f11164e;
        }
        return eVar;
    }

    /* renamed from: e */
    public C4409m mo28679e() {
        C4409m mVar;
        if (this.f11162c != null) {
            return this.f11162c;
        }
        synchronized (this) {
            if (this.f11162c == null) {
                this.f11162c = new C4410n(this);
            }
            mVar = this.f11162c;
        }
        return mVar;
    }

    /* renamed from: f */
    public C4421q mo28680f() {
        C4421q qVar;
        if (this.f11163d != null) {
            return this.f11163d;
        }
        synchronized (this) {
            if (this.f11163d == null) {
                this.f11163d = new C4422r(this);
            }
            qVar = this.f11163d;
        }
        return qVar;
    }

    /* renamed from: g */
    public C4429s mo28681g() {
        C4429s sVar;
        if (this.f11160a != null) {
            return this.f11160a;
        }
        synchronized (this) {
            if (this.f11160a == null) {
                this.f11160a = new C4433u(this);
            }
            sVar = this.f11160a;
        }
        return sVar;
    }

    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[]{new C4405j(), new C4406k()});
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C4429s.class, C4433u.m17510p());
        hashMap.put(C4445w.class, C4446x.m17535h());
        hashMap.put(C4409m.class, C4410n.m17459h());
        hashMap.put(C4421q.class, C4422r.m17486h());
        hashMap.put(C4393e.class, C4394f.m17432g());
        hashMap.put(C4384b.class, C4385c.m17418e());
        return hashMap;
    }

    /* renamed from: h */
    public C4445w mo28682h() {
        C4445w wVar;
        if (this.f11161b != null) {
            return this.f11161b;
        }
        synchronized (this) {
            if (this.f11161b == null) {
                this.f11161b = new C4446x(this);
            }
            wVar = this.f11161b;
        }
        return wVar;
    }
}
