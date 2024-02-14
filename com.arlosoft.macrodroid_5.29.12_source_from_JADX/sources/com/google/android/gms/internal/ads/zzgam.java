package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgam {

    /* renamed from: a */
    private final OutputStream f36621a;

    private zzgam(OutputStream outputStream) {
        this.f36621a = outputStream;
    }

    /* renamed from: b */
    public static zzgam m51471b(OutputStream outputStream) {
        return new zzgam(outputStream);
    }

    /* renamed from: a */
    public final void mo46657a(zzgmk zzgmk) throws IOException {
        try {
            zzgmk.mo47049e(this.f36621a);
        } finally {
            this.f36621a.close();
        }
    }
}
