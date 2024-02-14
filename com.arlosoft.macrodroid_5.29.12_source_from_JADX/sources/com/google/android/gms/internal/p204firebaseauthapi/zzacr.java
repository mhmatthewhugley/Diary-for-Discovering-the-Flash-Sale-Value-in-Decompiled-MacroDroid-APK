package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzacr {

    /* renamed from: a */
    private final Object f39668a;

    /* renamed from: b */
    private final int f39669b;

    zzacr(Object obj, int i) {
        this.f39668a = obj;
        this.f39669b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacr = (zzacr) obj;
        if (this.f39668a == zzacr.f39668a && this.f39669b == zzacr.f39669b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f39668a) * 65535) + this.f39669b;
    }
}
