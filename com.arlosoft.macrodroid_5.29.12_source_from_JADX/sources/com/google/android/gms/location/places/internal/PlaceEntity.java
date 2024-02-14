package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, Place {
    public static final Parcelable.Creator<PlaceEntity> CREATOR = new zzag();
    @SafeParcelable.Field

    /* renamed from: A */
    private final List<Integer> f45938A;
    @SafeParcelable.Field

    /* renamed from: B */
    private final String f45939B;
    @SafeParcelable.Field

    /* renamed from: C */
    private final String f45940C;
    @SafeParcelable.Field

    /* renamed from: D */
    private final String f45941D;
    @SafeParcelable.Field

    /* renamed from: E */
    private final List<String> f45942E;
    @SafeParcelable.Field

    /* renamed from: F */
    private final zzal f45943F;
    @SafeParcelable.Field

    /* renamed from: G */
    private final zzai f45944G;
    @SafeParcelable.Field

    /* renamed from: H */
    private final String f45945H;

    /* renamed from: I */
    private Locale f45946I;
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f45947a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final LatLng f45948c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final float f45949d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final LatLngBounds f45950f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f45951g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final Uri f45952o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final boolean f45953p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final float f45954s;
    @SafeParcelable.Field

    /* renamed from: z */
    private final int f45955z;

    public static class zzb {

        /* renamed from: a */
        private float f45956a = -1.0f;

        /* renamed from: b */
        private int f45957b = -1;
    }

    @SafeParcelable.Constructor
    PlaceEntity(@SafeParcelable.Param String str, @SafeParcelable.Param List<Integer> list, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param List<String> list2, @SafeParcelable.Param LatLng latLng, @SafeParcelable.Param float f, @SafeParcelable.Param LatLngBounds latLngBounds, @SafeParcelable.Param String str5, @SafeParcelable.Param Uri uri, @SafeParcelable.Param boolean z, @SafeParcelable.Param float f2, @SafeParcelable.Param int i, @SafeParcelable.Param zzal zzal, @SafeParcelable.Param zzai zzai, @SafeParcelable.Param String str6) {
        List<String> list3;
        this.f45947a = str;
        this.f45938A = Collections.unmodifiableList(list);
        this.f45939B = str2;
        this.f45940C = str3;
        this.f45941D = str4;
        if (list2 != null) {
            list3 = list2;
        } else {
            list3 = Collections.emptyList();
        }
        this.f45942E = list3;
        this.f45948c = latLng;
        this.f45949d = f;
        this.f45950f = latLngBounds;
        this.f45951g = str5 != null ? str5 : "UTC";
        this.f45952o = uri;
        this.f45953p = z;
        this.f45954s = f2;
        this.f45955z = i;
        this.f45946I = null;
        this.f45943F = zzal;
        this.f45944G = zzai;
        this.f45945H = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.f45947a.equals(placeEntity.f45947a) && Objects.m4470a(this.f45946I, placeEntity.f45946I);
    }

    @VisibleForTesting
    public final String getId() {
        return this.f45947a;
    }

    public final /* synthetic */ CharSequence getName() {
        return this.f45939B;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45947a, this.f45946I);
    }

    /* renamed from: l2 */
    public final /* synthetic */ CharSequence mo54266l2() {
        return this.f45940C;
    }

    /* renamed from: m2 */
    public final LatLng mo54267m2() {
        return this.f45948c;
    }

    /* renamed from: n2 */
    public final /* synthetic */ CharSequence mo54268n2() {
        return this.f45941D;
    }

    /* renamed from: o2 */
    public final List<Integer> mo54269o2() {
        return this.f45938A;
    }

    /* renamed from: p2 */
    public final int mo54270p2() {
        return this.f45955z;
    }

    /* renamed from: q2 */
    public final float mo54271q2() {
        return this.f45954s;
    }

    /* renamed from: r2 */
    public final LatLngBounds mo54272r2() {
        return this.f45950f;
    }

    /* renamed from: s2 */
    public final Uri mo54273s2() {
        return this.f45952o;
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("id", this.f45947a).mo21720a("placeTypes", this.f45938A).mo21720a("locale", this.f45946I).mo21720a("name", this.f45939B).mo21720a("address", this.f45940C).mo21720a("phoneNumber", this.f45941D).mo21720a("latlng", this.f45948c).mo21720a("viewport", this.f45950f).mo21720a("websiteUri", this.f45952o).mo21720a("isPermanentlyClosed", Boolean.valueOf(this.f45953p)).mo21720a("priceLevel", Integer.valueOf(this.f45955z)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, getId(), false);
        SafeParcelWriter.m4584v(parcel, 4, mo54267m2(), i, false);
        SafeParcelWriter.m4573k(parcel, 5, this.f45949d);
        SafeParcelWriter.m4584v(parcel, 6, mo54272r2(), i, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f45951g, false);
        SafeParcelWriter.m4584v(parcel, 8, mo54273s2(), i, false);
        SafeParcelWriter.m4565c(parcel, 9, this.f45953p);
        SafeParcelWriter.m4573k(parcel, 10, mo54271q2());
        SafeParcelWriter.m4576n(parcel, 11, mo54270p2());
        SafeParcelWriter.m4586x(parcel, 14, (String) mo54266l2(), false);
        SafeParcelWriter.m4586x(parcel, 15, (String) mo54268n2(), false);
        SafeParcelWriter.m4588z(parcel, 17, this.f45942E, false);
        SafeParcelWriter.m4586x(parcel, 19, (String) getName(), false);
        SafeParcelWriter.m4578p(parcel, 20, mo54269o2(), false);
        SafeParcelWriter.m4584v(parcel, 21, this.f45943F, i, false);
        SafeParcelWriter.m4584v(parcel, 22, this.f45944G, i, false);
        SafeParcelWriter.m4586x(parcel, 23, this.f45945H, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
