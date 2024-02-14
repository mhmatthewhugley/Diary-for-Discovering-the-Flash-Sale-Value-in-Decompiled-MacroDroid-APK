package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1107d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1107d f632a = new C1107d();

    private /* synthetic */ C1107d() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isWriteAheadLoggingEnabled());
    }
}
