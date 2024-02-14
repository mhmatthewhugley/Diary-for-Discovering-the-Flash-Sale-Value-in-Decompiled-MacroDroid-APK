package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1121k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1121k f650a = new C1121k();

    private /* synthetic */ C1121k() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
    }
}
