package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Lkotlin/sequences/b;", "T", "Lkotlin/sequences/h;", "Lkotlin/sequences/c;", "", "n", "a", "b", "", "iterator", "Lkotlin/sequences/h;", "sequence", "I", "count", "<init>", "(Lkotlin/sequences/h;I)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.sequences.b */
/* compiled from: Sequences.kt */
public final class C15108b<T> implements C15118h<T>, C15110c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15118h<T> f64294a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f64295b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, mo71668d2 = {"kotlin/sequences/b$a", "", "Lja/u;", "a", "next", "()Ljava/lang/Object;", "", "hasNext", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "c", "I", "getLeft", "()I", "setLeft", "(I)V", "left", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.b$a */
    /* compiled from: Sequences.kt */
    public static final class C15109a implements Iterator<T>, C16368a {

        /* renamed from: a */
        private final Iterator<T> f64296a;

        /* renamed from: c */
        private int f64297c;

        C15109a(C15108b<T> bVar) {
            this.f64296a = bVar.f64294a.iterator();
            this.f64297c = bVar.f64295b;
        }

        /* renamed from: a */
        private final void m93416a() {
            while (this.f64297c > 0 && this.f64296a.hasNext()) {
                this.f64296a.next();
                this.f64297c--;
            }
        }

        public boolean hasNext() {
            m93416a();
            return this.f64296a.hasNext();
        }

        public T next() {
            m93416a();
            return this.f64296a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15108b(C15118h<? extends T> hVar, int i) {
        C13706o.m87929f(hVar, "sequence");
        this.f64294a = hVar;
        this.f64295b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + FilenameUtils.EXTENSION_SEPARATOR).toString());
        }
    }

    /* renamed from: a */
    public C15118h<T> mo74407a(int i) {
        int i2 = this.f64295b + i;
        return i2 < 0 ? new C15108b(this, i) : new C15108b(this.f64294a, i2);
    }

    /* renamed from: b */
    public C15118h<T> mo74408b(int i) {
        int i2 = this.f64295b;
        int i3 = i2 + i;
        return i3 < 0 ? new C15138r(this, i) : new C15136q(this.f64294a, i2, i3);
    }

    public Iterator<T> iterator() {
        return new C15109a(this);
    }
}
