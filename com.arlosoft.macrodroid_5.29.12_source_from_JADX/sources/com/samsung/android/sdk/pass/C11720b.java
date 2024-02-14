package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.b */
final class C11720b implements Runnable {

    /* renamed from: a */
    private /* synthetic */ SpassFingerprint f57591a;

    /* renamed from: b */
    private final /* synthetic */ SpassFingerprint.IdentifyListener f57592b;

    C11720b(SpassFingerprint spassFingerprint, SpassFingerprint.IdentifyListener identifyListener) {
        this.f57591a = spassFingerprint;
        this.f57592b = identifyListener;
    }

    public final void run() {
        SpassFingerprint.m81887a(this.f57591a, this.f57592b, (FingerprintEvent) null, 7);
        this.f57592b.onCompleted();
    }
}
