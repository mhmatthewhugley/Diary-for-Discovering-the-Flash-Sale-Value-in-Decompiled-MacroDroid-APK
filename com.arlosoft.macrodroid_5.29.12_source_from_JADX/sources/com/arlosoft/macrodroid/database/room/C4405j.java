package com.arlosoft.macrodroid.database.room;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: com.arlosoft.macrodroid.database.room.j */
/* compiled from: MacroDroidRoomDatabase_AutoMigration_1_2_Impl */
class C4405j extends Migration {
    public C4405j() {
        super(1, 2);
    }

    public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `UserSubscription` (`userId` INTEGER NOT NULL, `userName` TEXT NOT NULL, `userImage` TEXT NOT NULL, PRIMARY KEY(`userId`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `MacroSubscription` (`macroId` INTEGER NOT NULL, `macroName` TEXT NOT NULL, PRIMARY KEY(`macroId`))");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SubscriptionUpdateItem` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` INTEGER NOT NULL, `macroId` INTEGER NOT NULL, `macroName` TEXT NOT NULL, `username` TEXT NOT NULL, `userId` INTEGER NOT NULL, `userImage` TEXT NOT NULL, `comment` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
    }
}
