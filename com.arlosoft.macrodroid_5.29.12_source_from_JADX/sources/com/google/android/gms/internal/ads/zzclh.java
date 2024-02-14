package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzclh extends zzclb implements zzbab {

    /* renamed from: A */
    private boolean f28841A;

    /* renamed from: B */
    private final Object f28842B = new Object();

    /* renamed from: C */
    private final String f28843C;

    /* renamed from: D */
    private final int f28844D;

    /* renamed from: E */
    private boolean f28845E;

    /* renamed from: f */
    private String f28846f;

    /* renamed from: g */
    private final zzcix f28847g;

    /* renamed from: o */
    private boolean f28848o;

    /* renamed from: p */
    private final zzclg f28849p = new zzclg();

    /* renamed from: s */
    private final zzckm f28850s = new zzckm();

    /* renamed from: z */
    private ByteBuffer f28851z;

    public zzclh(zzciy zzciy, zzcix zzcix) {
        super(zzciy);
        this.f28847g = zzcix;
        this.f28843C = zzciy != null ? zzciy.mo43762r() : "";
        this.f28844D = zzciy != null ? zzciy.mo43750e() : 0;
    }

    /* renamed from: A */
    private final void m45681A() {
        int a = (int) this.f28849p.mo43908a();
        int a2 = (int) this.f28850s.mo43878a(this.f28851z);
        int position = this.f28851z.position();
        int round = Math.round(((float) a2) * (((float) position) / ((float) a)));
        boolean z = round > 0;
        int Z = zzcip.m45389Z();
        int b0 = zzcip.m45390b0();
        String str = this.f28846f;
        mo43898m(str, m45682z(str), position, a, (long) round, (long) a2, z, Z, b0);
    }

    /* renamed from: z */
    protected static final String m45682z(String str) {
        return "cache:".concat(String.valueOf(zzcgi.m45176e(str)));
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo42306e(Object obj, int i) {
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo42307f(Object obj, zzazo zzazo) {
        this.f28849p.mo43909b((zzazq) obj);
    }

    /* renamed from: i */
    public final void mo43894i() {
        this.f28848o = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.android.gms.internal.ads.zzazq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.zzazq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.gms.internal.ads.zzazq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: com.google.android.gms.internal.ads.zzazq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.google.android.gms.internal.ads.zzcju} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: com.google.android.gms.internal.ads.zzazq} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d1, code lost:
        if (r9.f28851z.remaining() > 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d3, code lost:
        m45681A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
        if (r9.f28848o != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
        r12 = r1.mo21950a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e4, code lost:
        if ((r12 - r15) < r4) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e6, code lost:
        m45681A();
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0117, code lost:
        throw new java.io.IOException("Timeout exceeded. Limit: " + r6 + " sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0118, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011a, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013d, code lost:
        throw new java.io.IOException("Precache abort at " + r9.f28851z.limit() + " bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43904s(java.lang.String r26) {
        /*
            r25 = this;
            r9 = r25
            r10 = r26
            r9.f28846f = r10
            java.lang.String r11 = m45682z(r26)
            java.lang.String r12 = "error"
            com.google.android.gms.internal.ads.zzazq r0 = new com.google.android.gms.internal.ads.zzazq     // Catch:{ Exception -> 0x0147 }
            java.lang.String r2 = r9.f28831c     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzcix r1 = r9.f28847g     // Catch:{ Exception -> 0x0147 }
            int r5 = r1.f28585d     // Catch:{ Exception -> 0x0147 }
            r3 = 0
            int r6 = r1.f28587f     // Catch:{ Exception -> 0x0147 }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzcix r1 = r9.f28847g     // Catch:{ Exception -> 0x0147 }
            boolean r1 = r1.f28591j     // Catch:{ Exception -> 0x0147 }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.zzcju r14 = new com.google.android.gms.internal.ads.zzcju     // Catch:{ Exception -> 0x0147 }
            android.content.Context r2 = r9.f28830a     // Catch:{ Exception -> 0x0147 }
            java.lang.String r4 = r9.f28843C     // Catch:{ Exception -> 0x0147 }
            int r5 = r9.f28844D     // Catch:{ Exception -> 0x0147 }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r14
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0147 }
            r0 = r14
        L_0x0036:
            android.net.Uri r15 = android.net.Uri.parse(r26)     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzazo r1 = new com.google.android.gms.internal.ads.zzazo     // Catch:{ Exception -> 0x0147 }
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = -1
            r23 = 0
            r24 = 0
            r14 = r1
            r14.<init>(r15, r16, r17, r19, r21, r23, r24)     // Catch:{ Exception -> 0x0147 }
            r0.mo42284f(r1)     // Catch:{ Exception -> 0x0147 }
            java.lang.ref.WeakReference r1 = r9.f28832d     // Catch:{ Exception -> 0x0147 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzciy r1 = (com.google.android.gms.internal.ads.zzciy) r1     // Catch:{ Exception -> 0x0147 }
            if (r1 == 0) goto L_0x005c
            r1.mo43766w(r11, r9)     // Catch:{ Exception -> 0x0147 }
        L_0x005c:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.m2889b()     // Catch:{ Exception -> 0x0147 }
            long r2 = r1.mo21950a()     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzbiu r4 = com.google.android.gms.internal.ads.zzbjc.f27281w     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzbja r5 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x0147 }
            java.lang.Object r4 = r5.mo42663b(r4)     // Catch:{ Exception -> 0x0147 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0147 }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzbiu r6 = com.google.android.gms.internal.ads.zzbjc.f27271v     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzbja r7 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x0147 }
            java.lang.Object r6 = r7.mo42663b(r6)     // Catch:{ Exception -> 0x0147 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x0147 }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzcix r8 = r9.f28847g     // Catch:{ Exception -> 0x0147 }
            int r8 = r8.f28584c     // Catch:{ Exception -> 0x0147 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x0147 }
            r9.f28851z = r8     // Catch:{ Exception -> 0x0147 }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r14 = new byte[r8]     // Catch:{ Exception -> 0x0147 }
            r15 = r2
        L_0x0093:
            java.nio.ByteBuffer r13 = r9.f28851z     // Catch:{ Exception -> 0x0147 }
            int r13 = r13.remaining()     // Catch:{ Exception -> 0x0147 }
            int r13 = java.lang.Math.min(r13, r8)     // Catch:{ Exception -> 0x0147 }
            r8 = 0
            int r13 = r0.mo42283e(r14, r8, r13)     // Catch:{ Exception -> 0x0147 }
            r8 = -1
            r19 = r0
            r0 = 1
            if (r13 != r8) goto L_0x00b8
            r9.f28845E = r0     // Catch:{ Exception -> 0x0147 }
            com.google.android.gms.internal.ads.zzckm r1 = r9.f28850s     // Catch:{ Exception -> 0x0147 }
            java.nio.ByteBuffer r2 = r9.f28851z     // Catch:{ Exception -> 0x0147 }
            long r1 = r1.mo43878a(r2)     // Catch:{ Exception -> 0x0147 }
            int r2 = (int) r1     // Catch:{ Exception -> 0x0147 }
            long r1 = (long) r2     // Catch:{ Exception -> 0x0147 }
            r9.mo43897l(r10, r11, r1)     // Catch:{ Exception -> 0x0147 }
            goto L_0x00d7
        L_0x00b8:
            java.lang.Object r8 = r9.f28842B     // Catch:{ Exception -> 0x0147 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x0147 }
            boolean r0 = r9.f28848o     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x00c8
            java.nio.ByteBuffer r0 = r9.f28851z     // Catch:{ all -> 0x0142 }
            r21 = r12
            r12 = 0
            r0.put(r14, r12, r13)     // Catch:{ all -> 0x0140 }
            goto L_0x00ca
        L_0x00c8:
            r21 = r12
        L_0x00ca:
            monitor-exit(r8)     // Catch:{ all -> 0x0140 }
            java.nio.ByteBuffer r0 = r9.f28851z     // Catch:{ Exception -> 0x013e }
            int r0 = r0.remaining()     // Catch:{ Exception -> 0x013e }
            if (r0 > 0) goto L_0x00d8
            r25.m45681A()     // Catch:{ Exception -> 0x013e }
            r0 = 1
        L_0x00d7:
            return r0
        L_0x00d8:
            boolean r0 = r9.f28848o     // Catch:{ Exception -> 0x013e }
            if (r0 != 0) goto L_0x011a
            long r12 = r1.mo21950a()     // Catch:{ Exception -> 0x013e }
            long r22 = r12 - r15
            int r0 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00ea
            r25.m45681A()     // Catch:{ Exception -> 0x013e }
            r15 = r12
        L_0x00ea:
            long r12 = r12 - r2
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r6
            int r0 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r0 > 0) goto L_0x00fa
            r0 = r19
            r12 = r21
            r8 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0093
        L_0x00fa:
            java.lang.String r12 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118 }
            r0.<init>()     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r0.append(r1)     // Catch:{ Exception -> 0x0118 }
            r0.append(r6)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = " sec"
            r0.append(r1)     // Catch:{ Exception -> 0x0118 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0118 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0118 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0118 }
            throw r1     // Catch:{ Exception -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            goto L_0x014c
        L_0x011a:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0118 }
            java.nio.ByteBuffer r1 = r9.f28851z     // Catch:{ Exception -> 0x0118 }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x0118 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118 }
            r2.<init>()     // Catch:{ Exception -> 0x0118 }
            java.lang.String r3 = "Precache abort at "
            r2.append(r3)     // Catch:{ Exception -> 0x0118 }
            r2.append(r1)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = " bytes"
            r2.append(r1)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0118 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0118 }
            throw r0     // Catch:{ Exception -> 0x0118 }
        L_0x013e:
            r0 = move-exception
            goto L_0x014a
        L_0x0140:
            r0 = move-exception
            goto L_0x0145
        L_0x0142:
            r0 = move-exception
            r21 = r12
        L_0x0145:
            monitor-exit(r8)     // Catch:{ all -> 0x0140 }
            throw r0     // Catch:{ Exception -> 0x013e }
        L_0x0147:
            r0 = move-exception
            r21 = r12
        L_0x014a:
            r12 = r21
        L_0x014c:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ":"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to preload url "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " Exception: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzcgp.m45229g(r1)
            r9.mo43895j(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclh.mo43904s(java.lang.String):boolean");
    }

    /* renamed from: v */
    public final String mo43910v() {
        return this.f28846f;
    }

    /* renamed from: x */
    public final ByteBuffer mo43911x() {
        synchronized (this.f28842B) {
            ByteBuffer byteBuffer = this.f28851z;
            if (byteBuffer != null && !this.f28841A) {
                byteBuffer.flip();
                this.f28841A = true;
            }
            this.f28848o = true;
        }
        return this.f28851z;
    }

    /* renamed from: y */
    public final boolean mo43912y() {
        return this.f28845E;
    }
}
