package p297ja;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u0016\u001a\u00028\u0001\u0012\u0006\u0010\u0012\u001a\u00028\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0012\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0019"}, mo71668d2 = {"Lja/r;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "c", "", "hashCode", "", "other", "", "equals", "third", "Ljava/lang/Object;", "d", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ja.r */
/* compiled from: Tuples.kt */
public final class C13336r<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public C13336r(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    /* renamed from: a */
    public final A mo70170a() {
        return this.first;
    }

    /* renamed from: b */
    public final B mo70171b() {
        return this.second;
    }

    /* renamed from: c */
    public final C mo70172c() {
        return this.third;
    }

    /* renamed from: d */
    public final C mo70173d() {
        return this.third;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13336r)) {
            return false;
        }
        C13336r rVar = (C13336r) obj;
        return C13706o.m87924a(this.first, rVar.first) && C13706o.m87924a(this.second, rVar.second) && C13706o.m87924a(this.third, rVar.third);
    }

    public int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.third;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
