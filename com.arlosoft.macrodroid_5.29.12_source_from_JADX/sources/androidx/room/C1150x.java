package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.x */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1150x implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f688a;

    /* renamed from: b */
    public final /* synthetic */ String f689b;

    /* renamed from: c */
    public final /* synthetic */ Object[] f690c;

    public /* synthetic */ C1150x(String str, String str2, Object[] objArr) {
        this.f688a = str;
        this.f689b = str2;
        this.f690c = objArr;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).delete(this.f688a, this.f689b, this.f690c));
    }
}
