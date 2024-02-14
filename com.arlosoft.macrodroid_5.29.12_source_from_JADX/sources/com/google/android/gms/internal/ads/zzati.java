package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzati {

    /* renamed from: a */
    private static final int[] f25544a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f25545b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f25546c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d */
    public static final /* synthetic */ int f25547d = 0;

    /* renamed from: a */
    public static int m42418a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f25544a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: b */
    public static zzasw m42419b(zzbak zzbak, String str, String str2, zzauv zzauv) {
        int i = f25545b[(zzbak.mo42321g() & 192) >> 6];
        int g = zzbak.mo42321g();
        int i2 = f25546c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return zzasw.m42370g(str, "audio/ac3", (String) null, -1, -1, i2, i, (List) null, zzauv, 0, str2);
    }

    /* renamed from: c */
    public static zzasw m42420c(zzbak zzbak, String str, String str2, zzauv zzauv) {
        zzbak zzbak2 = zzbak;
        zzbak.mo42337w(2);
        int i = f25545b[(zzbak.mo42321g() & 192) >> 6];
        int g = zzbak.mo42321g();
        int i2 = f25546c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return zzasw.m42370g(str, "audio/eac3", (String) null, -1, -1, i2, i, (List) null, zzauv, 0, str2);
    }
}
