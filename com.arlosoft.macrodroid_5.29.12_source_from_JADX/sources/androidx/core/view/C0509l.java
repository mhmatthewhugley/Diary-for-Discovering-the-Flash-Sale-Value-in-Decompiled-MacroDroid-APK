package androidx.core.view;

import android.view.WindowInsetsController;
import androidx.core.view.WindowInsetsControllerCompat;

/* renamed from: androidx.core.view.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0509l implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a */
    public final /* synthetic */ WindowInsetsControllerCompat.Impl30 f516a;

    /* renamed from: b */
    public final /* synthetic */ WindowInsetsControllerCompat.OnControllableInsetsChangedListener f517b;

    public /* synthetic */ C0509l(WindowInsetsControllerCompat.Impl30 impl30, WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.f516a = impl30;
        this.f517b = onControllableInsetsChangedListener;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.f516a.lambda$addOnControllableInsetsChangedListener$0(this.f517b, windowInsetsController, i);
    }
}
