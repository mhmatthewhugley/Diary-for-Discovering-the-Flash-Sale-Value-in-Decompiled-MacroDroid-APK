package dev.skomlach.biometric.compat.utils.monet.colors;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0000H\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/monet/colors/LinearSrgb;", "Ldev/skomlach/biometric/compat/utils/monet/colors/Color;", "r", "", "g", "b", "(DDD)V", "getB", "()D", "getG", "getR", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toLinearSrgb", "toSrgb", "Ldev/skomlach/biometric/compat/utils/monet/colors/Srgb;", "toString", "", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: LinearSrgb.kt */
public final class LinearSrgb implements Color {
    public static final Companion Companion = new Companion((C13695i) null);

    /* renamed from: b */
    private final double f58360b;

    /* renamed from: g */
    private final double f58361g;

    /* renamed from: r */
    private final double f58362r;

    @Metadata(mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\u0007\u001a\u00020\b*\u00020\t¨\u0006\n"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/monet/colors/LinearSrgb$Companion;", "", "()V", "f", "", "x", "fInv", "toLinearSrgb", "Ldev/skomlach/biometric/compat/utils/monet/colors/LinearSrgb;", "Ldev/skomlach/biometric/compat/utils/monet/colors/Srgb;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: LinearSrgb.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final double m82558f(double d) {
            return d >= 0.0031308d ? (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d : d * 12.92d;
        }

        private final double fInv(double d) {
            return d >= 0.04045d ? Math.pow((d + 0.055d) / 1.055d, 2.4d) : d / 12.92d;
        }

        public final LinearSrgb toLinearSrgb(Srgb srgb) {
            C13706o.m87929f(srgb, "<this>");
            return new LinearSrgb(fInv(srgb.getR()), fInv(srgb.getG()), fInv(srgb.getB()));
        }
    }

    public LinearSrgb(double d, double d2, double d3) {
        this.f58362r = d;
        this.f58361g = d2;
        this.f58360b = d3;
    }

    public static /* synthetic */ LinearSrgb copy$default(LinearSrgb linearSrgb, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = linearSrgb.f58362r;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = linearSrgb.f58361g;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = linearSrgb.f58360b;
        }
        return linearSrgb.copy(d4, d5, d3);
    }

    public final double component1() {
        return this.f58362r;
    }

    public final double component2() {
        return this.f58361g;
    }

    public final double component3() {
        return this.f58360b;
    }

    public final LinearSrgb copy(double d, double d2, double d3) {
        return new LinearSrgb(d, d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearSrgb)) {
            return false;
        }
        LinearSrgb linearSrgb = (LinearSrgb) obj;
        return C13706o.m87924a(Double.valueOf(this.f58362r), Double.valueOf(linearSrgb.f58362r)) && C13706o.m87924a(Double.valueOf(this.f58361g), Double.valueOf(linearSrgb.f58361g)) && C13706o.m87924a(Double.valueOf(this.f58360b), Double.valueOf(linearSrgb.f58360b));
    }

    public final double getB() {
        return this.f58360b;
    }

    public final double getG() {
        return this.f58361g;
    }

    public final double getR() {
        return this.f58362r;
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.f58362r) * 31) + Double.doubleToLongBits(this.f58361g)) * 31) + Double.doubleToLongBits(this.f58360b);
    }

    public LinearSrgb toLinearSrgb() {
        return this;
    }

    public final Srgb toSrgb() {
        Companion companion = Companion;
        return new Srgb(companion.m82558f(this.f58362r), companion.m82558f(this.f58361g), companion.m82558f(this.f58360b));
    }

    public String toString() {
        double d = this.f58362r;
        double d2 = this.f58361g;
        double d3 = this.f58360b;
        return "LinearSrgb(r=" + d + ", g=" + d2 + ", b=" + d3 + ")";
    }
}
