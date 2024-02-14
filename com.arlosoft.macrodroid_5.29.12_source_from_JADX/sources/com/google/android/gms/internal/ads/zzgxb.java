package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxb {

    /* renamed from: j */
    public static final zzgxb f37397j = new zzgxb(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    public static final zzgxb f37398k = new zzgxb(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    public static final zzgxb f37399l = new zzgxb(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    public static final zzgxb f37400m = new zzgxb(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    public final double f37401a;

    /* renamed from: b */
    public final double f37402b;

    /* renamed from: c */
    public final double f37403c;

    /* renamed from: d */
    public final double f37404d;

    /* renamed from: e */
    public final double f37405e;

    /* renamed from: f */
    public final double f37406f;

    /* renamed from: g */
    public final double f37407g;

    /* renamed from: h */
    public final double f37408h;

    /* renamed from: i */
    public final double f37409i;

    public zzgxb(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f37401a = d5;
        this.f37402b = d6;
        this.f37403c = d7;
        this.f37404d = d;
        this.f37405e = d2;
        this.f37406f = d3;
        this.f37407g = d4;
        this.f37408h = d8;
        this.f37409i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzgxb.class != obj.getClass()) {
            return false;
        }
        zzgxb zzgxb = (zzgxb) obj;
        return Double.compare(zzgxb.f37404d, this.f37404d) == 0 && Double.compare(zzgxb.f37405e, this.f37405e) == 0 && Double.compare(zzgxb.f37406f, this.f37406f) == 0 && Double.compare(zzgxb.f37407g, this.f37407g) == 0 && Double.compare(zzgxb.f37408h, this.f37408h) == 0 && Double.compare(zzgxb.f37409i, this.f37409i) == 0 && Double.compare(zzgxb.f37401a, this.f37401a) == 0 && Double.compare(zzgxb.f37402b, this.f37402b) == 0 && Double.compare(zzgxb.f37403c, this.f37403c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f37401a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f37402b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f37403c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f37404d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f37405e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f37406f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f37407g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f37408h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f37409i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f37397j)) {
            return "Rotate 0°";
        }
        if (equals(f37398k)) {
            return "Rotate 90°";
        }
        if (equals(f37399l)) {
            return "Rotate 180°";
        }
        if (equals(f37400m)) {
            return "Rotate 270°";
        }
        double d = this.f37401a;
        double d2 = this.f37402b;
        double d3 = this.f37403c;
        double d4 = this.f37404d;
        double d5 = this.f37405e;
        double d6 = this.f37406f;
        double d7 = this.f37407g;
        double d8 = this.f37408h;
        double d9 = this.f37409i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
