package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgo implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final Handler f36946a;

    /* renamed from: c */
    final /* synthetic */ zzgq f36947c;

    public zzgo(zzgq zzgq, Handler handler) {
        this.f36947c = zzgq;
        this.f36946a = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f36946a.post(new zzgn(this, i));
    }
}
