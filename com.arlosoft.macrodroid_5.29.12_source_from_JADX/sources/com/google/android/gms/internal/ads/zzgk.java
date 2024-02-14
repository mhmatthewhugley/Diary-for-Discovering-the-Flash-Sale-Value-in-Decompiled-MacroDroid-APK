package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgk extends BroadcastReceiver implements Runnable {

    /* renamed from: a */
    private final zzgl f36885a;

    /* renamed from: c */
    private final Handler f36886c;

    /* renamed from: d */
    final /* synthetic */ zzgm f36887d;

    public zzgk(zzgm zzgm, Handler handler, zzgl zzgl) {
        this.f36887d = zzgm;
        this.f36886c = handler;
        this.f36885a = zzgl;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f36886c.post(this);
        }
    }

    public final void run() {
    }
}
