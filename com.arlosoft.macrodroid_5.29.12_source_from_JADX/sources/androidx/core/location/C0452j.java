package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0452j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f455a;

    /* renamed from: c */
    public final /* synthetic */ Executor f456c;

    /* renamed from: d */
    public final /* synthetic */ int f457d;

    public /* synthetic */ C0452j(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, int i) {
        this.f455a = gpsStatusTransport;
        this.f456c = executor;
        this.f457d = i;
    }

    public final void run() {
        this.f455a.lambda$onGpsStatusChanged$2(this.f456c, this.f457d);
    }
}
