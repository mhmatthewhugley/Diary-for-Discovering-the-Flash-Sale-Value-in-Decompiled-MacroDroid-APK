package androidx.biometric;

/* renamed from: androidx.biometric.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0278h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricViewModel f331a;

    public /* synthetic */ C0278h(BiometricViewModel biometricViewModel) {
        this.f331a = biometricViewModel;
    }

    public final void run() {
        this.f331a.setFingerprintDialogDismissedInstantly(false);
    }
}
