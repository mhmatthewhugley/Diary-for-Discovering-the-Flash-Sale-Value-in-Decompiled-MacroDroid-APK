package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzhv extends zziv {

    /* renamed from: a */
    private final int f40143a;

    /* renamed from: b */
    private final int f40144b;

    /* renamed from: c */
    private final zzht f40145c;

    /* synthetic */ zzhv(int i, int i2, zzht zzht, zzhu zzhu) {
        this.f40143a = i;
        this.f40144b = i2;
        this.f40145c = zzht;
    }

    /* renamed from: a */
    public final int mo49471a() {
        return this.f40143a;
    }

    /* renamed from: b */
    public final int mo49472b() {
        zzht zzht = this.f40145c;
        if (zzht == zzht.f40141e) {
            return this.f40144b;
        }
        if (zzht == zzht.f40138b || zzht == zzht.f40139c || zzht == zzht.f40140d) {
            return this.f40144b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: c */
    public final zzht mo49473c() {
        return this.f40145c;
    }

    /* renamed from: d */
    public final boolean mo49474d() {
        return this.f40145c != zzht.f40141e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhv)) {
            return false;
        }
        zzhv zzhv = (zzhv) obj;
        if (zzhv.f40143a == this.f40143a && zzhv.mo49472b() == mo49472b() && zzhv.f40145c == this.f40145c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f40144b), this.f40145c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f40145c);
        int i = this.f40144b;
        int i2 = this.f40143a;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
