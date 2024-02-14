package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1142t implements Function {

    /* renamed from: a */
    public final /* synthetic */ long f674a;

    public /* synthetic */ C1142t(long j) {
        this.f674a = j;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).setMaximumSize(this.f674a));
    }
}
