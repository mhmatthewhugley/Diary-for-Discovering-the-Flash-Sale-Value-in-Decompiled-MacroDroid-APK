package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: a */
    private final PendingIntent f2821a;

    @SafeParcelable.Constructor
    public SavePasswordResult(@SafeParcelable.Param PendingIntent pendingIntent) {
        this.f2821a = (PendingIntent) Preconditions.m4488k(pendingIntent);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordResult)) {
            return false;
        }
        return Objects.m4470a(this.f2821a, ((SavePasswordResult) obj).f2821a);
    }

    public int hashCode() {
        return Objects.m4471b(this.f2821a);
    }

    /* renamed from: l2 */
    public PendingIntent mo20909l2() {
        return this.f2821a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, mo20909l2(), i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
