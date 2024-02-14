package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzhs {

    /* renamed from: a */
    private Integer f40135a;

    /* renamed from: b */
    private Integer f40136b;

    /* renamed from: c */
    private zzht f40137c;

    private zzhs() {
        this.f40135a = null;
        this.f40136b = null;
        throw null;
    }

    /* synthetic */ zzhs(zzhr zzhr) {
        this.f40135a = null;
        this.f40136b = null;
        this.f40137c = zzht.f40141e;
    }

    /* renamed from: a */
    public final zzhs mo49466a(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.f40135a = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i * 8)}));
    }

    /* renamed from: b */
    public final zzhs mo49467b(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }
        this.f40136b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final zzhs mo49468c(zzht zzht) {
        this.f40137c = zzht;
        return this;
    }

    /* renamed from: d */
    public final zzhv mo49469d() throws GeneralSecurityException {
        Integer num = this.f40135a;
        if (num != null && this.f40136b != null) {
            return new zzhv(num.intValue(), this.f40136b.intValue(), this.f40137c, (zzhu) null);
        }
        throw new GeneralSecurityException("Key size and/or tag size not set");
    }
}
