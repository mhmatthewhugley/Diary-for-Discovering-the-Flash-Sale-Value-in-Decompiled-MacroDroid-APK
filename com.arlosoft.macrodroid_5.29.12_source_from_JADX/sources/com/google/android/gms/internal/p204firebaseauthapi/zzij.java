package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzij */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzij {

    /* renamed from: a */
    private Integer f40164a;

    /* renamed from: b */
    private Integer f40165b;

    /* renamed from: c */
    private zzik f40166c;

    /* renamed from: d */
    private zzil f40167d;

    private zzij() {
        this.f40164a = null;
        this.f40165b = null;
        this.f40166c = null;
        throw null;
    }

    /* synthetic */ zzij(zzii zzii) {
        this.f40164a = null;
        this.f40165b = null;
        this.f40166c = null;
        this.f40167d = zzil.f40177e;
    }

    /* renamed from: a */
    public final zzij mo49482a(zzik zzik) {
        this.f40166c = zzik;
        return this;
    }

    /* renamed from: b */
    public final zzij mo49483b(int i) throws GeneralSecurityException {
        this.f40164a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final zzij mo49484c(int i) throws GeneralSecurityException {
        this.f40165b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final zzij mo49485d(zzil zzil) {
        this.f40167d = zzil;
        return this;
    }

    /* renamed from: e */
    public final zzin mo49486e() throws GeneralSecurityException {
        Integer num = this.f40164a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (this.f40165b == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (this.f40166c == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (num.intValue() >= 16) {
            int intValue = this.f40165b.intValue();
            zzik zzik = this.f40166c;
            if (intValue >= 10) {
                if (zzik == zzik.f40168b) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzik == zzik.f40169c) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzik == zzik.f40170d) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzik == zzik.f40171e) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzik != zzik.f40172f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new zzin(this.f40164a.intValue(), this.f40165b.intValue(), this.f40167d, this.f40166c, (zzim) null);
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.f40164a}));
        }
    }
}
