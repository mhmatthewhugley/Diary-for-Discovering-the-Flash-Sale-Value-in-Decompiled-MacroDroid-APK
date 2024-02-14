package dev.skomlach.biometric.compat.impl.dialogs;

/* renamed from: dev.skomlach.biometric.compat.impl.dialogs.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12057h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompatDialogImpl f58279a;

    /* renamed from: c */
    public final /* synthetic */ boolean f58280c;

    public /* synthetic */ C12057h(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl, boolean z) {
        this.f58279a = biometricPromptCompatDialogImpl;
        this.f58280c = z;
    }

    public final void run() {
        BiometricPromptCompatDialogImpl.m101341onFailure$lambda8(this.f58279a, this.f58280c);
    }
}
