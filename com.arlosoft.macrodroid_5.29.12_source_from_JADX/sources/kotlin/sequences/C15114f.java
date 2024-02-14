package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo71668d2 = {"Lkotlin/sequences/f;", "T", "R", "E", "Lkotlin/sequences/h;", "", "iterator", "a", "Lkotlin/sequences/h;", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(Lkotlin/sequences/h;Lqa/l;Lqa/l;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.f */
/* compiled from: Sequences.kt */
public final class C15114f<T, R, E> implements C15118h<E> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15118h<T> f64306a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16265l<T, R> f64307b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C16265l<R, Iterator<E>> f64308c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0002H\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo71668d2 = {"kotlin/sequences/f$a", "", "", "a", "next", "()Ljava/lang/Object;", "hasNext", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "c", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.f$a */
    /* compiled from: Sequences.kt */
    public static final class C15115a implements Iterator<E>, C16368a {

        /* renamed from: a */
        private final Iterator<T> f64309a;

        /* renamed from: c */
        private Iterator<? extends E> f64310c;

        /* renamed from: d */
        final /* synthetic */ C15114f<T, R, E> f64311d;

        C15115a(C15114f<T, R, E> fVar) {
            this.f64311d = fVar;
            this.f64309a = fVar.f64306a.iterator();
        }

        /* renamed from: a */
        private final boolean m93430a() {
            Iterator<? extends E> it = this.f64310c;
            if (it != null && !it.hasNext()) {
                this.f64310c = null;
            }
            while (true) {
                if (this.f64310c == null) {
                    if (this.f64309a.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.f64311d.f64308c.invoke(this.f64311d.f64307b.invoke(this.f64309a.next()));
                        if (it2.hasNext()) {
                            this.f64310c = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return m93430a();
        }

        public E next() {
            if (m93430a()) {
                Iterator<? extends E> it = this.f64310c;
                C13706o.m87926c(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15114f(C15118h<? extends T> hVar, C16265l<? super T, ? extends R> lVar, C16265l<? super R, ? extends Iterator<? extends E>> lVar2) {
        C13706o.m87929f(hVar, "sequence");
        C13706o.m87929f(lVar, "transformer");
        C13706o.m87929f(lVar2, "iterator");
        this.f64306a = hVar;
        this.f64307b = lVar;
        this.f64308c = lVar2;
    }

    public Iterator<E> iterator() {
        return new C15115a(this);
    }
}
