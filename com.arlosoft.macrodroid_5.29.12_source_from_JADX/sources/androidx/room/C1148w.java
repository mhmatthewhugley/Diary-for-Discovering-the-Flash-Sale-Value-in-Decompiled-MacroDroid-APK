package androidx.room;

import android.content.ContentValues;
import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1148w implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f682a;

    /* renamed from: b */
    public final /* synthetic */ int f683b;

    /* renamed from: c */
    public final /* synthetic */ ContentValues f684c;

    /* renamed from: d */
    public final /* synthetic */ String f685d;

    /* renamed from: e */
    public final /* synthetic */ Object[] f686e;

    public /* synthetic */ C1148w(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        this.f682a = str;
        this.f683b = i;
        this.f684c = contentValues;
        this.f685d = str2;
        this.f686e = objArr;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).update(this.f682a, this.f683b, this.f684c, this.f685d, this.f686e));
    }
}
