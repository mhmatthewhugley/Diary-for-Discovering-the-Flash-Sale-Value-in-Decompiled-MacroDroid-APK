package p302k;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: k.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13381b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f61399a;

    /* renamed from: c */
    public final /* synthetic */ Violation f61400c;

    public /* synthetic */ C13381b(String str, Violation violation) {
        this.f61399a = str;
        this.f61400c = violation;
    }

    public final void run() {
        FragmentStrictMode.m101276handlePolicyViolation$lambda1(this.f61399a, this.f61400c);
    }
}
