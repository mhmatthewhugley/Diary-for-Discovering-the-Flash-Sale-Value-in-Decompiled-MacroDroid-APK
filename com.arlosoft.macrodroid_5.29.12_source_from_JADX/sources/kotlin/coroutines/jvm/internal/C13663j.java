package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "", "completion", "<init>", "(Lkotlin/coroutines/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.jvm.internal.j */
/* compiled from: ContinuationImpl.kt */
public abstract class C13663j extends C13653a {
    public C13663j(C13635d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == C13646h.f61899a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public C13640g getContext() {
        return C13646h.f61899a;
    }
}
