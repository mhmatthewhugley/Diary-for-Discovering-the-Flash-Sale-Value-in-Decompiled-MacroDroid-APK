package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class zzks {

    /* renamed from: c */
    private static final zzjr f41651c = zzjr.f41560c;

    /* renamed from: a */
    protected volatile zzlm f41652a;

    /* renamed from: b */
    private volatile zzje f41653b;

    /* renamed from: a */
    public final int mo51475a() {
        if (this.f41653b != null) {
            return ((zzjb) this.f41653b).zza.length;
        }
        if (this.f41652a != null) {
            return this.f41652a.mo51448d();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzje mo51476b() {
        if (this.f41653b != null) {
            return this.f41653b;
        }
        synchronized (this) {
            if (this.f41653b != null) {
                zzje zzje = this.f41653b;
                return zzje;
            }
            if (this.f41652a == null) {
                this.f41653b = zzje.f41539a;
            } else {
                this.f41653b = this.f41652a.mo51304c();
            }
            zzje zzje2 = this.f41653b;
            return zzje2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51477c(com.google.android.gms.internal.measurement.zzlm r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzlm r0 = r1.f41652a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzlm r0 = r1.f41652a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f41652a = r2     // Catch:{ zzkp -> 0x0011 }
            com.google.android.gms.internal.measurement.zzje r0 = com.google.android.gms.internal.measurement.zzje.f41539a     // Catch:{ zzkp -> 0x0011 }
            r1.f41653b = r0     // Catch:{ zzkp -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f41652a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.zzje r2 = com.google.android.gms.internal.measurement.zzje.f41539a     // Catch:{ all -> 0x001b }
            r1.f41653b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzks.mo51477c(com.google.android.gms.internal.measurement.zzlm):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzks)) {
            return false;
        }
        zzks zzks = (zzks) obj;
        zzlm zzlm = this.f41652a;
        zzlm zzlm2 = zzks.f41652a;
        if (zzlm == null && zzlm2 == null) {
            return mo51476b().equals(zzks.mo51476b());
        }
        if (zzlm != null && zzlm2 != null) {
            return zzlm.equals(zzlm2);
        }
        if (zzlm != null) {
            zzks.mo51477c(zzlm.mo51449e());
            return zzlm.equals(zzks.f41652a);
        }
        mo51477c(zzlm2.mo51449e());
        return this.f41652a.equals(zzlm2);
    }

    public int hashCode() {
        return 1;
    }
}
