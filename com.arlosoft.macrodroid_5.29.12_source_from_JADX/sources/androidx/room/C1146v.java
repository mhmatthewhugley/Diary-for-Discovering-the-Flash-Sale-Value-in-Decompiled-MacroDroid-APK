package androidx.room;

import android.content.ContentValues;
import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1146v implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f678a;

    /* renamed from: b */
    public final /* synthetic */ int f679b;

    /* renamed from: c */
    public final /* synthetic */ ContentValues f680c;

    public /* synthetic */ C1146v(String str, int i, ContentValues contentValues) {
        this.f678a = str;
        this.f679b = i;
        this.f680c = contentValues;
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).insert(this.f678a, this.f679b, this.f680c));
    }
}
