package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.f */
final class C11724f implements Runnable {

    /* renamed from: a */
    private /* synthetic */ SpassFingerprint.C11718c f57598a;

    /* renamed from: b */
    private final /* synthetic */ FingerprintEvent f57599b;

    C11724f(SpassFingerprint.C11718c cVar, FingerprintEvent fingerprintEvent) {
        this.f57598a = cVar;
        this.f57599b = fingerprintEvent;
    }

    public final void run() {
        if (this.f57598a.f57585a != null) {
            int i = this.f57599b.eventId;
            if (i == 11) {
                this.f57598a.f57585a.onReady();
            } else if (i == 12) {
                this.f57598a.f57585a.onStarted();
            }
        }
    }
}
