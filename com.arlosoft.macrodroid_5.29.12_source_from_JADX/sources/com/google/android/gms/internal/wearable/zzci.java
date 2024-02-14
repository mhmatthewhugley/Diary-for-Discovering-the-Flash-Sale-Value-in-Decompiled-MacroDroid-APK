package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class zzci {

    /* renamed from: c */
    private static final zzbj f45651c = zzbj.m64158a();

    /* renamed from: a */
    protected volatile zzdc f45652a;

    /* renamed from: b */
    private volatile zzaw f45653b;

    /* renamed from: a */
    public final int mo53962a() {
        if (this.f45653b != null) {
            return ((zzat) this.f45653b).zza.length;
        }
        if (this.f45652a != null) {
            return this.f45652a.mo53942T();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzaw mo53963b() {
        if (this.f45653b != null) {
            return this.f45653b;
        }
        synchronized (this) {
            if (this.f45653b != null) {
                zzaw zzaw = this.f45653b;
                return zzaw;
            }
            if (this.f45652a == null) {
                this.f45653b = zzaw.f45541a;
            } else {
                this.f45653b = this.f45652a.mo53798S();
            }
            zzaw zzaw2 = this.f45653b;
            return zzaw2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53964c(com.google.android.gms.internal.wearable.zzdc r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.wearable.zzdc r0 = r1.f45652a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.wearable.zzdc r0 = r1.f45652a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f45652a = r2     // Catch:{ zzcf -> 0x0011 }
            com.google.android.gms.internal.wearable.zzaw r0 = com.google.android.gms.internal.wearable.zzaw.f45541a     // Catch:{ zzcf -> 0x0011 }
            r1.f45653b = r0     // Catch:{ zzcf -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f45652a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.wearable.zzaw r2 = com.google.android.gms.internal.wearable.zzaw.f45541a     // Catch:{ all -> 0x001b }
            r1.f45653b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzci.mo53964c(com.google.android.gms.internal.wearable.zzdc):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzci)) {
            return false;
        }
        zzci zzci = (zzci) obj;
        zzdc zzdc = this.f45652a;
        zzdc zzdc2 = zzci.f45652a;
        if (zzdc == null && zzdc2 == null) {
            return mo53963b().equals(zzci.mo53963b());
        }
        if (zzdc != null && zzdc2 != null) {
            return zzdc.equals(zzdc2);
        }
        if (zzdc != null) {
            zzci.mo53964c(zzdc.mo53934G());
            return zzdc.equals(zzci.f45652a);
        }
        mo53964c(zzdc2.mo53934G());
        return this.f45652a.equals(zzdc2);
    }

    public int hashCode() {
        return 1;
    }
}
