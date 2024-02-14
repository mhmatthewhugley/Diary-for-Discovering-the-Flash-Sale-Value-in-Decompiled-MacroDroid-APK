package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzazd extends zzazh {

    /* renamed from: b */
    private final SparseArray f26339b = new SparseArray();

    /* renamed from: c */
    private final SparseBooleanArray f26340c = new SparseBooleanArray();

    /* renamed from: d */
    private zzazb f26341d;

    /* renamed from: a */
    public final zzazi mo42271a(zzatc[] zzatcArr, zzayt zzayt) throws zzasi {
        zzazc zzazc;
        int[] iArr;
        zzatc[] zzatcArr2 = zzatcArr;
        zzayt zzayt2 = zzayt;
        int[] iArr2 = new int[3];
        zzays[][] zzaysArr = new zzays[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzayt2.f26315a;
            zzaysArr[i] = new zzays[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzatcArr2[i4].mo41890b();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzayt2.f26315a) {
            zzays b = zzayt2.mo42258b(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                zzatc zzatc = zzatcArr2[i6];
                int i9 = 0;
                while (true) {
                    int i10 = b.f26311a;
                    if (i9 > 0) {
                        break;
                    }
                    int d = zzatc.mo41982d(b.mo42254b(i9)) & 3;
                    if (d > i7) {
                        if (d == 3) {
                            break;
                        }
                        i8 = i6;
                        i7 = d;
                    }
                    i9++;
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i11 = b.f26311a;
                iArr = new int[1];
            } else {
                zzatc zzatc2 = zzatcArr2[i6];
                int i12 = b.f26311a;
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = zzatc2.mo41982d(b.mo42254b(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i6];
            zzaysArr[i6][i14] = b;
            iArr3[i6][i14] = iArr;
            iArr2[i6] = i14 + 1;
            i5++;
            i3 = 2;
        }
        zzayt[] zzaytArr = new zzayt[2];
        int[] iArr6 = new int[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            int i17 = iArr2[i15];
            zzaytArr[i15] = new zzayt((zzays[]) Arrays.copyOf(zzaysArr[i15], i17));
            iArr3[i15] = (int[][]) Arrays.copyOf(iArr3[i15], i17);
            iArr6[i15] = zzatcArr2[i15].mo41889a();
            i15++;
        }
        zzayt zzayt3 = new zzayt((zzays[]) Arrays.copyOf(zzaysArr[2], iArr2[2]));
        zzayx[] e = mo42270e(zzatcArr2, zzaytArr, iArr3);
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            if (this.f26340c.get(i18)) {
                e[i18] = null;
            } else {
                zzayt zzayt4 = zzaytArr[i18];
                Map map = (Map) this.f26339b.get(i18);
                if (map == null) {
                    zzazc = null;
                } else {
                    zzazc = (zzazc) map.get(zzayt4);
                }
                if (zzazc != null) {
                    throw null;
                }
            }
            i18++;
        }
        zzazb zzazb = new zzazb(iArr6, zzaytArr, iArr4, iArr3, zzayt3);
        zzatd[] zzatdArr = new zzatd[2];
        for (int i20 = 0; i20 < 2; i20++) {
            zzatdArr[i20] = e[i20] != null ? zzatd.f25537b : null;
        }
        return new zzazi(zzayt2, new zzazf(e, (byte[]) null), zzazb, zzatdArr);
    }

    /* renamed from: b */
    public final void mo42272b(Object obj) {
        this.f26341d = (zzazb) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract zzayx[] mo42270e(zzatc[] zzatcArr, zzayt[] zzaytArr, int[][][] iArr) throws zzasi;

    /* renamed from: f */
    public final void mo42273f(int i, boolean z) {
        if (this.f26340c.get(i) != z) {
            this.f26340c.put(i, z);
            mo42279d();
        }
    }
}
