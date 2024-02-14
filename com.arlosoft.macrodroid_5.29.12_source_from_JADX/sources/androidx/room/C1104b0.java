package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteStatement;

/* renamed from: androidx.room.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1104b0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1104b0 f629a = new C1104b0();

    private /* synthetic */ C1104b0() {
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteStatement) obj).executeUpdateDelete());
    }
}
