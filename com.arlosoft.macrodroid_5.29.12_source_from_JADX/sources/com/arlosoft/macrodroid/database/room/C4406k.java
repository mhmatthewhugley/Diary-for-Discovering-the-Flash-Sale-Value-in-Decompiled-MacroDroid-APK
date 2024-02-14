package com.arlosoft.macrodroid.database.room;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: com.arlosoft.macrodroid.database.room.k */
/* compiled from: MacroDroidRoomDatabase_AutoMigration_2_3_Impl */
class C4406k extends Migration {
    public C4406k() {
        super(2, 3);
    }

    public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `BlockedUser` (`userId` INTEGER NOT NULL, `username` TEXT NOT NULL, PRIMARY KEY(`userId`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `BlockedMacro` (`macroId` INTEGER NOT NULL, `macroName` TEXT NOT NULL, PRIMARY KEY(`macroId`))");
    }
}
