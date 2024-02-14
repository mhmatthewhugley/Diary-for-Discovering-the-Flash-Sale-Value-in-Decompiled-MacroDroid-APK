package com.google.android.gms.internal.p204firebaseauthapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaem */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaem {

    /* renamed from: a */
    private static final char[] f39780a;

    static {
        char[] cArr = new char[80];
        f39780a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    static String m56535a(zzaek zzaek, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m56538d(zzaek, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static void m56536b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m56536b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m56536b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m56537c(i, sb);
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
                sb.append(zzafl.m56744a(zzacc.m56161w((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzacc) {
                sb.append(": \"");
                sb.append(zzafl.m56744a((zzacc) obj));
                sb.append('\"');
            } else if (obj instanceof zzadf) {
                sb.append(" {");
                m56538d((zzadf) obj, sb, i + 2);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                m56537c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m56536b(sb, i3, "key", entry.getKey());
                m56536b(sb, i3, "value", entry.getValue());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                m56537c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static void m56537c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f39780a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    private static void m56538d(zzaek zzaek, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        zzaek zzaek2 = zzaek;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzaek.getClass().getDeclaredMethods();
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
                m56536b(sb2, i3, substring.substring(0, substring.length() - 4), zzadf.m56427e(method2, zzaek2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m56536b(sb2, i3, substring.substring(0, substring.length() - 3), zzadf.m56427e(method, zzaek2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e = zzadf.m56427e(method4, zzaek2, new Object[0]);
                    if (method5 == null) {
                        if (e instanceof Boolean) {
                            if (!((Boolean) e).booleanValue()) {
                            }
                        } else if (e instanceof Integer) {
                            if (((Integer) e).intValue() == 0) {
                            }
                        } else if (e instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) e).floatValue()) == 0) {
                            }
                        } else if (!(e instanceof Double)) {
                            if (e instanceof String) {
                                z = e.equals("");
                            } else if (e instanceof zzacc) {
                                z = e.equals(zzacc.f39635a);
                            } else if (e instanceof zzaek) {
                                if (e == ((zzaek) e).mo49087u0()) {
                                }
                            } else if ((e instanceof Enum) && ((Enum) e).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) e).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzadf.m56427e(method5, zzaek2, new Object[0])).booleanValue()) {
                    }
                    m56536b(sb2, i3, substring, e);
                }
            }
            i2 = 3;
        }
        if (!(zzaek2 instanceof zzadc)) {
            zzafo zzafo = ((zzadf) zzaek2).zzc;
            if (zzafo != null) {
                zzafo.mo49218i(sb2, i3);
                return;
            }
            return;
        }
        zzadc zzadc = (zzadc) zzaek2;
        throw null;
    }
}
