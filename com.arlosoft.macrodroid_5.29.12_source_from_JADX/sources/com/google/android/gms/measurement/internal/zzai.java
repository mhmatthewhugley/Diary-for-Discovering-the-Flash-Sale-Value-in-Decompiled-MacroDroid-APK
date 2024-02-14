package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzai {

    /* renamed from: b */
    public static final zzai f46427b = new zzai((Boolean) null, (Boolean) null);

    /* renamed from: a */
    private final EnumMap f46428a;

    public zzai(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f46428a = enumMap;
        enumMap.put(zzah.AD_STORAGE, bool);
        enumMap.put(zzah.ANALYTICS_STORAGE, bool2);
    }

    /* renamed from: a */
    public static zzai m65383a(Bundle bundle) {
        if (bundle == null) {
            return f46427b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            enumMap.put(zzah, m65388n(bundle.getString(zzah.zzd)));
        }
        return new zzai(enumMap);
    }

    /* renamed from: b */
    public static zzai m65384b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i = 0;
            while (true) {
                zzah[] zzahArr = zzah.f46425d;
                int length = zzahArr.length;
                if (i >= 2) {
                    break;
                }
                zzah zzah = zzahArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzah, bool);
                }
                i++;
            }
        }
        return new zzai(enumMap);
    }

    /* renamed from: g */
    public static String m65385g(Bundle bundle) {
        String string;
        for (zzah zzah : zzah.values()) {
            if (bundle.containsKey(zzah.zzd) && (string = bundle.getString(zzah.zzd)) != null && m65388n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m65386j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    static final int m65387m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    private static Boolean m65388n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final zzai mo54943c(zzai zzai) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            Boolean bool = (Boolean) this.f46428a.get(zzah);
            Boolean bool2 = (Boolean) zzai.f46428a.get(zzah);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(zzah, bool);
        }
        return new zzai(enumMap);
    }

    /* renamed from: d */
    public final zzai mo54944d(zzai zzai) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            Boolean bool = (Boolean) this.f46428a.get(zzah);
            if (bool == null) {
                bool = (Boolean) zzai.f46428a.get(zzah);
            }
            enumMap.put(zzah, bool);
        }
        return new zzai(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo54945e() {
        return (Boolean) this.f46428a.get(zzah.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzai = (zzai) obj;
        for (zzah zzah : zzah.values()) {
            if (m65387m((Boolean) this.f46428a.get(zzah)) != m65387m((Boolean) zzai.f46428a.get(zzah))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo54947f() {
        return (Boolean) this.f46428a.get(zzah.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo54948h() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahArr = zzah.f46425d;
        int length = zzahArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f46428a.get(zzahArr[i]);
            if (bool == null) {
                c = '-';
            } else {
                c = bool.booleanValue() ? '1' : '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean m : this.f46428a.values()) {
            i = (i * 31) + m65387m(m);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo54950i(zzah zzah) {
        Boolean bool = (Boolean) this.f46428a.get(zzah);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean mo54951k(zzai zzai) {
        return mo54952l(zzai, (zzah[]) this.f46428a.keySet().toArray(new zzah[0]));
    }

    /* renamed from: l */
    public final boolean mo54952l(zzai zzai, zzah... zzahArr) {
        for (zzah zzah : zzahArr) {
            Boolean bool = (Boolean) this.f46428a.get(zzah);
            Boolean bool2 = (Boolean) zzai.f46428a.get(zzah);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            zzah zzah = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(zzah.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f46428a.get(zzah);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public zzai(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f46428a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
