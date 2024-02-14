package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzrc implements zzra {
    private zzrc() {
    }

    /* synthetic */ zzrc(zzrb zzrb) {
    }

    /* renamed from: B */
    public final MediaCodecInfo mo48091B(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo48092a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    /* renamed from: b */
    public final boolean mo48093b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo48094c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
