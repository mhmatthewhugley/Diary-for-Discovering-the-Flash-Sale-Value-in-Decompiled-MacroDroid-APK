package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzqj {

    /* renamed from: a */
    public final zzqn f38251a;

    /* renamed from: b */
    public final MediaFormat f38252b;

    /* renamed from: c */
    public final zzaf f38253c;
    @Nullable

    /* renamed from: d */
    public final Surface f38254d;
    @Nullable

    /* renamed from: e */
    public final MediaCrypto f38255e = null;

    private zzqj(zzqn zzqn, MediaFormat mediaFormat, zzaf zzaf, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        this.f38251a = zzqn;
        this.f38252b = mediaFormat;
        this.f38253c = zzaf;
        this.f38254d = surface;
    }

    /* renamed from: a */
    public static zzqj m54621a(zzqn zzqn, MediaFormat mediaFormat, zzaf zzaf, @Nullable MediaCrypto mediaCrypto) {
        return new zzqj(zzqn, mediaFormat, zzaf, (Surface) null, (MediaCrypto) null, 0);
    }

    /* renamed from: b */
    public static zzqj m54622b(zzqn zzqn, MediaFormat mediaFormat, zzaf zzaf, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzqj(zzqn, mediaFormat, zzaf, surface, (MediaCrypto) null, 0);
    }
}
