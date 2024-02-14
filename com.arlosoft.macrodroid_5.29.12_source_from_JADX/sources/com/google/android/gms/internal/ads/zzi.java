package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzi {

    /* renamed from: a */
    public final AudioAttributes f37480a;

    /* synthetic */ zzi(zzk zzk, zzh zzh) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = zzen.f34500a;
        if (i >= 29) {
            zzf.m49761a(usage, 1);
        }
        if (i >= 32) {
            zzg.m51444a(usage, 0);
        }
        this.f37480a = usage.build();
    }
}
