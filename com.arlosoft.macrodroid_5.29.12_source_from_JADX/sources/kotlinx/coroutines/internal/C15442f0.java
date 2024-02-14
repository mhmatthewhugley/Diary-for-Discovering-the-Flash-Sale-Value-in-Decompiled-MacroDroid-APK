package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15549t2;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, mo71668d2 = {"Lkotlinx/coroutines/internal/f0;", "T", "Lkotlinx/coroutines/t2;", "Lkotlin/coroutines/g;", "context", "z", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lja/u;", "r", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlin/coroutines/g$c;", "key", "minusKey", "Lkotlin/coroutines/g$b;", "E", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "", "toString", "a", "Ljava/lang/Object;", "value", "Ljava/lang/ThreadLocal;", "c", "Ljava/lang/ThreadLocal;", "threadLocal", "d", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.f0 */
/* compiled from: ThreadContext.kt */
public final class C15442f0<T> implements C15549t2<T> {

    /* renamed from: a */
    private final T f64654a;

    /* renamed from: c */
    private final ThreadLocal<T> f64655c;

    /* renamed from: d */
    private final C13640g.C13645c<?> f64656d;

    public C15442f0(T t, ThreadLocal<T> threadLocal) {
        this.f64654a = t;
        this.f64655c = threadLocal;
        this.f64656d = new C15444g0(threadLocal);
    }

    public <R> R fold(R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
        return C15549t2.C15550a.m94695a(this, r, pVar);
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        if (C13706o.m87924a(getKey(), cVar)) {
            return this;
        }
        return null;
    }

    public C13640g.C13645c<?> getKey() {
        return this.f64656d;
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        return C13706o.m87924a(getKey(), cVar) ? C13646h.f61899a : this;
    }

    public C13640g plus(C13640g gVar) {
        return C15549t2.C15550a.m94696b(this, gVar);
    }

    /* renamed from: r */
    public void mo74775r(C13640g gVar, T t) {
        this.f64655c.set(t);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f64654a + ", threadLocal = " + this.f64655c + ')';
    }

    /* renamed from: z */
    public T mo74777z(C13640g gVar) {
        T t = this.f64655c.get();
        this.f64655c.set(this.f64654a);
        return t;
    }
}
