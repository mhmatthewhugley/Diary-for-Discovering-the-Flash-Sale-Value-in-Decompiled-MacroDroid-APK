package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintManager;
import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: com.samsung.android.sdk.pass.d */
final class C11722d implements FingerprintManager.EnrollFinishListener {

    /* renamed from: a */
    private final /* synthetic */ SpassFingerprint.RegisterListener f57594a;

    C11722d(SpassFingerprint.RegisterListener registerListener) {
        this.f57594a = registerListener;
    }

    public final void onEnrollFinish() {
        this.f57594a.onFinished();
    }
}
