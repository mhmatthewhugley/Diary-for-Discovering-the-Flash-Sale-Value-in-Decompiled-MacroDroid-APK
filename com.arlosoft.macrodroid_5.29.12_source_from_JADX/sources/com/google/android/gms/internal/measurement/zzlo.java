package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzlo {

    /* renamed from: a */
    private static final char[] f41670a;

    static {
        char[] cArr = new char[80];
        f41670a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    static String m60611a(zzlm zzlm, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m60614d(zzlm, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static void m60612b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m60612b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m60612b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m60613c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzmm.m60774a(zzje.m60359q((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzje) {
                sb.append(": \"");
                sb.append(zzmm.m60774a((zzje) obj));
                sb.append('\"');
            } else if (obj instanceof zzkf) {
                sb.append(" {");
                m60614d((zzkf) obj, sb, i + 2);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                m60613c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m60612b(sb, i3, "key", entry.getKey());
                m60612b(sb, i3, "value", entry.getValue());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                m60613c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static void m60613c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f41670a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    private static void m60614d(zzlm zzlm, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        zzlm zzlm2 = zzlm;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzlm.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m60612b(sb2, i3, substring.substring(0, substring.length() - 4), zzkf.m60507p(method2, zzlm2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m60612b(sb2, i3, substring.substring(0, substring.length() - 3), zzkf.m60507p(method, zzlm2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object p = zzkf.m60507p(method4, zzlm2, new Object[0]);
                    if (method5 == null) {
                        if (p instanceof Boolean) {
                            if (!((Boolean) p).booleanValue()) {
                            }
                        } else if (p instanceof Integer) {
                            if (((Integer) p).intValue() == 0) {
                            }
                        } else if (p instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) p).floatValue()) == 0) {
                            }
                        } else if (!(p instanceof Double)) {
                            if (p instanceof String) {
                                z = p.equals("");
                            } else if (p instanceof zzje) {
                                z = p.equals(zzje.f41539a);
                            } else if (p instanceof zzlm) {
                                if (p == ((zzlm) p).mo51449e()) {
                                }
                            } else if ((p instanceof Enum) && ((Enum) p).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) p).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzkf.m60507p(method5, zzlm2, new Object[0])).booleanValue()) {
                    }
                    m60612b(sb2, i3, substring, p);
                }
            }
            i2 = 3;
        }
        if (!(zzlm2 instanceof zzkc)) {
            zzmp zzmp = ((zzkf) zzlm2).zzc;
            if (zzmp != null) {
                zzmp.mo51575i(sb2, i3);
                return;
            }
            return;
        }
        zzkc zzkc = (zzkc) zzlm2;
        throw null;
    }
}
