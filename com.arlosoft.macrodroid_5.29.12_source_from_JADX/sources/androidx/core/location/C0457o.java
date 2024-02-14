package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0457o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f467a;

    /* renamed from: c */
    public final /* synthetic */ String f468c;

    public /* synthetic */ C0457o(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f467a = locationListenerTransport;
        this.f468c = str;
    }

    public final void run() {
        this.f467a.lambda$onProviderDisabled$5(this.f468c);
    }
}
