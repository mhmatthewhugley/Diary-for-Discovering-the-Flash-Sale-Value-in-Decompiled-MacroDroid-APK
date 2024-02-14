package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Message;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47712a;
    @SafeParcelable.Field

    /* renamed from: c */
    public final Message f47713c;

    @SafeParcelable.Constructor
    zzae(@SafeParcelable.Param int i, @SafeParcelable.Param Message message) {
        this.f47712a = i;
        this.f47713c = (Message) Preconditions.m4488k(message);
    }

    /* renamed from: l2 */
    public static final zzae m66443l2(Message message) {
        return new zzae(1, message);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        return Objects.m4470a(this.f47713c, ((zzae) obj).f47713c);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f47713c);
    }

    public final String toString() {
        String message = this.f47713c.toString();
        return "MessageWrapper{message=" + message + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 1, this.f47713c, i, false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f47712a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
