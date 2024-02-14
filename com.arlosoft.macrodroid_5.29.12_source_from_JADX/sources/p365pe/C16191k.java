package p365pe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.p353io.IOUtils;
import org.threeten.p356bp.DateTimeException;
import org.threeten.p356bp.temporal.UnsupportedTemporalTypeException;
import p352oe.C15855b;
import p352oe.C15867g;
import p383re.C16501d;
import p392se.C16540a;
import p392se.C16552f;
import p392se.C16556h;
import p392se.C16566k;
import p392se.C16567l;

/* renamed from: pe.k */
/* compiled from: HijrahDate */
public final class C16191k extends C16173a<C16191k> {

    /* renamed from: A */
    private static final int[] f66426A = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: B */
    private static final int[] f66427B = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* renamed from: C */
    private static final int[] f66428C = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* renamed from: D */
    private static final int[] f66429D = {0, 1, 0, 1, 0, 1, 1};

    /* renamed from: E */
    private static final int[] f66430E = {1, 9999, 11, 51, 5, 29, 354};

    /* renamed from: F */
    private static final int[] f66431F = {1, 9999, 11, 52, 6, 30, 355};

    /* renamed from: G */
    private static final int[] f66432G = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    /* renamed from: H */
    private static final char f66433H;

    /* renamed from: I */
    private static final String f66434I = File.pathSeparator;

    /* renamed from: J */
    private static final String f66435J;

    /* renamed from: K */
    private static final HashMap<Integer, Integer[]> f66436K = new HashMap<>();

    /* renamed from: L */
    private static final HashMap<Integer, Integer[]> f66437L = new HashMap<>();

    /* renamed from: M */
    private static final HashMap<Integer, Integer[]> f66438M = new HashMap<>();

    /* renamed from: N */
    private static final Long[] f66439N = new Long[334];

    /* renamed from: O */
    private static final Integer[] f66440O = new Integer[f66429D.length];

    /* renamed from: P */
    private static final Integer[] f66441P = new Integer[f66430E.length];

    /* renamed from: Q */
    private static final Integer[] f66442Q = new Integer[f66431F.length];

    /* renamed from: R */
    private static final Integer[] f66443R;

    /* renamed from: S */
    private static final Integer[] f66444S = new Integer[f66426A.length];

    /* renamed from: T */
    private static final Integer[] f66445T = new Integer[f66427B.length];

    /* renamed from: U */
    private static final Integer[] f66446U = new Integer[f66428C.length];

    /* renamed from: V */
    private static final Integer[] f66447V = new Integer[f66432G.length];
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: z */
    private static final int[] f66448z;

    /* renamed from: c */
    private final transient C16193l f66449c;

    /* renamed from: d */
    private final transient int f66450d;

    /* renamed from: f */
    private final transient int f66451f;

    /* renamed from: g */
    private final transient int f66452g;
    private final long gregorianEpochDay;

    /* renamed from: o */
    private final transient int f66453o;

    /* renamed from: p */
    private final transient C15855b f66454p;

    /* renamed from: s */
    private final transient boolean f66455s;

    /* renamed from: pe.k$a */
    /* compiled from: HijrahDate */
    static /* synthetic */ class C16192a {

        /* renamed from: a */
        static final /* synthetic */ int[] f66456a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                se.a[] r0 = p392se.C16540a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66456a = r0
                se.a r1 = p392se.C16540a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x001d }
                se.a r1 = p392se.C16540a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x0028 }
                se.a r1 = p392se.C16540a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x0033 }
                se.a r1 = p392se.C16540a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x003e }
                se.a r1 = p392se.C16540a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x0049 }
                se.a r1 = p392se.C16540a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x0054 }
                se.a r1 = p392se.C16540a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x0060 }
                se.a r1 = p392se.C16540a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x006c }
                se.a r1 = p392se.C16540a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x0078 }
                se.a r1 = p392se.C16540a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x0084 }
                se.a r1 = p392se.C16540a.YEAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f66456a     // Catch:{ NoSuchFieldError -> 0x0090 }
                se.a r1 = p392se.C16540a.ERA     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p365pe.C16191k.C16192a.<clinit>():void");
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
        f66448z = iArr;
        char c = File.separatorChar;
        f66433H = c;
        f66435J = "org" + c + "threeten" + c + "bp" + c + "chrono";
        f66443R = new Integer[iArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = f66448z;
            if (i2 >= iArr2.length) {
                break;
            }
            f66443R[i2] = Integer.valueOf(iArr2[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            int[] iArr3 = f66426A;
            if (i3 >= iArr3.length) {
                break;
            }
            f66444S[i3] = Integer.valueOf(iArr3[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr4 = f66427B;
            if (i4 >= iArr4.length) {
                break;
            }
            f66445T[i4] = Integer.valueOf(iArr4[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr5 = f66428C;
            if (i5 >= iArr5.length) {
                break;
            }
            f66446U[i5] = Integer.valueOf(iArr5[i5]);
            i5++;
        }
        int i6 = 0;
        while (true) {
            int[] iArr6 = f66432G;
            if (i6 >= iArr6.length) {
                break;
            }
            f66447V[i6] = Integer.valueOf(iArr6[i6]);
            i6++;
        }
        int i7 = 0;
        while (true) {
            Long[] lArr = f66439N;
            if (i7 >= lArr.length) {
                break;
            }
            lArr[i7] = Long.valueOf((long) (i7 * 10631));
            i7++;
        }
        int i8 = 0;
        while (true) {
            int[] iArr7 = f66429D;
            if (i8 >= iArr7.length) {
                break;
            }
            f66440O[i8] = Integer.valueOf(iArr7[i8]);
            i8++;
        }
        int i9 = 0;
        while (true) {
            int[] iArr8 = f66430E;
            if (i9 >= iArr8.length) {
                break;
            }
            f66441P[i9] = Integer.valueOf(iArr8[i9]);
            i9++;
        }
        while (true) {
            int[] iArr9 = f66431F;
            if (i < iArr9.length) {
                f66442Q[i] = Integer.valueOf(iArr9[i]);
                i++;
            } else {
                try {
                    m97222R0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private C16191k(long j) {
        int[] s0 = m97240s0(j);
        m97230Z(s0[1]);
        m97229Y(s0[2]);
        m97226V(s0[3]);
        m97227X(s0[4]);
        this.f66449c = C16193l.m97276i(s0[0]);
        int i = s0[1];
        this.f66450d = i;
        this.f66451f = s0[2];
        this.f66452g = s0[3];
        this.f66453o = s0[4];
        this.f66454p = C15855b.m95488j(s0[5]);
        this.gregorianEpochDay = j;
        this.f66455s = m97217C0((long) i);
    }

    /* renamed from: A0 */
    private static int m97215A0(int i, long j) {
        Integer[] a0 = m97231a0(i);
        int i2 = 0;
        int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i3 == 0) {
            return 0;
        }
        if (i3 > 0) {
            while (i2 < a0.length) {
                if (j < ((long) a0[i2].intValue())) {
                    return i2 - 1;
                }
                i2++;
            }
            return 29;
        }
        long j2 = -j;
        while (i2 < a0.length) {
            if (j2 <= ((long) a0[i2].intValue())) {
                return i2 - 1;
            }
            i2++;
        }
        return 29;
    }

    /* renamed from: B0 */
    static int m97216B0(int i) {
        Integer[] numArr;
        int i2 = i - 1;
        int i3 = i2 / 30;
        try {
            numArr = f66438M.get(Integer.valueOf(i3));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return m97217C0((long) i) ? 355 : 354;
        }
        int i4 = i2 % 30;
        if (i4 != 29) {
            return numArr[i4 + 1].intValue() - numArr[i4].intValue();
        }
        Long[] lArr = f66439N;
        return (lArr[i3 + 1].intValue() - lArr[i3].intValue()) - numArr[i4].intValue();
    }

    /* renamed from: C0 */
    static boolean m97217C0(long j) {
        if (j <= 0) {
            j = -j;
        }
        return ((j * 11) + 14) % 30 < 11;
    }

    /* renamed from: H0 */
    public static C16191k m97218H0(int i, int i2, int i3) {
        if (i >= 1) {
            return m97219I0(C16193l.AH, i, i2, i3);
        }
        return m97219I0(C16193l.BEFORE_AH, 1 - i, i2, i3);
    }

    /* renamed from: I0 */
    static C16191k m97219I0(C16193l lVar, int i, int i2, int i3) {
        C16501d.m98548i(lVar, "era");
        m97230Z(i);
        m97229Y(i2);
        m97226V(i3);
        return new C16191k(m97239r0(lVar.mo78670j(i), i2, i3));
    }

    /* renamed from: J0 */
    static C16191k m97220J0(long j) {
        return new C16191k(j);
    }

    /* renamed from: L0 */
    private static void m97221L0(String str, int i) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                    throw new ParseException("Unknown error at line " + i + ".", i);
                                                }
                                                m97225U(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                            } catch (NumberFormatException unused) {
                                                throw new ParseException("End month is not properly set at line " + i + ".", i);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw new ParseException("End year is not properly set at line " + i + ".", i);
                                        }
                                    } else {
                                        throw new ParseException("End year/month has incorrect format at line " + i + ".", i);
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw new ParseException("Start month is not properly set at line " + i + ".", i);
                                }
                            } catch (NumberFormatException unused4) {
                                throw new ParseException("Start year is not properly set at line " + i + ".", i);
                            }
                        } else {
                            throw new ParseException("Start year/month has incorrect format at line " + i + ".", i);
                        }
                    } else {
                        throw new ParseException("Start and end year/month has incorrect format at line " + i + ".", i);
                    }
                } catch (NumberFormatException unused5) {
                    throw new ParseException("Offset is not properly set at line " + i + ".", i);
                }
            } else {
                throw new ParseException("Offset has incorrect format at line " + i + ".", i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m97222R0() throws java.io.IOException, java.text.ParseException {
        /*
            java.io.InputStream r0 = m97234e0()
            if (r0 == 0) goto L_0x0030
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0029 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0029 }
            r3.<init>(r0)     // Catch:{ all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            r0 = 0
        L_0x0012:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0022
            int r0 = r0 + 1
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0026 }
            m97221L0(r1, r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0012
        L_0x0022:
            r2.close()
            goto L_0x0030
        L_0x0026:
            r0 = move-exception
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r0 = move-exception
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            throw r0
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365pe.C16191k.m97222R0():void");
    }

    /* renamed from: S0 */
    static C16175b m97223S0(DataInput dataInput) throws IOException {
        return C16190j.f66422g.mo78655w(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: T0 */
    private static C16191k m97224T0(int i, int i2, int i3) {
        int v0 = m97243v0(i2 - 1, i);
        if (i3 > v0) {
            i3 = v0;
        }
        return m97218H0(i, i2, i3);
    }

    /* renamed from: U */
    private static void m97225U(int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        if (i6 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        } else if (i8 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        } else if (i7 < 0 || i7 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        } else if (i9 < 0 || i9 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        } else if (i8 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        } else if (i8 < i6) {
            throw new IllegalArgumentException("startYear > endYear");
        } else if (i8 != i6 || i9 >= i7) {
            boolean C0 = m97217C0((long) i6);
            Integer[] numArr = f66436K.get(Integer.valueOf(i));
            if (numArr == null) {
                if (!C0) {
                    numArr = new Integer[f66448z.length];
                    int i11 = 0;
                    while (true) {
                        int[] iArr = f66448z;
                        if (i11 >= iArr.length) {
                            break;
                        }
                        numArr[i11] = Integer.valueOf(iArr[i11]);
                        i11++;
                    }
                } else {
                    numArr = new Integer[f66426A.length];
                    int i12 = 0;
                    while (true) {
                        int[] iArr2 = f66426A;
                        if (i12 >= iArr2.length) {
                            break;
                        }
                        numArr[i12] = Integer.valueOf(iArr2[i12]);
                        i12++;
                    }
                }
            }
            Integer[] numArr2 = new Integer[numArr.length];
            for (int i13 = 0; i13 < 12; i13++) {
                if (i13 > i7) {
                    numArr2[i13] = Integer.valueOf(numArr[i13].intValue() - i10);
                } else {
                    numArr2[i13] = Integer.valueOf(numArr[i13].intValue());
                }
            }
            f66436K.put(Integer.valueOf(i), numArr2);
            Integer[] numArr3 = f66437L.get(Integer.valueOf(i));
            if (numArr3 == null) {
                if (!C0) {
                    numArr3 = new Integer[f66427B.length];
                    int i14 = 0;
                    while (true) {
                        int[] iArr3 = f66427B;
                        if (i14 >= iArr3.length) {
                            break;
                        }
                        numArr3[i14] = Integer.valueOf(iArr3[i14]);
                        i14++;
                    }
                } else {
                    numArr3 = new Integer[f66428C.length];
                    int i15 = 0;
                    while (true) {
                        int[] iArr4 = f66428C;
                        if (i15 >= iArr4.length) {
                            break;
                        }
                        numArr3[i15] = Integer.valueOf(iArr4[i15]);
                        i15++;
                    }
                }
            }
            Integer[] numArr4 = new Integer[numArr3.length];
            for (int i16 = 0; i16 < 12; i16++) {
                if (i16 == i7) {
                    numArr4[i16] = Integer.valueOf(numArr3[i16].intValue() - i10);
                } else {
                    numArr4[i16] = Integer.valueOf(numArr3[i16].intValue());
                }
            }
            f66437L.put(Integer.valueOf(i), numArr4);
            if (i6 != i8) {
                int i17 = i6 - 1;
                int i18 = i17 / 30;
                int i19 = i17 % 30;
                Integer[] numArr5 = f66438M.get(Integer.valueOf(i18));
                if (numArr5 == null) {
                    int length = f66432G.length;
                    Integer[] numArr6 = new Integer[length];
                    for (int i20 = 0; i20 < length; i20++) {
                        numArr6[i20] = Integer.valueOf(f66432G[i20]);
                    }
                    numArr5 = numArr6;
                }
                for (int i21 = i19 + 1; i21 < f66432G.length; i21++) {
                    numArr5[i21] = Integer.valueOf(numArr5[i21].intValue() - i10);
                }
                f66438M.put(Integer.valueOf(i18), numArr5);
                int i22 = i8 - 1;
                int i23 = i22 / 30;
                if (i18 != i23) {
                    int i24 = i18 + 1;
                    while (true) {
                        Long[] lArr = f66439N;
                        if (i24 >= lArr.length) {
                            break;
                        }
                        lArr[i24] = Long.valueOf(lArr[i24].longValue() - ((long) i10));
                        i24++;
                    }
                    int i25 = i23 + 1;
                    while (true) {
                        Long[] lArr2 = f66439N;
                        if (i25 >= lArr2.length) {
                            break;
                        }
                        lArr2[i25] = Long.valueOf(lArr2[i25].longValue() + ((long) i10));
                        i25++;
                        i23 = i23;
                    }
                }
                int i26 = i23;
                int i27 = i22 % 30;
                Integer[] numArr7 = f66438M.get(Integer.valueOf(i26));
                if (numArr7 == null) {
                    int length2 = f66432G.length;
                    Integer[] numArr8 = new Integer[length2];
                    for (int i28 = 0; i28 < length2; i28++) {
                        numArr8[i28] = Integer.valueOf(f66432G[i28]);
                    }
                    numArr7 = numArr8;
                }
                for (int i29 = i27 + 1; i29 < f66432G.length; i29++) {
                    numArr7[i29] = Integer.valueOf(numArr7[i29].intValue() + i10);
                }
                f66438M.put(Integer.valueOf(i26), numArr7);
            }
            boolean C02 = m97217C0((long) i8);
            Integer[] numArr9 = f66436K.get(Integer.valueOf(i3));
            if (numArr9 == null) {
                if (!C02) {
                    numArr9 = new Integer[f66448z.length];
                    int i30 = 0;
                    while (true) {
                        int[] iArr5 = f66448z;
                        if (i30 >= iArr5.length) {
                            break;
                        }
                        numArr9[i30] = Integer.valueOf(iArr5[i30]);
                        i30++;
                    }
                } else {
                    numArr9 = new Integer[f66426A.length];
                    int i31 = 0;
                    while (true) {
                        int[] iArr6 = f66426A;
                        if (i31 >= iArr6.length) {
                            break;
                        }
                        numArr9[i31] = Integer.valueOf(iArr6[i31]);
                        i31++;
                    }
                }
            }
            Integer[] numArr10 = new Integer[numArr9.length];
            for (int i32 = 0; i32 < 12; i32++) {
                if (i32 > i9) {
                    numArr10[i32] = Integer.valueOf(numArr9[i32].intValue() + i10);
                } else {
                    numArr10[i32] = Integer.valueOf(numArr9[i32].intValue());
                }
            }
            f66436K.put(Integer.valueOf(i3), numArr10);
            Integer[] numArr11 = f66437L.get(Integer.valueOf(i3));
            if (numArr11 == null) {
                if (!C02) {
                    numArr11 = new Integer[f66427B.length];
                    int i33 = 0;
                    while (true) {
                        int[] iArr7 = f66427B;
                        if (i33 >= iArr7.length) {
                            break;
                        }
                        numArr11[i33] = Integer.valueOf(iArr7[i33]);
                        i33++;
                    }
                } else {
                    numArr11 = new Integer[f66428C.length];
                    int i34 = 0;
                    while (true) {
                        int[] iArr8 = f66428C;
                        if (i34 >= iArr8.length) {
                            break;
                        }
                        numArr11[i34] = Integer.valueOf(iArr8[i34]);
                        i34++;
                    }
                }
            }
            Integer[] numArr12 = new Integer[numArr11.length];
            for (int i35 = 0; i35 < 12; i35++) {
                if (i35 == i9) {
                    numArr12[i35] = Integer.valueOf(numArr11[i35].intValue() + i10);
                } else {
                    numArr12[i35] = Integer.valueOf(numArr11[i35].intValue());
                }
            }
            HashMap<Integer, Integer[]> hashMap = f66437L;
            hashMap.put(Integer.valueOf(i3), numArr12);
            Integer[] numArr13 = hashMap.get(Integer.valueOf(i));
            Integer[] numArr14 = hashMap.get(Integer.valueOf(i3));
            HashMap<Integer, Integer[]> hashMap2 = f66436K;
            int intValue = numArr13[i7].intValue();
            int intValue2 = numArr14[i9].intValue();
            int intValue3 = hashMap2.get(Integer.valueOf(i))[11].intValue() + numArr13[11].intValue();
            int intValue4 = hashMap2.get(Integer.valueOf(i3))[11].intValue() + numArr14[11].intValue();
            Integer[] numArr15 = f66442Q;
            int intValue5 = numArr15[5].intValue();
            Integer[] numArr16 = f66441P;
            int intValue6 = numArr16[5].intValue();
            if (intValue5 < intValue) {
                intValue5 = intValue;
            }
            if (intValue5 < intValue2) {
                intValue5 = intValue2;
            }
            numArr15[5] = Integer.valueOf(intValue5);
            if (intValue6 <= intValue) {
                intValue = intValue6;
            }
            if (intValue <= intValue2) {
                intValue2 = intValue;
            }
            numArr16[5] = Integer.valueOf(intValue2);
            int intValue7 = numArr15[6].intValue();
            int intValue8 = numArr16[6].intValue();
            if (intValue7 < intValue3) {
                intValue7 = intValue3;
            }
            if (intValue7 < intValue4) {
                intValue7 = intValue4;
            }
            numArr15[6] = Integer.valueOf(intValue7);
            if (intValue8 <= intValue3) {
                intValue3 = intValue8;
            }
            if (intValue3 <= intValue4) {
                intValue4 = intValue3;
            }
            numArr16[6] = Integer.valueOf(intValue4);
        } else {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
    }

    /* renamed from: V */
    private static void m97226V(int i) {
        if (i < 1 || i > m97241t0()) {
            throw new DateTimeException("Invalid day of month of Hijrah date, day " + i + " greater than " + m97241t0() + " or less than 1");
        }
    }

    /* renamed from: X */
    private static void m97227X(int i) {
        if (i < 1 || i > m97242u0()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
    }

    /* renamed from: X0 */
    private static long m97228X0(int i) {
        Long l;
        int i2 = i - 1;
        int i3 = i2 / 30;
        int i4 = i2 % 30;
        int intValue = m97231a0(i3)[Math.abs(i4)].intValue();
        if (i4 < 0) {
            intValue = -intValue;
        }
        try {
            l = f66439N[i3];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf((long) (i3 * 10631));
        }
        return ((l.longValue() + ((long) intValue)) - 492148) - 1;
    }

    /* renamed from: Y */
    private static void m97229Y(int i) {
        if (i < 1 || i > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
    }

    /* renamed from: Z */
    private static void m97230Z(int i) {
        if (i < 1 || i > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
    }

    /* renamed from: a0 */
    private static Integer[] m97231a0(int i) {
        Integer[] numArr;
        try {
            numArr = f66438M.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? f66447V : numArr;
    }

    /* renamed from: b0 */
    private static Integer[] m97232b0(int i) {
        Integer[] numArr;
        try {
            numArr = f66436K.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (m97217C0((long) i)) {
            return f66444S;
        }
        return f66443R;
    }

    /* renamed from: c0 */
    private static Integer[] m97233c0(int i) {
        Integer[] numArr;
        try {
            numArr = f66437L.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (m97217C0((long) i)) {
            return f66446U;
        }
        return f66445T;
    }

    /* renamed from: e0 */
    private static InputStream m97234e0() throws IOException {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + f66433H + property);
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e) {
                throw e;
            }
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), f66434I);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                File file2 = new File(nextToken);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(nextToken);
                        char c = f66433H;
                        sb.append(c);
                        String str = f66435J;
                        sb.append(str);
                        if (new File(sb.toString(), property).exists()) {
                            try {
                                return new FileInputStream(nextToken + c + str + c + property);
                            } catch (IOException e2) {
                                throw e2;
                            }
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f66435J);
                            char c2 = f66433H;
                            sb2.append(c2);
                            sb2.append(property);
                            String sb3 = sb2.toString();
                            ZipEntry entry = zipFile.getEntry(sb3);
                            if (entry == null) {
                                if (c2 == '/') {
                                    sb3 = sb3.replace('/', IOUtils.DIR_SEPARATOR_WINDOWS);
                                } else if (c2 == '\\') {
                                    sb3 = sb3.replace(IOUtils.DIR_SEPARATOR_WINDOWS, '/');
                                }
                                entry = zipFile.getEntry(sb3);
                            }
                            if (entry != null) {
                                try {
                                    return zipFile.getInputStream(entry);
                                } catch (IOException e3) {
                                    throw e3;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: g0 */
    private static int m97235g0(long j) {
        Long[] lArr = f66439N;
        int i = 0;
        while (i < lArr.length) {
            try {
                if (j < lArr[i].longValue()) {
                    return i - 1;
                }
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j) / 10631;
            }
        }
        return ((int) j) / 10631;
    }

    /* renamed from: i0 */
    private static int m97236i0(long j, int i) {
        Long l;
        try {
            l = f66439N[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf((long) (i * 10631));
        }
        return (int) (j - l.longValue());
    }

    /* renamed from: k0 */
    private static int m97237k0(int i, int i2, int i3) {
        int intValue;
        Integer[] b0 = m97232b0(i3);
        if (i < 0) {
            i = m97217C0((long) i3) ? i + 355 : i + 354;
            if (i2 <= 0) {
                return i;
            }
            intValue = b0[i2].intValue();
        } else if (i2 <= 0) {
            return i;
        } else {
            intValue = b0[i2].intValue();
        }
        return i - intValue;
    }

    /* renamed from: m0 */
    private static int m97238m0(int i, int i2, int i3) {
        Integer[] a0 = m97231a0(i);
        if (i2 > 0) {
            return i2 - a0[i3].intValue();
        }
        return a0[i3].intValue() + i2;
    }

    /* renamed from: r0 */
    private static long m97239r0(int i, int i2, int i3) {
        return m97228X0(i) + ((long) m97243v0(i2 - 1, i)) + ((long) i3);
    }

    private Object readResolve() {
        return new C16191k(this.gregorianEpochDay);
    }

    /* renamed from: s0 */
    private static int[] m97240s0(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2 = j - -492148;
        if (j2 >= 0) {
            int g0 = m97235g0(j2);
            int i0 = m97236i0(j2, g0);
            int A0 = m97215A0(g0, (long) i0);
            i4 = m97238m0(g0, i0, A0);
            i5 = (g0 * 30) + A0 + 1;
            i3 = m97245z0(i4, i5);
            i2 = m97237k0(i4, i3, i5) + 1;
            i = C16193l.AH.getValue();
        } else {
            int i6 = (int) j2;
            int i7 = i6 / 10631;
            int i8 = i6 % 10631;
            if (i8 == 0) {
                i8 = -10631;
                i7++;
            }
            int A02 = m97215A0(i7, (long) i8);
            int m0 = m97238m0(i7, i8, A02);
            int i9 = 1 - ((i7 * 30) - A02);
            int i10 = m97217C0((long) i9) ? m0 + 355 : m0 + 354;
            i3 = m97245z0(i10, i9);
            i2 = m97237k0(i10, i3, i9) + 1;
            i = C16193l.BEFORE_AH.getValue();
            int i11 = i9;
            i4 = i10;
            i5 = i11;
        }
        int i12 = (int) ((j2 + 5) % 7);
        return new int[]{i, i5, i3 + 1, i2, i4 + 1, i12 + (i12 <= 0 ? 7 : 0)};
    }

    /* renamed from: t0 */
    static int m97241t0() {
        return f66442Q[5].intValue();
    }

    /* renamed from: u0 */
    static int m97242u0() {
        return f66442Q[6].intValue();
    }

    /* renamed from: v0 */
    private static int m97243v0(int i, int i2) {
        return m97232b0(i2)[i].intValue();
    }

    private Object writeReplace() {
        return new C16206u((byte) 3, this);
    }

    /* renamed from: x0 */
    static int m97244x0(int i, int i2) {
        return m97233c0(i2)[i].intValue();
    }

    /* renamed from: z0 */
    private static int m97245z0(int i, int i2) {
        Integer[] b0 = m97232b0(i2);
        int i3 = 0;
        if (i >= 0) {
            while (i3 < b0.length) {
                if (i < b0[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 11;
        }
        int i4 = m97217C0((long) i2) ? i + 355 : i + 354;
        while (i3 < b0.length) {
            if (i4 < b0[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 11;
    }

    /* renamed from: D0 */
    public int mo78658D0() {
        return m97244x0(this.f66451f - 1, this.f66450d);
    }

    /* renamed from: F0 */
    public int mo78659F0() {
        return m97216B0(this.f66450d);
    }

    /* renamed from: G0 */
    public C16191k mo75667b(long j, C16566k kVar) {
        return (C16191k) super.mo75667b(j, kVar);
    }

    /* renamed from: H */
    public long mo75686H() {
        return m97239r0(this.f66450d, this.f66451f, this.f66452g);
    }

    /* renamed from: M0 */
    public C16191k mo75670e(long j, C16566k kVar) {
        return (C16191k) super.mo75670e(j, kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public C16191k mo78616P(long j) {
        return new C16191k(this.gregorianEpochDay + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public C16191k mo78617R(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f66451f - 1) + ((int) j);
        int i2 = i / 12;
        int i3 = i % 12;
        while (i3 < 0) {
            i3 += 12;
            i2 = C16501d.m98552m(i2, 1);
        }
        return m97219I0(this.f66449c, C16501d.m98549j(this.f66450d, i2), i3 + 1, this.f66452g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public C16191k mo78618T(long j) {
        if (j == 0) {
            return this;
        }
        return m97219I0(this.f66449c, C16501d.m98549j(this.f66450d, (int) j), this.f66451f, this.f66452g);
    }

    /* renamed from: U0 */
    public C16191k mo75673k(C16552f fVar) {
        return (C16191k) super.mo75673k(fVar);
    }

    /* renamed from: V0 */
    public C16191k mo75669d(C16556h hVar, long j) {
        if (!(hVar instanceof C16540a)) {
            return (C16191k) hVar.mo79344i(this, j);
        }
        C16540a aVar = (C16540a) hVar;
        aVar.mo79347l(j);
        int i = (int) j;
        switch (C16192a.f66456a[aVar.ordinal()]) {
            case 1:
                return m97224T0(this.f66450d, this.f66451f, i);
            case 2:
                int i2 = i - 1;
                return m97224T0(this.f66450d, (i2 / 30) + 1, (i2 % 30) + 1);
            case 3:
                return mo78616P((j - mo75644l(C16540a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.f66450d < 1) {
                    i = 1 - i;
                }
                return m97224T0(i, this.f66451f, this.f66452g);
            case 5:
                return mo78616P(j - ((long) this.f66454p.getValue()));
            case 6:
                return mo78616P(j - mo75644l(C16540a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return mo78616P(j - mo75644l(C16540a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new C16191k((long) i);
            case 9:
                return mo78616P((j - mo75644l(C16540a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return m97224T0(this.f66450d, i, this.f66452g);
            case 11:
                return m97224T0(i, this.f66451f, this.f66452g);
            case 12:
                return m97224T0(1 - this.f66450d, this.f66451f, this.f66452g);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo78667W0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(mo75647q(C16540a.YEAR));
        dataOutput.writeByte(mo75647q(C16540a.MONTH_OF_YEAR));
        dataOutput.writeByte(mo75647q(C16540a.DAY_OF_MONTH));
    }

    /* renamed from: d0 */
    public C16190j mo75718y() {
        return C16190j.f66422g;
    }

    /* renamed from: f */
    public C16567l mo75641f(C16556h hVar) {
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79342f(this);
        }
        if (mo75642g(hVar)) {
            C16540a aVar = (C16540a) hVar;
            int i = C16192a.f66456a[aVar.ordinal()];
            if (i == 1) {
                return C16567l.m98757i(1, (long) mo78658D0());
            }
            if (i == 2) {
                return C16567l.m98757i(1, (long) mo78659F0());
            }
            if (i == 3) {
                return C16567l.m98757i(1, 5);
            }
            if (i != 4) {
                return mo75718y().mo78654A(aVar);
            }
            return C16567l.m98757i(1, 1000);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
    }

    /* renamed from: l */
    public long mo75644l(C16556h hVar) {
        int i;
        int i2;
        if (!(hVar instanceof C16540a)) {
            return hVar.mo79340d(this);
        }
        switch (C16192a.f66456a[((C16540a) hVar).ordinal()]) {
            case 1:
                i = this.f66452g;
                break;
            case 2:
                i = this.f66453o;
                break;
            case 3:
                i2 = (this.f66452g - 1) / 7;
                break;
            case 4:
                i = this.f66450d;
                break;
            case 5:
                i = this.f66454p.getValue();
                break;
            case 6:
                i2 = (this.f66452g - 1) % 7;
                break;
            case 7:
                i2 = (this.f66453o - 1) % 7;
                break;
            case 8:
                return mo75686H();
            case 9:
                i2 = (this.f66453o - 1) / 7;
                break;
            case 10:
                i = this.f66451f;
                break;
            case 11:
                i = this.f66450d;
                break;
            case 12:
                i = this.f66449c.getValue();
                break;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + hVar);
        }
        i = i2 + 1;
        return (long) i;
    }

    /* renamed from: o0 */
    public C16193l mo75678A() {
        return this.f66449c;
    }

    /* renamed from: t */
    public final C16177c<C16191k> mo75714t(C15867g gVar) {
        return super.mo75714t(gVar);
    }
}
