package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzvj implements Spatializer.OnSpatializerStateChangedListener {

    /* renamed from: a */
    final /* synthetic */ zzvr f38702a;

    zzvj(zzvk zzvk, zzvr zzvr) {
        this.f38702a = zzvr;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.f38702a.m55212t();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.f38702a.m55212t();
    }
}
