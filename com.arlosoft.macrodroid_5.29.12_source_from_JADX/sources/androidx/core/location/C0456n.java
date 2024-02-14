package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0456n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f465a;

    /* renamed from: c */
    public final /* synthetic */ String f466c;

    public /* synthetic */ C0456n(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f465a = locationListenerTransport;
        this.f466c = str;
    }

    public final void run() {
        this.f465a.lambda$onProviderEnabled$4(this.f466c);
    }
}
