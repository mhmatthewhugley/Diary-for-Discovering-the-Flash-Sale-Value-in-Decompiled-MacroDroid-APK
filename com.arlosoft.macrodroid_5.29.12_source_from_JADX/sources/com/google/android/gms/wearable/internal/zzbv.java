package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzbv extends OutputStream {

    /* renamed from: a */
    private final OutputStream f48191a;

    /* renamed from: c */
    private volatile zzbe f48192c;

    public zzbv(OutputStream outputStream) {
        this.f48191a = (OutputStream) Preconditions.m4488k(outputStream);
    }

    /* renamed from: c */
    private final IOException m66932c(IOException iOException) {
        zzbe zzbe = this.f48192c;
        if (zzbe == null) {
            return iOException;
        }
        Log.isLoggable("ChannelOutputStream", 2);
        return new ChannelIOException("Channel closed unexpectedly before stream was finished", zzbe.f48160a, zzbe.f48161b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo56321b(zzbe zzbe) {
        this.f48192c = zzbe;
    }

    public final void close() throws IOException {
        try {
            this.f48191a.close();
        } catch (IOException e) {
            throw m66932c(e);
        }
    }

    public final void flush() throws IOException {
        try {
            this.f48191a.flush();
        } catch (IOException e) {
            throw m66932c(e);
        }
    }

    public final void write(int i) throws IOException {
        try {
            this.f48191a.write(i);
        } catch (IOException e) {
            throw m66932c(e);
        }
    }

    public final void write(byte[] bArr) throws IOException {
        try {
            this.f48191a.write(bArr);
        } catch (IOException e) {
            throw m66932c(e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f48191a.write(bArr, i, i2);
        } catch (IOException e) {
            throw m66932c(e);
        }
    }
}
