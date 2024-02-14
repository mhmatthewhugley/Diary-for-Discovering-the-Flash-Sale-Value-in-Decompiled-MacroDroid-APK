package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

final class zzaw implements ProxyApi.ProxyResult {

    /* renamed from: a */
    private Status f39176a;

    /* renamed from: c */
    private ProxyResponse f39177c;

    public zzaw(ProxyResponse proxyResponse) {
        this.f39177c = proxyResponse;
        this.f39176a = Status.f3138p;
    }

    public final Status getStatus() {
        return this.f39176a;
    }

    public zzaw(Status status) {
        this.f39176a = status;
    }
}
