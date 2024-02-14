package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgwr extends zzgwp {

    /* renamed from: B */
    private int f37381B;

    protected zzgwr(String str) {
        super("mvhd");
    }

    /* renamed from: f */
    public final int mo47576f() {
        if (!this.f37372d) {
            mo47575e();
        }
        return this.f37381B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final long mo47577g(ByteBuffer byteBuffer) {
        this.f37381B = zzalp.m41711c(byteBuffer.get());
        zzalp.m41712d(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
