package p453ze;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.lang.ref.WeakReference;
import p044pl.charmas.android.reactivelocation.observables.C16215b;
import p445ye.C17038a;
import p459ef.C17153c;
import p459ef.C17156d;

/* renamed from: ze.a */
/* compiled from: LocationUpdatesObservable */
public class C17092a extends C17038a<Location> {

    /* renamed from: f */
    private final LocationRequest f68652f;

    /* renamed from: g */
    private LocationListener f68653g;

    /* renamed from: ze.a$a */
    /* compiled from: LocationUpdatesObservable */
    private static class C17093a implements LocationListener {

        /* renamed from: a */
        private final WeakReference<C17156d<? super Location>> f68654a;

        C17093a(C17156d<? super Location> dVar) {
            this.f68654a = new WeakReference<>(dVar);
        }

        public void onLocationChanged(Location location) {
            C17156d dVar = (C17156d) this.f68654a.get();
            if (dVar != null) {
                dVar.onNext(location);
            }
        }
    }

    private C17092a(C16215b bVar, LocationRequest locationRequest) {
        super(bVar);
        this.f68652f = locationRequest;
    }

    /* renamed from: f */
    public static C17153c<Location> m100562f(C16215b bVar, LocationRequest locationRequest) {
        C17153c<Location> a = C17153c.m100630a(new C17092a(bVar, locationRequest));
        int n2 = locationRequest.mo54185n2();
        return (n2 <= 0 || n2 >= Integer.MAX_VALUE) ? a : a.mo80437m(n2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo78729d(GoogleApiClient googleApiClient, C17156d<? super Location> dVar) {
        C17093a aVar = new C17093a(dVar);
        this.f68653g = aVar;
        LocationServices.f45844b.mo50651b(googleApiClient, this.f68652f, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo78730e(GoogleApiClient googleApiClient) {
        if (googleApiClient.mo21255l()) {
            LocationServices.f45844b.mo50650a(googleApiClient, this.f68653g);
        }
    }
}
