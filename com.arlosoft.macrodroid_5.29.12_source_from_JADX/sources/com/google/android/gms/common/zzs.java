package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f4001a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final zzj f4002c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f4003d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final boolean f4004f;

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param String str, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2) {
        byte[] bArr;
        this.f4001a = str;
        zzk zzk = null;
        if (iBinder != null) {
            try {
                IObjectWrapper d = zzy.m4723t1(iBinder).mo21836d();
                if (d == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) ObjectWrapper.m5050A1(d);
                }
                if (bArr != null) {
                    zzk = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f4002c = zzk;
        this.f4003d = z;
        this.f4004f = z2;
    }

    zzs(String str, zzj zzj, boolean z, boolean z2) {
        this.f4001a = str;
        this.f4002c = zzj;
        this.f4003d = z;
        this.f4004f = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4001a, false);
        zzj zzj = this.f4002c;
        if (zzj == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzj = null;
        }
        SafeParcelWriter.m4575m(parcel, 2, zzj, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f4003d);
        SafeParcelWriter.m4565c(parcel, 4, this.f4004f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
