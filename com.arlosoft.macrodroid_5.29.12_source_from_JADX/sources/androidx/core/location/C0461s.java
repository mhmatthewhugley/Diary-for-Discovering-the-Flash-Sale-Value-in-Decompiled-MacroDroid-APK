package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0461s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f477a;

    /* renamed from: c */
    public final /* synthetic */ Executor f478c;

    public /* synthetic */ C0461s(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f477a = preRGnssStatusTransport;
        this.f478c = executor;
    }

    public final void run() {
        this.f477a.lambda$onStarted$0(this.f478c);
    }
}
