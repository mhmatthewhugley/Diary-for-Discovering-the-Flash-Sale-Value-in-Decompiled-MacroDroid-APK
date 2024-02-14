package androidx.biometric;

import androidx.lifecycle.Observer;

/* renamed from: androidx.biometric.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0275e implements Observer {

    /* renamed from: a */
    public final /* synthetic */ BiometricFragment f324a;

    /* renamed from: b */
    public final /* synthetic */ BiometricViewModel f325b;

    public /* synthetic */ C0275e(BiometricFragment biometricFragment, BiometricViewModel biometricViewModel) {
        this.f324a = biometricFragment;
        this.f325b = biometricViewModel;
    }

    public final void onChanged(Object obj) {
        this.f324a.lambda$connectViewModel$4(this.f325b, (Boolean) obj);
    }
}
