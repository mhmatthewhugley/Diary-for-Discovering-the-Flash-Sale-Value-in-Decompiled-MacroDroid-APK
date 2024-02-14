package androidx.biometric;

import androidx.lifecycle.Observer;

/* renamed from: androidx.biometric.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0273c implements Observer {

    /* renamed from: a */
    public final /* synthetic */ BiometricFragment f320a;

    /* renamed from: b */
    public final /* synthetic */ BiometricViewModel f321b;

    public /* synthetic */ C0273c(BiometricFragment biometricFragment, BiometricViewModel biometricViewModel) {
        this.f320a = biometricFragment;
        this.f321b = biometricViewModel;
    }

    public final void onChanged(Object obj) {
        this.f320a.lambda$connectViewModel$5(this.f321b, (Boolean) obj);
    }
}
