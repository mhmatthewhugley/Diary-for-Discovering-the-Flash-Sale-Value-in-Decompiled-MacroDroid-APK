package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzp extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ zzr f2119a;

    zzp(zzr zzr) {
        this.f2119a = zzr;
    }

    /* renamed from: a */
    private final void m2472a(boolean z) {
        this.f2119a.setClickable(z);
        this.f2119a.f2124a.setClickable(z);
    }

    public final void onAnimationCancel(Animator animator) {
        m2472a(true);
    }

    public final void onAnimationEnd(Animator animator) {
        m2472a(true);
    }

    public final void onAnimationStart(Animator animator) {
        m2472a(false);
    }
}
