package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzakx extends FilterInputStream {

    /* renamed from: a */
    private final long f24931a;

    /* renamed from: c */
    private long f24932c;

    zzakx(InputStream inputStream, long j) {
        super(inputStream);
        this.f24931a = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo41616b() {
        return this.f24931a - this.f24932c;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f24932c++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f24932c += (long) read;
        }
        return read;
    }
}
