package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0453k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f458a;

    /* renamed from: c */
    public final /* synthetic */ Executor f459c;

    /* renamed from: d */
    public final /* synthetic */ GnssStatusCompat f460d;

    public /* synthetic */ C0453k(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, GnssStatusCompat gnssStatusCompat) {
        this.f458a = gpsStatusTransport;
        this.f459c = executor;
        this.f460d = gnssStatusCompat;
    }

    public final void run() {
        this.f458a.lambda$onGpsStatusChanged$3(this.f459c, this.f460d);
    }
}
