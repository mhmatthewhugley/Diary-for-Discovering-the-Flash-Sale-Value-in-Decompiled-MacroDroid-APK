package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1119j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1119j f648a = new C1119j();

    private /* synthetic */ C1119j() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
    }
}
