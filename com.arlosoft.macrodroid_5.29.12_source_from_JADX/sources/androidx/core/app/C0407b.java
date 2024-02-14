package androidx.core.app;

import android.app.SharedElementCallback;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;

/* renamed from: androidx.core.app.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0407b implements SharedElementCallback.OnSharedElementsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f406a;

    public /* synthetic */ C0407b(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.f406a = onSharedElementsReadyListener;
    }

    public final void onSharedElementsReady() {
        ActivityCompat.Api23Impl.onSharedElementsReady(this.f406a);
    }
}
