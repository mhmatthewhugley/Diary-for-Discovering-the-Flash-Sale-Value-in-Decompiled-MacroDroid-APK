package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzaa();
    @SafeParcelable.Field

    /* renamed from: A */
    private Boolean f46138A;
    @SafeParcelable.Field

    /* renamed from: B */
    private Boolean f46139B;
    @SafeParcelable.Field

    /* renamed from: C */
    private Boolean f46140C;
    @SafeParcelable.Field

    /* renamed from: D */
    private Boolean f46141D;
    @SafeParcelable.Field

    /* renamed from: E */
    private Float f46142E = null;
    @SafeParcelable.Field

    /* renamed from: F */
    private Float f46143F = null;
    @SafeParcelable.Field

    /* renamed from: G */
    private LatLngBounds f46144G = null;
    @SafeParcelable.Field

    /* renamed from: H */
    private Boolean f46145H;
    @SafeParcelable.Field

    /* renamed from: a */
    private Boolean f46146a;
    @SafeParcelable.Field

    /* renamed from: c */
    private Boolean f46147c;
    @SafeParcelable.Field

    /* renamed from: d */
    private int f46148d = -1;
    @SafeParcelable.Field

    /* renamed from: f */
    private CameraPosition f46149f;
    @SafeParcelable.Field

    /* renamed from: g */
    private Boolean f46150g;
    @SafeParcelable.Field

    /* renamed from: o */
    private Boolean f46151o;
    @SafeParcelable.Field

    /* renamed from: p */
    private Boolean f46152p;
    @SafeParcelable.Field

    /* renamed from: s */
    private Boolean f46153s;
    @SafeParcelable.Field

    /* renamed from: z */
    private Boolean f46154z;

    @SafeParcelable.Constructor
    GoogleMapOptions(@SafeParcelable.Param byte b, @SafeParcelable.Param byte b2, @SafeParcelable.Param int i, @SafeParcelable.Param CameraPosition cameraPosition, @SafeParcelable.Param byte b3, @SafeParcelable.Param byte b4, @SafeParcelable.Param byte b5, @SafeParcelable.Param byte b6, @SafeParcelable.Param byte b7, @SafeParcelable.Param byte b8, @SafeParcelable.Param byte b9, @SafeParcelable.Param byte b10, @SafeParcelable.Param byte b11, @SafeParcelable.Param Float f, @SafeParcelable.Param Float f2, @SafeParcelable.Param LatLngBounds latLngBounds, @SafeParcelable.Param byte b12) {
        this.f46146a = zza.m65068b(b);
        this.f46147c = zza.m65068b(b2);
        this.f46148d = i;
        this.f46149f = cameraPosition;
        this.f46150g = zza.m65068b(b3);
        this.f46151o = zza.m65068b(b4);
        this.f46152p = zza.m65068b(b5);
        this.f46153s = zza.m65068b(b6);
        this.f46154z = zza.m65068b(b7);
        this.f46138A = zza.m65068b(b8);
        this.f46139B = zza.m65068b(b9);
        this.f46140C = zza.m65068b(b10);
        this.f46141D = zza.m65068b(b11);
        this.f46142E = f;
        this.f46143F = f2;
        this.f46144G = latLngBounds;
        this.f46145H = zza.m65068b(b12);
    }

    /* renamed from: I2 */
    public static LatLngBounds m64922I2(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C10450R.styleable.MapAttrs);
        int i = C10450R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float valueOf = obtainAttributes.hasValue(i) ? Float.valueOf(obtainAttributes.getFloat(i, 0.0f)) : null;
        int i2 = C10450R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float valueOf2 = obtainAttributes.hasValue(i2) ? Float.valueOf(obtainAttributes.getFloat(i2, 0.0f)) : null;
        int i3 = C10450R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float valueOf3 = obtainAttributes.hasValue(i3) ? Float.valueOf(obtainAttributes.getFloat(i3, 0.0f)) : null;
        int i4 = C10450R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float valueOf4 = obtainAttributes.hasValue(i4) ? Float.valueOf(obtainAttributes.getFloat(i4, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    /* renamed from: J2 */
    public static CameraPosition m64923J2(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C10450R.styleable.MapAttrs);
        int i = C10450R.styleable.MapAttrs_cameraTargetLat;
        float f = obtainAttributes.hasValue(i) ? obtainAttributes.getFloat(i, 0.0f) : 0.0f;
        int i2 = C10450R.styleable.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng((double) f, (double) (obtainAttributes.hasValue(i2) ? obtainAttributes.getFloat(i2, 0.0f) : 0.0f));
        CameraPosition.Builder l2 = CameraPosition.m65201l2();
        l2.mo54677c(latLng);
        int i3 = C10450R.styleable.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i3)) {
            l2.mo54679e(obtainAttributes.getFloat(i3, 0.0f));
        }
        int i4 = C10450R.styleable.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i4)) {
            l2.mo54675a(obtainAttributes.getFloat(i4, 0.0f));
        }
        int i5 = C10450R.styleable.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i5)) {
            l2.mo54678d(obtainAttributes.getFloat(i5, 0.0f));
        }
        obtainAttributes.recycle();
        return l2.mo54676b();
    }

    /* renamed from: o2 */
    public static GoogleMapOptions m64924o2(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C10450R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = C10450R.styleable.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.mo54509x2(obtainAttributes.getInt(i, -1));
        }
        int i2 = C10450R.styleable.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i2)) {
            googleMapOptions.mo54493F2(obtainAttributes.getBoolean(i2, false));
        }
        int i3 = C10450R.styleable.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i3)) {
            googleMapOptions.mo54492E2(obtainAttributes.getBoolean(i3, false));
        }
        int i4 = C10450R.styleable.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i4)) {
            googleMapOptions.mo54498n2(obtainAttributes.getBoolean(i4, true));
        }
        int i5 = C10450R.styleable.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i5)) {
            googleMapOptions.mo54488A2(obtainAttributes.getBoolean(i5, true));
        }
        int i6 = C10450R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i6)) {
            googleMapOptions.mo54490C2(obtainAttributes.getBoolean(i6, true));
        }
        int i7 = C10450R.styleable.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i7)) {
            googleMapOptions.mo54489B2(obtainAttributes.getBoolean(i7, true));
        }
        int i8 = C10450R.styleable.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i8)) {
            googleMapOptions.mo54491D2(obtainAttributes.getBoolean(i8, true));
        }
        int i9 = C10450R.styleable.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i9)) {
            googleMapOptions.mo54495H2(obtainAttributes.getBoolean(i9, true));
        }
        int i10 = C10450R.styleable.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.mo54494G2(obtainAttributes.getBoolean(i10, true));
        }
        int i11 = C10450R.styleable.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.mo54506v2(obtainAttributes.getBoolean(i11, false));
        }
        int i12 = C10450R.styleable.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.mo54507w2(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = C10450R.styleable.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.mo54496l2(obtainAttributes.getBoolean(i13, false));
        }
        int i14 = C10450R.styleable.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.mo54511z2(obtainAttributes.getFloat(i14, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.mo54510y2(obtainAttributes.getFloat(C10450R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.mo54505u2(m64922I2(context, attributeSet));
        googleMapOptions.mo54497m2(m64923J2(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* renamed from: A2 */
    public final GoogleMapOptions mo54488A2(boolean z) {
        this.f46138A = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: B2 */
    public final GoogleMapOptions mo54489B2(boolean z) {
        this.f46152p = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: C2 */
    public final GoogleMapOptions mo54490C2(boolean z) {
        this.f46145H = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: D2 */
    public final GoogleMapOptions mo54491D2(boolean z) {
        this.f46154z = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: E2 */
    public final GoogleMapOptions mo54492E2(boolean z) {
        this.f46147c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: F2 */
    public final GoogleMapOptions mo54493F2(boolean z) {
        this.f46146a = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: G2 */
    public final GoogleMapOptions mo54494G2(boolean z) {
        this.f46150g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: H2 */
    public final GoogleMapOptions mo54495H2(boolean z) {
        this.f46153s = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: l2 */
    public final GoogleMapOptions mo54496l2(boolean z) {
        this.f46141D = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: m2 */
    public final GoogleMapOptions mo54497m2(CameraPosition cameraPosition) {
        this.f46149f = cameraPosition;
        return this;
    }

    /* renamed from: n2 */
    public final GoogleMapOptions mo54498n2(boolean z) {
        this.f46151o = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: p2 */
    public final CameraPosition mo54499p2() {
        return this.f46149f;
    }

    /* renamed from: q2 */
    public final LatLngBounds mo54500q2() {
        return this.f46144G;
    }

    /* renamed from: r2 */
    public final int mo54501r2() {
        return this.f46148d;
    }

    /* renamed from: s2 */
    public final Float mo54502s2() {
        return this.f46143F;
    }

    /* renamed from: t2 */
    public final Float mo54503t2() {
        return this.f46142E;
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("MapType", Integer.valueOf(this.f46148d)).mo21720a("LiteMode", this.f46139B).mo21720a("Camera", this.f46149f).mo21720a("CompassEnabled", this.f46151o).mo21720a("ZoomControlsEnabled", this.f46150g).mo21720a("ScrollGesturesEnabled", this.f46152p).mo21720a("ZoomGesturesEnabled", this.f46153s).mo21720a("TiltGesturesEnabled", this.f46154z).mo21720a("RotateGesturesEnabled", this.f46138A).mo21720a("ScrollGesturesEnabledDuringRotateOrZoom", this.f46145H).mo21720a("MapToolbarEnabled", this.f46140C).mo21720a("AmbientEnabled", this.f46141D).mo21720a("MinZoomPreference", this.f46142E).mo21720a("MaxZoomPreference", this.f46143F).mo21720a("LatLngBoundsForCameraTarget", this.f46144G).mo21720a("ZOrderOnTop", this.f46146a).mo21720a("UseViewLifecycleInFragment", this.f46147c).toString();
    }

    /* renamed from: u2 */
    public final GoogleMapOptions mo54505u2(LatLngBounds latLngBounds) {
        this.f46144G = latLngBounds;
        return this;
    }

    /* renamed from: v2 */
    public final GoogleMapOptions mo54506v2(boolean z) {
        this.f46139B = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: w2 */
    public final GoogleMapOptions mo54507w2(boolean z) {
        this.f46140C = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4568f(parcel, 2, zza.m65067a(this.f46146a));
        SafeParcelWriter.m4568f(parcel, 3, zza.m65067a(this.f46147c));
        SafeParcelWriter.m4576n(parcel, 4, mo54501r2());
        SafeParcelWriter.m4584v(parcel, 5, mo54499p2(), i, false);
        SafeParcelWriter.m4568f(parcel, 6, zza.m65067a(this.f46150g));
        SafeParcelWriter.m4568f(parcel, 7, zza.m65067a(this.f46151o));
        SafeParcelWriter.m4568f(parcel, 8, zza.m65067a(this.f46152p));
        SafeParcelWriter.m4568f(parcel, 9, zza.m65067a(this.f46153s));
        SafeParcelWriter.m4568f(parcel, 10, zza.m65067a(this.f46154z));
        SafeParcelWriter.m4568f(parcel, 11, zza.m65067a(this.f46138A));
        SafeParcelWriter.m4568f(parcel, 12, zza.m65067a(this.f46139B));
        SafeParcelWriter.m4568f(parcel, 14, zza.m65067a(this.f46140C));
        SafeParcelWriter.m4568f(parcel, 15, zza.m65067a(this.f46141D));
        SafeParcelWriter.m4574l(parcel, 16, mo54503t2(), false);
        SafeParcelWriter.m4574l(parcel, 17, mo54502s2(), false);
        SafeParcelWriter.m4584v(parcel, 18, mo54500q2(), i, false);
        SafeParcelWriter.m4568f(parcel, 19, zza.m65067a(this.f46145H));
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* renamed from: x2 */
    public final GoogleMapOptions mo54509x2(int i) {
        this.f46148d = i;
        return this;
    }

    /* renamed from: y2 */
    public final GoogleMapOptions mo54510y2(float f) {
        this.f46143F = Float.valueOf(f);
        return this;
    }

    /* renamed from: z2 */
    public final GoogleMapOptions mo54511z2(float f) {
        this.f46142E = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions() {
    }
}
