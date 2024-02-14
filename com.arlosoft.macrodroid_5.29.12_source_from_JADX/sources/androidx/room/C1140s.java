package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1140s implements Function {

    /* renamed from: a */
    public final /* synthetic */ long f672a;

    public /* synthetic */ C1140s(long j) {
        this.f672a = j;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setPageSize(this.f672a);
    }
}
