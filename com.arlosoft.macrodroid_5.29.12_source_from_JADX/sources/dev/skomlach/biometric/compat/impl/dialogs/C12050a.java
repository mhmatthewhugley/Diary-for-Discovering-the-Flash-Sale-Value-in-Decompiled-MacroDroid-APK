package dev.skomlach.biometric.compat.impl.dialogs;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C13684d0;

/* renamed from: dev.skomlach.biometric.compat.impl.dialogs.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12050a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ BiometricPromptCompatDialog f58270a;

    /* renamed from: c */
    public final /* synthetic */ C13684d0 f58271c;

    public /* synthetic */ C12050a(BiometricPromptCompatDialog biometricPromptCompatDialog, C13684d0 d0Var) {
        this.f58270a = biometricPromptCompatDialog;
        this.f58271c = d0Var;
    }

    public final void onGlobalLayout() {
        BiometricPromptCompatDialog.m101335onCreateView$lambda4(this.f58270a, this.f58271c);
    }
}
