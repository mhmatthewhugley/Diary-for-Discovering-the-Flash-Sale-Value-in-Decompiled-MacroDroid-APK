package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import p370qa.C16270q;

@Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
@C13658f(mo71893c = "androidx.paging.SeparatorsKt", mo71894f = "Separators.kt", mo71895l = {81}, mo71896m = "insertInternalSeparators")
/* compiled from: Separators.kt */
final class SeparatorsKt$insertInternalSeparators$1<R, T extends R> extends C13656d {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    SeparatorsKt$insertInternalSeparators$1(C13635d<? super SeparatorsKt$insertInternalSeparators$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SeparatorsKt.insertInternalSeparators((TransformablePage) null, (C16270q) null, this);
    }
}
