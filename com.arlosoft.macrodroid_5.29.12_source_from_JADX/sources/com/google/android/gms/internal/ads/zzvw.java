package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzvw extends zzvz {
    @Nullable

    /* renamed from: c */
    private zzvv f38753c;

    /* renamed from: d */
    public final zzwa mo48320d(zzkb[] zzkbArr, zzuh zzuh, zzsi zzsi, zzcn zzcn) throws zzha {
        boolean z;
        int[] iArr;
        zzuh zzuh2 = zzuh;
        int[] iArr2 = new int[3];
        zzcp[][] zzcpArr = new zzcp[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzuh2.f38624a;
            zzcpArr[i] = new zzcp[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzkbArr[i4].mo47312b();
        }
        int i5 = 0;
        while (i5 < zzuh2.f38624a) {
            zzcp b = zzuh2.mo48265b(i5);
            int i6 = b.f29181c;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzkb zzkb = zzkbArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, zzkb.mo47775d(b.mo44231b(i11)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[1];
            } else {
                zzkb zzkb2 = zzkbArr[i8];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = zzkb2.mo47775d(b.mo44231b(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            zzcpArr[i8][i13] = b;
            iArr3[i8][i13] = iArr;
            iArr2[i8] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzuh[] zzuhArr = new zzuh[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            zzuhArr[i14] = new zzuh((zzcp[]) zzen.m49131F(zzcpArr[i14], i15));
            iArr3[i14] = (int[][]) zzen.m49131F(iArr3[i14], i15);
            strArr[i14] = zzkbArr[i14].mo47774L();
            iArr6[i14] = zzkbArr[i14].zzb();
            i14++;
            i3 = 2;
        }
        zzvv zzvv = new zzvv(strArr, iArr6, zzuhArr, iArr4, iArr3, new zzuh((zzcp[]) zzen.m49131F(zzcpArr[2], iArr2[2])));
        Pair i16 = mo48312i(zzvv, iArr3, iArr4, zzsi, zzcn);
        zzvx[] zzvxArr = (zzvx[]) i16.second;
        List[] listArr = new List[zzvxArr.length];
        for (int i17 = 0; i17 < zzvxArr.length; i17++) {
            zzvx zzvx = zzvxArr[i17];
            listArr[i17] = zzvx != null ? zzfvn.m51136z(zzvx) : zzfvn.m51135w();
        }
        zzfvk zzfvk = new zzfvk();
        for (int i18 = 0; i18 < 2; i18++) {
            zzuh d = zzvv.mo48318d(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < d.f38624a; i19++) {
                zzcp b2 = d.mo48265b(i19);
                boolean z4 = zzvv.mo48315a(i18, i19, false) != 0;
                int i20 = b2.f29179a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr7[i21] = zzvv.mo48316b(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzvx zzvx2 = (zzvx) list.get(i22);
                        if (zzvx2.mo48183b().equals(b2) && zzvx2.mo48180B(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfvk.mo46428f(new zzcx(b2, z4, iArr7, zArr));
            }
        }
        zzuh e = zzvv.mo48319e();
        for (int i23 = 0; i23 < e.f38624a; i23++) {
            zzcp b3 = e.mo48265b(i23);
            int i24 = b3.f29179a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfvk.mo46428f(new zzcx(b3, false, iArr8, new boolean[1]));
        }
        return new zzwa((zzkc[]) i16.first, (zzvt[]) i16.second, new zzcy(zzfvk.mo46430h()), zzvv);
    }

    /* renamed from: e */
    public final void mo48321e(@Nullable Object obj) {
        this.f38753c = (zzvv) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract Pair mo48312i(zzvv zzvv, int[][][] iArr, int[] iArr2, zzsi zzsi, zzcn zzcn) throws zzha;
}
