package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f1934a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final String f1935c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final String f1936d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public zze f1937f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    public IBinder f1938g;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param @Nullable zze zze, @SafeParcelable.Param @Nullable IBinder iBinder) {
        this.f1934a = i;
        this.f1935c = str;
        this.f1936d = str2;
        this.f1937f = zze;
        this.f1938g = iBinder;
    }

    /* renamed from: l2 */
    public final AdError mo20073l2() {
        zze zze = this.f1937f;
        return new AdError(this.f1934a, this.f1935c, this.f1936d, zze == null ? null : new AdError(zze.f1934a, zze.f1935c, zze.f1936d));
    }

    /* renamed from: m2 */
    public final LoadAdError mo20074m2() {
        AdError adError;
        zze zze = this.f1937f;
        zzdh zzdh = null;
        if (zze == null) {
            adError = null;
        } else {
            adError = new AdError(zze.f1934a, zze.f1935c, zze.f1936d);
        }
        int i = this.f1934a;
        String str = this.f1935c;
        String str2 = this.f1936d;
        IBinder iBinder = this.f1938g;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdh = queryLocalInterface instanceof zzdh ? (zzdh) queryLocalInterface : new zzdf(iBinder);
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.m1738d(zzdh));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f1934a);
        SafeParcelWriter.m4586x(parcel, 2, this.f1935c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f1936d, false);
        SafeParcelWriter.m4584v(parcel, 4, this.f1937f, i, false);
        SafeParcelWriter.m4575m(parcel, 5, this.f1938g, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
