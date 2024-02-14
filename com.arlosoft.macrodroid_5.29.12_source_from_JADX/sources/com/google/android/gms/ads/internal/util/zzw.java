package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzw implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ zzx f2313a;

    /* renamed from: b */
    public final /* synthetic */ Activity f2314b;

    public /* synthetic */ zzw(zzx zzx, Activity activity) {
        this.f2313a = zzx;
        this.f2314b = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return zzx.m2790m(this.f2314b, view, windowInsets);
    }
}
