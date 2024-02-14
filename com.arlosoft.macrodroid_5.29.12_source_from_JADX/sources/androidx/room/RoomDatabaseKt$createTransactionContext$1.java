package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;

@Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.room.RoomDatabaseKt", mo71894f = "RoomDatabase.kt", mo71895l = {99}, mo71896m = "createTransactionContext")
/* compiled from: RoomDatabase.kt */
final class RoomDatabaseKt$createTransactionContext$1 extends C13656d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    RoomDatabaseKt$createTransactionContext$1(C13635d<? super RoomDatabaseKt$createTransactionContext$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RoomDatabaseKt.createTransactionContext((RoomDatabase) null, this);
    }
}
