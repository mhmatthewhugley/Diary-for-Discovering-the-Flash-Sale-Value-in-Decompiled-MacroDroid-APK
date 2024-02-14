package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzuc {

    /* renamed from: a */
    private final Random f38607a;

    /* renamed from: b */
    private final int[] f38608b;

    /* renamed from: c */
    private final int[] f38609c;

    public zzuc(int i) {
        this(0, new Random());
    }

    /* renamed from: a */
    public final int mo48250a() {
        int[] iArr = this.f38608b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo48251b() {
        int[] iArr = this.f38608b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo48252c() {
        return this.f38608b.length;
    }

    /* renamed from: d */
    public final int mo48253d(int i) {
        int i2 = this.f38609c[i] + 1;
        int[] iArr = this.f38608b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo48254e(int i) {
        int i2 = this.f38609c[i] - 1;
        if (i2 >= 0) {
            return this.f38608b[i2];
        }
        return -1;
    }

    /* renamed from: f */
    public final zzuc mo48255f() {
        return new zzuc(0, new Random(this.f38607a.nextLong()));
    }

    /* renamed from: g */
    public final zzuc mo48256g(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f38607a.nextInt(this.f38608b.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.f38607a.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[(this.f38608b.length + i2)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f38608b;
            if (i3 >= iArr4.length + i2) {
                return new zzuc(iArr3, new Random(this.f38607a.nextLong()));
            }
            if (i6 >= i2 || i7 != iArr[i6]) {
                int i8 = i7 + 1;
                int i9 = iArr4[i7];
                iArr3[i3] = i9;
                if (i9 >= 0) {
                    iArr3[i3] = i9 + i2;
                }
                i7 = i8;
            } else {
                iArr3[i3] = iArr2[i6];
                i6++;
            }
            i3++;
        }
    }

    /* renamed from: h */
    public final zzuc mo48257h(int i, int i2) {
        int[] iArr = new int[(this.f38608b.length - i2)];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f38608b;
            if (i3 >= iArr2.length) {
                return new zzuc(iArr, new Random(this.f38607a.nextLong()));
            }
            int i5 = iArr2[i3];
            if (i5 < 0 || i5 >= i2) {
                int i6 = i3 - i4;
                if (i5 >= 0) {
                    i5 -= i2;
                }
                iArr[i6] = i5;
            } else {
                i4++;
            }
            i3++;
        }
    }

    private zzuc(int i, Random random) {
        this(new int[0], random);
    }

    private zzuc(int[] iArr, Random random) {
        this.f38608b = iArr;
        this.f38607a = random;
        this.f38609c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f38609c[iArr[i]] = i;
        }
    }
}
