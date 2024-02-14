package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzauo {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f25691a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f25692b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzauo(MediaCodec.CryptoInfo cryptoInfo, zzaun zzaun) {
        this.f25691a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m42549a(zzauo zzauo, int i, int i2) {
        zzauo.f25692b.set(0, 0);
        zzauo.f25691a.setPattern(zzauo.f25692b);
    }
}
