package dev.skomlach.biometric.compat.impl.dialogs;

import android.content.DialogInterface;

/* renamed from: dev.skomlach.biometric.compat.impl.dialogs.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12051b implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompatDialogImpl f58272a;

    public /* synthetic */ C12051b(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl) {
        this.f58272a = biometricPromptCompatDialogImpl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        BiometricPromptCompatDialogImpl.m101338_init_$lambda1(this.f58272a, dialogInterface);
    }
}
