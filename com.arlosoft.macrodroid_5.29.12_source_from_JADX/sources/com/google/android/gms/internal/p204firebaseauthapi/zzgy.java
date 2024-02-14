package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzgy implements zzha {

    /* renamed from: a */
    private final String f40108a;

    /* renamed from: b */
    private final zzqv f40109b;

    /* renamed from: c */
    private final zzacc f40110c;

    /* renamed from: d */
    private final zznr f40111d;

    /* renamed from: e */
    private final zzoy f40112e;

    /* renamed from: f */
    private final Integer f40113f;

    private zzgy(String str, zzacc zzacc, zznr zznr, zzoy zzoy, Integer num) {
        this.f40108a = str;
        this.f40109b = zzhj.m57343b(str);
        this.f40110c = zzacc;
        this.f40111d = zznr;
        this.f40112e = zzoy;
        this.f40113f = num;
    }

    /* renamed from: a */
    public static zzgy m57318a(String str, zzacc zzacc, zznr zznr, zzoy zzoy, Integer num) throws GeneralSecurityException {
        if (zzoy == zzoy.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgy(str, zzacc, zznr, zzoy, num);
    }

    /* renamed from: b */
    public final zznr mo49439b() {
        return this.f40111d;
    }

    /* renamed from: c */
    public final zzoy mo49440c() {
        return this.f40112e;
    }

    /* renamed from: d */
    public final zzqv mo49441d() {
        return this.f40109b;
    }

    /* renamed from: e */
    public final zzacc mo49442e() {
        return this.f40110c;
    }

    /* renamed from: f */
    public final Integer mo49443f() {
        return this.f40113f;
    }

    /* renamed from: g */
    public final String mo49444g() {
        return this.f40108a;
    }
}
