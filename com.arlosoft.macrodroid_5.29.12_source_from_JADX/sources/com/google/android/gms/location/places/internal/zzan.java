package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f45971a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f45972c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f45973d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f45974f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f45975g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final int f45976o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final List<zzao> f45977p;

    @SafeParcelable.Constructor
    zzan(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @SafeParcelable.Param int i5, @SafeParcelable.Param int i6, @SafeParcelable.Param List<zzao> list) {
        this.f45971a = i;
        this.f45972c = i2;
        this.f45973d = i3;
        this.f45974f = i4;
        this.f45975g = i5;
        this.f45976o = i6;
        this.f45977p = Collections.unmodifiableList(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45971a);
        SafeParcelWriter.m4576n(parcel, 2, this.f45972c);
        SafeParcelWriter.m4576n(parcel, 3, this.f45973d);
        SafeParcelWriter.m4576n(parcel, 4, this.f45974f);
        SafeParcelWriter.m4576n(parcel, 5, this.f45975g);
        SafeParcelWriter.m4576n(parcel, 6, this.f45976o);
        SafeParcelWriter.m4558B(parcel, 7, this.f45977p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
