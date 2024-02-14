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
public final class zzpm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpm> CREATOR = new zzpn();
    @SafeParcelable.Field

    /* renamed from: a */
    private zzrv f45002a;

    private zzpm() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpm) {
            return Objects.m4470a(this.f45002a, ((zzpm) obj).f45002a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45002a);
    }

    /* renamed from: l2 */
    public final zzrv mo53113l2() {
        return this.f45002a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f45002a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzpm(@SafeParcelable.Param zzrv zzrv) {
        this.f45002a = zzrv;
    }
}
