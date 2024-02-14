package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1137q implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f667a;

    public /* synthetic */ C1137q(int i) {
        this.f667a = i;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setVersion(this.f667a);
    }
}
