package com.google.android.gms.internal.places;

public class zzbp {

    /* renamed from: d */
    private static final zzap f45296d = zzap.m63253b();

    /* renamed from: a */
    private zzw f45297a;

    /* renamed from: b */
    private volatile zzck f45298b;

    /* renamed from: c */
    private volatile zzw f45299c;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.places.zzck m63372b(com.google.android.gms.internal.places.zzck r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.places.zzck r0 = r1.f45298b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.places.zzck r0 = r1.f45298b     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f45298b = r2     // Catch:{ zzbk -> 0x0012 }
            com.google.android.gms.internal.places.zzw r0 = com.google.android.gms.internal.places.zzw.f45474a     // Catch:{ zzbk -> 0x0012 }
            r1.f45299c = r0     // Catch:{ zzbk -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f45298b = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.places.zzw r2 = com.google.android.gms.internal.places.zzw.f45474a     // Catch:{ all -> 0x001a }
            r1.f45299c = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.places.zzck r2 = r1.f45298b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzbp.m63372b(com.google.android.gms.internal.places.zzck):com.google.android.gms.internal.places.zzck");
    }

    /* renamed from: a */
    public final int mo53485a() {
        if (this.f45299c != null) {
            return this.f45299c.size();
        }
        if (this.f45298b != null) {
            return this.f45298b.mo53446b();
        }
        return 0;
    }

    /* renamed from: c */
    public final zzck mo53486c(zzck zzck) {
        zzck zzck2 = this.f45298b;
        this.f45297a = null;
        this.f45299c = null;
        this.f45298b = zzck;
        return zzck2;
    }

    /* renamed from: d */
    public final zzw mo53487d() {
        if (this.f45299c != null) {
            return this.f45299c;
        }
        synchronized (this) {
            if (this.f45299c != null) {
                zzw zzw = this.f45299c;
                return zzw;
            }
            if (this.f45298b == null) {
                this.f45299c = zzw.f45474a;
            } else {
                this.f45299c = this.f45298b.mo53534w();
            }
            zzw zzw2 = this.f45299c;
            return zzw2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbp)) {
            return false;
        }
        zzbp zzbp = (zzbp) obj;
        zzck zzck = this.f45298b;
        zzck zzck2 = zzbp.f45298b;
        if (zzck == null && zzck2 == null) {
            return mo53487d().equals(zzbp.mo53487d());
        }
        if (zzck != null && zzck2 != null) {
            return zzck.equals(zzck2);
        }
        if (zzck != null) {
            return zzck.equals(zzbp.m63372b(zzck.mo53451f()));
        }
        return m63372b(zzck2.mo53451f()).equals(zzck2);
    }

    public int hashCode() {
        return 1;
    }
}
