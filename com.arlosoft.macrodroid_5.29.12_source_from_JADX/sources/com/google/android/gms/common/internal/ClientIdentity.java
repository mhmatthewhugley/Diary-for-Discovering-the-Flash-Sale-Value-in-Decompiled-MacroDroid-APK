package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ClientIdentity extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();
    @SafeParcelable.Field
    @KeepForSdk

    /* renamed from: a */
    public final int f3604a;
    @SafeParcelable.Field
    @KeepForSdk
    @Nullable

    /* renamed from: c */
    public final String f3605c;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable String str) {
        this.f3604a = i;
        this.f3605c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f3604a == this.f3604a && Objects.m4470a(clientIdentity.f3605c, this.f3605c);
    }

    public final int hashCode() {
        return this.f3604a;
    }

    @NonNull
    public final String toString() {
        int i = this.f3604a;
        String str = this.f3605c;
        return i + ":" + str;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3604a);
        SafeParcelWriter.m4586x(parcel, 2, this.f3605c, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
