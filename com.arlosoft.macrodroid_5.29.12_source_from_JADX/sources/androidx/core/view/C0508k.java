package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.core.view.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0508k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f515a;

    public /* synthetic */ C0508k(View view) {
        this.f515a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f515a.getContext().getSystemService("input_method")).showSoftInput(this.f515a, 0);
    }
}
