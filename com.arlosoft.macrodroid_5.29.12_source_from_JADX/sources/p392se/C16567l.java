package p392se;

import java.io.Serializable;
import org.threeten.p356bp.DateTimeException;

/* renamed from: se.l */
/* compiled from: ValueRange */
public final class C16567l implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long maxLargest;
    private final long maxSmallest;
    private final long minLargest;
    private final long minSmallest;

    private C16567l(long j, long j2, long j3, long j4) {
        this.minSmallest = j;
        this.minLargest = j2;
        this.maxSmallest = j3;
        this.maxLargest = j4;
    }

    /* renamed from: i */
    public static C16567l m98757i(long j, long j2) {
        if (j <= j2) {
            return new C16567l(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C16567l m98758j(long j, long j2, long j3) {
        return m98759k(j, j, j2, j3);
    }

    /* renamed from: k */
    public static C16567l m98759k(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j2 <= j4) {
            return new C16567l(j, j2, j3, j4);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    /* renamed from: a */
    public int mo79364a(long j, C16556h hVar) {
        if (mo79371g(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid int value for " + hVar + ": " + j);
    }

    /* renamed from: b */
    public long mo79365b(long j, C16556h hVar) {
        if (mo79372h(j)) {
            return j;
        }
        if (hVar != null) {
            throw new DateTimeException("Invalid value for " + hVar + " (valid values " + this + "): " + j);
        }
        throw new DateTimeException("Invalid value (valid values " + this + "): " + j);
    }

    /* renamed from: c */
    public long mo79366c() {
        return this.maxLargest;
    }

    /* renamed from: d */
    public long mo79367d() {
        return this.minSmallest;
    }

    /* renamed from: e */
    public boolean mo79368e() {
        return this.minSmallest == this.minLargest && this.maxSmallest == this.maxLargest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16567l)) {
            return false;
        }
        C16567l lVar = (C16567l) obj;
        if (this.minSmallest == lVar.minSmallest && this.minLargest == lVar.minLargest && this.maxSmallest == lVar.maxSmallest && this.maxLargest == lVar.maxLargest) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo79370f() {
        return mo79367d() >= -2147483648L && mo79366c() <= 2147483647L;
    }

    /* renamed from: g */
    public boolean mo79371g(long j) {
        return mo79370f() && mo79372h(j);
    }

    /* renamed from: h */
    public boolean mo79372h(long j) {
        return j >= mo79367d() && j <= mo79366c();
    }

    public int hashCode() {
        long j = this.minSmallest;
        long j2 = this.minLargest;
        long j3 = this.maxSmallest;
        long j4 = this.maxLargest;
        long j5 = ((((((j + j2) << ((int) (j2 + 16))) >> ((int) (j3 + 48))) << ((int) (j3 + 32))) >> ((int) (32 + j4))) << ((int) (j4 + 48))) >> 16;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.minSmallest);
        if (this.minSmallest != this.minLargest) {
            sb.append('/');
            sb.append(this.minLargest);
        }
        sb.append(" - ");
        sb.append(this.maxSmallest);
        if (this.maxSmallest != this.maxLargest) {
            sb.append('/');
            sb.append(this.maxLargest);
        }
        return sb.toString();
    }
}
