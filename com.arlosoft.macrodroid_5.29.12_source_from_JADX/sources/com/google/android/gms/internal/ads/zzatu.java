package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzatu extends Thread {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f25564a;

    /* renamed from: c */
    final /* synthetic */ zzaue f25565c;

    zzatu(zzaue zzaue, AudioTrack audioTrack) {
        this.f25565c = zzaue;
        this.f25564a = audioTrack;
    }

    public final void run() {
        try {
            this.f25564a.flush();
            this.f25564a.release();
        } finally {
            this.f25565c.f25611e.open();
        }
    }
}
