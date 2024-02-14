package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzas implements ChannelApi.OpenChannelResult {

    /* renamed from: a */
    private final Status f48142a;

    /* renamed from: c */
    private final Channel f48143c;

    zzas(Status status, Channel channel) {
        this.f48142a = (Status) Preconditions.m4488k(status);
        this.f48143c = channel;
    }

    public final Channel getChannel() {
        return this.f48143c;
    }

    public final Status getStatus() {
        return this.f48142a;
    }
}
