package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcju implements zzazm {
    @Nullable

    /* renamed from: a */
    private final zzbab f28683a;

    /* renamed from: b */
    private final Context f28684b;

    /* renamed from: c */
    private final zzazm f28685c;

    /* renamed from: d */
    private final String f28686d;

    /* renamed from: e */
    private final int f28687e;

    /* renamed from: f */
    private final boolean f28688f = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue();

    /* renamed from: g */
    private InputStream f28689g;

    /* renamed from: h */
    private boolean f28690h;

    /* renamed from: i */
    private Uri f28691i;

    /* renamed from: j */
    private volatile zzbeb f28692j;

    /* renamed from: k */
    private boolean f28693k = false;

    /* renamed from: l */
    private boolean f28694l = false;

    /* renamed from: m */
    private boolean f28695m = false;

    /* renamed from: n */
    private boolean f28696n = false;

    /* renamed from: o */
    private long f28697o = 0;

    /* renamed from: p */
    private zzfzp f28698p = null;

    /* renamed from: q */
    private final AtomicLong f28699q = new AtomicLong(-1);

    /* renamed from: r */
    private final zzckc f28700r;

    public zzcju(Context context, zzazm zzazm, String str, int i, zzbab zzbab, zzckc zzckc, byte[] bArr) {
        this.f28684b = context;
        this.f28685c = zzazm;
        this.f28683a = zzbab;
        this.f28700r = zzckc;
        this.f28686d = str;
        this.f28687e = i;
    }

    /* renamed from: m */
    private final void m45543m(zzazo zzazo) {
        zzbab zzbab = this.f28683a;
        if (zzbab != null) {
            ((zzckg) zzbab).mo42307f(this, zzazo);
        }
    }

    /* renamed from: n */
    private final boolean m45544n() {
        if (!this.f28688f) {
            return false;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27295x3)).booleanValue() && !this.f28695m) {
            return true;
        }
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27305y3)).booleanValue() || this.f28696n) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Uri mo42281a() {
        return this.f28691i;
    }

    /* renamed from: c */
    public final long mo43828c() {
        return this.f28697o;
    }

    /* renamed from: d */
    public final void mo42282d() throws IOException {
        if (this.f28690h) {
            this.f28690h = false;
            this.f28691i = null;
            InputStream inputStream = this.f28689g;
            if (inputStream != null) {
                IOUtils.m4889b(inputStream);
                this.f28689g = null;
                return;
            }
            this.f28685c.mo42282d();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* renamed from: e */
    public final int mo42283e(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        zzbab zzbab;
        if (this.f28690h) {
            InputStream inputStream = this.f28689g;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f28685c.mo42283e(bArr, i, i2);
            }
            if ((!this.f28688f || this.f28689g != null) && (zzbab = this.f28683a) != null) {
                ((zzckg) zzbab).mo43867l0(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0130=Splitter:B:39:0x0130, B:34:0x010d=Splitter:B:34:0x010d} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo42284f(com.google.android.gms.internal.ads.zzazo r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r13.f28690h
            if (r2 != 0) goto L_0x0207
            r2 = 1
            r13.f28690h = r2
            android.net.Uri r3 = r14.f26354a
            r13.f28691i = r3
            boolean r3 = r13.f28688f
            if (r3 != 0) goto L_0x0016
            r13.m45543m(r14)
        L_0x0016:
            android.net.Uri r3 = r14.f26354a
            com.google.android.gms.internal.ads.zzbeb r3 = com.google.android.gms.internal.ads.zzbeb.m43220l2(r3)
            r13.f28692j = r3
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27265u3
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r4.mo42663b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28692j
            if (r3 == 0) goto L_0x01e2
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28692j
            long r7 = r14.f26356c
            r3.f26687s = r7
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28692j
            java.lang.String r7 = r13.f28686d
            java.lang.String r7 = com.google.android.gms.internal.ads.zzftm.m50972c(r7)
            r3.f26688z = r7
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28692j
            int r7 = r13.f28687e
            r3.f26679A = r7
            com.google.android.gms.internal.ads.zzbeb r3 = r13.f28692j
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
            android.content.Context r3 = r13.f28684b
            com.google.android.gms.internal.ads.zzbeb r11 = r13.f28692j
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.zzbem.m43233a(r3, r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            java.lang.Object r7 = r3.get(r7, r11)     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            com.google.android.gms.internal.ads.zzben r7 = (com.google.android.gms.internal.ads.zzben) r7     // Catch:{ ExecutionException | TimeoutException -> 0x012f, InterruptedException -> 0x010c, all -> 0x0109 }
            boolean r8 = r7.mo42546d()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28693k = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.mo42548f()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28695m = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r7.mo42547e()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28696n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            long r11 = r7.mo42544a()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28697o = r11     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r8 = r13.m45544n()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r8 != 0) goto L_0x00de
            java.io.InputStream r7 = r7.mo42545c()     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            r13.f28689g = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            boolean r7 = r13.f28688f     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
            if (r7 == 0) goto L_0x00b6
            r13.m45543m(r14)     // Catch:{ ExecutionException | TimeoutException -> 0x0107, InterruptedException -> 0x0105, all -> 0x0103 }
        L_0x00b6:
            com.google.android.gms.common.util.Clock r14 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r6 = r14.mo21952c()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.zzckc r14 = r13.f28700r
            com.google.android.gms.internal.ads.zzckg r14 = r14.f28730a
            r14.mo43866k0(r2, r6)
            r13.f28694l = r2
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
            com.google.android.gms.internal.ads.zzckc r5 = r13.f28700r
            com.google.android.gms.internal.ads.zzckg r5 = r5.f28730a
            r5.mo43866k0(r2, r3)
            r13.f28694l = r2
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
            com.google.android.gms.internal.ads.zzckc r5 = r13.f28700r
            com.google.android.gms.internal.ads.zzckg r5 = r5.f28730a
            r5.mo43866k0(r4, r2)
            r13.f28694l = r4
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
            com.google.android.gms.internal.ads.zzckc r5 = r13.f28700r
            com.google.android.gms.internal.ads.zzckg r5 = r5.f28730a
            r5.mo43866k0(r4, r2)
            r13.f28694l = r4
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
            com.google.android.gms.internal.ads.zzckc r5 = r13.f28700r
            com.google.android.gms.internal.ads.zzckg r5 = r5.f28730a
            r5.mo43866k0(r2, r3)
            r13.f28694l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.m2645k(r0)
            throw r14
        L_0x0186:
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28692j
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28692j
            long r7 = r14.f26356c
            r0.f26687s = r7
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28692j
            java.lang.String r1 = r13.f28686d
            java.lang.String r1 = com.google.android.gms.internal.ads.zzftm.m50972c(r1)
            r0.f26688z = r1
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28692j
            int r1 = r13.f28687e
            r0.f26679A = r1
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.ads.internal.zzt.m2892e()
            com.google.android.gms.internal.ads.zzbeb r1 = r13.f28692j
            com.google.android.gms.internal.ads.zzbdy r0 = r0.mo42515b(r1)
            goto L_0x01ac
        L_0x01ab:
            r0 = 0
        L_0x01ac:
            if (r0 == 0) goto L_0x01e2
            boolean r1 = r0.mo42523p2()
            if (r1 == 0) goto L_0x01e2
            boolean r1 = r0.mo42522o2()
            r13.f28693k = r1
            boolean r1 = r0.mo42525r2()
            r13.f28695m = r1
            boolean r1 = r0.mo42524q2()
            r13.f28696n = r1
            long r7 = r0.mo42519l2()
            r13.f28697o = r7
            r13.f28694l = r2
            boolean r1 = r13.m45544n()
            if (r1 != 0) goto L_0x01e2
            java.io.InputStream r0 = r0.mo42521n2()
            r13.f28689g = r0
            boolean r0 = r13.f28688f
            if (r0 == 0) goto L_0x01e1
            r13.m45543m(r14)
        L_0x01e1:
            return r4
        L_0x01e2:
            r13.f28694l = r6
            com.google.android.gms.internal.ads.zzbeb r0 = r13.f28692j
            if (r0 == 0) goto L_0x0200
            com.google.android.gms.internal.ads.zzazo r0 = new com.google.android.gms.internal.ads.zzazo
            com.google.android.gms.internal.ads.zzbeb r1 = r13.f28692j
            java.lang.String r1 = r1.f26680a
            android.net.Uri r2 = android.net.Uri.parse(r1)
            r3 = 0
            long r4 = r14.f26355b
            long r6 = r14.f26356c
            long r8 = r14.f26357d
            r10 = 0
            r11 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r14 = r0
        L_0x0200:
            com.google.android.gms.internal.ads.zzazm r0 = r13.f28685c
            long r0 = r0.mo42284f(r14)
            return r0
        L_0x0207:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open CacheDataSource."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcju.mo42284f(com.google.android.gms.internal.ads.zzazo):long");
    }

    /* renamed from: g */
    public final long mo43829g() {
        if (this.f28692j == null) {
            return -1;
        }
        if (this.f28699q.get() != -1) {
            return this.f28699q.get();
        }
        synchronized (this) {
            if (this.f28698p == null) {
                this.f28698p = zzchc.f28456a.mo46579F(new zzcjt(this));
            }
        }
        if (!this.f28698p.isDone()) {
            return -1;
        }
        try {
            this.f28699q.compareAndSet(-1, ((Long) this.f28698p.get()).longValue());
            return this.f28699q.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ Long mo43830h() throws Exception {
        return Long.valueOf(zzt.m2892e().mo42514a(this.f28692j));
    }

    /* renamed from: i */
    public final boolean mo43831i() {
        return this.f28693k;
    }

    /* renamed from: j */
    public final boolean mo43832j() {
        return this.f28696n;
    }

    /* renamed from: k */
    public final boolean mo43833k() {
        return this.f28695m;
    }

    /* renamed from: l */
    public final boolean mo43834l() {
        return this.f28694l;
    }
}
