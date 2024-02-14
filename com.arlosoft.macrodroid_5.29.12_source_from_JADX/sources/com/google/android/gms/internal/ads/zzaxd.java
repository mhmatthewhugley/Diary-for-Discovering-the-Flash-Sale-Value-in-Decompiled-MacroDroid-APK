package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaxd implements zzaxa {

    /* renamed from: a */
    private final int f26159a;

    /* renamed from: b */
    private MediaCodecInfo[] f26160b;

    public zzaxd(boolean z) {
        this.f26159a = z ? 1 : 0;
    }

    /* renamed from: b */
    private final void m42718b() {
        if (this.f26160b == null) {
            this.f26160b = new MediaCodecList(this.f26159a).getCodecInfos();
        }
    }

    /* renamed from: B */
    public final MediaCodecInfo mo42162B(int i) {
        m42718b();
        return this.f26160b[i];
    }

    /* renamed from: a */
    public final boolean mo42163a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: d */
    public final boolean mo42164d() {
        return true;
    }

    public final int zza() {
        m42718b();
        return this.f26160b.length;
    }
}
