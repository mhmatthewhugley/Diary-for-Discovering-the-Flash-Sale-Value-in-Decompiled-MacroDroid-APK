package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzah implements zzap {

    /* renamed from: a */
    private final Double f41189a;

    public zzah(Double d) {
        if (d == null) {
            this.f41189a = Double.valueOf(Double.NaN);
        } else {
            this.f41189a = d;
        }
    }

    /* renamed from: c */
    public final zzap mo50702c(String str, zzg zzg, List list) {
        if ("toString".equals(str)) {
            return new zzat(mo50707g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo50707g(), str}));
    }

    /* renamed from: d */
    public final zzap mo50703d() {
        return new zzah(this.f41189a);
    }

    /* renamed from: e */
    public final Double mo50704e() {
        return this.f41189a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        return this.f41189a.equals(((zzah) obj).f41189a);
    }

    /* renamed from: f */
    public final Boolean mo50706f() {
        boolean z = false;
        if (!Double.isNaN(this.f41189a.doubleValue()) && this.f41189a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: g */
    public final String mo50707g() {
        int i;
        if (Double.isNaN(this.f41189a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f41189a.doubleValue())) {
            return this.f41189a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f41189a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            i = stripTrailingZeros.precision();
        } else {
            i = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(i - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf(ExifInterface.LONGITUDE_EAST);
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
            return format.replace("E-", "e-").replace(ExifInterface.LONGITUDE_EAST, "e+");
        }
        return stripTrailingZeros.toPlainString();
    }

    public final int hashCode() {
        return this.f41189a.hashCode();
    }

    /* renamed from: j */
    public final Iterator mo50712j() {
        return null;
    }

    public final String toString() {
        return mo50707g();
    }
}
