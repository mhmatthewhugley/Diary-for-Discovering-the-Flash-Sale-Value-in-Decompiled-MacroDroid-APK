package p486z8;

import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import dev.skomlach.biometric.compat.engine.internal.DummyBiometricModule;

/* renamed from: z8.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17519a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AuthenticationListener f69349a;

    /* renamed from: c */
    public final /* synthetic */ DummyBiometricModule f69350c;

    public /* synthetic */ C17519a(AuthenticationListener authenticationListener, DummyBiometricModule dummyBiometricModule) {
        this.f69349a = authenticationListener;
        this.f69350c = dummyBiometricModule;
    }

    public final void run() {
        DummyBiometricModule.m101302authenticate$lambda0(this.f69349a, this.f69350c);
    }
}
