package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzor extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ zzou f38060a;

    /* renamed from: b */
    final /* synthetic */ zzos f38061b;

    zzor(zzos zzos, zzou zzou) {
        this.f38061b = zzos;
        this.f38060a = zzou;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.f38061b.f38064c.f38106q)) {
            zzou zzou = this.f38061b.f38064c;
            if (zzou.f38103n != null && zzou.f38082O) {
                zzou.f38103n.zzb();
            }
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f38061b.f38064c.f38106q)) {
            zzou zzou = this.f38061b.f38064c;
            if (zzou.f38103n != null && zzou.f38082O) {
                zzou.f38103n.zzb();
            }
        }
    }
}
