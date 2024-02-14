package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0454l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f461a;

    /* renamed from: c */
    public final /* synthetic */ int f462c;

    public /* synthetic */ C0454l(LocationManagerCompat.LocationListenerTransport locationListenerTransport, int i) {
        this.f461a = locationListenerTransport;
        this.f462c = i;
    }

    public final void run() {
        this.f461a.lambda$onFlushComplete$2(this.f462c);
    }
}
