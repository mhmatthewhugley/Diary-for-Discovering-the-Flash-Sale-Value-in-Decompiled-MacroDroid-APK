package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzlk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlk> CREATOR = new zzll();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44866a;
    @SafeParcelable.Field

    /* renamed from: c */
    private PayloadTransferUpdate f44867c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f44868d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private zznv f44869f;

    private zzlk() {
        this.f44868d = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlk) {
            zzlk zzlk = (zzlk) obj;
            return Objects.m4470a(this.f44866a, zzlk.f44866a) && Objects.m4470a(this.f44867c, zzlk.f44867c) && Objects.m4470a(Integer.valueOf(this.f44868d), Integer.valueOf(zzlk.f44868d)) && Objects.m4470a(this.f44869f, zzlk.f44869f);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44866a, this.f44867c, Integer.valueOf(this.f44868d), this.f44869f);
    }

    /* renamed from: l2 */
    public final PayloadTransferUpdate mo52879l2() {
        return this.f44867c;
    }

    /* renamed from: m2 */
    public final String mo52880m2() {
        return this.f44866a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44866a, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f44867c, i, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f44868d);
        SafeParcelWriter.m4584v(parcel, 4, this.f44869f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzlk(@SafeParcelable.Param String str, @SafeParcelable.Param PayloadTransferUpdate payloadTransferUpdate, @SafeParcelable.Param int i, @SafeParcelable.Param @Nullable zznv zznv) {
        this.f44866a = str;
        this.f44867c = payloadTransferUpdate;
        this.f44868d = i;
        this.f44869f = zznv;
    }
}
