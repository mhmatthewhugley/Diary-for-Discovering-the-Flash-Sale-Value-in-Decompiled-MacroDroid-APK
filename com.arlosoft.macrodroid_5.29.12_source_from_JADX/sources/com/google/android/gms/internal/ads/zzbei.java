package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbei extends PushbackInputStream {

    /* renamed from: a */
    final /* synthetic */ zzbej f26696a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbei(zzbej zzbej, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f26696a = zzbej;
    }

    public final synchronized void close() throws IOException {
        zzbel.m43230e(this.f26696a.f26699d);
        super.close();
    }
}
