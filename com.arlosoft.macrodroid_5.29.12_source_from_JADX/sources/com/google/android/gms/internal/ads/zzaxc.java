package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaxc implements zzaxa {
    private zzaxc() {
    }

    /* synthetic */ zzaxc(zzaxb zzaxb) {
    }

    /* renamed from: B */
    public final MediaCodecInfo mo42162B(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo42163a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    /* renamed from: d */
    public final boolean mo42164d() {
        return false;
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
