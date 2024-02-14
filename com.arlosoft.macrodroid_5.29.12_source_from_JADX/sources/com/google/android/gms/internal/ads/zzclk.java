package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzclk extends zzclb implements zzcio {

    /* renamed from: A */
    private long f28856A;

    /* renamed from: f */
    private zzcip f28857f;

    /* renamed from: g */
    private String f28858g;

    /* renamed from: o */
    private boolean f28859o;

    /* renamed from: p */
    private boolean f28860p;

    /* renamed from: s */
    private zzckt f28861s;

    /* renamed from: z */
    private long f28862z;

    public zzclk(zzciy zzciy, zzcix zzcix) {
        super(zzciy);
        zzcip zzcip;
        Context context = zzciy.getContext();
        if (zzcix.f28594m) {
            zzcip = new zzcmc(context, zzcix, (zzciy) this.f28832d.get());
        } else {
            zzcip = new zzckg(context, zzcix, (zzciy) this.f28832d.get());
        }
        this.f28857f = zzcip;
        zzcip.mo43707N(this);
    }

    /* renamed from: A */
    private final void m45690A(long j) {
        zzs.f2304i.postDelayed(new zzcli(this), j);
    }

    /* renamed from: y */
    protected static final String m45691y(String str) {
        return "cache:".concat(String.valueOf(zzcgi.m45176e(str)));
    }

    /* renamed from: z */
    private static String m45692z(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    /* renamed from: a */
    public final void mo43693a(int i, int i2) {
    }

    /* renamed from: b */
    public final void mo43694b(int i) {
    }

    /* renamed from: c */
    public final void mo43695c(String str, Exception exc) {
        zzcgp.m45230h("Precache exception", exc);
        zzt.m2904q().mo43502s(exc, "VideoStreamExoPlayerCache.onException");
    }

    /* renamed from: d */
    public final void mo43696d(boolean z, long j) {
        zzciy zzciy = (zzciy) this.f28832d.get();
        if (zzciy != null) {
            zzchc.f28460e.execute(new zzclj(zzciy, z, j));
        }
    }

    /* renamed from: g */
    public final void mo43697g(String str, Exception exc) {
        zzcgp.m45230h("Precache error", exc);
        zzt.m2904q().mo43502s(exc, "VideoStreamExoPlayerCache.onError");
    }

    /* renamed from: i */
    public final void mo43894i() {
        synchronized (this) {
            this.f28859o = true;
            notify();
            release();
        }
        String str = this.f28858g;
        if (str != null) {
            mo43895j(this.f28858g, m45691y(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    /* renamed from: o */
    public final void mo43900o(int i) {
        this.f28857f.mo43705L(i);
    }

    /* renamed from: p */
    public final void mo43901p(int i) {
        this.f28857f.mo43706M(i);
    }

    /* renamed from: q */
    public final void mo43902q(int i) {
        this.f28857f.mo43708P(i);
    }

    /* renamed from: r */
    public final void mo43903r(int i) {
        this.f28857f.mo43709Q(i);
    }

    public final void release() {
        zzcip zzcip = this.f28857f;
        if (zzcip != null) {
            zzcip.mo43707N((zzcio) null);
            this.f28857f.mo43703J();
        }
    }

    /* renamed from: s */
    public final boolean mo43904s(String str) {
        return mo43905t(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        r5 = r45;
        r6 = r46;
        r7 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r5.mo43897l(r6, r7, r3);
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43905t(java.lang.String r46, java.lang.String[] r47) {
        /*
            r45 = this;
            r15 = r45
            r13 = r46
            r0 = r47
            r15.f28858g = r13
            java.lang.String r14 = m45691y(r46)
            java.lang.String r17 = "error"
            r18 = 0
            int r1 = r0.length     // Catch:{ Exception -> 0x01c8 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x01c8 }
            r2 = 0
        L_0x0014:
            int r3 = r0.length     // Catch:{ Exception -> 0x01c8 }
            if (r2 >= r3) goto L_0x0022
            r3 = r0[r2]     // Catch:{ Exception -> 0x01c8 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x01c8 }
            r1[r2] = r3     // Catch:{ Exception -> 0x01c8 }
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0022:
            com.google.android.gms.internal.ads.zzcip r0 = r15.f28857f     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r2 = r15.f28831c     // Catch:{ Exception -> 0x01c8 }
            r0.mo43701H(r1, r2)     // Catch:{ Exception -> 0x01c8 }
            java.lang.ref.WeakReference r0 = r15.f28832d     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzciy r0 = (com.google.android.gms.internal.ads.zzciy) r0     // Catch:{ Exception -> 0x01c8 }
            if (r0 == 0) goto L_0x0036
            r0.mo43766w(r14, r15)     // Catch:{ Exception -> 0x01c8 }
        L_0x0036:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzt.m2889b()     // Catch:{ Exception -> 0x01c8 }
            long r19 = r0.mo21950a()     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f27281w     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01c8 }
            long r11 = r1.longValue()     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f27271v     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01c8 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x01c8 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r1 * r3
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f27261u     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01c8 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01c8 }
            long r6 = (long) r1     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26838D1     // Catch:{ Exception -> 0x01c8 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x01c8 }
            boolean r21 = r1.booleanValue()     // Catch:{ Exception -> 0x01c8 }
            r22 = -1
            r1 = r22
        L_0x0087:
            monitor-enter(r45)     // Catch:{ Exception -> 0x01c8 }
            long r3 = r0.mo21950a()     // Catch:{ all -> 0x01c0 }
            long r3 = r3 - r19
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0195
            boolean r3 = r15.f28859o     // Catch:{ all -> 0x01c0 }
            if (r3 != 0) goto L_0x0188
            boolean r3 = r15.f28860p     // Catch:{ all -> 0x01c0 }
            r24 = 1
            if (r3 == 0) goto L_0x00a0
            monitor-exit(r45)     // Catch:{ all -> 0x01c0 }
            r5 = r15
            goto L_0x0157
        L_0x00a0:
            com.google.android.gms.internal.ads.zzcip r3 = r15.f28857f     // Catch:{ all -> 0x01c0 }
            boolean r3 = r3.mo43716X()     // Catch:{ all -> 0x01c0 }
            if (r3 == 0) goto L_0x017b
            com.google.android.gms.internal.ads.zzcip r3 = r15.f28857f     // Catch:{ all -> 0x01c0 }
            long r4 = r3.mo43723g0()     // Catch:{ all -> 0x01c0 }
            r25 = 0
            int r3 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x015b
            com.google.android.gms.internal.ads.zzcip r3 = r15.f28857f     // Catch:{ all -> 0x01c0 }
            long r27 = r3.mo43719c0()     // Catch:{ all -> 0x01c0 }
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x012a
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c4
            r8 = 1
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            if (r21 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.zzcip r1 = r15.f28857f     // Catch:{ all -> 0x01c0 }
            long r1 = r1.mo43699F()     // Catch:{ all -> 0x01c0 }
            r29 = r1
            goto L_0x00d2
        L_0x00d0:
            r29 = r22
        L_0x00d2:
            if (r21 == 0) goto L_0x00dd
            com.google.android.gms.internal.ads.zzcip r1 = r15.f28857f     // Catch:{ all -> 0x01c0 }
            long r1 = r1.mo43721e0()     // Catch:{ all -> 0x01c0 }
            r31 = r1
            goto L_0x00df
        L_0x00dd:
            r31 = r22
        L_0x00df:
            if (r21 == 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzcip r1 = r15.f28857f     // Catch:{ all -> 0x01c0 }
            long r1 = r1.mo43700G()     // Catch:{ all -> 0x01c0 }
            r33 = r1
            goto L_0x00ec
        L_0x00ea:
            r33 = r22
        L_0x00ec:
            int r16 = com.google.android.gms.internal.ads.zzcip.m45389Z()     // Catch:{ all -> 0x0122 }
            int r35 = com.google.android.gms.internal.ads.zzcip.m45390b0()     // Catch:{ all -> 0x0122 }
            r1 = r45
            r2 = r46
            r3 = r14
            r36 = r4
            r4 = r27
            r38 = r6
            r6 = r36
            r40 = r9
            r9 = r29
            r42 = r11
            r11 = r31
            r44 = r14
            r13 = r33
            r15 = r16
            r16 = r35
            r1.mo43899n(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x0119 }
            r1 = r27
            r3 = r36
            goto L_0x0133
        L_0x0119:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r44
            goto L_0x01c4
        L_0x0122:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r14
            goto L_0x01c4
        L_0x012a:
            r38 = r6
            r40 = r9
            r42 = r11
            r44 = r14
            r3 = r4
        L_0x0133:
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0142
            r5 = r45
            r6 = r46
            r7 = r44
            r5.mo43897l(r6, r7, r3)     // Catch:{ all -> 0x01be }
            monitor-exit(r45)     // Catch:{ all -> 0x01be }
            goto L_0x0157
        L_0x0142:
            r5 = r45
            r6 = r46
            r7 = r44
            com.google.android.gms.internal.ads.zzcip r3 = r5.f28857f     // Catch:{ all -> 0x01be }
            long r3 = r3.mo43720d0()     // Catch:{ all -> 0x01be }
            int r8 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r8 < 0) goto L_0x0158
            int r3 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x0158
            monitor-exit(r45)     // Catch:{ all -> 0x01be }
        L_0x0157:
            return r24
        L_0x0158:
            r3 = r42
            goto L_0x0163
        L_0x015b:
            r38 = r6
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            r3 = r11
        L_0x0163:
            r5.wait(r3)     // Catch:{ InterruptedException -> 0x0171 }
            monitor-exit(r45)     // Catch:{ all -> 0x01be }
            r11 = r3
            r15 = r5
            r13 = r6
            r14 = r7
            r6 = r38
            r9 = r40
            goto L_0x0087
        L_0x0171:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x017b:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x0188:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x0195:
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ba }
            r2.<init>()     // Catch:{ all -> 0x01ba }
            java.lang.String r3 = "Timeout reached. Limit: "
            r2.append(r3)     // Catch:{ all -> 0x01ba }
            r3 = r40
            r2.append(r3)     // Catch:{ all -> 0x01ba }
            java.lang.String r3 = " ms"
            r2.append(r3)     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01ba }
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            r17 = r1
            goto L_0x01c4
        L_0x01be:
            r0 = move-exception
            goto L_0x01c4
        L_0x01c0:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01c4:
            monitor-exit(r45)     // Catch:{ all -> 0x01be }
            throw r0     // Catch:{ Exception -> 0x01c6 }
        L_0x01c6:
            r0 = move-exception
            goto L_0x01cc
        L_0x01c8:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01cc:
            r1 = r17
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to preload url "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Exception: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.google.android.gms.internal.ads.zzcgp.m45229g(r2)
            com.google.android.gms.internal.ads.zzcfy r2 = com.google.android.gms.ads.internal.zzt.m2904q()
            java.lang.String r3 = "VideoStreamExoPlayerCache.preload"
            r2.mo43502s(r0, r3)
            r45.release()
            java.lang.String r0 = m45692z(r1, r0)
            r5.mo43895j(r6, r7, r1, r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclk.mo43905t(java.lang.String, java.lang.String[]):boolean");
    }

    /* renamed from: u */
    public final boolean mo43906u(String str, String[] strArr, zzckt zzckt) {
        this.f28858g = str;
        this.f28861s = zzckt;
        String y = m45691y(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.f28857f.mo43701H(uriArr, this.f28831c);
            zzciy zzciy = (zzciy) this.f28832d.get();
            if (zzciy != null) {
                zzciy.mo43766w(y, this);
            }
            this.f28862z = zzt.m2889b().mo21950a();
            this.f28856A = -1;
            m45690A(0);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            zzcgp.m45229g("Failed to preload url " + str + " Exception: " + message);
            zzt.m2904q().mo43502s(e, "VideoStreamExoPlayerCache.preload");
            release();
            mo43895j(str, y, "error", m45692z("error", e));
            return false;
        }
    }

    /* renamed from: v */
    public final zzcip mo43915v() {
        synchronized (this) {
            this.f28860p = true;
            notify();
        }
        this.f28857f.mo43707N((zzcio) null);
        zzcip zzcip = this.f28857f;
        this.f28857f = null;
        return zzcip;
    }

    /* renamed from: w */
    public final void mo43698w() {
        zzcgp.m45229g("Precache onRenderedFirstFrame");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.google.android.gms.internal.ads.zzclk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.google.android.gms.internal.ads.zzclk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: com.google.android.gms.internal.ads.zzclk} */
    /* JADX WARNING: type inference failed for: r2v11, types: [boolean] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0110, code lost:
        r2.m45690A(((java.lang.Long) com.google.android.gms.ads.internal.client.zzay.m1924c().mo42663b(com.google.android.gms.internal.ads.zzbjc.f27281w)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo43916x() {
        /*
            r32 = this;
            r15 = r32
            java.lang.String r0 = r15.f28858g
            java.lang.String r13 = m45691y(r0)
            java.lang.String r17 = "error"
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27271v     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x016d }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ Exception -> 0x016d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x016d }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x016d }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            com.google.android.gms.internal.ads.zzbiu r2 = com.google.android.gms.internal.ads.zzbjc.f27261u     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x016d }
            java.lang.Object r2 = r3.mo42663b(r2)     // Catch:{ Exception -> 0x016d }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x016d }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x016d }
            long r11 = (long) r2     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.internal.ads.zzbiu r2 = com.google.android.gms.internal.ads.zzbjc.f26838D1     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ Exception -> 0x016d }
            java.lang.Object r2 = r3.mo42663b(r2)     // Catch:{ Exception -> 0x016d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x016d }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x016d }
            monitor-enter(r32)     // Catch:{ Exception -> 0x016d }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.m2889b()     // Catch:{ all -> 0x0166 }
            long r3 = r3.mo21950a()     // Catch:{ all -> 0x0166 }
            long r5 = r15.f28862z     // Catch:{ all -> 0x0166 }
            long r3 = r3 - r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0140
            boolean r0 = r15.f28859o     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0130
            boolean r0 = r15.f28860p     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x005b
            monitor-exit(r32)     // Catch:{ all -> 0x0166 }
            r2 = r15
            goto L_0x01a9
        L_0x005b:
            com.google.android.gms.internal.ads.zzcip r0 = r15.f28857f     // Catch:{ all -> 0x0166 }
            boolean r0 = r0.mo43716X()     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.zzcip r0 = r15.f28857f     // Catch:{ all -> 0x0166 }
            long r9 = r0.mo43723g0()     // Catch:{ all -> 0x0166 }
            r18 = 0
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x010d
            com.google.android.gms.internal.ads.zzcip r0 = r15.f28857f     // Catch:{ all -> 0x0166 }
            long r6 = r0.mo43719c0()     // Catch:{ all -> 0x0166 }
            long r0 = r15.f28856A     // Catch:{ all -> 0x0166 }
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x00e0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            r0 = 1
            r8 = 1
            goto L_0x0084
        L_0x0082:
            r0 = 0
            r8 = 0
        L_0x0084:
            java.lang.String r0 = r15.f28858g     // Catch:{ all -> 0x00db }
            r3 = -1
            if (r2 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzcip r1 = r15.f28857f     // Catch:{ all -> 0x0166 }
            long r20 = r1.mo43699F()     // Catch:{ all -> 0x0166 }
            goto L_0x0093
        L_0x0091:
            r20 = r3
        L_0x0093:
            if (r2 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzcip r1 = r15.f28857f     // Catch:{ all -> 0x0166 }
            long r22 = r1.mo43721e0()     // Catch:{ all -> 0x0166 }
            goto L_0x009e
        L_0x009c:
            r22 = r3
        L_0x009e:
            if (r2 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzcip r1 = r15.f28857f     // Catch:{ all -> 0x0166 }
            long r1 = r1.mo43700G()     // Catch:{ all -> 0x0166 }
            r24 = r1
            goto L_0x00ab
        L_0x00a9:
            r24 = r3
        L_0x00ab:
            int r16 = com.google.android.gms.internal.ads.zzcip.m45389Z()     // Catch:{ all -> 0x00db }
            int r26 = com.google.android.gms.internal.ads.zzcip.m45390b0()     // Catch:{ all -> 0x00db }
            r1 = r32
            r2 = r0
            r3 = r13
            r4 = r6
            r27 = r6
            r6 = r9
            r29 = r9
            r9 = r20
            r20 = r11
            r11 = r22
            r31 = r13
            r13 = r24
            r15 = r16
            r16 = r26
            r1.mo43899n(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x00d7 }
            r2 = r32
            r0 = r27
            r2.f28856A = r0     // Catch:{ all -> 0x00f5 }
            r3 = r29
            goto L_0x00e7
        L_0x00d7:
            r0 = move-exception
            r2 = r32
            goto L_0x00f6
        L_0x00db:
            r0 = move-exception
            r2 = r15
            r5 = r13
            goto L_0x0169
        L_0x00e0:
            r0 = r6
            r20 = r11
            r31 = r13
            r2 = r15
            r3 = r9
        L_0x00e7:
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x00fa
            java.lang.String r0 = r2.f28858g     // Catch:{ all -> 0x00f5 }
            r5 = r31
            r2.mo43897l(r0, r5, r3)     // Catch:{ all -> 0x0164 }
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            goto L_0x01a9
        L_0x00f5:
            r0 = move-exception
        L_0x00f6:
            r5 = r31
            goto L_0x0169
        L_0x00fa:
            r5 = r31
            com.google.android.gms.internal.ads.zzcip r3 = r2.f28857f     // Catch:{ all -> 0x0164 }
            long r3 = r3.mo43720d0()     // Catch:{ all -> 0x0164 }
            int r6 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r6 < 0) goto L_0x010f
            int r3 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x010f
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            goto L_0x01a9
        L_0x010d:
            r5 = r13
            r2 = r15
        L_0x010f:
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27281w
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.m45690A(r0)
            return
        L_0x0124:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "ExoPlayer was released during preloading."
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x0130:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013c }
            java.lang.String r3 = "Abort requested before buffering finished. "
            r0.<init>(r3)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            r17 = r1
            goto L_0x0169
        L_0x0140:
            r5 = r13
            r2 = r15
            java.lang.String r3 = "downloadTimeout"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0160 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0160 }
            r6.<init>()     // Catch:{ all -> 0x0160 }
            java.lang.String r7 = "Timeout reached. Limit: "
            r6.append(r7)     // Catch:{ all -> 0x0160 }
            r6.append(r0)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = " ms"
            r6.append(r0)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0160 }
            r4.<init>(r0)     // Catch:{ all -> 0x0160 }
            throw r4     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r0 = move-exception
            r17 = r3
            goto L_0x0169
        L_0x0164:
            r0 = move-exception
            goto L_0x0169
        L_0x0166:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L_0x0169:
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            throw r0     // Catch:{ Exception -> 0x016b }
        L_0x016b:
            r0 = move-exception
            goto L_0x0170
        L_0x016d:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L_0x0170:
            r1 = r17
            java.lang.String r3 = r2.f28858g
            java.lang.String r4 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to preload url "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " Exception: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            com.google.android.gms.internal.ads.zzcgp.m45229g(r3)
            com.google.android.gms.internal.ads.zzcfy r3 = com.google.android.gms.ads.internal.zzt.m2904q()
            java.lang.String r4 = "VideoStreamExoPlayerCache.preload"
            r3.mo43502s(r0, r4)
            r32.release()
            java.lang.String r0 = m45692z(r1, r0)
            java.lang.String r3 = r2.f28858g
            r2.mo43895j(r3, r5, r1, r0)
        L_0x01a9:
            com.google.android.gms.internal.ads.zzcku r0 = com.google.android.gms.ads.internal.zzt.m2886A()
            com.google.android.gms.internal.ads.zzckt r1 = r2.f28861s
            r0.mo43885f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclk.mo43916x():void");
    }
}
