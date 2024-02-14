package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, mo71668d2 = {"Lkotlin/sequences/t;", "T", "R", "Lkotlin/sequences/h;", "", "iterator", "E", "Lkotlin/Function1;", "e", "(Lqa/l;)Lkotlin/sequences/h;", "a", "Lkotlin/sequences/h;", "sequence", "transformer", "<init>", "(Lkotlin/sequences/h;Lqa/l;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.t */
/* compiled from: Sequences.kt */
public final class C15142t<T, R> implements C15118h<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15118h<T> f64344a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16265l<T, R> f64345b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo71668d2 = {"kotlin/sequences/t$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.t$a */
    /* compiled from: Sequences.kt */
    public static final class C15143a implements Iterator<R>, C16368a {

        /* renamed from: a */
        private final Iterator<T> f64346a;

        /* renamed from: c */
        final /* synthetic */ C15142t<T, R> f64347c;

        C15143a(C15142t<T, R> tVar) {
            this.f64347c = tVar;
            this.f64346a = tVar.f64344a.iterator();
        }

        public boolean hasNext() {
            return this.f64346a.hasNext();
        }

        public R next() {
            return this.f64347c.f64345b.invoke(this.f64346a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15142t(C15118h<? extends T> hVar, C16265l<? super T, ? extends R> lVar) {
        C13706o.m87929f(hVar, "sequence");
        C13706o.m87929f(lVar, "transformer");
        this.f64344a = hVar;
        this.f64345b = lVar;
    }

    /* renamed from: e */
    public final <E> C15118h<E> mo74443e(C16265l<? super R, ? extends Iterator<? extends E>> lVar) {
        C13706o.m87929f(lVar, "iterator");
        return new C15114f(this.f64344a, this.f64345b, lVar);
    }

    public Iterator<R> iterator() {
        return new C15143a(this);
    }
}
