package androidx.biometric;

/* renamed from: androidx.biometric.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0277g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiometricFragment f328a;

    /* renamed from: c */
    public final /* synthetic */ int f329c;

    /* renamed from: d */
    public final /* synthetic */ CharSequence f330d;

    public /* synthetic */ C0277g(BiometricFragment biometricFragment, int i, CharSequence charSequence) {
        this.f328a = biometricFragment;
        this.f329c = i;
        this.f330d = charSequence;
    }

    public final void run() {
        this.f328a.lambda$onAuthenticationError$7(this.f329c, this.f330d);
    }
}
