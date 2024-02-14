package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzbh implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ zzbi f4647a;

    zzbh(zzbi zzbi) {
        this.f4647a = zzbi;
    }

    /* renamed from: a */
    public final void mo21320a(boolean z) {
        if (z) {
            this.f4647a.f4650c = true;
            this.f4647a.mo22771c();
            return;
        }
        this.f4647a.f4650c = false;
        if (this.f4647a.m6223g()) {
            this.f4647a.f4649b.mo22747c();
        }
    }
}
