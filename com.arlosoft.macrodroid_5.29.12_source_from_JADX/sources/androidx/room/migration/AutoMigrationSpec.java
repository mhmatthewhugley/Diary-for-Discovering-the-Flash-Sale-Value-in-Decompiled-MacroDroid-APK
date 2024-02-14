package androidx.room.migration;

import androidx.annotation.NonNull;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

public interface AutoMigrationSpec {
    void onPostMigrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);
}
