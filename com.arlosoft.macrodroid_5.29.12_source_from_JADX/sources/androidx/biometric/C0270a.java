package androidx.biometric;

import androidx.lifecycle.Observer;

/* renamed from: androidx.biometric.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0270a implements Observer {

    /* renamed from: a */
    public final /* synthetic */ BiometricFragment f315a;

    /* renamed from: b */
    public final /* synthetic */ BiometricViewModel f316b;

    public /* synthetic */ C0270a(BiometricFragment biometricFragment, BiometricViewModel biometricViewModel) {
        this.f315a = biometricFragment;
        this.f316b = biometricViewModel;
    }

    public final void onChanged(Object obj) {
        this.f315a.lambda$connectViewModel$1(this.f316b, (BiometricErrorData) obj);
    }
}
