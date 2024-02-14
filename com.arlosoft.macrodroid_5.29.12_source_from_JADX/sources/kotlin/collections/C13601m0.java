package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/collections/m0;", "T", "", "Lkotlin/collections/k0;", "", "hasNext", "a", "Ljava/util/Iterator;", "iterator", "", "c", "I", "index", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.m0 */
/* compiled from: Iterators.kt */
public final class C13601m0<T> implements Iterator<C13592k0<? extends T>>, C16368a {

    /* renamed from: a */
    private final Iterator<T> f61887a;

    /* renamed from: c */
    private int f61888c;

    public C13601m0(Iterator<? extends T> it) {
        C13706o.m87929f(it, "iterator");
        this.f61887a = it;
    }

    /* renamed from: a */
    public final C13592k0<T> next() {
        int i = this.f61888c;
        this.f61888c = i + 1;
        if (i < 0) {
            C13614t.m87758t();
        }
        return new C13592k0<>(i, this.f61887a.next());
    }

    public final boolean hasNext() {
        return this.f61887a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
