package p292io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;

/* renamed from: io.grpc.okhttp.internal.c */
/* compiled from: DistinguishedNameParser */
final class C12935c {

    /* renamed from: a */
    private final String f60595a;

    /* renamed from: b */
    private final int f60596b;

    /* renamed from: c */
    private int f60597c;

    /* renamed from: d */
    private int f60598d;

    /* renamed from: e */
    private int f60599e;

    /* renamed from: f */
    private int f60600f;

    /* renamed from: g */
    private char[] f60601g;

    public C12935c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f60595a = name;
        this.f60596b = name.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r1 = r8.f60601g;
        r2 = r8.f60598d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        return new java.lang.String(r1, r2, r8.f60600f - r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m84974a() {
        /*
            r8 = this;
            int r0 = r8.f60597c
            r8.f60598d = r0
            r8.f60599e = r0
        L_0x0006:
            int r0 = r8.f60597c
            int r1 = r8.f60596b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f60601g
            int r2 = r8.f60598d
            int r3 = r8.f60599e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f60601g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x005e
            if (r2 == r5) goto L_0x0053
            r5 = 92
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0053
            if (r2 == r3) goto L_0x0053
            int r2 = r8.f60599e
            int r3 = r2 + 1
            r8.f60599e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.f60597c = r0
            goto L_0x0006
        L_0x0040:
            int r0 = r8.f60599e
            int r2 = r0 + 1
            r8.f60599e = r2
            char r2 = r8.m84976d()
            r1[r0] = r2
            int r0 = r8.f60597c
            int r0 = r0 + 1
            r8.f60597c = r0
            goto L_0x0006
        L_0x0053:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f60598d
            int r3 = r8.f60599e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x005e:
            int r2 = r8.f60599e
            r8.f60600f = r2
            int r0 = r0 + 1
            r8.f60597c = r0
            int r0 = r2 + 1
            r8.f60599e = r0
            r1[r2] = r6
        L_0x006c:
            int r0 = r8.f60597c
            int r1 = r8.f60596b
            if (r0 >= r1) goto L_0x0085
            char[] r2 = r8.f60601g
            char r7 = r2[r0]
            if (r7 != r6) goto L_0x0085
            int r1 = r8.f60599e
            int r7 = r1 + 1
            r8.f60599e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f60597c = r0
            goto L_0x006c
        L_0x0085:
            if (r0 == r1) goto L_0x0095
            char[] r1 = r8.f60601g
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x0095
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x0095
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x0095:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f60601g
            int r2 = r8.f60598d
            int r3 = r8.f60600f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.okhttp.internal.C12935c.m84974a():java.lang.String");
    }

    /* renamed from: c */
    private int m84975c(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f60596b) {
            char[] cArr = this.f60601g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f60595a);
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f60595a);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f60595a);
    }

    /* renamed from: d */
    private char m84976d() {
        int i = this.f60597c + 1;
        this.f60597c = i;
        if (i != this.f60596b) {
            char[] cArr = this.f60601g;
            char c = cArr[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return m84977e();
                        }
                }
            }
            return cArr[i];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f60595a);
    }

    /* renamed from: e */
    private char m84977e() {
        int i;
        int i2;
        int c = m84975c(this.f60597c);
        this.f60597c++;
        if (c < 128) {
            return (char) c;
        }
        if (c < 192 || c > 247) {
            return '?';
        }
        if (c <= 223) {
            i2 = c & 31;
            i = 1;
        } else if (c <= 239) {
            i = 2;
            i2 = c & 15;
        } else {
            i = 3;
            i2 = c & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f60597c + 1;
            this.f60597c = i4;
            if (i4 == this.f60596b || this.f60601g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f60597c = i5;
            int c2 = m84975c(i5);
            this.f60597c++;
            if ((c2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (c2 & 63);
        }
        return (char) i2;
    }

    /* renamed from: f */
    private String m84978f() {
        int i;
        int i2 = this.f60597c;
        if (i2 + 4 < this.f60596b) {
            this.f60598d = i2;
            this.f60597c = i2 + 1;
            while (true) {
                i = this.f60597c;
                if (i == this.f60596b) {
                    break;
                }
                char[] cArr = this.f60601g;
                if (cArr[i] == '+' || cArr[i] == ',' || cArr[i] == ';') {
                    break;
                } else if (cArr[i] == ' ') {
                    this.f60599e = i;
                    this.f60597c = i + 1;
                    while (true) {
                        int i3 = this.f60597c;
                        if (i3 >= this.f60596b || this.f60601g[i3] != ' ') {
                            break;
                        }
                        this.f60597c = i3 + 1;
                    }
                } else {
                    if (cArr[i] >= 'A' && cArr[i] <= 'F') {
                        cArr[i] = (char) (cArr[i] + ' ');
                    }
                    this.f60597c = i + 1;
                }
            }
            this.f60599e = i;
            int i4 = this.f60599e;
            int i5 = this.f60598d;
            int i6 = i4 - i5;
            if (i6 < 5 || (i6 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f60595a);
            }
            int i7 = i6 / 2;
            byte[] bArr = new byte[i7];
            int i8 = i5 + 1;
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i9] = (byte) m84975c(i8);
                i8 += 2;
            }
            return new String(this.f60601g, this.f60598d, i6);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f60595a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m84979g() {
        /*
            r7 = this;
        L_0x0000:
            int r0 = r7.f60597c
            int r1 = r7.f60596b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r7.f60601g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r7.f60597c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r7.f60598d = r0
            int r0 = r0 + 1
            r7.f60597c = r0
        L_0x001d:
            int r0 = r7.f60597c
            int r1 = r7.f60596b
            r3 = 61
            if (r0 >= r1) goto L_0x0034
            char[] r4 = r7.f60601g
            char r5 = r4[r0]
            if (r5 == r3) goto L_0x0034
            char r4 = r4[r0]
            if (r4 == r2) goto L_0x0034
            int r0 = r0 + 1
            r7.f60597c = r0
            goto L_0x001d
        L_0x0034:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00d9
            r7.f60599e = r0
            char[] r1 = r7.f60601g
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x0075
        L_0x0040:
            int r0 = r7.f60597c
            int r1 = r7.f60596b
            if (r0 >= r1) goto L_0x0055
            char[] r5 = r7.f60601g
            char r6 = r5[r0]
            if (r6 == r3) goto L_0x0055
            char r5 = r5[r0]
            if (r5 != r2) goto L_0x0055
            int r0 = r0 + 1
            r7.f60597c = r0
            goto L_0x0040
        L_0x0055:
            char[] r5 = r7.f60601g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005e
            if (r0 == r1) goto L_0x005e
            goto L_0x0075
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r7.f60595a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0075:
            int r0 = r7.f60597c
            int r0 = r0 + 1
            r7.f60597c = r0
        L_0x007b:
            int r0 = r7.f60597c
            int r1 = r7.f60596b
            if (r0 >= r1) goto L_0x008c
            char[] r1 = r7.f60601g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x008c
            int r0 = r0 + 1
            r7.f60597c = r0
            goto L_0x007b
        L_0x008c:
            int r0 = r7.f60599e
            int r1 = r7.f60598d
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto L_0x00ce
            char[] r2 = r7.f60601g
            int r4 = r1 + 3
            char r4 = r2[r4]
            r5 = 46
            if (r4 != r5) goto L_0x00ce
            char r4 = r2[r1]
            r5 = 79
            if (r4 == r5) goto L_0x00ab
            char r4 = r2[r1]
            r5 = 111(0x6f, float:1.56E-43)
            if (r4 != r5) goto L_0x00ce
        L_0x00ab:
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 73
            if (r4 == r5) goto L_0x00bb
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 105(0x69, float:1.47E-43)
            if (r4 != r5) goto L_0x00ce
        L_0x00bb:
            int r4 = r1 + 2
            char r4 = r2[r4]
            r5 = 68
            if (r4 == r5) goto L_0x00cb
            int r4 = r1 + 2
            char r2 = r2[r4]
            r4 = 100
            if (r2 != r4) goto L_0x00ce
        L_0x00cb:
            int r1 = r1 + r3
            r7.f60598d = r1
        L_0x00ce:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r7.f60601g
            int r3 = r7.f60598d
            int r0 = r0 - r3
            r1.<init>(r2, r3, r0)
            return r1
        L_0x00d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r7.f60595a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.okhttp.internal.C12935c.m84979g():java.lang.String");
    }

    /* renamed from: h */
    private String m84980h() {
        int i = this.f60597c + 1;
        this.f60597c = i;
        this.f60598d = i;
        this.f60599e = i;
        while (true) {
            int i2 = this.f60597c;
            if (i2 != this.f60596b) {
                char[] cArr = this.f60601g;
                if (cArr[i2] == '\"') {
                    this.f60597c = i2 + 1;
                    while (true) {
                        int i3 = this.f60597c;
                        if (i3 >= this.f60596b || this.f60601g[i3] != ' ') {
                            char[] cArr2 = this.f60601g;
                            int i4 = this.f60598d;
                        } else {
                            this.f60597c = i3 + 1;
                        }
                    }
                    char[] cArr22 = this.f60601g;
                    int i42 = this.f60598d;
                    return new String(cArr22, i42, this.f60599e - i42);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.f60599e] = m84976d();
                } else {
                    cArr[this.f60599e] = cArr[i2];
                }
                this.f60597c++;
                this.f60599e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f60595a);
            }
        }
    }

    /* renamed from: b */
    public String mo69724b(String str) {
        String str2;
        this.f60597c = 0;
        this.f60598d = 0;
        this.f60599e = 0;
        this.f60600f = 0;
        this.f60601g = this.f60595a.toCharArray();
        String g = m84979g();
        if (g == null) {
            return null;
        }
        do {
            int i = this.f60597c;
            if (i == this.f60596b) {
                return null;
            }
            char c = this.f60601g[i];
            if (c == '\"') {
                str2 = m84980h();
            } else if (c != '#') {
                str2 = (c == '+' || c == ',' || c == ';') ? "" : m84974a();
            } else {
                str2 = m84978f();
            }
            if (str.equalsIgnoreCase(g)) {
                return str2;
            }
            int i2 = this.f60597c;
            if (i2 >= this.f60596b) {
                return null;
            }
            char[] cArr = this.f60601g;
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.f60597c = i2 + 1;
                g = m84979g();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f60595a);
            }
        } while (g != null);
        throw new IllegalStateException("Malformed DN: " + this.f60595a);
    }
}
