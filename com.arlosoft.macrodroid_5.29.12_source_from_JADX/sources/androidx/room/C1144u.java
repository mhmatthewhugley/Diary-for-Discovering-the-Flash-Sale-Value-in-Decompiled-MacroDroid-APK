package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1144u implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f676a;

    public /* synthetic */ C1144u(String str) {
        this.f676a = str;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).execSQL(this.f676a);
    }
}
