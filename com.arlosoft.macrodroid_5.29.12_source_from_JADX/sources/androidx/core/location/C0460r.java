package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0460r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f475a;

    /* renamed from: c */
    public final /* synthetic */ Executor f476c;

    public /* synthetic */ C0460r(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f475a = preRGnssStatusTransport;
        this.f476c = executor;
    }

    public final void run() {
        this.f475a.lambda$onStopped$1(this.f476c);
    }
}
