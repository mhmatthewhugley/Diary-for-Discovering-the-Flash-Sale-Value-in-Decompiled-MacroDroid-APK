package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzqq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqq> CREATOR = new zzqr();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public byte[] f45036a;
    @SafeParcelable.Field

    /* renamed from: c */
    private int f45037c;

    private zzqq() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqq) {
            zzqq zzqq = (zzqq) obj;
            return Arrays.equals(this.f45036a, zzqq.f45036a) && Objects.m4470a(Integer.valueOf(this.f45037c), Integer.valueOf(zzqq.f45037c));
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(Arrays.hashCode(this.f45036a)), Integer.valueOf(this.f45037c));
    }

    /* renamed from: m2 */
    public final byte[] mo53196m2() {
        return this.f45036a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4569g(parcel, 1, this.f45036a, false);
        SafeParcelWriter.m4576n(parcel, 2, this.f45037c);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* synthetic */ zzqq(zzqp zzqp) {
    }

    @SafeParcelable.Constructor
    zzqq(@SafeParcelable.Param byte[] bArr, @SafeParcelable.Param int i) {
        this.f45036a = bArr;
        this.f45037c = i;
    }
}
