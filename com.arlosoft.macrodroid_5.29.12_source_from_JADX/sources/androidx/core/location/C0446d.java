package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.location.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0446d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ LocationManager f445a;

    /* renamed from: c */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f446c;

    public /* synthetic */ C0446d(LocationManager locationManager, LocationManagerCompat.GpsStatusTransport gpsStatusTransport) {
        this.f445a = locationManager;
        this.f446c = gpsStatusTransport;
    }

    public final Object call() {
        return Boolean.valueOf(this.f445a.addGpsStatusListener(this.f446c));
    }
}
