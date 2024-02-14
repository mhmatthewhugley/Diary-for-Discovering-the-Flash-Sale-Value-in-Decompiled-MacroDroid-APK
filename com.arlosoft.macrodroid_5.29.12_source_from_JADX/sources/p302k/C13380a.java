package p302k;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: k.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13380a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FragmentStrictMode.Policy f61397a;

    /* renamed from: c */
    public final /* synthetic */ Violation f61398c;

    public /* synthetic */ C13380a(FragmentStrictMode.Policy policy, Violation violation) {
        this.f61397a = policy;
        this.f61398c = violation;
    }

    public final void run() {
        FragmentStrictMode.m101275handlePolicyViolation$lambda0(this.f61397a, this.f61398c);
    }
}
