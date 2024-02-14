package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.android.p023dx.p026io.Opcodes;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzf {

    /* renamed from: a */
    private static final int[] f39036a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f39037b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f39038c = {64, 112, 128, 192, Opcodes.SHL_INT_LIT8, 256, 384, 448, 512, 640, Opcodes.FILL_ARRAY_DATA_PAYLOAD, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final /* synthetic */ int f39039d = 0;

    /* renamed from: a */
    public static zzaf m55506a(byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable zzx zzx) {
        zzee zzee;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzee = new zzee(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            int length = copyOf.length;
            zzee = new zzee(copyOf, length);
            if (copyOf[0] == 31) {
                zzee zzee2 = new zzee(copyOf, length);
                while (zzee2.mo45196a() >= 16) {
                    zzee2.mo45205j(2);
                    zzee.mo45200e(zzee2.mo45198c(14), 14);
                }
            }
            zzee.mo45202g(copyOf, copyOf.length);
        }
        zzee.mo45205j(60);
        int i5 = f39036a[zzee.mo45198c(6)];
        int i6 = f39037b[zzee.mo45198c(4)];
        int c = zzee.mo45198c(5);
        if (c < 29) {
            i2 = (f39038c[c] * 1000) / 2;
        }
        zzee.mo45205j(10);
        if (zzee.mo45198c(2) > 0) {
            i = 1;
        }
        zzad zzad = new zzad();
        zzad.mo41331h(str);
        zzad.mo41343s("audio/vnd.dts");
        zzad.mo41324d0(i2);
        zzad.mo41326e0(i5 + i);
        zzad.mo41344t(i6);
        zzad.mo41320b((zzx) null);
        zzad.mo41335k(str2);
        return zzad.mo41349y();
    }
}
