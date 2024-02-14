package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class ChannelIOException extends IOException {
    private final int zza;
    private final int zzb;

    public ChannelIOException(@NonNull String str, int i, int i2) {
        super(str);
        this.zza = i;
        this.zzb = i2;
    }
}
