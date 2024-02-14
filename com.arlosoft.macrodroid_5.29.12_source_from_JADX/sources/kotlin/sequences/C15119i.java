package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0002\u0004\n\u0002\b\u0019¨\u0006."}, mo71668d2 = {"Lkotlin/sequences/i;", "T", "Lkotlin/sequences/j;", "", "Lkotlin/coroutines/d;", "Lja/u;", "h", "()Ljava/lang/Object;", "", "g", "", "hasNext", "next", "value", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "iterator", "c", "(Ljava/util/Iterator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lja/n;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "a", "I", "state", "Ljava/lang/Object;", "nextValue", "d", "Ljava/util/Iterator;", "nextIterator", "f", "Lkotlin/coroutines/d;", "getNextStep", "()Lkotlin/coroutines/d;", "i", "(Lkotlin/coroutines/d;)V", "nextStep", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.i */
/* compiled from: SequenceBuilder.kt */
final class C15119i<T> extends C15120j<T> implements Iterator<T>, C13635d<C13339u>, C16368a {

    /* renamed from: a */
    private int f64317a;

    /* renamed from: c */
    private T f64318c;

    /* renamed from: d */
    private Iterator<? extends T> f64319d;

    /* renamed from: f */
    private C13635d<? super C13339u> f64320f;

    /* renamed from: g */
    private final Throwable m93434g() {
        int i = this.f64317a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f64317a);
    }

    /* renamed from: h */
    private final T m93435h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public Object mo74423b(T t, C13635d<? super C13339u> dVar) {
        this.f64318c = t;
        this.f64317a = 3;
        this.f64320f = dVar;
        Object c = C13652d.m87832c();
        if (c == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return c == C13652d.m87832c() ? c : C13339u.f61331a;
    }

    /* renamed from: c */
    public Object mo74424c(Iterator<? extends T> it, C13635d<? super C13339u> dVar) {
        if (!it.hasNext()) {
            return C13339u.f61331a;
        }
        this.f64319d = it;
        this.f64317a = 2;
        this.f64320f = dVar;
        Object c = C13652d.m87832c();
        if (c == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return c == C13652d.m87832c() ? c : C13339u.f61331a;
    }

    public C13640g getContext() {
        return C13646h.f61899a;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f64317a;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f64319d;
                    C13706o.m87926c(it);
                    if (it.hasNext()) {
                        this.f64317a = 2;
                        return true;
                    }
                    this.f64319d = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m93434g();
                }
            }
            this.f64317a = 5;
            C13635d<? super C13339u> dVar = this.f64320f;
            C13706o.m87926c(dVar);
            this.f64320f = null;
            C13329n.C13330a aVar = C13329n.f61327a;
            dVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
        }
    }

    /* renamed from: i */
    public final void mo74426i(C13635d<? super C13339u> dVar) {
        this.f64320f = dVar;
    }

    public T next() {
        int i = this.f64317a;
        if (i == 0 || i == 1) {
            return m93435h();
        }
        if (i == 2) {
            this.f64317a = 1;
            Iterator<? extends T> it = this.f64319d;
            C13706o.m87926c(it);
            return it.next();
        } else if (i == 3) {
            this.f64317a = 0;
            T t = this.f64318c;
            this.f64318c = null;
            return t;
        } else {
            throw m93434g();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        C13332o.m85685b(obj);
        this.f64317a = 4;
    }
}
