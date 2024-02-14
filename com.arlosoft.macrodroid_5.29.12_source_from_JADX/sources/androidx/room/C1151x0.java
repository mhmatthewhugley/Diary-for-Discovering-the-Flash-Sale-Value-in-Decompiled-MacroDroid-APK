package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.x0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1151x0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ RoomDatabase f691a;

    public /* synthetic */ C1151x0(RoomDatabase roomDatabase) {
        this.f691a = roomDatabase;
    }

    public final Object apply(Object obj) {
        return this.f691a.lambda$beginTransaction$0((SupportSQLiteDatabase) obj);
    }
}
