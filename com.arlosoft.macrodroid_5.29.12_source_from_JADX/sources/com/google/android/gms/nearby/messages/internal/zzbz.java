package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzca();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: A */
    public final ClientAppContext f47782A;
    @SafeParcelable.Field

    /* renamed from: B */
    public final int f47783B;
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47784a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzae f47785c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final Strategy f47786d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final zzr f47787f;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: g */
    public final String f47788g;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: o */
    public final String f47789o;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: p */
    public final boolean f47790p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    public final zzv f47791s;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: z */
    public final boolean f47792z;

    @SafeParcelable.Constructor
    zzbz(@SafeParcelable.Param int i, @SafeParcelable.Param zzae zzae, @SafeParcelable.Param Strategy strategy, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable IBinder iBinder2, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable ClientAppContext clientAppContext, @SafeParcelable.Param int i2) {
        zzr zzr;
        this.f47784a = i;
        this.f47785c = zzae;
        this.f47786d = strategy;
        zzv zzv = null;
        if (iBinder == null) {
            zzr = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzr = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder);
        }
        this.f47787f = zzr;
        this.f47788g = str;
        this.f47789o = str2;
        this.f47790p = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            zzv = queryLocalInterface2 instanceof zzv ? (zzv) queryLocalInterface2 : new zzt(iBinder2);
        }
        this.f47791s = zzv;
        this.f47792z = z2;
        this.f47782A = ClientAppContext.m66435l2(clientAppContext, str2, str, z2);
        this.f47783B = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47784a);
        SafeParcelWriter.m4584v(parcel, 2, this.f47785c, i, false);
        SafeParcelWriter.m4584v(parcel, 3, this.f47786d, i, false);
        SafeParcelWriter.m4575m(parcel, 4, this.f47787f.asBinder(), false);
        SafeParcelWriter.m4586x(parcel, 5, this.f47788g, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f47789o, false);
        SafeParcelWriter.m4565c(parcel, 7, this.f47790p);
        zzv zzv = this.f47791s;
        if (zzv == null) {
            iBinder = null;
        } else {
            iBinder = zzv.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 8, iBinder, false);
        SafeParcelWriter.m4565c(parcel, 9, this.f47792z);
        SafeParcelWriter.m4584v(parcel, 10, this.f47782A, i, false);
        SafeParcelWriter.m4576n(parcel, 11, this.f47783B);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
