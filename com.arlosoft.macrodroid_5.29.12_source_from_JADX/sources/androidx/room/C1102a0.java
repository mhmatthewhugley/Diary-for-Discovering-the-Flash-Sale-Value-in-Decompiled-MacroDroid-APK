package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteStatement;

/* renamed from: androidx.room.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1102a0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1102a0 f627a = new C1102a0();

    private /* synthetic */ C1102a0() {
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteStatement) obj).execute();
    }
}
