package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzcb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcb> CREATOR = new zzcc();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47795a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzr f47796c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final zzy f47797d;
    @SafeParcelable.Field

    /* renamed from: f */
    public boolean f47798f;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: g */
    public String f47799g;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: o */
    public final ClientAppContext f47800o;

    @SafeParcelable.Constructor
    zzcb(@SafeParcelable.Param int i, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable ClientAppContext clientAppContext) {
        zzr zzr;
        zzy zzy;
        this.f47795a = i;
        if (iBinder == null) {
            zzr = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzr = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder);
        }
        this.f47796c = zzr;
        if (iBinder2 == null) {
            zzy = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            zzy = queryLocalInterface2 instanceof zzy ? (zzy) queryLocalInterface2 : new zzw(iBinder2);
        }
        this.f47797d = zzy;
        this.f47798f = z;
        this.f47799g = str;
        this.f47800o = ClientAppContext.m66435l2(clientAppContext, (String) null, str, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47795a);
        SafeParcelWriter.m4575m(parcel, 2, this.f47796c.asBinder(), false);
        SafeParcelWriter.m4575m(parcel, 3, this.f47797d.asBinder(), false);
        SafeParcelWriter.m4565c(parcel, 4, this.f47798f);
        SafeParcelWriter.m4586x(parcel, 5, this.f47799g, false);
        SafeParcelWriter.m4584v(parcel, 6, this.f47800o, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @VisibleForTesting
    public zzcb(IBinder iBinder, IBinder iBinder2) {
        this(1, iBinder, iBinder2, false, (String) null, (ClientAppContext) null);
    }
}
