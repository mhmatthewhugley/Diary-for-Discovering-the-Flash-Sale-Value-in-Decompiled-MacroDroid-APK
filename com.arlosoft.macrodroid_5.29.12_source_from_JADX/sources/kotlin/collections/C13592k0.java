package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, mo71668d2 = {"Lkotlin/collections/k0;", "T", "", "", "a", "b", "()Ljava/lang/Object;", "", "toString", "hashCode", "other", "", "equals", "I", "c", "()I", "index", "Ljava/lang/Object;", "d", "value", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.k0 */
/* compiled from: IndexedValue.kt */
public final class C13592k0<T> {

    /* renamed from: a */
    private final int f61881a;

    /* renamed from: b */
    private final T f61882b;

    public C13592k0(int i, T t) {
        this.f61881a = i;
        this.f61882b = t;
    }

    /* renamed from: a */
    public final int mo71842a() {
        return this.f61881a;
    }

    /* renamed from: b */
    public final T mo71843b() {
        return this.f61882b;
    }

    /* renamed from: c */
    public final int mo71844c() {
        return this.f61881a;
    }

    /* renamed from: d */
    public final T mo71845d() {
        return this.f61882b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13592k0)) {
            return false;
        }
        C13592k0 k0Var = (C13592k0) obj;
        return this.f61881a == k0Var.f61881a && C13706o.m87924a(this.f61882b, k0Var.f61882b);
    }

    public int hashCode() {
        int i = this.f61881a * 31;
        T t = this.f61882b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f61881a + ", value=" + this.f61882b + ')';
    }
}
