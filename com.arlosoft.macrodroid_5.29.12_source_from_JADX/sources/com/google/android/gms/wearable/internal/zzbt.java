package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzbt extends InputStream {

    /* renamed from: a */
    private final InputStream f48188a;

    /* renamed from: c */
    private volatile zzbe f48189c;

    public zzbt(InputStream inputStream) {
        this.f48188a = (InputStream) Preconditions.m4488k(inputStream);
    }

    /* renamed from: c */
    private final int m66929c(int i) throws ChannelIOException {
        if (i != -1) {
            return i;
        }
        zzbe zzbe = this.f48189c;
        if (zzbe == null) {
            return -1;
        }
        throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzbe.f48160a, zzbe.f48161b);
    }

    public final int available() throws IOException {
        return this.f48188a.available();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo56312b(zzbe zzbe) {
        this.f48189c = (zzbe) Preconditions.m4488k(zzbe);
    }

    public final void close() throws IOException {
        this.f48188a.close();
    }

    public final void mark(int i) {
        this.f48188a.mark(i);
    }

    public final boolean markSupported() {
        return this.f48188a.markSupported();
    }

    public final int read() throws IOException {
        int read = this.f48188a.read();
        m66929c(read);
        return read;
    }

    public final void reset() throws IOException {
        this.f48188a.reset();
    }

    public final long skip(long j) throws IOException {
        return this.f48188a.skip(j);
    }

    public final int read(byte[] bArr) throws IOException {
        int read = this.f48188a.read(bArr);
        m66929c(read);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f48188a.read(bArr, i, i2);
        m66929c(read);
        return read;
    }
}
