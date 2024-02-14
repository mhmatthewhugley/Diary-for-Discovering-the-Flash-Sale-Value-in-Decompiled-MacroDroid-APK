package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0455m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f463a;

    /* renamed from: c */
    public final /* synthetic */ Location f464c;

    public /* synthetic */ C0455m(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Location location) {
        this.f463a = locationListenerTransport;
        this.f464c = location;
    }

    public final void run() {
        this.f463a.lambda$onLocationChanged$0(this.f464c);
    }
}
