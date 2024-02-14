package com.google.android.gms.internal.wearable;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzde {
    /* renamed from: a */
    static String m64288a(zzdc zzdc, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m64291d(zzdc, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m64289b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m64289b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m64289b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzec.m64426a(zzaw.m64055t((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzaw) {
                sb.append(": \"");
                sb.append(zzec.m64426a((zzaw) obj));
                sb.append('\"');
            } else if (obj instanceof zzbv) {
                sb.append(" {");
                m64291d((zzbv) obj, sb, i + 2);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m64289b(sb, i4, "key", entry.getKey());
                m64289b(sb, i4, "value", entry.getValue());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static final String m64290c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static void m64291d(zzdc zzdc, StringBuilder sb, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : zzdc.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m64289b(sb, i, m64290c(concat), zzbv.m64196m(method2, zzdc, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m64289b(sb, i, m64290c(concat2), zzbv.m64196m(method3, zzdc, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m = zzbv.m64196m(method4, zzdc, new Object[0]);
                    if (method5 == null) {
                        if (m instanceof Boolean) {
                            if (!((Boolean) m).booleanValue()) {
                            }
                        } else if (m instanceof Integer) {
                            if (((Integer) m).intValue() == 0) {
                            }
                        } else if (m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m).floatValue()) == 0) {
                            }
                        } else if (!(m instanceof Double)) {
                            if (m instanceof String) {
                                z = m.equals("");
                            } else if (m instanceof zzaw) {
                                z = m.equals(zzaw.f45541a);
                            } else if (m instanceof zzdc) {
                                if (m == ((zzdc) m).mo53934G()) {
                                }
                            } else if ((m instanceof Enum) && ((Enum) m).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) m).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzbv.m64196m(method5, zzdc, new Object[0])).booleanValue()) {
                    }
                    m64289b(sb, i, m64290c(concat3), m);
                }
            }
        }
        if (!(zzdc instanceof zzbt)) {
            zzef zzef = ((zzbv) zzdc).zzc;
            if (zzef != null) {
                zzef.mo54055f(sb, i);
                return;
            }
            return;
        }
        zzbt zzbt = (zzbt) zzdc;
        throw null;
    }
}
