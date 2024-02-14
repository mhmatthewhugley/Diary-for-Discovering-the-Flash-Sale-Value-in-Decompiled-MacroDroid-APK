package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcmt implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ zzcdq f29004a;

    /* renamed from: c */
    final /* synthetic */ zzcmw f29005c;

    zzcmt(zzcmw zzcmw, zzcdq zzcdq) {
        this.f29005c = zzcmw;
        this.f29004a = zzcdq;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f29005c.m45886r(view, this.f29004a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
