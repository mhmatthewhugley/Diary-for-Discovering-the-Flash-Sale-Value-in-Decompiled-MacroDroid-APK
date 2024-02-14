package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzhl {

    /* renamed from: a */
    private zzhv f40128a = null;

    /* renamed from: b */
    private zzqw f40129b = null;

    /* renamed from: c */
    private Integer f40130c = null;

    private zzhl() {
    }

    /* synthetic */ zzhl(zzhk zzhk) {
    }

    /* renamed from: a */
    public final zzhl mo49460a(zzqw zzqw) throws GeneralSecurityException {
        this.f40129b = zzqw;
        return this;
    }

    /* renamed from: b */
    public final zzhl mo49461b(Integer num) {
        this.f40130c = num;
        return this;
    }

    /* renamed from: c */
    public final zzhl mo49462c(zzhv zzhv) {
        this.f40128a = zzhv;
        return this;
    }

    /* renamed from: d */
    public final zzhn mo49463d() throws GeneralSecurityException {
        zzqw zzqw;
        zzqv b;
        zzhv zzhv = this.f40128a;
        if (zzhv == null || (zzqw = this.f40129b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzhv.mo49471a() != zzqw.mo49726a()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzhv.mo49474d() && this.f40130c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (this.f40128a.mo49474d() || this.f40130c == null) {
            if (this.f40128a.mo49473c() == zzht.f40141e) {
                b = zzqv.m57986b(new byte[0]);
            } else if (this.f40128a.mo49473c() == zzht.f40140d || this.f40128a.mo49473c() == zzht.f40139c) {
                b = zzqv.m57986b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f40130c.intValue()).array());
            } else if (this.f40128a.mo49473c() == zzht.f40138b) {
                b = zzqv.m57986b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f40130c.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f40128a.mo49473c())));
            }
            return new zzhn(this.f40128a, this.f40129b, b, this.f40130c, (zzhm) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }
}
