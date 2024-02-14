package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1131o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1131o f658a = new C1131o();

    private /* synthetic */ C1131o() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
    }
}
