package androidx.core.location;

import android.os.Bundle;
import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0458p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f469a;

    /* renamed from: c */
    public final /* synthetic */ String f470c;

    /* renamed from: d */
    public final /* synthetic */ int f471d;

    /* renamed from: f */
    public final /* synthetic */ Bundle f472f;

    public /* synthetic */ C0458p(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i, Bundle bundle) {
        this.f469a = locationListenerTransport;
        this.f470c = str;
        this.f471d = i;
        this.f472f = bundle;
    }

    public final void run() {
        this.f469a.lambda$onStatusChanged$3(this.f470c, this.f471d, this.f472f);
    }
}
