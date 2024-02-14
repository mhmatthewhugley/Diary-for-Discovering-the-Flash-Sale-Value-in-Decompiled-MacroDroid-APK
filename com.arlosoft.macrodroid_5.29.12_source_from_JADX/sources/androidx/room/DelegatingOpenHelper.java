package androidx.room;

import androidx.annotation.NonNull;
import androidx.sqlite.p010db.SupportSQLiteOpenHelper;

interface DelegatingOpenHelper {
    @NonNull
    SupportSQLiteOpenHelper getDelegate();
}
