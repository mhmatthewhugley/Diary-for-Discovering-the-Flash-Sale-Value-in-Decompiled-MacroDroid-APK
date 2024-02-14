package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzrd implements zzra {

    /* renamed from: a */
    private final int f38341a;
    @Nullable

    /* renamed from: b */
    private MediaCodecInfo[] f38342b;

    public zzrd(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f38341a = i;
    }

    /* renamed from: d */
    private final void m54716d() {
        if (this.f38342b == null) {
            this.f38342b = new MediaCodecList(this.f38341a).getCodecInfos();
        }
    }

    /* renamed from: B */
    public final MediaCodecInfo mo48091B(int i) {
        m54716d();
        return this.f38342b[i];
    }

    /* renamed from: a */
    public final boolean mo48092a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* renamed from: b */
    public final boolean mo48093b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo48094c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final int zza() {
        m54716d();
        return this.f38342b.length;
    }
}
