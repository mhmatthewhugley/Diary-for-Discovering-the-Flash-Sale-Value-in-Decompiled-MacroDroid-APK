package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbp implements Channel.GetOutputStreamResult {

    /* renamed from: a */
    private final Status f48182a;

    /* renamed from: c */
    private final OutputStream f48183c;

    zzbp(Status status, OutputStream outputStream) {
        this.f48182a = (Status) Preconditions.m4488k(status);
        this.f48183c = outputStream;
    }

    public final OutputStream getOutputStream() {
        return this.f48183c;
    }

    public final Status getStatus() {
        return this.f48182a;
    }

    public final void release() {
        OutputStream outputStream = this.f48183c;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
