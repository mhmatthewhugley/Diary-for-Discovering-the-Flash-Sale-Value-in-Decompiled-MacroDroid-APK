package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1115h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1115h f640a = new C1115h();

    private /* synthetic */ C1115h() {
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
    }
}
