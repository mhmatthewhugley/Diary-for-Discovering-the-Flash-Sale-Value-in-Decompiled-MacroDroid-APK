package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zabv extends zaag {

    /* renamed from: c */
    private final GoogleApi f3394c;

    public zabv(GoogleApi googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f3394c = googleApi;
    }

    /* renamed from: h */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo21252h(@NonNull T t) {
        return this.f3394c.mo21229o(t);
    }

    /* renamed from: i */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo21253i(@NonNull T t) {
        return this.f3394c.mo21234t(t);
    }

    /* renamed from: k */
    public final Looper mo21254k() {
        return this.f3394c.mo21240z();
    }

    /* renamed from: s */
    public final void mo21262s(zada zada) {
    }

    /* renamed from: t */
    public final void mo21263t(zada zada) {
    }
}
