package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzos {

    /* renamed from: a */
    private final Handler f38062a = new Handler(Looper.myLooper());

    /* renamed from: b */
    private final AudioTrack.StreamEventCallback f38063b;

    /* renamed from: c */
    final /* synthetic */ zzou f38064c;

    public zzos(zzou zzou) {
        this.f38064c = zzou;
        this.f38063b = new zzor(this, zzou);
    }

    /* renamed from: a */
    public final void mo47980a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new zzoq(this.f38062a), this.f38063b);
    }

    /* renamed from: b */
    public final void mo47981b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f38063b);
        this.f38062a.removeCallbacksAndMessages((Object) null);
    }
}
