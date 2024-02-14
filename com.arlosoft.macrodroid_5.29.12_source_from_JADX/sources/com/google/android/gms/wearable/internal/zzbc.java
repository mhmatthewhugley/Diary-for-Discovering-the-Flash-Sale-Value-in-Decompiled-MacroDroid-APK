package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzbc implements ChannelApi.ChannelListener {

    /* renamed from: a */
    private final ChannelClient.ChannelCallback f48159a;

    public zzbc(ChannelClient.ChannelCallback channelCallback) {
        this.f48159a = channelCallback;
    }

    /* renamed from: c */
    public final void mo56181c(Channel channel, int i, int i2) {
        this.f48159a.mo56186a(zzbd.m66912I(channel), i, i2);
    }

    /* renamed from: d */
    public final void mo56182d(Channel channel, int i, int i2) {
        this.f48159a.mo56189d(zzbd.m66912I(channel), i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbc.class != obj.getClass()) {
            return false;
        }
        return this.f48159a.equals(((zzbc) obj).f48159a);
    }

    /* renamed from: f */
    public final void mo56183f(Channel channel) {
        this.f48159a.mo56187b(zzbd.m66912I(channel));
    }

    /* renamed from: h */
    public final void mo56184h(Channel channel, int i, int i2) {
        this.f48159a.mo56188c(zzbd.m66912I(channel), i, i2);
    }

    public final int hashCode() {
        return this.f48159a.hashCode();
    }
}
