package com.google.android.gms.internal.icing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzeg {
    /* renamed from: a */
    static String m58876a(zzee zzee, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m58878c(zzee, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m58877b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m58877b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m58877b(sb, i, str, b2);
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
                sb.append(zzfb.m59009a(zzcf.m58667m((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzcf) {
                sb.append(": \"");
                sb.append(zzfb.m59009a((zzcf) obj));
                sb.append('\"');
            } else if (obj instanceof zzda) {
                sb.append(" {");
                m58878c((zzda) obj, sb, i + 2);
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
                m58877b(sb, i4, "key", entry.getKey());
                m58877b(sb, i4, "value", entry.getValue());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: c */
    private static void m58878c(zzee zzee, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : zzee.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str8 : treeSet) {
            String substring = str8.startsWith("get") ? str8.substring(3) : str8;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                if (valueOf2.length() != 0) {
                    str7 = valueOf.concat(valueOf2);
                } else {
                    str7 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str8);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m58877b(sb, i, m58879d(str7), zzda.m58799i(method2, zzee, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                if (valueOf4.length() != 0) {
                    str6 = valueOf3.concat(valueOf4);
                } else {
                    str6 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str8);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m58877b(sb, i, m58879d(str6), zzda.m58799i(method3, zzee, new Object[0]));
                }
            }
            if (substring.length() != 0) {
                str = "set".concat(substring);
            } else {
                str = new String("set");
            }
            if (((Method) hashMap2.get(str)) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (valueOf5.length() != 0) {
                        str5 = "get".concat(valueOf5);
                    } else {
                        str5 = new String("get");
                    }
                    if (hashMap.containsKey(str5)) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                if (valueOf7.length() != 0) {
                    str2 = valueOf6.concat(valueOf7);
                } else {
                    str2 = new String(valueOf6);
                }
                if (substring.length() != 0) {
                    str3 = "get".concat(substring);
                } else {
                    str3 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str3);
                if (substring.length() != 0) {
                    str4 = "has".concat(substring);
                } else {
                    str4 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str4);
                if (method4 != null) {
                    Object i2 = zzda.m58799i(method4, zzee, new Object[0]);
                    if (method5 == null) {
                        if (i2 instanceof Boolean) {
                            if (!((Boolean) i2).booleanValue()) {
                            }
                        } else if (i2 instanceof Integer) {
                            if (((Integer) i2).intValue() == 0) {
                            }
                        } else if (i2 instanceof Float) {
                            if (((Float) i2).floatValue() == 0.0f) {
                            }
                        } else if (!(i2 instanceof Double)) {
                            if (i2 instanceof String) {
                                z = i2.equals("");
                            } else if (i2 instanceof zzcf) {
                                z = i2.equals(zzcf.f40792a);
                            } else if (i2 instanceof zzee) {
                                if (i2 == ((zzee) i2).mo50306k()) {
                                }
                            } else if ((i2 instanceof Enum) && ((Enum) i2).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) i2).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) zzda.m58799i(method5, zzee, new Object[0])).booleanValue()) {
                    }
                    m58877b(sb, i, m58879d(str2), i2);
                }
            }
        }
        if (!(zzee instanceof zzcy)) {
            zzfe zzfe = ((zzda) zzee).zzc;
            if (zzfe != null) {
                zzfe.mo50412e(sb, i);
                return;
            }
            return;
        }
        zzcy zzcy = (zzcy) zzee;
        throw null;
    }

    /* renamed from: d */
    private static final String m58879d(String str) {
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
}
