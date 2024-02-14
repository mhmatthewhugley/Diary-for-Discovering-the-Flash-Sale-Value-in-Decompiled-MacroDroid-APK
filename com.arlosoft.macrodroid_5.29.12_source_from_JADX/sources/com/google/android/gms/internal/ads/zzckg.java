package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzckg extends zzcip implements zzbab, zzaxz, zzbbl, zzatt, zzasj {

    /* renamed from: N */
    public static final /* synthetic */ int f28735N = 0;

    /* renamed from: A */
    private ByteBuffer f28736A;

    /* renamed from: B */
    private boolean f28737B;

    /* renamed from: C */
    private final WeakReference f28738C;

    /* renamed from: D */
    private zzcio f28739D;

    /* renamed from: E */
    private int f28740E;

    /* renamed from: F */
    private int f28741F;

    /* renamed from: G */
    private long f28742G;

    /* renamed from: H */
    private final String f28743H;

    /* renamed from: I */
    private final int f28744I;

    /* renamed from: J */
    private final Object f28745J = new Object();

    /* renamed from: K */
    private final ArrayList f28746K;

    /* renamed from: L */
    private volatile zzcju f28747L;

    /* renamed from: M */
    private final Set f28748M = new HashSet();

    /* renamed from: d */
    private final Context f28749d;

    /* renamed from: f */
    private final zzcjv f28750f;

    /* renamed from: g */
    private final zzatb f28751g;

    /* renamed from: o */
    private final zzatb f28752o;

    /* renamed from: p */
    private final zzazd f28753p;

    /* renamed from: s */
    private final zzcix f28754s;

    /* renamed from: z */
    private zzasm f28755z;

    public zzckg(Context context, zzcix zzcix, zzciy zzciy) {
        this.f28749d = context;
        this.f28754s = zzcix;
        this.f28738C = new WeakReference(zzciy);
        zzcjv zzcjv = new zzcjv();
        this.f28750f = zzcjv;
        zzaww zzaww = zzaww.f26156a;
        zzfpz zzfpz = zzs.f2304i;
        zzbba zzbba = new zzbba(context, zzaww, 0, zzfpz, this, -1);
        this.f28751g = zzbba;
        zzaui zzaui = new zzaui(zzaww, (zzauw) null, true, zzfpz, this);
        this.f28752o = zzaui;
        zzayz zzayz = new zzayz((zzaze) null);
        this.f28753p = zzayz;
        if (zze.m2647m()) {
            zze.m2645k("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcip.f28540a.incrementAndGet();
        int i = 0;
        zzasm a = zzasn.m42302a(new zzatb[]{zzaui, zzbba}, zzayz, zzcjv);
        this.f28755z = a;
        a.mo41920H(this);
        this.f28740E = 0;
        this.f28742G = 0;
        this.f28741F = 0;
        this.f28746K = new ArrayList();
        this.f28747L = null;
        this.f28743H = (zzciy == null || zzciy.mo43762r() == null) ? "" : zzciy.mo43762r();
        this.f28744I = zzciy != null ? zzciy.mo43750e() : i;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27191n)).booleanValue()) {
            this.f28755z.mo41929f();
        }
        if (zzciy != null && zzciy.mo43751f() > 0) {
            this.f28755z.mo41926N(zzciy.mo43751f());
        }
        if (zzciy != null && zzciy.mo43748c() > 0) {
            this.f28755z.mo41924L(zzciy.mo43748c());
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27211p)).booleanValue()) {
            this.f28755z.mo41930g();
            this.f28755z.mo41917E(((Integer) zzay.m1924c().mo42663b(zzbjc.f27221q)).intValue());
        }
    }

    /* renamed from: n0 */
    private final boolean m45580n0() {
        return this.f28747L != null && this.f28747L.mo43834l();
    }

    /* renamed from: A */
    public final void mo42385A(int i, long j) {
        this.f28741F += i;
    }

    /* renamed from: C */
    public final void mo42386C(zzasw zzasw) {
        zzciy zzciy = (zzciy) this.f28738C.get();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && zzciy != null && zzasw != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzasw.f25506C));
            hashMap.put("bitRate", String.valueOf(zzasw.f25523c));
            int i = zzasw.f25504A;
            int i2 = zzasw.f25505B;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", zzasw.f25526g);
            hashMap.put("videoSampleMime", zzasw.f25527o);
            hashMap.put("videoCodec", zzasw.f25524d);
            zzciy.mo42954y("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: D */
    public final void mo42387D(Surface surface) {
        zzcio zzcio = this.f28739D;
        if (zzcio != null) {
            zzcio.mo43698w();
        }
    }

    /* renamed from: F */
    public final long mo43699F() {
        if (!m45580n0()) {
            return (long) this.f28740E;
        }
        return 0;
    }

    /* renamed from: G */
    public final long mo43700G() {
        if (m45580n0()) {
            return this.f28747L.mo43829g();
        }
        synchronized (this.f28745J) {
            while (!this.f28746K.isEmpty()) {
                long j = this.f28742G;
                Map b = ((zzazv) this.f28746K.remove(0)).mo42294b();
                long j2 = 0;
                if (b != null) {
                    Iterator it = b.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !zzfse.m50917c("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f28742G = j + j2;
            }
        }
        return this.f28742G;
    }

    /* renamed from: H */
    public final void mo43701H(Uri[] uriArr, String str) {
        mo43702I(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: I */
    public final void mo43702I(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaye zzaye;
        if (this.f28755z != null) {
            this.f28736A = byteBuffer;
            this.f28737B = z;
            int length = uriArr.length;
            if (length == 1) {
                zzaye = mo43869o0(uriArr[0], str);
            } else {
                zzaye[] zzayeArr = new zzaye[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzayeArr[i] = mo43869o0(uriArr[i], str);
                }
                zzaye = new zzayi(zzayeArr);
            }
            this.f28755z.mo41922J(zzaye);
            zzcip.f28541c.incrementAndGet();
        }
    }

    /* renamed from: J */
    public final void mo43703J() {
        zzasm zzasm = this.f28755z;
        if (zzasm != null) {
            zzasm.mo41923K(this);
            this.f28755z.mo41931i();
            this.f28755z = null;
            zzcip.f28541c.decrementAndGet();
        }
    }

    /* renamed from: K */
    public final void mo43704K(long j) {
        this.f28755z.mo41918F(j);
    }

    /* renamed from: L */
    public final void mo43705L(int i) {
        this.f28750f.mo43840f(i);
    }

    /* renamed from: M */
    public final void mo43706M(int i) {
        this.f28750f.mo43841g(i);
    }

    /* renamed from: N */
    public final void mo43707N(zzcio zzcio) {
        this.f28739D = zzcio;
    }

    /* renamed from: O */
    public final void mo41910O(boolean z) {
    }

    /* renamed from: P */
    public final void mo43708P(int i) {
        this.f28750f.mo43842h(i);
    }

    /* renamed from: Q */
    public final void mo43709Q(int i) {
        this.f28750f.mo43843i(i);
    }

    /* renamed from: R */
    public final void mo43710R(boolean z) {
        this.f28755z.mo41919G(z);
    }

    /* renamed from: S */
    public final void mo43711S(boolean z) {
        if (this.f28755z != null) {
            for (int i = 0; i < 2; i++) {
                this.f28753p.mo42273f(i, !z);
            }
        }
    }

    /* renamed from: T */
    public final void mo43712T(int i) {
        for (WeakReference weakReference : this.f28748M) {
            zzcjs zzcjs = (zzcjs) weakReference.get();
            if (zzcjs != null) {
                zzcjs.mo43826h(i);
            }
        }
    }

    /* renamed from: U */
    public final void mo43713U(Surface surface, boolean z) {
        zzasm zzasm = this.f28755z;
        if (zzasm != null) {
            zzasl zzasl = new zzasl(this.f28751g, 1, surface);
            if (z) {
                zzasm.mo41925M(zzasl);
                return;
            }
            zzasm.mo41921I(zzasl);
        }
    }

    /* renamed from: V */
    public final void mo43714V(float f, boolean z) {
        if (this.f28755z != null) {
            zzasl zzasl = new zzasl(this.f28752o, 2, Float.valueOf(f));
            this.f28755z.mo41921I(zzasl);
        }
    }

    /* renamed from: W */
    public final void mo43715W() {
        this.f28755z.mo41932q();
    }

    /* renamed from: X */
    public final boolean mo43716X() {
        return this.f28755z != null;
    }

    /* renamed from: Y */
    public final int mo43717Y() {
        return this.f28741F;
    }

    /* renamed from: a0 */
    public final int mo43718a0() {
        return this.f28755z.zza();
    }

    /* renamed from: b */
    public final void mo41911b() {
    }

    /* renamed from: c */
    public final void mo42223c(IOException iOException) {
        zzcio zzcio = this.f28739D;
        if (zzcio == null) {
            return;
        }
        if (this.f28754s.f28593l) {
            zzcio.mo43695c("onLoadException", iOException);
        } else {
            zzcio.mo43697g("onLoadError", iOException);
        }
    }

    /* renamed from: c0 */
    public final long mo43719c0() {
        return this.f28755z.zzb();
    }

    /* renamed from: d0 */
    public final long mo43720d0() {
        return (long) this.f28740E;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo42306e(Object obj, int i) {
        this.f28740E += i;
    }

    /* renamed from: e0 */
    public final long mo43721e0() {
        if (m45580n0() && this.f28747L.mo43833k()) {
            return Math.min((long) this.f28740E, this.f28747L.mo43828c());
        }
        return 0;
    }

    /* renamed from: f0 */
    public final long mo43722f0() {
        return this.f28755z.mo41927a();
    }

    public final void finalize() throws Throwable {
        zzcip.f28540a.decrementAndGet();
        if (zze.m2647m()) {
            zze.m2645k("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* renamed from: g0 */
    public final long mo43723g0() {
        return this.f28755z.mo41928d();
    }

    /* renamed from: h */
    public final void mo41912h(zzata zzata) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ zzazm mo43863h0(String str, boolean z) {
        zzckg zzckg = true != z ? null : this;
        zzcix zzcix = this.f28754s;
        zzcjs zzcjs = new zzcjs(str, zzckg, zzcix.f28585d, zzcix.f28587f, zzcix.f28590i);
        this.f28748M.add(new WeakReference(zzcjs));
        return zzcjs;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final /* synthetic */ zzazm mo43864i0(String str, boolean z) {
        zzckg zzckg = true != z ? null : this;
        zzcix zzcix = this.f28754s;
        return new zzazq(str, (zzbam) null, zzckg, zzcix.f28585d, zzcix.f28587f, true, (zzazu) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final /* synthetic */ zzazm mo43865j0(zzazl zzazl) {
        return new zzcju(this.f28749d, zzazl.zza(), this.f28743H, this.f28744I, this, new zzckc(this), (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final /* synthetic */ void mo43866k0(boolean z, long j) {
        zzcio zzcio = this.f28739D;
        if (zzcio != null) {
            zzcio.mo43696d(z, j);
        }
    }

    /* renamed from: l0 */
    public final void mo43867l0(zzazm zzazm, int i) {
        this.f28740E += i;
    }

    /* renamed from: m0 */
    public final void mo42307f(zzazm zzazm, zzazo zzazo) {
        if (zzazm instanceof zzazv) {
            synchronized (this.f28745J) {
                this.f28746K.add((zzazv) zzazm);
            }
        } else if (zzazm instanceof zzcju) {
            this.f28747L = (zzcju) zzazm;
            zzciy zzciy = (zzciy) this.f28738C.get();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && zzciy != null && this.f28747L.mo43831i()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f28747L.mo43833k()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f28747L.mo43832j()));
                zzs.f2304i.post(new zzckd(zzciy, hashMap));
            }
        }
    }

    /* renamed from: n */
    public final void mo42018n(zzasw zzasw) {
        zzciy zzciy = (zzciy) this.f28738C.get();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && zzciy != null && zzasw != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzasw.f25526g);
            hashMap.put("audioSampleMime", zzasw.f25527o);
            hashMap.put("audioCodec", zzasw.f25524d);
            zzciy.mo42954y("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: o */
    public final void mo41913o(zzasi zzasi) {
        zzcio zzcio = this.f28739D;
        if (zzcio != null) {
            zzcio.mo43697g("onPlayerError", zzasi);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.m1924c().mo42663b(com.google.android.gms.internal.ads.zzbjc.f26838D1)).booleanValue() == false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaye mo43869o0(android.net.Uri r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzaya r9 = new com.google.android.gms.internal.ads.zzaya
            boolean r0 = r10.f28737B
            if (r0 == 0) goto L_0x0023
            java.nio.ByteBuffer r0 = r10.f28736A
            int r0 = r0.limit()
            if (r0 <= 0) goto L_0x0023
            java.nio.ByteBuffer r12 = r10.f28736A
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.f28736A
            r0.get(r12)
            com.google.android.gms.internal.ads.zzcjw r0 = new com.google.android.gms.internal.ads.zzcjw
            r0.<init>(r12)
        L_0x0020:
            r2 = r0
            goto L_0x0094
        L_0x0023:
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26928M1
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26838D1
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r2.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0050
        L_0x0048:
            com.google.android.gms.internal.ads.zzcix r0 = r10.f28754s
            boolean r0 = r0.f28591j
            if (r0 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            com.google.android.gms.internal.ads.zzcix r0 = r10.f28754s
            boolean r2 = r0.f28596o
            if (r2 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.zzcjx r0 = new com.google.android.gms.internal.ads.zzcjx
            r0.<init>(r10, r12, r1)
            goto L_0x006b
        L_0x005c:
            int r0 = r0.f28590i
            if (r0 <= 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzcjy r0 = new com.google.android.gms.internal.ads.zzcjy
            r0.<init>(r10, r12, r1)
            goto L_0x006b
        L_0x0066:
            com.google.android.gms.internal.ads.zzcjz r0 = new com.google.android.gms.internal.ads.zzcjz
            r0.<init>(r10, r12, r1)
        L_0x006b:
            com.google.android.gms.internal.ads.zzcix r12 = r10.f28754s
            boolean r12 = r12.f28591j
            if (r12 == 0) goto L_0x0077
            com.google.android.gms.internal.ads.zzcka r12 = new com.google.android.gms.internal.ads.zzcka
            r12.<init>(r10, r0)
            r0 = r12
        L_0x0077:
            java.nio.ByteBuffer r12 = r10.f28736A
            if (r12 == 0) goto L_0x0020
            int r12 = r12.limit()
            if (r12 <= 0) goto L_0x0020
            java.nio.ByteBuffer r12 = r10.f28736A
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.f28736A
            r1.get(r12)
            com.google.android.gms.internal.ads.zzckb r1 = new com.google.android.gms.internal.ads.zzckb
            r1.<init>(r0, r12)
            r2 = r1
        L_0x0094:
            com.google.android.gms.internal.ads.zzbiu r12 = com.google.android.gms.internal.ads.zzbjc.f27181m
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r12 = r0.mo42663b(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzcke r12 = com.google.android.gms.internal.ads.zzcke.f28733a
            goto L_0x00ab
        L_0x00a9:
            com.google.android.gms.internal.ads.zzckf r12 = com.google.android.gms.internal.ads.zzckf.f28734a
        L_0x00ab:
            r3 = r12
            com.google.android.gms.internal.ads.zzcix r12 = r10.f28754s
            int r4 = r12.f28592k
            com.google.android.gms.internal.ads.zzfpz r5 = com.google.android.gms.ads.internal.util.zzs.f2304i
            r7 = 0
            int r8 = r12.f28588g
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckg.mo43869o0(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.zzaye");
    }

    /* renamed from: p */
    public final void mo41914p(boolean z, int i) {
        zzcio zzcio = this.f28739D;
        if (zzcio != null) {
            zzcio.mo43694b(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final /* synthetic */ zzazm mo43870p0(String str, boolean z) {
        zzckg zzckg = true != z ? null : this;
        zzcix zzcix = this.f28754s;
        return new zzckk(str, zzckg, zzcix.f28585d, zzcix.f28587f, zzcix.f28597p, zzcix.f28598q);
    }

    /* renamed from: q */
    public final void mo41915q(zzayt zzayt, zzazf zzazf) {
    }

    /* renamed from: s */
    public final void mo41916s(zzath zzath, Object obj) {
    }

    /* renamed from: v */
    public final void mo42388v(int i, int i2, int i3, float f) {
        zzcio zzcio = this.f28739D;
        if (zzcio != null) {
            zzcio.mo43693a(i, i2);
        }
    }
}
