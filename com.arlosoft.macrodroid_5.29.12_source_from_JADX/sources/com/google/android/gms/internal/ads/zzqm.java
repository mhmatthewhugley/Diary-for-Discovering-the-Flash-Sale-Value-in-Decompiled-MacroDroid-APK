package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzqm extends zzgg {
    @Nullable
    public final zzqn zza;
    @Nullable
    public final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzqm(Throwable th, @Nullable zzqn zzqn) {
        super("Decoder failed: ".concat(String.valueOf(zzqn == null ? null : zzqn.f38257a)), th);
        String str = null;
        this.zza = zzqn;
        if (zzen.f34500a >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
