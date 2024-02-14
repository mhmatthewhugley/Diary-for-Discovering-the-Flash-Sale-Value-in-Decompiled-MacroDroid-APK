package dev.skomlach.biometric.compat.impl.dialogs;

import android.content.DialogInterface;

/* renamed from: dev.skomlach.biometric.compat.impl.dialogs.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12052c implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompatDialogImpl f58273a;

    public /* synthetic */ C12052c(BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl) {
        this.f58273a = biometricPromptCompatDialogImpl;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        BiometricPromptCompatDialogImpl.m101337_init_$lambda0(this.f58273a, dialogInterface);
    }
}
