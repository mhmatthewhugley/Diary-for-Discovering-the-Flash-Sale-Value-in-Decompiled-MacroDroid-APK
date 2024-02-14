package androidx.biometric;

import androidx.lifecycle.Observer;

/* renamed from: androidx.biometric.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0274d implements Observer {

    /* renamed from: a */
    public final /* synthetic */ BiometricFragment f322a;

    /* renamed from: b */
    public final /* synthetic */ BiometricViewModel f323b;

    public /* synthetic */ C0274d(BiometricFragment biometricFragment, BiometricViewModel biometricViewModel) {
        this.f322a = biometricFragment;
        this.f323b = biometricViewModel;
    }

    public final void onChanged(Object obj) {
        this.f322a.lambda$connectViewModel$3(this.f323b, (Boolean) obj);
    }
}
