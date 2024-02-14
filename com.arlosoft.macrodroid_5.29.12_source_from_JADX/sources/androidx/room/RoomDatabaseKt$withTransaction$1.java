package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p370qa.C16265l;

@Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.room.RoomDatabaseKt", mo71894f = "RoomDatabase.kt", mo71895l = {50, 51}, mo71896m = "withTransaction")
/* compiled from: RoomDatabase.kt */
final class RoomDatabaseKt$withTransaction$1<R> extends C13656d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    RoomDatabaseKt$withTransaction$1(C13635d<? super RoomDatabaseKt$withTransaction$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RoomDatabaseKt.withTransaction((RoomDatabase) null, (C16265l) null, this);
    }
}
