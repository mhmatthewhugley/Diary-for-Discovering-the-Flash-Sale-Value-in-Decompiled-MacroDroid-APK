package androidx.room;

import androidx.arch.core.util.Function;
import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1154z implements Function {

    /* renamed from: a */
    public final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement f695a;

    /* renamed from: b */
    public final /* synthetic */ Function f696b;

    public /* synthetic */ C1154z(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, Function function) {
        this.f695a = autoClosingSupportSqliteStatement;
        this.f696b = function;
    }

    public final Object apply(Object obj) {
        return this.f695a.lambda$executeSqliteStatementWithRefCount$0(this.f696b, (SupportSQLiteDatabase) obj);
    }
}
