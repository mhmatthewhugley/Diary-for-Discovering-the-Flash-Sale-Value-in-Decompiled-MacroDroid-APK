package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbnv;

@SafeParcelable.Class
@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final boolean f1761a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final zzbz f1762c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final IBinder f1763d;

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static final class Builder {
    }

    @SafeParcelable.Constructor
    PublisherAdViewOptions(@SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable IBinder iBinder, @SafeParcelable.Param @Nullable IBinder iBinder2) {
        this.f1761a = z;
        this.f1762c = iBinder != null ? zzby.m2050Jb(iBinder) : null;
        this.f1763d = iBinder2;
    }

    /* renamed from: a */
    public final boolean mo19810a() {
        return this.f1761a;
    }

    @Nullable
    /* renamed from: l2 */
    public final zzbz mo19811l2() {
        return this.f1762c;
    }

    @Nullable
    /* renamed from: m2 */
    public final zzbnv mo19812m2() {
        IBinder iBinder = this.f1763d;
        if (iBinder == null) {
            return null;
        }
        return zzbnu.m43818Jb(iBinder);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder iBinder;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4565c(parcel, 1, this.f1761a);
        zzbz zzbz = this.f1762c;
        if (zzbz == null) {
            iBinder = null;
        } else {
            iBinder = zzbz.asBinder();
        }
        SafeParcelWriter.m4575m(parcel, 2, iBinder, false);
        SafeParcelWriter.m4575m(parcel, 3, this.f1763d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
