package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbc> CREATOR = new zzcbd();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: A */
    public String f28120A;
    @SafeParcelable.Field

    /* renamed from: B */
    public final boolean f28121B;
    @SafeParcelable.Field

    /* renamed from: a */
    public final Bundle f28122a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzcgv f28123c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final ApplicationInfo f28124d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f28125f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final List f28126g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public final PackageInfo f28127o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final String f28128p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final String f28129s;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    public zzffx f28130z;

    @SafeParcelable.Constructor
    public zzcbc(@SafeParcelable.Param Bundle bundle, @SafeParcelable.Param zzcgv zzcgv, @SafeParcelable.Param ApplicationInfo applicationInfo, @SafeParcelable.Param String str, @SafeParcelable.Param List list, @SafeParcelable.Param @Nullable PackageInfo packageInfo, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param zzffx zzffx, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z) {
        this.f28122a = bundle;
        this.f28123c = zzcgv;
        this.f28125f = str;
        this.f28124d = applicationInfo;
        this.f28126g = list;
        this.f28127o = packageInfo;
        this.f28128p = str2;
        this.f28129s = str3;
        this.f28130z = zzffx;
        this.f28120A = str4;
        this.f28121B = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4567e(parcel, 1, this.f28122a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f28123c, i, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f28124d, i, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f28125f, false);
        SafeParcelWriter.m4588z(parcel, 5, this.f28126g, false);
        SafeParcelWriter.m4584v(parcel, 6, this.f28127o, i, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f28128p, false);
        SafeParcelWriter.m4586x(parcel, 9, this.f28129s, false);
        SafeParcelWriter.m4584v(parcel, 10, this.f28130z, i, false);
        SafeParcelWriter.m4586x(parcel, 11, this.f28120A, false);
        SafeParcelWriter.m4565c(parcel, 12, this.f28121B);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
