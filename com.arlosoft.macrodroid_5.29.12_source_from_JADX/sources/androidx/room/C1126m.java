package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1126m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1126m f654a = new C1126m();

    private /* synthetic */ C1126m() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isReadOnly());
    }
}
