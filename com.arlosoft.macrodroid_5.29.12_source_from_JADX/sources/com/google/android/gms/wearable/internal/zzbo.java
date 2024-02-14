package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbo implements Channel.GetInputStreamResult {

    /* renamed from: a */
    private final Status f48180a;

    /* renamed from: c */
    private final InputStream f48181c;

    zzbo(Status status, InputStream inputStream) {
        this.f48180a = (Status) Preconditions.m4488k(status);
        this.f48181c = inputStream;
    }

    public final InputStream getInputStream() {
        return this.f48181c;
    }

    public final Status getStatus() {
        return this.f48180a;
    }

    public final void release() {
        InputStream inputStream = this.f48181c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
