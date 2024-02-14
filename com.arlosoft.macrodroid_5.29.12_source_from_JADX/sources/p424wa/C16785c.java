package p424wa;

import kotlin.Metadata;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13695i;
import p326ma.C15711c;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B!\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001a"}, mo71668d2 = {"Lwa/c;", "", "", "Lkotlin/collections/n0;", "i", "", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "first", "I", "d", "()I", "last", "f", "step", "h", "start", "endInclusive", "<init>", "(III)V", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: wa.c */
/* compiled from: Progressions.kt */
public class C16785c implements Iterable<Integer>, C16368a {

    /* renamed from: f */
    public static final C16786a f67760f = new C16786a((C13695i) null);

    /* renamed from: a */
    private final int f67761a;

    /* renamed from: c */
    private final int f67762c;

    /* renamed from: d */
    private final int f67763d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, mo71668d2 = {"Lwa/c$a;", "", "", "rangeStart", "rangeEnd", "step", "Lwa/c;", "a", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: wa.c$a */
    /* compiled from: Progressions.kt */
    public static final class C16786a {
        private C16786a() {
        }

        public /* synthetic */ C16786a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16785c mo79773a(int i, int i2, int i3) {
            return new C16785c(i, i2, i3);
        }
    }

    public C16785c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f67761a = i;
            this.f67762c = C15711c.m94994b(i, i2, i3);
            this.f67763d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: d */
    public final int mo79764d() {
        return this.f67761a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C16785c) {
            if (!isEmpty() || !((C16785c) obj).isEmpty()) {
                C16785c cVar = (C16785c) obj;
                if (!(this.f67761a == cVar.f67761a && this.f67762c == cVar.f67762c && this.f67763d == cVar.f67763d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo79766f() {
        return this.f67762c;
    }

    /* renamed from: h */
    public final int mo79767h() {
        return this.f67763d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f67761a * 31) + this.f67762c) * 31) + this.f67763d;
    }

    /* renamed from: i */
    public C13603n0 iterator() {
        return new C16787d(this.f67761a, this.f67762c, this.f67763d);
    }

    public boolean isEmpty() {
        if (this.f67763d > 0) {
            if (this.f67761a > this.f67762c) {
                return true;
            }
        } else if (this.f67761a < this.f67762c) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f67763d > 0) {
            sb = new StringBuilder();
            sb.append(this.f67761a);
            sb.append("..");
            sb.append(this.f67762c);
            sb.append(" step ");
            i = this.f67763d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f67761a);
            sb.append(" downTo ");
            sb.append(this.f67762c);
            sb.append(" step ");
            i = -this.f67763d;
        }
        sb.append(i);
        return sb.toString();
    }
}
