package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbq {

    /* renamed from: a */
    private final Object f39920a;

    /* renamed from: b */
    private final byte[] f39921b;

    /* renamed from: c */
    private final zzoy f39922c;

    /* renamed from: d */
    private final int f39923d;

    /* renamed from: e */
    private final zzaw f39924e;

    /* renamed from: f */
    private final int f39925f;

    zzbq(Object obj, byte[] bArr, int i, zzoy zzoy, int i2, zzaw zzaw) {
        this.f39920a = obj;
        this.f39921b = Arrays.copyOf(bArr, bArr.length);
        this.f39925f = i;
        this.f39922c = zzoy;
        this.f39923d = i2;
        this.f39924e = zzaw;
    }

    /* renamed from: a */
    public final int mo49346a() {
        return this.f39923d;
    }

    /* renamed from: b */
    public final zzaw mo49347b() {
        return this.f39924e;
    }

    /* renamed from: c */
    public final zzbn mo49348c() {
        return this.f39924e.mo49305a();
    }

    /* renamed from: d */
    public final zzoy mo49349d() {
        return this.f39922c;
    }

    /* renamed from: e */
    public final Object mo49350e() {
        return this.f39920a;
    }

    /* renamed from: f */
    public final byte[] mo49351f() {
        byte[] bArr = this.f39921b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: g */
    public final int mo49352g() {
        return this.f39925f;
    }
}
