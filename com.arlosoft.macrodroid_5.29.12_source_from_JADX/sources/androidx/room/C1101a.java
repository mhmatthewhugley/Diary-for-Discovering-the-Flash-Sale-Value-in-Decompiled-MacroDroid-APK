package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1101a implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f626a;

    public /* synthetic */ C1101a(int i) {
        this.f626a = i;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).needUpgrade(this.f626a));
    }
}
