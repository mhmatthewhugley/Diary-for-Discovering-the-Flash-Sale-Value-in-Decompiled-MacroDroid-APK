package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbay {

    /* renamed from: a */
    public final List f26444a;

    /* renamed from: b */
    public final int f26445b;

    private zzbay(List list, int i) {
        this.f26444a = list;
        this.f26445b = i;
    }

    /* renamed from: a */
    public static zzbay m43008a(zzbak zzbak) throws zzasz {
        List list;
        try {
            zzbak.mo42337w(21);
            int g = zzbak.mo42321g() & 3;
            int g2 = zzbak.mo42321g();
            int c = zzbak.mo42317c();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                zzbak.mo42337w(1);
                int j = zzbak.mo42324j();
                for (int i3 = 0; i3 < j; i3++) {
                    int j2 = zzbak.mo42324j();
                    i += j2 + 4;
                    zzbak.mo42337w(j2);
                }
            }
            zzbak.mo42336v(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                zzbak.mo42337w(1);
                int j3 = zzbak.mo42324j();
                for (int i6 = 0; i6 < j3; i6++) {
                    int j4 = zzbak.mo42324j();
                    System.arraycopy(zzbai.f26399a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzbak.f26406a, zzbak.mo42317c(), bArr, i7, j4);
                    i4 = i7 + j4;
                    zzbak.mo42337w(j4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new zzbay(list, g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzasz("Error parsing HEVC config", e);
        }
    }
}
