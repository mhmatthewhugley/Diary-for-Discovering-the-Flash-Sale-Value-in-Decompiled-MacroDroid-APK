package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new zzcf();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47801a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzae f47802c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final zzr f47803d;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: f */
    public final String f47804f;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: g */
    public final String f47805g;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: o */
    public final boolean f47806o;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: p */
    public final ClientAppContext f47807p;

    @SafeParcelable.Constructor
    zzce(@SafeParcelable.Param int i, @SafeParcelable.Param zzae zzae, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable ClientAppContext clientAppContext) {
        zzr zzr;
        this.f47801a = i;
        this.f47802c = zzae;
        if (iBinder == null) {
            zzr = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzr = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder);
        }
        this.f47803d = zzr;
        this.f47804f = str;
        this.f47805g = str2;
        this.f47806o = z;
        this.f47807p = ClientAppContext.m66435l2(clientAppContext, str2, str, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47801a);
        SafeParcelWriter.m4584v(parcel, 2, this.f47802c, i, false);
        SafeParcelWriter.m4575m(parcel, 3, this.f47803d.asBinder(), false);
        SafeParcelWriter.m4586x(parcel, 4, this.f47804f, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f47805g, false);
        SafeParcelWriter.m4565c(parcel, 6, this.f47806o);
        SafeParcelWriter.m4584v(parcel, 7, this.f47807p, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
