package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzgn {

    /* renamed from: b */
    private static final zzgn f40098b = new zzgn();

    /* renamed from: a */
    private final AtomicReference f40099a = new AtomicReference(new zzhh(new zzhb(), (zzhg) null));

    /* renamed from: b */
    public static zzgn m57303b() {
        return f40098b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        return new com.google.android.gms.internal.p204firebaseauthapi.zzgg(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        throw new com.google.android.gms.internal.p204firebaseauthapi.zzhi("Creating a LegacyProtoKey failed", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.p204firebaseauthapi.zzaw mo49429a(com.google.android.gms.internal.p204firebaseauthapi.zzgy r2, com.google.android.gms.internal.p204firebaseauthapi.zzca r3) {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.f40099a     // Catch:{ GeneralSecurityException -> 0x000d }
            java.lang.Object r0 = r0.get()     // Catch:{ GeneralSecurityException -> 0x000d }
            com.google.android.gms.internal.firebase-auth-api.zzhh r0 = (com.google.android.gms.internal.p204firebaseauthapi.zzhh) r0     // Catch:{ GeneralSecurityException -> 0x000d }
            com.google.android.gms.internal.firebase-auth-api.zzaw r2 = r0.mo49459a(r2, r3)     // Catch:{ GeneralSecurityException -> 0x000d }
            return r2
        L_0x000d:
            com.google.android.gms.internal.firebase-auth-api.zzgg r0 = new com.google.android.gms.internal.firebase-auth-api.zzgg     // Catch:{ GeneralSecurityException -> 0x0013 }
            r0.<init>(r2, r3)     // Catch:{ GeneralSecurityException -> 0x0013 }
            return r0
        L_0x0013:
            r2 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzhi r3 = new com.google.android.gms.internal.firebase-auth-api.zzhi
            java.lang.String r0 = "Creating a LegacyProtoKey failed"
            r3.<init>(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzgn.mo49429a(com.google.android.gms.internal.firebase-auth-api.zzgy, com.google.android.gms.internal.firebase-auth-api.zzca):com.google.android.gms.internal.firebase-auth-api.zzaw");
    }

    /* renamed from: c */
    public final synchronized void mo49430c(zzfv zzfv) throws GeneralSecurityException {
        zzhb zzhb = new zzhb((zzhh) this.f40099a.get());
        zzhb.mo49449a(zzfv);
        this.f40099a.set(new zzhh(zzhb, (zzhg) null));
    }

    /* renamed from: d */
    public final synchronized void mo49431d(zzfz zzfz) throws GeneralSecurityException {
        zzhb zzhb = new zzhb((zzhh) this.f40099a.get());
        zzhb.mo49450b(zzfz);
        this.f40099a.set(new zzhh(zzhb, (zzhg) null));
    }

    /* renamed from: e */
    public final synchronized void mo49432e(zzgr zzgr) throws GeneralSecurityException {
        zzhb zzhb = new zzhb((zzhh) this.f40099a.get());
        zzhb.mo49451c(zzgr);
        this.f40099a.set(new zzhh(zzhb, (zzhg) null));
    }

    /* renamed from: f */
    public final synchronized void mo49433f(zzgv zzgv) throws GeneralSecurityException {
        zzhb zzhb = new zzhb((zzhh) this.f40099a.get());
        zzhb.mo49452d(zzgv);
        this.f40099a.set(new zzhh(zzhb, (zzhg) null));
    }
}
