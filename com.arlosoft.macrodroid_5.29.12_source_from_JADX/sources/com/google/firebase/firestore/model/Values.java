package com.google.firebase.firestore.model;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import com.google.firestore.p228v1.ArrayValue;
import com.google.firestore.p228v1.ArrayValueOrBuilder;
import com.google.firestore.p228v1.MapValue;
import com.google.firestore.p228v1.Value;
import com.google.protobuf.NullValue;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Values {

    /* renamed from: a */
    public static final Value f54470a = ((Value) Value.m78180r0().mo63931S(Double.NaN).build());

    /* renamed from: b */
    public static final Value f54471b = ((Value) Value.m78180r0().mo63936Y(NullValue.NULL_VALUE).build());

    /* renamed from: com.google.firebase.firestore.model.Values$1 */
    static /* synthetic */ class C112271 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54472a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firestore.v1.Value$ValueTypeCase[] r0 = com.google.firestore.p228v1.Value.ValueTypeCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54472a = r0
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.NULL_VALUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.BOOLEAN_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.INTEGER_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.DOUBLE_VALUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.TIMESTAMP_VALUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.STRING_VALUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.BYTES_VALUE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.REFERENCE_VALUE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.GEO_POINT_VALUE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.ARRAY_VALUE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f54472a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.firestore.v1.Value$ValueTypeCase r1 = com.google.firestore.p228v1.Value.ValueTypeCase.MAP_VALUE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.model.Values.C112271.<clinit>():void");
        }
    }

    /* renamed from: A */
    private static boolean m75912A(Value value, Value value2) {
        MapValue m0 = value.mo63922m0();
        MapValue m02 = value2.mo63922m0();
        if (m0.mo63831W() != m02.mo63831W()) {
            return false;
        }
        for (Map.Entry next : m0.mo63832X().entrySet()) {
            if (!m75930q((Value) next.getValue(), m02.mo63832X().get(next.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public static int m75913B(Value value) {
        switch (C112271.f54472a[value.mo63926q0().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return ServerTimestamps.m75908b(value) ? 4 : 10;
            default:
                throw Assert.m76440a("Invalid value type: " + value.mo63926q0(), new Object[0]);
        }
    }

    /* renamed from: a */
    private static boolean m75914a(Value value, Value value2) {
        ArrayValue f0 = value.mo63916f0();
        ArrayValue f02 = value2.mo63916f0();
        if (f0.mo63761c0() != f02.mo63761c0()) {
            return false;
        }
        for (int i = 0; i < f0.mo63761c0(); i++) {
            if (!m75930q(f0.mo63760b0(i), f02.mo63760b0(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m75915b(Value value) {
        StringBuilder sb = new StringBuilder();
        m75921h(sb, value);
        return sb.toString();
    }

    /* renamed from: c */
    private static void m75916c(StringBuilder sb, ArrayValue arrayValue) {
        sb.append("[");
        for (int i = 0; i < arrayValue.mo63761c0(); i++) {
            m75921h(sb, arrayValue.mo63760b0(i));
            if (i != arrayValue.mo63761c0() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    /* renamed from: d */
    private static void m75917d(StringBuilder sb, LatLng latLng) {
        sb.append(String.format("geo(%s,%s)", new Object[]{Double.valueOf(latLng.mo65557X()), Double.valueOf(latLng.mo65558Y())}));
    }

    /* renamed from: e */
    private static void m75918e(StringBuilder sb, MapValue mapValue) {
        ArrayList<String> arrayList = new ArrayList<>(mapValue.mo63832X().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z = true;
        for (String str : arrayList) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            sb.append(str);
            sb.append(":");
            m75921h(sb, mapValue.mo63834Z(str));
        }
        sb.append("}");
    }

    /* renamed from: f */
    private static void m75919f(StringBuilder sb, Value value) {
        Assert.m76443d(m75938y(value), "Value should be a ReferenceValue", new Object[0]);
        sb.append(DocumentKey.m75848g(value.mo63923n0()));
    }

    /* renamed from: g */
    private static void m75920g(StringBuilder sb, Timestamp timestamp) {
        sb.append(String.format("time(%s,%s)", new Object[]{Long.valueOf(timestamp.mo65438Y()), Integer.valueOf(timestamp.mo65437X())}));
    }

    /* renamed from: h */
    private static void m75921h(StringBuilder sb, Value value) {
        switch (C112271.f54472a[value.mo63926q0().ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(value.mo63917g0());
                return;
            case 3:
                sb.append(value.mo63921l0());
                return;
            case 4:
                sb.append(value.mo63919j0());
                return;
            case 5:
                m75920g(sb, value.mo63925p0());
                return;
            case 6:
                sb.append(value.mo63924o0());
                return;
            case 7:
                sb.append(Util.m76530m(value.mo63918h0()));
                return;
            case 8:
                m75919f(sb, value);
                return;
            case 9:
                m75917d(sb, value.mo63920k0());
                return;
            case 10:
                m75916c(sb, value.mo63916f0());
                return;
            case 11:
                m75918e(sb, value.mo63922m0());
                return;
            default:
                throw Assert.m76440a("Invalid value type: " + value.mo63926q0(), new Object[0]);
        }
    }

    /* renamed from: i */
    public static int m75922i(Value value, Value value2) {
        int B = m75913B(value);
        int B2 = m75913B(value2);
        if (B != B2) {
            return Util.m76522e(B, B2);
        }
        switch (B) {
            case 0:
                return 0;
            case 1:
                return Util.m76519b(value.mo63917g0(), value2.mo63917g0());
            case 2:
                return m75926m(value, value2);
            case 3:
                return m75928o(value.mo63925p0(), value2.mo63925p0());
            case 4:
                return m75928o(ServerTimestamps.m75907a(value), ServerTimestamps.m75907a(value2));
            case 5:
                return value.mo63924o0().compareTo(value2.mo63924o0());
            case 6:
                return Util.m76520c(value.mo63918h0(), value2.mo63918h0());
            case 7:
                return m75927n(value.mo63923n0(), value2.mo63923n0());
            case 8:
                return m75924k(value.mo63920k0(), value2.mo63920k0());
            case 9:
                return m75923j(value.mo63916f0(), value2.mo63916f0());
            case 10:
                return m75925l(value.mo63922m0(), value2.mo63922m0());
            default:
                throw Assert.m76440a("Invalid value type: " + B, new Object[0]);
        }
    }

    /* renamed from: j */
    private static int m75923j(ArrayValue arrayValue, ArrayValue arrayValue2) {
        int min = Math.min(arrayValue.mo63761c0(), arrayValue2.mo63761c0());
        for (int i = 0; i < min; i++) {
            int i2 = m75922i(arrayValue.mo63760b0(i), arrayValue2.mo63760b0(i));
            if (i2 != 0) {
                return i2;
            }
        }
        return Util.m76522e(arrayValue.mo63761c0(), arrayValue2.mo63761c0());
    }

    /* renamed from: k */
    private static int m75924k(LatLng latLng, LatLng latLng2) {
        int d = Util.m76521d(latLng.mo65557X(), latLng2.mo65557X());
        return d == 0 ? Util.m76521d(latLng.mo65558Y(), latLng2.mo65558Y()) : d;
    }

    /* renamed from: l */
    private static int m75925l(MapValue mapValue, MapValue mapValue2) {
        Iterator it = new TreeMap(mapValue.mo63832X()).entrySet().iterator();
        Iterator it2 = new TreeMap(mapValue2.mo63832X()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
            if (compareTo != 0) {
                return compareTo;
            }
            int i = m75922i((Value) entry.getValue(), (Value) entry2.getValue());
            if (i != 0) {
                return i;
            }
        }
        return Util.m76519b(it.hasNext(), it2.hasNext());
    }

    /* renamed from: m */
    private static int m75926m(Value value, Value value2) {
        Value.ValueTypeCase q0 = value.mo63926q0();
        Value.ValueTypeCase valueTypeCase = Value.ValueTypeCase.DOUBLE_VALUE;
        if (q0 == valueTypeCase) {
            double j0 = value.mo63919j0();
            if (value2.mo63926q0() == valueTypeCase) {
                return Util.m76521d(j0, value2.mo63919j0());
            }
            if (value2.mo63926q0() == Value.ValueTypeCase.INTEGER_VALUE) {
                return Util.m76524g(j0, value2.mo63921l0());
            }
        } else {
            Value.ValueTypeCase q02 = value.mo63926q0();
            Value.ValueTypeCase valueTypeCase2 = Value.ValueTypeCase.INTEGER_VALUE;
            if (q02 == valueTypeCase2) {
                long l0 = value.mo63921l0();
                if (value2.mo63926q0() == valueTypeCase2) {
                    return Util.m76523f(l0, value2.mo63921l0());
                }
                if (value2.mo63926q0() == valueTypeCase) {
                    return Util.m76524g(value2.mo63919j0(), l0) * -1;
                }
            }
        }
        throw Assert.m76440a("Unexpected values: %s vs %s", value, value2);
    }

    /* renamed from: n */
    private static int m75927n(String str, String str2) {
        String[] split = str.split("/", -1);
        String[] split2 = str2.split("/", -1);
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            int compareTo = split[i].compareTo(split2[i]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Util.m76522e(split.length, split2.length);
    }

    /* renamed from: o */
    private static int m75928o(Timestamp timestamp, Timestamp timestamp2) {
        int f = Util.m76523f(timestamp.mo65438Y(), timestamp2.mo65438Y());
        if (f != 0) {
            return f;
        }
        return Util.m76522e(timestamp.mo65437X(), timestamp2.mo65437X());
    }

    /* renamed from: p */
    public static boolean m75929p(ArrayValueOrBuilder arrayValueOrBuilder, Value value) {
        for (Value q : arrayValueOrBuilder.mo63762l()) {
            if (m75930q(q, value)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m75930q(Value value, Value value2) {
        int B;
        if (value == null && value2 == null) {
            return true;
        }
        if (value == null || value2 == null || (B = m75913B(value)) != m75913B(value2)) {
            return false;
        }
        if (B == 2) {
            return m75939z(value, value2);
        }
        if (B == 4) {
            return ServerTimestamps.m75907a(value).equals(ServerTimestamps.m75907a(value2));
        }
        if (B == 9) {
            return m75914a(value, value2);
        }
        if (B != 10) {
            return value.equals(value2);
        }
        return m75912A(value, value2);
    }

    /* renamed from: r */
    public static boolean m75931r(@Nullable Value value) {
        return value != null && value.mo63926q0() == Value.ValueTypeCase.ARRAY_VALUE;
    }

    /* renamed from: s */
    public static boolean m75932s(@Nullable Value value) {
        return value != null && value.mo63926q0() == Value.ValueTypeCase.DOUBLE_VALUE;
    }

    /* renamed from: t */
    public static boolean m75933t(@Nullable Value value) {
        return value != null && value.mo63926q0() == Value.ValueTypeCase.INTEGER_VALUE;
    }

    /* renamed from: u */
    public static boolean m75934u(@Nullable Value value) {
        return value != null && value.mo63926q0() == Value.ValueTypeCase.MAP_VALUE;
    }

    /* renamed from: v */
    public static boolean m75935v(@Nullable Value value) {
        return value != null && Double.isNaN(value.mo63919j0());
    }

    /* renamed from: w */
    public static boolean m75936w(@Nullable Value value) {
        return value != null && value.mo63926q0() == Value.ValueTypeCase.NULL_VALUE;
    }

    /* renamed from: x */
    public static boolean m75937x(@Nullable Value value) {
        return m75933t(value) || m75932s(value);
    }

    /* renamed from: y */
    public static boolean m75938y(@Nullable Value value) {
        return value != null && value.mo63926q0() == Value.ValueTypeCase.REFERENCE_VALUE;
    }

    /* renamed from: z */
    private static boolean m75939z(Value value, Value value2) {
        Value.ValueTypeCase q0 = value.mo63926q0();
        Value.ValueTypeCase valueTypeCase = Value.ValueTypeCase.INTEGER_VALUE;
        if (q0 != valueTypeCase || value2.mo63926q0() != valueTypeCase) {
            Value.ValueTypeCase q02 = value.mo63926q0();
            Value.ValueTypeCase valueTypeCase2 = Value.ValueTypeCase.DOUBLE_VALUE;
            if (q02 == valueTypeCase2 && value2.mo63926q0() == valueTypeCase2 && Double.doubleToLongBits(value.mo63919j0()) == Double.doubleToLongBits(value2.mo63919j0())) {
                return true;
            }
            return false;
        } else if (value.mo63921l0() == value2.mo63921l0()) {
            return true;
        } else {
            return false;
        }
    }
}
