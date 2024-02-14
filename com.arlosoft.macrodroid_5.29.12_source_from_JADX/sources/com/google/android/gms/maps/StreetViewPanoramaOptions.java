package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new zzai();
    @SafeParcelable.Field

    /* renamed from: A */
    private StreetViewSource f46181A = StreetViewSource.f46332d;
    @SafeParcelable.Field

    /* renamed from: a */
    private StreetViewPanoramaCamera f46182a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f46183c;
    @SafeParcelable.Field

    /* renamed from: d */
    private LatLng f46184d;
    @SafeParcelable.Field

    /* renamed from: f */
    private Integer f46185f;
    @SafeParcelable.Field

    /* renamed from: g */
    private Boolean f46186g;
    @SafeParcelable.Field

    /* renamed from: o */
    private Boolean f46187o;
    @SafeParcelable.Field

    /* renamed from: p */
    private Boolean f46188p;
    @SafeParcelable.Field

    /* renamed from: s */
    private Boolean f46189s;
    @SafeParcelable.Field

    /* renamed from: z */
    private Boolean f46190z;

    @SafeParcelable.Constructor
    StreetViewPanoramaOptions(@SafeParcelable.Param StreetViewPanoramaCamera streetViewPanoramaCamera, @SafeParcelable.Param String str, @SafeParcelable.Param LatLng latLng, @SafeParcelable.Param Integer num, @SafeParcelable.Param byte b, @SafeParcelable.Param byte b2, @SafeParcelable.Param byte b3, @SafeParcelable.Param byte b4, @SafeParcelable.Param byte b5, @SafeParcelable.Param StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.f46186g = bool;
        this.f46187o = bool;
        this.f46188p = bool;
        this.f46189s = bool;
        this.f46182a = streetViewPanoramaCamera;
        this.f46184d = latLng;
        this.f46185f = num;
        this.f46183c = str;
        this.f46186g = zza.m65068b(b);
        this.f46187o = zza.m65068b(b2);
        this.f46188p = zza.m65068b(b3);
        this.f46189s = zza.m65068b(b4);
        this.f46190z = zza.m65068b(b5);
        this.f46181A = streetViewSource;
    }

    /* renamed from: l2 */
    public final String mo54551l2() {
        return this.f46183c;
    }

    /* renamed from: m2 */
    public final LatLng mo54552m2() {
        return this.f46184d;
    }

    /* renamed from: n2 */
    public final Integer mo54553n2() {
        return this.f46185f;
    }

    /* renamed from: o2 */
    public final StreetViewSource mo54554o2() {
        return this.f46181A;
    }

    /* renamed from: p2 */
    public final StreetViewPanoramaCamera mo54555p2() {
        return this.f46182a;
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("PanoramaId", this.f46183c).mo21720a("Position", this.f46184d).mo21720a("Radius", this.f46185f).mo21720a("Source", this.f46181A).mo21720a("StreetViewPanoramaCamera", this.f46182a).mo21720a("UserNavigationEnabled", this.f46186g).mo21720a("ZoomGesturesEnabled", this.f46187o).mo21720a("PanningGesturesEnabled", this.f46188p).mo21720a("StreetNamesEnabled", this.f46189s).mo21720a("UseViewLifecycleInFragment", this.f46190z).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, mo54555p2(), i, false);
        SafeParcelWriter.m4586x(parcel, 3, mo54551l2(), false);
        SafeParcelWriter.m4584v(parcel, 4, mo54552m2(), i, false);
        SafeParcelWriter.m4579q(parcel, 5, mo54553n2(), false);
        SafeParcelWriter.m4568f(parcel, 6, zza.m65067a(this.f46186g));
        SafeParcelWriter.m4568f(parcel, 7, zza.m65067a(this.f46187o));
        SafeParcelWriter.m4568f(parcel, 8, zza.m65067a(this.f46188p));
        SafeParcelWriter.m4568f(parcel, 9, zza.m65067a(this.f46189s));
        SafeParcelWriter.m4568f(parcel, 10, zza.m65067a(this.f46190z));
        SafeParcelWriter.m4584v(parcel, 11, mo54554o2(), i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f46186g = bool;
        this.f46187o = bool;
        this.f46188p = bool;
        this.f46189s = bool;
    }
}
