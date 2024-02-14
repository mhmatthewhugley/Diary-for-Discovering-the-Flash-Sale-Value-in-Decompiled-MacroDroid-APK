package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0002¨\u0006\n"}, mo71668d2 = {"Lkotlin/collections/l0;", "T", "", "Lkotlin/collections/k0;", "", "iterator", "Lkotlin/Function0;", "iteratorFactory", "<init>", "(Lqa/a;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.l0 */
/* compiled from: Iterables.kt */
public final class C13595l0<T> implements Iterable<C13592k0<? extends T>>, C16368a {

    /* renamed from: a */
    private final C16254a<Iterator<T>> f61884a;

    public C13595l0(C16254a<? extends Iterator<? extends T>> aVar) {
        C13706o.m87929f(aVar, "iteratorFactory");
        this.f61884a = aVar;
    }

    public Iterator<C13592k0<T>> iterator() {
        return new C13601m0(this.f61884a.invoke());
    }
}
