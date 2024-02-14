package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgk implements Result {

    /* renamed from: a */
    private final Status f48338a;

    /* renamed from: c */
    private final String f48339c;

    public zzgk(Status status, String str) {
        this.f48338a = status;
        this.f48339c = str;
    }

    /* renamed from: a */
    public final String mo56460a() {
        return this.f48339c;
    }

    public final Status getStatus() {
        return this.f48338a;
    }
}
