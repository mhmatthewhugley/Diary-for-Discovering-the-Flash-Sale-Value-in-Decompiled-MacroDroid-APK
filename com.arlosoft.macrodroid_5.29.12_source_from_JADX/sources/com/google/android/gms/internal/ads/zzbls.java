package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbls extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbls> CREATOR = new zzblt();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f27526a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final boolean f27527c;
    @SafeParcelable.Field

    /* renamed from: d */
    public final int f27528d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final boolean f27529f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final int f27530g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    public final zzff f27531o;
    @SafeParcelable.Field

    /* renamed from: p */
    public final boolean f27532p;
    @SafeParcelable.Field

    /* renamed from: s */
    public final int f27533s;

    @SafeParcelable.Constructor
    public zzbls(@SafeParcelable.Param int i, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i2, @SafeParcelable.Param boolean z2, @SafeParcelable.Param int i3, @SafeParcelable.Param zzff zzff, @SafeParcelable.Param boolean z3, @SafeParcelable.Param int i4) {
        this.f27526a = i;
        this.f27527c = z;
        this.f27528d = i2;
        this.f27529f = z2;
        this.f27530g = i3;
        this.f27531o = zzff;
        this.f27532p = z3;
        this.f27533s = i4;
    }

    @NonNull
    /* renamed from: l2 */
    public static NativeAdOptions m43673l2(@Nullable zzbls zzbls) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbls == null) {
            return builder.mo20601a();
        }
        int i = zzbls.f27526a;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.mo20604d(zzbls.f27532p);
                    builder.mo20603c(zzbls.f27533s);
                }
                builder.mo20606f(zzbls.f27527c);
                builder.mo20605e(zzbls.f27529f);
                return builder.mo20601a();
            }
            zzff zzff = zzbls.f27531o;
            if (zzff != null) {
                builder.mo20607g(new VideoOptions(zzff));
            }
        }
        builder.mo20602b(zzbls.f27530g);
        builder.mo20606f(zzbls.f27527c);
        builder.mo20605e(zzbls.f27529f);
        return builder.mo20601a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f27526a);
        SafeParcelWriter.m4565c(parcel, 2, this.f27527c);
        SafeParcelWriter.m4576n(parcel, 3, this.f27528d);
        SafeParcelWriter.m4565c(parcel, 4, this.f27529f);
        SafeParcelWriter.m4576n(parcel, 5, this.f27530g);
        SafeParcelWriter.m4584v(parcel, 6, this.f27531o, i, false);
        SafeParcelWriter.m4565c(parcel, 7, this.f27532p);
        SafeParcelWriter.m4576n(parcel, 8, this.f27533s);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzbls(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.mo19796f(), nativeAdOptions.mo19792b(), nativeAdOptions.mo19795e(), nativeAdOptions.mo19791a(), nativeAdOptions.mo19794d() != null ? new zzff(nativeAdOptions.mo19794d()) : null, nativeAdOptions.mo19797g(), nativeAdOptions.mo19793c());
    }
}
