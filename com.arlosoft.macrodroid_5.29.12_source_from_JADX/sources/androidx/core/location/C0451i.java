package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0451i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f453a;

    /* renamed from: c */
    public final /* synthetic */ Executor f454c;

    public /* synthetic */ C0451i(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f453a = gpsStatusTransport;
        this.f454c = executor;
    }

    public final void run() {
        this.f453a.lambda$onGpsStatusChanged$1(this.f454c);
    }
}
