package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public class zzdm {

    /* renamed from: c */
    private static final zzcp f40894c = zzcp.m58768a();

    /* renamed from: a */
    protected volatile zzee f40895a;

    /* renamed from: b */
    private volatile zzcf f40896b;

    /* renamed from: a */
    public final int mo50324a() {
        if (this.f40896b != null) {
            return ((zzcd) this.f40896b).zza.length;
        }
        if (this.f40895a != null) {
            return this.f40895a.mo50312l();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzcf mo50325b() {
        if (this.f40896b != null) {
            return this.f40896b;
        }
        synchronized (this) {
            if (this.f40896b != null) {
                zzcf zzcf = this.f40896b;
                return zzcf;
            }
            if (this.f40895a == null) {
                this.f40896b = zzcf.f40792a;
            } else {
                this.f40896b = this.f40895a.mo50185f();
            }
            zzcf zzcf2 = this.f40896b;
            return zzcf2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50326c(com.google.android.gms.internal.icing.zzee r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.icing.zzee r0 = r1.f40895a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.icing.zzee r0 = r1.f40895a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f40895a = r2     // Catch:{ zzdj -> 0x0011 }
            com.google.android.gms.internal.icing.zzcf r0 = com.google.android.gms.internal.icing.zzcf.f40792a     // Catch:{ zzdj -> 0x0011 }
            r1.f40896b = r0     // Catch:{ zzdj -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f40895a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.icing.zzcf r2 = com.google.android.gms.internal.icing.zzcf.f40792a     // Catch:{ all -> 0x001b }
            r1.f40896b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzdm.mo50326c(com.google.android.gms.internal.icing.zzee):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdm = (zzdm) obj;
        zzee zzee = this.f40895a;
        zzee zzee2 = zzdm.f40895a;
        if (zzee == null && zzee2 == null) {
            return mo50325b().equals(zzdm.mo50325b());
        }
        if (zzee != null && zzee2 != null) {
            return zzee.equals(zzee2);
        }
        if (zzee != null) {
            zzdm.mo50326c(zzee.mo50306k());
            return zzee.equals(zzdm.f40895a);
        }
        mo50326c(zzee2.mo50306k());
        return this.f40895a.equals(zzee2);
    }

    public int hashCode() {
        return 1;
    }
}
