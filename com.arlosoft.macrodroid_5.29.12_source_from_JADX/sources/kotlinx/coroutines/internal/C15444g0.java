package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo71668d2 = {"Lkotlinx/coroutines/internal/g0;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/internal/f0;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/ThreadLocal;", "a", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.g0 */
/* compiled from: ThreadContext.kt */
public final class C15444g0 implements C13640g.C13645c<C15442f0<?>> {

    /* renamed from: a */
    private final ThreadLocal<?> f64659a;

    public C15444g0(ThreadLocal<?> threadLocal) {
        this.f64659a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15444g0) && C13706o.m87924a(this.f64659a, ((C15444g0) obj).f64659a);
    }

    public int hashCode() {
        return this.f64659a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f64659a + ')';
    }
}
