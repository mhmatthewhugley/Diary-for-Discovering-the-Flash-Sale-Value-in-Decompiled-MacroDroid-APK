package dev.skomlach.biometric.compat.engine.internal.fingerprint;

import com.samsung.android.sdk.pass.SpassFingerprint;

/* renamed from: dev.skomlach.biometric.compat.engine.internal.fingerprint.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12038a implements SpassFingerprint.RegisterListener {

    /* renamed from: a */
    public static final /* synthetic */ C12038a f58251a = new C12038a();

    private /* synthetic */ C12038a() {
    }

    public final void onFinished() {
        SamsungFingerprintModule.m101306openSettings$lambda8();
    }
}
