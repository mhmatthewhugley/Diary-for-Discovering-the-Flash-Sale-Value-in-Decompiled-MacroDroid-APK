package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaje implements zzajd {

    /* renamed from: a */
    private final FileChannel f24827a;

    /* renamed from: b */
    private final long f24828b;

    /* renamed from: c */
    private final long f24829c;

    public zzaje(FileChannel fileChannel, long j, long j2) {
        this.f24827a = fileChannel;
        this.f24828b = j;
        this.f24829c = j2;
    }

    /* renamed from: a */
    public final void mo41526a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f24827a.map(FileChannel.MapMode.READ_ONLY, this.f24828b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long zza() {
        return this.f24829c;
    }
}
