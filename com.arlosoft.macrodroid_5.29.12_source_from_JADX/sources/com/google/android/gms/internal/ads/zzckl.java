package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzckl implements zzgwu {

    /* renamed from: a */
    private final ByteBuffer f28779a;

    zzckl(ByteBuffer byteBuffer) {
        this.f28779a = byteBuffer.duplicate();
    }

    /* renamed from: a */
    public final long mo43872a() throws IOException {
        return (long) this.f28779a.limit();
    }

    /* renamed from: b1 */
    public final ByteBuffer mo43873b1(long j, long j2) throws IOException {
        int position = this.f28779a.position();
        this.f28779a.position((int) j);
        ByteBuffer slice = this.f28779a.slice();
        slice.limit((int) j2);
        this.f28779a.position(position);
        return slice;
    }

    public final void close() throws IOException {
    }

    /* renamed from: e2 */
    public final int mo43875e2(ByteBuffer byteBuffer) throws IOException {
        if (this.f28779a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f28779a.remaining());
        byte[] bArr = new byte[min];
        this.f28779a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    /* renamed from: n */
    public final void mo43876n(long j) throws IOException {
        this.f28779a.position((int) j);
    }

    public final long zzb() throws IOException {
        return (long) this.f28779a.position();
    }
}
