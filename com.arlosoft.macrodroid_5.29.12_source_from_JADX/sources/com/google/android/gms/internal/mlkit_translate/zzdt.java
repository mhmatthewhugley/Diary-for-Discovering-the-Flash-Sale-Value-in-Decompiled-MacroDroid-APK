package com.google.android.gms.internal.mlkit_translate;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.apache.commons.p353io.FilenameUtils;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzdt implements Closeable {

    /* renamed from: A */
    private int f43248A;

    /* renamed from: B */
    private int[] f43249B;

    /* renamed from: C */
    private int f43250C;

    /* renamed from: D */
    private String[] f43251D;

    /* renamed from: E */
    private int[] f43252E;

    /* renamed from: a */
    private final Reader f43253a;

    /* renamed from: c */
    private boolean f43254c = false;

    /* renamed from: d */
    private final char[] f43255d = new char[1024];

    /* renamed from: f */
    private int f43256f = 0;

    /* renamed from: g */
    private int f43257g = 0;

    /* renamed from: o */
    private int f43258o = 0;

    /* renamed from: p */
    private int f43259p = 0;

    /* renamed from: s */
    int f43260s = 0;

    /* renamed from: z */
    private long f43261z;

    static {
        zzbz.f43166a = new zzds();
    }

    public zzdt(Reader reader) {
        int[] iArr = new int[32];
        this.f43249B = iArr;
        this.f43250C = 1;
        iArr[0] = 6;
        this.f43251D = new String[32];
        this.f43252E = new int[32];
        this.f43253a = reader;
    }

    /* renamed from: A */
    private final void m61733A(int i) {
        int i2 = this.f43250C;
        int[] iArr = this.f43249B;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.f43249B = Arrays.copyOf(iArr, i3);
            this.f43252E = Arrays.copyOf(this.f43252E, i3);
            this.f43251D = (String[]) Arrays.copyOf(this.f43251D, i3);
        }
        int[] iArr2 = this.f43249B;
        int i4 = this.f43250C;
        this.f43250C = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: B */
    private final void m61734B() throws IOException {
        char c;
        do {
            if (this.f43256f < this.f43257g || m61735C(1)) {
                char[] cArr = this.f43255d;
                int i = this.f43256f;
                int i2 = i + 1;
                this.f43256f = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f43258o++;
                    this.f43259p = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: C */
    private final boolean m61735C(int i) throws IOException {
        int i2;
        char[] cArr = this.f43255d;
        int i3 = this.f43259p;
        int i4 = this.f43256f;
        this.f43259p = i3 - i4;
        int i5 = this.f43257g;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f43257g = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f43257g = 0;
        }
        this.f43256f = 0;
        do {
            Reader reader = this.f43253a;
            int i7 = this.f43257g;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.f43257g + read;
            this.f43257g = i2;
            if (this.f43258o == 0 && this.f43259p == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f43256f++;
                this.f43259p = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: D */
    private final boolean m61736D(char c) throws IOException {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m61741z();
        return false;
    }

    /* renamed from: v */
    private final int m61737v(boolean z) throws IOException {
        char[] cArr = this.f43255d;
        int i = this.f43256f;
        int i2 = this.f43257g;
        while (true) {
            if (i == i2) {
                this.f43256f = i;
                if (m61735C(1)) {
                    i = this.f43256f;
                    i2 = this.f43257g;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input".concat(mo52172c()));
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f43258o++;
                this.f43259p = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f43256f = i3;
                    if (i3 == i2) {
                        this.f43256f = i3 - 1;
                        boolean C = m61735C(2);
                        this.f43256f++;
                        if (!C) {
                            return 47;
                        }
                    }
                    m61741z();
                    int i4 = this.f43256f;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f43256f = i4 + 1;
                        while (true) {
                            if (this.f43256f + 2 <= this.f43257g || m61735C(2)) {
                                char[] cArr2 = this.f43255d;
                                int i5 = this.f43256f;
                                if (cArr2[i5] != 10) {
                                    int i6 = 0;
                                    while (i6 < 2) {
                                        if (this.f43255d[this.f43256f + i6] == "*/".charAt(i6)) {
                                            i6++;
                                        }
                                    }
                                    i = 2 + this.f43256f;
                                    i2 = this.f43257g;
                                    break;
                                }
                                this.f43258o++;
                                this.f43259p = i5 + 1;
                                this.f43256f++;
                            } else {
                                throw m61738w("Unterminated comment");
                            }
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.f43256f = i4 + 1;
                        m61734B();
                        i = this.f43256f;
                        i2 = this.f43257g;
                    }
                } else if (c == '#') {
                    this.f43256f = i3;
                    m61741z();
                    m61734B();
                    i = this.f43256f;
                    i2 = this.f43257g;
                } else {
                    this.f43256f = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: w */
    private final IOException m61738w(String str) throws IOException {
        throw new zzdw(str.concat(mo52172c()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x011c, code lost:
        if (r1 != null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x011e, code lost:
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x012b, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.f43256f = r2;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m61739x(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f43255d
            r1 = 0
        L_0x0003:
            int r2 = r10.f43256f
            int r3 = r10.f43257g
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x011c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r11) goto L_0x0029
            r10.f43256f = r7
            int r7 = r7 - r3
            int r7 = r7 + -1
            if (r1 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            return r11
        L_0x0021:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            return r11
        L_0x0029:
            r8 = 92
            r9 = 10
            if (r2 != r8) goto L_0x0110
            r10.f43256f = r7
            int r7 = r7 - r3
            int r7 = r7 + -1
            if (r1 != 0) goto L_0x0043
            int r1 = r7 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0043:
            r1.append(r0, r3, r7)
            int r2 = r10.f43256f
            int r3 = r10.f43257g
            java.lang.String r4 = "Unterminated escape sequence"
            if (r2 != r3) goto L_0x005a
            boolean r2 = r10.m61735C(r6)
            if (r2 == 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            java.io.IOException r11 = r10.m61738w(r4)
            throw r11
        L_0x005a:
            char[] r2 = r10.f43255d
            int r3 = r10.f43256f
            int r5 = r3 + 1
            r10.f43256f = r5
            char r2 = r2[r3]
            if (r2 == r9) goto L_0x00ff
            r3 = 34
            if (r2 == r3) goto L_0x0106
            r3 = 39
            if (r2 == r3) goto L_0x0106
            r3 = 47
            if (r2 == r3) goto L_0x0106
            if (r2 == r8) goto L_0x0106
            r3 = 98
            if (r2 == r3) goto L_0x00fc
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x00f9
            r6 = 110(0x6e, float:1.54E-43)
            if (r2 == r6) goto L_0x0107
            r6 = 114(0x72, float:1.6E-43)
            if (r2 == r6) goto L_0x00f6
            r6 = 116(0x74, float:1.63E-43)
            if (r2 == r6) goto L_0x00f3
            r6 = 117(0x75, float:1.64E-43)
            if (r2 != r6) goto L_0x00ec
            int r5 = r5 + 4
            int r2 = r10.f43257g
            r6 = 4
            if (r5 <= r2) goto L_0x009f
            boolean r2 = r10.m61735C(r6)
            if (r2 == 0) goto L_0x009a
            goto L_0x009f
        L_0x009a:
            java.io.IOException r11 = r10.m61738w(r4)
            throw r11
        L_0x009f:
            int r2 = r10.f43256f
            int r4 = r2 + 4
            r5 = 0
            r9 = 0
        L_0x00a5:
            if (r2 >= r4) goto L_0x00e6
            char[] r5 = r10.f43255d
            char r7 = r5[r2]
            int r8 = r9 << 4
            char r8 = (char) r8
            r9 = 48
            if (r7 < r9) goto L_0x00bc
            r9 = 57
            if (r7 > r9) goto L_0x00bc
            int r7 = r7 + -48
        L_0x00b8:
            int r8 = r8 + r7
            char r5 = (char) r8
            r9 = r5
            goto L_0x00d0
        L_0x00bc:
            r9 = 97
            if (r7 < r9) goto L_0x00c5
            if (r7 > r3) goto L_0x00c5
            int r7 = r7 + -87
            goto L_0x00b8
        L_0x00c5:
            r9 = 65
            if (r7 < r9) goto L_0x00d3
            r9 = 70
            if (r7 > r9) goto L_0x00d3
            int r7 = r7 + -55
            goto L_0x00b8
        L_0x00d0:
            int r2 = r2 + 1
            goto L_0x00a5
        L_0x00d3:
            java.lang.NumberFormatException r11 = new java.lang.NumberFormatException
            java.lang.String r0 = new java.lang.String
            int r1 = r10.f43256f
            r0.<init>(r5, r1, r6)
            java.lang.String r1 = "\\u"
            java.lang.String r0 = r1.concat(r0)
            r11.<init>(r0)
            throw r11
        L_0x00e6:
            int r2 = r10.f43256f
            int r2 = r2 + r6
            r10.f43256f = r2
            goto L_0x0107
        L_0x00ec:
            java.lang.String r11 = "Invalid escape sequence"
            java.io.IOException r11 = r10.m61738w(r11)
            throw r11
        L_0x00f3:
            r9 = 9
            goto L_0x0107
        L_0x00f6:
            r9 = 13
            goto L_0x0107
        L_0x00f9:
            r9 = 12
            goto L_0x0107
        L_0x00fc:
            r9 = 8
            goto L_0x0107
        L_0x00ff:
            int r3 = r10.f43258o
            int r3 = r3 + r6
            r10.f43258o = r3
            r10.f43259p = r5
        L_0x0106:
            r9 = r2
        L_0x0107:
            r1.append(r9)
            int r2 = r10.f43256f
            int r3 = r10.f43257g
            goto L_0x0007
        L_0x0110:
            if (r2 != r9) goto L_0x0119
            int r2 = r10.f43258o
            int r2 = r2 + r6
            r10.f43258o = r2
            r10.f43259p = r7
        L_0x0119:
            r2 = r7
            goto L_0x0009
        L_0x011c:
            if (r1 != 0) goto L_0x012b
            int r1 = r2 - r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x012b:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f43256f = r2
            boolean r2 = r10.m61735C(r6)
            if (r2 == 0) goto L_0x013a
            goto L_0x0003
        L_0x013a:
            java.lang.String r11 = "Unterminated string"
            java.io.IOException r11 = r10.m61738w(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_translate.zzdt.m61739x(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        m61741z();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m61740y() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r5.f43256f
            int r3 = r3 + r2
            int r4 = r5.f43257g
            if (r3 >= r4) goto L_0x004c
            char[] r4 = r5.f43255d
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x0058
            r4 = 10
            if (r3 == r4) goto L_0x0058
            r4 = 12
            if (r3 == r4) goto L_0x0058
            r4 = 13
            if (r3 == r4) goto L_0x0058
            r4 = 32
            if (r3 == r4) goto L_0x0058
            r4 = 35
            if (r3 == r4) goto L_0x0048
            r4 = 44
            if (r3 == r4) goto L_0x0058
            r4 = 47
            if (r3 == r4) goto L_0x0048
            r4 = 61
            if (r3 == r4) goto L_0x0048
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x0058
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x0058
            r4 = 58
            if (r3 == r4) goto L_0x0058
            r4 = 59
            if (r3 == r4) goto L_0x0048
            switch(r3) {
                case 91: goto L_0x0058;
                case 92: goto L_0x0048;
                case 93: goto L_0x0058;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0048:
            r5.m61741z()
            goto L_0x0058
        L_0x004c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L_0x005a
            int r3 = r2 + 1
            boolean r3 = r5.m61735C(r3)
            if (r3 != 0) goto L_0x0003
        L_0x0058:
            r0 = r2
            goto L_0x007a
        L_0x005a:
            if (r1 != 0) goto L_0x0067
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x0067:
            char[] r3 = r5.f43255d
            int r4 = r5.f43256f
            r1.append(r3, r4, r2)
            int r3 = r5.f43256f
            int r3 = r3 + r2
            r5.f43256f = r3
            r2 = 1
            boolean r2 = r5.m61735C(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.f43255d
            int r3 = r5.f43256f
            r1.<init>(r2, r3, r0)
            goto L_0x0091
        L_0x0086:
            char[] r2 = r5.f43255d
            int r3 = r5.f43256f
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0091:
            int r2 = r5.f43256f
            int r2 = r2 + r0
            r5.f43256f = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_translate.zzdt.m61740y():java.lang.String");
    }

    /* renamed from: z */
    private final void m61741z() throws IOException {
        if (!this.f43254c) {
            throw m61738w("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x019f, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0219, code lost:
        if (m61736D(r1) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x021d, code lost:
        if (r9 != 2) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x021f, code lost:
        if (r15 == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0225, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0227, code lost:
        if (r16 == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x022a, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0230, code lost:
        if (r11 != 0) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0232, code lost:
        if (r14 != false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0235, code lost:
        if (r14 == false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0238, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0239, code lost:
        r0.f43261z = r11;
        r0.f43256f += r10;
        r0.f43260s = 15;
        r14 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0247, code lost:
        r1 = 2;
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0249, code lost:
        if (r9 == r1) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x024c, code lost:
        if (r9 == 4) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x024f, code lost:
        if (r9 != 7) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0251, code lost:
        r0.f43248A = r10;
        r0.f43260s = 16;
        r14 = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x029c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52171b() throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f43249B
            int r2 = r0.f43250C
            r3 = -1
            int r2 = r2 + r3
            r4 = r1[r2]
            r6 = 10
            r8 = 39
            r9 = 93
            r10 = 59
            r11 = 44
            r12 = 6
            r13 = 3
            r15 = 4
            r5 = 5
            r7 = 2
            r14 = 1
            if (r4 != r14) goto L_0x0021
            r1[r2] = r7
        L_0x001e:
            r1 = 0
            goto L_0x00dd
        L_0x0021:
            if (r4 != r7) goto L_0x003b
            int r1 = r0.m61737v(r14)
            if (r1 == r11) goto L_0x001e
            if (r1 == r10) goto L_0x0037
            if (r1 != r9) goto L_0x0030
            r0.f43260s = r15
            return r15
        L_0x0030:
            java.lang.String r1 = "Unterminated array"
            java.io.IOException r1 = r0.m61738w(r1)
            throw r1
        L_0x0037:
            r19.m61741z()
            goto L_0x001e
        L_0x003b:
            r7 = 125(0x7d, float:1.75E-43)
            if (r4 == r13) goto L_0x02d8
            if (r4 != r5) goto L_0x0043
            goto L_0x02d8
        L_0x0043:
            if (r4 != r15) goto L_0x0077
            r1[r2] = r5
            int r1 = r0.m61737v(r14)
            r2 = 58
            if (r1 == r2) goto L_0x001e
            r2 = 61
            if (r1 != r2) goto L_0x0070
            r19.m61741z()
            int r1 = r0.f43256f
            int r2 = r0.f43257g
            if (r1 < r2) goto L_0x0062
            boolean r1 = r0.m61735C(r14)
            if (r1 == 0) goto L_0x001e
        L_0x0062:
            char[] r1 = r0.f43255d
            int r2 = r0.f43256f
            char r1 = r1[r2]
            r7 = 62
            if (r1 != r7) goto L_0x001e
            int r2 = r2 + r14
            r0.f43256f = r2
            goto L_0x001e
        L_0x0070:
            java.lang.String r1 = "Expected ':'"
            java.io.IOException r1 = r0.m61738w(r1)
            throw r1
        L_0x0077:
            if (r4 != r12) goto L_0x00c0
            boolean r1 = r0.f43254c
            if (r1 == 0) goto L_0x00b6
            r0.m61737v(r14)
            int r1 = r0.f43256f
            int r1 = r1 + r3
            r0.f43256f = r1
            int r1 = r1 + r5
            int r2 = r0.f43257g
            if (r1 <= r2) goto L_0x0091
            boolean r1 = r0.m61735C(r5)
            if (r1 != 0) goto L_0x0091
            goto L_0x00b6
        L_0x0091:
            int r1 = r0.f43256f
            char[] r2 = r0.f43255d
            char r15 = r2[r1]
            r12 = 41
            if (r15 != r12) goto L_0x00b6
            int r12 = r1 + 1
            char r12 = r2[r12]
            if (r12 != r9) goto L_0x00b6
            int r12 = r1 + 2
            char r12 = r2[r12]
            if (r12 != r7) goto L_0x00b6
            int r7 = r1 + 3
            char r7 = r2[r7]
            if (r7 != r8) goto L_0x00b6
            int r7 = r1 + 4
            char r2 = r2[r7]
            if (r2 != r6) goto L_0x00b6
            int r1 = r1 + r5
            r0.f43256f = r1
        L_0x00b6:
            int[] r1 = r0.f43249B
            int r2 = r0.f43250C
            int r2 = r2 + r3
            r7 = 7
            r1[r2] = r7
            goto L_0x001e
        L_0x00c0:
            r7 = 7
            if (r4 != r7) goto L_0x00d8
            r1 = 0
            int r2 = r0.m61737v(r1)
            if (r2 != r3) goto L_0x00cf
            r1 = 17
            r0.f43260s = r1
            return r1
        L_0x00cf:
            r19.m61741z()
            int r2 = r0.f43256f
            int r2 = r2 + r3
            r0.f43256f = r2
            goto L_0x00dd
        L_0x00d8:
            r1 = 0
            r2 = 8
            if (r4 == r2) goto L_0x02d0
        L_0x00dd:
            int r2 = r0.m61737v(r14)
            r7 = 34
            if (r2 == r7) goto L_0x02cb
            if (r2 == r8) goto L_0x02c3
            if (r2 == r11) goto L_0x02aa
            if (r2 == r10) goto L_0x02aa
            r7 = 91
            if (r2 == r7) goto L_0x02a7
            if (r2 == r9) goto L_0x02a0
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L_0x029d
            int r2 = r0.f43256f
            int r2 = r2 + r3
            r0.f43256f = r2
            char[] r3 = r0.f43255d
            char r2 = r3[r2]
            r3 = 116(0x74, float:1.63E-43)
            if (r2 == r3) goto L_0x0124
            r3 = 84
            if (r2 != r3) goto L_0x0107
            goto L_0x0124
        L_0x0107:
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x011e
            r3 = 70
            if (r2 != r3) goto L_0x0110
            goto L_0x011e
        L_0x0110:
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x0118
            r3 = 78
            if (r2 != r3) goto L_0x0173
        L_0x0118:
            java.lang.String r2 = "null"
            java.lang.String r3 = "NULL"
            r4 = 7
            goto L_0x0129
        L_0x011e:
            java.lang.String r2 = "false"
            java.lang.String r3 = "FALSE"
            r4 = 6
            goto L_0x0129
        L_0x0124:
            java.lang.String r2 = "true"
            java.lang.String r3 = "TRUE"
            r4 = 5
        L_0x0129:
            int r7 = r2.length()
            r8 = 1
        L_0x012e:
            if (r8 >= r7) goto L_0x0157
            int r9 = r0.f43256f
            int r9 = r9 + r8
            int r10 = r0.f43257g
            if (r9 < r10) goto L_0x0140
            int r9 = r8 + 1
            boolean r9 = r0.m61735C(r9)
            if (r9 != 0) goto L_0x0140
            goto L_0x0173
        L_0x0140:
            char[] r9 = r0.f43255d
            int r10 = r0.f43256f
            int r10 = r10 + r8
            char r9 = r9[r10]
            char r10 = r2.charAt(r8)
            if (r9 == r10) goto L_0x0154
            char r10 = r3.charAt(r8)
            if (r9 == r10) goto L_0x0154
            goto L_0x0173
        L_0x0154:
            int r8 = r8 + 1
            goto L_0x012e
        L_0x0157:
            int r2 = r0.f43256f
            int r2 = r2 + r7
            int r3 = r0.f43257g
            if (r2 < r3) goto L_0x0166
            int r2 = r7 + 1
            boolean r2 = r0.m61735C(r2)
            if (r2 == 0) goto L_0x0175
        L_0x0166:
            char[] r2 = r0.f43255d
            int r3 = r0.f43256f
            int r3 = r3 + r7
            char r2 = r2[r3]
            boolean r2 = r0.m61736D(r2)
            if (r2 == 0) goto L_0x0175
        L_0x0173:
            r4 = 0
            goto L_0x017c
        L_0x0175:
            int r2 = r0.f43256f
            int r2 = r2 + r7
            r0.f43256f = r2
            r0.f43260s = r4
        L_0x017c:
            if (r4 != 0) goto L_0x029c
            char[] r2 = r0.f43255d
            int r3 = r0.f43256f
            int r4 = r0.f43257g
            r7 = 0
            r11 = r7
            r9 = 0
            r10 = 0
            r15 = 1
            r16 = 0
        L_0x018c:
            int r1 = r3 + r10
            if (r1 != r4) goto L_0x01a8
            r1 = 1024(0x400, float:1.435E-42)
            if (r10 != r1) goto L_0x0197
        L_0x0194:
            r14 = 0
            goto L_0x027e
        L_0x0197:
            int r1 = r10 + 1
            boolean r1 = r0.m61735C(r1)
            if (r1 != 0) goto L_0x01a2
        L_0x019f:
            r1 = 2
            goto L_0x021d
        L_0x01a2:
            int r1 = r0.f43256f
            int r3 = r0.f43257g
            r4 = r3
            r3 = r1
        L_0x01a8:
            int r1 = r3 + r10
            char r1 = r2[r1]
            r6 = 43
            if (r1 == r6) goto L_0x0274
            r6 = 69
            if (r1 == r6) goto L_0x026b
            r6 = 101(0x65, float:1.42E-43)
            if (r1 == r6) goto L_0x026b
            r6 = 45
            if (r1 == r6) goto L_0x0260
            r6 = 46
            if (r1 == r6) goto L_0x025a
            r6 = 48
            if (r1 < r6) goto L_0x0215
            r6 = 57
            if (r1 <= r6) goto L_0x01c9
            goto L_0x0215
        L_0x01c9:
            if (r9 == r14) goto L_0x020b
            if (r9 != 0) goto L_0x01ce
            goto L_0x020b
        L_0x01ce:
            r6 = 2
            if (r9 != r6) goto L_0x01fa
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01d6
            goto L_0x0194
        L_0x01d6:
            r17 = 10
            long r17 = r17 * r11
            int r1 = r1 + -48
            long r7 = (long) r1
            long r17 = r17 - r7
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x01f1
            if (r1 != 0) goto L_0x01ef
            int r1 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x01ef
            goto L_0x01f1
        L_0x01ef:
            r1 = 0
            goto L_0x01f2
        L_0x01f1:
            r1 = 1
        L_0x01f2:
            r15 = r15 & r1
            r11 = r17
            r6 = 6
            r7 = 0
            goto L_0x0278
        L_0x01fa:
            r6 = 6
            if (r9 != r13) goto L_0x0202
            r7 = 0
            r9 = 4
            goto L_0x0278
        L_0x0202:
            r7 = 0
            if (r9 == r5) goto L_0x0208
            if (r9 != r6) goto L_0x0278
        L_0x0208:
            r9 = 7
            goto L_0x0278
        L_0x020b:
            r6 = 6
            int r1 = r1 + -48
            int r1 = -r1
            long r11 = (long) r1
            r7 = 0
            r9 = 2
            goto L_0x0278
        L_0x0215:
            boolean r1 = r0.m61736D(r1)
            if (r1 == 0) goto L_0x019f
            goto L_0x0194
        L_0x021d:
            if (r9 != r1) goto L_0x0249
            if (r15 == 0) goto L_0x0247
            r1 = -9223372036854775808
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x022a
            if (r16 == 0) goto L_0x0247
            goto L_0x022c
        L_0x022a:
            r14 = r16
        L_0x022c:
            r7 = 0
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0235
            if (r14 != 0) goto L_0x0247
            goto L_0x0238
        L_0x0235:
            if (r14 == 0) goto L_0x0238
            goto L_0x0239
        L_0x0238:
            long r11 = -r11
        L_0x0239:
            r0.f43261z = r11
            int r1 = r0.f43256f
            int r1 = r1 + r10
            r0.f43256f = r1
            r1 = 15
            r0.f43260s = r1
            r14 = 15
            goto L_0x027e
        L_0x0247:
            r1 = 2
            r9 = 2
        L_0x0249:
            if (r9 == r1) goto L_0x0251
            r1 = 4
            if (r9 == r1) goto L_0x0251
            r1 = 7
            if (r9 != r1) goto L_0x0194
        L_0x0251:
            r0.f43248A = r10
            r1 = 16
            r0.f43260s = r1
            r14 = 16
            goto L_0x027e
        L_0x025a:
            r1 = 2
            r6 = 6
            if (r9 != r1) goto L_0x0194
            r9 = 3
            goto L_0x0278
        L_0x0260:
            r1 = 2
            r6 = 6
            if (r9 != 0) goto L_0x0268
            r9 = 1
            r16 = 1
            goto L_0x0278
        L_0x0268:
            if (r9 != r5) goto L_0x0194
            goto L_0x0277
        L_0x026b:
            r1 = 2
            r6 = 6
            if (r9 == r1) goto L_0x0272
            r1 = 4
            if (r9 != r1) goto L_0x0194
        L_0x0272:
            r9 = 5
            goto L_0x0278
        L_0x0274:
            r6 = 6
            if (r9 != r5) goto L_0x0194
        L_0x0277:
            r9 = 6
        L_0x0278:
            int r10 = r10 + 1
            r6 = 10
            goto L_0x018c
        L_0x027e:
            if (r14 == 0) goto L_0x0281
            return r14
        L_0x0281:
            char[] r1 = r0.f43255d
            int r2 = r0.f43256f
            char r1 = r1[r2]
            boolean r1 = r0.m61736D(r1)
            if (r1 == 0) goto L_0x0295
            r19.m61741z()
            r1 = 10
            r0.f43260s = r1
            return r1
        L_0x0295:
            java.lang.String r1 = "Expected value"
            java.io.IOException r1 = r0.m61738w(r1)
            throw r1
        L_0x029c:
            return r4
        L_0x029d:
            r0.f43260s = r14
            return r14
        L_0x02a0:
            if (r4 == r14) goto L_0x02a3
            goto L_0x02aa
        L_0x02a3:
            r1 = 4
            r0.f43260s = r1
            return r1
        L_0x02a7:
            r0.f43260s = r13
            return r13
        L_0x02aa:
            if (r4 == r14) goto L_0x02b7
            r1 = 2
            if (r4 != r1) goto L_0x02b0
            goto L_0x02b7
        L_0x02b0:
            java.lang.String r1 = "Unexpected value"
            java.io.IOException r1 = r0.m61738w(r1)
            throw r1
        L_0x02b7:
            r19.m61741z()
            int r1 = r0.f43256f
            int r1 = r1 + r3
            r0.f43256f = r1
            r1 = 7
            r0.f43260s = r1
            return r1
        L_0x02c3:
            r19.m61741z()
            r1 = 8
            r0.f43260s = r1
            return r1
        L_0x02cb:
            r1 = 9
            r0.f43260s = r1
            return r1
        L_0x02d0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02d8:
            r6 = 4
            r1[r2] = r6
            if (r4 != r5) goto L_0x02f5
            int r1 = r0.m61737v(r14)
            if (r1 == r11) goto L_0x02f5
            if (r1 == r10) goto L_0x02f2
            if (r1 != r7) goto L_0x02eb
            r1 = 2
            r0.f43260s = r1
            return r1
        L_0x02eb:
            java.lang.String r1 = "Unterminated object"
            java.io.IOException r1 = r0.m61738w(r1)
            throw r1
        L_0x02f2:
            r19.m61741z()
        L_0x02f5:
            int r1 = r0.m61737v(r14)
            r2 = 34
            if (r1 == r2) goto L_0x032f
            if (r1 == r8) goto L_0x0327
            java.lang.String r2 = "Expected name"
            if (r1 == r7) goto L_0x031c
            r19.m61741z()
            int r4 = r0.f43256f
            int r4 = r4 + r3
            r0.f43256f = r4
            char r1 = (char) r1
            boolean r1 = r0.m61736D(r1)
            if (r1 == 0) goto L_0x0317
            r1 = 14
            r0.f43260s = r1
            return r1
        L_0x0317:
            java.io.IOException r1 = r0.m61738w(r2)
            throw r1
        L_0x031c:
            if (r4 == r5) goto L_0x0322
            r1 = 2
            r0.f43260s = r1
            return r1
        L_0x0322:
            java.io.IOException r1 = r0.m61738w(r2)
            throw r1
        L_0x0327:
            r19.m61741z()
            r1 = 12
            r0.f43260s = r1
            return r1
        L_0x032f:
            r1 = 13
            r0.f43260s = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_translate.zzdt.mo52171b():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo52172c() {
        int i = this.f43258o;
        int i2 = this.f43256f;
        int i3 = this.f43259p;
        StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i4 = 0; i4 < this.f43250C; i4++) {
            int i5 = this.f43249B[i4];
            if (i5 == 1 || i5 == 2) {
                int i6 = this.f43252E[i4];
                sb2.append('[');
                sb2.append(i6);
                sb2.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb2.append(FilenameUtils.EXTENSION_SEPARATOR);
                String str = this.f43251D[i4];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public final void close() throws IOException {
        this.f43260s = 0;
        this.f43249B[0] = 8;
        this.f43250C = 1;
        this.f43253a.close();
    }

    /* renamed from: e */
    public final String mo52174e() throws IOException {
        String str;
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        if (i == 14) {
            str = m61740y();
        } else if (i == 12) {
            str = m61739x('\'');
        } else if (i == 13) {
            str = m61739x('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + zzdu.m61756a(mo52186u()) + mo52172c());
        }
        this.f43260s = 0;
        this.f43251D[this.f43250C - 1] = str;
        return str;
    }

    /* renamed from: f */
    public final String mo52175f() throws IOException {
        String str;
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        if (i == 10) {
            str = m61740y();
        } else if (i == 8) {
            str = m61739x('\'');
        } else if (i == 9) {
            str = m61739x('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.f43261z);
        } else if (i == 16) {
            str = new String(this.f43255d, this.f43256f, this.f43248A);
            this.f43256f += this.f43248A;
        } else {
            throw new IllegalStateException("Expected a string but was " + zzdu.m61756a(mo52186u()) + mo52172c());
        }
        this.f43260s = 0;
        int[] iArr = this.f43252E;
        int i2 = this.f43250C - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: g */
    public final void mo52176g() throws IOException {
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        if (i == 3) {
            m61733A(1);
            this.f43252E[this.f43250C - 1] = 0;
            this.f43260s = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + zzdu.m61756a(mo52186u()) + mo52172c());
    }

    /* renamed from: h */
    public final void mo52177h() throws IOException {
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        if (i == 1) {
            m61733A(3);
            this.f43260s = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + zzdu.m61756a(mo52186u()) + mo52172c());
    }

    /* renamed from: i */
    public final void mo52178i() throws IOException {
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        if (i == 4) {
            int i2 = this.f43250C - 1;
            this.f43250C = i2;
            int[] iArr = this.f43252E;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f43260s = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + zzdu.m61756a(mo52186u()) + mo52172c());
    }

    /* renamed from: j */
    public final void mo52179j() throws IOException {
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        if (i == 2) {
            int i2 = this.f43250C - 1;
            this.f43250C = i2;
            this.f43251D[i2] = null;
            int[] iArr = this.f43252E;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f43260s = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + zzdu.m61756a(mo52186u()) + mo52172c());
    }

    /* renamed from: m */
    public final void mo52180m() throws IOException {
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        if (i == 7) {
            this.f43260s = 0;
            int[] iArr = this.f43252E;
            int i2 = this.f43250C - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + zzdu.m61756a(mo52186u()) + mo52172c());
    }

    /* renamed from: o */
    public final void mo52181o(boolean z) {
        this.f43254c = z;
    }

    /* renamed from: p */
    public final boolean mo52182p() throws IOException {
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* renamed from: r */
    public final boolean mo52183r() {
        return this.f43254c;
    }

    /* renamed from: s */
    public final boolean mo52184s() throws IOException {
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        if (i == 5) {
            this.f43260s = 0;
            int[] iArr = this.f43252E;
            int i2 = this.f43250C - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f43260s = 0;
            int[] iArr2 = this.f43252E;
            int i3 = this.f43250C - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + zzdu.m61756a(mo52186u()) + mo52172c());
        }
    }

    public final String toString() {
        return zzdt.class.getSimpleName().concat(mo52172c());
    }

    /* renamed from: u */
    public final int mo52186u() throws IOException {
        int i = this.f43260s;
        if (i == 0) {
            i = mo52171b();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
