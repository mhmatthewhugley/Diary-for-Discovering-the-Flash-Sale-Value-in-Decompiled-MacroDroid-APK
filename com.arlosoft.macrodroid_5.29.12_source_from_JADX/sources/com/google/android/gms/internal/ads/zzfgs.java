package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfgs {

    /* renamed from: a */
    private final zzfgl f35765a;

    /* renamed from: b */
    private final zzfzp f35766b;

    /* renamed from: c */
    private boolean f35767c = false;

    /* renamed from: d */
    private boolean f35768d = false;

    public zzfgs(zzffq zzffq, zzfgk zzfgk, zzfgl zzfgl) {
        this.f35765a = zzfgl;
        this.f35766b = zzfzg.m51412g(zzfzg.m51419n(zzfgk.mo45557b(zzfgl), new zzfgq(this, zzfgk, zzffq, zzfgl), zzfgl.zzb()), Exception.class, new zzfgr(this, zzfgk), zzfgl.zzb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzfzp mo45725a(com.google.android.gms.internal.ads.zzfgl r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f35768d     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.f35767c     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.zzfgl r0 = r2.f35765a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfga r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfga r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfgl r0 = r2.f35765a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfga r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfga r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.f35767c = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzfzp r3 = r2.f35766b     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgs.mo45725a(com.google.android.gms.internal.ads.zzfgl):com.google.android.gms.internal.ads.zzfzp");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzfzp mo45726b(zzfgk zzfgk, zzffq zzffq, zzfgl zzfgl, zzffz zzffz) throws Exception {
        synchronized (this) {
            this.f35768d = true;
            zzfgk.mo45556a(zzffz);
            if (!this.f35767c) {
                zzffq.mo45687a(zzfgl.zza(), zzffz);
                zzfzp i = zzfzg.m51414i((Object) null);
                return i;
            }
            zzfzp i2 = zzfzg.m51414i(new zzfgj(zzffz, zzfgl));
            return i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45727c(zzfgk zzfgk, Exception exc) throws Exception {
        synchronized (this) {
            this.f35768d = true;
            throw exc;
        }
    }

    /* renamed from: d */
    public final synchronized void mo45728d(zzfzc zzfzc) {
        zzfzg.m51423r(zzfzg.m51419n(this.f35766b, zzfgp.f35758a, this.f35765a.zzb()), zzfzc, this.f35765a.zzb());
    }
}
