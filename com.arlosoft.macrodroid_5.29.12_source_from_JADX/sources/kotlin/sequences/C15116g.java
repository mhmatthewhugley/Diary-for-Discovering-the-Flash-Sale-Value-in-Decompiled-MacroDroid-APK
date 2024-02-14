package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;
import p370qa.C16265l;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¨\u0006\f"}, mo71668d2 = {"Lkotlin/sequences/g;", "", "T", "Lkotlin/sequences/h;", "", "iterator", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Lqa/a;Lqa/l;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.g */
/* compiled from: Sequences.kt */
final class C15116g<T> implements C15118h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16254a<T> f64312a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16265l<T, T> f64313b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0002R$\u0010\f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, mo71668d2 = {"kotlin/sequences/g$a", "", "Lja/u;", "a", "next", "()Ljava/lang/Object;", "", "hasNext", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "c", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.g$a */
    /* compiled from: Sequences.kt */
    public static final class C15117a implements Iterator<T>, C16368a {

        /* renamed from: a */
        private T f64314a;

        /* renamed from: c */
        private int f64315c = -2;

        /* renamed from: d */
        final /* synthetic */ C15116g<T> f64316d;

        C15117a(C15116g<T> gVar) {
            this.f64316d = gVar;
        }

        /* renamed from: a */
        private final void m93433a() {
            T t;
            if (this.f64315c == -2) {
                t = this.f64316d.f64312a.invoke();
            } else {
                C16265l d = this.f64316d.f64313b;
                T t2 = this.f64314a;
                C13706o.m87926c(t2);
                t = d.invoke(t2);
            }
            this.f64314a = t;
            this.f64315c = t == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f64315c < 0) {
                m93433a();
            }
            return this.f64315c == 1;
        }

        public T next() {
            if (this.f64315c < 0) {
                m93433a();
            }
            if (this.f64315c != 0) {
                T t = this.f64314a;
                C13706o.m87927d(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f64315c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15116g(C16254a<? extends T> aVar, C16265l<? super T, ? extends T> lVar) {
        C13706o.m87929f(aVar, "getInitialValue");
        C13706o.m87929f(lVar, "getNextValue");
        this.f64312a = aVar;
        this.f64313b = lVar;
    }

    public Iterator<T> iterator() {
        return new C15117a(this);
    }
}
