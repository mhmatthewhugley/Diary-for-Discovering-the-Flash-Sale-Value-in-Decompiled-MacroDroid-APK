package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, mo71668d2 = {"Lkotlin/sequences/e;", "T", "Lkotlin/sequences/h;", "", "iterator", "a", "Lkotlin/sequences/h;", "sequence", "", "b", "Z", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Lkotlin/sequences/h;ZLqa/l;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.e */
/* compiled from: Sequences.kt */
public final class C15112e<T> implements C15118h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15118h<T> f64299a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f64300b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C16265l<T, Boolean> f64301c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, mo71668d2 = {"kotlin/sequences/e$a", "", "Lja/u;", "a", "next", "()Ljava/lang/Object;", "", "hasNext", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "c", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "d", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.e$a */
    /* compiled from: Sequences.kt */
    public static final class C15113a implements Iterator<T>, C16368a {

        /* renamed from: a */
        private final Iterator<T> f64302a;

        /* renamed from: c */
        private int f64303c = -1;

        /* renamed from: d */
        private T f64304d;

        /* renamed from: f */
        final /* synthetic */ C15112e<T> f64305f;

        C15113a(C15112e<T> eVar) {
            this.f64305f = eVar;
            this.f64302a = eVar.f64299a.iterator();
        }

        /* renamed from: a */
        private final void m93426a() {
            while (this.f64302a.hasNext()) {
                T next = this.f64302a.next();
                if (((Boolean) this.f64305f.f64301c.invoke(next)).booleanValue() == this.f64305f.f64300b) {
                    this.f64304d = next;
                    this.f64303c = 1;
                    return;
                }
            }
            this.f64303c = 0;
        }

        public boolean hasNext() {
            if (this.f64303c == -1) {
                m93426a();
            }
            return this.f64303c == 1;
        }

        public T next() {
            if (this.f64303c == -1) {
                m93426a();
            }
            if (this.f64303c != 0) {
                T t = this.f64304d;
                this.f64304d = null;
                this.f64303c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15112e(C15118h<? extends T> hVar, boolean z, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(hVar, "sequence");
        C13706o.m87929f(lVar, "predicate");
        this.f64299a = hVar;
        this.f64300b = z;
        this.f64301c = lVar;
    }

    public Iterator<T> iterator() {
        return new C15113a(this);
    }
}
