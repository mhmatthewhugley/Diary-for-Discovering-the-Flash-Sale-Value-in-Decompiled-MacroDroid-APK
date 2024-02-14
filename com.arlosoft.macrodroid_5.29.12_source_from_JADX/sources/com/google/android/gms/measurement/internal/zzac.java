package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    @SafeParcelable.Field

    /* renamed from: A */
    public final long f46408A;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: B */
    public final zzaw f46409B;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    public String f46410a;
    @SafeParcelable.Field

    /* renamed from: c */
    public String f46411c;
    @SafeParcelable.Field

    /* renamed from: d */
    public zzkw f46412d;
    @SafeParcelable.Field

    /* renamed from: f */
    public long f46413f;
    @SafeParcelable.Field

    /* renamed from: g */
    public boolean f46414g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public String f46415o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public final zzaw f46416p;
    @SafeParcelable.Field

    /* renamed from: s */
    public long f46417s;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    public zzaw f46418z;

    zzac(zzac zzac) {
        Preconditions.m4488k(zzac);
        this.f46410a = zzac.f46410a;
        this.f46411c = zzac.f46411c;
        this.f46412d = zzac.f46412d;
        this.f46413f = zzac.f46413f;
        this.f46414g = zzac.f46414g;
        this.f46415o = zzac.f46415o;
        this.f46416p = zzac.f46416p;
        this.f46417s = zzac.f46417s;
        this.f46418z = zzac.f46418z;
        this.f46408A = zzac.f46408A;
        this.f46409B = zzac.f46409B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f46410a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f46411c, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f46412d, i, false);
        SafeParcelWriter.m4581s(parcel, 5, this.f46413f);
        SafeParcelWriter.m4565c(parcel, 6, this.f46414g);
        SafeParcelWriter.m4586x(parcel, 7, this.f46415o, false);
        SafeParcelWriter.m4584v(parcel, 8, this.f46416p, i, false);
        SafeParcelWriter.m4581s(parcel, 9, this.f46417s);
        SafeParcelWriter.m4584v(parcel, 10, this.f46418z, i, false);
        SafeParcelWriter.m4581s(parcel, 11, this.f46408A);
        SafeParcelWriter.m4584v(parcel, 12, this.f46409B, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzac(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param String str2, @SafeParcelable.Param zzkw zzkw, @SafeParcelable.Param long j, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable zzaw zzaw, @SafeParcelable.Param long j2, @SafeParcelable.Param @Nullable zzaw zzaw2, @SafeParcelable.Param long j3, @SafeParcelable.Param @Nullable zzaw zzaw3) {
        this.f46410a = str;
        this.f46411c = str2;
        this.f46412d = zzkw;
        this.f46413f = j;
        this.f46414g = z;
        this.f46415o = str3;
        this.f46416p = zzaw;
        this.f46417s = j2;
        this.f46418z = zzaw2;
        this.f46408A = j3;
        this.f46409B = zzaw3;
    }
}
