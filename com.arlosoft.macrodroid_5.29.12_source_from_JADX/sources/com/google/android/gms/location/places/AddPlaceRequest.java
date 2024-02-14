package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddPlaceRequest> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f45880a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final LatLng f45881c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f45882d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<Integer> f45883f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f45884g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final Uri f45885o;

    @SafeParcelable.Constructor
    public AddPlaceRequest(@SafeParcelable.Param String str, @SafeParcelable.Param LatLng latLng, @SafeParcelable.Param String str2, @SafeParcelable.Param List<Integer> list, @SafeParcelable.Param String str3, @SafeParcelable.Param Uri uri) {
        this.f45880a = Preconditions.m4484g(str);
        this.f45881c = (LatLng) Preconditions.m4488k(latLng);
        this.f45882d = Preconditions.m4484g(str2);
        ArrayList arrayList = new ArrayList((Collection) Preconditions.m4488k(list));
        this.f45883f = arrayList;
        boolean z = true;
        Preconditions.m4479b(!arrayList.isEmpty(), "At least one place type should be provided.");
        if (TextUtils.isEmpty(str3) && uri == null) {
            z = false;
        }
        Preconditions.m4479b(z, "One of phone number or URI should be provided.");
        this.f45884g = str3;
        this.f45885o = uri;
    }

    public String getName() {
        return this.f45880a;
    }

    /* renamed from: l2 */
    public String mo54226l2() {
        return this.f45882d;
    }

    /* renamed from: m2 */
    public LatLng mo54227m2() {
        return this.f45881c;
    }

    @Nullable
    /* renamed from: n2 */
    public String mo54228n2() {
        return this.f45884g;
    }

    /* renamed from: o2 */
    public List<Integer> mo54229o2() {
        return this.f45883f;
    }

    @Nullable
    /* renamed from: p2 */
    public Uri mo54230p2() {
        return this.f45885o;
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a("name", this.f45880a).mo21720a("latLng", this.f45881c).mo21720a("address", this.f45882d).mo21720a("placeTypes", this.f45883f).mo21720a("phoneNumer", this.f45884g).mo21720a("websiteUri", this.f45885o).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, getName(), false);
        SafeParcelWriter.m4584v(parcel, 2, mo54227m2(), i, false);
        SafeParcelWriter.m4586x(parcel, 3, mo54226l2(), false);
        SafeParcelWriter.m4578p(parcel, 4, mo54229o2(), false);
        SafeParcelWriter.m4586x(parcel, 5, mo54228n2(), false);
        SafeParcelWriter.m4584v(parcel, 6, mo54230p2(), i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
