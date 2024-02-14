package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

public final class JsonPrimitive extends JsonElement {

    /* renamed from: a */
    private final Object f55814a;

    public JsonPrimitive(Boolean bool) {
        this.f55814a = C$Gson$Preconditions.m78400b(bool);
    }

    /* renamed from: t */
    private static boolean m78378t(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f55814a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo64013c() {
        if (mo64045s()) {
            return ((Boolean) this.f55814a).booleanValue();
        }
        return Boolean.parseBoolean(mo64019k());
    }

    /* renamed from: d */
    public int mo64014d() {
        return mo64046u() ? mo64044q().intValue() : Integer.parseInt(mo64019k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.f55814a == null) {
            if (jsonPrimitive.f55814a == null) {
                return true;
            }
            return false;
        } else if (!m78378t(this) || !m78378t(jsonPrimitive)) {
            Object obj2 = this.f55814a;
            if (!(obj2 instanceof Number) || !(jsonPrimitive.f55814a instanceof Number)) {
                return obj2.equals(jsonPrimitive.f55814a);
            }
            double doubleValue = mo64044q().doubleValue();
            double doubleValue2 = jsonPrimitive.mo64044q().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (mo64044q().longValue() == jsonPrimitive.mo64044q().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f55814a == null) {
            return 31;
        }
        if (m78378t(this)) {
            doubleToLongBits = mo64044q().longValue();
        } else {
            Object obj = this.f55814a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo64044q().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: j */
    public long mo64018j() {
        return mo64046u() ? mo64044q().longValue() : Long.parseLong(mo64019k());
    }

    /* renamed from: k */
    public String mo64019k() {
        if (mo64046u()) {
            return mo64044q().toString();
        }
        if (mo64045s()) {
            return ((Boolean) this.f55814a).toString();
        }
        return (String) this.f55814a;
    }

    /* renamed from: p */
    public double mo64043p() {
        return mo64046u() ? mo64044q().doubleValue() : Double.parseDouble(mo64019k());
    }

    /* renamed from: q */
    public Number mo64044q() {
        Object obj = this.f55814a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    /* renamed from: s */
    public boolean mo64045s() {
        return this.f55814a instanceof Boolean;
    }

    /* renamed from: u */
    public boolean mo64046u() {
        return this.f55814a instanceof Number;
    }

    /* renamed from: w */
    public boolean mo64047w() {
        return this.f55814a instanceof String;
    }

    public JsonPrimitive(Number number) {
        this.f55814a = C$Gson$Preconditions.m78400b(number);
    }

    public JsonPrimitive(String str) {
        this.f55814a = C$Gson$Preconditions.m78400b(str);
    }
}
