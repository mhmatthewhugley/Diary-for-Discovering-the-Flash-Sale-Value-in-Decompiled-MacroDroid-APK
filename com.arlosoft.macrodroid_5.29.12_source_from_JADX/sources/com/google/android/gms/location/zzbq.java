package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    @SafeParcelable.Field

    /* renamed from: a */
    private final List<String> f46092a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final PendingIntent f46093c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f46094d;

    @SafeParcelable.Constructor
    zzbq(@SafeParcelable.Param @Nullable List<String> list, @SafeParcelable.Param @Nullable PendingIntent pendingIntent, @SafeParcelable.Param String str) {
        zzbs<String> zzbs;
        if (list == null) {
            zzbs = zzbs.m59284m();
        } else {
            zzbs = zzbs.m59285n(list);
        }
        this.f46092a = zzbs;
        this.f46093c = pendingIntent;
        this.f46094d = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4588z(parcel, 1, this.f46092a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f46093c, i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f46094d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
