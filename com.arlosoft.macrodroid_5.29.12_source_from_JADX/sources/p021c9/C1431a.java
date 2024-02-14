package p021c9;

import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.utils.notification.BiometricNotificationManager;

/* renamed from: c9.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1431a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompat.Builder f768a;

    public /* synthetic */ C1431a(BiometricPromptCompat.Builder builder) {
        this.f768a = builder;
    }

    public final void run() {
        BiometricNotificationManager.m101367showNotification$lambda0(this.f768a);
    }
}
