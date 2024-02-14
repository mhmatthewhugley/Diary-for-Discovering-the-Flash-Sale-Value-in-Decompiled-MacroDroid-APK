package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.wearable.ChannelClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzk extends ChannelClient.ChannelCallback {

    /* renamed from: a */
    final /* synthetic */ WearableListenerService f48469a;

    /* synthetic */ zzk(WearableListenerService wearableListenerService, zzj zzj) {
        this.f48469a = wearableListenerService;
    }

    /* renamed from: a */
    public final void mo56186a(@NonNull ChannelClient.Channel channel, int i, int i2) {
        this.f48469a.mo56241j(channel, i, i2);
    }

    /* renamed from: b */
    public final void mo56187b(@NonNull ChannelClient.Channel channel) {
        this.f48469a.mo56242k(channel);
    }

    /* renamed from: c */
    public final void mo56188c(@NonNull ChannelClient.Channel channel, int i, int i2) {
        this.f48469a.mo56245n(channel, i, i2);
    }

    /* renamed from: d */
    public final void mo56189d(@NonNull ChannelClient.Channel channel, int i, int i2) {
        this.f48469a.mo56250p(channel, i, i2);
    }
}
