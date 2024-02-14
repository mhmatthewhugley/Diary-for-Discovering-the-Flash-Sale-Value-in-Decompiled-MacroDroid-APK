package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzqv implements zzre {

    /* renamed from: a */
    public static final /* synthetic */ zzqv f38336a = new zzqv();

    private /* synthetic */ zzqv() {
    }

    /* renamed from: a */
    public final int mo48087a(Object obj) {
        int i = zzrf.f38346d;
        String str = ((zzqn) obj).f38257a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (zzen.f34500a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
