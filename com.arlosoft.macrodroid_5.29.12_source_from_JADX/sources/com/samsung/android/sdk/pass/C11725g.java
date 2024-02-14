package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.g */
final class C11725g implements Runnable {

    /* renamed from: a */
    private /* synthetic */ SpassFingerprint.C11718c f57600a;

    /* renamed from: b */
    private final /* synthetic */ FingerprintEvent f57601b;

    /* renamed from: c */
    private final /* synthetic */ SpassFingerprint.IdentifyListener f57602c;

    C11725g(SpassFingerprint.C11718c cVar, FingerprintEvent fingerprintEvent, SpassFingerprint.IdentifyListener identifyListener) {
        this.f57600a = cVar;
        this.f57601b = fingerprintEvent;
        this.f57602c = identifyListener;
    }

    public final void run() {
        if (this.f57601b.eventId == 13) {
            SpassFingerprint.m81887a(SpassFingerprint.this, this.f57602c, this.f57601b, -1);
            this.f57602c.onCompleted();
        }
    }
}
