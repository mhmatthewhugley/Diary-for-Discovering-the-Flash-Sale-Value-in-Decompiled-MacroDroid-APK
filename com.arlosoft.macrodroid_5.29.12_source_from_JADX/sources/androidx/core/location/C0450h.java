package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0450h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f451a;

    /* renamed from: c */
    public final /* synthetic */ Executor f452c;

    public /* synthetic */ C0450h(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f451a = gpsStatusTransport;
        this.f452c = executor;
    }

    public final void run() {
        this.f451a.lambda$onGpsStatusChanged$0(this.f452c);
    }
}
