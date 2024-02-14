package p352oe;

import java.io.Serializable;
import java.util.regex.Pattern;
import p365pe.C16181e;

/* renamed from: oe.l */
/* compiled from: Period */
public final class C15882l extends C16181e implements Serializable {

    /* renamed from: a */
    public static final C15882l f65367a = new C15882l(0, 0, 0);

    /* renamed from: c */
    private static final Pattern f65368c = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private static final long serialVersionUID = -8290556941213247973L;
    private final int days;
    private final int months;
    private final int years;

    private C15882l(int i, int i2, int i3) {
        this.years = i;
        this.months = i2;
        this.days = i3;
    }

    private Object readResolve() {
        return ((this.years | this.months) | this.days) == 0 ? f65367a : this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15882l)) {
            return false;
        }
        C15882l lVar = (C15882l) obj;
        if (this.years == lVar.years && this.months == lVar.months && this.days == lVar.days) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.years + Integer.rotateLeft(this.months, 8) + Integer.rotateLeft(this.days, 16);
    }

    public String toString() {
        if (this == f65367a) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.years;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.months;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.days;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
