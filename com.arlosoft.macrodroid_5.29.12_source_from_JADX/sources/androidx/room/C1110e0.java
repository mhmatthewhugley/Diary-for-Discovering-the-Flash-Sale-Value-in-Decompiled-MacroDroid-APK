package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteStatement;

/* renamed from: androidx.room.e0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1110e0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1110e0 f635a = new C1110e0();

    private /* synthetic */ C1110e0() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteStatement) obj).simpleQueryForLong());
    }
}
