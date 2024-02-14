package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzftm;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f2198a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final int f2199c;

    @SafeParcelable.Constructor
    zzaz(@SafeParcelable.Param @Nullable String str, @SafeParcelable.Param int i) {
        this.f2198a = str == null ? "" : str;
        this.f2199c = i;
    }

    @Nullable
    /* renamed from: l2 */
    public static zzaz m2567l2(Throwable th) {
        String str;
        zze a = zzffe.m50082a(th);
        if (zzftm.m50973d(th.getMessage())) {
            str = a.f1935c;
        } else {
            str = th.getMessage();
        }
        return new zzaz(str, a.f1934a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f2198a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f2199c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
