package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.y0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1153y0 implements Function {

    /* renamed from: a */
    public final /* synthetic */ RoomDatabase f694a;

    public /* synthetic */ C1153y0(RoomDatabase roomDatabase) {
        this.f694a = roomDatabase;
    }

    public final Object apply(Object obj) {
        return this.f694a.lambda$endTransaction$1((SupportSQLiteDatabase) obj);
    }
}
