package p245de;

import java.util.Iterator;
import java.util.Map;

/* renamed from: de.e */
/* compiled from: ValuePrinter */
public class C12019e {
    /* renamed from: a */
    private static String m82469a(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    /* renamed from: b */
    public static String m82470b(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return '\"' + obj.toString() + '\"';
        } else if (obj instanceof Character) {
            return m82471c(((Character) obj).charValue());
        } else {
            if (obj instanceof Long) {
                return obj + "L";
            } else if (obj instanceof Double) {
                return obj + "d";
            } else if (obj instanceof Float) {
                return obj + "f";
            } else if (obj instanceof Short) {
                return "(short) " + obj;
            } else if (obj instanceof Byte) {
                return String.format("(byte) 0x%02X", new Object[]{(Byte) obj});
            } else if (obj instanceof Map) {
                return m82472d((Map) obj);
            } else {
                if (obj.getClass().isArray()) {
                    return m82473e("[", ", ", "]", new C12015a(obj));
                }
                if (obj instanceof C12016b) {
                    return ((C12016b) obj).mo67468a();
                }
                return m82469a(obj);
            }
        }
    }

    /* renamed from: c */
    private static String m82471c(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        if (c == 9) {
            sb.append("\\t");
        } else if (c == 10) {
            sb.append("\\n");
        } else if (c == 13) {
            sb.append("\\r");
        } else if (c != '\"') {
            sb.append(c);
        } else {
            sb.append("\\\"");
        }
        sb.append('\'');
        return sb.toString();
    }

    /* renamed from: d */
    private static String m82472d(Map<?, ?> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            sb.append(m82470b(next.getKey()));
            sb.append(" = ");
            sb.append(m82470b(next.getValue()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        return "{" + sb.toString() + "}";
    }

    /* renamed from: e */
    public static String m82473e(String str, String str2, String str3, Iterator<?> it) {
        if (str == null) {
            str = "(";
        }
        if (str2 == null) {
            str2 = ",";
        }
        if (str3 == null) {
            str3 = ")";
        }
        StringBuilder sb = new StringBuilder(str);
        while (it.hasNext()) {
            sb.append(m82470b(it.next()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        sb.append(str3);
        return sb.toString();
    }
}
