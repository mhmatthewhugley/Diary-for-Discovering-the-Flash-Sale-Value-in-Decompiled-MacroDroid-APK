package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaq implements zzbj {

    /* renamed from: a */
    private final OutputStream f39897a;

    private zzaq(OutputStream outputStream) {
        this.f39897a = outputStream;
    }

    /* renamed from: c */
    public static zzbj m56901c(OutputStream outputStream) {
        return new zzaq(outputStream);
    }

    /* renamed from: a */
    public final void mo49301a(zzof zzof) throws IOException {
        try {
            zzof.mo48859c(this.f39897a);
        } finally {
            this.f39897a.close();
        }
    }

    /* renamed from: b */
    public final void mo49302b(zzmo zzmo) throws IOException {
        throw null;
    }
}
