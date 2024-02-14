package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzd implements zzc {

    /* renamed from: a */
    private final FileChannel f51714a;

    /* renamed from: b */
    private final long f51715b;

    /* renamed from: c */
    private final long f51716c;

    public zzd(FileChannel fileChannel, long j, long j2) {
        this.f51714a = fileChannel;
        this.f51715b = j;
        this.f51716c = j2;
    }

    /* renamed from: a */
    public final void mo59832a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f51714a.map(FileChannel.MapMode.READ_ONLY, this.f51715b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long zza() {
        return this.f51716c;
    }
}
