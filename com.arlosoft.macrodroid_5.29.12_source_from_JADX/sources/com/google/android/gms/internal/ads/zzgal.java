package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgal {

    /* renamed from: a */
    private final InputStream f36620a;

    private zzgal(InputStream inputStream) {
        this.f36620a = inputStream;
    }

    /* renamed from: b */
    public static zzgal m51469b(byte[] bArr) {
        return new zzgal(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public final zzgmk mo46656a() throws IOException {
        try {
            return zzgmk.m52337J(this.f36620a, zzgqq.m52900a());
        } finally {
            this.f36620a.close();
        }
    }
}
