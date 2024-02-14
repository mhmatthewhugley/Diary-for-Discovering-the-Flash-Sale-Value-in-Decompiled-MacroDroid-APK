package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.a */
final class C11719a implements Runnable {

    /* renamed from: a */
    private /* synthetic */ SpassFingerprint f57589a;

    /* renamed from: b */
    private final /* synthetic */ SpassFingerprint.IdentifyListener f57590b;

    C11719a(SpassFingerprint spassFingerprint, SpassFingerprint.IdentifyListener identifyListener) {
        this.f57589a = spassFingerprint;
        this.f57590b = identifyListener;
    }

    public final void run() {
        SpassFingerprint.m81887a(this.f57589a, this.f57590b, (FingerprintEvent) null, 8);
        this.f57590b.onCompleted();
    }
}
