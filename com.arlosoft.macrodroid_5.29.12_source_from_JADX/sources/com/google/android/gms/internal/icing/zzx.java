package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    @SafeParcelable.Field

    /* renamed from: a */
    final zzi f41060a;
    @SafeParcelable.Field

    /* renamed from: c */
    final long f41061c;
    @SafeParcelable.Field

    /* renamed from: d */
    int f41062d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public final String f41063f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    final zzg f41064g;
    @SafeParcelable.Field

    /* renamed from: o */
    final boolean f41065o;
    @SafeParcelable.Field

    /* renamed from: p */
    int f41066p;
    @SafeParcelable.Field

    /* renamed from: s */
    int f41067s;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    public final String f41068z;

    @SafeParcelable.Constructor
    zzx(@SafeParcelable.Param zzi zzi, @SafeParcelable.Param long j, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable zzg zzg, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param @Nullable String str2) {
        this.f41060a = zzi;
        this.f41061c = j;
        this.f41062d = i;
        this.f41063f = str;
        this.f41064g = zzg;
        this.f41065o = z;
        this.f41066p = i2;
        this.f41067s = i3;
        this.f41068z = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.f41060a, Long.valueOf(this.f41061c), Integer.valueOf(this.f41062d), Integer.valueOf(this.f41067s)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f41060a, i, false);
        SafeParcelWriter.m4581s(parcel, 2, this.f41061c);
        SafeParcelWriter.m4576n(parcel, 3, this.f41062d);
        SafeParcelWriter.m4586x(parcel, 4, this.f41063f, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f41064g, i, false);
        SafeParcelWriter.m4565c(parcel, 6, this.f41065o);
        SafeParcelWriter.m4576n(parcel, 7, this.f41066p);
        SafeParcelWriter.m4576n(parcel, 8, this.f41067s);
        SafeParcelWriter.m4586x(parcel, 9, this.f41068z, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
