package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo71668d2 = {"Lkotlin/sequences/s;", "T", "Lkotlin/sequences/h;", "", "iterator", "a", "Lkotlin/sequences/h;", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lkotlin/sequences/h;Lqa/l;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.s */
/* compiled from: Sequences.kt */
public final class C15140s<T> implements C15118h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15118h<T> f64338a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16265l<T, Boolean> f64339b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, mo71668d2 = {"kotlin/sequences/s$a", "", "Lja/u;", "a", "next", "()Ljava/lang/Object;", "", "hasNext", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "c", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "d", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.s$a */
    /* compiled from: Sequences.kt */
    public static final class C15141a implements Iterator<T>, C16368a {

        /* renamed from: a */
        private final Iterator<T> f64340a;

        /* renamed from: c */
        private int f64341c = -1;

        /* renamed from: d */
        private T f64342d;

        /* renamed from: f */
        final /* synthetic */ C15140s<T> f64343f;

        C15141a(C15140s<T> sVar) {
            this.f64343f = sVar;
            this.f64340a = sVar.f64338a.iterator();
        }

        /* renamed from: a */
        private final void m93513a() {
            if (this.f64340a.hasNext()) {
                T next = this.f64340a.next();
                if (((Boolean) this.f64343f.f64339b.invoke(next)).booleanValue()) {
                    this.f64341c = 1;
                    this.f64342d = next;
                    return;
                }
            }
            this.f64341c = 0;
        }

        public boolean hasNext() {
            if (this.f64341c == -1) {
                m93513a();
            }
            return this.f64341c == 1;
        }

        public T next() {
            if (this.f64341c == -1) {
                m93513a();
            }
            if (this.f64341c != 0) {
                T t = this.f64342d;
                this.f64342d = null;
                this.f64341c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15140s(C15118h<? extends T> hVar, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(hVar, "sequence");
        C13706o.m87929f(lVar, "predicate");
        this.f64338a = hVar;
        this.f64339b = lVar;
    }

    public Iterator<T> iterator() {
        return new C15141a(this);
    }
}
