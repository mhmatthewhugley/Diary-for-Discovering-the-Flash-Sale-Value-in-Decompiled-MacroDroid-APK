package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzchu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MediaPlayer f28476a;

    /* renamed from: c */
    final /* synthetic */ zzcic f28477c;

    zzchu(zzcic zzcic, MediaPlayer mediaPlayer) {
        this.f28477c = zzcic;
        this.f28476a = mediaPlayer;
    }

    public final void run() {
        zzcic.m45286K(this.f28477c, this.f28476a);
        zzcic zzcic = this.f28477c;
        if (zzcic.f28497H != null) {
            zzcic.f28497H.mo43640c();
        }
    }
}
