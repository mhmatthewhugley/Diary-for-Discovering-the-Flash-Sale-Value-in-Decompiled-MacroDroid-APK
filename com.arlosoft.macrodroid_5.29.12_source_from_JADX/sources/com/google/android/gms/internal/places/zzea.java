package com.google.android.gms.internal.places;

final class zzea {

    /* renamed from: a */
    private static final zzec f45421a;

    static {
        zzec zzec;
        if (!(zzdy.m63690o() && zzdy.m63691p()) || zzp.m63835b()) {
            zzec = new zzeb();
        } else {
            zzec = new zzed();
        }
        f45421a = zzec;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m63756a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: c */
    static int m63758c(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzee(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    static int m63759d(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f45421a.mo53645b(charSequence, bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m63760e(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: g */
    public static boolean m63762g(byte[] bArr) {
        return f45421a.mo53647c(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static boolean m63763h(byte[] bArr, int i, int i2) {
        return f45421a.mo53647c(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static int m63764i(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m63756a(b);
        }
        if (i3 == 1) {
            return m63767l(b, bArr[i]);
        }
        if (i3 == 2) {
            return m63760e(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: j */
    static String m63765j(byte[] bArr, int i, int i2) throws zzbk {
        return f45421a.mo53646d(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m63767l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
