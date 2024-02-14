package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzqv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqv> CREATOR = new zzqw();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public int f45041a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public int f45042c;
    @SafeParcelable.Field

    /* renamed from: d */
    private int f45043d;

    private zzqv() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqv) {
            zzqv zzqv = (zzqv) obj;
            return Objects.m4470a(Integer.valueOf(this.f45041a), Integer.valueOf(zzqv.f45041a)) && Objects.m4470a(Integer.valueOf(this.f45042c), Integer.valueOf(zzqv.f45042c)) && Objects.m4470a(Integer.valueOf(this.f45043d), Integer.valueOf(zzqv.f45043d));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f45041a), Integer.valueOf(this.f45042c), Integer.valueOf(this.f45043d));
    }

    /* renamed from: l2 */
    public final int mo53205l2() {
        return this.f45042c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f45041a);
        SafeParcelWriter.m4576n(parcel, 2, this.f45042c);
        SafeParcelWriter.m4576n(parcel, 3, this.f45043d);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f45041a;
    }

    @SafeParcelable.Constructor
    zzqv(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        this.f45041a = i;
        this.f45042c = i2;
        this.f45043d = i3;
    }

    /* synthetic */ zzqv(zzqu zzqu) {
    }
}
