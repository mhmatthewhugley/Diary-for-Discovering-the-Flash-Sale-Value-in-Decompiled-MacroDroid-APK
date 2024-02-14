package androidx.room.migration;

import androidx.sqlite.p010db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, mo71668d2 = {"Landroidx/room/migration/MigrationImpl;", "Landroidx/room/migration/Migration;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lja/u;", "migrate", "Lkotlin/Function1;", "migrateCallback", "Lqa/l;", "getMigrateCallback", "()Lqa/l;", "", "startVersion", "endVersion", "<init>", "(IILqa/l;)V", "room-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Migration.kt */
final class MigrationImpl extends Migration {
    private final C16265l<SupportSQLiteDatabase, C13339u> migrateCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MigrationImpl(int i, int i2, C16265l<? super SupportSQLiteDatabase, C13339u> lVar) {
        super(i, i2);
        C13706o.m87929f(lVar, "migrateCallback");
        this.migrateCallback = lVar;
    }

    public final C16265l<SupportSQLiteDatabase, C13339u> getMigrateCallback() {
        return this.migrateCallback;
    }

    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        C13706o.m87929f(supportSQLiteDatabase, "database");
        this.migrateCallback.invoke(supportSQLiteDatabase);
    }
}
