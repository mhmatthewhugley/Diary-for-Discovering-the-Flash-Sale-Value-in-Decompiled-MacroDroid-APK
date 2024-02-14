package dev.skomlach.biometric.compat.utils.monet.colors;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001e"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/monet/colors/Srgb;", "Ldev/skomlach/biometric/compat/utils/monet/colors/Color;", "r", "", "g", "b", "(III)V", "color", "(I)V", "", "(DDD)V", "getB", "()D", "getG", "getR", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "quantize8", "toLinearSrgb", "Ldev/skomlach/biometric/compat/utils/monet/colors/LinearSrgb;", "toString", "", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: Srgb.kt */
public final class Srgb implements Color {
    public static final Companion Companion = new Companion((C13695i) null);

    /* renamed from: b */
    private final double f58363b;

    /* renamed from: g */
    private final double f58364g;

    /* renamed from: r */
    private final double f58365r;

    @Metadata(mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/monet/colors/Srgb$Companion;", "", "()V", "quantize8", "", "n", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: Srgb.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int quantize8(double d) {
            return C16792h.m99544f(C16518c.m98606a(d * 255.0d), 0, 255);
        }
    }

    public Srgb(double d, double d2, double d3) {
        this.f58365r = d;
        this.f58364g = d2;
        this.f58363b = d3;
    }

    public static /* synthetic */ Srgb copy$default(Srgb srgb, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = srgb.f58365r;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = srgb.f58364g;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = srgb.f58363b;
        }
        return srgb.copy(d4, d5, d3);
    }

    public final double component1() {
        return this.f58365r;
    }

    public final double component2() {
        return this.f58364g;
    }

    public final double component3() {
        return this.f58363b;
    }

    public final Srgb copy(double d, double d2, double d3) {
        return new Srgb(d, d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Srgb)) {
            return false;
        }
        Srgb srgb = (Srgb) obj;
        return C13706o.m87924a(Double.valueOf(this.f58365r), Double.valueOf(srgb.f58365r)) && C13706o.m87924a(Double.valueOf(this.f58364g), Double.valueOf(srgb.f58364g)) && C13706o.m87924a(Double.valueOf(this.f58363b), Double.valueOf(srgb.f58363b));
    }

    public final double getB() {
        return this.f58363b;
    }

    public final double getG() {
        return this.f58364g;
    }

    public final double getR() {
        return this.f58365r;
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.f58365r) * 31) + Double.doubleToLongBits(this.f58364g)) * 31) + Double.doubleToLongBits(this.f58363b);
    }

    public final int quantize8() {
        Companion companion = Companion;
        return Color.rgb(companion.quantize8(this.f58365r), companion.quantize8(this.f58364g), companion.quantize8(this.f58363b));
    }

    public LinearSrgb toLinearSrgb() {
        return LinearSrgb.Companion.toLinearSrgb(this);
    }

    public String toString() {
        double d = this.f58365r;
        double d2 = this.f58364g;
        double d3 = this.f58363b;
        return "Srgb(r=" + d + ", g=" + d2 + ", b=" + d3 + ")";
    }

    public Srgb(int i, int i2, int i3) {
        this(((double) i) / 255.0d, ((double) i2) / 255.0d, ((double) i3) / 255.0d);
    }

    public Srgb(int i) {
        this(Color.red(i), Color.green(i), Color.blue(i));
    }
}
