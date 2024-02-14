package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfxw extends zzfyw implements Runnable {

    /* renamed from: A */
    Object f36536A;

    /* renamed from: s */
    zzfzp f36537s;

    /* renamed from: z */
    Class f36538z;

    zzfxw(zzfzp zzfzp, Class cls, Object obj) {
        Objects.requireNonNull(zzfzp);
        this.f36537s = zzfzp;
        this.f36538z = cls;
        Objects.requireNonNull(obj);
        this.f36536A = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public abstract Object mo46552D(Object obj, Throwable th) throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract void mo46553E(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo46078d() {
        String str;
        zzfzp zzfzp = this.f36537s;
        Class cls = this.f36538z;
        Object obj = this.f36536A;
        String d = super.mo46078d();
        if (zzfzp != null) {
            str = "inputFuture=[" + zzfzp + "], ";
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
        } else if (d != null) {
            return str.concat(d);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo46079e() {
        mo46563u(this.f36537s);
        this.f36537s = null;
        this.f36538z = null;
        this.f36536A = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfzp r0 = r8.f36537s
            java.lang.Class r1 = r8.f36538z
            java.lang.Object r2 = r8.f36536A
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x009f
            boolean r3 = r8.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x009f
        L_0x0022:
            r3 = 0
            r8.f36537s = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgai     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.android.gms.internal.ads.zzgai r4 = (com.google.android.gms.internal.ads.zzgai) r4     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            java.lang.Throwable r4 = r4.mo46555a()     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003c
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzfzg.m51421p(r0)     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            goto L_0x0072
        L_0x0039:
            r4 = move-exception
            goto L_0x003c
        L_0x003b:
            r4 = move-exception
        L_0x003c:
            r5 = r3
            goto L_0x0072
        L_0x003e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0070
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Future type "
            r6.append(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L_0x0070:
            r4 = r5
            goto L_0x003c
        L_0x0072:
            if (r4 != 0) goto L_0x0078
            r8.mo46080f(r5)
            return
        L_0x0078:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x009c
            java.lang.Object r0 = r8.mo46552D(r2, r4)     // Catch:{ all -> 0x008a }
            r8.f36538z = r3
            r8.f36536A = r3
            r8.mo46553E(r0)
            return
        L_0x008a:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfzx.m51440a(r0)     // Catch:{ all -> 0x0096 }
            r8.mo46081g(r0)     // Catch:{ all -> 0x0096 }
            r8.f36538z = r3
            r8.f36536A = r3
            return
        L_0x0096:
            r0 = move-exception
            r8.f36538z = r3
            r8.f36536A = r3
            throw r0
        L_0x009c:
            r8.mo46564v(r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxw.run():void");
    }
}
