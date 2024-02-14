package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzfk implements MessageApi.SendMessageResult {

    /* renamed from: a */
    private final Status f48298a;

    /* renamed from: c */
    private final int f48299c;

    public zzfk(Status status, int i) {
        this.f48298a = status;
        this.f48299c = i;
    }

    /* renamed from: f */
    public final int mo56212f() {
        return this.f48299c;
    }

    public final Status getStatus() {
        return this.f48298a;
    }
}
