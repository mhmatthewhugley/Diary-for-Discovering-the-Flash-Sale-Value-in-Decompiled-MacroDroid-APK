package p345o7;

import androidx.webkit.ProxyConfig;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p226cd.C11179b;

/* renamed from: o7.c */
/* compiled from: HttpUrl */
public final class C15811c {

    /* renamed from: j */
    private static final char[] f65219j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f65220a;

    /* renamed from: b */
    private final String f65221b;

    /* renamed from: c */
    private final String f65222c;

    /* renamed from: d */
    private final String f65223d;

    /* renamed from: e */
    private final int f65224e;

    /* renamed from: f */
    private final List<String> f65225f;

    /* renamed from: g */
    private final List<String> f65226g;

    /* renamed from: h */
    private final String f65227h;

    /* renamed from: i */
    private final String f65228i;

    /* renamed from: o7.c$b */
    /* compiled from: HttpUrl */
    public static final class C15813b {

        /* renamed from: a */
        String f65229a;

        /* renamed from: b */
        String f65230b = "";

        /* renamed from: c */
        String f65231c = "";

        /* renamed from: d */
        String f65232d;

        /* renamed from: e */
        int f65233e = -1;

        /* renamed from: f */
        final List<String> f65234f;

        /* renamed from: g */
        List<String> f65235g;

        /* renamed from: h */
        String f65236h;

        public C15813b() {
            ArrayList arrayList = new ArrayList();
            this.f65234f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        private static String m95389b(String str, int i, int i2) {
            String f = C15811c.m95383f(str, i, i2, false);
            if (!f.startsWith("[") || !f.endsWith("]")) {
                return m95393f(f);
            }
            InetAddress e = m95392e(f, 1, f.length() - 1);
            if (e == null) {
                return null;
            }
            byte[] address = e.getAddress();
            if (address.length == 16) {
                return m95394i(address);
            }
            throw new AssertionError();
        }

        /* renamed from: c */
        private static boolean m95390c(String str) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        private static boolean m95391d(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            if (i4 != i3 + 4) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private static InetAddress m95392e(String str, int i, int i2) {
            byte[] bArr = new byte[16];
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (i3 == 16) {
                    return null;
                } else {
                    int i6 = i + 2;
                    if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                        if (i3 != 0) {
                            if (str.regionMatches(i, ":", 0, 1)) {
                                i++;
                            } else if (!str.regionMatches(i, ".", 0, 1) || !m95391d(str, i5, i2, bArr, i3 - 2)) {
                                return null;
                            } else {
                                i3 += 2;
                            }
                        }
                        i5 = i;
                    } else if (i4 != -1) {
                        return null;
                    } else {
                        i3 += 2;
                        i4 = i3;
                        if (i6 == i2) {
                            break;
                        }
                        i5 = i6;
                    }
                    i = i5;
                    int i7 = 0;
                    while (i < i2) {
                        int a = C15811c.m95379a(str.charAt(i));
                        if (a == -1) {
                            break;
                        }
                        i7 = (i7 << 4) + a;
                        i++;
                    }
                    int i8 = i - i5;
                    if (i8 == 0 || i8 > 4) {
                        return null;
                    }
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((i7 >>> 8) & 255);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) (i7 & 255);
                }
            }
            if (i3 != 16) {
                if (i4 == -1) {
                    return null;
                }
                int i10 = i3 - i4;
                System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
                Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        private static String m95393f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty() && !m95390c(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: i */
        private static String m95394i(byte[] bArr) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            C11179b bVar = new C11179b();
            while (i < bArr.length) {
                if (i == i2) {
                    bVar.writeByte(58);
                    i += i4;
                    if (i == 16) {
                        bVar.writeByte(58);
                    }
                } else {
                    if (i > 0) {
                        bVar.writeByte(58);
                    }
                    bVar.mo62413R1((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return bVar.mo62471z();
        }

        /* renamed from: a */
        public C15811c mo75588a() {
            if (this.f65229a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f65232d != null) {
                return new C15811c(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo75589g() {
            int i = this.f65233e;
            return i != -1 ? i : C15811c.m95380b(this.f65229a);
        }

        /* renamed from: h */
        public C15813b mo75590h(String str) {
            if (str != null) {
                String b = m95389b(str, 0, str.length());
                if (b != null) {
                    this.f65232d = b;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new IllegalArgumentException("host == null");
        }

        /* renamed from: j */
        public C15813b mo75591j(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f65233e = i;
            return this;
        }

        /* renamed from: k */
        public C15813b mo75592k(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f65229a = "http";
                } else if (str.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS)) {
                    this.f65229a = ProxyConfig.MATCH_HTTPS;
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f65229a);
            sb.append("://");
            if (!this.f65230b.isEmpty() || !this.f65231c.isEmpty()) {
                sb.append(this.f65230b);
                if (!this.f65231c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f65231c);
                }
                sb.append('@');
            }
            if (this.f65232d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f65232d);
                sb.append(']');
            } else {
                sb.append(this.f65232d);
            }
            int g = mo75589g();
            if (g != C15811c.m95380b(this.f65229a)) {
                sb.append(':');
                sb.append(g);
            }
            C15811c.m95382e(sb, this.f65234f);
            if (this.f65235g != null) {
                sb.append('?');
                C15811c.m95381d(sb, this.f65235g);
            }
            if (this.f65236h != null) {
                sb.append('#');
                sb.append(this.f65236h);
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    static int m95379a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: b */
    public static int m95380b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
    }

    /* renamed from: d */
    static void m95381d(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: e */
    static void m95382e(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: f */
    static String m95383f(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C11179b bVar = new C11179b();
                bVar.mo62460v0(str, i, i3);
                m95386i(bVar, str, i3, i2, z);
                return bVar.mo62471z();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: g */
    static String m95384g(String str, boolean z) {
        return m95383f(str, 0, str.length(), z);
    }

    /* renamed from: h */
    private List<String> m95385h(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? m95384g(next, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: i */
    static void m95386i(C11179b bVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a = m95379a(str.charAt(i + 1));
                int a2 = m95379a(str.charAt(i3));
                if (!(a == -1 || a2 == -1)) {
                    bVar.writeByte((a << 4) + a2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                bVar.writeByte(32);
                i += Character.charCount(codePointAt);
            }
            bVar.mo62440j0(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: c */
    public String mo75583c() {
        return this.f65223d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15811c) && ((C15811c) obj).f65228i.equals(this.f65228i);
    }

    public int hashCode() {
        return this.f65228i.hashCode();
    }

    /* renamed from: j */
    public int mo75586j() {
        return this.f65224e;
    }

    public String toString() {
        return this.f65228i;
    }

    private C15811c(C15813b bVar) {
        this.f65220a = bVar.f65229a;
        this.f65221b = m95384g(bVar.f65230b, false);
        this.f65222c = m95384g(bVar.f65231c, false);
        this.f65223d = bVar.f65232d;
        this.f65224e = bVar.mo75589g();
        this.f65225f = m95385h(bVar.f65234f, false);
        List<String> list = bVar.f65235g;
        String str = null;
        this.f65226g = list != null ? m95385h(list, true) : null;
        String str2 = bVar.f65236h;
        this.f65227h = str2 != null ? m95384g(str2, false) : str;
        this.f65228i = bVar.toString();
    }
}
