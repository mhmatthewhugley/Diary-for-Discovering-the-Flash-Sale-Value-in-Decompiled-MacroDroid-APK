package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabl implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ GoogleApiManager f3365a;

    zabl(GoogleApiManager googleApiManager) {
        this.f3365a = googleApiManager;
    }

    /* renamed from: a */
    public final void mo21320a(boolean z) {
        GoogleApiManager googleApiManager = this.f3365a;
        googleApiManager.f3187G.sendMessage(googleApiManager.f3187G.obtainMessage(1, Boolean.valueOf(z)));
    }
}
