package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzin */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzin extends zziv {

    /* renamed from: a */
    private final int f40179a;

    /* renamed from: b */
    private final int f40180b;

    /* renamed from: c */
    private final zzil f40181c;

    /* renamed from: d */
    private final zzik f40182d;

    /* synthetic */ zzin(int i, int i2, zzil zzil, zzik zzik, zzim zzim) {
        this.f40179a = i;
        this.f40180b = i2;
        this.f40181c = zzil;
        this.f40182d = zzik;
    }

    /* renamed from: a */
    public final int mo49489a() {
        return this.f40179a;
    }

    /* renamed from: b */
    public final int mo49490b() {
        zzil zzil = this.f40181c;
        if (zzil == zzil.f40177e) {
            return this.f40180b;
        }
        if (zzil == zzil.f40174b || zzil == zzil.f40175c || zzil == zzil.f40176d) {
            return this.f40180b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: c */
    public final zzil mo49491c() {
        return this.f40181c;
    }

    /* renamed from: d */
    public final boolean mo49492d() {
        return this.f40181c != zzil.f40177e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzin)) {
            return false;
        }
        zzin zzin = (zzin) obj;
        if (zzin.f40179a == this.f40179a && zzin.mo49490b() == mo49490b() && zzin.f40181c == this.f40181c && zzin.f40182d == this.f40182d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f40180b), this.f40181c, this.f40182d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f40181c);
        String valueOf2 = String.valueOf(this.f40182d);
        int i = this.f40180b;
        int i2 = this.f40179a;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
