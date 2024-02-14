package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1133p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1133p f662a = new C1133p();

    private /* synthetic */ C1133p() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
    }
}
