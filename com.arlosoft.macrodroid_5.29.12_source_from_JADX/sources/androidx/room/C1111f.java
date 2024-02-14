package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1111f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1111f f636a = new C1111f();

    private /* synthetic */ C1111f() {
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).getAttachedDbs();
    }
}
