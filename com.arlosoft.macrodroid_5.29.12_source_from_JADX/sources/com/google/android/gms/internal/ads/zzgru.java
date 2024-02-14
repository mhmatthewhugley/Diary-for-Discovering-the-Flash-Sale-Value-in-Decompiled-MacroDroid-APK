package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzgru {

    /* renamed from: c */
    private static final zzgqq f37187c = zzgqq.m52900a();

    /* renamed from: a */
    protected volatile zzgso f37188a;

    /* renamed from: b */
    private volatile zzgpw f37189b;

    /* renamed from: a */
    public final int mo47374a() {
        if (this.f37189b != null) {
            return ((zzgps) this.f37189b).zza.length;
        }
        if (this.f37188a != null) {
            return this.f37188a.mo47353z();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzgpw mo47375b() {
        if (this.f37189b != null) {
            return this.f37189b;
        }
        synchronized (this) {
            if (this.f37189b != null) {
                zzgpw zzgpw = this.f37189b;
                return zzgpw;
            }
            if (this.f37188a == null) {
                this.f37189b = zzgpw.f37012a;
            } else {
                this.f37189b = this.f37188a.mo47051t();
            }
            zzgpw zzgpw2 = this.f37189b;
            return zzgpw2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47376c(com.google.android.gms.internal.ads.zzgso r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzgso r0 = r1.f37188a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzgso r0 = r1.f37188a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f37188a = r2     // Catch:{ zzgrq -> 0x0011 }
            com.google.android.gms.internal.ads.zzgpw r0 = com.google.android.gms.internal.ads.zzgpw.f37012a     // Catch:{ zzgrq -> 0x0011 }
            r1.f37189b = r0     // Catch:{ zzgrq -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f37188a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzgpw r2 = com.google.android.gms.internal.ads.zzgpw.f37012a     // Catch:{ all -> 0x001b }
            r1.f37189b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgru.mo47376c(com.google.android.gms.internal.ads.zzgso):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgru)) {
            return false;
        }
        zzgru zzgru = (zzgru) obj;
        zzgso zzgso = this.f37188a;
        zzgso zzgso2 = zzgru.f37188a;
        if (zzgso == null && zzgso2 == null) {
            return mo47375b().equals(zzgru.mo47375b());
        }
        if (zzgso != null && zzgso2 != null) {
            return zzgso.equals(zzgso2);
        }
        if (zzgso != null) {
            zzgru.mo47376c(zzgso.mo47337b());
            return zzgso.equals(zzgru.f37188a);
        }
        mo47376c(zzgso2.mo47337b());
        return this.f37188a.equals(zzgso2);
    }

    public int hashCode() {
        return 1;
    }
}
