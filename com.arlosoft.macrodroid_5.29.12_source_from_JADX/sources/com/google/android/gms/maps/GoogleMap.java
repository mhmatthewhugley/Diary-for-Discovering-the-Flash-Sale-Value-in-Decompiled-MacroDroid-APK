package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaj;
import com.google.android.gms.maps.internal.zzd;
import com.google.android.gms.maps.internal.zzl;
import com.google.android.gms.maps.internal.zzr;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class GoogleMap {

    /* renamed from: a */
    private final IGoogleMapDelegate f46135a;

    /* renamed from: b */
    private UiSettings f46136b;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        /* renamed from: a */
        View mo54460a(Marker marker);

        /* renamed from: b */
        View mo54461b(Marker marker);
    }

    @Deprecated
    public interface OnCameraChangeListener {
        /* renamed from: A0 */
        void mo54462A0(CameraPosition cameraPosition);
    }

    public interface OnCameraIdleListener {
        /* renamed from: d1 */
        void mo54463d1();
    }

    public interface OnCameraMoveCanceledListener {
        /* renamed from: c1 */
        void mo54464c1();
    }

    public interface OnCameraMoveListener {
        /* renamed from: F0 */
        void mo54465F0();
    }

    public interface OnCameraMoveStartedListener {
        /* renamed from: q1 */
        void mo54466q1(int i);
    }

    public interface OnCircleClickListener {
        /* renamed from: a */
        void mo54467a(Circle circle);
    }

    public interface OnGroundOverlayClickListener {
        /* renamed from: a */
        void mo54468a(GroundOverlay groundOverlay);
    }

    public interface OnIndoorStateChangeListener {
        /* renamed from: w1 */
        void mo54469w1();

        /* renamed from: x1 */
        void mo54470x1(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        /* renamed from: a */
        void mo54471a(Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        /* renamed from: a */
        void mo54472a(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        /* renamed from: a */
        void mo54473a(Marker marker);
    }

    public interface OnMapClickListener {
        /* renamed from: K0 */
        void mo31727K0(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        /* renamed from: G0 */
        void mo54474G0();
    }

    public interface OnMapLongClickListener {
        /* renamed from: p1 */
        void mo54475p1(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        /* renamed from: a */
        boolean mo54476a(Marker marker);
    }

    public interface OnMarkerDragListener {
        /* renamed from: a */
        void mo54477a(Marker marker);

        /* renamed from: b */
        void mo54478b(Marker marker);

        /* renamed from: c */
        void mo54479c(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        /* renamed from: P0 */
        boolean mo54480P0();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        /* renamed from: a */
        void mo54481a(Location location);
    }

    public interface OnMyLocationClickListener {
        /* renamed from: v1 */
        void mo54482v1(@NonNull Location location);
    }

    public interface OnPoiClickListener {
        /* renamed from: a */
        void mo54483a(PointOfInterest pointOfInterest);
    }

    public interface OnPolygonClickListener {
        /* renamed from: a */
        void mo54484a(Polygon polygon);
    }

    public interface OnPolylineClickListener {
        /* renamed from: a */
        void mo54485a(Polyline polyline);
    }

    public interface SnapshotReadyCallback {
        /* renamed from: C0 */
        void mo29236C0(Bitmap bitmap);
    }

    private static final class zza extends zzd {

        /* renamed from: a */
        private final CancelableCallback f46137a;

        public final void onCancel() {
            this.f46137a.onCancel();
        }

        public final void onFinish() {
            this.f46137a.onFinish();
        }
    }

    public GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f46135a = (IGoogleMapDelegate) Preconditions.m4488k(iGoogleMapDelegate);
    }

    /* renamed from: a */
    public final Marker mo54445a(MarkerOptions markerOptions) {
        try {
            zzt y6 = this.f46135a.mo54575y6(markerOptions);
            if (y6 != null) {
                return new Marker(y6);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo54446b(CameraUpdate cameraUpdate) {
        try {
            this.f46135a.mo54576z5(cameraUpdate.mo54444a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final CameraPosition mo54447c() {
        try {
            return this.f46135a.mo54571b3();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final Projection mo54448d() {
        try {
            return new Projection(this.f46135a.mo54568U0());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final UiSettings mo54449e() {
        try {
            if (this.f46136b == null) {
                this.f46136b = new UiSettings(this.f46135a.mo54570aa());
            }
            return this.f46136b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public final void mo54450f(CameraUpdate cameraUpdate) {
        try {
            this.f46135a.mo54574l8(cameraUpdate.mo54444a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final void mo54451g(int i) {
        try {
            this.f46135a.mo54567T3(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    /* renamed from: h */
    public final void mo54452h(@Nullable OnCameraChangeListener onCameraChangeListener) {
        if (onCameraChangeListener == null) {
            try {
                this.f46135a.mo54573h2((zzl) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f46135a.mo54573h2(new zzt(this, onCameraChangeListener));
        }
    }

    /* renamed from: i */
    public final void mo54453i(@Nullable OnCameraMoveListener onCameraMoveListener) {
        if (onCameraMoveListener == null) {
            try {
                this.f46135a.mo54572e5((zzr) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f46135a.mo54572e5(new zzv(this, onCameraMoveListener));
        }
    }

    /* renamed from: j */
    public final void mo54454j(@Nullable OnMapClickListener onMapClickListener) {
        if (onMapClickListener == null) {
            try {
                this.f46135a.mo54577z7((zzaj) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f46135a.mo54577z7(new zzy(this, onMapClickListener));
        }
    }

    /* renamed from: k */
    public final void mo54455k(int i, int i2, int i3, int i4) {
        try {
            this.f46135a.mo54569U7(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public final void mo54456l(SnapshotReadyCallback snapshotReadyCallback) {
        mo54457m(snapshotReadyCallback, (Bitmap) null);
    }

    /* renamed from: m */
    public final void mo54457m(SnapshotReadyCallback snapshotReadyCallback, Bitmap bitmap) {
        try {
            this.f46135a.mo54566J8(new zzr(this, snapshotReadyCallback), (ObjectWrapper) (bitmap != null ? ObjectWrapper.m5051g8(bitmap) : null));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
