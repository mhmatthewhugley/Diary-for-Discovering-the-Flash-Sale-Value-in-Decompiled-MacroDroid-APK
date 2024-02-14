package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1124l implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f652a;

    public /* synthetic */ C1124l(int i) {
        this.f652a = i;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setMaxSqlCacheSize(this.f652a);
    }
}
