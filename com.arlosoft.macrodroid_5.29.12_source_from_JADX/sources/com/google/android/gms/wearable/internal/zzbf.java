package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ChannelApi;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();
    @SafeParcelable.Field

    /* renamed from: a */
    final zzbq f48162a;
    @SafeParcelable.Field

    /* renamed from: c */
    final int f48163c;
    @SafeParcelable.Field

    /* renamed from: d */
    final int f48164d;
    @SafeParcelable.Field

    /* renamed from: f */
    final int f48165f;

    @SafeParcelable.Constructor
    public zzbf(@SafeParcelable.Param zzbq zzbq, @SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        this.f48162a = zzbq;
        this.f48163c = i;
        this.f48164d = i2;
        this.f48165f = i3;
    }

    /* renamed from: l2 */
    public final void mo56299l2(ChannelApi.ChannelListener channelListener) {
        int i = this.f48163c;
        if (i == 1) {
            channelListener.mo56183f(this.f48162a);
        } else if (i == 2) {
            channelListener.mo56181c(this.f48162a, this.f48164d, this.f48165f);
        } else if (i == 3) {
            channelListener.mo56184h(this.f48162a, this.f48164d, this.f48165f);
        } else if (i != 4) {
            Log.w("ChannelEventParcelable", "Unknown type: " + i);
        } else {
            channelListener.mo56182d(this.f48162a, this.f48164d, this.f48165f);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48162a);
        int i = this.f48163c;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.f48164d;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.f48165f;
        return "ChannelEventParcelable[, channel=" + valueOf + ", type=" + num + ", closeReason=" + num2 + ", appErrorCode=" + i3 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f48162a, i, false);
        SafeParcelWriter.m4576n(parcel, 3, this.f48163c);
        SafeParcelWriter.m4576n(parcel, 4, this.f48164d);
        SafeParcelWriter.m4576n(parcel, 5, this.f48165f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
