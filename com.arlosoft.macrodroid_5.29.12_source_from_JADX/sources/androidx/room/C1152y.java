package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1152y implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f692a;

    /* renamed from: b */
    public final /* synthetic */ Object[] f693b;

    public /* synthetic */ C1152y(String str, Object[] objArr) {
        this.f692a = str;
        this.f693b = objArr;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).execSQL(this.f692a, this.f693b);
    }
}
