package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcmc extends zzcip implements zzfz, zzkr {

    /* renamed from: M */
    public static final /* synthetic */ int f28951M = 0;

    /* renamed from: A */
    private ByteBuffer f28952A;

    /* renamed from: B */
    private boolean f28953B;

    /* renamed from: C */
    private zzcio f28954C;

    /* renamed from: D */
    private int f28955D;

    /* renamed from: E */
    private int f28956E;

    /* renamed from: F */
    private long f28957F;

    /* renamed from: G */
    private final String f28958G;

    /* renamed from: H */
    private final int f28959H;

    /* renamed from: I */
    private final Object f28960I = new Object();

    /* renamed from: J */
    private final ArrayList f28961J;

    /* renamed from: K */
    private volatile zzclp f28962K;

    /* renamed from: L */
    private final Set f28963L = new HashSet();

    /* renamed from: d */
    private final Context f28964d;

    /* renamed from: f */
    private final zzcln f28965f;

    /* renamed from: g */
    private final zzvr f28966g;

    /* renamed from: o */
    private final zzcix f28967o;

    /* renamed from: p */
    private final WeakReference f28968p;

    /* renamed from: s */
    private final zzto f28969s;

    /* renamed from: z */
    private zzkf f28970z;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f5, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.m1924c().mo42663b(com.google.android.gms.internal.ads.zzbjc.f26838D1)).booleanValue() == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f9, code lost:
        if (r7.f28591j == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fb, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fe, code lost:
        if (r7.f28596o == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0100, code lost:
        r8 = new com.google.android.gms.internal.ads.zzclt(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0108, code lost:
        if (r7.f28590i <= 0) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010a, code lost:
        r8 = new com.google.android.gms.internal.ads.zzclu(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0110, code lost:
        r8 = new com.google.android.gms.internal.ads.zzclv(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        if (r7.f28591j == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0119, code lost:
        r7 = new com.google.android.gms.internal.ads.zzclw(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0120, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0121, code lost:
        r6 = r5.f28952A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        if (r6 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0129, code lost:
        if (r6.limit() <= 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012b, code lost:
        r6 = new byte[r5.f28952A.limit()];
        r5.f28952A.get(r6);
        r7 = new com.google.android.gms.internal.ads.zzclx(r7, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcmc(android.content.Context r6, com.google.android.gms.internal.ads.zzcix r7, com.google.android.gms.internal.ads.zzciy r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.f28960I = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.f28963L = r0
            r5.f28964d = r6
            r5.f28967o = r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r5.f28968p = r0
            com.google.android.gms.internal.ads.zzcln r0 = new com.google.android.gms.internal.ads.zzcln
            r0.<init>()
            r5.f28965f = r0
            com.google.android.gms.internal.ads.zzvr r1 = new com.google.android.gms.internal.ads.zzvr
            r1.<init>(r6)
            r5.f28966g = r1
            boolean r2 = com.google.android.gms.ads.internal.util.zze.m2647m()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "OfficialSimpleExoPlayerAdapter initialize "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.zze.m2645k(r2)
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.zzcip.f28540a
            r2.incrementAndGet()
            com.google.android.gms.internal.ads.zzke r2 = new com.google.android.gms.internal.ads.zzke
            com.google.android.gms.internal.ads.zzcly r3 = new com.google.android.gms.internal.ads.zzcly
            r3.<init>(r5)
            r4 = 0
            r2.<init>(r6, r3, r4)
            r2.mo47781b(r1)
            r2.mo47780a(r0)
            com.google.android.gms.internal.ads.zzkf r0 = r2.mo47782c()
            r5.f28970z = r0
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26908K1
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0070
            com.google.android.gms.internal.ads.zzkf r0 = r5.f28970z
            com.google.android.gms.internal.ads.zzje.m53876a(r0)
        L_0x0070:
            com.google.android.gms.internal.ads.zzkf r0 = r5.f28970z
            r0.mo47785C(r5)
            r0 = 0
            r5.f28955D = r0
            r1 = 0
            r5.f28957F = r1
            r5.f28956E = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f28961J = r1
            r5.f28962K = r4
            if (r8 == 0) goto L_0x0094
            java.lang.String r1 = r8.mo43762r()
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r8.mo43762r()
            goto L_0x0096
        L_0x0094:
            java.lang.String r1 = ""
        L_0x0096:
            r5.f28958G = r1
            if (r8 == 0) goto L_0x009f
            int r1 = r8.mo43750e()
            goto L_0x00a0
        L_0x009f:
            r1 = 0
        L_0x00a0:
            r5.f28959H = r1
            com.google.android.gms.internal.ads.zzto r1 = new com.google.android.gms.internal.ads.zzto
            com.google.android.gms.ads.internal.util.zzs r2 = com.google.android.gms.ads.internal.zzt.m2905r()
            com.google.android.gms.internal.ads.zzcgv r8 = r8.mo43759m()
            java.lang.String r8 = r8.f28446a
            java.lang.String r6 = r2.mo20412z(r6, r8)
            boolean r8 = r5.f28953B
            if (r8 == 0) goto L_0x00d2
            java.nio.ByteBuffer r8 = r5.f28952A
            int r8 = r8.limit()
            if (r8 <= 0) goto L_0x00d2
            java.nio.ByteBuffer r6 = r5.f28952A
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r7 = r5.f28952A
            r7.get(r6)
            com.google.android.gms.internal.ads.zzclr r7 = new com.google.android.gms.internal.ads.zzclr
            r7.<init>(r6)
            goto L_0x013e
        L_0x00d2:
            com.google.android.gms.internal.ads.zzbiu r8 = com.google.android.gms.internal.ads.zzbjc.f26928M1
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r8 = r2.mo42663b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 1
            if (r8 == 0) goto L_0x00f7
            com.google.android.gms.internal.ads.zzbiu r8 = com.google.android.gms.internal.ads.zzbjc.f26838D1
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r8 = r3.mo42663b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00fb
        L_0x00f7:
            boolean r8 = r7.f28591j
            if (r8 != 0) goto L_0x00fc
        L_0x00fb:
            r0 = 1
        L_0x00fc:
            boolean r8 = r7.f28596o
            if (r8 == 0) goto L_0x0106
            com.google.android.gms.internal.ads.zzclt r8 = new com.google.android.gms.internal.ads.zzclt
            r8.<init>(r5, r6, r0)
            goto L_0x0115
        L_0x0106:
            int r8 = r7.f28590i
            if (r8 <= 0) goto L_0x0110
            com.google.android.gms.internal.ads.zzclu r8 = new com.google.android.gms.internal.ads.zzclu
            r8.<init>(r5, r6, r0)
            goto L_0x0115
        L_0x0110:
            com.google.android.gms.internal.ads.zzclv r8 = new com.google.android.gms.internal.ads.zzclv
            r8.<init>(r5, r6, r0)
        L_0x0115:
            boolean r6 = r7.f28591j
            if (r6 == 0) goto L_0x0120
            com.google.android.gms.internal.ads.zzclw r6 = new com.google.android.gms.internal.ads.zzclw
            r6.<init>(r5, r8)
            r7 = r6
            goto L_0x0121
        L_0x0120:
            r7 = r8
        L_0x0121:
            java.nio.ByteBuffer r6 = r5.f28952A
            if (r6 == 0) goto L_0x013e
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x013e
            java.nio.ByteBuffer r6 = r5.f28952A
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = r5.f28952A
            r8.get(r6)
            com.google.android.gms.internal.ads.zzclx r8 = new com.google.android.gms.internal.ads.zzclx
            r8.<init>(r7, r6)
            r7 = r8
        L_0x013e:
            com.google.android.gms.internal.ads.zzbiu r6 = com.google.android.gms.internal.ads.zzbjc.f27181m
            com.google.android.gms.internal.ads.zzbja r8 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r6 = r8.mo42663b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0153
            com.google.android.gms.internal.ads.zzcma r6 = com.google.android.gms.internal.ads.zzcma.f28949b
            goto L_0x0155
        L_0x0153:
            com.google.android.gms.internal.ads.zzcmb r6 = com.google.android.gms.internal.ads.zzcmb.f28950b
        L_0x0155:
            com.google.android.gms.internal.ads.zztn r8 = new com.google.android.gms.internal.ads.zztn
            r8.<init>(r6)
            r1.<init>(r7, r8, r4)
            r5.f28969s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmc.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcix, com.google.android.gms.internal.ads.zzciy):void");
    }

    /* renamed from: o0 */
    private final boolean m45754o0() {
        return this.f28962K != null && this.f28962K.mo43951y();
    }

    /* renamed from: B */
    public final void mo43960B(zzex zzex, zzfc zzfc, boolean z) {
    }

    /* renamed from: E */
    public final void mo43961E(zzex zzex, zzfc zzfc, boolean z) {
    }

    /* renamed from: F */
    public final long mo43699F() {
        if (!m45754o0()) {
            return (long) this.f28955D;
        }
        return 0;
    }

    /* renamed from: G */
    public final long mo43700G() {
        if (m45754o0()) {
            return this.f28962K.mo43946s();
        }
        synchronized (this.f28960I) {
            while (!this.f28961J.isEmpty()) {
                long j = this.f28957F;
                Map b = ((zzfu) this.f28961J.remove(0)).mo43925b();
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
                this.f28957F = j + j2;
            }
        }
        return this.f28957F;
    }

    /* renamed from: H */
    public final void mo43701H(Uri[] uriArr, String str) {
        mo43702I(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: I */
    public final void mo43702I(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsk zzsk;
        if (this.f28970z != null) {
            this.f28952A = byteBuffer;
            this.f28953B = z;
            int length = uriArr.length;
            if (length == 1) {
                zzsk = mo43974l0(uriArr[0]);
            } else {
                zzsk[] zzskArr = new zzsk[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzskArr[i] = mo43974l0(uriArr[i]);
                }
                zzsk = new zzta(false, false, zzskArr);
            }
            this.f28970z.mo47789r(zzsk);
            this.f28970z.mo47786D();
            zzcip.f28541c.incrementAndGet();
        }
    }

    /* renamed from: J */
    public final void mo43703J() {
        zzkf zzkf = this.f28970z;
        if (zzkf != null) {
            zzkf.mo47788o(this);
            this.f28970z.mo47787E();
            this.f28970z = null;
            zzcip.f28541c.decrementAndGet();
        }
    }

    /* renamed from: K */
    public final void mo43704K(long j) {
        zzkf zzkf = this.f28970z;
        zzkf.mo43524m(zzkf.mo43514c(), j);
    }

    /* renamed from: L */
    public final void mo43705L(int i) {
        this.f28965f.mo43938i(i);
    }

    /* renamed from: M */
    public final void mo43706M(int i) {
        this.f28965f.mo43939j(i);
    }

    /* renamed from: N */
    public final void mo43707N(zzcio zzcio) {
        this.f28954C = zzcio;
    }

    /* renamed from: P */
    public final void mo43708P(int i) {
        this.f28965f.mo43940k(i);
    }

    /* renamed from: Q */
    public final void mo43709Q(int i) {
        this.f28965f.mo43941l(i);
    }

    /* renamed from: R */
    public final void mo43710R(boolean z) {
        this.f28970z.mo47790t(z);
    }

    /* renamed from: S */
    public final void mo43711S(boolean z) {
        if (this.f28970z != null) {
            int i = 0;
            while (true) {
                this.f28970z.mo47795y();
                if (i < 2) {
                    zzvr zzvr = this.f28966g;
                    zzvd c = zzvr.mo48313k().mo48290c();
                    c.mo48289o(i, !z);
                    zzvr.mo48314p(c);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo43712T(int i) {
        for (WeakReference weakReference : this.f28963L) {
            zzclm zzclm = (zzclm) weakReference.get();
            if (zzclm != null) {
                zzclm.mo43929t(i);
            }
        }
    }

    /* renamed from: U */
    public final void mo43713U(Surface surface, boolean z) {
        zzkf zzkf = this.f28970z;
        if (zzkf != null) {
            zzkf.mo47792v(surface);
        }
    }

    /* renamed from: V */
    public final void mo43714V(float f, boolean z) {
        zzkf zzkf = this.f28970z;
        if (zzkf != null) {
            zzkf.mo47793w(f);
        }
    }

    /* renamed from: W */
    public final void mo43715W() {
        this.f28970z.mo47794x();
    }

    /* renamed from: X */
    public final boolean mo43716X() {
        return this.f28970z != null;
    }

    /* renamed from: Y */
    public final int mo43717Y() {
        return this.f28956E;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo43962a(zzcg zzcg, zzkq zzkq) {
    }

    /* renamed from: a0 */
    public final int mo43718a0() {
        return this.f28970z.mo43516e();
    }

    /* renamed from: c0 */
    public final long mo43719c0() {
        return this.f28970z.mo47796z();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43963d(zzkp zzkp, zzse zzse) {
    }

    /* renamed from: d0 */
    public final long mo43720d0() {
        return (long) this.f28955D;
    }

    /* renamed from: e0 */
    public final long mo43721e0() {
        if (m45754o0() && this.f28962K.mo43950w()) {
            return Math.min((long) this.f28955D, this.f28962K.mo43945r());
        }
        return 0;
    }

    /* renamed from: f0 */
    public final long mo43722f0() {
        return this.f28970z.mo43521j();
    }

    public final void finalize() {
        zzcip.f28540a.decrementAndGet();
        if (zze.m2647m()) {
            zze.m2645k("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* renamed from: g */
    public final void mo43965g(zzkp zzkp, zzaf zzaf, @Nullable zzgt zzgt) {
        zzciy zzciy = (zzciy) this.f28968p.get();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && zzciy != null && zzaf != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzaf.f24212k);
            hashMap.put("audioSampleMime", zzaf.f24213l);
            hashMap.put("audioCodec", zzaf.f24210i);
            zzciy.mo42954y("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: g0 */
    public final long mo43723g0() {
        return this.f28970z.mo47783A();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ zzex mo43966h0(String str, boolean z) {
        zzcmc zzcmc = true != z ? null : this;
        zzcix zzcix = this.f28967o;
        return new zzcmf(str, zzcmc, zzcix.f28585d, zzcix.f28587f, zzcix.f28597p, zzcix.f28598q);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo43967i(zzkp zzkp, int i, long j, long j2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final /* synthetic */ zzex mo43968i0(String str, boolean z) {
        zzcmc zzcmc = true != z ? null : this;
        zzcix zzcix = this.f28967o;
        zzclm zzclm = new zzclm(str, zzcmc, zzcix.f28585d, zzcix.f28587f, zzcix.f28590i);
        this.f28963L.add(new WeakReference(zzclm));
        return zzclm;
    }

    /* renamed from: j */
    public final void mo43969j(zzex zzex, zzfc zzfc, boolean z, int i) {
        this.f28955D += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final /* synthetic */ zzex mo43970j0(String str, boolean z) {
        zzff zzff = new zzff();
        zzff.mo45640e(str);
        zzff.mo45639d(true != z ? null : this);
        zzff.mo45637b(this.f28967o.f28585d);
        zzff.mo45638c(this.f28967o.f28587f);
        zzff.mo45636a(true);
        return zzff.zza();
    }

    /* renamed from: k */
    public final /* synthetic */ void mo43971k(zzkp zzkp, zzcf zzcf, zzcf zzcf2, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final /* synthetic */ zzex mo43972k0(zzew zzew) {
        return new zzclp(this.f28964d, zzew.zza(), this.f28958G, this.f28959H, this, new zzcls(this), (byte[]) null);
    }

    /* renamed from: l */
    public final void mo43973l(zzkp zzkp, zzaf zzaf, @Nullable zzgt zzgt) {
        zzciy zzciy = (zzciy) this.f28968p.get();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && zzciy != null && zzaf != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzaf.f24220s));
            hashMap.put("bitRate", String.valueOf(zzaf.f24209h));
            int i = zzaf.f24218q;
            int i2 = zzaf.f24219r;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", zzaf.f24212k);
            hashMap.put("videoSampleMime", zzaf.f24213l);
            hashMap.put("videoCodec", zzaf.f24210i);
            zzciy.mo42954y("onMetadataEvent", hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: l0 */
    public final zzsk mo43974l0(Uri uri) {
        zzaj zzaj = new zzaj();
        zzaj.mo41524b(uri);
        zzbg c = zzaj.mo41525c();
        zzto zzto = this.f28969s;
        zzto.mo48215a(this.f28967o.f28588g);
        return zzto.mo48216b(c);
    }

    /* renamed from: m */
    public final void mo43975m(zzkp zzkp, Object obj, long j) {
        zzcio zzcio = this.f28954C;
        if (zzcio != null) {
            zzcio.mo43698w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final /* synthetic */ void mo43976m0(boolean z, long j) {
        zzcio zzcio = this.f28954C;
        if (zzcio != null) {
            zzcio.mo43696d(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final /* synthetic */ zzka[] mo43977n0(Handler handler, zzyd zzyd, zzns zzns, zzuj zzuj, zzri zzri) {
        Context context = this.f28964d;
        zzqs zzqs = zzqs.f38333a;
        zznd zznd = zznd.f37939c;
        zzng[] zzngArr = new zzng[0];
        zzoi zzoi = new zzoi();
        if (zznd == null) {
            Objects.requireNonNull(zznd, "Both parameters are null");
        }
        zzoi.mo47964b(zznd);
        zzoi.mo47965c(zzngArr);
        zzou d = zzoi.mo47966d();
        zzqk zzqk = zzqk.f38256a;
        return new zzka[]{new zzpa(context, zzqk, zzqs, false, handler, zzns, d), new zzxg(this.f28964d, zzqk, zzqs, 0, false, handler, zzyd, -1, 30.0f)};
    }

    /* renamed from: r */
    public final void mo43978r(zzkp zzkp, zzda zzda) {
        zzcio zzcio = this.f28954C;
        if (zzcio != null) {
            zzcio.mo43693a(zzda.f31941a, zzda.f31942b);
        }
    }

    /* renamed from: t */
    public final /* synthetic */ void mo43979t(zzkp zzkp, zzgs zzgs) {
    }

    /* renamed from: u */
    public final void mo43980u(zzkp zzkp, zzbw zzbw) {
        zzcio zzcio = this.f28954C;
        if (zzcio != null) {
            zzcio.mo43697g("onPlayerError", zzbw);
        }
    }

    /* renamed from: w */
    public final void mo43981w(zzkp zzkp, int i, long j) {
        this.f28956E += i;
    }

    /* renamed from: x */
    public final void mo43982x(zzkp zzkp, zzrz zzrz, zzse zzse, IOException iOException, boolean z) {
        zzcio zzcio = this.f28954C;
        if (zzcio == null) {
            return;
        }
        if (this.f28967o.f28593l) {
            zzcio.mo43695c("onLoadException", iOException);
        } else {
            zzcio.mo43697g("onLoadError", iOException);
        }
    }

    /* renamed from: y */
    public final void mo43983y(zzex zzex, zzfc zzfc, boolean z) {
        if (zzex instanceof zzfu) {
            synchronized (this.f28960I) {
                this.f28961J.add((zzfu) zzex);
            }
        } else if (zzex instanceof zzclp) {
            this.f28962K = (zzclp) zzex;
            zzciy zzciy = (zzciy) this.f28968p.get();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && zzciy != null && this.f28962K.mo43948u()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f28962K.mo43950w()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f28962K.mo43949v()));
                zzs.f2304i.post(new zzclz(zzciy, hashMap));
            }
        }
    }

    /* renamed from: z */
    public final void mo43984z(zzkp zzkp, int i) {
        zzcio zzcio = this.f28954C;
        if (zzcio != null) {
            zzcio.mo43694b(i);
        }
    }
}
