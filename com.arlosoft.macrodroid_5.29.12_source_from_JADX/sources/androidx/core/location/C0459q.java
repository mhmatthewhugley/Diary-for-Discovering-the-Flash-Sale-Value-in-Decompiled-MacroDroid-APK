package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.List;

/* renamed from: androidx.core.location.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0459q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f473a;

    /* renamed from: c */
    public final /* synthetic */ List f474c;

    public /* synthetic */ C0459q(LocationManagerCompat.LocationListenerTransport locationListenerTransport, List list) {
        this.f473a = locationListenerTransport;
        this.f474c = list;
    }

    public final void run() {
        this.f473a.lambda$onLocationChanged$1(this.f474c);
    }
}
