package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;
import java.util.Locale;

/* renamed from: androidx.room.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1103b implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f628a;

    public /* synthetic */ C1103b(Locale locale) {
        this.f628a = locale;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setLocale(this.f628a);
    }
}
