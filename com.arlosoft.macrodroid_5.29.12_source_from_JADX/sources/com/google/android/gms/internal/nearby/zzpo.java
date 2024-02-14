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
public final class zzpo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpo> CREATOR = new zzpp();
    @SafeParcelable.Field

    /* renamed from: a */
    private zzrv f45003a;
    @SafeParcelable.Field

    /* renamed from: c */
    private zzqa f45004c;

    private zzpo() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpo) {
            zzpo zzpo = (zzpo) obj;
            return Objects.m4470a(this.f45003a, zzpo.f45003a) && Objects.m4470a(this.f45004c, zzpo.f45004c);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45003a, this.f45004c);
    }

    /* renamed from: l2 */
    public final zzqa mo53119l2() {
        return this.f45004c;
    }

    /* renamed from: m2 */
    public final zzrv mo53120m2() {
        return this.f45003a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f45003a, i, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f45004c, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzpo(@SafeParcelable.Param zzrv zzrv, @SafeParcelable.Param zzqa zzqa) {
        this.f45003a = zzrv;
        this.f45004c = zzqa;
    }
}
