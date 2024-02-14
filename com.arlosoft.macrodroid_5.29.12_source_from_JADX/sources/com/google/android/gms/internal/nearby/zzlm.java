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
public final class zzlm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlm> CREATOR = new zzln();
    @SafeParcelable.Field

    /* renamed from: a */
    private int f44870a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f44871c;

    private zzlm() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlm) {
            zzlm zzlm = (zzlm) obj;
            return Objects.m4470a(Integer.valueOf(this.f44870a), Integer.valueOf(zzlm.f44870a)) && Objects.m4470a(this.f44871c, zzlm.f44871c);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f44870a), this.f44871c);
    }

    /* renamed from: l2 */
    public final String mo52886l2() {
        return this.f44871c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f44870a);
        SafeParcelWriter.m4586x(parcel, 2, this.f44871c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final int zza() {
        return this.f44870a;
    }

    @SafeParcelable.Constructor
    zzlm(@SafeParcelable.Param int i, @SafeParcelable.Param String str) {
        this.f44870a = i;
        this.f44871c = str;
    }
}
