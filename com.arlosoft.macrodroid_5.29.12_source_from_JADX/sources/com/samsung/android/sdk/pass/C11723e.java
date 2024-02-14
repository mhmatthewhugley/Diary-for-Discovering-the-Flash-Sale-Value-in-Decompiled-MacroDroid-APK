package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.e */
final class C11723e implements Runnable {

    /* renamed from: a */
    private /* synthetic */ SpassFingerprint.C11717b f57595a;

    /* renamed from: b */
    private final /* synthetic */ FingerprintEvent f57596b;

    /* renamed from: c */
    private final /* synthetic */ SpassFingerprint.IdentifyListener f57597c;

    C11723e(SpassFingerprint.C11717b bVar, FingerprintEvent fingerprintEvent, SpassFingerprint.IdentifyListener identifyListener) {
        this.f57595a = bVar;
        this.f57596b = fingerprintEvent;
        this.f57597c = identifyListener;
    }

    public final void run() {
        int i = this.f57596b.eventId;
        if (i != 16) {
            if (i != 100000) {
                switch (i) {
                    case 11:
                        this.f57597c.onReady();
                        return;
                    case 12:
                        this.f57597c.onStarted();
                        return;
                    case 13:
                        SpassFingerprint.m81887a(SpassFingerprint.this, this.f57597c, this.f57596b, -1);
                        if (!SpassFingerprint.f57559o) {
                            this.f57597c.onCompleted();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                this.f57597c.onFinished(7);
                this.f57597c.onCompleted();
            }
        } else if (SpassFingerprint.f57559o) {
            this.f57597c.onCompleted();
        }
    }
}
