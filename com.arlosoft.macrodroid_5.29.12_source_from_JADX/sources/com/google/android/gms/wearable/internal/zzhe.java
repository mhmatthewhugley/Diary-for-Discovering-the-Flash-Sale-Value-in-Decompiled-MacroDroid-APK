package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzhe implements ChannelApi.ChannelListener {

    /* renamed from: a */
    private final String f48361a;

    /* renamed from: c */
    private final ChannelApi.ChannelListener f48362c;

    zzhe(String str, ChannelApi.ChannelListener channelListener) {
        this.f48361a = (String) Preconditions.m4488k(str);
        this.f48362c = (ChannelApi.ChannelListener) Preconditions.m4488k(channelListener);
    }

    /* renamed from: c */
    public final void mo56181c(Channel channel, int i, int i2) {
        this.f48362c.mo56181c(channel, i, i2);
    }

    /* renamed from: d */
    public final void mo56182d(Channel channel, int i, int i2) {
        this.f48362c.mo56182d(channel, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhe)) {
            return false;
        }
        zzhe zzhe = (zzhe) obj;
        return this.f48362c.equals(zzhe.f48362c) && this.f48361a.equals(zzhe.f48361a);
    }

    /* renamed from: f */
    public final void mo56183f(Channel channel) {
        this.f48362c.mo56183f(channel);
    }

    /* renamed from: h */
    public final void mo56184h(Channel channel, int i, int i2) {
        this.f48362c.mo56184h(channel, i, i2);
    }

    public final int hashCode() {
        return (this.f48361a.hashCode() * 31) + this.f48362c.hashCode();
    }
}
