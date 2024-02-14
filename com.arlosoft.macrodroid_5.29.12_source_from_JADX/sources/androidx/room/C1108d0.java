package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteStatement;

/* renamed from: androidx.room.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1108d0 implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1108d0 f633a = new C1108d0();

    private /* synthetic */ C1108d0() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteStatement) obj).executeInsert());
    }
}
