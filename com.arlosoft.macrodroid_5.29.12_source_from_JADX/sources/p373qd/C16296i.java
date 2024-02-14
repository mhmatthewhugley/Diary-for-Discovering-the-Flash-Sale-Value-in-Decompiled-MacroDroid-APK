package p373qd;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import p351od.C15852c;
import p364pd.C16171b;
import p373qd.C16288f;
import p382rd.C16382a;

/* renamed from: qd.i */
/* compiled from: Entities */
public class C16296i {

    /* renamed from: a */
    private static final char[] f66678a = {',', ';'};

    /* renamed from: b */
    private static final HashMap<String, String> f66679b = new HashMap<>();

    /* renamed from: c */
    private static final C16288f.C16289a f66680c = new C16288f.C16289a();

    /* renamed from: qd.i$a */
    /* compiled from: Entities */
    static /* synthetic */ class C16297a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66681a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                qd.i$b[] r0 = p373qd.C16296i.C16298b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66681a = r0
                qd.i$b r1 = p373qd.C16296i.C16298b.ascii     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66681a     // Catch:{ NoSuchFieldError -> 0x001d }
                qd.i$b r1 = p373qd.C16296i.C16298b.utf     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p373qd.C16296i.C16297a.<clinit>():void");
        }
    }

    /* renamed from: qd.i$b */
    /* compiled from: Entities */
    enum C16298b {
        ascii,
        utf,
        fallback;

        /* renamed from: d */
        static C16298b m97837d(String str) {
            if (str.equals("US-ASCII")) {
                return ascii;
            }
            if (str.startsWith("UTF-")) {
                return utf;
            }
            return fallback;
        }
    }

    /* renamed from: qd.i$c */
    /* compiled from: Entities */
    public enum C16299c {
        xhtml(C16300j.f66690a, 4),
        base(C16300j.f66691b, 106),
        extended(C16300j.f66692c, 2125);
        
        /* access modifiers changed from: private */
        public int[] codeKeys;
        /* access modifiers changed from: private */
        public int[] codeVals;
        /* access modifiers changed from: private */
        public String[] nameKeys;
        /* access modifiers changed from: private */
        public String[] nameVals;

        private C16299c(String str, int i) {
            C16296i.m97835h(this, str, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo78888m(String str) {
            int binarySearch = Arrays.binarySearch(this.nameKeys, str);
            if (binarySearch >= 0) {
                return this.codeVals[binarySearch];
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public String mo78889n(int i) {
            int binarySearch = Arrays.binarySearch(this.codeKeys, i);
            if (binarySearch < 0) {
                return "";
            }
            String[] strArr = this.nameVals;
            if (binarySearch < strArr.length - 1) {
                int i2 = binarySearch + 1;
                if (this.codeKeys[i2] == i) {
                    return strArr[i2];
                }
            }
            return strArr[binarySearch];
        }
    }

    /* renamed from: b */
    private static void m97829b(Appendable appendable, C16299c cVar, int i) throws IOException {
        String n = cVar.mo78889n(i);
        if (!"".equals(n)) {
            appendable.append('&').append(n).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    /* renamed from: c */
    private static boolean m97830c(C16298b bVar, char c, CharsetEncoder charsetEncoder) {
        int i = C16297a.f66681a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return charsetEncoder.canEncode(c);
            }
            return true;
        } else if (c < 128) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static int m97831d(String str, int[] iArr) {
        String str2 = f66679b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int m = C16299c.extended.mo78888m(str);
        if (m == -1) {
            return 0;
        }
        iArr[0] = m;
        return 1;
    }

    /* renamed from: e */
    static void m97832e(Appendable appendable, String str, C16288f.C16289a aVar, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        Appendable appendable2 = appendable;
        C16299c e = aVar.mo78845e();
        CharsetEncoder d = aVar.mo78844d();
        C16298b bVar = aVar.f66656f;
        int length = str.length();
        int i = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (z2) {
                if (C16171b.m97077h(codePointAt)) {
                    if ((!z3 || z6) && !z7) {
                        if (z4) {
                            z5 = true;
                        } else {
                            appendable2.append(' ');
                            z7 = true;
                        }
                    }
                    i += Character.charCount(codePointAt);
                } else {
                    if (z5) {
                        appendable2.append(' ');
                        z5 = false;
                    }
                    z6 = true;
                    z7 = false;
                }
            }
            if (codePointAt < 65536) {
                char c = (char) codePointAt;
                if (c == 9 || c == 10 || c == 13) {
                    appendable2.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable2.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                if (c < ' ' || !m97830c(bVar, c, d)) {
                                    m97829b(appendable2, e, codePointAt);
                                } else {
                                    appendable2.append(c);
                                }
                            } else if (e != C16299c.xhtml) {
                                appendable2.append("&nbsp;");
                            } else {
                                appendable2.append("&#xa0;");
                            }
                        } else if (!z) {
                            appendable2.append("&gt;");
                        } else {
                            appendable2.append(c);
                        }
                    } else if (!z || e == C16299c.xhtml || aVar.mo78851n() == C16288f.C16289a.C16290a.xml) {
                        appendable2.append("&lt;");
                    } else {
                        appendable2.append(c);
                    }
                } else if (z) {
                    appendable2.append("&quot;");
                } else {
                    appendable2.append(c);
                }
            } else {
                String str2 = new String(Character.toChars(codePointAt));
                if (d.canEncode(str2)) {
                    appendable2.append(str2);
                } else {
                    m97829b(appendable2, e, codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: f */
    public static boolean m97833f(String str) {
        return C16299c.base.mo78888m(str) != -1;
    }

    /* renamed from: g */
    public static boolean m97834g(String str) {
        return C16299c.extended.mo78888m(str) != -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m97835h(C16299c cVar, String str, int i) {
        int i2;
        String[] unused = cVar.nameKeys = new String[i];
        int[] unused2 = cVar.codeVals = new int[i];
        int[] unused3 = cVar.codeKeys = new int[i];
        String[] unused4 = cVar.nameVals = new String[i];
        C16382a aVar = new C16382a(str);
        boolean z = false;
        int i3 = 0;
        while (!aVar.mo79104x()) {
            try {
                String p = aVar.mo79095p('=');
                aVar.mo79082a();
                int parseInt = Integer.parseInt(aVar.mo79097r(f66678a), 36);
                char v = aVar.mo79102v();
                aVar.mo79082a();
                if (v == ',') {
                    i2 = Integer.parseInt(aVar.mo79095p(';'), 36);
                    aVar.mo79082a();
                } else {
                    i2 = -1;
                }
                int parseInt2 = Integer.parseInt(aVar.mo79095p('&'), 36);
                aVar.mo79082a();
                cVar.nameKeys[i3] = p;
                cVar.codeVals[i3] = parseInt;
                cVar.codeKeys[parseInt2] = parseInt;
                cVar.nameVals[parseInt2] = p;
                if (i2 != -1) {
                    f66679b.put(p, new String(new int[]{parseInt, i2}, 0, 2));
                }
                i3++;
            } finally {
                aVar.mo79083d();
            }
        }
        if (i3 == i) {
            z = true;
        }
        C15852c.m95475d(z, "Unexpected count of entities loaded");
    }
}
