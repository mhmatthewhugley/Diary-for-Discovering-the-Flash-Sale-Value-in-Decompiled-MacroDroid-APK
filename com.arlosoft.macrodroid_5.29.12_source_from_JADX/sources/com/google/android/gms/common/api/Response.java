package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class Response<T extends Result> {

    /* renamed from: a */
    private Result f3130a;

    public Response() {
    }

    protected Response(@NonNull T t) {
        this.f3130a = t;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: c */
    public T mo21278c() {
        return this.f3130a;
    }

    /* renamed from: f */
    public void mo21279f(@NonNull T t) {
        this.f3130a = t;
    }
}
