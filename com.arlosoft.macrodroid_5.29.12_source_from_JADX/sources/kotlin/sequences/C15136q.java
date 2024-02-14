package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo71668d2 = {"Lkotlin/sequences/q;", "T", "Lkotlin/sequences/h;", "Lkotlin/sequences/c;", "", "n", "a", "b", "", "iterator", "Lkotlin/sequences/h;", "sequence", "I", "startIndex", "c", "endIndex", "f", "()I", "count", "<init>", "(Lkotlin/sequences/h;II)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.q */
/* compiled from: Sequences.kt */
public final class C15136q<T> implements C15118h<T>, C15110c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15118h<T> f64328a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f64329b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f64330c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, mo71668d2 = {"kotlin/sequences/q$a", "", "Lja/u;", "a", "", "hasNext", "next", "()Ljava/lang/Object;", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "c", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.q$a */
    /* compiled from: Sequences.kt */
    public static final class C15137a implements Iterator<T>, C16368a {

        /* renamed from: a */
        private final Iterator<T> f64331a;

        /* renamed from: c */
        private int f64332c;

        /* renamed from: d */
        final /* synthetic */ C15136q<T> f64333d;

        C15137a(C15136q<T> qVar) {
            this.f64333d = qVar;
            this.f64331a = qVar.f64328a.iterator();
        }

        /* renamed from: a */
        private final void m93506a() {
            while (this.f64332c < this.f64333d.f64329b && this.f64331a.hasNext()) {
                this.f64331a.next();
                this.f64332c++;
            }
        }

        public boolean hasNext() {
            m93506a();
            return this.f64332c < this.f64333d.f64330c && this.f64331a.hasNext();
        }

        public T next() {
            m93506a();
            if (this.f64332c < this.f64333d.f64330c) {
                this.f64332c++;
                return this.f64331a.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15136q(C15118h<? extends T> hVar, int i, int i2) {
        C13706o.m87929f(hVar, "sequence");
        this.f64328a = hVar;
        this.f64329b = i;
        this.f64330c = i2;
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (!(i2 < i ? false : z)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
    }

    /* renamed from: f */
    private final int m93503f() {
        return this.f64330c - this.f64329b;
    }

    /* renamed from: a */
    public C15118h<T> mo74407a(int i) {
        return i >= m93503f() ? C15125n.m93470e() : new C15136q(this.f64328a, this.f64329b + i, this.f64330c);
    }

    /* renamed from: b */
    public C15118h<T> mo74408b(int i) {
        if (i >= m93503f()) {
            return this;
        }
        C15118h<T> hVar = this.f64328a;
        int i2 = this.f64329b;
        return new C15136q(hVar, i2, i + i2);
    }

    public Iterator<T> iterator() {
        return new C15137a(this);
    }
}
