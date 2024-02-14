package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1105c implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f630a;

    public /* synthetic */ C1105c(boolean z) {
        this.f630a = z;
    }

    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).setForeignKeyConstraintsEnabled(this.f630a);
    }
}
