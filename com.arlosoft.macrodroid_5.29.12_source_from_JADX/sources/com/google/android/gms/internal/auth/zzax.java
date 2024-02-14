package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public final class zzax implements ProxyApi.SpatulaHeaderResult {

    /* renamed from: a */
    private Status f39178a;

    /* renamed from: c */
    private String f39179c;

    public zzax(String str) {
        this.f39179c = (String) Preconditions.m4488k(str);
        this.f39178a = Status.f3138p;
    }

    public final Status getStatus() {
        return this.f39178a;
    }

    public zzax(Status status) {
        this.f39178a = (Status) Preconditions.m4488k(status);
    }
}
