package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzclp extends zzer {

    /* renamed from: e */
    private final Context f28891e;

    /* renamed from: f */
    private final zzex f28892f;

    /* renamed from: g */
    private final String f28893g;

    /* renamed from: h */
    private final int f28894h;

    /* renamed from: i */
    private final boolean f28895i = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue();

    /* renamed from: j */
    private InputStream f28896j;

    /* renamed from: k */
    private boolean f28897k;

    /* renamed from: l */
    private Uri f28898l;

    /* renamed from: m */
    private volatile zzbeb f28899m;

    /* renamed from: n */
    private boolean f28900n = false;

    /* renamed from: o */
    private boolean f28901o = false;

    /* renamed from: p */
    private boolean f28902p = false;

    /* renamed from: q */
    private boolean f28903q = false;

    /* renamed from: r */
    private long f28904r = 0;

    /* renamed from: s */
    private zzfzp f28905s = null;

    /* renamed from: t */
    private final AtomicLong f28906t = new AtomicLong(-1);

    /* renamed from: u */
    private final zzcls f28907u;

    public zzclp(Context context, zzex zzex, String str, int i, zzfz zzfz, zzcls zzcls, byte[] bArr) {
        super(false);
        this.f28891e = context;
        this.f28892f = zzex;
        this.f28907u = zzcls;
        this.f28893g = str;
        this.f28894h = i;
        mo43952k(zzfz);
    }

    /* renamed from: z */
    private final boolean m45731z() {
        if (!this.f28895i) {
            return false;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27295x3)).booleanValue() && !this.f28902p) {
            return true;
        }
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27305y3)).booleanValue() || this.f28903q) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f28898l;
    }

    /* renamed from: d */
    public final void mo43926d() throws IOException {
        if (this.f28897k) {
            boolean z = false;
            this.f28897k = false;
            this.f28898l = null;
            if (!this.f28895i || this.f28896j != null) {
                z = true;
            }
            InputStream inputStream = this.f28896j;
            if (inputStream != null) {
                IOUtils.m4889b(inputStream);
                this.f28896j = null;
            } else {
                this.f28892f.mo43926d();
            }
            if (z) {
                mo45436o();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f28897k) {
            InputStream inputStream = this.f28896j;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f28892f.mo43927e(bArr, i, i2);
            }
            if (!this.f28895i || this.f28896j != null) {
                mo45439x(i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0130=Splitter:B:39:0x0130, B:34:0x010d=Splitter:B:34:0x010d} */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo43928g(com.google.android.gms.internal.ads.zzfc r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r13.f28897k
            if (r2 != 0) goto L_0x0208
            r2 = 1
            r13.f28897k = r2
            android.net.Uri r3 = r14.f35396a
            r13.f28898l = r3
            boolean r3 = r13.f28895i
            if (r3 != 0) goto L_0x0016
            r13.mo45438q(r14)
        L_0x0016:
            android.net.Uri r3 = r14.f35396a
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbeb.m43220l2(r3)
            r13.f28899m = r3
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27265u3
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r4.mo42663b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28899m
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28899m
            long r7 = r14.f35401f
            r3.f26687s = r7
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28899m
            java.lang.String r7 = r13.f28893g
            java.lang.String r7 = com.google.android.gms.internal.ads.zzftm.m50972c(r7)
            r3.f26688z = r7
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28899m
            int r7 = r13.f28894h
            r3.f26679A = r7
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28899m
            boolean r3 = r3.f26686p
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27285w3
            com.google.android.gms.internal.ads.zzbja r7 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r7.mo42663b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x006c
        L_0x0060:
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27275v3
            com.google.android.gms.internal.ads.zzbja r7 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r7.mo42663b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x006c:
            long r7 = r3.longValue()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r9 = r3.mo21952c()
            com.google.android.gms.ads.internal.zzt.m2893f()
            android.content.Context r3 = r13.f28891e
            com.google.android.gms.internal.ads.zzbeb r11 = r13.f28899m
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.zzbem.m43233a(r3, r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            java.lang.Object r7 = r3.get(r7, r11)     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            com.google.android.gms.internal.ads.zzben r7 = (com.google.android.gms.internal.ads.zzben) r7     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            boolean r8 = r7.mo42546d()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28900n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.mo42548f()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28902p = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.mo42547e()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28903q = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            long r11 = r7.mo42544a()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28904r = r11     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r13.m45731z()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r8 != 0) goto L_0x00de
            java.io.InputStream r7 = r7.mo42545c()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28896j = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r7 = r13.f28895i     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r7 == 0) goto L_0x00b6
            r13.mo45438q(r14)     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
        L_0x00b6:
            com.google.android.gms.common.util.Clock r14 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r6 = r14.mo21952c()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.zzcls r14 = r13.f28907u
            com.google.android.gms.internal.ads.zzcmc r14 = r14.f28914a
            r14.mo43976m0(r2, r6)
            r13.f28901o = r2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r6)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.ads.internal.util.zze.m2645k(r14)
            return r4
        L_0x00de:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r3 = r3.mo21952c()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.zzcls r5 = r13.f28907u
            com.google.android.gms.internal.ads.zzcmc r5 = r5.f28914a
            r5.mo43976m0(r2, r3)
            r13.f28901o = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0157
        L_0x0103:
            r14 = move-exception
            goto L_0x015e
        L_0x0105:
            r4 = 1
            goto L_0x010d
        L_0x0107:
            r4 = 1
            goto L_0x0130
        L_0x0109:
            r14 = move-exception
            r2 = 0
            goto L_0x015e
        L_0x010c:
            r4 = 0
        L_0x010d:
            r3.cancel(r2)     // Catch:{ all -> 0x015c }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x015c }
            r2.interrupt()     // Catch:{ all -> 0x015c }
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r2 = r2.mo21952c()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.zzcls r5 = r13.f28907u
            com.google.android.gms.internal.ads.zzcmc r5 = r5.f28914a
            r5.mo43976m0(r4, r2)
            r13.f28901o = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x014a
        L_0x012f:
            r4 = 0
        L_0x0130:
            r3.cancel(r2)     // Catch:{ all -> 0x015c }
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r2 = r2.mo21952c()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.zzcls r5 = r13.f28907u
            com.google.android.gms.internal.ads.zzcmc r5 = r5.f28914a
            r5.mo43976m0(r4, r2)
            r13.f28901o = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x014a:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0157:
            com.google.android.gms.ads.internal.util.zze.m2645k(r0)
            goto L_0x01e2
        L_0x015c:
            r14 = move-exception
            r2 = r4
        L_0x015e:
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r3 = r3.mo21952c()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.zzcls r5 = r13.f28907u
            com.google.android.gms.internal.ads.zzcmc r5 = r5.f28914a
            r5.mo43976m0(r2, r3)
            r13.f28901o = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.m2645k(r0)
            throw r14
        L_0x0186:
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28899m
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28899m
            long r7 = r14.f35401f
            r0.f26687s = r7
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28899m
            java.lang.String r1 = r13.f28893g
            java.lang.String r1 = com.google.android.gms.internal.ads.zzftm.m50972c(r1)
            r0.f26688z = r1
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28899m
            int r1 = r13.f28894h
            r0.f26679A = r1
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.ads.internal.zzt.m2892e()
            com.google.android.gms.internal.ads.zzbeb r1 = r13.f28899m
            com.google.android.gms.internal.ads.zzbdy r0 = r0.mo42515b(r1)
            goto L_0x01ac
        L_0x01ab:
            r0 = 0
        L_0x01ac:
            if (r0 == 0) goto L_0x01e2
            boolean r1 = r0.mo42523p2()
            if (r1 == 0) goto L_0x01e2
            boolean r1 = r0.mo42522o2()
            r13.f28900n = r1
            boolean r1 = r0.mo42525r2()
            r13.f28902p = r1
            boolean r1 = r0.mo42524q2()
            r13.f28903q = r1
            long r7 = r0.mo42519l2()
            r13.f28904r = r7
            r13.f28901o = r2
            boolean r1 = r13.m45731z()
            if (r1 != 0) goto L_0x01e2
            java.io.InputStream r0 = r0.mo42521n2()
            r13.f28896j = r0
            boolean r0 = r13.f28895i
            if (r0 == 0) goto L_0x01e1
            r13.mo45438q(r14)
        L_0x01e1:
            return r4
        L_0x01e2:
            r13.f28901o = r6
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28899m
            if (r0 == 0) goto L_0x0201
            com.google.android.gms.internal.ads.zzfc r0 = new com.google.android.gms.internal.ads.zzfc
            com.google.android.gms.internal.ads.zzbeb r1 = r13.f28899m
            java.lang.String r1 = r1.f26680a
            android.net.Uri r2 = android.net.Uri.parse(r1)
            long r4 = r14.f35400e
            long r6 = r14.f35401f
            long r8 = r14.f35402g
            r3 = 0
            r10 = 0
            int r11 = r14.f35404i
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r14 = r0
        L_0x0201:
            com.google.android.gms.internal.ads.zzex r0 = r13.f28892f
            long r0 = r0.mo43928g(r14)
            return r0
        L_0x0208:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclp.mo43928g(com.google.android.gms.internal.ads.zzfc):long");
    }

    /* renamed from: r */
    public final long mo43945r() {
        return this.f28904r;
    }

    /* renamed from: s */
    public final long mo43946s() {
        if (this.f28899m == null) {
            return -1;
        }
        if (this.f28906t.get() != -1) {
            return this.f28906t.get();
        }
        synchronized (this) {
            if (this.f28905s == null) {
                this.f28905s = zzchc.f28456a.mo46579F(new zzclo(this));
            }
        }
        if (!this.f28905s.isDone()) {
            return -1;
        }
        try {
            this.f28906t.compareAndSet(-1, ((Long) this.f28905s.get()).longValue());
            return this.f28906t.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ Long mo43947t() throws Exception {
        return Long.valueOf(zzt.m2892e().mo42514a(this.f28899m));
    }

    /* renamed from: u */
    public final boolean mo43948u() {
        return this.f28900n;
    }

    /* renamed from: v */
    public final boolean mo43949v() {
        return this.f28903q;
    }

    /* renamed from: w */
    public final boolean mo43950w() {
        return this.f28902p;
    }

    /* renamed from: y */
    public final boolean mo43951y() {
        return this.f28901o;
    }
}
