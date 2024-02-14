package p424wa;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p424wa.C16785c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0004\u001a\u0012\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\n\u001a\u0012\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000\u001a\u0012\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001a\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000\u001a1\u0010\u0014\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0010*\u00028\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0018\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016¨\u0006\u0018"}, mo71668d2 = {"", "to", "Lwa/c;", "i", "step", "j", "Lwa/e;", "k", "minimumValue", "b", "", "c", "maximumValue", "d", "e", "f", "", "T", "Lwa/a;", "range", "h", "(Ljava/lang/Comparable;Lwa/a;)Ljava/lang/Comparable;", "Lwa/b;", "g", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/ranges/RangesKt")
/* renamed from: wa.h */
/* compiled from: _Ranges.kt */
class C16792h extends C16791g {
    /* renamed from: b */
    public static int m99540b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: c */
    public static long m99541c(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: d */
    public static int m99542d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: e */
    public static long m99543e(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: f */
    public static int m99544f(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    /* renamed from: g */
    public static int m99545g(int i, C16783b<Integer> bVar) {
        C13706o.m87929f(bVar, "range");
        if (bVar instanceof C16782a) {
            return ((Number) m99546h(Integer.valueOf(i), (C16782a) bVar)).intValue();
        }
        if (bVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVar + FilenameUtils.EXTENSION_SEPARATOR);
        } else if (i < bVar.getStart().intValue()) {
            return bVar.getStart().intValue();
        } else {
            return i > bVar.getEndInclusive().intValue() ? bVar.getEndInclusive().intValue() : i;
        }
    }

    /* renamed from: h */
    public static final <T extends Comparable<? super T>> T m99546h(T t, C16782a<T> aVar) {
        C13706o.m87929f(t, "<this>");
        C13706o.m87929f(aVar, "range");
        if (aVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + FilenameUtils.EXTENSION_SEPARATOR);
        } else if (!aVar.mo79763c(t, aVar.getStart()) || aVar.mo79763c(aVar.getStart(), t)) {
            return (!aVar.mo79763c(aVar.getEndInclusive(), t) || aVar.mo79763c(t, aVar.getEndInclusive())) ? t : aVar.getEndInclusive();
        } else {
            return aVar.getStart();
        }
    }

    /* renamed from: i */
    public static C16785c m99547i(int i, int i2) {
        return C16785c.f67760f.mo79773a(i, i2, -1);
    }

    /* renamed from: j */
    public static C16785c m99548j(C16785c cVar, int i) {
        C13706o.m87929f(cVar, "<this>");
        C16791g.m99539a(i > 0, Integer.valueOf(i));
        C16785c.C16786a aVar = C16785c.f67760f;
        int d = cVar.mo79764d();
        int f = cVar.mo79766f();
        if (cVar.mo79767h() <= 0) {
            i = -i;
        }
        return aVar.mo79773a(d, f, i);
    }

    /* renamed from: k */
    public static C16788e m99549k(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C16788e.f67768g.mo79778a();
        }
        return new C16788e(i, i2 - 1);
    }
}
