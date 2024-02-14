package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class zzadq {

    /* renamed from: c */
    private static final zzacs f39762c = zzacs.f39670b;

    /* renamed from: a */
    protected volatile zzaek f39763a;

    /* renamed from: b */
    private volatile zzacc f39764b;

    /* renamed from: a */
    public final int mo49104a() {
        if (this.f39764b != null) {
            return ((zzabz) this.f39764b).zza.length;
        }
        if (this.f39763a != null) {
            return this.f39763a.mo49083p();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzacc mo49105b() {
        if (this.f39764b != null) {
            return this.f39764b;
        }
        synchronized (this) {
            if (this.f39764b != null) {
                zzacc zzacc = this.f39764b;
                return zzacc;
            }
            if (this.f39763a == null) {
                this.f39764b = zzacc.f39635a;
            } else {
                this.f39764b = this.f39763a.mo48860l();
            }
            zzacc zzacc2 = this.f39764b;
            return zzacc2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49106c(com.google.android.gms.internal.p204firebaseauthapi.zzaek r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.firebase-auth-api.zzaek r0 = r1.f39763a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.firebase-auth-api.zzaek r0 = r1.f39763a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f39763a = r2     // Catch:{ zzadn -> 0x0011 }
            com.google.android.gms.internal.firebase-auth-api.zzacc r0 = com.google.android.gms.internal.p204firebaseauthapi.zzacc.f39635a     // Catch:{ zzadn -> 0x0011 }
            r1.f39764b = r0     // Catch:{ zzadn -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f39763a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.firebase-auth-api.zzacc r2 = com.google.android.gms.internal.p204firebaseauthapi.zzacc.f39635a     // Catch:{ all -> 0x001b }
            r1.f39764b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzadq.mo49106c(com.google.android.gms.internal.firebase-auth-api.zzaek):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadq)) {
            return false;
        }
        zzadq zzadq = (zzadq) obj;
        zzaek zzaek = this.f39763a;
        zzaek zzaek2 = zzadq.f39763a;
        if (zzaek == null && zzaek2 == null) {
            return mo49105b().equals(zzadq.mo49105b());
        }
        if (zzaek != null && zzaek2 != null) {
            return zzaek.equals(zzaek2);
        }
        if (zzaek != null) {
            zzadq.mo49106c(zzaek.mo49087u0());
            return zzaek.equals(zzadq.f39763a);
        }
        mo49106c(zzaek2.mo49087u0());
        return this.f39763a.equals(zzaek2);
    }

    public int hashCode() {
        return 1;
    }
}
