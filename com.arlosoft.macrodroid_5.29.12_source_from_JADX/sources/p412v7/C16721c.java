package p412v7;

import androidx.webkit.ProxyConfig;
import com.sun.activation.registries.MailcapParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: v7.c */
/* compiled from: MailcapFile */
public class C16721c {

    /* renamed from: d */
    private static boolean f67653d = false;

    /* renamed from: a */
    private Map f67654a = new HashMap();

    /* renamed from: b */
    private Map f67655b = new HashMap();

    /* renamed from: c */
    private Map f67656c = new HashMap();

    static {
        try {
            f67653d = Boolean.getBoolean("javax.activation.addreverse");
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[SYNTHETIC, Splitter:B:15:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16721c(java.lang.String r3) throws java.io.IOException {
        /*
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f67654a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f67655b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f67656c = r0
            boolean r0 = p412v7.C16720b.m99260a()
            if (r0 == 0) goto L_0x0032
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "new MailcapFile: file "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p412v7.C16720b.m99261b(r0)
        L_0x0032:
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0047 }
            r1.<init>(r3)     // Catch:{ all -> 0x0047 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
            r3.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.m99264g(r3)     // Catch:{ all -> 0x0044 }
            r1.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            return
        L_0x0044:
            r3 = move-exception
            r0 = r1
            goto L_0x0048
        L_0x0047:
            r3 = move-exception
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p412v7.C16721c.<init>(java.lang.String):void");
    }

    /* renamed from: f */
    private Map m99263f(Map map, Map map2) {
        HashMap hashMap = new HashMap(map);
        for (String str : map2.keySet()) {
            List list = (List) hashMap.get(str);
            if (list == null) {
                hashMap.put(str, map2.get(str));
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll((List) map2.get(str));
                hashMap.put(str, arrayList);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        mo79643h(r1 + r2);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m99264g(java.io.Reader r7) throws java.io.IOException {
        /*
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r7)
            r7 = 0
        L_0x0006:
            r1 = r7
        L_0x0007:
            java.lang.String r2 = r0.readLine()
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = r2.trim()
            r3 = 0
            char r4 = r2.charAt(r3)     // Catch:{  }
            r5 = 35
            if (r4 != r5) goto L_0x001b
            goto L_0x0007
        L_0x001b:
            int r4 = r2.length()     // Catch:{  }
            int r4 = r4 + -1
            char r4 = r2.charAt(r4)     // Catch:{  }
            r5 = 92
            if (r4 != r5) goto L_0x0050
            if (r1 == 0) goto L_0x0045
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
            r4.<init>()     // Catch:{  }
            r4.append(r1)     // Catch:{  }
            int r5 = r2.length()     // Catch:{  }
            int r5 = r5 + -1
            java.lang.String r2 = r2.substring(r3, r5)     // Catch:{  }
            r4.append(r2)     // Catch:{  }
            java.lang.String r1 = r4.toString()     // Catch:{  }
            goto L_0x0007
        L_0x0045:
            int r4 = r2.length()     // Catch:{  }
            int r4 = r4 + -1
            java.lang.String r1 = r2.substring(r3, r4)     // Catch:{  }
            goto L_0x0007
        L_0x0050:
            if (r1 == 0) goto L_0x0065
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{  }
            r3.<init>()     // Catch:{  }
            r3.append(r1)     // Catch:{  }
            r3.append(r2)     // Catch:{  }
            java.lang.String r1 = r3.toString()     // Catch:{  }
            r6.mo79643h(r1)     // Catch:{ MailcapParseException -> 0x0006 }
            goto L_0x0006
        L_0x0065:
            r6.mo79643h(r2)     // Catch:{ StringIndexOutOfBoundsException -> 0x0069 }
            goto L_0x0007
        L_0x0069:
            goto L_0x0007
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412v7.C16721c.m99264g(java.io.Reader):void");
    }

    /* renamed from: i */
    protected static void m99265i(int i, int i2, int i3, int i4, String str) throws MailcapParseException {
        if (C16720b.m99260a()) {
            C16720b.m99261b("PARSE ERROR: Encountered a " + C16722d.m99279g(i4) + " token (" + str + ") while expecting a " + C16722d.m99279g(i) + ", a " + C16722d.m99279g(i2) + ", or a " + C16722d.m99279g(i3) + " token.");
        }
        throw new MailcapParseException("Encountered a " + C16722d.m99279g(i4) + " token (" + str + ") while expecting a " + C16722d.m99279g(i) + ", a " + C16722d.m99279g(i2) + ", or a " + C16722d.m99279g(i3) + " token.");
    }

    /* renamed from: j */
    protected static void m99266j(int i, int i2, int i3, String str) throws MailcapParseException {
        throw new MailcapParseException("Encountered a " + C16722d.m99279g(i3) + " token (" + str + ") while expecting a " + C16722d.m99279g(i) + " or a " + C16722d.m99279g(i2) + " token.");
    }

    /* renamed from: k */
    protected static void m99267k(int i, int i2, String str) throws MailcapParseException {
        throw new MailcapParseException("Encountered a " + C16722d.m99279g(i2) + " token (" + str + ") while expecting a " + C16722d.m99279g(i) + " token.");
    }

    /* renamed from: a */
    public void mo79638a(String str) {
        if (C16720b.m99260a()) {
            C16720b.m99261b("appendToMailcap: " + str);
        }
        try {
            m99264g(new StringReader(str));
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    public Map mo79639b(String str) {
        Map map = (Map) this.f67655b.get(str);
        int indexOf = str.indexOf(47) + 1;
        if (str.substring(indexOf).equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return map;
        }
        Map map2 = (Map) this.f67655b.get(str.substring(0, indexOf) + ProxyConfig.MATCH_ALL_SCHEMES);
        if (map2 != null) {
            return map != null ? m99263f(map, map2) : map2;
        }
        return map;
    }

    /* renamed from: c */
    public Map mo79640c(String str) {
        Map map = (Map) this.f67654a.get(str);
        int indexOf = str.indexOf(47) + 1;
        if (str.substring(indexOf).equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return map;
        }
        Map map2 = (Map) this.f67654a.get(str.substring(0, indexOf) + ProxyConfig.MATCH_ALL_SCHEMES);
        if (map2 != null) {
            return map != null ? m99263f(map, map2) : map2;
        }
        return map;
    }

    /* renamed from: d */
    public String[] mo79641d() {
        HashSet hashSet = new HashSet(this.f67654a.keySet());
        hashSet.addAll(this.f67655b.keySet());
        hashSet.addAll(this.f67656c.keySet());
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: e */
    public String[] mo79642e(String str) {
        List list = (List) this.f67656c.get(str.toLowerCase(Locale.ENGLISH));
        if (list != null) {
            return (String[]) list.toArray(new String[list.size()]);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo79643h(String str) throws MailcapParseException, IOException {
        String str2;
        int h;
        C16722d dVar = new C16722d(str);
        dVar.mo79646k(false);
        if (C16720b.m99260a()) {
            C16720b.m99261b("parse: " + str);
        }
        int h2 = dVar.mo79645h();
        if (h2 != 2) {
            m99267k(2, h2, dVar.mo79644b());
        }
        String b = dVar.mo79644b();
        Locale locale = Locale.ENGLISH;
        String lowerCase = b.toLowerCase(locale);
        int h3 = dVar.mo79645h();
        if (!(h3 == 47 || h3 == 59)) {
            m99266j(47, 59, h3, dVar.mo79644b());
        }
        if (h3 == 47) {
            int h4 = dVar.mo79645h();
            if (h4 != 2) {
                m99267k(2, h4, dVar.mo79644b());
            }
            str2 = dVar.mo79644b().toLowerCase(locale);
            h3 = dVar.mo79645h();
        } else {
            str2 = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        String str3 = lowerCase + "/" + str2;
        if (C16720b.m99260a()) {
            C16720b.m99261b("  Type: " + str3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (h3 != 59) {
            m99267k(59, h3, dVar.mo79644b());
        }
        dVar.mo79646k(true);
        int h5 = dVar.mo79645h();
        dVar.mo79646k(false);
        if (!(h5 == 2 || h5 == 59)) {
            m99266j(2, 59, h5, dVar.mo79644b());
        }
        if (h5 == 2) {
            List list = (List) this.f67656c.get(str3);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                this.f67656c.put(str3, arrayList);
            } else {
                list.add(str);
            }
        }
        if (h5 != 59) {
            h5 = dVar.mo79645h();
        }
        if (h5 == 59) {
            boolean z = false;
            do {
                int h6 = dVar.mo79645h();
                if (h6 != 2) {
                    m99267k(2, h6, dVar.mo79644b());
                }
                String lowerCase2 = dVar.mo79644b().toLowerCase(Locale.ENGLISH);
                h = dVar.mo79645h();
                if (!(h == 61 || h == 59 || h == 5)) {
                    m99265i(61, 59, 5, h, dVar.mo79644b());
                }
                if (h == 61) {
                    dVar.mo79646k(true);
                    int h7 = dVar.mo79645h();
                    dVar.mo79646k(false);
                    if (h7 != 2) {
                        m99267k(2, h7, dVar.mo79644b());
                    }
                    String b2 = dVar.mo79644b();
                    if (lowerCase2.startsWith("x-java-")) {
                        String substring = lowerCase2.substring(7);
                        if (!substring.equals("fallback-entry") || !b2.equalsIgnoreCase("true")) {
                            if (C16720b.m99260a()) {
                                C16720b.m99261b("    Command: " + substring + ", Class: " + b2);
                            }
                            List list2 = (List) linkedHashMap.get(substring);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                linkedHashMap.put(substring, list2);
                            }
                            if (f67653d) {
                                list2.add(0, b2);
                            } else {
                                list2.add(b2);
                            }
                        } else {
                            z = true;
                        }
                    }
                    h = dVar.mo79645h();
                    continue;
                }
            } while (h == 59);
            Map map = z ? this.f67655b : this.f67654a;
            Map map2 = (Map) map.get(str3);
            if (map2 == null) {
                map.put(str3, linkedHashMap);
                return;
            }
            if (C16720b.m99260a()) {
                C16720b.m99261b("Merging commands for type " + str3);
            }
            for (String str4 : map2.keySet()) {
                List list3 = (List) map2.get(str4);
                List<String> list4 = (List) linkedHashMap.get(str4);
                if (list4 != null) {
                    for (String str5 : list4) {
                        if (!list3.contains(str5)) {
                            if (f67653d) {
                                list3.add(0, str5);
                            } else {
                                list3.add(str5);
                            }
                        }
                    }
                }
            }
            for (String str6 : linkedHashMap.keySet()) {
                if (!map2.containsKey(str6)) {
                    map2.put(str6, (List) linkedHashMap.get(str6));
                }
            }
        } else if (h5 != 5) {
            m99266j(5, 59, h5, dVar.mo79644b());
        }
    }

    public C16721c(InputStream inputStream) throws IOException {
        if (C16720b.m99260a()) {
            C16720b.m99261b("new MailcapFile: InputStream");
        }
        m99264g(new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1")));
    }

    public C16721c() {
        if (C16720b.m99260a()) {
            C16720b.m99261b("new MailcapFile: default");
        }
    }
}
