package androidx.biometric;

import androidx.biometric.BiometricPrompt;
import androidx.lifecycle.Observer;

/* renamed from: androidx.biometric.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0272b implements Observer {

    /* renamed from: a */
    public final /* synthetic */ BiometricFragment f318a;

    /* renamed from: b */
    public final /* synthetic */ BiometricViewModel f319b;

    public /* synthetic */ C0272b(BiometricFragment biometricFragment, BiometricViewModel biometricViewModel) {
        this.f318a = biometricFragment;
        this.f319b = biometricViewModel;
    }

    public final void onChanged(Object obj) {
        this.f318a.lambda$connectViewModel$0(this.f319b, (BiometricPrompt.AuthenticationResult) obj);
    }
}
