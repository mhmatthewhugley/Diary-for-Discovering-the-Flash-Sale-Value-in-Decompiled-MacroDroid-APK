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
public final class zzlg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlg> CREATOR = new zzlh();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f44860a;

    private zzlg() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlg) {
            return Objects.m4470a(this.f44860a, ((zzlg) obj).f44860a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44860a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f44860a, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() {
        return this.f44860a;
    }

    @SafeParcelable.Constructor
    zzlg(@SafeParcelable.Param String str) {
        this.f44860a = str;
    }
}
