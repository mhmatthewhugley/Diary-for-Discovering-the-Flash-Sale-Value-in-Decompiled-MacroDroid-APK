package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzic */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzic {

    /* renamed from: a */
    private zzin f40156a = null;

    /* renamed from: b */
    private zzqw f40157b = null;

    /* renamed from: c */
    private Integer f40158c = null;

    private zzic() {
    }

    /* synthetic */ zzic(zzib zzib) {
    }

    /* renamed from: a */
    public final zzic mo49478a(Integer num) {
        this.f40158c = num;
        return this;
    }

    /* renamed from: b */
    public final zzic mo49479b(zzqw zzqw) {
        this.f40157b = zzqw;
        return this;
    }

    /* renamed from: c */
    public final zzic mo49480c(zzin zzin) {
        this.f40156a = zzin;
        return this;
    }

    /* renamed from: d */
    public final zzie mo49481d() throws GeneralSecurityException {
        zzqw zzqw;
        zzqv b;
        zzin zzin = this.f40156a;
        if (zzin == null || (zzqw = this.f40157b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzin.mo49489a() != zzqw.mo49726a()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzin.mo49492d() && this.f40158c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (this.f40156a.mo49492d() || this.f40158c == null) {
            if (this.f40156a.mo49491c() == zzil.f40177e) {
                b = zzqv.m57986b(new byte[0]);
            } else if (this.f40156a.mo49491c() == zzil.f40176d || this.f40156a.mo49491c() == zzil.f40175c) {
                b = zzqv.m57986b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f40158c.intValue()).array());
            } else if (this.f40156a.mo49491c() == zzil.f40174b) {
                b = zzqv.m57986b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f40158c.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f40156a.mo49491c())));
            }
            return new zzie(this.f40156a, this.f40157b, b, this.f40158c, (zzid) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }
}
