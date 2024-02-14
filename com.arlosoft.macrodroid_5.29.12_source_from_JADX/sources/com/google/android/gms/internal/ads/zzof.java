package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzof implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AudioTrack f38034a;

    /* renamed from: c */
    public final /* synthetic */ zzdg f38035c;

    public /* synthetic */ zzof(AudioTrack audioTrack, zzdg zzdg) {
        this.f38034a = audioTrack;
        this.f38035c = zzdg;
    }

    public final void run() {
        zzou.m54443w(this.f38034a, this.f38035c);
    }
}
