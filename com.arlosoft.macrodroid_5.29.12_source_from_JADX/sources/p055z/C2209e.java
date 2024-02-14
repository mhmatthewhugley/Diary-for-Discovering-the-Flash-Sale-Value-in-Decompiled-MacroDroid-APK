package p055z;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import org.apache.http.message.BasicHeaderValueFormatter;
import p055z.C2205c;
import p226cd.C11179b;
import p226cd.C11186d;
import p226cd.C11188e;

/* renamed from: z.e */
/* compiled from: JsonUtf8Reader */
final class C2209e extends C2205c {

    /* renamed from: E */
    private static final C11188e f6843E = C11188e.m75103f("'\\");

    /* renamed from: F */
    private static final C11188e f6844F = C11188e.m75103f(BasicHeaderValueFormatter.UNSAFE_CHARS);

    /* renamed from: G */
    private static final C11188e f6845G = C11188e.m75103f("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: H */
    private static final C11188e f6846H = C11188e.m75103f("\n\r");

    /* renamed from: I */
    private static final C11188e f6847I = C11188e.m75103f("*/");

    /* renamed from: A */
    private int f6848A = 0;

    /* renamed from: B */
    private long f6849B;

    /* renamed from: C */
    private int f6850C;
    @Nullable

    /* renamed from: D */
    private String f6851D;

    /* renamed from: s */
    private final C11186d f6852s;

    /* renamed from: z */
    private final C11179b f6853z;

    C2209e(C11186d dVar) {
        Objects.requireNonNull(dVar, "source == null");
        this.f6852s = dVar;
        this.f6853z = dVar.mo62416T();
        mo24411u(6);
    }

    /* renamed from: A */
    private void m9052A() throws IOException {
        if (!this.f6828g) {
            throw mo24415z("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: B */
    private int m9053B() throws IOException {
        int[] iArr = this.f6825c;
        int i = this.f6824a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int E = m9056E(true);
            this.f6853z.readByte();
            if (E != 44) {
                if (E == 59) {
                    m9052A();
                } else if (E == 93) {
                    this.f6848A = 4;
                    return 4;
                } else {
                    throw mo24415z("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int E2 = m9056E(true);
                this.f6853z.readByte();
                if (E2 != 44) {
                    if (E2 == 59) {
                        m9052A();
                    } else if (E2 == 125) {
                        this.f6848A = 2;
                        return 2;
                    } else {
                        throw mo24415z("Unterminated object");
                    }
                }
            }
            int E3 = m9056E(true);
            if (E3 == 34) {
                this.f6853z.readByte();
                this.f6848A = 13;
                return 13;
            } else if (E3 == 39) {
                this.f6853z.readByte();
                m9052A();
                this.f6848A = 12;
                return 12;
            } else if (E3 != 125) {
                m9052A();
                if (m9055D((char) E3)) {
                    this.f6848A = 14;
                    return 14;
                }
                throw mo24415z("Expected name");
            } else if (i2 != 5) {
                this.f6853z.readByte();
                this.f6848A = 2;
                return 2;
            } else {
                throw mo24415z("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int E4 = m9056E(true);
            this.f6853z.readByte();
            if (E4 != 58) {
                if (E4 == 61) {
                    m9052A();
                    if (this.f6852s.request(1) && this.f6853z.mo62435h(0) == 62) {
                        this.f6853z.readByte();
                    }
                } else {
                    throw mo24415z("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m9056E(false) == -1) {
                this.f6848A = 18;
                return 18;
            }
            m9052A();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int E5 = m9056E(true);
        if (E5 == 34) {
            this.f6853z.readByte();
            this.f6848A = 9;
            return 9;
        } else if (E5 != 39) {
            if (!(E5 == 44 || E5 == 59)) {
                if (E5 == 91) {
                    this.f6853z.readByte();
                    this.f6848A = 3;
                    return 3;
                } else if (E5 != 93) {
                    if (E5 != 123) {
                        int H = m9059H();
                        if (H != 0) {
                            return H;
                        }
                        int I = m9060I();
                        if (I != 0) {
                            return I;
                        }
                        if (m9055D(this.f6853z.mo62435h(0))) {
                            m9052A();
                            this.f6848A = 10;
                            return 10;
                        }
                        throw mo24415z("Expected value");
                    }
                    this.f6853z.readByte();
                    this.f6848A = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f6853z.readByte();
                    this.f6848A = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m9052A();
                this.f6848A = 7;
                return 7;
            }
            throw mo24415z("Unexpected value");
        } else {
            m9052A();
            this.f6853z.readByte();
            this.f6848A = 8;
            return 8;
        }
    }

    /* renamed from: C */
    private int m9054C(String str, C2205c.C2206a aVar) {
        int length = aVar.f6830a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f6830a[i])) {
                this.f6848A = 0;
                this.f6826d[this.f6824a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D */
    private boolean m9055D(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m9052A();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f6853z.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f6852s.request(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m9052A();
        r3 = r6.f6853z.mo62435h(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f6853z.readByte();
        r6.f6853z.readByte();
        m9064M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f6853z.readByte();
        r6.f6853z.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m9063L() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw mo24415z("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m9052A();
        m9064M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m9056E(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            cd.d r2 = r6.f6852s
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L_0x0082
            cd.b r2 = r6.f6853z
            long r4 = (long) r1
            byte r1 = r2.mo62435h(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            cd.b r2 = r6.f6853z
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            cd.d r3 = r6.f6852s
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m9052A()
            cd.b r3 = r6.f6853z
            r4 = 1
            byte r3 = r3.mo62435h(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            cd.b r1 = r6.f6853z
            r1.readByte()
            cd.b r1 = r6.f6853z
            r1.readByte()
            r6.m9064M()
            goto L_0x0001
        L_0x005c:
            cd.b r1 = r6.f6853z
            r1.readByte()
            cd.b r1 = r6.f6853z
            r1.readByte()
            boolean r1 = r6.m9063L()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            z.b r7 = r6.mo24415z(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m9052A()
            r6.m9064M()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p055z.C2209e.m9056E(boolean):int");
    }

    /* renamed from: F */
    private String m9057F(C11188e eVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long o0 = this.f6852s.mo62444o0(eVar);
            if (o0 == -1) {
                throw mo24415z("Unterminated string");
            } else if (this.f6853z.mo62435h(o0) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f6853z.mo62395A(o0));
                this.f6853z.readByte();
                sb.append(m9061J());
            } else if (sb == null) {
                String A = this.f6853z.mo62395A(o0);
                this.f6853z.readByte();
                return A;
            } else {
                sb.append(this.f6853z.mo62395A(o0));
                this.f6853z.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: G */
    private String m9058G() throws IOException {
        long o0 = this.f6852s.mo62444o0(f6845G);
        return o0 != -1 ? this.f6853z.mo62395A(o0) : this.f6853z.mo62471z();
    }

    /* renamed from: H */
    private int m9059H() throws IOException {
        String str;
        String str2;
        int i;
        byte h = this.f6853z.mo62435h(0);
        if (h == 116 || h == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (h == 102 || h == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (h != 110 && h != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f6852s.request((long) i3)) {
                return 0;
            }
            byte h2 = this.f6853z.mo62435h((long) i2);
            if (h2 != str2.charAt(i2) && h2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f6852s.request((long) (length + 1)) && m9055D(this.f6853z.mo62435h((long) length))) {
            return 0;
        }
        this.f6853z.skip((long) length);
        this.f6848A = i;
        return i;
    }

    /* renamed from: I */
    private int m9060I() throws IOException {
        byte h;
        boolean z = true;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f6852s.request((long) i3)) {
                break;
            }
            h = this.f6853z.mo62435h((long) i2);
            if (h != 43) {
                if (h != 69 && h != 101) {
                    if (h != 45) {
                        if (h != 46) {
                            if (h >= 48 && h <= 57) {
                                if (c == z || c == 0) {
                                    j = (long) (-(h - 48));
                                    i = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j == 0) {
                                            return i;
                                        }
                                        long j2 = (10 * j) - ((long) (h - 48));
                                        int i4 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                                        z2 &= i4 > 0 || (i4 == 0 && j2 < j);
                                        j = j2;
                                    } else if (c == 3) {
                                        i = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i = 0;
                                        c = 7;
                                    }
                                    i = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i;
                    }
                    i2 = i3;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i;
                } else {
                    c = 5;
                    i2 = i3;
                    z = true;
                }
            } else if (c != 5) {
                return i;
            }
            c = 6;
            i2 = i3;
            z = true;
        }
        if (m9055D(h)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f6849B = j;
            this.f6853z.skip((long) i2);
            this.f6848A = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f6850C = i2;
            this.f6848A = 17;
            return 17;
        }
    }

    /* renamed from: J */
    private char m9061J() throws IOException {
        int i;
        int i2;
        if (this.f6852s.request(1)) {
            byte readByte = this.f6853z.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f6828g) {
                    return (char) readByte;
                }
                throw mo24415z("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f6852s.request(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte h = this.f6853z.mo62435h((long) i3);
                    char c2 = (char) (c << 4);
                    if (h < 48 || h > 57) {
                        if (h >= 97 && h <= 102) {
                            i = h - 97;
                        } else if (h < 65 || h > 70) {
                            throw mo24415z("\\u" + this.f6853z.mo62395A(4));
                        } else {
                            i = h - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = h - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f6853z.skip(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
        } else {
            throw mo24415z("Unterminated escape sequence");
        }
    }

    /* renamed from: K */
    private void m9062K(C11188e eVar) throws IOException {
        while (true) {
            long o0 = this.f6852s.mo62444o0(eVar);
            if (o0 == -1) {
                throw mo24415z("Unterminated string");
            } else if (this.f6853z.mo62435h(o0) == 92) {
                this.f6853z.skip(o0 + 1);
                m9061J();
            } else {
                this.f6853z.skip(o0 + 1);
                return;
            }
        }
    }

    /* renamed from: L */
    private boolean m9063L() throws IOException {
        C11186d dVar = this.f6852s;
        C11188e eVar = f6847I;
        long a0 = dVar.mo62422a0(eVar);
        boolean z = a0 != -1;
        C11179b bVar = this.f6853z;
        bVar.skip(z ? a0 + ((long) eVar.mo62485C()) : bVar.mo62399D());
        return z;
    }

    /* renamed from: M */
    private void m9064M() throws IOException {
        long o0 = this.f6852s.mo62444o0(f6846H);
        C11179b bVar = this.f6853z;
        bVar.skip(o0 != -1 ? o0 + 1 : bVar.mo62399D());
    }

    /* renamed from: N */
    private void m9065N() throws IOException {
        long o0 = this.f6852s.mo62444o0(f6845G);
        C11179b bVar = this.f6853z;
        if (o0 == -1) {
            o0 = bVar.mo62399D();
        }
        bVar.skip(o0);
    }

    /* renamed from: c */
    public void mo24399c() throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 3) {
            mo24411u(1);
            this.f6827f[this.f6824a - 1] = 0;
            this.f6848A = 0;
            return;
        }
        throw new C2203a("Expected BEGIN_ARRAY but was " + mo24410s() + " at path " + getPath());
    }

    public void close() throws IOException {
        this.f6848A = 0;
        this.f6825c[0] = 8;
        this.f6824a = 1;
        this.f6853z.mo62424b();
        this.f6852s.close();
    }

    /* renamed from: e */
    public void mo24400e() throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 1) {
            mo24411u(3);
            this.f6848A = 0;
            return;
        }
        throw new C2203a("Expected BEGIN_OBJECT but was " + mo24410s() + " at path " + getPath());
    }

    /* renamed from: f */
    public void mo24401f() throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 4) {
            int i2 = this.f6824a - 1;
            this.f6824a = i2;
            int[] iArr = this.f6827f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6848A = 0;
            return;
        }
        throw new C2203a("Expected END_ARRAY but was " + mo24410s() + " at path " + getPath());
    }

    /* renamed from: g */
    public void mo24402g() throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 2) {
            int i2 = this.f6824a - 1;
            this.f6824a = i2;
            this.f6826d[i2] = null;
            int[] iArr = this.f6827f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6848A = 0;
            return;
        }
        throw new C2203a("Expected END_OBJECT but was " + mo24410s() + " at path " + getPath());
    }

    /* renamed from: h */
    public boolean mo24404h() throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: i */
    public boolean mo24405i() throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 5) {
            this.f6848A = 0;
            int[] iArr = this.f6827f;
            int i2 = this.f6824a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f6848A = 0;
            int[] iArr2 = this.f6827f;
            int i3 = this.f6824a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C2203a("Expected a boolean but was " + mo24410s() + " at path " + getPath());
        }
    }

    /* renamed from: j */
    public double mo24406j() throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 16) {
            this.f6848A = 0;
            int[] iArr = this.f6827f;
            int i2 = this.f6824a - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f6849B;
        }
        if (i == 17) {
            this.f6851D = this.f6853z.mo62395A((long) this.f6850C);
        } else if (i == 9) {
            this.f6851D = m9057F(f6844F);
        } else if (i == 8) {
            this.f6851D = m9057F(f6843E);
        } else if (i == 10) {
            this.f6851D = m9058G();
        } else if (i != 11) {
            throw new C2203a("Expected a double but was " + mo24410s() + " at path " + getPath());
        }
        this.f6848A = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6851D);
            if (this.f6828g || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f6851D = null;
                this.f6848A = 0;
                int[] iArr2 = this.f6827f;
                int i3 = this.f6824a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new C2204b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new C2203a("Expected a double but was " + this.f6851D + " at path " + getPath());
        }
    }

    /* renamed from: m */
    public int mo24407m() throws IOException {
        String str;
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 16) {
            long j = this.f6849B;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f6848A = 0;
                int[] iArr = this.f6827f;
                int i3 = this.f6824a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C2203a("Expected an int but was " + this.f6849B + " at path " + getPath());
        }
        if (i == 17) {
            this.f6851D = this.f6853z.mo62395A((long) this.f6850C);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m9057F(f6844F);
            } else {
                str = m9057F(f6843E);
            }
            this.f6851D = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f6848A = 0;
                int[] iArr2 = this.f6827f;
                int i4 = this.f6824a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C2203a("Expected an int but was " + mo24410s() + " at path " + getPath());
        }
        this.f6848A = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6851D);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f6851D = null;
                this.f6848A = 0;
                int[] iArr3 = this.f6827f;
                int i6 = this.f6824a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C2203a("Expected an int but was " + this.f6851D + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C2203a("Expected an int but was " + this.f6851D + " at path " + getPath());
        }
    }

    /* renamed from: o */
    public String mo24408o() throws IOException {
        String str;
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 14) {
            str = m9058G();
        } else if (i == 13) {
            str = m9057F(f6844F);
        } else if (i == 12) {
            str = m9057F(f6843E);
        } else if (i == 15) {
            str = this.f6851D;
        } else {
            throw new C2203a("Expected a name but was " + mo24410s() + " at path " + getPath());
        }
        this.f6848A = 0;
        this.f6826d[this.f6824a - 1] = str;
        return str;
    }

    /* renamed from: p */
    public String mo24409p() throws IOException {
        String str;
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i == 10) {
            str = m9058G();
        } else if (i == 9) {
            str = m9057F(f6844F);
        } else if (i == 8) {
            str = m9057F(f6843E);
        } else if (i == 11) {
            str = this.f6851D;
            this.f6851D = null;
        } else if (i == 16) {
            str = Long.toString(this.f6849B);
        } else if (i == 17) {
            str = this.f6853z.mo62395A((long) this.f6850C);
        } else {
            throw new C2203a("Expected a string but was " + mo24410s() + " at path " + getPath());
        }
        this.f6848A = 0;
        int[] iArr = this.f6827f;
        int i2 = this.f6824a - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: s */
    public C2205c.C2207b mo24410s() throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        switch (i) {
            case 1:
                return C2205c.C2207b.BEGIN_OBJECT;
            case 2:
                return C2205c.C2207b.END_OBJECT;
            case 3:
                return C2205c.C2207b.BEGIN_ARRAY;
            case 4:
                return C2205c.C2207b.END_ARRAY;
            case 5:
            case 6:
                return C2205c.C2207b.BOOLEAN;
            case 7:
                return C2205c.C2207b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C2205c.C2207b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C2205c.C2207b.NAME;
            case 16:
            case 17:
                return C2205c.C2207b.NUMBER;
            case 18:
                return C2205c.C2207b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonReader(" + this.f6852s + ")";
    }

    /* renamed from: v */
    public int mo24412v(C2205c.C2206a aVar) throws IOException {
        int i = this.f6848A;
        if (i == 0) {
            i = m9053B();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m9054C(this.f6851D, aVar);
        }
        int U1 = this.f6852s.mo62418U1(aVar.f6831b);
        if (U1 != -1) {
            this.f6848A = 0;
            this.f6826d[this.f6824a - 1] = aVar.f6830a[U1];
            return U1;
        }
        String str = this.f6826d[this.f6824a - 1];
        String o = mo24408o();
        int C = m9054C(o, aVar);
        if (C == -1) {
            this.f6848A = 15;
            this.f6851D = o;
            this.f6826d[this.f6824a - 1] = str;
        }
        return C;
    }

    /* renamed from: w */
    public void mo24413w() throws IOException {
        if (!this.f6829o) {
            int i = this.f6848A;
            if (i == 0) {
                i = m9053B();
            }
            if (i == 14) {
                m9065N();
            } else if (i == 13) {
                m9062K(f6844F);
            } else if (i == 12) {
                m9062K(f6843E);
            } else if (i != 15) {
                throw new C2203a("Expected a name but was " + mo24410s() + " at path " + getPath());
            }
            this.f6848A = 0;
            this.f6826d[this.f6824a - 1] = "null";
            return;
        }
        throw new C2203a("Cannot skip unexpected " + mo24410s() + " at " + getPath());
    }

    /* renamed from: x */
    public void mo24414x() throws IOException {
        if (!this.f6829o) {
            int i = 0;
            do {
                int i2 = this.f6848A;
                if (i2 == 0) {
                    i2 = m9053B();
                }
                if (i2 == 3) {
                    mo24411u(1);
                } else if (i2 == 1) {
                    mo24411u(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f6824a--;
                        } else {
                            throw new C2203a("Expected a value but was " + mo24410s() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f6824a--;
                        } else {
                            throw new C2203a("Expected a value but was " + mo24410s() + " at path " + getPath());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m9065N();
                    } else if (i2 == 9 || i2 == 13) {
                        m9062K(f6844F);
                    } else if (i2 == 8 || i2 == 12) {
                        m9062K(f6843E);
                    } else if (i2 == 17) {
                        this.f6853z.skip((long) this.f6850C);
                    } else if (i2 == 18) {
                        throw new C2203a("Expected a value but was " + mo24410s() + " at path " + getPath());
                    }
                    this.f6848A = 0;
                }
                i++;
                this.f6848A = 0;
            } while (i != 0);
            int[] iArr = this.f6827f;
            int i3 = this.f6824a;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f6826d[i3 - 1] = "null";
            return;
        }
        throw new C2203a("Cannot skip unexpected " + mo24410s() + " at " + getPath());
    }
}
