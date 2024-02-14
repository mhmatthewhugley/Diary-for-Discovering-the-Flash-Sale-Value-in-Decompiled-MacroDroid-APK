package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f53880a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    public final Thing[] f53881c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public final String[] f53882d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public final String[] f53883f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public final zzc f53884g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public final String f53885o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public final String f53886p;

    @SafeParcelable.Constructor
    zzz(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable Thing[] thingArr, @SafeParcelable.Param @Nullable String[] strArr, @SafeParcelable.Param @Nullable String[] strArr2, @SafeParcelable.Param @Nullable zzc zzc, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2) {
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7)) {
            i = 0;
        }
        this.f53880a = i;
        this.f53881c = thingArr;
        this.f53882d = strArr;
        this.f53883f = strArr2;
        this.f53884g = zzc;
        this.f53885o = str;
        this.f53886p = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f53880a);
        SafeParcelWriter.m4557A(parcel, 2, this.f53881c, i, false);
        SafeParcelWriter.m4587y(parcel, 3, this.f53882d, false);
        SafeParcelWriter.m4587y(parcel, 5, this.f53883f, false);
        SafeParcelWriter.m4584v(parcel, 6, this.f53884g, i, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f53885o, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f53886p, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
