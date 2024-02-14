package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H@"}, mo71668d2 = {"T", "", "R", "before", "after", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", mo71894f = "Separators.kt", mo71895l = {580}, mo71896m = "invokeSuspend")
/* compiled from: Separators.kt */
final class SeparatorsKt$insertEventSeparators$separatorState$1 extends C13665l implements C16270q<T, T, C13635d<? super R>, Object> {
    final /* synthetic */ C16270q<T, T, C13635d<? super R>, Object> $generator;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SeparatorsKt$insertEventSeparators$separatorState$1(C16270q<? super T, ? super T, ? super C13635d<? super R>, ? extends Object> qVar, C13635d<? super SeparatorsKt$insertEventSeparators$separatorState$1> dVar) {
        super(3, dVar);
        this.$generator = qVar;
    }

    public final Object invoke(T t, T t2, C13635d<? super R> dVar) {
        SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new SeparatorsKt$insertEventSeparators$separatorState$1(this.$generator, dVar);
        separatorsKt$insertEventSeparators$separatorState$1.L$0 = t;
        separatorsKt$insertEventSeparators$separatorState$1.L$1 = t2;
        return separatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            C16270q<T, T, C13635d<? super R>, Object> qVar = this.$generator;
            this.L$0 = null;
            this.label = 1;
            obj = qVar.invoke(obj2, obj3, this);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
