package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import androidx.core.p007os.CancellationSignal;

/* renamed from: androidx.core.location.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0444b implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.CancellableLocationListener f442a;

    public /* synthetic */ C0444b(LocationManagerCompat.CancellableLocationListener cancellableLocationListener) {
        this.f442a = cancellableLocationListener;
    }

    public final void onCancel() {
        this.f442a.cancel();
    }
}
