package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzfx extends AbstractSafeParcelable implements MessageEvent {
    public static final Parcelable.Creator<zzfx> CREATOR = new zzfy();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f48322a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f48323c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final byte[] f48324d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f48325f;

    @SafeParcelable.Constructor
    public zzfx(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param String str2) {
        this.f48322a = i;
        this.f48323c = str;
        this.f48324d = bArr;
        this.f48325f = str2;
    }

    public final byte[] getData() {
        return this.f48324d;
    }

    public final String getPath() {
        return this.f48323c;
    }

    /* renamed from: l2 */
    public final String mo56453l2() {
        return this.f48325f;
    }

    public final String toString() {
        int i = this.f48322a;
        String str = this.f48323c;
        byte[] bArr = this.f48324d;
        String obj = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        return "MessageEventParcelable[" + i + "," + str + ", size=" + obj + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 2, this.f48322a);
        SafeParcelWriter.m4586x(parcel, 3, this.f48323c, false);
        SafeParcelWriter.m4569g(parcel, 4, this.f48324d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f48325f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
