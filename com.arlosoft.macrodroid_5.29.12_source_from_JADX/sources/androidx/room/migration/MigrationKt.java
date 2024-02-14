package androidx.room.migration;

import androidx.sqlite.p010db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\t"}, mo71668d2 = {"", "startVersion", "endVersion", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Lja/u;", "migrate", "Landroidx/room/migration/Migration;", "Migration", "room-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Migration.kt */
public final class MigrationKt {
    public static final Migration Migration(int i, int i2, C16265l<? super SupportSQLiteDatabase, C13339u> lVar) {
        C13706o.m87929f(lVar, "migrate");
        return new MigrationImpl(i, i2, lVar);
    }
}
