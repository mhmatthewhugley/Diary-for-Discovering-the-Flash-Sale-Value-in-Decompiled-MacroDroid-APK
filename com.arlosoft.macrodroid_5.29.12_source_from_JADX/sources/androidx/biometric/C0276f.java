package androidx.biometric;

import androidx.lifecycle.Observer;

/* renamed from: androidx.biometric.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0276f implements Observer {

    /* renamed from: a */
    public final /* synthetic */ BiometricFragment f326a;

    /* renamed from: b */
    public final /* synthetic */ BiometricViewModel f327b;

    public /* synthetic */ C0276f(BiometricFragment biometricFragment, BiometricViewModel biometricViewModel) {
        this.f326a = biometricFragment;
        this.f327b = biometricViewModel;
    }

    public final void onChanged(Object obj) {
        this.f326a.lambda$connectViewModel$2(this.f327b, (CharSequence) obj);
    }
}
