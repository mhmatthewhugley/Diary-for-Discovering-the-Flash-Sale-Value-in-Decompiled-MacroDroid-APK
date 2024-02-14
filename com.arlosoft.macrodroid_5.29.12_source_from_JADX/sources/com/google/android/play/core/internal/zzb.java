package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzb implements zzc {

    /* renamed from: a */
    private final ByteBuffer f51701a;

    public zzb(ByteBuffer byteBuffer) {
        this.f51701a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final void mo59832a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f51701a) {
            int i2 = (int) j;
            this.f51701a.position(i2);
            this.f51701a.limit(i2 + i);
            slice = this.f51701a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long zza() {
        return (long) this.f51701a.capacity();
    }
}
