package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteStatement;

/* renamed from: androidx.room.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1106c0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1106c0 f631a = new C1106c0();

    private /* synthetic */ C1106c0() {
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteStatement) obj).simpleQueryForString();
    }
}
