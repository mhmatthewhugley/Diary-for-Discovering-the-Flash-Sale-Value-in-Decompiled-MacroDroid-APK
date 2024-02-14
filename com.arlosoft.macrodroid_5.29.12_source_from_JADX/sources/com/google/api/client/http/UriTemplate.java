package com.google.api.client.http;

import androidx.webkit.ProxyConfig;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import org.apache.commons.p353io.FilenameUtils;

public class UriTemplate {

    /* renamed from: a */
    static final Map<Character, CompositeOutput> f52493a = new HashMap();

    private enum CompositeOutput {
        PLUS('+', "", ",", false, true),
        HASH('#', "#", ",", false, true),
        DOT(Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR), ".", ".", false, false),
        FORWARD_SLASH('/', "/", "/", false, false),
        SEMI_COLON(';', ";", ";", true, false),
        QUERY('?', "?", "&", true, false),
        AMP('&', "&", "&", true, false),
        SIMPLE((String) null, "", ",", false, false);
        
        private final String explodeJoiner;
        private final String outputPrefix;
        private final Character propertyPrefix;
        private final boolean requiresVarAssignment;
        private final boolean reservedExpansion;

        private CompositeOutput(Character ch, String str, String str2, boolean z, boolean z2) {
            this.propertyPrefix = ch;
            this.outputPrefix = (String) Preconditions.m72716d(str);
            this.explodeJoiner = (String) Preconditions.m72716d(str2);
            this.requiresVarAssignment = z;
            this.reservedExpansion = z2;
            if (ch != null) {
                UriTemplate.f52493a.put(ch, this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo60489b(String str) {
            if (this.reservedExpansion) {
                return CharEscapers.m72747c(str);
            }
            return CharEscapers.m72746b(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo60490d() {
            return this.explodeJoiner;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo60491e() {
            return this.outputPrefix;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo60492f() {
            return this.reservedExpansion;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo60493g() {
            return this.propertyPrefix == null ? 0 : 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo60494i() {
            return this.requiresVarAssignment;
        }
    }

    static {
        CompositeOutput.values();
    }

    /* renamed from: a */
    public static String m72167a(String str, Object obj, boolean z) {
        Object obj2;
        String str2 = str;
        Map<String, Object> e = m72171e(obj);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int indexOf = str2.indexOf(123, i);
            if (indexOf != -1) {
                sb.append(str2.substring(i, indexOf));
                int indexOf2 = str2.indexOf(125, indexOf + 2);
                int i2 = indexOf2 + 1;
                String substring = str2.substring(indexOf + 1, indexOf2);
                CompositeOutput c = m72169c(substring);
                ListIterator<String> listIterator = Splitter.m72489e(',').mo60614g(substring).listIterator();
                boolean z2 = true;
                while (listIterator.hasNext()) {
                    String next = listIterator.next();
                    boolean endsWith = next.endsWith(ProxyConfig.MATCH_ALL_SCHEMES);
                    int g = listIterator.nextIndex() == 1 ? c.mo60493g() : 0;
                    int length2 = next.length();
                    if (endsWith) {
                        length2--;
                    }
                    String substring2 = next.substring(g, length2);
                    Object remove = e.remove(substring2);
                    if (remove != null) {
                        if (!z2) {
                            sb.append(c.mo60490d());
                        } else {
                            sb.append(c.mo60491e());
                            z2 = false;
                        }
                        if (remove instanceof Iterator) {
                            obj2 = m72170d(substring2, (Iterator) remove, endsWith, c);
                        } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                            obj2 = m72170d(substring2, Types.m72741l(remove).iterator(), endsWith, c);
                        } else if (remove.getClass().isEnum()) {
                            if (FieldInfo.m72675j((Enum) remove).mo60745e() != null) {
                                if (c.mo60494i()) {
                                    remove = String.format("%s=%s", new Object[]{substring2, remove});
                                }
                                remove = CharEscapers.m72747c(remove.toString());
                            }
                            obj2 = remove;
                        } else if (!Data.m72654e(remove)) {
                            obj2 = m72172f(substring2, m72171e(remove), endsWith, c);
                        } else {
                            if (c.mo60494i()) {
                                remove = String.format("%s=%s", new Object[]{substring2, remove});
                            }
                            if (c.mo60492f()) {
                                obj2 = CharEscapers.m72748d(remove.toString());
                            } else {
                                obj2 = CharEscapers.m72747c(remove.toString());
                            }
                        }
                        sb.append(obj2);
                    }
                }
                i = i2;
            } else if (i == 0 && !z) {
                return str2;
            } else {
                sb.append(str2.substring(i));
            }
        }
        if (z) {
            GenericUrl.m71984e(e.entrySet(), sb);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m72168b(String str, String str2, Object obj, boolean z) {
        String concat;
        if (str2.startsWith("/")) {
            GenericUrl genericUrl = new GenericUrl(str);
            genericUrl.mo60373z((String) null);
            String valueOf = String.valueOf(genericUrl.mo60360h());
            if (str2.length() != 0) {
                concat = valueOf.concat(str2);
            } else {
                str2 = new String(valueOf);
                return m72167a(str2, obj, z);
            }
        } else {
            if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                String valueOf2 = String.valueOf(str);
                if (str2.length() != 0) {
                    concat = valueOf2.concat(str2);
                } else {
                    str2 = new String(valueOf2);
                }
            }
            return m72167a(str2, obj, z);
        }
        str2 = concat;
        return m72167a(str2, obj, z);
    }

    /* renamed from: c */
    static CompositeOutput m72169c(String str) {
        CompositeOutput compositeOutput = f52493a.get(Character.valueOf(str.charAt(0)));
        return compositeOutput == null ? CompositeOutput.SIMPLE : compositeOutput;
    }

    /* renamed from: d */
    private static String m72170d(String str, Iterator<?> it, boolean z, CompositeOutput compositeOutput) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = compositeOutput.mo60490d();
        } else {
            if (compositeOutput.mo60494i()) {
                sb.append(CharEscapers.m72747c(str));
                sb.append("=");
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && compositeOutput.mo60494i()) {
                sb.append(CharEscapers.m72747c(str));
                sb.append("=");
            }
            sb.append(compositeOutput.mo60489b(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    private static Map<String, Object> m72171e(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : Data.m72655f(obj).entrySet()) {
            Object value = next.getValue();
            if (value != null && !Data.m72652c(value)) {
                linkedHashMap.put(next.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private static String m72172f(String str, Map<String, Object> map, boolean z, CompositeOutput compositeOutput) {
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "=";
        String str3 = ",";
        if (z) {
            str3 = compositeOutput.mo60490d();
        } else {
            if (compositeOutput.mo60494i()) {
                sb.append(CharEscapers.m72747c(str));
                sb.append(str2);
            }
            str2 = str3;
        }
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            String b = compositeOutput.mo60489b((String) next.getKey());
            String b2 = compositeOutput.mo60489b(next.getValue().toString());
            sb.append(b);
            sb.append(str2);
            sb.append(b2);
            if (it.hasNext()) {
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}
