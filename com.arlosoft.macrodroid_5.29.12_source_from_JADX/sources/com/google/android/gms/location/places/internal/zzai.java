package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.Place;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
public final class zzai extends AbstractSafeParcelable implements Place.ExtendedDetails {
    public static final Parcelable.Creator<zzai> CREATOR = new zzah();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<Integer> f45962a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f45963c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final Uri f45964d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final float f45965f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f45966g;

    @SafeParcelable.Constructor
    zzai(@SafeParcelable.Param List<Integer> list, @SafeParcelable.Param String str, @SafeParcelable.Param Uri uri, @SafeParcelable.Param float f, @SafeParcelable.Param int i) {
        this.f45962a = Collections.unmodifiableList(list);
        this.f45963c = str;
        this.f45964d = uri;
        this.f45965f = f;
        this.f45966g = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4578p(parcel, 1, this.f45962a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f45963c, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f45964d, i, false);
        SafeParcelWriter.m4573k(parcel, 4, this.f45965f);
        SafeParcelWriter.m4576n(parcel, 5, this.f45966g);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
