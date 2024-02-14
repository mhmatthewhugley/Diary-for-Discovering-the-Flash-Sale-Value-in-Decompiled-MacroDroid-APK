package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Lkotlin/sequences/r;", "T", "Lkotlin/sequences/h;", "Lkotlin/sequences/c;", "", "n", "a", "b", "", "iterator", "Lkotlin/sequences/h;", "sequence", "I", "count", "<init>", "(Lkotlin/sequences/h;I)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.r */
/* compiled from: Sequences.kt */
public final class C15138r<T> implements C15118h<T>, C15110c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15118h<T> f64334a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f64335b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, mo71668d2 = {"kotlin/sequences/r$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "", "a", "I", "getLeft", "()I", "setLeft", "(I)V", "left", "c", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.r$a */
    /* compiled from: Sequences.kt */
    public static final class C15139a implements Iterator<T>, C16368a {

        /* renamed from: a */
        private int f64336a;

        /* renamed from: c */
        private final Iterator<T> f64337c;

        C15139a(C15138r<T> rVar) {
            this.f64336a = rVar.f64335b;
            this.f64337c = rVar.f64334a.iterator();
        }

        public boolean hasNext() {
            return this.f64336a > 0 && this.f64337c.hasNext();
        }

        public T next() {
            int i = this.f64336a;
            if (i != 0) {
                this.f64336a = i - 1;
                return this.f64337c.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15138r(C15118h<? extends T> hVar, int i) {
        C13706o.m87929f(hVar, "sequence");
        this.f64334a = hVar;
        this.f64335b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + FilenameUtils.EXTENSION_SEPARATOR).toString());
        }
    }

    /* renamed from: a */
    public C15118h<T> mo74407a(int i) {
        int i2 = this.f64335b;
        return i >= i2 ? C15125n.m93470e() : new C15136q(this.f64334a, i, i2);
    }

    /* renamed from: b */
    public C15118h<T> mo74408b(int i) {
        return i >= this.f64335b ? this : new C15138r(this.f64334a, i);
    }

    public Iterator<T> iterator() {
        return new C15139a(this);
    }
}
