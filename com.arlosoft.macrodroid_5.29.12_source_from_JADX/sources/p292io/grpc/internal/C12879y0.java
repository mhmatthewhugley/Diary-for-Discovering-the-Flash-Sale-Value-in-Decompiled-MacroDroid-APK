package p292io.grpc.internal;

import androidx.core.location.LocationRequestCompat;
import com.google.common.math.LongMath;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.y0 */
/* compiled from: JsonUtil */
public class C12879y0 {

    /* renamed from: a */
    private static final long f60387a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    public static List<Map<String, ?>> m84790a(List<?> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof Map) {
                i++;
            } else {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
        return list;
    }

    /* renamed from: b */
    public static List<String> m84791b(List<?> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof String) {
                i++;
            } else {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
        return list;
    }

    /* renamed from: c */
    private static boolean m84792c(long j, int i) {
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = (long) i;
            if (j2 >= -999999999 && j2 < f60387a) {
                int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i2 < 0 || i < 0) {
                    return i2 <= 0 && i <= 0;
                }
                return true;
            }
        }
    }

    /* renamed from: d */
    public static Boolean m84793d(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", new Object[]{obj, str, map}));
    }

    /* renamed from: e */
    public static List<?> m84794e(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", new Object[]{obj, str, map}));
    }

    /* renamed from: f */
    public static List<Map<String, ?>> m84795f(Map<String, ?> map, String str) {
        List<?> e = m84794e(map, str);
        if (e == null) {
            return null;
        }
        return m84790a(e);
    }

    /* renamed from: g */
    public static List<String> m84796g(Map<String, ?> map, String str) {
        List<?> e = m84794e(map, str);
        if (e == null) {
            return null;
        }
        return m84791b(e);
    }

    /* renamed from: h */
    public static Double m84797h(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Double", new Object[]{obj, str, map}));
    }

    /* renamed from: i */
    public static Integer m84798i(Map<String, ?> map, String str) {
        Double h = m84797h(map, str);
        if (h == null) {
            return null;
        }
        int intValue = h.intValue();
        if (((double) intValue) == h.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        throw new ClassCastException("Number expected to be integer: " + h);
    }

    /* renamed from: j */
    public static Map<String, ?> m84799j(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", new Object[]{obj, str, map}));
    }

    /* renamed from: k */
    public static String m84800k(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", new Object[]{obj, str, map}));
    }

    /* renamed from: l */
    public static Long m84801l(Map<String, ?> map, String str) {
        String k = m84800k(map, str);
        if (k == null) {
            return null;
        }
        try {
            return Long.valueOf(m84803n(k));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private static long m84802m(long j, int i) {
        long j2 = (long) i;
        long j3 = f60387a;
        if (j2 <= (-j3) || j2 >= j3) {
            j = LongMath.m73475a(j, j2 / j3);
            i = (int) (j2 % j3);
        }
        if (j > 0 && i < 0) {
            i = (int) (((long) i) + j3);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (((long) i) - j3);
            j++;
        }
        if (m84792c(j, i)) {
            return m84805p(TimeUnit.SECONDS.toNanos(j), (long) i);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
    }

    /* renamed from: n */
    private static long m84803n(String str) throws ParseException {
        boolean z;
        String str2;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String substring = str.substring(0, str.length() - 1);
        int indexOf = substring.indexOf(46);
        if (indexOf != -1) {
            str2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str2 = "";
        }
        long parseLong = Long.parseLong(substring);
        int o = str2.isEmpty() ? 0 : m84804o(str2);
        if (parseLong >= 0) {
            if (z) {
                parseLong = -parseLong;
                o = -o;
            }
            try {
                return m84802m(parseLong, o);
            } catch (IllegalArgumentException unused) {
                throw new ParseException("Duration value is out of range.", 0);
            }
        } else {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
    }

    /* renamed from: o */
    private static int m84804o(String str) throws ParseException {
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                i += str.charAt(i2) - '0';
            }
        }
        return i;
    }

    /* renamed from: p */
    private static long m84805p(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        return z2 | z ? j3 : ((j3 >>> 63) ^ 1) + LocationRequestCompat.PASSIVE_INTERVAL;
    }
}
