package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzalu extends zzgwp {

    /* renamed from: B */
    ByteBuffer f24960B;

    public zzalu(String str) {
        super(str);
    }

    /* renamed from: d */
    public final void mo41638d(ByteBuffer byteBuffer) {
        this.f24960B = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
