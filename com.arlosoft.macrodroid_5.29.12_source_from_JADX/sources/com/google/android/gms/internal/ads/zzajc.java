package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzajc implements zzajd {

    /* renamed from: a */
    private final ByteBuffer f24826a;

    public zzajc(ByteBuffer byteBuffer) {
        this.f24826a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final void mo41526a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f24826a) {
            int i2 = (int) j;
            this.f24826a.position(i2);
            this.f24826a.limit(i2 + i);
            slice = this.f24826a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long zza() {
        return (long) this.f24826a.capacity();
    }
}
