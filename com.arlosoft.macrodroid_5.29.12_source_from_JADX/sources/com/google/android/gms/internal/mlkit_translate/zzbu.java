package com.google.android.gms.internal.mlkit_translate;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzbu extends zzbo {

    /* renamed from: a */
    private final Object f43164a;

    public zzbu(Boolean bool) {
        this.f43164a = bool;
    }

    public zzbu(Number number) {
        this.f43164a = number;
    }

    public zzbu(String str) {
        Objects.requireNonNull(str);
        this.f43164a = str;
    }

    /* renamed from: l */
    private static boolean m61651l(zzbu zzbu) {
        Object obj = zzbu.f43164a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final long mo52113d() {
        return this.f43164a instanceof Number ? mo52115f().longValue() : Long.parseLong(mo52116h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbu.class != obj.getClass()) {
            return false;
        }
        zzbu zzbu = (zzbu) obj;
        if (m61651l(this) && m61651l(zzbu)) {
            return mo52115f().longValue() == zzbu.mo52115f().longValue();
        }
        Object obj2 = this.f43164a;
        if (!(obj2 instanceof Number) || !(zzbu.f43164a instanceof Number)) {
            return obj2.equals(zzbu.f43164a);
        }
        double doubleValue = mo52115f().doubleValue();
        double doubleValue2 = zzbu.mo52115f().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    /* renamed from: f */
    public final Number mo52115f() {
        Object obj = this.f43164a;
        return obj instanceof String ? new zzca((String) obj) : (Number) obj;
    }

    /* renamed from: h */
    public final String mo52116h() {
        Object obj = this.f43164a;
        if (obj instanceof Number) {
            return mo52115f().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (m61651l(this)) {
            doubleToLongBits = mo52115f().longValue();
        } else {
            Object obj = this.f43164a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo52115f().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: i */
    public final boolean mo52118i() {
        Object obj = this.f43164a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(mo52116h());
    }

    /* renamed from: j */
    public final boolean mo52119j() {
        return this.f43164a instanceof Boolean;
    }

    /* renamed from: k */
    public final boolean mo52120k() {
        return this.f43164a instanceof Number;
    }
}
