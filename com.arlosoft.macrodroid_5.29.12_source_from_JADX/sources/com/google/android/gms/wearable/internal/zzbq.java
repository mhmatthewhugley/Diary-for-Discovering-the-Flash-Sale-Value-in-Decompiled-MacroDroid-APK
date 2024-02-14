package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzbq extends AbstractSafeParcelable implements Channel, ChannelClient.Channel {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public final String f48184a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f48185c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f48186d;

    @SafeParcelable.Constructor
    public zzbq(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f48184a = (String) Preconditions.m4488k(str);
        this.f48185c = (String) Preconditions.m4488k(str2);
        this.f48186d = (String) Preconditions.m4488k(str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbq)) {
            return false;
        }
        zzbq zzbq = (zzbq) obj;
        return this.f48184a.equals(zzbq.f48184a) && Objects.m4470a(zzbq.f48185c, this.f48185c) && Objects.m4470a(zzbq.f48186d, this.f48186d);
    }

    public final int hashCode() {
        return this.f48184a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.f48184a.toCharArray()) {
            i += c;
        }
        String trim = this.f48184a.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + trim + ", nodeId=" + this.f48185c + ", path=" + this.f48186d + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f48184a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f48185c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f48186d, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
