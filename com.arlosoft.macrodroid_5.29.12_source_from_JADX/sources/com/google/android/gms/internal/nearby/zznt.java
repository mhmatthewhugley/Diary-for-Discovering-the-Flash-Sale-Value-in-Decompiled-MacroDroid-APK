package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@RequiresApi(26)
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznt> CREATOR = new zznu();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f44978a;

    @SafeParcelable.Constructor
    zznt(@SafeParcelable.Param int i) {
        this.f44978a = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zznt) || this.f44978a != ((zznt) obj).f44978a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f44978a));
    }

    public final String toString() {
        return "PresenceAction[action=" + this.f44978a + ']';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f44978a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
