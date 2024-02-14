package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzjh {

    /* renamed from: a */
    private final zzbe f40207a;

    /* renamed from: b */
    private final int f40208b;

    /* renamed from: c */
    private final zzbn f40209c;

    /* synthetic */ zzjh(zzbe zzbe, int i, zzbn zzbn, zzjg zzjg) {
        this.f40207a = zzbe;
        this.f40208b = i;
        this.f40209c = zzbn;
    }

    /* renamed from: a */
    public final int mo49505a() {
        return this.f40208b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjh)) {
            return false;
        }
        zzjh zzjh = (zzjh) obj;
        if (this.f40207a == zzjh.f40207a && this.f40208b == zzjh.f40208b && this.f40209c.equals(zzjh.f40209c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40207a, Integer.valueOf(this.f40208b), Integer.valueOf(this.f40209c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.f40207a, Integer.valueOf(this.f40208b), this.f40209c});
    }
}
