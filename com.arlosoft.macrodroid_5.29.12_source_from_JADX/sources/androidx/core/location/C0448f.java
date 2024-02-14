package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0448f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.CancellableLocationListener f448a;

    public /* synthetic */ C0448f(LocationManagerCompat.CancellableLocationListener cancellableLocationListener) {
        this.f448a = cancellableLocationListener;
    }

    public final void run() {
        this.f448a.lambda$startTimeout$0();
    }
}
