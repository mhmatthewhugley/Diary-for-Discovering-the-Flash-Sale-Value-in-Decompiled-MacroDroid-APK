package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1117i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1117i f644a = new C1117i();

    private /* synthetic */ C1117i() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).inTransaction());
    }
}
