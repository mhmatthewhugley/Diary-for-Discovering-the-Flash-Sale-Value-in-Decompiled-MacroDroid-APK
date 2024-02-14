package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsq {
    /* renamed from: a */
    static String m53111a(zzgso zzgso, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m53114d(zzgso, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m53112b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m53112b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m53112b(sb, i, str, b2);
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
                sb.append(zzgtw.m53335a(zzgpw.m52566V((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzgpw) {
                sb.append(": \"");
                sb.append(zzgtw.m53335a((zzgpw) obj));
                sb.append('\"');
            } else if (obj instanceof zzgre) {
                sb.append(" {");
                m53114d((zzgre) obj, sb, i + 2);
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
                m53112b(sb, i4, "key", entry.getKey());
                m53112b(sb, i4, "value", entry.getValue());
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
    private static final String m53113c(String str) {
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
    private static void m53114d(zzgso zzgso, StringBuilder sb, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : zzgso.getClass().getDeclaredMethods()) {
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
                    m53112b(sb, i, m53113c(concat), zzgre.m52997x(method2, zzgso, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m53112b(sb, i, m53113c(concat2), zzgre.m52997x(method3, zzgso, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object x = zzgre.m52997x(method4, zzgso, new Object[0]);
                    if (method5 == null) {
                        if (x instanceof Boolean) {
                            if (!((Boolean) x).booleanValue()) {
                            }
                        } else if (x instanceof Integer) {
                            if (((Integer) x).intValue() == 0) {
                            }
                        } else if (x instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) x).floatValue()) == 0) {
                            }
                        } else if (!(x instanceof Double)) {
                            if (x instanceof String) {
                                z = x.equals("");
                            } else if (x instanceof zzgpw) {
                                z = x.equals(zzgpw.f37012a);
                            } else if (x instanceof zzgso) {
                                if (x == ((zzgso) x).mo47337b()) {
                                }
                            } else if ((x instanceof Enum) && ((Enum) x).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) x).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzgre.m52997x(method5, zzgso, new Object[0])).booleanValue()) {
                    }
                    m53112b(sb, i, m53113c(concat3), x);
                }
            }
        }
        if (!(zzgso instanceof zzgrb)) {
            zzgtz zzgtz = ((zzgre) zzgso).zzc;
            if (zzgtz != null) {
                zzgtz.mo47493g(sb, i);
                return;
            }
            return;
        }
        zzgrb zzgrb = (zzgrb) zzgso;
        throw null;
    }
}
