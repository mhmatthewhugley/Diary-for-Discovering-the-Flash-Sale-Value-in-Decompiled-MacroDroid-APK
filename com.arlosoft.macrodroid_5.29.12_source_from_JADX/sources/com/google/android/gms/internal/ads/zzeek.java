package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeek extends zzcat {

    /* renamed from: a */
    private final Context f33801a;

    /* renamed from: c */
    private final Executor f33802c;

    /* renamed from: d */
    private final zzfzq f33803d;

    /* renamed from: f */
    private final zzcbn f33804f;

    /* renamed from: g */
    private final zzctt f33805g;

    /* renamed from: o */
    private final ArrayDeque f33806o;

    /* renamed from: p */
    private final zzfjw f33807p;

    /* renamed from: s */
    private final zzcbo f33808s;

    /* renamed from: z */
    private final zzeep f33809z;

    public zzeek(Context context, Executor executor, zzfzq zzfzq, zzcbo zzcbo, zzctt zzctt, zzcbn zzcbn, ArrayDeque arrayDeque, zzeep zzeep, zzfjw zzfjw, byte[] bArr) {
        zzbjc.m43542c(context);
        this.f33801a = context;
        this.f33802c = executor;
        this.f33803d = zzfzq;
        this.f33808s = zzcbo;
        this.f33804f = zzcbn;
        this.f33805g = zzctt;
        this.f33806o = arrayDeque;
        this.f33809z = zzeep;
        this.f33807p = zzfjw;
    }

    @Nullable
    /* renamed from: Pb */
    private final synchronized zzeeh m48659Pb(String str) {
        Iterator it = this.f33806o.iterator();
        while (it.hasNext()) {
            zzeeh zzeeh = (zzeeh) it.next();
            if (zzeeh.f33795d.equals(str)) {
                it.remove();
                return zzeeh;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: Qb */
    private final synchronized zzeeh m48660Qb(String str) {
        Iterator it = this.f33806o.iterator();
        while (it.hasNext()) {
            zzeeh zzeeh = (zzeeh) it.next();
            if (zzeeh.f33794c.equals(str)) {
                it.remove();
                return zzeeh;
            }
        }
        return null;
    }

    /* renamed from: Rb */
    private static zzfzp m48661Rb(zzfzp zzfzp, zzfih zzfih, zzbuk zzbuk, zzfju zzfju, zzfjj zzfjj) {
        zzbua a = zzbuk.mo43000a("AFMA_getAdDictionary", zzbuh.f27784b, zzeeb.f33786a);
        zzfjt.m50321d(zzfzp, zzfjj);
        zzfhm a2 = zzfih.mo45752b(zzfib.BUILD_URL, zzfzp).mo45747f(a).mo45742a();
        zzfjt.m50320c(a2, zzfju, zzfjj);
        return a2;
    }

    /* renamed from: Sb */
    private static zzfzp m48662Sb(zzcbc zzcbc, zzfih zzfih, zzevw zzevw) {
        zzedv zzedv = new zzedv(zzevw);
        return zzfih.mo45752b(zzfib.GMS_SIGNALS, zzfzg.m51414i(zzcbc.f28122a)).mo45747f(zzedv).mo45746e(zzedw.f33770a).mo45742a();
    }

    /* renamed from: Tb */
    private final synchronized void m48663Tb(zzeeh zzeeh) {
        m48665s();
        this.f33806o.addLast(zzeeh);
    }

    /* renamed from: Ub */
    private final void m48664Ub(zzfzp zzfzp, zzcay zzcay) {
        zzfzg.m51423r(zzfzg.m51419n(zzfzp, new zzeee(this), zzchc.f28456a), new zzeeg(this, zzcay), zzchc.f28461f);
    }

    /* renamed from: s */
    private final synchronized void m48665s() {
        int intValue = ((Long) zzbky.f27479c.mo42728e()).intValue();
        while (this.f33806o.size() >= intValue) {
            this.f33806o.removeFirst();
        }
    }

    /* renamed from: H9 */
    public final void mo43263H9(String str, zzcay zzcay) {
        m48664Ub(mo45214Mb(str), zzcay);
    }

    /* renamed from: Jb */
    public final zzfzp mo45211Jb(zzcbc zzcbc, int i) {
        if (!((Boolean) zzbky.f27477a.mo42728e()).booleanValue()) {
            return zzfzg.m51413h(new Exception("Split request is disabled."));
        }
        zzffx zzffx = zzcbc.f28130z;
        if (zzffx == null) {
            return zzfzg.m51413h(new Exception("Pool configuration missing from request."));
        }
        if (zzffx.f35723g == 0 || zzffx.f35724o == 0) {
            return zzfzg.m51413h(new Exception("Caching is disabled."));
        }
        zzbuk b = zzt.m2895h().mo42997b(this.f33801a, zzcgv.m45239l2(), this.f33807p);
        zzevw a = this.f33805g.mo44193a(zzcbc, i);
        zzfih c = a.mo44253c();
        zzfzp Sb = m48662Sb(zzcbc, c, a);
        zzfju d = a.mo44254d();
        zzfjj a2 = zzfji.m50258a(this.f33801a, 9);
        zzfzp Rb = m48661Rb(Sb, c, b, d, a2);
        return c.mo45751a(zzfib.GET_URL_AND_CACHE_KEY, Sb, Rb).mo45739a(new zzeea(this, Rb, Sb, zzcbc, a2)).mo45742a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* renamed from: Kb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfzp mo45212Kb(com.google.android.gms.internal.ads.zzcbc r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzbub r2 = com.google.android.gms.ads.internal.zzt.m2895h()
            android.content.Context r3 = r0.f33801a
            com.google.android.gms.internal.ads.zzcgv r4 = com.google.android.gms.internal.ads.zzcgv.m45239l2()
            com.google.android.gms.internal.ads.zzfjw r5 = r0.f33807p
            com.google.android.gms.internal.ads.zzbuk r2 = r2.mo42997b(r3, r4, r5)
            com.google.android.gms.internal.ads.zzctt r3 = r0.f33805g
            r8 = r18
            com.google.android.gms.internal.ads.zzevw r3 = r3.mo44193a(r1, r8)
            com.google.android.gms.internal.ads.zzbud r4 = com.google.android.gms.internal.ads.zzeej.f33797d
            com.google.android.gms.internal.ads.zzbuc r5 = com.google.android.gms.internal.ads.zzbuh.f27785c
            java.lang.String r6 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.zzbua r10 = r2.mo43000a(r6, r4, r5)
            com.google.android.gms.internal.ads.zzbke r4 = com.google.android.gms.internal.ads.zzbky.f27477a
            java.lang.Object r4 = r4.mo42728e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 != 0) goto L_0x0046
            java.lang.String r4 = r1.f28120A
            if (r4 == 0) goto L_0x0044
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "Request contained a PoolKey but split request is disabled."
            com.google.android.gms.ads.internal.util.zze.m2645k(r4)
        L_0x0044:
            r11 = r5
            goto L_0x0073
        L_0x0046:
            com.google.android.gms.internal.ads.zzbke r4 = com.google.android.gms.internal.ads.zzbky.f27480d
            java.lang.Object r4 = r4.mo42728e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x005c
            java.lang.String r4 = r1.f28129s
            com.google.android.gms.internal.ads.zzeeh r4 = r0.m48660Qb(r4)
        L_0x005a:
            r5 = r4
            goto L_0x006b
        L_0x005c:
            java.lang.String r4 = r1.f28120A
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = r1.f28120A
            com.google.android.gms.internal.ads.zzeeh r4 = r0.m48659Pb(r4)
            goto L_0x005a
        L_0x006b:
            if (r5 != 0) goto L_0x0044
            java.lang.String r4 = "Request contained a PoolKey but no matching parameters were found."
            com.google.android.gms.ads.internal.util.zze.m2645k(r4)
            goto L_0x0044
        L_0x0073:
            if (r11 != 0) goto L_0x007e
            android.content.Context r4 = r0.f33801a
            r5 = 9
            com.google.android.gms.internal.ads.zzfjj r4 = com.google.android.gms.internal.ads.zzfji.m50258a(r4, r5)
            goto L_0x0080
        L_0x007e:
            com.google.android.gms.internal.ads.zzfjj r4 = r11.f33796e
        L_0x0080:
            r12 = r4
            com.google.android.gms.internal.ads.zzfju r13 = r3.mo44254d()
            android.os.Bundle r4 = r1.f28122a
            java.lang.String r5 = "ad_types"
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            r13.mo45825d(r4)
            com.google.android.gms.internal.ads.zzeer r14 = new com.google.android.gms.internal.ads.zzeer
            java.lang.String r4 = r1.f28128p
            r14.<init>(r4, r13, r12)
            android.content.Context r5 = r0.f33801a
            com.google.android.gms.internal.ads.zzcgv r4 = r1.f28123c
            java.lang.String r6 = r4.f28446a
            com.google.android.gms.internal.ads.zzcbo r7 = r0.f33808s
            com.google.android.gms.internal.ads.zzeeo r15 = new com.google.android.gms.internal.ads.zzeeo
            r9 = 0
            r4 = r15
            r8 = r18
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.android.gms.internal.ads.zzfih r4 = r3.mo44253c()
            android.content.Context r5 = r0.f33801a
            r6 = 11
            com.google.android.gms.internal.ads.zzfjj r5 = com.google.android.gms.internal.ads.zzfji.m50258a(r5, r6)
            r6 = 10
            r7 = 1
            r8 = 0
            r9 = 2
            if (r11 != 0) goto L_0x011a
            com.google.android.gms.internal.ads.zzfzp r1 = m48662Sb(r1, r4, r3)
            com.google.android.gms.internal.ads.zzfzp r2 = m48661Rb(r1, r4, r2, r13, r12)
            android.content.Context r3 = r0.f33801a
            com.google.android.gms.internal.ads.zzfjj r3 = com.google.android.gms.internal.ads.zzfji.m50258a(r3, r6)
            com.google.android.gms.internal.ads.zzfib r6 = com.google.android.gms.internal.ads.zzfib.HTTP
            com.google.android.gms.internal.ads.zzfzp[] r11 = new com.google.android.gms.internal.ads.zzfzp[r9]
            r11[r8] = r2
            r11[r7] = r1
            com.google.android.gms.internal.ads.zzfhp r6 = r4.mo45751a(r6, r11)
            com.google.android.gms.internal.ads.zzedy r11 = new com.google.android.gms.internal.ads.zzedy
            r11.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzfhy r6 = r6.mo45739a(r11)
            com.google.android.gms.internal.ads.zzfhy r6 = r6.mo45746e(r14)
            com.google.android.gms.internal.ads.zzfjp r11 = new com.google.android.gms.internal.ads.zzfjp
            r11.<init>(r3)
            com.google.android.gms.internal.ads.zzfhy r6 = r6.mo45746e(r11)
            com.google.android.gms.internal.ads.zzfhy r6 = r6.mo45746e(r15)
            com.google.android.gms.internal.ads.zzfhm r6 = r6.mo45742a()
            com.google.android.gms.internal.ads.zzfjt.m50318a(r6, r13, r3)
            com.google.android.gms.internal.ads.zzfjt.m50321d(r6, r5)
            com.google.android.gms.internal.ads.zzfib r3 = com.google.android.gms.internal.ads.zzfib.PRE_PROCESS
            r11 = 3
            com.google.android.gms.internal.ads.zzfzp[] r11 = new com.google.android.gms.internal.ads.zzfzp[r11]
            r11[r8] = r1
            r11[r7] = r2
            r11[r9] = r6
            com.google.android.gms.internal.ads.zzfhp r3 = r4.mo45751a(r3, r11)
            com.google.android.gms.internal.ads.zzedz r4 = new com.google.android.gms.internal.ads.zzedz
            r4.<init>(r6, r1, r2)
            com.google.android.gms.internal.ads.zzfhy r1 = r3.mo45739a(r4)
            com.google.android.gms.internal.ads.zzfhy r1 = r1.mo45747f(r10)
            com.google.android.gms.internal.ads.zzfhm r1 = r1.mo45742a()
            goto L_0x016f
        L_0x011a:
            com.google.android.gms.internal.ads.zzeeq r1 = new com.google.android.gms.internal.ads.zzeeq
            org.json.JSONObject r2 = r11.f33793b
            com.google.android.gms.internal.ads.zzcbf r3 = r11.f33792a
            r1.<init>(r2, r3)
            android.content.Context r2 = r0.f33801a
            com.google.android.gms.internal.ads.zzfjj r2 = com.google.android.gms.internal.ads.zzfji.m50258a(r2, r6)
            com.google.android.gms.internal.ads.zzfib r3 = com.google.android.gms.internal.ads.zzfib.HTTP
            com.google.android.gms.internal.ads.zzfzp r1 = com.google.android.gms.internal.ads.zzfzg.m51414i(r1)
            com.google.android.gms.internal.ads.zzfhy r1 = r4.mo45752b(r3, r1)
            com.google.android.gms.internal.ads.zzfhy r1 = r1.mo45746e(r14)
            com.google.android.gms.internal.ads.zzfjp r3 = new com.google.android.gms.internal.ads.zzfjp
            r3.<init>(r2)
            com.google.android.gms.internal.ads.zzfhy r1 = r1.mo45746e(r3)
            com.google.android.gms.internal.ads.zzfhy r1 = r1.mo45746e(r15)
            com.google.android.gms.internal.ads.zzfhm r1 = r1.mo45742a()
            com.google.android.gms.internal.ads.zzfjt.m50318a(r1, r13, r2)
            com.google.android.gms.internal.ads.zzfzp r2 = com.google.android.gms.internal.ads.zzfzg.m51414i(r11)
            com.google.android.gms.internal.ads.zzfjt.m50321d(r1, r5)
            com.google.android.gms.internal.ads.zzfib r3 = com.google.android.gms.internal.ads.zzfib.PRE_PROCESS
            com.google.android.gms.internal.ads.zzfzp[] r6 = new com.google.android.gms.internal.ads.zzfzp[r9]
            r6[r8] = r1
            r6[r7] = r2
            com.google.android.gms.internal.ads.zzfhp r3 = r4.mo45751a(r3, r6)
            com.google.android.gms.internal.ads.zzeed r4 = new com.google.android.gms.internal.ads.zzeed
            r4.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzfhy r1 = r3.mo45739a(r4)
            com.google.android.gms.internal.ads.zzfhy r1 = r1.mo45747f(r10)
            com.google.android.gms.internal.ads.zzfhm r1 = r1.mo45742a()
        L_0x016f:
            com.google.android.gms.internal.ads.zzfjt.m50318a(r1, r13, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeek.mo45212Kb(com.google.android.gms.internal.ads.zzcbc, int):com.google.android.gms.internal.ads.zzfzp");
    }

    /* renamed from: Lb */
    public final zzfzp mo45213Lb(zzcbc zzcbc, int i) {
        zzbuk b = zzt.m2895h().mo42997b(this.f33801a, zzcgv.m45239l2(), this.f33807p);
        if (!((Boolean) zzbld.f27494a.mo42728e()).booleanValue()) {
            return zzfzg.m51413h(new Exception("Signal collection disabled."));
        }
        zzevw a = this.f33805g.mo44193a(zzcbc, i);
        zzevh a2 = a.mo44251a();
        zzbua a3 = b.mo43000a("google.afma.request.getSignals", zzbuh.f27784b, zzbuh.f27785c);
        zzfjj a4 = zzfji.m50258a(this.f33801a, 22);
        zzfhm a5 = a.mo44253c().mo45752b(zzfib.GET_SIGNALS, zzfzg.m51414i(zzcbc.f28122a)).mo45746e(new zzfjp(a4)).mo45747f(new zzeec(a2)).mo45743b(zzfib.JS_SIGNALS).mo45747f(a3).mo45742a();
        zzfju d = a.mo44254d();
        d.mo45825d(zzcbc.f28122a.getStringArrayList("ad_types"));
        zzfjt.m50319b(a5, d, a4);
        return a5;
    }

    /* renamed from: Mb */
    public final zzfzp mo45214Mb(String str) {
        zzeeh zzeeh;
        if (!((Boolean) zzbky.f27477a.mo42728e()).booleanValue()) {
            return zzfzg.m51413h(new Exception("Split request is disabled."));
        }
        zzeef zzeef = new zzeef(this);
        if (((Boolean) zzbky.f27480d.mo42728e()).booleanValue()) {
            zzeeh = m48660Qb(str);
        } else {
            zzeeh = m48659Pb(str);
        }
        if (zzeeh == null) {
            return zzfzg.m51413h(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfzg.m51414i(zzeef);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Nb */
    public final /* synthetic */ InputStream mo45215Nb(zzfzp zzfzp, zzfzp zzfzp2, zzcbc zzcbc, zzfjj zzfjj) throws Exception {
        String c = ((zzcbf) zzfzp.get()).mo43279c();
        String str = zzcbc.f28129s;
        m48663Tb(new zzeeh((zzcbf) zzfzp.get(), (JSONObject) zzfzp2.get(), str, c, zzfjj));
        return new ByteArrayInputStream(c.getBytes(zzfsk.f36339c));
    }

    /* renamed from: P8 */
    public final void mo43264P8(zzcbc zzcbc, zzcay zzcay) {
        m48664Ub(mo45213Lb(zzcbc, Binder.getCallingUid()), zzcay);
    }

    /* renamed from: Q6 */
    public final void mo43265Q6(zzcbc zzcbc, zzcay zzcay) {
        m48664Ub(mo45211Jb(zzcbc, Binder.getCallingUid()), zzcay);
    }

    /* renamed from: h8 */
    public final void mo43266h8(zzcbc zzcbc, zzcay zzcay) {
        zzfzp Kb = mo45212Kb(zzcbc, Binder.getCallingUid());
        m48664Ub(Kb, zzcay);
        if (((Boolean) zzbkq.f27449j.mo42728e()).booleanValue()) {
            Kb.mo43580q(new zzedx(this), this.f33803d);
        } else {
            Kb.mo43580q(new zzedx(this), this.f33802c);
        }
    }
}
