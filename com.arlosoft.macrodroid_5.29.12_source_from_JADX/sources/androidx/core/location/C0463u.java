package androidx.core.location;

import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0463u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f482a;

    /* renamed from: c */
    public final /* synthetic */ Executor f483c;

    /* renamed from: d */
    public final /* synthetic */ GnssStatus f484d;

    public /* synthetic */ C0463u(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, GnssStatus gnssStatus) {
        this.f482a = preRGnssStatusTransport;
        this.f483c = executor;
        this.f484d = gnssStatus;
    }

    public final void run() {
        this.f482a.lambda$onSatelliteStatusChanged$3(this.f483c, this.f484d);
    }
}
