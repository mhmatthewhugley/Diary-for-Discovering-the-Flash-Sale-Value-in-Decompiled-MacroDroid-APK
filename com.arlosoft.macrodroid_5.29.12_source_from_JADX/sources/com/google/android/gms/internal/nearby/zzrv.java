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
public final class zzrv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrv> CREATOR = new zzrw();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public zzqq f45079a;

    private zzrv() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzrv) {
            return Objects.m4470a(this.f45079a, ((zzrv) obj).f45079a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45079a);
    }

    /* renamed from: l2 */
    public final zzqq mo53216l2() {
        return this.f45079a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f45079a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzrv(@SafeParcelable.Param zzqq zzqq) {
        this.f45079a = zzqq;
    }

    /* synthetic */ zzrv(zzru zzru) {
    }
}
