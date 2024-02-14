package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzge {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f36719a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f36720b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzge(MediaCodec.CryptoInfo cryptoInfo, zzgd zzgd) {
        this.f36719a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m51743a(zzge zzge, int i, int i2) {
        zzge.f36720b.set(i, i2);
        zzge.f36719a.setPattern(zzge.f36720b);
    }
}
