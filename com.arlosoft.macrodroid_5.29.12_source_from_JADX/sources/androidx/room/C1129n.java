package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1129n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1129n f656a = new C1129n();

    private /* synthetic */ C1129n() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).yieldIfContendedSafely());
    }
}
