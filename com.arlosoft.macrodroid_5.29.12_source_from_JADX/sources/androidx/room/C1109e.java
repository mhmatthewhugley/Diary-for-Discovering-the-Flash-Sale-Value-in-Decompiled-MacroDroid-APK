package androidx.room;

import androidx.arch.core.util.Function;
import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.p010db.SupportSQLiteDatabase;

/* renamed from: androidx.room.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1109e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C1109e f634a = new C1109e();

    private /* synthetic */ C1109e() {
    }

    public final Object apply(Object obj) {
        return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$pokeOpen$0((SupportSQLiteDatabase) obj);
    }
}
