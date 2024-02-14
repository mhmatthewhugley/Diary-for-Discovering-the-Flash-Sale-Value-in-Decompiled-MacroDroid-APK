package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzabt extends zzabv {

    /* renamed from: a */
    private int f39631a = 0;

    /* renamed from: c */
    private final int f39632c;

    /* renamed from: d */
    final /* synthetic */ zzacc f39633d;

    zzabt(zzacc zzacc) {
        this.f39633d = zzacc;
        this.f39632c = zzacc.mo48893f();
    }

    public final boolean hasNext() {
        return this.f39631a < this.f39632c;
    }

    public final byte zza() {
        int i = this.f39631a;
        if (i < this.f39632c) {
            this.f39631a = i + 1;
            return this.f39633d.mo48892d(i);
        }
        throw new NoSuchElementException();
    }
}
