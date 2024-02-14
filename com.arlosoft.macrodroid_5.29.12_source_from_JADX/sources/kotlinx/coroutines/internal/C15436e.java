package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.C15478k0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo71668d2 = {"Lkotlinx/coroutines/internal/e;", "Lkotlinx/coroutines/k0;", "", "toString", "Lkotlin/coroutines/g;", "a", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "context", "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.e */
/* compiled from: Scopes.kt */
public final class C15436e implements C15478k0 {

    /* renamed from: a */
    private final C13640g f64641a;

    public C15436e(C13640g gVar) {
        this.f64641a = gVar;
    }

    public C13640g getCoroutineContext() {
        return this.f64641a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
