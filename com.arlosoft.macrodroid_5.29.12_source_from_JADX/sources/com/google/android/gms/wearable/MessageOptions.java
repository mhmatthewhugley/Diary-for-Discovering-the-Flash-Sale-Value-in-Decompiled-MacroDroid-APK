package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class MessageOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<MessageOptions> CREATOR = new zzf();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f48082a;

    @SafeParcelable.Constructor
    public MessageOptions(@SafeParcelable.Param int i) {
        this.f48082a = i;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof MessageOptions) && this.f48082a == ((MessageOptions) obj).f48082a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f48082a));
    }

    /* renamed from: l2 */
    public int mo56218l2() {
        return this.f48082a;
    }

    @NonNull
    public String toString() {
        return "MessageOptions[ " + "priority=" + this.f48082a + "]";
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, mo56218l2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
