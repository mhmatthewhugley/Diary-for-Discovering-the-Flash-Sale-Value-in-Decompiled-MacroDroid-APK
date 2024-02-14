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
@Deprecated
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47820a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final zzr f47821c;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: d */
    public final String f47822d;
    @SafeParcelable.Field
    @Deprecated
    @Nullable

    /* renamed from: f */
    public final ClientAppContext f47823f;

    @SafeParcelable.Constructor
    zzh(@SafeParcelable.Param int i, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable ClientAppContext clientAppContext) {
        zzr zzr;
        this.f47820a = i;
        if (iBinder == null) {
            zzr = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzr = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder);
        }
        this.f47821c = zzr;
        this.f47822d = str;
        this.f47823f = ClientAppContext.m66435l2(clientAppContext, (String) null, str, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47820a);
        SafeParcelWriter.m4575m(parcel, 2, this.f47821c.asBinder(), false);
        SafeParcelWriter.m4586x(parcel, 3, this.f47822d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f47823f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
