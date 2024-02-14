package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: A */
    public final boolean f2077A;
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f2078a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f2079c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f2080d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f2081f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f2082g;
    @SafeParcelable.Field

    /* renamed from: o */
    public final String f2083o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final String f2084p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final Intent f2085s;
    @SafeParcelable.Field

    /* renamed from: z */
    public final zzx f2086z;

    public zzc(Intent intent, zzx zzx) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent, ObjectWrapper.m5051g8(zzx).asBinder(), false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f2078a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f2079c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f2080d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f2081f, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f2082g, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f2083o, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f2084p, false);
        SafeParcelWriter.m4584v(parcel, 9, this.f2085s, i, false);
        SafeParcelWriter.m4575m(parcel, 10, ObjectWrapper.m5051g8(this.f2086z).asBinder(), false);
        SafeParcelWriter.m4565c(parcel, 11, this.f2077A);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param Intent intent, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z) {
        this.f2078a = str;
        this.f2079c = str2;
        this.f2080d = str3;
        this.f2081f = str4;
        this.f2082g = str5;
        this.f2083o = str6;
        this.f2084p = str7;
        this.f2085s = intent;
        this.f2086z = (zzx) ObjectWrapper.m5050A1(IObjectWrapper.Stub.m5043t1(iBinder));
        this.f2077A = z;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzx zzx) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null, ObjectWrapper.m5051g8(zzx).asBinder(), false);
    }
}
