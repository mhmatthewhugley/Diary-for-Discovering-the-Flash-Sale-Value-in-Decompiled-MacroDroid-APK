package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    @SafeParcelable.Field

    /* renamed from: a */
    public final zzfa f48233a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final IntentFilter[] f48234c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f48235d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f48236f;

    @SafeParcelable.Constructor
    zzd(@SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IntentFilter[] intentFilterArr, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.f48233a = queryLocalInterface instanceof zzfa ? (zzfa) queryLocalInterface : new zzey(iBinder);
        } else {
            this.f48233a = null;
        }
        this.f48234c = intentFilterArr;
        this.f48235d = str;
        this.f48236f = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        zzfa zzfa = this.f48233a;
        if (zzfa == null) {
            iBinder = null;
        } else {
            iBinder = zzfa.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder, false);
        SafeParcelWriter.m4557A(parcel, 3, this.f48234c, i, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f48235d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f48236f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public zzd(zzit zzit) {
        this.f48233a = zzit;
        this.f48234c = zzit.mo56518Ib();
        this.f48235d = zzit.mo56520q();
        this.f48236f = null;
    }
}
