package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzkt implements zzgm {

    /* renamed from: F */
    private static volatile zzkt f47248F;

    /* renamed from: A */
    private final Map f47249A;

    /* renamed from: B */
    private final Map f47250B;

    /* renamed from: C */
    private zzie f47251C;

    /* renamed from: D */
    private String f47252D;

    /* renamed from: E */
    private final zzla f47253E = new zzko(this);

    /* renamed from: a */
    private final zzfi f47254a;

    /* renamed from: b */
    private final zzen f47255b;

    /* renamed from: c */
    private zzam f47256c;

    /* renamed from: d */
    private zzep f47257d;

    /* renamed from: e */
    private zzkf f47258e;

    /* renamed from: f */
    private zzaa f47259f;

    /* renamed from: g */
    private final zzkv f47260g;

    /* renamed from: h */
    private zzic f47261h;

    /* renamed from: i */
    private zzjo f47262i;

    /* renamed from: j */
    private final zzki f47263j;

    /* renamed from: k */
    private zzez f47264k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final zzfr f47265l;

    /* renamed from: m */
    private boolean f47266m = false;

    /* renamed from: n */
    private boolean f47267n;
    @VisibleForTesting

    /* renamed from: o */
    long f47268o;

    /* renamed from: p */
    private List f47269p;

    /* renamed from: q */
    private int f47270q;

    /* renamed from: r */
    private int f47271r;

    /* renamed from: s */
    private boolean f47272s;

    /* renamed from: t */
    private boolean f47273t;

    /* renamed from: u */
    private boolean f47274u;

    /* renamed from: v */
    private FileLock f47275v;

    /* renamed from: w */
    private FileChannel f47276w;

    /* renamed from: x */
    private List f47277x;

    /* renamed from: y */
    private List f47278y;

    /* renamed from: z */
    private long f47279z;

    zzkt(zzku zzku, zzfr zzfr) {
        Preconditions.m4488k(zzku);
        this.f47265l = zzfr.m65677H(zzku.f47280a, (zzcl) null, (Long) null);
        this.f47279z = -1;
        this.f47263j = new zzki(this);
        zzkv zzkv = new zzkv(this);
        zzkv.mo55504g();
        this.f47260g = zzkv;
        zzen zzen = new zzen(this);
        zzen.mo55504g();
        this.f47255b = zzen;
        zzfi zzfi = new zzfi(this);
        zzfi.mo55504g();
        this.f47254a = zzfi;
        this.f47249A = new HashMap();
        this.f47250B = new HashMap();
        mo55185B().mo55181x(new zzkj(this, zzku));
    }

    @VisibleForTesting
    /* renamed from: G */
    static final void m66021G(zzfs zzfs, int i, String str) {
        List L = zzfs.mo51011L();
        int i2 = 0;
        while (i2 < L.size()) {
            if (!"_err".equals(((zzfx) L.get(i2)).mo51046I())) {
                i2++;
            } else {
                return;
            }
        }
        zzfw G = zzfx.m59896G();
        G.mo51034D("_err");
        G.mo51033C(Long.valueOf((long) i).longValue());
        zzfw G2 = zzfx.m59896G();
        G2.mo51034D("_ev");
        G2.mo51035E(str);
        zzfs.mo51018z((zzfx) G.mo51441o());
        zzfs.mo51018z((zzfx) G2.mo51441o());
    }

    @VisibleForTesting
    /* renamed from: H */
    static final void m66022H(zzfs zzfs, @NonNull String str) {
        List L = zzfs.mo51011L();
        for (int i = 0; i < L.size(); i++) {
            if (str.equals(((zzfx) L.get(i)).mo51046I())) {
                zzfs.mo51003B(i);
                return;
            }
        }
    }

    @WorkerThread
    /* renamed from: I */
    private final zzq m66023I(String str) {
        String str2 = str;
        zzam zzam = this.f47256c;
        m66032R(zzam);
        zzh R = zzam.mo54967R(str2);
        if (R == null || TextUtils.isEmpty(R.mo55293g0())) {
            mo55221z().mo55097o().mo55092b("No app data available; dropping", str2);
            return null;
        }
        Boolean J = m66024J(R);
        if (J == null || J.booleanValue()) {
            String i0 = R.mo55297i0();
            String g0 = R.mo55293g0();
            long L = R.mo55265L();
            String f0 = R.mo55291f0();
            long W = R.mo55276W();
            long T = R.mo55273T();
            boolean J2 = R.mo55263J();
            String h0 = R.mo55295h0();
            R.mo55254A();
            zzh zzh = R;
            return new zzq(str, i0, g0, L, f0, W, T, (String) null, J2, false, h0, 0, 0, 0, zzh.mo55262I(), false, zzh.mo55283b0(), zzh.mo55281a0(), zzh.mo55274U(), zzh.mo55284c(), (String) null, mo55518V(str).mo54948h(), "", (String) null);
        }
        mo55221z().mo55098p().mo55092b("App version does not match; dropping. appId", zzeh.m65566x(str));
        return null;
    }

    @WorkerThread
    /* renamed from: J */
    private final Boolean m66024J(zzh zzh) {
        try {
            if (zzh.mo55265L() != -2147483648L) {
                if (zzh.mo55265L() == ((long) Wrappers.m4929a(this.f47265l.mo55202c()).mo21963f(zzh.mo55287d0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.m4929a(this.f47265l.mo55202c()).mo21963f(zzh.mo55287d0(), 0).versionName;
                String g0 = zzh.mo55293g0();
                if (g0 != null && g0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    /* renamed from: K */
    private final void m66025K() {
        mo55185B().mo55073e();
        if (this.f47272s || this.f47273t || this.f47274u) {
            mo55221z().mo55102t().mo55094d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f47272s), Boolean.valueOf(this.f47273t), Boolean.valueOf(this.f47274u));
            return;
        }
        mo55221z().mo55102t().mo55091a("Stopping uploading service(s)");
        List<Runnable> list = this.f47269p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) Preconditions.m4488k(this.f47269p)).clear();
        }
    }

    @VisibleForTesting
    /* renamed from: L */
    private final void m66026L(zzgc zzgc, long j, boolean z) {
        zzky zzky;
        String str = true != z ? "_lte" : "_se";
        zzam zzam = this.f47256c;
        m66032R(zzam);
        zzky X = zzam.mo54972X(zzgc.mo51126s0(), str);
        if (X == null || X.f47292e == null) {
            zzky = new zzky(zzgc.mo51126s0(), "auto", str, mo55201a().mo21950a(), Long.valueOf(j));
        } else {
            zzky = new zzky(zzgc.mo51126s0(), "auto", str, mo55201a().mo21950a(), Long.valueOf(((Long) X.f47292e).longValue() + j));
        }
        zzgl E = zzgm.m60197E();
        E.mo51232z(str);
        E.mo51225A(mo55201a().mo21950a());
        E.mo51231y(((Long) zzky.f47292e).longValue());
        zzgm zzgm = (zzgm) E.mo51441o();
        int u = zzkv.m66100u(zzgc, str);
        if (u >= 0) {
            zzgc.mo51123o0(u, zzgm);
        } else {
            zzgc.mo51086L0(zzgm);
        }
        if (j > 0) {
            zzam zzam2 = this.f47256c;
            m66032R(zzam2);
            zzam2.mo54994v(zzky);
            mo55221z().mo55102t().mo55093c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzky.f47292e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0238  */
    @androidx.annotation.WorkerThread
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m66027M() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.zzfo r1 = r20.mo55185B()
            r1.mo55073e()
            r20.mo55526d()
            long r1 = r0.f47268o
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.common.util.Clock r5 = r20.mo55201a()
            long r5 = r5.mo21952c()
            long r7 = r0.f47268o
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.zzeh r3 = r20.mo55221z()
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55102t()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.mo55092b(r2, r1)
            com.google.android.gms.measurement.internal.zzep r1 = r20.mo55522Z()
            r1.mo55114c()
            com.google.android.gms.measurement.internal.zzkf r1 = r0.f47258e
            m66032R(r1)
            r1.mo55501k()
            return
        L_0x004c:
            r0.f47268o = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.zzfr r1 = r0.f47265l
            boolean r1 = r1.mo55215p()
            if (r1 == 0) goto L_0x0255
            boolean r1 = r20.m66029O()
            if (r1 != 0) goto L_0x005e
            goto L_0x0255
        L_0x005e:
            com.google.android.gms.common.util.Clock r1 = r20.mo55201a()
            long r1 = r1.mo21950a()
            r20.mo55517U()
            com.google.android.gms.measurement.internal.zzdt r5 = com.google.android.gms.measurement.internal.zzdu.f46571B
            r6 = 0
            java.lang.Object r5 = r5.mo55037a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzam r5 = r0.f47256c
            m66032R(r5)
            boolean r5 = r5.mo54990r()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.zzam r5 = r0.f47256c
            m66032R(r5)
            boolean r5 = r5.mo54989q()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.zzag r5 = r20.mo55517U()
            java.lang.String r5 = r5.mo54936s()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.mo55517U()
            com.google.android.gms.measurement.internal.zzdt r5 = com.google.android.gms.measurement.internal.zzdu.f46640w
            java.lang.Object r5 = r5.mo55037a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.mo55517U()
            com.google.android.gms.measurement.internal.zzdt r5 = com.google.android.gms.measurement.internal.zzdu.f46638v
            java.lang.Object r5 = r5.mo55037a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.mo55517U()
            com.google.android.gms.measurement.internal.zzdt r5 = com.google.android.gms.measurement.internal.zzdu.f46636u
            java.lang.Object r5 = r5.mo55037a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.zzjo r5 = r0.f47262i
            com.google.android.gms.measurement.internal.zzes r5 = r5.f47183g
            long r13 = r5.mo55120a()
            com.google.android.gms.measurement.internal.zzjo r5 = r0.f47262i
            com.google.android.gms.measurement.internal.zzes r5 = r5.f47184h
            long r15 = r5.mo55120a()
            com.google.android.gms.measurement.internal.zzam r5 = r0.f47256c
            m66032R(r5)
            r17 = r10
            long r9 = r5.mo54962M()
            com.google.android.gms.measurement.internal.zzam r5 = r0.f47256c
            m66032R(r5)
            r18 = r7
            long r6 = r5.mo54963N()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018f
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.zzkv r13 = r0.f47260g
            m66032R(r13)
            boolean r13 = r13.mo55562M(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018f
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018f
            r1 = 0
        L_0x0152:
            r20.mo55517U()
            r2 = 20
            com.google.android.gms.measurement.internal.zzdt r5 = com.google.android.gms.measurement.internal.zzdu.f46573D
            r6 = 0
            java.lang.Object r5 = r5.mo55037a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x0114
            r20.mo55517U()
            com.google.android.gms.measurement.internal.zzdt r2 = com.google.android.gms.measurement.internal.zzdu.f46572C
            java.lang.Object r2 = r2.mo55037a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018f
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018f:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.zzen r1 = r0.f47255b
            m66032R(r1)
            boolean r1 = r1.mo55111k()
            if (r1 == 0) goto L_0x021b
            com.google.android.gms.measurement.internal.zzjo r1 = r0.f47262i
            com.google.android.gms.measurement.internal.zzes r1 = r1.f47182f
            long r1 = r1.mo55120a()
            r20.mo55517U()
            com.google.android.gms.measurement.internal.zzdt r5 = com.google.android.gms.measurement.internal.zzdu.f46632s
            r6 = 0
            java.lang.Object r5 = r5.mo55037a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzkv r9 = r0.f47260g
            m66032R(r9)
            boolean r9 = r9.mo55562M(r1, r5)
            if (r9 != 0) goto L_0x01ca
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01ca:
            com.google.android.gms.measurement.internal.zzep r1 = r20.mo55522Z()
            r1.mo55114c()
            com.google.android.gms.common.util.Clock r1 = r20.mo55201a()
            long r1 = r1.mo21950a()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0201
            r20.mo55517U()
            com.google.android.gms.measurement.internal.zzdt r1 = com.google.android.gms.measurement.internal.zzdu.f46642x
            r2 = 0
            java.lang.Object r1 = r1.mo55037a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzjo r1 = r0.f47262i
            com.google.android.gms.measurement.internal.zzes r1 = r1.f47183g
            com.google.android.gms.common.util.Clock r2 = r20.mo55201a()
            long r2 = r2.mo21950a()
            r1.mo55121b(r2)
        L_0x0201:
            com.google.android.gms.measurement.internal.zzeh r1 = r20.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55102t()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo55092b(r3, r2)
            com.google.android.gms.measurement.internal.zzkf r1 = r0.f47258e
            m66032R(r1)
            r1.mo55502l(r7)
            return
        L_0x021b:
            com.google.android.gms.measurement.internal.zzeh r1 = r20.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55102t()
            java.lang.String r2 = "No network"
            r1.mo55091a(r2)
            com.google.android.gms.measurement.internal.zzep r1 = r20.mo55522Z()
            r1.mo55113b()
            com.google.android.gms.measurement.internal.zzkf r1 = r0.f47258e
            m66032R(r1)
            r1.mo55501k()
            return
        L_0x0238:
            com.google.android.gms.measurement.internal.zzeh r1 = r20.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55102t()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo55091a(r2)
            com.google.android.gms.measurement.internal.zzep r1 = r20.mo55522Z()
            r1.mo55114c()
            com.google.android.gms.measurement.internal.zzkf r1 = r0.f47258e
            m66032R(r1)
            r1.mo55501k()
            return
        L_0x0255:
            com.google.android.gms.measurement.internal.zzeh r1 = r20.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55102t()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo55091a(r2)
            com.google.android.gms.measurement.internal.zzep r1 = r20.mo55522Z()
            r1.mo55114c()
            com.google.android.gms.measurement.internal.zzkf r1 = r0.f47258e
            m66032R(r1)
            r1.mo55501k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkt.m66027M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b7e, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.zzag.m65357f() + r8)) goto L_0x0b80;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a7 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x046b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04c5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x081f A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0868 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x088b A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0902 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0904 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x090c A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0938 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0b6e A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0bf5 A[Catch:{ NumberFormatException -> 0x07e4, all -> 0x0d17 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0c11 A[Catch:{ SQLiteException -> 0x0c29 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e4=Splitter:B:69:0x01e4, B:420:0x0d05=Splitter:B:420:0x0d05} */
    @androidx.annotation.WorkerThread
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m66028N(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            com.google.android.gms.measurement.internal.zzam r4 = r1.f47256c
            m66032R(r4)
            r4.mo54979e0()
            com.google.android.gms.measurement.internal.zzkq r4 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x0d17 }
            r12 = 0
            r4.<init>(r1, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzam r5 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            r6 = 0
            long r9 = r1.f47279z     // Catch:{ all -> 0x0d17 }
            r7 = r43
            r11 = r4
            r5.mo54959G(r6, r7, r9, r11)     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r4.f47243c     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0d05
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x002e
            goto L_0x0d05
        L_0x002e:
            com.google.android.gms.internal.measurement.zzgd r5 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkb r5 = r5.mo51460y()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgc r5 = (com.google.android.gms.internal.measurement.zzgc) r5     // Catch:{ all -> 0x0d17 }
            r5.mo51095Q0()     // Catch:{ all -> 0x0d17 }
            r10 = r12
            r13 = r10
            r8 = 0
            r9 = 0
            r11 = -1
            r14 = -1
            r15 = 0
        L_0x0040:
            java.util.List r12 = r4.f47243c     // Catch:{ all -> 0x0d17 }
            int r12 = r12.size()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r15
            java.lang.String r15 = "_e"
            r17 = r2
            r18 = r3
            if (r8 >= r12) goto L_0x0543
            java.util.List r3 = r4.f47243c     // Catch:{ all -> 0x0d17 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r3 = (com.google.android.gms.internal.measurement.zzft) r3     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkb r3 = r3.mo51460y()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r3 = (com.google.android.gms.internal.measurement.zzfs) r3     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfi r12 = r1.f47254a     // Catch:{ all -> 0x0d17 }
            m66032R(r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r2 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo51174T1()     // Catch:{ all -> 0x0d17 }
            r20 = r9
            java.lang.String r9 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.mo55153F(r2, r9)     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "_err"
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzeh r2 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55103u()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzgd r7 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeh.m65566x(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfr r12 = r1.f47265l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzec r12 = r12.mo55187D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r15 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo55087d(r15)     // Catch:{ all -> 0x0d17 }
            r2.mo55093c(r6, r7, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfi r2 = r1.f47254a     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r6 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo51174T1()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo55151D(r6)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.zzfi r2 = r1.f47254a     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r6 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo51174T1()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo55154G(r6)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00e8
        L_0x00c3:
            java.lang.String r2 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.zzlb r21 = r41.mo55533h0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzla r2 = r1.f47253E     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r6 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r23 = r6.mo51174T1()     // Catch:{ all -> 0x0d17 }
            r24 = 11
            java.lang.String r25 = "_ev"
            java.lang.String r26 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            r27 = 0
            r22 = r2
            r21.mo55573A(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0d17 }
        L_0x00e8:
            r7 = r8
            r23 = r10
            r15 = r16
            r9 = r20
            r10 = r5
            r5 = -1
            goto L_0x0538
        L_0x00f3:
            java.lang.String r2 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = com.google.android.gms.measurement.internal.zzgo.m65768a(r18)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x016d
            r2 = r18
            r3.mo51004C(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r12 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r12 = r12.mo55102t()     // Catch:{ all -> 0x0d17 }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r12.mo55091a(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r2 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo55095C()     // Catch:{ all -> 0x0d17 }
            r12 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r12)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x016d
            r2 = 0
        L_0x0125:
            int r12 = r3.mo51013t()     // Catch:{ all -> 0x0d17 }
            if (r2 >= r12) goto L_0x016d
            java.lang.String r12 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfx r21 = r3.mo51009J(r2)     // Catch:{ all -> 0x0d17 }
            r22 = r8
            java.lang.String r8 = r21.mo51046I()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.internal.measurement.zzfx r8 = r3.mo51009J(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo51047J()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0d17 }
            if (r8 != 0) goto L_0x0168
            java.lang.String r8 = "admob"
            com.google.android.gms.internal.measurement.zzfx r12 = r3.mo51009J(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo51047J()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r8.equalsIgnoreCase(r12)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0168
            com.google.android.gms.measurement.internal.zzeh r8 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r8 = r8.mo55104v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r8.mo55091a(r12)     // Catch:{ all -> 0x0d17 }
        L_0x0168:
            int r2 = r2 + 1
            r8 = r22
            goto L_0x0125
        L_0x016d:
            r22 = r8
            com.google.android.gms.measurement.internal.zzfi r2 = r1.f47254a     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r8 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.mo55152E(r8, r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "_c"
            if (r2 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.zzkv r12 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.m4484g(r12)     // Catch:{ all -> 0x0d17 }
            r21 = r11
            int r11 = r12.hashCode()     // Catch:{ all -> 0x0d17 }
            r23 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r11 == r10) goto L_0x01be
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r11 == r10) goto L_0x01b4
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r11 == r10) goto L_0x01aa
            goto L_0x01c8
        L_0x01aa:
            java.lang.String r10 = "_ui"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 1
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r10 = "_ug"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 2
            goto L_0x01c9
        L_0x01be:
            java.lang.String r10 = "_in"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x01c8
            r10 = 0
            goto L_0x01c9
        L_0x01c8:
            r10 = -1
        L_0x01c9:
            if (r10 == 0) goto L_0x01df
            r11 = 1
            if (r10 == r11) goto L_0x01df
            r11 = 2
            if (r10 == r11) goto L_0x01df
            r25 = r5
            r24 = r7
            r7 = r13
            r19 = r14
            r2 = 0
            goto L_0x03a5
        L_0x01db:
            r23 = r10
            r21 = r11
        L_0x01df:
            r24 = r7
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x01e4:
            int r7 = r3.mo51013t()     // Catch:{ all -> 0x0d17 }
            r25 = r5
            java.lang.String r5 = "_r"
            if (r10 >= r7) goto L_0x024b
            com.google.android.gms.internal.measurement.zzfx r7 = r3.mo51009J(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo51046I()     // Catch:{ all -> 0x0d17 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x0219
            com.google.android.gms.internal.measurement.zzfx r5 = r3.mo51009J(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkb r5 = r5.mo51460y()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            r7 = r13
            r19 = r14
            r13 = 1
            r5.mo51033C(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r5 = r5.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r5 = (com.google.android.gms.internal.measurement.zzfx) r5     // Catch:{ all -> 0x0d17 }
            r3.mo51006E(r10, r5)     // Catch:{ all -> 0x0d17 }
            r11 = 1
            goto L_0x0243
        L_0x0219:
            r7 = r13
            r19 = r14
            com.google.android.gms.internal.measurement.zzfx r13 = r3.mo51009J(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo51046I()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0243
            com.google.android.gms.internal.measurement.zzfx r5 = r3.mo51009J(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkb r5 = r5.mo51460y()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            r12 = 1
            r5.mo51033C(r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r5 = r5.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r5 = (com.google.android.gms.internal.measurement.zzfx) r5     // Catch:{ all -> 0x0d17 }
            r3.mo51006E(r10, r5)     // Catch:{ all -> 0x0d17 }
            r12 = 1
        L_0x0243:
            int r10 = r10 + 1
            r13 = r7
            r14 = r19
            r5 = r25
            goto L_0x01e4
        L_0x024b:
            r7 = r13
            r19 = r14
            if (r11 != 0) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            com.google.android.gms.measurement.internal.zzeh r10 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r10 = r10.mo55102t()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzfr r13 = r1.f47265l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzec r13 = r13.mo55187D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo55087d(r14)     // Catch:{ all -> 0x0d17 }
            r10.mo55092b(r11, r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r10 = com.google.android.gms.internal.measurement.zzfx.m59896G()     // Catch:{ all -> 0x0d17 }
            r10.mo51034D(r8)     // Catch:{ all -> 0x0d17 }
            r13 = 1
            r10.mo51033C(r13)     // Catch:{ all -> 0x0d17 }
            r3.mo51017y(r10)     // Catch:{ all -> 0x0d17 }
        L_0x027c:
            if (r12 != 0) goto L_0x02a8
            com.google.android.gms.measurement.internal.zzeh r10 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r10 = r10.mo55102t()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzfr r12 = r1.f47265l     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzec r12 = r12.mo55187D()     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo55087d(r13)     // Catch:{ all -> 0x0d17 }
            r10.mo55092b(r11, r12)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r10 = com.google.android.gms.internal.measurement.zzfx.m59896G()     // Catch:{ all -> 0x0d17 }
            r10.mo51034D(r5)     // Catch:{ all -> 0x0d17 }
            r11 = 1
            r10.mo51033C(r11)     // Catch:{ all -> 0x0d17 }
            r3.mo51017y(r10)     // Catch:{ all -> 0x0d17 }
        L_0x02a8:
            com.google.android.gms.measurement.internal.zzam r10 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r10)     // Catch:{ all -> 0x0d17 }
            long r27 = r41.mo55514F()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r11 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r29 = r11.mo51174T1()     // Catch:{ all -> 0x0d17 }
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r26 = r10
            com.google.android.gms.measurement.internal.zzak r10 = r26.mo54969T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d17 }
            long r10 = r10.f46436e     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzag r12 = r41.mo55517U()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r13 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r13.mo51174T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzdt r14 = com.google.android.gms.measurement.internal.zzdu.f46626p     // Catch:{ all -> 0x0d17 }
            int r12 = r12.mo54930m(r13, r14)     // Catch:{ all -> 0x0d17 }
            long r12 = (long) r12     // Catch:{ all -> 0x0d17 }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x02e2
            m66022H(r3, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x02e4
        L_0x02e2:
            r16 = 1
        L_0x02e4:
            java.lang.String r5 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            boolean r5 = com.google.android.gms.measurement.internal.zzlb.m66121X(r5)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x03a5
            if (r2 == 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.zzam r5 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            long r27 = r41.mo55514F()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r10 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r29 = r10.mo51174T1()     // Catch:{ all -> 0x0d17 }
            r30 = 0
            r31 = 0
            r32 = 1
            r33 = 0
            r34 = 0
            r26 = r5
            com.google.android.gms.measurement.internal.zzak r5 = r26.mo54969T(r27, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0d17 }
            long r10 = r5.f46434c     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzag r5 = r41.mo55517U()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r12 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo51174T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzdt r13 = com.google.android.gms.measurement.internal.zzdu.f46624o     // Catch:{ all -> 0x0d17 }
            int r5 = r5.mo54930m(r12, r13)     // Catch:{ all -> 0x0d17 }
            long r12 = (long) r5     // Catch:{ all -> 0x0d17 }
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a5
            com.google.android.gms.measurement.internal.zzeh r5 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55103u()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzgd r11 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeh.m65566x(r11)     // Catch:{ all -> 0x0d17 }
            r5.mo55092b(r10, r11)     // Catch:{ all -> 0x0d17 }
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = -1
        L_0x0341:
            int r13 = r3.mo51013t()     // Catch:{ all -> 0x0d17 }
            if (r10 >= r13) goto L_0x036b
            com.google.android.gms.internal.measurement.zzfx r13 = r3.mo51009J(r10)     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = r13.mo51046I()     // Catch:{ all -> 0x0d17 }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0d17 }
            if (r14 == 0) goto L_0x035d
            com.google.android.gms.internal.measurement.zzkb r5 = r13.mo51460y()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            r12 = r10
            goto L_0x0368
        L_0x035d:
            java.lang.String r13 = r13.mo51046I()     // Catch:{ all -> 0x0d17 }
            boolean r13 = r9.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0368
            r11 = 1
        L_0x0368:
            int r10 = r10 + 1
            goto L_0x0341
        L_0x036b:
            if (r11 == 0) goto L_0x0374
            if (r5 == 0) goto L_0x0373
            r3.mo51003B(r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x03a5
        L_0x0373:
            r5 = 0
        L_0x0374:
            if (r5 == 0) goto L_0x038e
            com.google.android.gms.internal.measurement.zzkb r5 = r5.mo51300f()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x0d17 }
            r5.mo51034D(r9)     // Catch:{ all -> 0x0d17 }
            r9 = 10
            r5.mo51033C(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r5 = r5.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r5 = (com.google.android.gms.internal.measurement.zzfx) r5     // Catch:{ all -> 0x0d17 }
            r3.mo51006E(r12, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x03a5
        L_0x038e:
            com.google.android.gms.measurement.internal.zzeh r5 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzgd r10 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = r10.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0d17 }
            r5.mo55092b(r9, r10)     // Catch:{ all -> 0x0d17 }
        L_0x03a5:
            if (r2 == 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r3.mo51011L()     // Catch:{ all -> 0x0d17 }
            r2.<init>(r5)     // Catch:{ all -> 0x0d17 }
            r5 = 0
            r9 = -1
            r10 = -1
        L_0x03b3:
            int r11 = r2.size()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r5 >= r11) goto L_0x03e3
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r11 = (com.google.android.gms.internal.measurement.zzfx) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo51046I()     // Catch:{ all -> 0x0d17 }
            boolean r11 = r13.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x03cf
            r9 = r5
            goto L_0x03e0
        L_0x03cf:
            java.lang.Object r11 = r2.get(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r11 = (com.google.android.gms.internal.measurement.zzfx) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo51046I()     // Catch:{ all -> 0x0d17 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x03e0
            r10 = r5
        L_0x03e0:
            int r5 = r5 + 1
            goto L_0x03b3
        L_0x03e3:
            r5 = -1
            if (r9 != r5) goto L_0x03e8
            goto L_0x045f
        L_0x03e8:
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r5 = (com.google.android.gms.internal.measurement.zzfx) r5     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo51051X()     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0419
            java.lang.Object r5 = r2.get(r9)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r5 = (com.google.android.gms.internal.measurement.zzfx) r5     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo51049V()     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0419
            com.google.android.gms.measurement.internal.zzeh r2 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55104v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.mo55091a(r5)     // Catch:{ all -> 0x0d17 }
            r3.mo51003B(r9)     // Catch:{ all -> 0x0d17 }
            m66022H(r3, r8)     // Catch:{ all -> 0x0d17 }
            r2 = 18
            m66021G(r3, r2, r13)     // Catch:{ all -> 0x0d17 }
            goto L_0x045e
        L_0x0419:
            r5 = -1
            if (r10 != r5) goto L_0x041d
            goto L_0x0445
        L_0x041d:
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r2 = (com.google.android.gms.internal.measurement.zzfx) r2     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r2.mo51047J()     // Catch:{ all -> 0x0d17 }
            int r10 = r2.length()     // Catch:{ all -> 0x0d17 }
            r11 = 3
            if (r10 != r11) goto L_0x0445
            r10 = 0
        L_0x042f:
            int r11 = r2.length()     // Catch:{ all -> 0x0d17 }
            if (r10 >= r11) goto L_0x045f
            int r11 = r2.codePointAt(r10)     // Catch:{ all -> 0x0d17 }
            boolean r13 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0445
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0d17 }
            int r10 = r10 + r11
            goto L_0x042f
        L_0x0445:
            com.google.android.gms.measurement.internal.zzeh r2 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55104v()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo55091a(r10)     // Catch:{ all -> 0x0d17 }
            r3.mo51003B(r9)     // Catch:{ all -> 0x0d17 }
            m66022H(r3, r8)     // Catch:{ all -> 0x0d17 }
            r2 = 19
            m66021G(r3, r2, r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x045f
        L_0x045e:
            r5 = -1
        L_0x045f:
            java.lang.String r2 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0d17 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04c5
            com.google.android.gms.measurement.internal.zzkv r2 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r2 = r3.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r2 = com.google.android.gms.measurement.internal.zzkv.m66091l(r2, r6)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x04b4
            long r10 = r7.mo51015v()     // Catch:{ all -> 0x0d17 }
            long r12 = r3.mo51015v()     // Catch:{ all -> 0x0d17 }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d17 }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04b4
            com.google.android.gms.internal.measurement.zzkb r2 = r7.mo51300f()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d17 }
            boolean r6 = r1.m66030P(r3, r2)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x04a7
            r6 = r19
            r10 = r25
            r10.mo51091O(r6, r2)     // Catch:{ all -> 0x0d17 }
            r11 = r21
            r2 = 0
            r13 = 0
            goto L_0x04af
        L_0x04a7:
            r6 = r19
            r10 = r25
            r2 = r3
            r13 = r7
            r11 = r20
        L_0x04af:
            r23 = r2
            r14 = r6
            goto L_0x0524
        L_0x04b4:
            r6 = r19
            r10 = r25
            r23 = r3
            r14 = r6
            r13 = r7
            r11 = r20
            goto L_0x0524
        L_0x04c0:
            r6 = r19
            r10 = r25
            goto L_0x051f
        L_0x04c5:
            r6 = r19
            r10 = r25
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.mo51010K()     // Catch:{ all -> 0x0d17 }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x051f
            com.google.android.gms.measurement.internal.zzkv r2 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r2 = r3.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch:{ all -> 0x0d17 }
            r11 = r24
            com.google.android.gms.internal.measurement.zzfx r2 = com.google.android.gms.measurement.internal.zzkv.m66091l(r2, r11)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x051f
            if (r23 == 0) goto L_0x0518
            long r11 = r23.mo51015v()     // Catch:{ all -> 0x0d17 }
            long r13 = r3.mo51015v()     // Catch:{ all -> 0x0d17 }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0d17 }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0518
            com.google.android.gms.internal.measurement.zzkb r2 = r23.mo51300f()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d17 }
            boolean r7 = r1.m66030P(r2, r3)     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x0511
            r8 = r21
            r10.mo51091O(r8, r2)     // Catch:{ all -> 0x0d17 }
            r14 = r6
            r2 = 0
            r23 = 0
            goto L_0x0516
        L_0x0511:
            r8 = r21
            r2 = r3
            r14 = r20
        L_0x0516:
            r13 = r2
            goto L_0x0523
        L_0x0518:
            r8 = r21
            r13 = r3
            r11 = r8
            r14 = r20
            goto L_0x0524
        L_0x051f:
            r8 = r21
            r14 = r6
            r13 = r7
        L_0x0523:
            r11 = r8
        L_0x0524:
            java.util.List r2 = r4.f47243c     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r6 = r3.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r6 = (com.google.android.gms.internal.measurement.zzft) r6     // Catch:{ all -> 0x0d17 }
            r7 = r22
            r2.set(r7, r6)     // Catch:{ all -> 0x0d17 }
            int r9 = r20 + 1
            r10.mo51082J0(r3)     // Catch:{ all -> 0x0d17 }
            r15 = r16
        L_0x0538:
            int r8 = r7 + 1
            r5 = r10
            r2 = r17
            r3 = r18
            r10 = r23
            goto L_0x0040
        L_0x0543:
            r10 = r5
            r11 = r7
            r20 = r9
            r2 = 0
            r7 = r2
            r5 = 0
        L_0x054b:
            if (r5 >= r9) goto L_0x059b
            com.google.android.gms.internal.measurement.zzft r12 = r10.mo51071C0(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r13 = r12.mo51024J()     // Catch:{ all -> 0x0d17 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x056e
            com.google.android.gms.measurement.internal.zzkv r13 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r13 = com.google.android.gms.measurement.internal.zzkv.m66091l(r12, r6)     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x056e
            r10.mo51127t(r5)     // Catch:{ all -> 0x0d17 }
            int r9 = r9 + -1
            int r5 = r5 + -1
            goto L_0x0598
        L_0x056e:
            com.google.android.gms.measurement.internal.zzkv r13 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r13)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r12 = com.google.android.gms.measurement.internal.zzkv.m66091l(r12, r11)     // Catch:{ all -> 0x0d17 }
            if (r12 == 0) goto L_0x0598
            boolean r13 = r12.mo51051X()     // Catch:{ all -> 0x0d17 }
            if (r13 == 0) goto L_0x0588
            long r12 = r12.mo51045E()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d17 }
            goto L_0x0589
        L_0x0588:
            r12 = 0
        L_0x0589:
            if (r12 == 0) goto L_0x0598
            long r13 = r12.longValue()     // Catch:{ all -> 0x0d17 }
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 <= 0) goto L_0x0598
            long r12 = r12.longValue()     // Catch:{ all -> 0x0d17 }
            long r7 = r7 + r12
        L_0x0598:
            r12 = 1
            int r5 = r5 + r12
            goto L_0x054b
        L_0x059b:
            r5 = 0
            r1.m66026L(r10, r7, r5)     // Catch:{ all -> 0x0d17 }
            java.util.List r5 = r10.mo51132v0()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x05a7:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = "_se"
            if (r6 == 0) goto L_0x05cd
            java.lang.String r6 = "_s"
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r11 = (com.google.android.gms.internal.measurement.zzft) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo51024J()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x05a7
            com.google.android.gms.measurement.internal.zzam r5 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r10.mo51126s0()     // Catch:{ all -> 0x0d17 }
            r5.mo54983k(r6, r9)     // Catch:{ all -> 0x0d17 }
        L_0x05cd:
            java.lang.String r5 = "_sid"
            int r5 = com.google.android.gms.measurement.internal.zzkv.m66100u(r10, r5)     // Catch:{ all -> 0x0d17 }
            if (r5 < 0) goto L_0x05da
            r5 = 1
            r1.m66026L(r10, r7, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x05fa
        L_0x05da:
            int r5 = com.google.android.gms.measurement.internal.zzkv.m66100u(r10, r9)     // Catch:{ all -> 0x0d17 }
            if (r5 < 0) goto L_0x05fa
            r10.mo51129u(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r5 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzgd r7 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeh.m65566x(r7)     // Catch:{ all -> 0x0d17 }
            r5.mo55092b(r6, r7)     // Catch:{ all -> 0x0d17 }
        L_0x05fa:
            com.google.android.gms.measurement.internal.zzkv r5 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfr r6 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55102t()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.mo55091a(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzkt r6 = r5.f47227b     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfi r6 = r6.f47254a     // Catch:{ all -> 0x0d17 }
            m66032R(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r10.mo51126s0()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.mo55149A(r7)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzkt r6 = r5.f47227b     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzam r6 = r6.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r10.mo51126s0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzh r6 = r6.mo54967R(r7)     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            boolean r6 = r6.mo55262I()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzfr r6 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzaq r6 = r6.mo55220y()     // Catch:{ all -> 0x0d17 }
            boolean r6 = r6.mo55005q()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0691
            com.google.android.gms.measurement.internal.zzfr r6 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55097o()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.mo55091a(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgl r6 = com.google.android.gms.internal.measurement.zzgm.m60197E()     // Catch:{ all -> 0x0d17 }
            r7 = r17
            r6.mo51232z(r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfr r5 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzaq r5 = r5.mo55220y()     // Catch:{ all -> 0x0d17 }
            long r8 = r5.mo55001m()     // Catch:{ all -> 0x0d17 }
            r6.mo51225A(r8)     // Catch:{ all -> 0x0d17 }
            r8 = 1
            r6.mo51231y(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r5 = r6.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgm r5 = (com.google.android.gms.internal.measurement.zzgm) r5     // Catch:{ all -> 0x0d17 }
            r6 = 0
        L_0x0673:
            int r8 = r10.mo51137z0()     // Catch:{ all -> 0x0d17 }
            if (r6 >= r8) goto L_0x068e
            com.google.android.gms.internal.measurement.zzgm r8 = r10.mo51125r0(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r8.mo51236H()     // Catch:{ all -> 0x0d17 }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x068b
            r10.mo51123o0(r6, r5)     // Catch:{ all -> 0x0d17 }
            goto L_0x0691
        L_0x068b:
            int r6 = r6 + 1
            goto L_0x0673
        L_0x068e:
            r10.mo51086L0(r5)     // Catch:{ all -> 0x0d17 }
        L_0x0691:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.mo51119i0(r5)     // Catch:{ all -> 0x0d17 }
            r5 = -9223372036854775808
            r10.mo51087M(r5)     // Catch:{ all -> 0x0d17 }
            r5 = 0
        L_0x069f:
            int r6 = r10.mo51109Y()     // Catch:{ all -> 0x0d17 }
            if (r5 >= r6) goto L_0x06d2
            com.google.android.gms.internal.measurement.zzft r6 = r10.mo51071C0(r5)     // Catch:{ all -> 0x0d17 }
            long r7 = r6.mo51022E()     // Catch:{ all -> 0x0d17 }
            long r11 = r10.mo51069B0()     // Catch:{ all -> 0x0d17 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x06bc
            long r7 = r6.mo51022E()     // Catch:{ all -> 0x0d17 }
            r10.mo51119i0(r7)     // Catch:{ all -> 0x0d17 }
        L_0x06bc:
            long r7 = r6.mo51022E()     // Catch:{ all -> 0x0d17 }
            long r11 = r10.mo51067A0()     // Catch:{ all -> 0x0d17 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x06cf
            long r6 = r6.mo51022E()     // Catch:{ all -> 0x0d17 }
            r10.mo51087M(r6)     // Catch:{ all -> 0x0d17 }
        L_0x06cf:
            int r5 = r5 + 1
            goto L_0x069f
        L_0x06d2:
            r10.mo51110Y0()     // Catch:{ all -> 0x0d17 }
            r10.mo51090N0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzaa r5 = r1.f47259f     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.String r21 = r10.mo51126s0()     // Catch:{ all -> 0x0d17 }
            java.util.List r22 = r10.mo51132v0()     // Catch:{ all -> 0x0d17 }
            java.util.List r23 = r10.mo51134x0()     // Catch:{ all -> 0x0d17 }
            long r6 = r10.mo51069B0()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r24 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r10.mo51067A0()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r25 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d17 }
            r20 = r5
            java.util.List r5 = r20.mo54914k(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0d17 }
            r10.mo51073D0(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzag r5 = r41.mo55517U()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r6 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo51174T1()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.mo54923F(r6)     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0a51
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0d17 }
            r5.<init>()     // Catch:{ all -> 0x0d17 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0d17 }
            r6.<init>()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzlb r7 = r41.mo55533h0()     // Catch:{ all -> 0x0d17 }
            java.security.SecureRandom r7 = r7.mo55609s()     // Catch:{ all -> 0x0d17 }
            r8 = 0
        L_0x0725:
            int r9 = r10.mo51109Y()     // Catch:{ all -> 0x0d17 }
            if (r8 >= r9) goto L_0x0a17
            com.google.android.gms.internal.measurement.zzft r9 = r10.mo51071C0(r8)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkb r9 = r9.mo51460y()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfs r9 = (com.google.android.gms.internal.measurement.zzfs) r9     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07c8
            com.google.android.gms.measurement.internal.zzkv r11 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r11 = r9.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r11 = (com.google.android.gms.internal.measurement.zzft) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzkv.m66092m(r11, r14)     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d17 }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzas r14 = (com.google.android.gms.measurement.internal.zzas) r14     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x077c
            com.google.android.gms.measurement.internal.zzam r14 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r15 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r15 = r15.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r17 = com.google.android.gms.common.internal.Preconditions.m4488k(r11)     // Catch:{ all -> 0x0d17 }
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzas r14 = r14.mo54971V(r15, r2)     // Catch:{ all -> 0x0d17 }
            if (r14 == 0) goto L_0x077c
            r5.put(r11, r14)     // Catch:{ all -> 0x0d17 }
        L_0x077c:
            if (r14 == 0) goto L_0x07bb
            java.lang.Long r2 = r14.f46473i     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x07bb
            java.lang.Long r2 = r14.f46474j     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x079a
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d17 }
            r17 = 1
            int r11 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x079a
            com.google.android.gms.measurement.internal.zzkv r2 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = r14.f46474j     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzkv.m66089P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
        L_0x079a:
            java.lang.Boolean r2 = r14.f46475k     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x07b2
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x07b2
            com.google.android.gms.measurement.internal.zzkv r2 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            r2 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzkv.m66089P(r9, r12, r11)     // Catch:{ all -> 0x0d17 }
        L_0x07b2:
            com.google.android.gms.internal.measurement.zzkf r2 = r9.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
        L_0x07bb:
            r10.mo51091O(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x07be:
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a0b
        L_0x07c8:
            com.google.android.gms.measurement.internal.zzfi r2 = r1.f47254a     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r3 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r3 = r3.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r11 = r2.mo54918b(r3, r11)     // Catch:{ all -> 0x0d17 }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x07f9
            long r2 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x07e4 }
            goto L_0x07fb
        L_0x07e4:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55103u()     // Catch:{ all -> 0x0d17 }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeh.m65566x(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo55093c(r14, r3, r11)     // Catch:{ all -> 0x0d17 }
        L_0x07f9:
            r2 = 0
        L_0x07fb:
            com.google.android.gms.measurement.internal.zzlb r11 = r41.mo55533h0()     // Catch:{ all -> 0x0d17 }
            long r14 = r9.mo51015v()     // Catch:{ all -> 0x0d17 }
            long r14 = r11.mo55610s0(r14, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r11 = r9.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r11 = (com.google.android.gms.internal.measurement.zzft) r11     // Catch:{ all -> 0x0d17 }
            r44 = r12
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0d17 }
            r17 = r2
            java.lang.String r2 = "_dbg"
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x0853
            java.util.List r3 = r11.mo51025K()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x0827:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x0853
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzfx r11 = (com.google.android.gms.internal.measurement.zzfx) r11     // Catch:{ all -> 0x0d17 }
            r22 = r3
            java.lang.String r3 = r11.mo51046I()     // Catch:{ all -> 0x0d17 }
            boolean r3 = r2.equals(r3)     // Catch:{ all -> 0x0d17 }
            if (r3 == 0) goto L_0x0850
            long r2 = r11.mo51045E()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x084e
            goto L_0x0853
        L_0x084e:
            r2 = 1
            goto L_0x0866
        L_0x0850:
            r3 = r22
            goto L_0x0827
        L_0x0853:
            com.google.android.gms.measurement.internal.zzfi r2 = r1.f47254a     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r3 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r3 = r3.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            int r2 = r2.mo55162p(r3, r11)     // Catch:{ all -> 0x0d17 }
        L_0x0866:
            if (r2 > 0) goto L_0x088b
            com.google.android.gms.measurement.internal.zzeh r3 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55103u()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d17 }
            r3.mo55093c(r11, r12, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r2 = r9.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
            r10.mo51091O(r8, r9)     // Catch:{ all -> 0x0d17 }
            goto L_0x07be
        L_0x088b:
            java.lang.String r3 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzas r3 = (com.google.android.gms.measurement.internal.zzas) r3     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.zzam r3 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r3)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r11 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = r11.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzas r3 = r3.mo54971V(r11, r12)     // Catch:{ all -> 0x0d17 }
            if (r3 != 0) goto L_0x08eb
            com.google.android.gms.measurement.internal.zzeh r3 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55103u()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzgd r12 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = r12.mo51174T1()     // Catch:{ all -> 0x0d17 }
            r22 = r14
            java.lang.String r14 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            r3.mo55093c(r11, r12, r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r11 = r4.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r25 = r11.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.String r26 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            r27 = 1
            r29 = 1
            r31 = 1
            long r33 = r9.mo51015v()     // Catch:{ all -> 0x0d17 }
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r24 = r3
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x0d17 }
            goto L_0x08ed
        L_0x08eb:
            r22 = r14
        L_0x08ed:
            com.google.android.gms.measurement.internal.zzkv r11 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r11)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r11 = r9.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r11 = (com.google.android.gms.internal.measurement.zzft) r11     // Catch:{ all -> 0x0d17 }
            java.lang.String r12 = "_eid"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzkv.m66092m(r11, r12)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x0904
            r12 = 1
            goto L_0x0905
        L_0x0904:
            r12 = 0
        L_0x0905:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0d17 }
            r14 = 1
            if (r2 != r14) goto L_0x0938
            com.google.android.gms.internal.measurement.zzkf r2 = r9.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch:{ all -> 0x0d17 }
            r6.add(r2)     // Catch:{ all -> 0x0d17 }
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0933
            java.lang.Long r2 = r3.f46473i     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x0927
            java.lang.Long r2 = r3.f46474j     // Catch:{ all -> 0x0d17 }
            if (r2 != 0) goto L_0x0927
            java.lang.Boolean r2 = r3.f46475k     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0933
        L_0x0927:
            r2 = 0
            com.google.android.gms.measurement.internal.zzas r3 = r3.mo55008a(r2, r2, r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r2 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0933:
            r10.mo51091O(r8, r9)     // Catch:{ all -> 0x0d17 }
            goto L_0x07be
        L_0x0938:
            int r14 = r7.nextInt(r2)     // Catch:{ all -> 0x0d17 }
            if (r14 != 0) goto L_0x097a
            com.google.android.gms.measurement.internal.zzkv r11 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r11)     // Catch:{ all -> 0x0d17 }
            long r14 = (long) r2     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzkv.m66089P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r11 = r9.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r11 = (com.google.android.gms.internal.measurement.zzft) r11     // Catch:{ all -> 0x0d17 }
            r6.add(r11)     // Catch:{ all -> 0x0d17 }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r11 == 0) goto L_0x095f
            r11 = 0
            com.google.android.gms.measurement.internal.zzas r3 = r3.mo55008a(r11, r2, r11)     // Catch:{ all -> 0x0d17 }
        L_0x095f:
            java.lang.String r2 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            long r11 = r9.mo51015v()     // Catch:{ all -> 0x0d17 }
            r14 = r22
            com.google.android.gms.measurement.internal.zzas r3 = r3.mo55009b(r11, r14)     // Catch:{ all -> 0x0d17 }
            r5.put(r2, r3)     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r22 = r7
            r2 = r10
            r7 = r5
            r4 = 1
            goto L_0x0a08
        L_0x097a:
            r14 = r22
            r22 = r7
            java.lang.Long r7 = r3.f46472h     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x098f
            long r17 = r7.longValue()     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r26 = r5
            r25 = r10
            r23 = r11
            goto L_0x09a5
        L_0x098f:
            com.google.android.gms.measurement.internal.zzlb r7 = r41.mo55533h0()     // Catch:{ all -> 0x0d17 }
            r25 = r10
            r23 = r11
            long r10 = r9.mo51014u()     // Catch:{ all -> 0x0d17 }
            r24 = r4
            r26 = r5
            r4 = r17
            long r17 = r7.mo55610s0(r10, r4)     // Catch:{ all -> 0x0d17 }
        L_0x09a5:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x09ee
            com.google.android.gms.measurement.internal.zzkv r4 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r4)     // Catch:{ all -> 0x0d17 }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d17 }
            r10 = r44
            com.google.android.gms.measurement.internal.zzkv.m66089P(r9, r10, r7)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzkv r7 = r1.f47260g     // Catch:{ all -> 0x0d17 }
            m66032R(r7)     // Catch:{ all -> 0x0d17 }
            long r10 = (long) r2     // Catch:{ all -> 0x0d17 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzkv.m66089P(r9, r13, r2)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r7 = r9.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzft r7 = (com.google.android.gms.internal.measurement.zzft) r7     // Catch:{ all -> 0x0d17 }
            r6.add(r7)     // Catch:{ all -> 0x0d17 }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r7 == 0) goto L_0x09dc
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d17 }
            r10 = 0
            com.google.android.gms.measurement.internal.zzas r3 = r3.mo55008a(r10, r2, r7)     // Catch:{ all -> 0x0d17 }
        L_0x09dc:
            java.lang.String r2 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            long r10 = r9.mo51015v()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzas r3 = r3.mo55009b(r10, r14)     // Catch:{ all -> 0x0d17 }
            r7 = r26
            r7.put(r2, r3)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a06
        L_0x09ee:
            r7 = r26
            r4 = 1
            boolean r2 = r12.booleanValue()     // Catch:{ all -> 0x0d17 }
            if (r2 == 0) goto L_0x0a06
            java.lang.String r2 = r9.mo51010K()     // Catch:{ all -> 0x0d17 }
            r11 = r23
            r10 = 0
            com.google.android.gms.measurement.internal.zzas r3 = r3.mo55008a(r11, r10, r10)     // Catch:{ all -> 0x0d17 }
            r7.put(r2, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0a06:
            r2 = r25
        L_0x0a08:
            r2.mo51091O(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0a0b:
            int r8 = r8 + 1
            r10 = r2
            r5 = r7
            r7 = r22
            r4 = r24
            r2 = 0
            goto L_0x0725
        L_0x0a17:
            r24 = r4
            r7 = r5
            r2 = r10
            int r3 = r6.size()     // Catch:{ all -> 0x0d17 }
            int r4 = r2.mo51109Y()     // Catch:{ all -> 0x0d17 }
            if (r3 >= r4) goto L_0x0a2b
            r2.mo51095Q0()     // Catch:{ all -> 0x0d17 }
            r2.mo51075F0(r6)     // Catch:{ all -> 0x0d17 }
        L_0x0a2b:
            java.util.Set r3 = r7.entrySet()     // Catch:{ all -> 0x0d17 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0d17 }
        L_0x0a33:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0d17 }
            if (r4 == 0) goto L_0x0a4e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0d17 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzam r5 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzas r4 = (com.google.android.gms.measurement.internal.zzas) r4     // Catch:{ all -> 0x0d17 }
            r5.mo54987o(r4)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a33
        L_0x0a4e:
            r3 = r24
            goto L_0x0a53
        L_0x0a51:
            r2 = r10
            r3 = r4
        L_0x0a53:
            com.google.android.gms.internal.measurement.zzgd r4 = r3.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r4 = r4.mo51174T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzam r5 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzh r5 = r5.mo54967R(r4)     // Catch:{ all -> 0x0d17 }
            if (r5 != 0) goto L_0x0a7c
            com.google.android.gms.measurement.internal.zzeh r5 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzgd r7 = r3.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = r7.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeh.m65566x(r7)     // Catch:{ all -> 0x0d17 }
            r5.mo55092b(r6, r7)     // Catch:{ all -> 0x0d17 }
            goto L_0x0ad8
        L_0x0a7c:
            int r6 = r2.mo51109Y()     // Catch:{ all -> 0x0d17 }
            if (r6 <= 0) goto L_0x0ad8
            long r6 = r5.mo55277X()     // Catch:{ all -> 0x0d17 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0a90
            r2.mo51112a0(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0a93
        L_0x0a90:
            r2.mo51103U0()     // Catch:{ all -> 0x0d17 }
        L_0x0a93:
            long r8 = r5.mo55279Z()     // Catch:{ all -> 0x0d17 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0a9e
            goto L_0x0a9f
        L_0x0a9e:
            r6 = r8
        L_0x0a9f:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0aa7
            r2.mo51113b0(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0aaa
        L_0x0aa7:
            r2.mo51105V0()     // Catch:{ all -> 0x0d17 }
        L_0x0aaa:
            r5.mo55288e()     // Catch:{ all -> 0x0d17 }
            long r6 = r5.mo55278Y()     // Catch:{ all -> 0x0d17 }
            int r7 = (int) r6     // Catch:{ all -> 0x0d17 }
            r2.mo51070C(r7)     // Catch:{ all -> 0x0d17 }
            long r6 = r2.mo51069B0()     // Catch:{ all -> 0x0d17 }
            r5.mo55256C(r6)     // Catch:{ all -> 0x0d17 }
            long r6 = r2.mo51067A0()     // Catch:{ all -> 0x0d17 }
            r5.mo55315z(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r5.mo55285c0()     // Catch:{ all -> 0x0d17 }
            if (r6 == 0) goto L_0x0acd
            r2.mo51100T(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0ad0
        L_0x0acd:
            r2.mo51097R0()     // Catch:{ all -> 0x0d17 }
        L_0x0ad0:
            com.google.android.gms.measurement.internal.zzam r6 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r6)     // Catch:{ all -> 0x0d17 }
            r6.mo54986n(r5)     // Catch:{ all -> 0x0d17 }
        L_0x0ad8:
            int r5 = r2.mo51109Y()     // Catch:{ all -> 0x0d17 }
            if (r5 <= 0) goto L_0x0c5c
            com.google.android.gms.measurement.internal.zzfr r5 = r1.f47265l     // Catch:{ all -> 0x0d17 }
            r5.mo55207h()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfi r5 = r1.f47254a     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r6 = r3.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = r6.mo51174T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzff r5 = r5.mo55163r(r6)     // Catch:{ all -> 0x0d17 }
            r6 = -1
            if (r5 == 0) goto L_0x0b05
            boolean r8 = r5.mo50982T()     // Catch:{ all -> 0x0d17 }
            if (r8 != 0) goto L_0x0afd
            goto L_0x0b05
        L_0x0afd:
            long r8 = r5.mo50972D()     // Catch:{ all -> 0x0d17 }
            r2.mo51074E(r8)     // Catch:{ all -> 0x0d17 }
            goto L_0x0b2c
        L_0x0b05:
            com.google.android.gms.internal.measurement.zzgd r5 = r3.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = r5.mo51154H()     // Catch:{ all -> 0x0d17 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d17 }
            if (r5 == 0) goto L_0x0b15
            r2.mo51074E(r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0b2c
        L_0x0b15:
            com.google.android.gms.measurement.internal.zzeh r5 = r41.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55103u()     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzgd r9 = r3.f47241a     // Catch:{ all -> 0x0d17 }
            java.lang.String r9 = r9.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeh.m65566x(r9)     // Catch:{ all -> 0x0d17 }
            r5.mo55092b(r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0b2c:
            com.google.android.gms.measurement.internal.zzam r5 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r5)     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzkf r2 = r2.mo51441o()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.internal.measurement.zzgd r2 = (com.google.android.gms.internal.measurement.zzgd) r2     // Catch:{ all -> 0x0d17 }
            r5.mo55073e()     // Catch:{ all -> 0x0d17 }
            r5.mo55503f()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.m4488k(r2)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = r2.mo51174T1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.m4484g(r8)     // Catch:{ all -> 0x0d17 }
            boolean r8 = r2.mo51183m1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.m4493p(r8)     // Catch:{ all -> 0x0d17 }
            r5.mo54982h0()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfr r8 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.util.Clock r8 = r8.mo55201a()     // Catch:{ all -> 0x0d17 }
            long r8 = r8.mo21950a()     // Catch:{ all -> 0x0d17 }
            long r10 = r2.mo51155H1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfr r12 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            r12.mo55219x()     // Catch:{ all -> 0x0d17 }
            long r12 = com.google.android.gms.measurement.internal.zzag.m65357f()     // Catch:{ all -> 0x0d17 }
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0b80
            long r10 = r2.mo51155H1()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzfr r12 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            r12.mo55219x()     // Catch:{ all -> 0x0d17 }
            long r12 = com.google.android.gms.measurement.internal.zzag.m65357f()     // Catch:{ all -> 0x0d17 }
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0ba3
        L_0x0b80:
            com.google.android.gms.measurement.internal.zzfr r10 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r10 = r10.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r10 = r10.mo55103u()     // Catch:{ all -> 0x0d17 }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r2.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeh.m65566x(r12)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d17 }
            long r13 = r2.mo51155H1()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d17 }
            r10.mo55094d(r11, r12, r8, r9)     // Catch:{ all -> 0x0d17 }
        L_0x0ba3:
            byte[] r8 = r2.mo51306h()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzkt r9 = r5.f47227b     // Catch:{ IOException -> 0x0c43 }
            com.google.android.gms.measurement.internal.zzkv r9 = r9.f47260g     // Catch:{ IOException -> 0x0c43 }
            m66032R(r9)     // Catch:{ IOException -> 0x0c43 }
            byte[] r8 = r9.mo55563O(r8)     // Catch:{ IOException -> 0x0c43 }
            com.google.android.gms.measurement.internal.zzfr r9 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r9 = r9.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r9 = r9.mo55102t()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0d17 }
            r9.mo55092b(r10, r11)     // Catch:{ all -> 0x0d17 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d17 }
            r9.<init>()     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r2.mo51174T1()     // Catch:{ all -> 0x0d17 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r2.mo51155H1()     // Catch:{ all -> 0x0d17 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d17 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0d17 }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0d17 }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0d17 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d17 }
            boolean r8 = r2.mo51189s1()     // Catch:{ all -> 0x0d17 }
            if (r8 == 0) goto L_0x0c02
            java.lang.String r8 = "retry_count"
            int r10 = r2.mo51142B1()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0d17 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0d17 }
        L_0x0c02:
            android.database.sqlite.SQLiteDatabase r8 = r5.mo54965P()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c29 }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0c5c
            com.google.android.gms.measurement.internal.zzfr r6 = r5.f46899a     // Catch:{ SQLiteException -> 0x0c29 }
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()     // Catch:{ SQLiteException -> 0x0c29 }
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55098p()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.mo51174T1()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeh.m65566x(r8)     // Catch:{ SQLiteException -> 0x0c29 }
            r6.mo55092b(r7, r8)     // Catch:{ SQLiteException -> 0x0c29 }
            goto L_0x0c5c
        L_0x0c29:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzfr r5 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzeh.m65566x(r2)     // Catch:{ all -> 0x0d17 }
            r5.mo55093c(r7, r2, r6)     // Catch:{ all -> 0x0d17 }
            goto L_0x0c5c
        L_0x0c43:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzfr r5 = r5.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.mo51174T1()     // Catch:{ all -> 0x0d17 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzeh.m65566x(r2)     // Catch:{ all -> 0x0d17 }
            r5.mo55093c(r7, r2, r6)     // Catch:{ all -> 0x0d17 }
        L_0x0c5c:
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            java.util.List r3 = r3.f47242b     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.common.internal.Preconditions.m4488k(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo55073e()     // Catch:{ all -> 0x0d17 }
            r2.mo55503f()     // Catch:{ all -> 0x0d17 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d17 }
            r6 = 0
        L_0x0c74:
            int r7 = r3.size()     // Catch:{ all -> 0x0d17 }
            if (r6 >= r7) goto L_0x0c91
            if (r6 == 0) goto L_0x0c81
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d17 }
        L_0x0c81:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d17 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d17 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d17 }
            r5.append(r7)     // Catch:{ all -> 0x0d17 }
            int r6 = r6 + 1
            goto L_0x0c74
        L_0x0c91:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d17 }
            android.database.sqlite.SQLiteDatabase r6 = r2.mo54965P()     // Catch:{ all -> 0x0d17 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d17 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d17 }
            int r6 = r3.size()     // Catch:{ all -> 0x0d17 }
            if (r5 == r6) goto L_0x0cc6
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d17 }
            int r3 = r3.size()     // Catch:{ all -> 0x0d17 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d17 }
            r2.mo55093c(r6, r5, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0cc6:
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo54965P()     // Catch:{ all -> 0x0d17 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0cde }
            r6 = 0
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cde }
            r6 = 1
            r5[r6] = r4     // Catch:{ SQLiteException -> 0x0cde }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0cde }
            goto L_0x0cf3
        L_0x0cde:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x0d17 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r4)     // Catch:{ all -> 0x0d17 }
            r2.mo55093c(r5, r4, r3)     // Catch:{ all -> 0x0d17 }
        L_0x0cf3:
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            r2.mo54985m()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            r2 = 1
            return r2
        L_0x0d05:
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0d17 }
            m66032R(r2)     // Catch:{ all -> 0x0d17 }
            r2.mo54985m()     // Catch:{ all -> 0x0d17 }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            r2 = 0
            return r2
        L_0x0d17:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzam r3 = r1.f47256c
            m66032R(r3)
            r3.mo54980f0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkt.m66028N(java.lang.String, long):boolean");
    }

    /* renamed from: O */
    private final boolean m66029O() {
        mo55185B().mo55073e();
        mo55526d();
        zzam zzam = this.f47256c;
        m66032R(zzam);
        if (zzam.mo54988p()) {
            return true;
        }
        zzam zzam2 = this.f47256c;
        m66032R(zzam2);
        return !TextUtils.isEmpty(zzam2.mo54974Z());
    }

    /* renamed from: P */
    private final boolean m66030P(zzfs zzfs, zzfs zzfs2) {
        String str;
        Preconditions.m4478a("_e".equals(zzfs.mo51010K()));
        m66032R(this.f47260g);
        zzfx l = zzkv.m66091l((zzft) zzfs.mo51441o(), "_sc");
        String str2 = null;
        if (l == null) {
            str = null;
        } else {
            str = l.mo51047J();
        }
        m66032R(this.f47260g);
        zzfx l2 = zzkv.m66091l((zzft) zzfs2.mo51441o(), "_pc");
        if (l2 != null) {
            str2 = l2.mo51047J();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        Preconditions.m4478a("_e".equals(zzfs.mo51010K()));
        m66032R(this.f47260g);
        zzfx l3 = zzkv.m66091l((zzft) zzfs.mo51441o(), "_et");
        if (l3 == null || !l3.mo51051X() || l3.mo51045E() <= 0) {
            return true;
        }
        long E = l3.mo51045E();
        m66032R(this.f47260g);
        zzfx l4 = zzkv.m66091l((zzft) zzfs2.mo51441o(), "_et");
        if (l4 != null && l4.mo51045E() > 0) {
            E += l4.mo51045E();
        }
        m66032R(this.f47260g);
        zzkv.m66089P(zzfs2, "_et", Long.valueOf(E));
        m66032R(this.f47260g);
        zzkv.m66089P(zzfs, "_fr", 1L);
        return true;
    }

    /* renamed from: Q */
    private static final boolean m66031Q(zzq zzq) {
        return !TextUtils.isEmpty(zzq.f47327c) || !TextUtils.isEmpty(zzq.f47318H);
    }

    /* renamed from: R */
    private static final zzkh m66032R(zzkh zzkh) {
        if (zzkh == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (zzkh.mo55505i()) {
            return zzkh;
        } else {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkh.getClass())));
        }
    }

    /* renamed from: f0 */
    public static zzkt m66034f0(Context context) {
        Preconditions.m4488k(context);
        Preconditions.m4488k(context.getApplicationContext());
        if (f47248F == null) {
            synchronized (zzkt.class) {
                if (f47248F == null) {
                    f47248F = new zzkt((zzku) Preconditions.m4488k(new zzku(context)), (zzfr) null);
                }
            }
        }
        return f47248F;
    }

    /* renamed from: k0 */
    static /* bridge */ /* synthetic */ void m66035k0(zzkt zzkt, zzku zzku) {
        zzkt.mo55185B().mo55073e();
        zzkt.f47264k = new zzez(zzkt);
        zzam zzam = new zzam(zzkt);
        zzam.mo55504g();
        zzkt.f47256c = zzam;
        zzkt.mo55517U().mo54941x((zzaf) Preconditions.m4488k(zzkt.f47254a));
        zzjo zzjo = new zzjo(zzkt);
        zzjo.mo55504g();
        zzkt.f47262i = zzjo;
        zzaa zzaa = new zzaa(zzkt);
        zzaa.mo55504g();
        zzkt.f47259f = zzaa;
        zzic zzic = new zzic(zzkt);
        zzic.mo55504g();
        zzkt.f47261h = zzic;
        zzkf zzkf = new zzkf(zzkt);
        zzkf.mo55504g();
        zzkt.f47258e = zzkf;
        zzkt.f47257d = new zzep(zzkt);
        if (zzkt.f47270q != zzkt.f47271r) {
            zzkt.mo55221z().mo55098p().mo55093c("Not all upload components initialized", Integer.valueOf(zzkt.f47270q), Integer.valueOf(zzkt.f47271r));
        }
        zzkt.f47266m = true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public final void mo55510A(zzkw zzkw, zzq zzq) {
        long j;
        zzkw zzkw2 = zzkw;
        zzq zzq2 = zzq;
        mo55185B().mo55073e();
        mo55526d();
        if (m66031Q(zzq)) {
            if (!zzq2.f47333s) {
                mo55515S(zzq2);
                return;
            }
            int n0 = mo55533h0().mo55602n0(zzkw2.f47282c);
            if (n0 != 0) {
                zzlb h0 = mo55533h0();
                String str = zzkw2.f47282c;
                mo55517U();
                String p = h0.mo55605p(str, 24, true);
                String str2 = zzkw2.f47282c;
                mo55533h0().mo55573A(this.f47253E, zzq2.f47326a, n0, "_ev", p, str2 != null ? str2.length() : 0);
                return;
            }
            int j0 = mo55533h0().mo55596j0(zzkw2.f47282c, zzkw.mo55568l2());
            if (j0 != 0) {
                zzlb h02 = mo55533h0();
                String str3 = zzkw2.f47282c;
                mo55517U();
                String p2 = h02.mo55605p(str3, 24, true);
                Object l2 = zzkw.mo55568l2();
                mo55533h0().mo55573A(this.f47253E, zzq2.f47326a, j0, "_ev", p2, (l2 == null || (!(l2 instanceof String) && !(l2 instanceof CharSequence))) ? 0 : l2.toString().length());
                return;
            }
            Object n = mo55533h0().mo55601n(zzkw2.f47282c, zzkw.mo55568l2());
            if (n != null) {
                if ("_sid".equals(zzkw2.f47282c)) {
                    long j2 = zzkw2.f47283d;
                    String str4 = zzkw2.f47286o;
                    String str5 = (String) Preconditions.m4488k(zzq2.f47326a);
                    zzam zzam = this.f47256c;
                    m66032R(zzam);
                    zzky X = zzam.mo54972X(str5, "_sno");
                    if (X != null) {
                        Object obj = X.f47292e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            mo55510A(new zzkw("_sno", j2, Long.valueOf(j + 1), str4), zzq2);
                        }
                    }
                    if (X != null) {
                        mo55221z().mo55103u().mo55092b("Retrieved last session number from database does not contain a valid (long) value", X.f47292e);
                    }
                    zzam zzam2 = this.f47256c;
                    m66032R(zzam2);
                    zzas V = zzam2.mo54971V(str5, "_s");
                    if (V != null) {
                        j = V.f46467c;
                        mo55221z().mo55102t().mo55092b("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    mo55510A(new zzkw("_sno", j2, Long.valueOf(j + 1), str4), zzq2);
                }
                zzky zzky = new zzky((String) Preconditions.m4488k(zzq2.f47326a), (String) Preconditions.m4488k(zzkw2.f47286o), zzkw2.f47282c, zzkw2.f47283d, n);
                mo55221z().mo55102t().mo55093c("Setting user property", this.f47265l.mo55187D().mo55089f(zzky.f47290c), n);
                zzam zzam3 = this.f47256c;
                m66032R(zzam3);
                zzam3.mo54979e0();
                try {
                    if (Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID.equals(zzky.f47290c)) {
                        zzam zzam4 = this.f47256c;
                        m66032R(zzam4);
                        zzky X2 = zzam4.mo54972X(zzq2.f47326a, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID);
                        if (X2 != null && !zzky.f47292e.equals(X2.f47292e)) {
                            zzam zzam5 = this.f47256c;
                            m66032R(zzam5);
                            zzam5.mo54983k(zzq2.f47326a, "_lair");
                        }
                    }
                    mo55515S(zzq2);
                    zzam zzam6 = this.f47256c;
                    m66032R(zzam6);
                    boolean v = zzam6.mo54994v(zzky);
                    zzam zzam7 = this.f47256c;
                    m66032R(zzam7);
                    zzam7.mo54985m();
                    if (!v) {
                        mo55221z().mo55098p().mo55093c("Too many unique user properties are set. Ignoring user property", this.f47265l.mo55187D().mo55089f(zzky.f47290c), zzky.f47292e);
                        mo55533h0().mo55573A(this.f47253E, zzq2.f47326a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    zzam zzam8 = this.f47256c;
                    m66032R(zzam8);
                    zzam8.mo54980f0();
                }
            }
        }
    }

    /* renamed from: B */
    public final zzfo mo55185B() {
        return ((zzfr) Preconditions.m4488k(this.f47265l)).mo55185B();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:211|212) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0212, code lost:
        r8.f46899a.mo55221z().mo55098p().mo55093c("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.zzeh.m65566x(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        mo55221z().mo55098p().mo55093c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzeh.m65566x(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x055b, code lost:
        if (r11 != null) goto L_0x0538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if (r11 != null) goto L_0x0108;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x04dc */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0294 A[SYNTHETIC, Splitter:B:142:0x0294] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029d A[Catch:{ all -> 0x012c, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04f3 A[Catch:{ all -> 0x012c, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0565 A[Catch:{ all -> 0x012c, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x057c A[SYNTHETIC, Splitter:B:251:0x057c] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0130 A[Catch:{ all -> 0x012c, all -> 0x0580 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x0117=Splitter:B:55:0x0117, B:47:0x0108=Splitter:B:47:0x0108, B:129:0x0268=Splitter:B:129:0x0268, B:225:0x0538=Splitter:B:225:0x0538, B:58:0x0129=Splitter:B:58:0x0129, B:139:0x027b=Splitter:B:139:0x027b, B:202:0x045d=Splitter:B:202:0x045d, B:241:0x055f=Splitter:B:241:0x055f} */
    @androidx.annotation.WorkerThread
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55511C() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.zzfo r0 = r22.mo55185B()
            r0.mo55073e()
            r22.mo55526d()
            r2 = 1
            r1.f47274u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f47265l     // Catch:{ all -> 0x0580 }
            r0.mo55207h()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f47265l     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzjm r0 = r0.mo55194L()     // Catch:{ all -> 0x0580 }
            java.lang.Boolean r0 = r0.mo55444J()     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.zzeh r0 = r22.mo55221z()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55103u()     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.mo55091a(r2)     // Catch:{ all -> 0x0580 }
            r1.f47274u = r3
        L_0x0030:
            r22.m66025K()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.zzeh r0 = r22.mo55221z()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55098p()     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.mo55091a(r2)     // Catch:{ all -> 0x0580 }
            r1.f47274u = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.f47268o     // Catch:{ all -> 0x0580 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.m66027M()     // Catch:{ all -> 0x0580 }
            r1.f47274u = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.zzfo r0 = r22.mo55185B()     // Catch:{ all -> 0x0580 }
            r0.mo55073e()     // Catch:{ all -> 0x0580 }
            java.util.List r0 = r1.f47277x     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzeh r0 = r22.mo55221z()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55102t()     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.mo55091a(r2)     // Catch:{ all -> 0x0580 }
            r1.f47274u = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.zzen r0 = r1.f47255b     // Catch:{ all -> 0x0580 }
            m66032R(r0)     // Catch:{ all -> 0x0580 }
            boolean r0 = r0.mo55111k()     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.zzeh r0 = r22.mo55221z()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55102t()     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.mo55091a(r2)     // Catch:{ all -> 0x0580 }
            r22.m66027M()     // Catch:{ all -> 0x0580 }
            r1.f47274u = r3
            goto L_0x0030
        L_0x0091:
            com.google.android.gms.common.util.Clock r0 = r22.mo55201a()     // Catch:{ all -> 0x0580 }
            long r4 = r0.mo21950a()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzag r0 = r22.mo55517U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzdt r8 = com.google.android.gms.measurement.internal.zzdu.f46587R     // Catch:{ all -> 0x0580 }
            r9 = 0
            int r0 = r0.mo54930m(r9, r8)     // Catch:{ all -> 0x0580 }
            r22.mo55517U()     // Catch:{ all -> 0x0580 }
            long r10 = com.google.android.gms.measurement.internal.zzag.m65356I()     // Catch:{ all -> 0x0580 }
            long r10 = r4 - r10
            r8 = 0
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.m66028N(r9, r10)     // Catch:{ all -> 0x0580 }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.zzjo r0 = r1.f47262i     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzes r0 = r0.f47183g     // Catch:{ all -> 0x0580 }
            long r10 = r0.mo55120a()     // Catch:{ all -> 0x0580 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.zzeh r0 = r22.mo55221z()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55097o()     // Catch:{ all -> 0x0580 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0580 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0580 }
            r0.mo55092b(r6, r7)     // Catch:{ all -> 0x0580 }
        L_0x00dc:
            com.google.android.gms.measurement.internal.zzam r0 = r1.f47256c     // Catch:{ all -> 0x0580 }
            m66032R(r0)     // Catch:{ all -> 0x0580 }
            java.lang.String r6 = r0.mo54974Z()     // Catch:{ all -> 0x0580 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0580 }
            r7 = -1
            if (r0 != 0) goto L_0x04f7
            long r10 = r1.f47279z     // Catch:{ all -> 0x0580 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0134
            com.google.android.gms.measurement.internal.zzam r10 = r1.f47256c     // Catch:{ all -> 0x0580 }
            m66032R(r10)     // Catch:{ all -> 0x0580 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo54965P()     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0115, all -> 0x0113 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0111 }
            if (r0 != 0) goto L_0x010c
        L_0x0108:
            r11.close()     // Catch:{ all -> 0x0580 }
            goto L_0x0129
        L_0x010c:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0111 }
            goto L_0x0108
        L_0x0111:
            r0 = move-exception
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            goto L_0x012e
        L_0x0115:
            r0 = move-exception
            r11 = r9
        L_0x0117:
            com.google.android.gms.measurement.internal.zzfr r10 = r10.f46899a     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.zzeh r10 = r10.mo55221z()     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.zzef r10 = r10.mo55098p()     // Catch:{ all -> 0x012c }
            java.lang.String r12 = "Error querying raw events"
            r10.mo55092b(r12, r0)     // Catch:{ all -> 0x012c }
            if (r11 == 0) goto L_0x0129
            goto L_0x0108
        L_0x0129:
            r1.f47279z = r7     // Catch:{ all -> 0x0580 }
            goto L_0x0134
        L_0x012c:
            r0 = move-exception
            r9 = r11
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            r9.close()     // Catch:{ all -> 0x0580 }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x0580 }
        L_0x0134:
            com.google.android.gms.measurement.internal.zzag r0 = r22.mo55517U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzdt r7 = com.google.android.gms.measurement.internal.zzdu.f46610h     // Catch:{ all -> 0x0580 }
            int r0 = r0.mo54930m(r6, r7)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzag r7 = r22.mo55517U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzdt r8 = com.google.android.gms.measurement.internal.zzdu.f46612i     // Catch:{ all -> 0x0580 }
            int r7 = r7.mo54930m(r6, r8)     // Catch:{ all -> 0x0580 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzam r8 = r1.f47256c     // Catch:{ all -> 0x0580 }
            m66032R(r8)     // Catch:{ all -> 0x0580 }
            r8.mo55073e()     // Catch:{ all -> 0x0580 }
            r8.mo55503f()     // Catch:{ all -> 0x0580 }
            if (r0 <= 0) goto L_0x015b
            r10 = 1
            goto L_0x015c
        L_0x015b:
            r10 = 0
        L_0x015c:
            com.google.android.gms.common.internal.Preconditions.m4478a(r10)     // Catch:{ all -> 0x0580 }
            if (r7 <= 0) goto L_0x0163
            r10 = 1
            goto L_0x0164
        L_0x0163:
            r10 = 0
        L_0x0164:
            com.google.android.gms.common.internal.Preconditions.m4478a(r10)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.common.internal.Preconditions.m4484g(r6)     // Catch:{ all -> 0x0580 }
            android.database.sqlite.SQLiteDatabase r11 = r8.mo54965P()     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0277, all -> 0x0273 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026f }
            if (r0 != 0) goto L_0x019f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026f }
            r11.close()     // Catch:{ all -> 0x0580 }
            r20 = r4
            goto L_0x0297
        L_0x019f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026f }
            r13 = 0
        L_0x01a5:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026f }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.zzkt r2 = r8.f47227b     // Catch:{ IOException -> 0x0242 }
            com.google.android.gms.measurement.internal.zzkv r2 = r2.f47260g     // Catch:{ IOException -> 0x0242 }
            m66032R(r2)     // Catch:{ IOException -> 0x0242 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022d }
            r9.<init>(r0)     // Catch:{ IOException -> 0x022d }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022d }
            r0.<init>(r9)     // Catch:{ IOException -> 0x022d }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022d }
            r3.<init>()     // Catch:{ IOException -> 0x022d }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022d }
            r20 = r4
        L_0x01c9:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022b }
            if (r4 > 0) goto L_0x0226
            r0.close()     // Catch:{ IOException -> 0x022b }
            r9.close()     // Catch:{ IOException -> 0x022b }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022b }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x026d }
            if (r2 != 0) goto L_0x01e5
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01e5
            goto L_0x0268
        L_0x01e5:
            com.google.android.gms.internal.measurement.zzgc r2 = com.google.android.gms.internal.measurement.zzgd.m60024P1()     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.zzll r2 = com.google.android.gms.measurement.internal.zzkv.m66085C(r2, r0)     // Catch:{ IOException -> 0x0211 }
            com.google.android.gms.internal.measurement.zzgc r2 = (com.google.android.gms.internal.measurement.zzgc) r2     // Catch:{ IOException -> 0x0211 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x026d }
            if (r4 != 0) goto L_0x01fd
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo51116e0(r4)     // Catch:{ SQLiteException -> 0x026d }
        L_0x01fd:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x026d }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.zzkf r0 = r2.mo51441o()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.internal.measurement.zzgd r0 = (com.google.android.gms.internal.measurement.zzgd) r0     // Catch:{ SQLiteException -> 0x026d }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x026d }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x026d }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0211:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r2 = r8.f46899a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo55093c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
            goto L_0x0258
        L_0x0226:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022b }
            goto L_0x01c9
        L_0x022b:
            r0 = move-exception
            goto L_0x0230
        L_0x022d:
            r0 = move-exception
            r20 = r4
        L_0x0230:
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ IOException -> 0x0240 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ IOException -> 0x0240 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.mo55092b(r3, r0)     // Catch:{ IOException -> 0x0240 }
            throw r0     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0245
        L_0x0242:
            r0 = move-exception
            r20 = r4
        L_0x0245:
            com.google.android.gms.measurement.internal.zzfr r2 = r8.f46899a     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ SQLiteException -> 0x026d }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ SQLiteException -> 0x026d }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r6)     // Catch:{ SQLiteException -> 0x026d }
            r2.mo55093c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026d }
        L_0x0258:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x026d }
            if (r0 == 0) goto L_0x0268
            if (r13 <= r7) goto L_0x0261
            goto L_0x0268
        L_0x0261:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0268:
            r11.close()     // Catch:{ all -> 0x0580 }
            r0 = r12
            goto L_0x0297
        L_0x026d:
            r0 = move-exception
            goto L_0x027b
        L_0x026f:
            r0 = move-exception
            r20 = r4
            goto L_0x027b
        L_0x0273:
            r0 = move-exception
            r9 = 0
            goto L_0x04f1
        L_0x0277:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x027b:
            com.google.android.gms.measurement.internal.zzfr r2 = r8.f46899a     // Catch:{ all -> 0x04ef }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ all -> 0x04ef }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x04ef }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r6)     // Catch:{ all -> 0x04ef }
            r2.mo55093c(r3, r4, r0)     // Catch:{ all -> 0x04ef }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04ef }
            if (r11 == 0) goto L_0x0297
            r11.close()     // Catch:{ all -> 0x0580 }
        L_0x0297:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0580 }
            if (r2 != 0) goto L_0x0573
            com.google.android.gms.measurement.internal.zzai r2 = r1.mo55518V(r6)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzah r3 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0580 }
            boolean r2 = r2.mo54950i(r3)     // Catch:{ all -> 0x0580 }
            if (r2 == 0) goto L_0x02fe
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0580 }
        L_0x02ad:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0580 }
            if (r3 == 0) goto L_0x02cc
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0580 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0580 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzgd r3 = (com.google.android.gms.internal.measurement.zzgd) r3     // Catch:{ all -> 0x0580 }
            java.lang.String r4 = r3.mo51162L()     // Catch:{ all -> 0x0580 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0580 }
            if (r4 != 0) goto L_0x02ad
            java.lang.String r2 = r3.mo51162L()     // Catch:{ all -> 0x0580 }
            goto L_0x02cd
        L_0x02cc:
            r2 = 0
        L_0x02cd:
            if (r2 == 0) goto L_0x02fe
            r3 = 0
        L_0x02d0:
            int r4 = r0.size()     // Catch:{ all -> 0x0580 }
            if (r3 >= r4) goto L_0x02fe
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0580 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0580 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzgd r4 = (com.google.android.gms.internal.measurement.zzgd) r4     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = r4.mo51162L()     // Catch:{ all -> 0x0580 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x02eb
            goto L_0x02fb
        L_0x02eb:
            java.lang.String r4 = r4.mo51162L()     // Catch:{ all -> 0x0580 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0580 }
            if (r4 != 0) goto L_0x02fb
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x0580 }
            goto L_0x02fe
        L_0x02fb:
            int r3 = r3 + 1
            goto L_0x02d0
        L_0x02fe:
            com.google.android.gms.internal.measurement.zzga r2 = com.google.android.gms.internal.measurement.zzgb.m59934B()     // Catch:{ all -> 0x0580 }
            int r3 = r0.size()     // Catch:{ all -> 0x0580 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0580 }
            int r5 = r0.size()     // Catch:{ all -> 0x0580 }
            r4.<init>(r5)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzag r5 = r22.mo55517U()     // Catch:{ all -> 0x0580 }
            boolean r5 = r5.mo54920C(r6)     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x0327
            com.google.android.gms.measurement.internal.zzai r5 = r1.mo55518V(r6)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzah r7 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0580 }
            boolean r5 = r5.mo54950i(r7)     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x0327
            r5 = 1
            goto L_0x0328
        L_0x0327:
            r5 = 0
        L_0x0328:
            com.google.android.gms.measurement.internal.zzai r7 = r1.mo55518V(r6)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzah r8 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0580 }
            boolean r7 = r7.mo54950i(r8)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzai r8 = r1.mo55518V(r6)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x0580 }
            boolean r8 = r8.mo54950i(r9)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzpd.m61097b()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzag r9 = r22.mo55517U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzdt r10 = com.google.android.gms.measurement.internal.zzdu.f46623n0     // Catch:{ all -> 0x0580 }
            r11 = 0
            boolean r9 = r9.mo54919A(r11, r10)     // Catch:{ all -> 0x0580 }
            if (r9 == 0) goto L_0x035a
            com.google.android.gms.measurement.internal.zzag r9 = r22.mo55517U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzdt r10 = com.google.android.gms.measurement.internal.zzdu.f46627p0     // Catch:{ all -> 0x0580 }
            boolean r9 = r9.mo54919A(r6, r10)     // Catch:{ all -> 0x0580 }
            if (r9 == 0) goto L_0x035a
            r9 = 1
            goto L_0x035b
        L_0x035a:
            r9 = 0
        L_0x035b:
            r10 = 0
        L_0x035c:
            if (r10 >= r3) goto L_0x03da
            java.lang.Object r11 = r0.get(r10)     // Catch:{ all -> 0x0580 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0580 }
            java.lang.Object r11 = r11.first     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzgd r11 = (com.google.android.gms.internal.measurement.zzgd) r11     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzkb r11 = r11.mo51460y()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzgc r11 = (com.google.android.gms.internal.measurement.zzgc) r11     // Catch:{ all -> 0x0580 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ all -> 0x0580 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x0580 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x0580 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0580 }
            r4.add(r12)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzag r12 = r22.mo55517U()     // Catch:{ all -> 0x0580 }
            r12.mo54932o()     // Catch:{ all -> 0x0580 }
            r12 = 74029(0x1212d, double:3.6575E-319)
            r11.mo51122m0(r12)     // Catch:{ all -> 0x0580 }
            r12 = r20
            r11.mo51121k0(r12)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzfr r14 = r1.f47265l     // Catch:{ all -> 0x0580 }
            r14.mo55207h()     // Catch:{ all -> 0x0580 }
            r14 = 0
            r11.mo51117f0(r14)     // Catch:{ all -> 0x0580 }
            if (r5 != 0) goto L_0x039b
            r11.mo51094P0()     // Catch:{ all -> 0x0580 }
        L_0x039b:
            if (r7 != 0) goto L_0x03a3
            r11.mo51106W0()     // Catch:{ all -> 0x0580 }
            r11.mo51099S0()     // Catch:{ all -> 0x0580 }
        L_0x03a3:
            if (r8 != 0) goto L_0x03a8
            r11.mo51088M0()     // Catch:{ all -> 0x0580 }
        L_0x03a8:
            r1.mo55528e(r6, r11)     // Catch:{ all -> 0x0580 }
            if (r9 != 0) goto L_0x03b0
            r11.mo51108X0()     // Catch:{ all -> 0x0580 }
        L_0x03b0:
            com.google.android.gms.measurement.internal.zzag r14 = r22.mo55517U()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzdt r15 = com.google.android.gms.measurement.internal.zzdu.f46591V     // Catch:{ all -> 0x0580 }
            boolean r14 = r14.mo54919A(r6, r15)     // Catch:{ all -> 0x0580 }
            if (r14 == 0) goto L_0x03d2
            com.google.android.gms.internal.measurement.zzkf r14 = r11.mo51441o()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzgd r14 = (com.google.android.gms.internal.measurement.zzgd) r14     // Catch:{ all -> 0x0580 }
            byte[] r14 = r14.mo51306h()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzkv r15 = r1.f47260g     // Catch:{ all -> 0x0580 }
            m66032R(r15)     // Catch:{ all -> 0x0580 }
            long r14 = r15.mo55564v(r14)     // Catch:{ all -> 0x0580 }
            r11.mo51072D(r14)     // Catch:{ all -> 0x0580 }
        L_0x03d2:
            r2.mo51062t(r11)     // Catch:{ all -> 0x0580 }
            int r10 = r10 + 1
            r20 = r12
            goto L_0x035c
        L_0x03da:
            r12 = r20
            com.google.android.gms.measurement.internal.zzeh r0 = r22.mo55221z()     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.mo55095C()     // Catch:{ all -> 0x0580 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x03fc
            com.google.android.gms.measurement.internal.zzkv r0 = r1.f47260g     // Catch:{ all -> 0x0580 }
            m66032R(r0)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzkf r5 = r2.mo51441o()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzgb r5 = (com.google.android.gms.internal.measurement.zzgb) r5     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.mo55555D(r5)     // Catch:{ all -> 0x0580 }
            r11 = r0
            goto L_0x03fd
        L_0x03fc:
            r11 = 0
        L_0x03fd:
            com.google.android.gms.measurement.internal.zzkv r0 = r1.f47260g     // Catch:{ all -> 0x0580 }
            m66032R(r0)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzkf r0 = r2.mo51441o()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.internal.measurement.zzgb r0 = (com.google.android.gms.internal.measurement.zzgb) r0     // Catch:{ all -> 0x0580 }
            byte[] r14 = r0.mo51306h()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzki r0 = r1.f47263j     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzkt r0 = r0.f47227b     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzfi r0 = r0.f47254a     // Catch:{ all -> 0x0580 }
            m66032R(r0)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.mo55166u(r6)     // Catch:{ all -> 0x0580 }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0580 }
            if (r5 != 0) goto L_0x0454
            com.google.android.gms.measurement.internal.zzdt r5 = com.google.android.gms.measurement.internal.zzdu.f46630r     // Catch:{ all -> 0x0580 }
            r7 = 0
            java.lang.Object r5 = r5.mo55037a(r7)     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0580 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0580 }
            android.net.Uri$Builder r7 = r5.buildUpon()     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = r5.getAuthority()     // Catch:{ all -> 0x0580 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0580 }
            r8.<init>()     // Catch:{ all -> 0x0580 }
            r8.append(r0)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = "."
            r8.append(r0)     // Catch:{ all -> 0x0580 }
            r8.append(r5)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0580 }
            r7.authority(r0)     // Catch:{ all -> 0x0580 }
            android.net.Uri r0 = r7.build()     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0580 }
            goto L_0x045d
        L_0x0454:
            com.google.android.gms.measurement.internal.zzdt r0 = com.google.android.gms.measurement.internal.zzdu.f46630r     // Catch:{ all -> 0x0580 }
            r5 = 0
            java.lang.Object r0 = r0.mo55037a(r5)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0580 }
        L_0x045d:
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04dc }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x04dc }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x04dc }
            r8 = 1
            r7 = r7 ^ r8
            com.google.android.gms.common.internal.Preconditions.m4478a(r7)     // Catch:{ MalformedURLException -> 0x04dc }
            java.util.List r7 = r1.f47277x     // Catch:{ MalformedURLException -> 0x04dc }
            if (r7 == 0) goto L_0x047d
            com.google.android.gms.measurement.internal.zzeh r4 = r22.mo55221z()     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55098p()     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.mo55091a(r7)     // Catch:{ MalformedURLException -> 0x04dc }
            goto L_0x0484
        L_0x047d:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x04dc }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x04dc }
            r1.f47277x = r7     // Catch:{ MalformedURLException -> 0x04dc }
        L_0x0484:
            com.google.android.gms.measurement.internal.zzjo r4 = r1.f47262i     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.zzes r4 = r4.f47184h     // Catch:{ MalformedURLException -> 0x04dc }
            r4.mo55121b(r12)     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x0498
            r3 = 0
            com.google.android.gms.internal.measurement.zzgd r2 = r2.mo51063u(r3)     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.String r4 = r2.mo51174T1()     // Catch:{ MalformedURLException -> 0x04dc }
        L_0x0498:
            com.google.android.gms.measurement.internal.zzeh r2 = r22.mo55221z()     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55102t()     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x04dc }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x04dc }
            r2.mo55094d(r3, r4, r7, r11)     // Catch:{ MalformedURLException -> 0x04dc }
            r2 = 1
            r1.f47273t = r2     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.zzen r11 = r1.f47255b     // Catch:{ MalformedURLException -> 0x04dc }
            m66032R(r11)     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.zzkk r2 = new com.google.android.gms.measurement.internal.zzkk     // Catch:{ MalformedURLException -> 0x04dc }
            r2.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x04dc }
            r11.mo55073e()     // Catch:{ MalformedURLException -> 0x04dc }
            r11.mo55503f()     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.common.internal.Preconditions.m4488k(r5)     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.common.internal.Preconditions.m4488k(r14)     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.common.internal.Preconditions.m4488k(r2)     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.zzfr r3 = r11.f46899a     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.zzfo r3 = r3.mo55185B()     // Catch:{ MalformedURLException -> 0x04dc }
            com.google.android.gms.measurement.internal.zzem r4 = new com.google.android.gms.measurement.internal.zzem     // Catch:{ MalformedURLException -> 0x04dc }
            r15 = 0
            r10 = r4
            r12 = r6
            r13 = r5
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x04dc }
            r3.mo55180w(r4)     // Catch:{ MalformedURLException -> 0x04dc }
            goto L_0x0573
        L_0x04dc:
            com.google.android.gms.measurement.internal.zzeh r2 = r22.mo55221z()     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x0580 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r6)     // Catch:{ all -> 0x0580 }
            r2.mo55093c(r3, r4, r0)     // Catch:{ all -> 0x0580 }
            goto L_0x0573
        L_0x04ef:
            r0 = move-exception
            r9 = r11
        L_0x04f1:
            if (r9 == 0) goto L_0x04f6
            r9.close()     // Catch:{ all -> 0x0580 }
        L_0x04f6:
            throw r0     // Catch:{ all -> 0x0580 }
        L_0x04f7:
            r12 = r4
            r5 = r9
            r1.f47279z = r7     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0580 }
            m66032R(r2)     // Catch:{ all -> 0x0580 }
            r22.mo55517U()     // Catch:{ all -> 0x0580 }
            long r3 = com.google.android.gms.measurement.internal.zzag.m65356I()     // Catch:{ all -> 0x0580 }
            long r3 = r12 - r3
            r2.mo55073e()     // Catch:{ all -> 0x0580 }
            r2.mo55503f()     // Catch:{ all -> 0x0580 }
            android.database.sqlite.SQLiteDatabase r0 = r2.mo54965P()     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            r4 = 0
            r6[r4] = r3     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r3, r6)     // Catch:{ SQLiteException -> 0x054a, all -> 0x0547 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0545 }
            if (r0 != 0) goto L_0x053c
            com.google.android.gms.measurement.internal.zzfr r0 = r2.f46899a     // Catch:{ SQLiteException -> 0x0545 }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ SQLiteException -> 0x0545 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55102t()     // Catch:{ SQLiteException -> 0x0545 }
            java.lang.String r3 = "No expired configs for apps with pending events"
            r0.mo55091a(r3)     // Catch:{ SQLiteException -> 0x0545 }
        L_0x0538:
            r11.close()     // Catch:{ all -> 0x0580 }
            goto L_0x055e
        L_0x053c:
            r3 = 0
            java.lang.String r9 = r11.getString(r3)     // Catch:{ SQLiteException -> 0x0545 }
            r11.close()     // Catch:{ all -> 0x0580 }
            goto L_0x055f
        L_0x0545:
            r0 = move-exception
            goto L_0x054c
        L_0x0547:
            r0 = move-exception
            r9 = r5
            goto L_0x057a
        L_0x054a:
            r0 = move-exception
            r11 = r5
        L_0x054c:
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a     // Catch:{ all -> 0x0578 }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ all -> 0x0578 }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x0578 }
            java.lang.String r3 = "Error selecting expired configs"
            r2.mo55092b(r3, r0)     // Catch:{ all -> 0x0578 }
            if (r11 == 0) goto L_0x055e
            goto L_0x0538
        L_0x055e:
            r9 = r5
        L_0x055f:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0573
            com.google.android.gms.measurement.internal.zzam r0 = r1.f47256c     // Catch:{ all -> 0x0580 }
            m66032R(r0)     // Catch:{ all -> 0x0580 }
            com.google.android.gms.measurement.internal.zzh r0 = r0.mo54967R(r9)     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x0573
            r1.mo55530f(r0)     // Catch:{ all -> 0x0580 }
        L_0x0573:
            r2 = 0
            r1.f47274u = r2
            goto L_0x0030
        L_0x0578:
            r0 = move-exception
            r9 = r11
        L_0x057a:
            if (r9 == 0) goto L_0x057f
            r9.close()     // Catch:{ all -> 0x0580 }
        L_0x057f:
            throw r0     // Catch:{ all -> 0x0580 }
        L_0x0580:
            r0 = move-exception
            r2 = 0
            r1.f47274u = r2
            r22.m66025K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkt.mo55511C():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x073f, code lost:
        if (r14.isEmpty() != false) goto L_0x0741;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0932, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x030b A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0369 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04f9 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0538 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05b1 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x05fe A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x060b A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0618 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0650 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0661 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06a2 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x06bd A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0744 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x078a A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07d2 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x07eb A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0877 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0896 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0928 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x09d3 A[Catch:{ SQLiteException -> 0x09ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x09e9  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0934 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0155 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016b A[SYNTHETIC, Splitter:B:46:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e6 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02be A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0308 A[Catch:{ NumberFormatException -> 0x0729, all -> 0x0a6a }] */
    @androidx.annotation.WorkerThread
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55512D(com.google.android.gms.measurement.internal.zzaw r35, com.google.android.gms.measurement.internal.zzq r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.Preconditions.m4488k(r36)
            java.lang.String r8 = r3.f47326a
            com.google.android.gms.common.internal.Preconditions.m4484g(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzfo r10 = r34.mo55185B()
            r10.mo55073e()
            r34.mo55526d()
            java.lang.String r10 = r3.f47326a
            com.google.android.gms.measurement.internal.zzkv r11 = r1.f47260g
            m66032R(r11)
            boolean r11 = com.google.android.gms.measurement.internal.zzkv.m66090k(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f47333s
            if (r11 == 0) goto L_0x0a75
            com.google.android.gms.measurement.internal.zzfi r11 = r1.f47254a
            m66032R(r11)
            java.lang.String r12 = r2.f46479a
            boolean r11 = r11.mo55153F(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.zzeh r3 = r34.mo55221z()
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55103u()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)
            com.google.android.gms.measurement.internal.zzfr r5 = r1.f47265l
            com.google.android.gms.measurement.internal.zzec r5 = r5.mo55187D()
            java.lang.String r6 = r2.f46479a
            java.lang.String r5 = r5.mo55087d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.mo55093c(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzfi r3 = r1.f47254a
            m66032R(r3)
            boolean r3 = r3.mo55151D(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.zzfi r3 = r1.f47254a
            m66032R(r3)
            boolean r3 = r3.mo55154G(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f46479a
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzlb r11 = r34.mo55533h0()
            com.google.android.gms.measurement.internal.zzla r12 = r1.f47253E
            r14 = 11
            java.lang.String r2 = r2.f46479a
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.mo55573A(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            com.google.android.gms.measurement.internal.zzh r2 = r2.mo54967R(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.mo55275V()
            long r5 = r2.mo55266M()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.Clock r5 = r34.mo55201a()
            long r5 = r5.mo21950a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.mo55517U()
            com.google.android.gms.measurement.internal.zzdt r5 = com.google.android.gms.measurement.internal.zzdu.f46570A
            java.lang.Object r5 = r5.mo55037a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.zzeh r3 = r34.mo55221z()
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55097o()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.mo55091a(r4)
            r1.mo55530f(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.zzei r2 = com.google.android.gms.measurement.internal.zzei.m65580b(r35)
            com.google.android.gms.measurement.internal.zzlb r11 = r34.mo55533h0()
            com.google.android.gms.measurement.internal.zzag r12 = r34.mo55517U()
            int r12 = r12.mo54929l(r10)
            r11.mo55618y(r2, r12)
            com.google.android.gms.measurement.internal.zzaw r2 = r2.mo55106a()
            com.google.android.gms.measurement.internal.zzeh r11 = r34.mo55221z()
            java.lang.String r11 = r11.mo55095C()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.zzeh r11 = r34.mo55221z()
            com.google.android.gms.measurement.internal.zzef r11 = r11.mo55102t()
            com.google.android.gms.measurement.internal.zzfr r12 = r1.f47265l
            com.google.android.gms.measurement.internal.zzec r12 = r12.mo55187D()
            java.lang.String r12 = r12.mo55086c(r2)
            java.lang.String r13 = "Logging event"
            r11.mo55092b(r13, r12)
        L_0x011c:
            com.google.android.gms.measurement.internal.zzam r11 = r1.f47256c
            m66032R(r11)
            r11.mo54979e0()
            r1.mo55515S(r3)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x014a
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0a6a }
            if (r9 != 0) goto L_0x014a
            java.lang.String r9 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a6a }
            if (r9 == 0) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r9 = 0
            goto L_0x014b
        L_0x014a:
            r9 = 1
        L_0x014b:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0a6a }
            if (r11 != 0) goto L_0x015f
            if (r9 == 0) goto L_0x0159
            r9 = 1
            goto L_0x015f
        L_0x0159:
            r33 = r4
            r8 = r15
        L_0x015c:
            r4 = 2
            goto L_0x02f5
        L_0x015f:
            com.google.android.gms.measurement.internal.zzau r11 = r2.f46480c     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.mo55020q2(r13)     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.zzau r9 = r2.f46480c     // Catch:{ all -> 0x0a6a }
            java.lang.Double r9 = r9.mo55017n2(r13)     // Catch:{ all -> 0x0a6a }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0a6a }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x0192
            com.google.android.gms.measurement.internal.zzau r9 = r2.f46480c     // Catch:{ all -> 0x0a6a }
            java.lang.Long r9 = r9.mo55018o2(r13)     // Catch:{ all -> 0x0a6a }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0a6a }
            double r13 = (double) r14     // Catch:{ all -> 0x0a6a }
            double r17 = r13 * r19
            goto L_0x0194
        L_0x0192:
            r21 = r15
        L_0x0194:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x01ae
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x01ae
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0a6a }
            if (r9 == 0) goto L_0x01e0
            long r13 = -r13
            goto L_0x01e0
        L_0x01ae:
            com.google.android.gms.measurement.internal.zzeh r2 = r34.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55103u()     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0a6a }
            r2.mo55093c(r3, r4, r5)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo54985m()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            return
        L_0x01d4:
            r21 = r15
            com.google.android.gms.measurement.internal.zzau r9 = r2.f46480c     // Catch:{ all -> 0x0a6a }
            java.lang.Long r9 = r9.mo55018o2(r13)     // Catch:{ all -> 0x0a6a }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0a6a }
        L_0x01e0:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a6a }
            if (r9 != 0) goto L_0x02ef
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x02ef
            java.lang.String r11 = "_ltv_"
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r11 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzky r11 = r11.mo54972X(r10, r9)     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x023a
            java.lang.Object r11 = r11.f47292e     // Catch:{ all -> 0x0a6a }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a6a }
            if (r12 != 0) goto L_0x020c
            goto L_0x023a
        L_0x020c:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0a6a }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzky r18 = new com.google.android.gms.measurement.internal.zzky     // Catch:{ all -> 0x0a6a }
            java.lang.String r15 = r2.f46481d     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.util.Clock r17 = r34.mo55201a()     // Catch:{ all -> 0x0a6a }
            long r19 = r17.mo21950a()     // Catch:{ all -> 0x0a6a }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a6a }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = 0
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a6a }
            r33 = r4
            r8 = r9
            r9 = r18
            r4 = 2
            goto L_0x02b3
        L_0x023a:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.zzam r11 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzag r12 = r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzdt r8 = com.google.android.gms.measurement.internal.zzdu.f46575F     // Catch:{ all -> 0x0a6a }
            int r8 = r12.mo54930m(r10, r8)     // Catch:{ all -> 0x0a6a }
            int r8 = r8 + -1
            com.google.android.gms.common.internal.Preconditions.m4484g(r10)     // Catch:{ all -> 0x0a6a }
            r11.mo55073e()     // Catch:{ all -> 0x0a6a }
            r11.mo55503f()     // Catch:{ all -> 0x0a6a }
            android.database.sqlite.SQLiteDatabase r12 = r11.mo54965P()     // Catch:{ SQLiteException -> 0x027d }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0279 }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x0279 }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x0279 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0279 }
            r33 = r4
            r4 = 2
            r15[r4] = r8     // Catch:{ SQLiteException -> 0x0277 }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x0277 }
            goto L_0x0297
        L_0x0277:
            r0 = move-exception
            goto L_0x0283
        L_0x0279:
            r0 = move-exception
            r33 = r4
            goto L_0x0282
        L_0x027d:
            r0 = move-exception
            r33 = r4
            r21 = r15
        L_0x0282:
            r4 = 2
        L_0x0283:
            r8 = r0
            com.google.android.gms.measurement.internal.zzfr r11 = r11.f46899a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzeh r11 = r11.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r11 = r11.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            r11.mo55093c(r12, r15, r8)     // Catch:{ all -> 0x0a6a }
        L_0x0297:
            com.google.android.gms.measurement.internal.zzky r18 = new com.google.android.gms.measurement.internal.zzky     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r2.f46481d     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.util.Clock r11 = r34.mo55201a()     // Catch:{ all -> 0x0a6a }
            long r15 = r11.mo21950a()     // Catch:{ all -> 0x0a6a }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0a6a }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a6a }
            r9 = r18
        L_0x02b3:
            com.google.android.gms.measurement.internal.zzam r11 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r11)     // Catch:{ all -> 0x0a6a }
            boolean r11 = r11.mo54994v(r9)     // Catch:{ all -> 0x0a6a }
            if (r11 != 0) goto L_0x02f5
            com.google.android.gms.measurement.internal.zzeh r11 = r34.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r11 = r11.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r14 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzec r14 = r14.mo55187D()     // Catch:{ all -> 0x0a6a }
            java.lang.String r15 = r9.f47290c     // Catch:{ all -> 0x0a6a }
            java.lang.String r14 = r14.mo55089f(r15)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r9 = r9.f47292e     // Catch:{ all -> 0x0a6a }
            r11.mo55094d(r12, r13, r14, r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzlb r11 = r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzla r12 = r1.f47253E     // Catch:{ all -> 0x0a6a }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo55573A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a6a }
            goto L_0x02f5
        L_0x02ef:
            r33 = r4
            r8 = r21
            goto L_0x015c
        L_0x02f5:
            java.lang.String r9 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            boolean r9 = com.google.android.gms.measurement.internal.zzlb.m66121X(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0a6a }
            r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzau r11 = r2.f46480c     // Catch:{ all -> 0x0a6a }
            if (r11 != 0) goto L_0x030b
            r16 = 0
            goto L_0x032b
        L_0x030b:
            com.google.android.gms.measurement.internal.zzat r12 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0a6a }
            r12.<init>(r11)     // Catch:{ all -> 0x0a6a }
            r16 = 0
        L_0x0312:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0a6a }
            if (r13 == 0) goto L_0x032b
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r13 = r11.mo55019p2(r13)     // Catch:{ all -> 0x0a6a }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0a6a }
            if (r14 == 0) goto L_0x0312
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0a6a }
            int r13 = r13.length     // Catch:{ all -> 0x0a6a }
            long r13 = (long) r13     // Catch:{ all -> 0x0a6a }
            long r16 = r16 + r13
            goto L_0x0312
        L_0x032b:
            r22 = 1
            long r15 = r16 + r22
            com.google.android.gms.measurement.internal.zzam r11 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r11)     // Catch:{ all -> 0x0a6a }
            long r12 = r34.mo55514F()     // Catch:{ all -> 0x0a6a }
            r17 = 1
            r20 = 0
            r21 = 0
            r30 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            com.google.android.gms.measurement.internal.zzak r11 = r11.mo54970U(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0a6a }
            long r12 = r11.f46433b     // Catch:{ all -> 0x0a6a }
            r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzdt r14 = com.google.android.gms.measurement.internal.zzdu.f46618l     // Catch:{ all -> 0x0a6a }
            r15 = 0
            java.lang.Object r14 = r14.mo55037a(r15)     // Catch:{ all -> 0x0a6a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a6a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a6a }
            long r4 = (long) r14     // Catch:{ all -> 0x0a6a }
            long r12 = r12 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            r16 = 0
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x0396
            long r12 = r12 % r4
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0385
            com.google.android.gms.measurement.internal.zzeh r2 = r34.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            long r5 = r11.f46433b     // Catch:{ all -> 0x0a6a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a6a }
            r2.mo55093c(r3, r4, r5)     // Catch:{ all -> 0x0a6a }
        L_0x0385:
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo54985m()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            return
        L_0x0396:
            if (r9 == 0) goto L_0x03f4
            long r12 = r11.f46432a     // Catch:{ all -> 0x0a6a }
            r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzdt r14 = com.google.android.gms.measurement.internal.zzdu.f46622n     // Catch:{ all -> 0x0a6a }
            java.lang.Object r14 = r14.mo55037a(r15)     // Catch:{ all -> 0x0a6a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a6a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a6a }
            long r4 = (long) r14     // Catch:{ all -> 0x0a6a }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x03f4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r4
            int r3 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x03cf
            com.google.android.gms.measurement.internal.zzeh r3 = r34.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            long r6 = r11.f46432a     // Catch:{ all -> 0x0a6a }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a6a }
            r3.mo55093c(r4, r5, r6)     // Catch:{ all -> 0x0a6a }
        L_0x03cf:
            com.google.android.gms.measurement.internal.zzlb r11 = r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzla r12 = r1.f47253E     // Catch:{ all -> 0x0a6a }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.mo55573A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo54985m()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            return
        L_0x03f4:
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0444
            long r12 = r11.f46435d     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzag r5 = r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzdt r14 = com.google.android.gms.measurement.internal.zzdu.f46620m     // Catch:{ all -> 0x0a6a }
            int r5 = r5.mo54930m(r8, r14)     // Catch:{ all -> 0x0a6a }
            int r5 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0a6a }
            r8 = 0
            int r5 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x0a6a }
            long r4 = (long) r5     // Catch:{ all -> 0x0a6a }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0444
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x0433
            com.google.android.gms.measurement.internal.zzeh r2 = r34.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            long r5 = r11.f46435d     // Catch:{ all -> 0x0a6a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a6a }
            r2.mo55093c(r3, r4, r5)     // Catch:{ all -> 0x0a6a }
        L_0x0433:
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo54985m()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            return
        L_0x0444:
            com.google.android.gms.measurement.internal.zzau r4 = r2.f46480c     // Catch:{ all -> 0x0a6a }
            android.os.Bundle r4 = r4.mo55016m2()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzlb r5 = r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = "_o"
            java.lang.String r12 = r2.f46481d     // Catch:{ all -> 0x0a6a }
            r5.mo55574C(r4, r11, r12)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzlb r5 = r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            boolean r5 = r5.mo55591T(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.String r14 = "_r"
            if (r5 == 0) goto L_0x0475
            com.google.android.gms.measurement.internal.zzlb r5 = r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = "_dbg"
            r5.mo55574C(r4, r12, r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzlb r5 = r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            r5.mo55574C(r4, r14, r11)     // Catch:{ all -> 0x0a6a }
        L_0x0475:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0a6a }
            if (r5 == 0) goto L_0x049b
            com.google.android.gms.measurement.internal.zzam r5 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r5)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzky r5 = r5.mo54972X(r11, r7)     // Catch:{ all -> 0x0a6a }
            if (r5 == 0) goto L_0x049b
            java.lang.Object r11 = r5.f47292e     // Catch:{ all -> 0x0a6a }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x049b
            com.google.android.gms.measurement.internal.zzlb r11 = r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r5 = r5.f47292e     // Catch:{ all -> 0x0a6a }
            r11.mo55574C(r4, r7, r5)     // Catch:{ all -> 0x0a6a }
        L_0x049b:
            com.google.android.gms.measurement.internal.zzam r5 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r5)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.internal.Preconditions.m4484g(r10)     // Catch:{ all -> 0x0a6a }
            r5.mo55073e()     // Catch:{ all -> 0x0a6a }
            r5.mo55503f()     // Catch:{ all -> 0x0a6a }
            android.database.sqlite.SQLiteDatabase r7 = r5.mo54965P()     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.zzfr r11 = r5.f46899a     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.zzag r11 = r11.mo55219x()     // Catch:{ SQLiteException -> 0x04db }
            com.google.android.gms.measurement.internal.zzdt r12 = com.google.android.gms.measurement.internal.zzdu.f46628q     // Catch:{ SQLiteException -> 0x04db }
            int r11 = r11.mo54930m(r10, r12)     // Catch:{ SQLiteException -> 0x04db }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r8, r11)     // Catch:{ SQLiteException -> 0x04db }
            r13 = 0
            int r8 = java.lang.Math.max(r13, r8)     // Catch:{ SQLiteException -> 0x04d9 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x04d9 }
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x04d9 }
            r11[r13] = r10     // Catch:{ SQLiteException -> 0x04d9 }
            r12 = 1
            r11[r12] = r8     // Catch:{ SQLiteException -> 0x04d9 }
            java.lang.String r8 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r8, r11)     // Catch:{ SQLiteException -> 0x04d9 }
            long r7 = (long) r5
            goto L_0x04f3
        L_0x04d9:
            r0 = move-exception
            goto L_0x04dd
        L_0x04db:
            r0 = move-exception
            r13 = 0
        L_0x04dd:
            r7 = r0
            com.google.android.gms.measurement.internal.zzfr r5 = r5.f46899a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            r5.mo55093c(r8, r11, r7)     // Catch:{ all -> 0x0a6a }
            r7 = 0
        L_0x04f3:
            r11 = 0
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x050e
            com.google.android.gms.measurement.internal.zzeh r5 = r34.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55103u()     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0a6a }
            r5.mo55093c(r11, r12, r7)     // Catch:{ all -> 0x0a6a }
        L_0x050e:
            com.google.android.gms.measurement.internal.zzar r5 = new com.google.android.gms.measurement.internal.zzar     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r12 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = r2.f46481d     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r2.f46479a     // Catch:{ all -> 0x0a6a }
            long r2 = r2.f46482f     // Catch:{ all -> 0x0a6a }
            r18 = 0
            r11 = r5
            r31 = 0
            r13 = r7
            r7 = r14
            r14 = r10
            r32 = r6
            r6 = r15
            r15 = r8
            r16 = r2
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.zzfr) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r2)     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = r5.f46460b     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzas r2 = r2.mo54971V(r10, r3)     // Catch:{ all -> 0x0a6a }
            if (r2 != 0) goto L_0x05b1
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r2)     // Catch:{ all -> 0x0a6a }
            long r2 = r2.mo54964O(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzag r4 = r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            int r4 = r4.mo54927j(r10)     // Catch:{ all -> 0x0a6a }
            long r11 = (long) r4     // Catch:{ all -> 0x0a6a }
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0593
            if (r9 == 0) goto L_0x0593
            com.google.android.gms.measurement.internal.zzeh r2 = r34.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.m65566x(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r6 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzec r6 = r6.mo55187D()     // Catch:{ all -> 0x0a6a }
            java.lang.String r5 = r5.f46460b     // Catch:{ all -> 0x0a6a }
            java.lang.String r5 = r6.mo55087d(r5)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzag r6 = r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            int r6 = r6.mo54927j(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a6a }
            r2.mo55094d(r3, r4, r5, r6)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzlb r11 = r34.mo55533h0()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzla r12 = r1.f47253E     // Catch:{ all -> 0x0a6a }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.mo55573A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            return
        L_0x0593:
            com.google.android.gms.measurement.internal.zzas r2 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = r5.f46460b     // Catch:{ all -> 0x0a6a }
            long r3 = r5.f46462d     // Catch:{ all -> 0x0a6a }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0a6a }
            goto L_0x05bf
        L_0x05b1:
            com.google.android.gms.measurement.internal.zzfr r3 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            long r8 = r2.f46470f     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzar r5 = r5.mo55006a(r3, r8)     // Catch:{ all -> 0x0a6a }
            long r3 = r5.f46462d     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzas r2 = r2.mo55010c(r3)     // Catch:{ all -> 0x0a6a }
        L_0x05bf:
            com.google.android.gms.measurement.internal.zzam r3 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r3)     // Catch:{ all -> 0x0a6a }
            r3.mo54987o(r2)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfo r2 = r34.mo55185B()     // Catch:{ all -> 0x0a6a }
            r2.mo55073e()     // Catch:{ all -> 0x0a6a }
            r34.mo55526d()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.internal.Preconditions.m4488k(r5)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.internal.Preconditions.m4488k(r36)     // Catch:{ all -> 0x0a6a }
            java.lang.String r2 = r5.f46459a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.internal.Preconditions.m4484g(r2)     // Catch:{ all -> 0x0a6a }
            java.lang.String r2 = r5.f46459a     // Catch:{ all -> 0x0a6a }
            r3 = r36
            java.lang.String r4 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.internal.Preconditions.m4478a(r2)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.internal.measurement.zzgc r2 = com.google.android.gms.internal.measurement.zzgd.m60024P1()     // Catch:{ all -> 0x0a6a }
            r4 = 1
            r2.mo51114c0(r4)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = "android"
            r2.mo51107X(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0603
            java.lang.String r8 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            r2.mo51133x(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0603:
            java.lang.String r8 = r3.f47329f     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0610
            java.lang.String r8 = r3.f47329f     // Catch:{ all -> 0x0a6a }
            r2.mo51136z(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0610:
            java.lang.String r8 = r3.f47328d     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x061d
            java.lang.String r8 = r3.f47328d     // Catch:{ all -> 0x0a6a }
            r2.mo51066A(r8)     // Catch:{ all -> 0x0a6a }
        L_0x061d:
            com.google.android.gms.internal.measurement.zzpd.m61097b()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzag r8 = r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzdt r9 = com.google.android.gms.measurement.internal.zzdu.f46623n0     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.mo54919A(r6, r9)     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x0647
            com.google.android.gms.measurement.internal.zzag r8 = r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzdt r10 = com.google.android.gms.measurement.internal.zzdu.f46627p0     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.mo54919A(r9, r10)     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x0647
            java.lang.String r8 = r3.f47325O     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0647
            java.lang.String r8 = r3.f47325O     // Catch:{ all -> 0x0a6a }
            r2.mo51118g0(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0647:
            long r8 = r3.f47311A     // Catch:{ all -> 0x0a6a }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0654
            int r9 = (int) r8     // Catch:{ all -> 0x0a6a }
            r2.mo51068B(r9)     // Catch:{ all -> 0x0a6a }
        L_0x0654:
            long r8 = r3.f47330g     // Catch:{ all -> 0x0a6a }
            r2.mo51098S(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r3.f47327c     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0666
            java.lang.String r8 = r3.f47327c     // Catch:{ all -> 0x0a6a }
            r2.mo51096R(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0666:
            java.lang.String r8 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.m4488k(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzai r8 = r1.mo55518V(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f47323M     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzai r9 = com.google.android.gms.measurement.internal.zzai.m65384b(r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzai r8 = r8.mo54943c(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r8.mo54948h()     // Catch:{ all -> 0x0a6a }
            r2.mo51076G(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r2.mo51128t0()     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x069a
            java.lang.String r8 = r3.f47318H     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x069a
            java.lang.String r8 = r3.f47318H     // Catch:{ all -> 0x0a6a }
            r2.mo51131v(r8)     // Catch:{ all -> 0x0a6a }
        L_0x069a:
            long r8 = r3.f47331o     // Catch:{ all -> 0x0a6a }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06a5
            r2.mo51078H(r8)     // Catch:{ all -> 0x0a6a }
        L_0x06a5:
            long r8 = r3.f47320J     // Catch:{ all -> 0x0a6a }
            r2.mo51085L(r8)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzkv r8 = r1.f47260g     // Catch:{ all -> 0x0a6a }
            m66032R(r8)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzkt r9 = r8.f47227b     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r9 = r9.f47265l     // Catch:{ all -> 0x0a6a }
            android.content.Context r9 = r9.mo55202c()     // Catch:{ all -> 0x0a6a }
            java.util.Map r9 = com.google.android.gms.measurement.internal.zzdu.m65485c(r9)     // Catch:{ all -> 0x0a6a }
            if (r9 == 0) goto L_0x0741
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x06c5
            goto L_0x0741
        L_0x06c5:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0a6a }
            r14.<init>()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzdt r10 = com.google.android.gms.measurement.internal.zzdu.f46586Q     // Catch:{ all -> 0x0a6a }
            java.lang.Object r10 = r10.mo55037a(r6)     // Catch:{ all -> 0x0a6a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0a6a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0a6a }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0a6a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0a6a }
        L_0x06de:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x073b
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0a6a }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0a6a }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0a6a }
            if (r12 == 0) goto L_0x06de
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x0729 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0729 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0729 }
            if (r11 == 0) goto L_0x06de
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x0729 }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x0729 }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x0729 }
            if (r11 < r10) goto L_0x06de
            com.google.android.gms.measurement.internal.zzfr r11 = r8.f46899a     // Catch:{ NumberFormatException -> 0x0729 }
            com.google.android.gms.measurement.internal.zzeh r11 = r11.mo55221z()     // Catch:{ NumberFormatException -> 0x0729 }
            com.google.android.gms.measurement.internal.zzef r11 = r11.mo55103u()     // Catch:{ NumberFormatException -> 0x0729 }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x0729 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0729 }
            r11.mo55092b(r12, r13)     // Catch:{ NumberFormatException -> 0x0729 }
            goto L_0x073b
        L_0x0729:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.zzfr r12 = r8.f46899a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzeh r12 = r12.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r12 = r12.mo55103u()     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.mo55092b(r13, r11)     // Catch:{ all -> 0x0a6a }
            goto L_0x06de
        L_0x073b:
            boolean r8 = r14.isEmpty()     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x0742
        L_0x0741:
            r14 = r6
        L_0x0742:
            if (r14 == 0) goto L_0x0747
            r2.mo51077G0(r14)     // Catch:{ all -> 0x0a6a }
        L_0x0747:
            java.lang.String r8 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.m4488k(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzai r8 = r1.mo55518V(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f47323M     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzai r9 = com.google.android.gms.measurement.internal.zzai.m65384b(r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzai r8 = r8.mo54943c(r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.AD_STORAGE     // Catch:{ all -> 0x0a6a }
            boolean r10 = r8.mo54950i(r9)     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x0793
            boolean r10 = r3.f47316F     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x0793
            com.google.android.gms.measurement.internal.zzjo r10 = r1.f47262i     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            android.util.Pair r10 = r10.mo55469l(r11, r8)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0a6a }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x0a6a }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0a6a }
            if (r11 != 0) goto L_0x0793
            boolean r11 = r3.f47316F     // Catch:{ all -> 0x0a6a }
            if (r11 == 0) goto L_0x0793
            java.lang.Object r11 = r10.first     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0a6a }
            r2.mo51115d0(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r10 = r10.second     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x0793
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0a6a }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0a6a }
            r2.mo51102U(r10)     // Catch:{ all -> 0x0a6a }
        L_0x0793:
            com.google.android.gms.measurement.internal.zzfr r10 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzaq r10 = r10.mo55220y()     // Catch:{ all -> 0x0a6a }
            r10.mo55243i()     // Catch:{ all -> 0x0a6a }
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0a6a }
            r2.mo51081J(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r10 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzaq r10 = r10.mo55220y()     // Catch:{ all -> 0x0a6a }
            r10.mo55243i()     // Catch:{ all -> 0x0a6a }
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a6a }
            r2.mo51104V(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r10 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzaq r10 = r10.mo55220y()     // Catch:{ all -> 0x0a6a }
            long r10 = r10.mo55002n()     // Catch:{ all -> 0x0a6a }
            int r11 = (int) r10     // Catch:{ all -> 0x0a6a }
            r2.mo51120j0(r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r10 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzaq r10 = r10.mo55220y()     // Catch:{ all -> 0x0a6a }
            java.lang.String r10 = r10.mo55003o()     // Catch:{ all -> 0x0a6a }
            r2.mo51124p0(r10)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r10 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            boolean r10 = r10.mo55212m()     // Catch:{ all -> 0x0a6a }
            if (r10 == 0) goto L_0x07de
            r2.mo51126s0()     // Catch:{ all -> 0x0a6a }
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a6a }
            if (r10 != 0) goto L_0x07de
            r2.mo51083K(r6)     // Catch:{ all -> 0x0a6a }
        L_0x07de:
            com.google.android.gms.measurement.internal.zzam r10 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r10)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzh r10 = r10.mo54967R(r11)     // Catch:{ all -> 0x0a6a }
            if (r10 != 0) goto L_0x084e
            com.google.android.gms.measurement.internal.zzh r10 = new com.google.android.gms.measurement.internal.zzh     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzfr r11 = r1.f47265l     // Catch:{ all -> 0x0a6a }
            java.lang.String r12 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            r10.<init>(r11, r12)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r1.mo55535i0(r8)     // Catch:{ all -> 0x0a6a }
            r10.mo55294h(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f47312B     // Catch:{ all -> 0x0a6a }
            r10.mo55311v(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f47327c     // Catch:{ all -> 0x0a6a }
            r10.mo55312w(r11)     // Catch:{ all -> 0x0a6a }
            boolean r9 = r8.mo54950i(r9)     // Catch:{ all -> 0x0a6a }
            if (r9 == 0) goto L_0x0818
            com.google.android.gms.measurement.internal.zzjo r9 = r1.f47262i     // Catch:{ all -> 0x0a6a }
            java.lang.String r11 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            boolean r12 = r3.f47316F     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r9.mo55470m(r11, r12)     // Catch:{ all -> 0x0a6a }
            r10.mo55259F(r9)     // Catch:{ all -> 0x0a6a }
        L_0x0818:
            r11 = 0
            r10.mo55255B(r11)     // Catch:{ all -> 0x0a6a }
            r10.mo55256C(r11)     // Catch:{ all -> 0x0a6a }
            r10.mo55315z(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f47328d     // Catch:{ all -> 0x0a6a }
            r10.mo55298j(r9)     // Catch:{ all -> 0x0a6a }
            long r11 = r3.f47311A     // Catch:{ all -> 0x0a6a }
            r10.mo55300k(r11)     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r3.f47329f     // Catch:{ all -> 0x0a6a }
            r10.mo55296i(r9)     // Catch:{ all -> 0x0a6a }
            long r11 = r3.f47330g     // Catch:{ all -> 0x0a6a }
            r10.mo55313x(r11)     // Catch:{ all -> 0x0a6a }
            long r11 = r3.f47331o     // Catch:{ all -> 0x0a6a }
            r10.mo55308s(r11)     // Catch:{ all -> 0x0a6a }
            boolean r9 = r3.f47333s     // Catch:{ all -> 0x0a6a }
            r10.mo55257D(r9)     // Catch:{ all -> 0x0a6a }
            long r11 = r3.f47320J     // Catch:{ all -> 0x0a6a }
            r10.mo55309t(r11)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r9 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r9)     // Catch:{ all -> 0x0a6a }
            r9.mo54986n(r10)     // Catch:{ all -> 0x0a6a }
        L_0x084e:
            com.google.android.gms.measurement.internal.zzah r9 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE     // Catch:{ all -> 0x0a6a }
            boolean r8 = r8.mo54950i(r9)     // Catch:{ all -> 0x0a6a }
            if (r8 == 0) goto L_0x086d
            java.lang.String r8 = r10.mo55289e0()     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x086d
            java.lang.String r8 = r10.mo55289e0()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.m4488k(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a6a }
            r2.mo51135y(r8)     // Catch:{ all -> 0x0a6a }
        L_0x086d:
            java.lang.String r8 = r10.mo55295h0()     // Catch:{ all -> 0x0a6a }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0a6a }
            if (r8 != 0) goto L_0x0884
            java.lang.String r8 = r10.mo55295h0()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.m4488k(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a6a }
            r2.mo51093P(r8)     // Catch:{ all -> 0x0a6a }
        L_0x0884:
            com.google.android.gms.measurement.internal.zzam r8 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = r3.f47326a     // Catch:{ all -> 0x0a6a }
            java.util.List r3 = r8.mo54977c0(r3)     // Catch:{ all -> 0x0a6a }
            r13 = 0
        L_0x0890:
            int r8 = r3.size()     // Catch:{ all -> 0x0a6a }
            if (r13 >= r8) goto L_0x08c6
            com.google.android.gms.internal.measurement.zzgl r8 = com.google.android.gms.internal.measurement.zzgm.m60197E()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzky r9 = (com.google.android.gms.measurement.internal.zzky) r9     // Catch:{ all -> 0x0a6a }
            java.lang.String r9 = r9.f47290c     // Catch:{ all -> 0x0a6a }
            r8.mo51232z(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzky r9 = (com.google.android.gms.measurement.internal.zzky) r9     // Catch:{ all -> 0x0a6a }
            long r9 = r9.f47291d     // Catch:{ all -> 0x0a6a }
            r8.mo51225A(r9)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzkv r9 = r1.f47260g     // Catch:{ all -> 0x0a6a }
            m66032R(r9)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzky r10 = (com.google.android.gms.measurement.internal.zzky) r10     // Catch:{ all -> 0x0a6a }
            java.lang.Object r10 = r10.f47292e     // Catch:{ all -> 0x0a6a }
            r9.mo55561K(r8, r10)     // Catch:{ all -> 0x0a6a }
            r2.mo51084K0(r8)     // Catch:{ all -> 0x0a6a }
            int r13 = r13 + 1
            goto L_0x0890
        L_0x08c6:
            com.google.android.gms.measurement.internal.zzam r3 = r1.f47256c     // Catch:{ IOException -> 0x0a20 }
            m66032R(r3)     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.internal.measurement.zzkf r8 = r2.mo51441o()     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.internal.measurement.zzgd r8 = (com.google.android.gms.internal.measurement.zzgd) r8     // Catch:{ IOException -> 0x0a20 }
            r3.mo55073e()     // Catch:{ IOException -> 0x0a20 }
            r3.mo55503f()     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.common.internal.Preconditions.m4488k(r8)     // Catch:{ IOException -> 0x0a20 }
            java.lang.String r9 = r8.mo51174T1()     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.common.internal.Preconditions.m4484g(r9)     // Catch:{ IOException -> 0x0a20 }
            byte[] r9 = r8.mo51306h()     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.measurement.internal.zzkt r10 = r3.f47227b     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.measurement.internal.zzkv r10 = r10.f47260g     // Catch:{ IOException -> 0x0a20 }
            m66032R(r10)     // Catch:{ IOException -> 0x0a20 }
            long r10 = r10.mo55564v(r9)     // Catch:{ IOException -> 0x0a20 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a20 }
            r12.<init>()     // Catch:{ IOException -> 0x0a20 }
            java.lang.String r13 = r8.mo51174T1()     // Catch:{ IOException -> 0x0a20 }
            r14 = r30
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0a20 }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0a20 }
            r15 = r33
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0a20 }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0a20 }
            android.database.sqlite.SQLiteDatabase r9 = r3.mo54965P()     // Catch:{ SQLiteException -> 0x0a06 }
            java.lang.String r13 = "raw_events_metadata"
            r4 = 4
            r9.insertWithOnConflict(r13, r6, r12, r4)     // Catch:{ SQLiteException -> 0x0a06 }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r2)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzau r3 = r5.f46464f     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzat r4 = new com.google.android.gms.measurement.internal.zzat     // Catch:{ all -> 0x0a6a }
            r4.<init>(r3)     // Catch:{ all -> 0x0a6a }
        L_0x0922:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0a6a }
            if (r3 == 0) goto L_0x0934
            java.lang.String r3 = r4.next()     // Catch:{ all -> 0x0a6a }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0a6a }
            if (r3 == 0) goto L_0x0922
        L_0x0932:
            r13 = 1
            goto L_0x0975
        L_0x0934:
            com.google.android.gms.measurement.internal.zzfi r3 = r1.f47254a     // Catch:{ all -> 0x0a6a }
            m66032R(r3)     // Catch:{ all -> 0x0a6a }
            java.lang.String r4 = r5.f46459a     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = r5.f46460b     // Catch:{ all -> 0x0a6a }
            boolean r3 = r3.mo55152E(r4, r7)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r4 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r4)     // Catch:{ all -> 0x0a6a }
            long r17 = r34.mo55514F()     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = r5.f46459a     // Catch:{ all -> 0x0a6a }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r4
            r19 = r7
            com.google.android.gms.measurement.internal.zzak r4 = r16.mo54969T(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0a6a }
            if (r3 == 0) goto L_0x0974
            long r3 = r4.f46436e     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzag r7 = r34.mo55517U()     // Catch:{ all -> 0x0a6a }
            java.lang.String r8 = r5.f46459a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzdt r9 = com.google.android.gms.measurement.internal.zzdu.f46626p     // Catch:{ all -> 0x0a6a }
            int r7 = r7.mo54930m(r8, r9)     // Catch:{ all -> 0x0a6a }
            long r7 = (long) r7     // Catch:{ all -> 0x0a6a }
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0974
            goto L_0x0932
        L_0x0974:
            r13 = 0
        L_0x0975:
            r2.mo55073e()     // Catch:{ all -> 0x0a6a }
            r2.mo55503f()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.internal.Preconditions.m4488k(r5)     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = r5.f46459a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.common.internal.Preconditions.m4484g(r3)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzkt r3 = r2.f47227b     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzkv r3 = r3.f47260g     // Catch:{ all -> 0x0a6a }
            m66032R(r3)     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.internal.measurement.zzft r3 = r3.mo55554A(r5)     // Catch:{ all -> 0x0a6a }
            byte[] r3 = r3.mo51306h()     // Catch:{ all -> 0x0a6a }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0a6a }
            r4.<init>()     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = r5.f46459a     // Catch:{ all -> 0x0a6a }
            r4.put(r14, r7)     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f46460b     // Catch:{ all -> 0x0a6a }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f46462d     // Catch:{ all -> 0x0a6a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0a6a }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a6a }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0a6a }
            r4.put(r15, r7)     // Catch:{ all -> 0x0a6a }
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch:{ all -> 0x0a6a }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0a6a }
            r4.put(r3, r7)     // Catch:{ all -> 0x0a6a }
            android.database.sqlite.SQLiteDatabase r3 = r2.mo54965P()     // Catch:{ SQLiteException -> 0x09ee }
            r7 = r32
            long r3 = r3.insert(r7, r6, r4)     // Catch:{ SQLiteException -> 0x09ee }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x09e9
            com.google.android.gms.measurement.internal.zzfr r3 = r2.f46899a     // Catch:{ SQLiteException -> 0x09ee }
            com.google.android.gms.measurement.internal.zzeh r3 = r3.mo55221z()     // Catch:{ SQLiteException -> 0x09ee }
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55098p()     // Catch:{ SQLiteException -> 0x09ee }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f46459a     // Catch:{ SQLiteException -> 0x09ee }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeh.m65566x(r6)     // Catch:{ SQLiteException -> 0x09ee }
            r3.mo55092b(r4, r6)     // Catch:{ SQLiteException -> 0x09ee }
            goto L_0x0a37
        L_0x09e9:
            r3 = 0
            r1.f47268o = r3     // Catch:{ all -> 0x0a6a }
            goto L_0x0a37
        L_0x09ee:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f46459a     // Catch:{ all -> 0x0a6a }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeh.m65566x(r5)     // Catch:{ all -> 0x0a6a }
            r2.mo55093c(r4, r5, r3)     // Catch:{ all -> 0x0a6a }
            goto L_0x0a37
        L_0x0a06:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.zzfr r3 = r3.f46899a     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.measurement.internal.zzeh r3 = r3.mo55221z()     // Catch:{ IOException -> 0x0a20 }
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55098p()     // Catch:{ IOException -> 0x0a20 }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r8.mo51174T1()     // Catch:{ IOException -> 0x0a20 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeh.m65566x(r6)     // Catch:{ IOException -> 0x0a20 }
            r3.mo55093c(r5, r6, r4)     // Catch:{ IOException -> 0x0a20 }
            throw r4     // Catch:{ IOException -> 0x0a20 }
        L_0x0a20:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzeh r4 = r34.mo55221z()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55098p()     // Catch:{ all -> 0x0a6a }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo51126s0()     // Catch:{ all -> 0x0a6a }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzeh.m65566x(r2)     // Catch:{ all -> 0x0a6a }
            r4.mo55093c(r5, r2, r3)     // Catch:{ all -> 0x0a6a }
        L_0x0a37:
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c     // Catch:{ all -> 0x0a6a }
            m66032R(r2)     // Catch:{ all -> 0x0a6a }
            r2.mo54985m()     // Catch:{ all -> 0x0a6a }
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            r34.m66027M()
            com.google.android.gms.measurement.internal.zzeh r2 = r34.mo55221z()
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55102t()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo55092b(r4, r3)
            return
        L_0x0a6a:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzam r3 = r1.f47256c
            m66032R(r3)
            r3.mo54980f0()
            throw r2
        L_0x0a75:
            r1.mo55515S(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkt.mo55512D(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: E */
    public final boolean mo55513E() {
        mo55185B().mo55073e();
        FileLock fileLock = this.f47275v;
        if (fileLock == null || !fileLock.isValid()) {
            this.f47256c.f46899a.mo55219x();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f47265l.mo55202c().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f47276w = channel;
                FileLock tryLock = channel.tryLock();
                this.f47275v = tryLock;
                if (tryLock != null) {
                    mo55221z().mo55102t().mo55091a("Storage concurrent access okay");
                    return true;
                }
                mo55221z().mo55098p().mo55091a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                mo55221z().mo55098p().mo55092b("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                mo55221z().mo55098p().mo55092b("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                mo55221z().mo55103u().mo55092b("Storage lock already acquired", e3);
                return false;
            }
        } else {
            mo55221z().mo55102t().mo55091a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final long mo55514F() {
        long a = mo55201a().mo21950a();
        zzjo zzjo = this.f47262i;
        zzjo.mo55503f();
        zzjo.mo55073e();
        long a2 = zzjo.f47185i.mo55120a();
        if (a2 == 0) {
            a2 = ((long) zzjo.f46899a.mo55196N().mo55609s().nextInt(86400000)) + 1;
            zzjo.f47185i.mo55121b(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: S */
    public final zzh mo55515S(zzq zzq) {
        mo55185B().mo55073e();
        mo55526d();
        Preconditions.m4488k(zzq);
        Preconditions.m4484g(zzq.f47326a);
        if (!zzq.f47324N.isEmpty()) {
            this.f47250B.put(zzq.f47326a, new zzks(this, zzq.f47324N));
        }
        zzam zzam = this.f47256c;
        m66032R(zzam);
        zzh R = zzam.mo54967R(zzq.f47326a);
        zzai c = mo55518V(zzq.f47326a).mo54943c(zzai.m65384b(zzq.f47323M));
        zzah zzah = zzah.AD_STORAGE;
        String m = c.mo54950i(zzah) ? this.f47262i.mo55470m(zzq.f47326a, zzq.f47316F) : "";
        if (R == null) {
            R = new zzh(this.f47265l, zzq.f47326a);
            if (c.mo54950i(zzah.ANALYTICS_STORAGE)) {
                R.mo55294h(mo55535i0(c));
            }
            if (c.mo54950i(zzah)) {
                R.mo55259F(m);
            }
        } else if (c.mo54950i(zzah) && m != null && !m.equals(R.mo55280a())) {
            R.mo55259F(m);
            if (zzq.f47316F && !"00000000-0000-0000-0000-000000000000".equals(this.f47262i.mo55469l(zzq.f47326a, c).first)) {
                R.mo55294h(mo55535i0(c));
                zzam zzam2 = this.f47256c;
                m66032R(zzam2);
                if (zzam2.mo54972X(zzq.f47326a, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID) != null) {
                    zzam zzam3 = this.f47256c;
                    m66032R(zzam3);
                    if (zzam3.mo54972X(zzq.f47326a, "_lair") == null) {
                        zzky zzky = new zzky(zzq.f47326a, "auto", "_lair", mo55201a().mo21950a(), 1L);
                        zzam zzam4 = this.f47256c;
                        m66032R(zzam4);
                        zzam4.mo54994v(zzky);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.mo55289e0()) && c.mo54950i(zzah.ANALYTICS_STORAGE)) {
            R.mo55294h(mo55535i0(c));
        }
        R.mo55312w(zzq.f47327c);
        R.mo55290f(zzq.f47318H);
        if (!TextUtils.isEmpty(zzq.f47312B)) {
            R.mo55311v(zzq.f47312B);
        }
        long j = zzq.f47330g;
        if (j != 0) {
            R.mo55313x(j);
        }
        if (!TextUtils.isEmpty(zzq.f47328d)) {
            R.mo55298j(zzq.f47328d);
        }
        R.mo55300k(zzq.f47311A);
        String str = zzq.f47329f;
        if (str != null) {
            R.mo55296i(str);
        }
        R.mo55308s(zzq.f47331o);
        R.mo55257D(zzq.f47333s);
        if (!TextUtils.isEmpty(zzq.f47332p)) {
            R.mo55314y(zzq.f47332p);
        }
        R.mo55292g(zzq.f47316F);
        R.mo55258E(zzq.f47319I);
        R.mo55309t(zzq.f47320J);
        zzpd.m61097b();
        if (mo55517U().mo54919A((String) null, zzdu.f46623n0) && mo55517U().mo54919A(zzq.f47326a, zzdu.f46627p0)) {
            R.mo55261H(zzq.f47325O);
        }
        zznt.m61035b();
        if (mo55517U().mo54919A((String) null, zzdu.f46619l0)) {
            R.mo55260G(zzq.f47321K);
        } else {
            zznt.m61035b();
            if (mo55517U().mo54919A((String) null, zzdu.f46617k0)) {
                R.mo55260G((List) null);
            }
        }
        if (R.mo55264K()) {
            zzam zzam5 = this.f47256c;
            m66032R(zzam5);
            zzam5.mo54986n(R);
        }
        return R;
    }

    /* renamed from: T */
    public final zzaa mo55516T() {
        zzaa zzaa = this.f47259f;
        m66032R(zzaa);
        return zzaa;
    }

    /* renamed from: U */
    public final zzag mo55517U() {
        return ((zzfr) Preconditions.m4488k(this.f47265l)).mo55219x();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: V */
    public final zzai mo55518V(String str) {
        String str2;
        zzai zzai = zzai.f46427b;
        mo55185B().mo55073e();
        mo55526d();
        zzai zzai2 = (zzai) this.f47249A.get(str);
        if (zzai2 != null) {
            return zzai2;
        }
        zzam zzam = this.f47256c;
        m66032R(zzam);
        Preconditions.m4488k(str);
        zzam.mo55073e();
        zzam.mo55503f();
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzam.mo54965P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            zzai b = zzai.m65384b(str2);
            mo55553y(str, b);
            return b;
        } catch (SQLiteException e) {
            zzam.f46899a.mo55221z().mo55098p().mo55093c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: W */
    public final zzam mo55519W() {
        zzam zzam = this.f47256c;
        m66032R(zzam);
        return zzam;
    }

    /* renamed from: X */
    public final zzec mo55520X() {
        return this.f47265l.mo55187D();
    }

    /* renamed from: Y */
    public final zzen mo55521Y() {
        zzen zzen = this.f47255b;
        m66032R(zzen);
        return zzen;
    }

    /* renamed from: Z */
    public final zzep mo55522Z() {
        zzep zzep = this.f47257d;
        if (zzep != null) {
            return zzep;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: a */
    public final Clock mo55201a() {
        return ((zzfr) Preconditions.m4488k(this.f47265l)).mo55201a();
    }

    /* renamed from: a0 */
    public final zzfi mo55523a0() {
        zzfi zzfi = this.f47254a;
        m66032R(zzfi);
        return zzfi;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: b */
    public final void mo55524b() {
        mo55185B().mo55073e();
        mo55526d();
        if (!this.f47267n) {
            this.f47267n = true;
            if (mo55513E()) {
                FileChannel fileChannel = this.f47276w;
                mo55185B().mo55073e();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    mo55221z().mo55098p().mo55091a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            mo55221z().mo55103u().mo55092b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        mo55221z().mo55098p().mo55092b("Failed to read from channel", e);
                    }
                }
                int n = this.f47265l.mo55184A().mo55060n();
                mo55185B().mo55073e();
                if (i > n) {
                    mo55221z().mo55098p().mo55093c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(n));
                } else if (i < n) {
                    FileChannel fileChannel2 = this.f47276w;
                    mo55185B().mo55073e();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        mo55221z().mo55098p().mo55091a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(n);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo55221z().mo55098p().mo55092b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo55221z().mo55102t().mo55093c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(n));
                            return;
                        } catch (IOException e2) {
                            mo55221z().mo55098p().mo55092b("Failed to write to channel", e2);
                        }
                    }
                    mo55221z().mo55098p().mo55093c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(n));
                }
            }
        }
    }

    /* renamed from: c */
    public final Context mo55202c() {
        return this.f47265l.mo55202c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final zzfr mo55525c0() {
        return this.f47265l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo55526d() {
        if (!this.f47266m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: d0 */
    public final zzic mo55527d0() {
        zzic zzic = this.f47261h;
        m66032R(zzic);
        return zzic;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo55528e(String str, zzgc zzgc) {
        int u;
        int indexOf;
        zzfi zzfi = this.f47254a;
        m66032R(zzfi);
        Set w = zzfi.mo55167w(str);
        if (w != null) {
            zzgc.mo51079H0(w);
        }
        zzfi zzfi2 = this.f47254a;
        m66032R(zzfi2);
        if (zzfi2.mo55157J(str)) {
            zzgc.mo51092O0();
        }
        zzfi zzfi3 = this.f47254a;
        m66032R(zzfi3);
        if (zzfi3.mo55160M(str)) {
            if (mo55517U().mo54919A(str, zzdu.f46633s0)) {
                String u0 = zzgc.mo51130u0();
                if (!TextUtils.isEmpty(u0) && (indexOf = u0.indexOf(".")) != -1) {
                    zzgc.mo51104V(u0.substring(0, indexOf));
                }
            } else {
                zzgc.mo51101T0();
            }
        }
        zzfi zzfi4 = this.f47254a;
        m66032R(zzfi4);
        if (zzfi4.mo55161N(str) && (u = zzkv.m66100u(zzgc, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID)) != -1) {
            zzgc.mo51129u(u);
        }
        zzfi zzfi5 = this.f47254a;
        m66032R(zzfi5);
        if (zzfi5.mo55159L(str)) {
            zzgc.mo51094P0();
        }
        zzfi zzfi6 = this.f47254a;
        m66032R(zzfi6);
        if (zzfi6.mo55156I(str)) {
            zzgc.mo51088M0();
            zzks zzks = (zzks) this.f47250B.get(str);
            if (zzks == null || zzks.f47247b + mo55517U().mo54933p(str, zzdu.f46589T) < mo55201a().mo21952c()) {
                zzks = new zzks(this);
                this.f47250B.put(str, zzks);
            }
            zzgc.mo51089N(zzks.f47246a);
        }
        zzfi zzfi7 = this.f47254a;
        m66032R(zzfi7);
        if (zzfi7.mo55158K(str)) {
            zzgc.mo51108X0();
        }
    }

    /* renamed from: e0 */
    public final zzjo mo55529e0() {
        return this.f47262i;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: f */
    public final void mo55530f(zzh zzh) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        mo55185B().mo55073e();
        if (!TextUtils.isEmpty(zzh.mo55297i0()) || !TextUtils.isEmpty(zzh.mo55283b0())) {
            zzki zzki = this.f47263j;
            Uri.Builder builder = new Uri.Builder();
            String i0 = zzh.mo55297i0();
            if (TextUtils.isEmpty(i0)) {
                i0 = zzh.mo55283b0();
            }
            ArrayMap arrayMap3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) zzdu.f46606f.mo55037a((Object) null)).encodedAuthority((String) zzdu.f46608g.mo55037a((Object) null)).path("config/app/".concat(String.valueOf(i0))).appendQueryParameter("platform", "android");
            zzki.f46899a.mo55219x().mo54932o();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String str = (String) Preconditions.m4488k(zzh.mo55287d0());
                URL url = new URL(uri);
                mo55221z().mo55102t().mo55092b("Fetching remote configuration", str);
                zzfi zzfi = this.f47254a;
                m66032R(zzfi);
                zzff r = zzfi.mo55163r(str);
                zzfi zzfi2 = this.f47254a;
                m66032R(zzfi2);
                String t = zzfi2.mo55165t(str);
                if (r != null) {
                    if (!TextUtils.isEmpty(t)) {
                        arrayMap2 = new ArrayMap();
                        arrayMap2.put("If-Modified-Since", t);
                    } else {
                        arrayMap2 = null;
                    }
                    zzox.m61081b();
                    if (mo55517U().mo54919A((String) null, zzdu.f46629q0)) {
                        zzfi zzfi3 = this.f47254a;
                        m66032R(zzfi3);
                        String s = zzfi3.mo55164s(str);
                        if (!TextUtils.isEmpty(s)) {
                            if (arrayMap2 == null) {
                                arrayMap2 = new ArrayMap();
                            }
                            arrayMap3 = arrayMap2;
                            arrayMap3.put("If-None-Match", s);
                        }
                    }
                    arrayMap = arrayMap2;
                    this.f47272s = true;
                    zzen zzen = this.f47255b;
                    m66032R(zzen);
                    zzkl zzkl = new zzkl(this);
                    zzen.mo55073e();
                    zzen.mo55503f();
                    Preconditions.m4488k(url);
                    Preconditions.m4488k(zzkl);
                    zzen.f46899a.mo55185B().mo55180w(new zzem(zzen, str, url, (byte[]) null, arrayMap, zzkl));
                }
                arrayMap = arrayMap3;
                this.f47272s = true;
                zzen zzen2 = this.f47255b;
                m66032R(zzen2);
                zzkl zzkl2 = new zzkl(this);
                zzen2.mo55073e();
                zzen2.mo55503f();
                Preconditions.m4488k(url);
                Preconditions.m4488k(zzkl2);
                zzen2.f46899a.mo55185B().mo55180w(new zzem(zzen2, str, url, (byte[]) null, arrayMap, zzkl2));
            } catch (MalformedURLException unused) {
                mo55221z().mo55098p().mo55093c("Failed to parse config URL. Not fetching. appId", zzeh.m65566x(zzh.mo55287d0()), uri);
            }
        } else {
            mo55539l((String) Preconditions.m4488k(zzh.mo55287d0()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: g */
    public final void mo55531g(zzaw zzaw, zzq zzq) {
        zzaw zzaw2;
        List<zzac> list;
        List<zzac> list2;
        List<zzac> list3;
        String str;
        zzq zzq2 = zzq;
        Preconditions.m4488k(zzq);
        Preconditions.m4484g(zzq2.f47326a);
        mo55185B().mo55073e();
        mo55526d();
        String str2 = zzq2.f47326a;
        long j = zzaw.f46482f;
        zzei b = zzei.m65580b(zzaw);
        mo55185B().mo55073e();
        zzie zzie = null;
        if (!(this.f47251C == null || (str = this.f47252D) == null || !str.equals(str2))) {
            zzie = this.f47251C;
        }
        zzlb.m66134w(zzie, b.f46693d, false);
        zzaw a = b.mo55106a();
        m66032R(this.f47260g);
        if (zzkv.m66090k(a, zzq2)) {
            if (!zzq2.f47333s) {
                mo55515S(zzq2);
                return;
            }
            List list4 = zzq2.f47321K;
            if (list4 == null) {
                zzaw2 = a;
            } else if (list4.contains(a.f46479a)) {
                Bundle m2 = a.f46480c.mo55016m2();
                m2.putLong("ga_safelisted", 1);
                zzaw2 = new zzaw(a.f46479a, new zzau(m2), a.f46481d, a.f46482f);
            } else {
                mo55221z().mo55097o().mo55094d("Dropping non-safelisted event. appId, event name, origin", str2, a.f46479a, a.f46481d);
                return;
            }
            zzam zzam = this.f47256c;
            m66032R(zzam);
            zzam.mo54979e0();
            try {
                zzam zzam2 = this.f47256c;
                m66032R(zzam2);
                Preconditions.m4484g(str2);
                zzam2.mo55073e();
                zzam2.mo55503f();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    zzam2.f46899a.mo55221z().mo55103u().mo55093c("Invalid time querying timed out conditional properties", zzeh.m65566x(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = zzam2.mo54976b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzac : list) {
                    if (zzac != null) {
                        mo55221z().mo55102t().mo55094d("User property timed out", zzac.f46410a, this.f47265l.mo55187D().mo55089f(zzac.f46412d.f47282c), zzac.f46412d.mo55568l2());
                        zzaw zzaw3 = zzac.f46416p;
                        if (zzaw3 != null) {
                            mo55512D(new zzaw(zzaw3, j), zzq2);
                        }
                        zzam zzam3 = this.f47256c;
                        m66032R(zzam3);
                        zzam3.mo54960J(str2, zzac.f46412d.f47282c);
                    }
                }
                zzam zzam4 = this.f47256c;
                m66032R(zzam4);
                Preconditions.m4484g(str2);
                zzam4.mo55073e();
                zzam4.mo55503f();
                if (i < 0) {
                    zzam4.f46899a.mo55221z().mo55103u().mo55093c("Invalid time querying expired conditional properties", zzeh.m65566x(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = zzam4.mo54976b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList = new ArrayList<>(list2.size());
                for (zzac zzac2 : list2) {
                    if (zzac2 != null) {
                        mo55221z().mo55102t().mo55094d("User property expired", zzac2.f46410a, this.f47265l.mo55187D().mo55089f(zzac2.f46412d.f47282c), zzac2.f46412d.mo55568l2());
                        zzam zzam5 = this.f47256c;
                        m66032R(zzam5);
                        zzam5.mo54983k(str2, zzac2.f46412d.f47282c);
                        zzaw zzaw4 = zzac2.f46409B;
                        if (zzaw4 != null) {
                            arrayList.add(zzaw4);
                        }
                        zzam zzam6 = this.f47256c;
                        m66032R(zzam6);
                        zzam6.mo54960J(str2, zzac2.f46412d.f47282c);
                    }
                }
                for (zzaw zzaw5 : arrayList) {
                    mo55512D(new zzaw(zzaw5, j), zzq2);
                }
                zzam zzam7 = this.f47256c;
                m66032R(zzam7);
                String str3 = zzaw2.f46479a;
                Preconditions.m4484g(str2);
                Preconditions.m4484g(str3);
                zzam7.mo55073e();
                zzam7.mo55503f();
                if (i < 0) {
                    zzam7.f46899a.mo55221z().mo55103u().mo55094d("Invalid time querying triggered conditional properties", zzeh.m65566x(str2), zzam7.f46899a.mo55187D().mo55087d(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = zzam7.mo54976b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<zzaw> arrayList2 = new ArrayList<>(list3.size());
                for (zzac zzac3 : list3) {
                    if (zzac3 != null) {
                        zzkw zzkw = zzac3.f46412d;
                        zzky zzky = new zzky((String) Preconditions.m4488k(zzac3.f46410a), zzac3.f46411c, zzkw.f47282c, j, Preconditions.m4488k(zzkw.mo55568l2()));
                        zzam zzam8 = this.f47256c;
                        m66032R(zzam8);
                        if (zzam8.mo54994v(zzky)) {
                            mo55221z().mo55102t().mo55094d("User property triggered", zzac3.f46410a, this.f47265l.mo55187D().mo55089f(zzky.f47290c), zzky.f47292e);
                        } else {
                            mo55221z().mo55098p().mo55094d("Too many active user properties, ignoring", zzeh.m65566x(zzac3.f46410a), this.f47265l.mo55187D().mo55089f(zzky.f47290c), zzky.f47292e);
                        }
                        zzaw zzaw6 = zzac3.f46418z;
                        if (zzaw6 != null) {
                            arrayList2.add(zzaw6);
                        }
                        zzac3.f46412d = new zzkw(zzky);
                        zzac3.f46414g = true;
                        zzam zzam9 = this.f47256c;
                        m66032R(zzam9);
                        zzam9.mo54993u(zzac3);
                    }
                }
                mo55512D(zzaw2, zzq2);
                for (zzaw zzaw7 : arrayList2) {
                    mo55512D(new zzaw(zzaw7, j), zzq2);
                }
                zzam zzam10 = this.f47256c;
                m66032R(zzam10);
                zzam10.mo54985m();
            } finally {
                zzam zzam11 = this.f47256c;
                m66032R(zzam11);
                zzam11.mo54980f0();
            }
        }
    }

    /* renamed from: g0 */
    public final zzkv mo55532g0() {
        zzkv zzkv = this.f47260g;
        m66032R(zzkv);
        return zzkv;
    }

    /* renamed from: h */
    public final zzab mo55207h() {
        throw null;
    }

    /* renamed from: h0 */
    public final zzlb mo55533h0() {
        return ((zzfr) Preconditions.m4488k(this.f47265l)).mo55196N();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: i */
    public final void mo55534i(zzaw zzaw, String str) {
        zzaw zzaw2 = zzaw;
        String str2 = str;
        zzam zzam = this.f47256c;
        m66032R(zzam);
        zzh R = zzam.mo54967R(str2);
        if (R == null || TextUtils.isEmpty(R.mo55293g0())) {
            mo55221z().mo55097o().mo55092b("No app data available; dropping event", str2);
            return;
        }
        Boolean J = m66024J(R);
        if (J == null) {
            if (!"_ui".equals(zzaw2.f46479a)) {
                mo55221z().mo55103u().mo55092b("Could not find package. appId", zzeh.m65566x(str));
            }
        } else if (!J.booleanValue()) {
            mo55221z().mo55098p().mo55092b("App version does not match; dropping event. appId", zzeh.m65566x(str));
            return;
        }
        String i0 = R.mo55297i0();
        String g0 = R.mo55293g0();
        long L = R.mo55265L();
        String f0 = R.mo55291f0();
        long W = R.mo55276W();
        long T = R.mo55273T();
        boolean J2 = R.mo55263J();
        String h0 = R.mo55295h0();
        R.mo55254A();
        zzq zzq = r2;
        zzh zzh = R;
        zzq zzq2 = new zzq(str, i0, g0, L, f0, W, T, (String) null, J2, false, h0, 0, 0, 0, zzh.mo55262I(), false, zzh.mo55283b0(), zzh.mo55281a0(), zzh.mo55274U(), zzh.mo55284c(), (String) null, mo55518V(str2).mo54948h(), "", (String) null);
        mo55536j(zzaw2, zzq);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: i0 */
    public final String mo55535i0(zzai zzai) {
        if (!zzai.mo54950i(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        mo55533h0().mo55609s().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: j */
    public final void mo55536j(zzaw zzaw, zzq zzq) {
        Preconditions.m4484g(zzq.f47326a);
        zzei b = zzei.m65580b(zzaw);
        zzlb h0 = mo55533h0();
        Bundle bundle = b.f46693d;
        zzam zzam = this.f47256c;
        m66032R(zzam);
        h0.mo55617x(bundle, zzam.mo54966Q(zzq.f47326a));
        mo55533h0().mo55618y(b, mo55517U().mo54929l(zzq.f47326a));
        zzaw a = b.mo55106a();
        if ("_cmp".equals(a.f46479a) && "referrer API v2".equals(a.f46480c.mo55020q2("_cis"))) {
            String q2 = a.f46480c.mo55020q2("gclid");
            if (!TextUtils.isEmpty(q2)) {
                mo55510A(new zzkw("_lgclid", a.f46482f, q2, "auto"), zzq);
            }
        }
        mo55531g(a, zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final String mo55537j0(zzq zzq) {
        try {
            return (String) mo55185B().mo55178q(new zzkm(this, zzq)).get(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo55221z().mo55098p().mo55093c("Failed to get app instance id. appId", zzeh.m65566x(zzq.f47326a), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo55538k() {
        this.f47271r++;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105 A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011c A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0139 A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147 A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169 A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016d A[Catch:{ all -> 0x0186, all -> 0x0190 }] */
    @androidx.annotation.WorkerThread
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55539l(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzfo r0 = r8.mo55185B()
            r0.mo55073e()
            r8.mo55526d()
            com.google.android.gms.common.internal.Preconditions.m4484g(r9)
            r0 = 0
            if (r12 != 0) goto L_0x0012
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x0190 }
        L_0x0012:
            com.google.android.gms.measurement.internal.zzeh r1 = r8.mo55221z()     // Catch:{ all -> 0x0190 }
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55102t()     // Catch:{ all -> 0x0190 }
            int r2 = r12.length     // Catch:{ all -> 0x0190 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.mo55092b(r3, r2)     // Catch:{ all -> 0x0190 }
            com.google.android.gms.measurement.internal.zzam r1 = r8.f47256c     // Catch:{ all -> 0x0190 }
            m66032R(r1)     // Catch:{ all -> 0x0190 }
            r1.mo54979e0()     // Catch:{ all -> 0x0190 }
            com.google.android.gms.measurement.internal.zzam r1 = r8.f47256c     // Catch:{ all -> 0x0186 }
            m66032R(r1)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzh r1 = r1.mo54967R(r9)     // Catch:{ all -> 0x0186 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r10 == r3) goto L_0x0043
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0043
            if (r10 != r4) goto L_0x0047
            r10 = 304(0x130, float:4.26E-43)
        L_0x0043:
            if (r11 != 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x005d
            com.google.android.gms.measurement.internal.zzeh r10 = r8.mo55221z()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzef r10 = r10.mo55103u()     // Catch:{ all -> 0x0186 }
            java.lang.String r11 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeh.m65566x(r9)     // Catch:{ all -> 0x0186 }
            r10.mo55092b(r11, r9)     // Catch:{ all -> 0x0186 }
            goto L_0x0170
        L_0x005d:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00bb
            if (r10 != r5) goto L_0x0064
            goto L_0x00bb
        L_0x0064:
            com.google.android.gms.common.util.Clock r12 = r8.mo55201a()     // Catch:{ all -> 0x0186 }
            long r12 = r12.mo21950a()     // Catch:{ all -> 0x0186 }
            r1.mo55310u(r12)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzam r12 = r8.f47256c     // Catch:{ all -> 0x0186 }
            m66032R(r12)     // Catch:{ all -> 0x0186 }
            r12.mo54986n(r1)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzeh r12 = r8.mo55221z()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzef r12 = r12.mo55102t()     // Catch:{ all -> 0x0186 }
            java.lang.String r13 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0186 }
            r12.mo55093c(r13, r1, r11)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzfi r11 = r8.f47254a     // Catch:{ all -> 0x0186 }
            m66032R(r11)     // Catch:{ all -> 0x0186 }
            r11.mo55168x(r9)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzjo r9 = r8.f47262i     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzes r9 = r9.f47184h     // Catch:{ all -> 0x0186 }
            com.google.android.gms.common.util.Clock r11 = r8.mo55201a()     // Catch:{ all -> 0x0186 }
            long r11 = r11.mo21950a()     // Catch:{ all -> 0x0186 }
            r9.mo55121b(r11)     // Catch:{ all -> 0x0186 }
            r9 = 503(0x1f7, float:7.05E-43)
            if (r10 == r9) goto L_0x00a7
            r9 = 429(0x1ad, float:6.01E-43)
            if (r10 != r9) goto L_0x00b6
        L_0x00a7:
            com.google.android.gms.measurement.internal.zzjo r9 = r8.f47262i     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzes r9 = r9.f47182f     // Catch:{ all -> 0x0186 }
            com.google.android.gms.common.util.Clock r10 = r8.mo55201a()     // Catch:{ all -> 0x0186 }
            long r10 = r10.mo21950a()     // Catch:{ all -> 0x0186 }
            r9.mo55121b(r10)     // Catch:{ all -> 0x0186 }
        L_0x00b6:
            r8.m66027M()     // Catch:{ all -> 0x0186 }
            goto L_0x0170
        L_0x00bb:
            r11 = 0
            if (r13 == 0) goto L_0x00c7
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x0186 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0186 }
            goto L_0x00c8
        L_0x00c7:
            r3 = r11
        L_0x00c8:
            if (r3 == 0) goto L_0x00d7
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0186 }
            if (r6 != 0) goto L_0x00d7
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0186 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0186 }
            goto L_0x00d8
        L_0x00d7:
            r3 = r11
        L_0x00d8:
            com.google.android.gms.internal.measurement.zzox.m61081b()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzag r6 = r8.mo55517U()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzdt r7 = com.google.android.gms.measurement.internal.zzdu.f46629q0     // Catch:{ all -> 0x0186 }
            boolean r6 = r6.mo54919A(r11, r7)     // Catch:{ all -> 0x0186 }
            if (r6 == 0) goto L_0x0102
            if (r13 == 0) goto L_0x00f2
            java.lang.String r6 = "ETag"
            java.lang.Object r13 = r13.get(r6)     // Catch:{ all -> 0x0186 }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0186 }
            goto L_0x00f3
        L_0x00f2:
            r13 = r11
        L_0x00f3:
            if (r13 == 0) goto L_0x0102
            boolean r6 = r13.isEmpty()     // Catch:{ all -> 0x0186 }
            if (r6 != 0) goto L_0x0102
            java.lang.Object r13 = r13.get(r0)     // Catch:{ all -> 0x0186 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0186 }
            goto L_0x0103
        L_0x0102:
            r13 = r11
        L_0x0103:
            if (r10 == r5) goto L_0x0111
            if (r10 != r4) goto L_0x0108
            goto L_0x0111
        L_0x0108:
            com.google.android.gms.measurement.internal.zzfi r11 = r8.f47254a     // Catch:{ all -> 0x0186 }
            m66032R(r11)     // Catch:{ all -> 0x0186 }
            r11.mo55155H(r9, r12, r3, r13)     // Catch:{ all -> 0x0186 }
            goto L_0x0124
        L_0x0111:
            com.google.android.gms.measurement.internal.zzfi r12 = r8.f47254a     // Catch:{ all -> 0x0186 }
            m66032R(r12)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.internal.measurement.zzff r12 = r12.mo55163r(r9)     // Catch:{ all -> 0x0186 }
            if (r12 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzfi r12 = r8.f47254a     // Catch:{ all -> 0x0186 }
            m66032R(r12)     // Catch:{ all -> 0x0186 }
            r12.mo55155H(r9, r11, r11, r11)     // Catch:{ all -> 0x0186 }
        L_0x0124:
            com.google.android.gms.common.util.Clock r11 = r8.mo55201a()     // Catch:{ all -> 0x0186 }
            long r11 = r11.mo21950a()     // Catch:{ all -> 0x0186 }
            r1.mo55301l(r11)     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzam r11 = r8.f47256c     // Catch:{ all -> 0x0186 }
            m66032R(r11)     // Catch:{ all -> 0x0186 }
            r11.mo54986n(r1)     // Catch:{ all -> 0x0186 }
            if (r10 != r5) goto L_0x0147
            com.google.android.gms.measurement.internal.zzeh r10 = r8.mo55221z()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzef r10 = r10.mo55104v()     // Catch:{ all -> 0x0186 }
            java.lang.String r11 = "Config not found. Using empty config. appId"
            r10.mo55092b(r11, r9)     // Catch:{ all -> 0x0186 }
            goto L_0x0158
        L_0x0147:
            com.google.android.gms.measurement.internal.zzeh r9 = r8.mo55221z()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzef r9 = r9.mo55102t()     // Catch:{ all -> 0x0186 }
            java.lang.String r11 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0186 }
            r9.mo55093c(r11, r10, r2)     // Catch:{ all -> 0x0186 }
        L_0x0158:
            com.google.android.gms.measurement.internal.zzen r9 = r8.f47255b     // Catch:{ all -> 0x0186 }
            m66032R(r9)     // Catch:{ all -> 0x0186 }
            boolean r9 = r9.mo55111k()     // Catch:{ all -> 0x0186 }
            if (r9 == 0) goto L_0x016d
            boolean r9 = r8.m66029O()     // Catch:{ all -> 0x0186 }
            if (r9 == 0) goto L_0x016d
            r8.mo55511C()     // Catch:{ all -> 0x0186 }
            goto L_0x0170
        L_0x016d:
            r8.m66027M()     // Catch:{ all -> 0x0186 }
        L_0x0170:
            com.google.android.gms.measurement.internal.zzam r9 = r8.f47256c     // Catch:{ all -> 0x0186 }
            m66032R(r9)     // Catch:{ all -> 0x0186 }
            r9.mo54985m()     // Catch:{ all -> 0x0186 }
            com.google.android.gms.measurement.internal.zzam r9 = r8.f47256c     // Catch:{ all -> 0x0190 }
            m66032R(r9)     // Catch:{ all -> 0x0190 }
            r9.mo54980f0()     // Catch:{ all -> 0x0190 }
            r8.f47272s = r0
            r8.m66025K()
            return
        L_0x0186:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzam r10 = r8.f47256c     // Catch:{ all -> 0x0190 }
            m66032R(r10)     // Catch:{ all -> 0x0190 }
            r10.mo54980f0()     // Catch:{ all -> 0x0190 }
            throw r9     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r9 = move-exception
            r8.f47272s = r0
            r8.m66025K()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkt.mo55539l(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: l0 */
    public final void mo55540l0(Runnable runnable) {
        mo55185B().mo55073e();
        if (this.f47269p == null) {
            this.f47269p = new ArrayList();
        }
        this.f47269p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo55541m(boolean z) {
        m66027M();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: n */
    public final void mo55542n(int i, Throwable th, byte[] bArr, String str) {
        zzam zzam;
        mo55185B().mo55073e();
        mo55526d();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f47273t = false;
                m66025K();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.m4488k(this.f47277x);
        this.f47277x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo55221z().mo55102t().mo55093c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f47262i.f47184h.mo55121b(mo55201a().mo21950a());
            if (i == 503 || i == 429) {
                this.f47262i.f47182f.mo55121b(mo55201a().mo21950a());
            }
            zzam zzam2 = this.f47256c;
            m66032R(zzam2);
            zzam2.mo54981g0(list);
            m66027M();
            this.f47273t = false;
            m66025K();
        }
        if (th == null) {
            try {
                this.f47262i.f47183g.mo55121b(mo55201a().mo21950a());
                this.f47262i.f47184h.mo55121b(0);
                m66027M();
                mo55221z().mo55102t().mo55093c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzam zzam3 = this.f47256c;
                m66032R(zzam3);
                zzam3.mo54979e0();
                try {
                    for (Long l : list) {
                        try {
                            zzam = this.f47256c;
                            m66032R(zzam);
                            long longValue = l.longValue();
                            zzam.mo55073e();
                            zzam.mo55503f();
                            if (zzam.mo54965P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            zzam.f46899a.mo55221z().mo55098p().mo55092b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List list2 = this.f47278y;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    zzam zzam4 = this.f47256c;
                    m66032R(zzam4);
                    zzam4.mo54985m();
                    zzam zzam5 = this.f47256c;
                    m66032R(zzam5);
                    zzam5.mo54980f0();
                    this.f47278y = null;
                    zzen zzen = this.f47255b;
                    m66032R(zzen);
                    if (!zzen.mo55111k() || !m66029O()) {
                        this.f47279z = -1;
                        m66027M();
                    } else {
                        mo55511C();
                    }
                    this.f47268o = 0;
                } catch (Throwable th3) {
                    zzam zzam6 = this.f47256c;
                    m66032R(zzam6);
                    zzam6.mo54980f0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo55221z().mo55098p().mo55092b("Database error while trying to delete uploaded bundles", e3);
                this.f47268o = mo55201a().mo21952c();
                mo55221z().mo55102t().mo55092b("Disable upload, time", Long.valueOf(this.f47268o));
            }
            this.f47273t = false;
            m66025K();
        }
        mo55221z().mo55102t().mo55093c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f47262i.f47184h.mo55121b(mo55201a().mo21950a());
        this.f47262i.f47182f.mo55121b(mo55201a().mo21950a());
        zzam zzam22 = this.f47256c;
        m66032R(zzam22);
        zzam22.mo54981g0(list);
        m66027M();
        this.f47273t = false;
        m66025K();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ea A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0416 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x042b A[SYNTHETIC, Splitter:B:133:0x042b] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04d1 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04ed A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x054d A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0142 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0202 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0206 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0260 A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x026f A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x027f A[Catch:{ RuntimeException -> 0x0372, all -> 0x057b }] */
    @androidx.annotation.WorkerThread
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55543o(com.google.android.gms.measurement.internal.zzq r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.zzfo r8 = r24.mo55185B()
            r8.mo55073e()
            r24.mo55526d()
            com.google.android.gms.common.internal.Preconditions.m4488k(r25)
            java.lang.String r8 = r2.f47326a
            com.google.android.gms.common.internal.Preconditions.m4484g(r8)
            boolean r8 = m66031Q(r25)
            if (r8 == 0) goto L_0x0585
            com.google.android.gms.measurement.internal.zzam r8 = r1.f47256c
            m66032R(r8)
            java.lang.String r9 = r2.f47326a
            com.google.android.gms.measurement.internal.zzh r8 = r8.mo54967R(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.mo55297i0()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f47327c
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.mo55301l(r9)
            com.google.android.gms.measurement.internal.zzam r11 = r1.f47256c
            m66032R(r11)
            r11.mo54986n(r8)
            com.google.android.gms.measurement.internal.zzfi r8 = r1.f47254a
            m66032R(r8)
            java.lang.String r11 = r2.f47326a
            r8.mo55169y(r11)
        L_0x005e:
            boolean r8 = r2.f47333s
            if (r8 != 0) goto L_0x0066
            r24.mo55515S(r25)
            return
        L_0x0066:
            long r11 = r2.f47314D
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            com.google.android.gms.common.util.Clock r8 = r24.mo55201a()
            long r11 = r8.mo21950a()
        L_0x0074:
            com.google.android.gms.measurement.internal.zzfr r8 = r1.f47265l
            com.google.android.gms.measurement.internal.zzaq r8 = r8.mo55220y()
            r8.mo55004p()
            int r8 = r2.f47315E
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.zzeh r13 = r24.mo55221z()
            com.google.android.gms.measurement.internal.zzef r13 = r13.mo55103u()
            java.lang.String r14 = r2.f47326a
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzeh.m65566x(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.mo55093c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.zzam r9 = r1.f47256c
            m66032R(r9)
            r9.mo54979e0()
            com.google.android.gms.measurement.internal.zzam r9 = r1.f47256c     // Catch:{ all -> 0x057b }
            m66032R(r9)     // Catch:{ all -> 0x057b }
            java.lang.String r10 = r2.f47326a     // Catch:{ all -> 0x057b }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.zzky r9 = r9.mo54972X(r10, r13)     // Catch:{ all -> 0x057b }
            if (r9 == 0) goto L_0x00c5
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f47289b     // Catch:{ all -> 0x057b }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x057b }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            goto L_0x0119
        L_0x00c5:
            java.lang.Boolean r10 = r2.f47319I     // Catch:{ all -> 0x057b }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzkw r10 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_npa"
            java.lang.Boolean r13 = r2.f47319I     // Catch:{ all -> 0x057b }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x057b }
            if (r15 == r13) goto L_0x00d8
            r19 = 0
            goto L_0x00da
        L_0x00d8:
            r19 = 1
        L_0x00da:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x057b }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r10
            r3 = 0
            r4 = 1
            r15 = r11
            r17 = r19
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f47292e     // Catch:{ all -> 0x057b }
            java.lang.Long r13 = r10.f47284f     // Catch:{ all -> 0x057b }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x057b }
            if (r9 != 0) goto L_0x0119
        L_0x00fd:
            r1.mo55510A(r10, r2)     // Catch:{ all -> 0x057b }
            goto L_0x0119
        L_0x0101:
            r21 = r3
            r22 = r4
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.zzkw r9 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r9
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            r1.mo55547s(r9, r2)     // Catch:{ all -> 0x057b }
        L_0x0119:
            com.google.android.gms.measurement.internal.zzam r9 = r1.f47256c     // Catch:{ all -> 0x057b }
            m66032R(r9)     // Catch:{ all -> 0x057b }
            java.lang.String r10 = r2.f47326a     // Catch:{ all -> 0x057b }
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.m4488k(r10)     // Catch:{ all -> 0x057b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzh r9 = r9.mo54967R(r10)     // Catch:{ all -> 0x057b }
            if (r9 == 0) goto L_0x0202
            com.google.android.gms.measurement.internal.zzlb r13 = r24.mo55533h0()     // Catch:{ all -> 0x057b }
            java.lang.String r14 = r2.f47327c     // Catch:{ all -> 0x057b }
            java.lang.String r15 = r9.mo55297i0()     // Catch:{ all -> 0x057b }
            java.lang.String r10 = r2.f47318H     // Catch:{ all -> 0x057b }
            java.lang.String r3 = r9.mo55283b0()     // Catch:{ all -> 0x057b }
            boolean r3 = r13.mo55594b0(r14, r15, r10, r3)     // Catch:{ all -> 0x057b }
            if (r3 == 0) goto L_0x0202
            com.google.android.gms.measurement.internal.zzeh r3 = r24.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55103u()     // Catch:{ all -> 0x057b }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r9.mo55287d0()     // Catch:{ all -> 0x057b }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeh.m65566x(r13)     // Catch:{ all -> 0x057b }
            r3.mo55092b(r10, r13)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzam r3 = r1.f47256c     // Catch:{ all -> 0x057b }
            m66032R(r3)     // Catch:{ all -> 0x057b }
            java.lang.String r9 = r9.mo55287d0()     // Catch:{ all -> 0x057b }
            r3.mo55503f()     // Catch:{ all -> 0x057b }
            r3.mo55073e()     // Catch:{ all -> 0x057b }
            com.google.android.gms.common.internal.Preconditions.m4484g(r9)     // Catch:{ all -> 0x057b }
            android.database.sqlite.SQLiteDatabase r10 = r3.mo54965P()     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01ea }
            r14 = 0
            r13[r14] = r9     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ea }
            int r14 = r14 + r15
            com.google.android.gms.internal.measurement.zzoi.m61060b()     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.zzfr r15 = r3.f46899a     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.zzag r15 = r15.mo55219x()     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.zzdt r4 = com.google.android.gms.measurement.internal.zzdu.f46639v0     // Catch:{ SQLiteException -> 0x01ea }
            r23 = r6
            r6 = 0
            boolean r4 = r15.mo54919A(r6, r4)     // Catch:{ SQLiteException -> 0x01e8 }
            if (r4 == 0) goto L_0x01d2
            java.lang.String r4 = "default_event_params"
            int r0 = r10.delete(r4, r0, r13)     // Catch:{ SQLiteException -> 0x01e8 }
            int r14 = r14 + r0
        L_0x01d2:
            if (r14 <= 0) goto L_0x0200
            com.google.android.gms.measurement.internal.zzfr r0 = r3.f46899a     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ SQLiteException -> 0x01e8 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55102t()     // Catch:{ SQLiteException -> 0x01e8 }
            java.lang.String r4 = "Deleted application data. app, records"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01e8 }
            r0.mo55093c(r4, r9, r6)     // Catch:{ SQLiteException -> 0x01e8 }
            goto L_0x0200
        L_0x01e8:
            r0 = move-exception
            goto L_0x01ed
        L_0x01ea:
            r0 = move-exception
            r23 = r6
        L_0x01ed:
            com.google.android.gms.measurement.internal.zzfr r3 = r3.f46899a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzeh r3 = r3.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r3 = r3.mo55098p()     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "Error deleting application data. appId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeh.m65566x(r9)     // Catch:{ all -> 0x057b }
            r3.mo55093c(r4, r6, r0)     // Catch:{ all -> 0x057b }
        L_0x0200:
            r9 = 0
            goto L_0x0204
        L_0x0202:
            r23 = r6
        L_0x0204:
            if (r9 == 0) goto L_0x025b
            long r3 = r9.mo55265L()     // Catch:{ all -> 0x057b }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x021d
            long r3 = r9.mo55265L()     // Catch:{ all -> 0x057b }
            long r13 = r2.f47311A     // Catch:{ all -> 0x057b }
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x021d
            r0 = 1
            goto L_0x021e
        L_0x021d:
            r0 = 0
        L_0x021e:
            java.lang.String r3 = r9.mo55293g0()     // Catch:{ all -> 0x057b }
            long r9 = r9.mo55265L()     // Catch:{ all -> 0x057b }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0239
            if (r3 == 0) goto L_0x0239
            java.lang.String r4 = r2.f47328d     // Catch:{ all -> 0x057b }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x057b }
            if (r4 != 0) goto L_0x0239
            r15 = 1
            goto L_0x023a
        L_0x0239:
            r15 = 0
        L_0x023a:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x025b
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057b }
            r0.<init>()     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r3)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x057b }
            r15.<init>(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057b }
            r1.mo55531g(r3, r2)     // Catch:{ all -> 0x057b }
        L_0x025b:
            r24.mo55515S(r25)     // Catch:{ all -> 0x057b }
            if (r8 != 0) goto L_0x026f
            com.google.android.gms.measurement.internal.zzam r0 = r1.f47256c     // Catch:{ all -> 0x057b }
            m66032R(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r3 = r2.f47326a     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.zzas r0 = r0.mo54971V(r3, r4)     // Catch:{ all -> 0x057b }
            r15 = 0
            goto L_0x027d
        L_0x026f:
            com.google.android.gms.measurement.internal.zzam r0 = r1.f47256c     // Catch:{ all -> 0x057b }
            m66032R(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r3 = r2.f47326a     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.zzas r0 = r0.mo54971V(r3, r4)     // Catch:{ all -> 0x057b }
            r15 = 1
        L_0x027d:
            if (r0 != 0) goto L_0x054d
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r3
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r6 = "_r"
            java.lang.String r10 = "_c"
            if (r15 != 0) goto L_0x0505
            com.google.android.gms.measurement.internal.zzkw r0 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x057b }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            r1.mo55510A(r0, r2)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzfo r0 = r24.mo55185B()     // Catch:{ all -> 0x057b }
            r0.mo55073e()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzez r0 = r1.f47264k     // Catch:{ all -> 0x057b }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.m4488k(r0)     // Catch:{ all -> 0x057b }
            r8 = r0
            com.google.android.gms.measurement.internal.zzez r8 = (com.google.android.gms.measurement.internal.zzez) r8     // Catch:{ all -> 0x057b }
            java.lang.String r0 = r2.f47326a     // Catch:{ all -> 0x057b }
            if (r0 == 0) goto L_0x03a7
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x057b }
            if (r9 == 0) goto L_0x02c1
            goto L_0x03a7
        L_0x02c1:
            com.google.android.gms.measurement.internal.zzfr r9 = r8.f46763a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzfo r9 = r9.mo55185B()     // Catch:{ all -> 0x057b }
            r9.mo55073e()     // Catch:{ all -> 0x057b }
            boolean r9 = r8.mo55139a()     // Catch:{ all -> 0x057b }
            if (r9 != 0) goto L_0x02e1
            com.google.android.gms.measurement.internal.zzfr r0 = r8.f46763a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55101s()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            r0.mo55091a(r5)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x02e1:
            com.google.android.gms.measurement.internal.zzey r9 = new com.google.android.gms.measurement.internal.zzey     // Catch:{ all -> 0x057b }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzfr r0 = r8.f46763a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzfo r0 = r0.mo55185B()     // Catch:{ all -> 0x057b }
            r0.mo55073e()     // Catch:{ all -> 0x057b }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x057b }
            java.lang.String r13 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r13)     // Catch:{ all -> 0x057b }
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r13.<init>(r5, r14)     // Catch:{ all -> 0x057b }
            r0.setComponent(r13)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzfr r13 = r8.f46763a     // Catch:{ all -> 0x057b }
            android.content.Context r13 = r13.mo55202c()     // Catch:{ all -> 0x057b }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x057b }
            if (r13 != 0) goto L_0x031d
            com.google.android.gms.measurement.internal.zzfr r0 = r8.f46763a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55105w()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.mo55091a(r5)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x031d:
            r14 = 0
            java.util.List r13 = r13.queryIntentServices(r0, r14)     // Catch:{ all -> 0x057b }
            if (r13 == 0) goto L_0x0397
            boolean r15 = r13.isEmpty()     // Catch:{ all -> 0x057b }
            if (r15 != 0) goto L_0x0397
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x057b }
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch:{ all -> 0x057b }
            android.content.pm.ServiceInfo r13 = r13.serviceInfo     // Catch:{ all -> 0x057b }
            if (r13 == 0) goto L_0x03b6
            java.lang.String r14 = r13.packageName     // Catch:{ all -> 0x057b }
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x057b }
            if (r13 == 0) goto L_0x0387
            boolean r5 = r5.equals(r14)     // Catch:{ all -> 0x057b }
            if (r5 == 0) goto L_0x0387
            boolean r5 = r8.mo55139a()     // Catch:{ all -> 0x057b }
            if (r5 == 0) goto L_0x0387
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x057b }
            r5.<init>(r0)     // Catch:{ all -> 0x057b }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.m4827b()     // Catch:{ RuntimeException -> 0x0372 }
            com.google.android.gms.measurement.internal.zzfr r13 = r8.f46763a     // Catch:{ RuntimeException -> 0x0372 }
            android.content.Context r13 = r13.mo55202c()     // Catch:{ RuntimeException -> 0x0372 }
            r14 = 1
            boolean r0 = r0.mo21938a(r13, r5, r9, r14)     // Catch:{ RuntimeException -> 0x0372 }
            com.google.android.gms.measurement.internal.zzfr r5 = r8.f46763a     // Catch:{ RuntimeException -> 0x0372 }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ RuntimeException -> 0x0372 }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55102t()     // Catch:{ RuntimeException -> 0x0372 }
            java.lang.String r9 = "Install Referrer Service is"
            java.lang.String r13 = "available"
            java.lang.String r14 = "not available"
            r15 = 1
            if (r15 == r0) goto L_0x036e
            r13 = r14
        L_0x036e:
            r5.mo55092b(r9, r13)     // Catch:{ RuntimeException -> 0x0372 }
            goto L_0x03b6
        L_0x0372:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r5 = r8.f46763a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r5 = r5.mo55098p()     // Catch:{ all -> 0x057b }
            java.lang.String r8 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x057b }
            r5.mo55092b(r8, r0)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x0387:
            com.google.android.gms.measurement.internal.zzfr r0 = r8.f46763a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55103u()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.mo55091a(r5)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x0397:
            com.google.android.gms.measurement.internal.zzfr r0 = r8.f46763a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55101s()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.mo55091a(r5)     // Catch:{ all -> 0x057b }
            goto L_0x03b6
        L_0x03a7:
            com.google.android.gms.measurement.internal.zzfr r0 = r8.f46763a     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55105w()     // Catch:{ all -> 0x057b }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            r0.mo55091a(r5)     // Catch:{ all -> 0x057b }
        L_0x03b6:
            com.google.android.gms.measurement.internal.zzfo r0 = r24.mo55185B()     // Catch:{ all -> 0x057b }
            r0.mo55073e()     // Catch:{ all -> 0x057b }
            r24.mo55526d()     // Catch:{ all -> 0x057b }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x057b }
            r5.<init>()     // Catch:{ all -> 0x057b }
            r8 = 1
            r5.putLong(r10, r8)     // Catch:{ all -> 0x057b }
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057b }
            r8 = 0
            r5.putLong(r7, r8)     // Catch:{ all -> 0x057b }
            r6 = r23
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057b }
            r10 = r22
            r5.putLong(r10, r8)     // Catch:{ all -> 0x057b }
            r15 = r21
            r5.putLong(r15, r8)     // Catch:{ all -> 0x057b }
            r8 = 1
            r5.putLong(r4, r8)     // Catch:{ all -> 0x057b }
            boolean r0 = r2.f47317G     // Catch:{ all -> 0x057b }
            if (r0 == 0) goto L_0x03ed
            r5.putLong(r3, r8)     // Catch:{ all -> 0x057b }
        L_0x03ed:
            java.lang.String r0 = r2.f47326a     // Catch:{ all -> 0x057b }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.m4488k(r0)     // Catch:{ all -> 0x057b }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzam r0 = r1.f47256c     // Catch:{ all -> 0x057b }
            m66032R(r0)     // Catch:{ all -> 0x057b }
            com.google.android.gms.common.internal.Preconditions.m4484g(r3)     // Catch:{ all -> 0x057b }
            r0.mo55073e()     // Catch:{ all -> 0x057b }
            r0.mo55503f()     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.mo54961L(r3, r4)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f47265l     // Catch:{ all -> 0x057b }
            android.content.Context r0 = r0.mo55202c()     // Catch:{ all -> 0x057b }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x057b }
            if (r0 != 0) goto L_0x042b
            com.google.android.gms.measurement.internal.zzeh r0 = r24.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55098p()     // Catch:{ all -> 0x057b }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeh.m65566x(r3)     // Catch:{ all -> 0x057b }
            r0.mo55092b(r4, r3)     // Catch:{ all -> 0x057b }
        L_0x0427:
            r3 = 0
            goto L_0x04e9
        L_0x042b:
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f47265l     // Catch:{ NameNotFoundException -> 0x043b }
            android.content.Context r0 = r0.mo55202c()     // Catch:{ NameNotFoundException -> 0x043b }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.m4929a(r0)     // Catch:{ NameNotFoundException -> 0x043b }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.mo21963f(r3, r4)     // Catch:{ NameNotFoundException -> 0x043b }
            goto L_0x044e
        L_0x043b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzeh r4 = r24.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55098p()     // Catch:{ all -> 0x057b }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzeh.m65566x(r3)     // Catch:{ all -> 0x057b }
            r4.mo55093c(r13, r14, r0)     // Catch:{ all -> 0x057b }
            r0 = 0
        L_0x044e:
            if (r0 == 0) goto L_0x04a2
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x057b }
            r16 = 0
            int r4 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x04a2
            r21 = r3
            long r3 = r0.lastUpdateTime     // Catch:{ all -> 0x057b }
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0484
            com.google.android.gms.measurement.internal.zzag r0 = r24.mo55517U()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzdt r3 = com.google.android.gms.measurement.internal.zzdu.f46603d0     // Catch:{ all -> 0x057b }
            r4 = 0
            boolean r0 = r0.mo54919A(r4, r3)     // Catch:{ all -> 0x057b }
            if (r0 == 0) goto L_0x047e
            r13 = 0
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x047c
            r13 = 1
            r5.putLong(r7, r13)     // Catch:{ all -> 0x057b }
            r0 = 0
            r8 = 0
            goto L_0x0486
        L_0x047c:
            r0 = 0
            goto L_0x0486
        L_0x047e:
            r13 = 1
            r5.putLong(r7, r13)     // Catch:{ all -> 0x057b }
            goto L_0x047c
        L_0x0484:
            r4 = 0
            r0 = 1
        L_0x0486:
            com.google.android.gms.measurement.internal.zzkw r3 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r0) goto L_0x0490
            r16 = 0
            goto L_0x0492
        L_0x0490:
            r16 = 1
        L_0x0492:
            java.lang.Long r17 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x057b }
            java.lang.String r18 = "auto"
            r13 = r3
            r7 = r15
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            r1.mo55510A(r3, r2)     // Catch:{ all -> 0x057b }
            goto L_0x04a6
        L_0x04a2:
            r21 = r3
            r7 = r15
            r4 = 0
        L_0x04a6:
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f47265l     // Catch:{ NameNotFoundException -> 0x04ba }
            android.content.Context r0 = r0.mo55202c()     // Catch:{ NameNotFoundException -> 0x04ba }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.m4929a(r0)     // Catch:{ NameNotFoundException -> 0x04ba }
            r3 = r21
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo21960c(r3, r13)     // Catch:{ NameNotFoundException -> 0x04b8 }
            goto L_0x04cf
        L_0x04b8:
            r0 = move-exception
            goto L_0x04bd
        L_0x04ba:
            r0 = move-exception
            r3 = r21
        L_0x04bd:
            com.google.android.gms.measurement.internal.zzeh r13 = r24.mo55221z()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzef r13 = r13.mo55098p()     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeh.m65566x(r3)     // Catch:{ all -> 0x057b }
            r13.mo55093c(r14, r3, r0)     // Catch:{ all -> 0x057b }
            r0 = r4
        L_0x04cf:
            if (r0 == 0) goto L_0x0427
            int r3 = r0.flags     // Catch:{ all -> 0x057b }
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x04dc
            r3 = 1
            r5.putLong(r10, r3)     // Catch:{ all -> 0x057b }
        L_0x04dc:
            int r0 = r0.flags     // Catch:{ all -> 0x057b }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0427
            r3 = 1
            r5.putLong(r7, r3)     // Catch:{ all -> 0x057b }
            goto L_0x0427
        L_0x04e9:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04f0
            r5.putLong(r6, r8)     // Catch:{ all -> 0x057b }
        L_0x04f0:
            com.google.android.gms.measurement.internal.zzaw r0 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x057b }
            r15.<init>(r5)     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057b }
            r1.mo55536j(r0, r2)     // Catch:{ all -> 0x057b }
            goto L_0x056a
        L_0x0505:
            com.google.android.gms.measurement.internal.zzkw r0 = new com.google.android.gms.measurement.internal.zzkw     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x057b }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x057b }
            r1.mo55510A(r0, r2)     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzfo r0 = r24.mo55185B()     // Catch:{ all -> 0x057b }
            r0.mo55073e()     // Catch:{ all -> 0x057b }
            r24.mo55526d()     // Catch:{ all -> 0x057b }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057b }
            r0.<init>()     // Catch:{ all -> 0x057b }
            r7 = 1
            r0.putLong(r10, r7)     // Catch:{ all -> 0x057b }
            r0.putLong(r6, r7)     // Catch:{ all -> 0x057b }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x057b }
            boolean r4 = r2.f47317G     // Catch:{ all -> 0x057b }
            if (r4 == 0) goto L_0x0538
            r0.putLong(r3, r7)     // Catch:{ all -> 0x057b }
        L_0x0538:
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x057b }
            r15.<init>(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057b }
            r1.mo55536j(r3, r2)     // Catch:{ all -> 0x057b }
            goto L_0x056a
        L_0x054d:
            boolean r0 = r2.f47334z     // Catch:{ all -> 0x057b }
            if (r0 == 0) goto L_0x056a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x057b }
            r0.<init>()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzaw r3 = new com.google.android.gms.measurement.internal.zzaw     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzau r15 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x057b }
            r15.<init>(r0)     // Catch:{ all -> 0x057b }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x057b }
            r1.mo55536j(r3, r2)     // Catch:{ all -> 0x057b }
        L_0x056a:
            com.google.android.gms.measurement.internal.zzam r0 = r1.f47256c     // Catch:{ all -> 0x057b }
            m66032R(r0)     // Catch:{ all -> 0x057b }
            r0.mo54985m()     // Catch:{ all -> 0x057b }
            com.google.android.gms.measurement.internal.zzam r0 = r1.f47256c
            m66032R(r0)
            r0.mo54980f0()
            return
        L_0x057b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzam r2 = r1.f47256c
            m66032R(r2)
            r2.mo54980f0()
            throw r0
        L_0x0585:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkt.mo55543o(com.google.android.gms.measurement.internal.zzq):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo55544p() {
        this.f47270q++;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: q */
    public final void mo55545q(zzac zzac) {
        zzq I = m66023I((String) Preconditions.m4488k(zzac.f46410a));
        if (I != null) {
            mo55546r(zzac, I);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final void mo55546r(zzac zzac, zzq zzq) {
        Preconditions.m4488k(zzac);
        Preconditions.m4484g(zzac.f46410a);
        Preconditions.m4488k(zzac.f46412d);
        Preconditions.m4484g(zzac.f46412d.f47282c);
        mo55185B().mo55073e();
        mo55526d();
        if (m66031Q(zzq)) {
            if (zzq.f47333s) {
                zzam zzam = this.f47256c;
                m66032R(zzam);
                zzam.mo54979e0();
                try {
                    mo55515S(zzq);
                    String str = (String) Preconditions.m4488k(zzac.f46410a);
                    zzam zzam2 = this.f47256c;
                    m66032R(zzam2);
                    zzac S = zzam2.mo54968S(str, zzac.f46412d.f47282c);
                    if (S != null) {
                        mo55221z().mo55097o().mo55093c("Removing conditional user property", zzac.f46410a, this.f47265l.mo55187D().mo55089f(zzac.f46412d.f47282c));
                        zzam zzam3 = this.f47256c;
                        m66032R(zzam3);
                        zzam3.mo54960J(str, zzac.f46412d.f47282c);
                        if (S.f46414g) {
                            zzam zzam4 = this.f47256c;
                            m66032R(zzam4);
                            zzam4.mo54983k(str, zzac.f46412d.f47282c);
                        }
                        zzaw zzaw = zzac.f46409B;
                        if (zzaw != null) {
                            zzau zzau = zzaw.f46480c;
                            mo55512D((zzaw) Preconditions.m4488k(mo55533h0().mo55616w0(str, ((zzaw) Preconditions.m4488k(zzac.f46409B)).f46479a, zzau != null ? zzau.mo55016m2() : null, S.f46411c, zzac.f46409B.f46482f, true, true)), zzq);
                        }
                    } else {
                        mo55221z().mo55103u().mo55093c("Conditional user property doesn't exist", zzeh.m65566x(zzac.f46410a), this.f47265l.mo55187D().mo55089f(zzac.f46412d.f47282c));
                    }
                    zzam zzam5 = this.f47256c;
                    m66032R(zzam5);
                    zzam5.mo54985m();
                } finally {
                    zzam zzam6 = this.f47256c;
                    m66032R(zzam6);
                    zzam6.mo54980f0();
                }
            } else {
                mo55515S(zzq);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final void mo55547s(zzkw zzkw, zzq zzq) {
        mo55185B().mo55073e();
        mo55526d();
        if (m66031Q(zzq)) {
            if (!zzq.f47333s) {
                mo55515S(zzq);
            } else if (!"_npa".equals(zzkw.f47282c) || zzq.f47319I == null) {
                mo55221z().mo55097o().mo55092b("Removing user property", this.f47265l.mo55187D().mo55089f(zzkw.f47282c));
                zzam zzam = this.f47256c;
                m66032R(zzam);
                zzam.mo54979e0();
                try {
                    mo55515S(zzq);
                    if (Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID.equals(zzkw.f47282c)) {
                        zzam zzam2 = this.f47256c;
                        m66032R(zzam2);
                        zzam2.mo54983k((String) Preconditions.m4488k(zzq.f47326a), "_lair");
                    }
                    zzam zzam3 = this.f47256c;
                    m66032R(zzam3);
                    zzam3.mo54983k((String) Preconditions.m4488k(zzq.f47326a), zzkw.f47282c);
                    zzam zzam4 = this.f47256c;
                    m66032R(zzam4);
                    zzam4.mo54985m();
                    mo55221z().mo55097o().mo55092b("User property removed", this.f47265l.mo55187D().mo55089f(zzkw.f47282c));
                } finally {
                    zzam zzam5 = this.f47256c;
                    m66032R(zzam5);
                    zzam5.mo54980f0();
                }
            } else {
                mo55221z().mo55097o().mo55091a("Falling back to manifest metadata value for ad personalization");
                mo55510A(new zzkw("_npa", mo55201a().mo21950a(), Long.valueOf(true != zzq.f47319I.booleanValue() ? 0 : 1), "auto"), zzq);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: t */
    public final void mo55548t(zzq zzq) {
        if (this.f47277x != null) {
            ArrayList arrayList = new ArrayList();
            this.f47278y = arrayList;
            arrayList.addAll(this.f47277x);
        }
        zzam zzam = this.f47256c;
        m66032R(zzam);
        String str = (String) Preconditions.m4488k(zzq.f47326a);
        Preconditions.m4484g(str);
        zzam.mo55073e();
        zzam.mo55503f();
        try {
            SQLiteDatabase P = zzam.mo54965P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzam.f46899a.mo55221z().mo55102t().mo55093c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzam.f46899a.mo55221z().mo55098p().mo55093c("Error resetting analytics data. appId, error", zzeh.m65566x(str), e);
        }
        if (zzq.f47333s) {
            mo55543o(zzq);
        }
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo55549u(String str, zzie zzie) {
        mo55185B().mo55073e();
        String str2 = this.f47252D;
        if (str2 == null || str2.equals(str) || zzie != null) {
            this.f47252D = str;
            this.f47251C = zzie;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: v */
    public final void mo55550v() {
        mo55185B().mo55073e();
        zzam zzam = this.f47256c;
        m66032R(zzam);
        zzam.mo54982h0();
        if (this.f47262i.f47183g.mo55120a() == 0) {
            this.f47262i.f47183g.mo55121b(mo55201a().mo21950a());
        }
        m66027M();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final void mo55551w(zzac zzac) {
        zzq I = m66023I((String) Preconditions.m4488k(zzac.f46410a));
        if (I != null) {
            mo55552x(zzac, I);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final void mo55552x(zzac zzac, zzq zzq) {
        Preconditions.m4488k(zzac);
        Preconditions.m4484g(zzac.f46410a);
        Preconditions.m4488k(zzac.f46411c);
        Preconditions.m4488k(zzac.f46412d);
        Preconditions.m4484g(zzac.f46412d.f47282c);
        mo55185B().mo55073e();
        mo55526d();
        if (m66031Q(zzq)) {
            if (!zzq.f47333s) {
                mo55515S(zzq);
                return;
            }
            zzac zzac2 = new zzac(zzac);
            boolean z = false;
            zzac2.f46414g = false;
            zzam zzam = this.f47256c;
            m66032R(zzam);
            zzam.mo54979e0();
            try {
                zzam zzam2 = this.f47256c;
                m66032R(zzam2);
                zzac S = zzam2.mo54968S((String) Preconditions.m4488k(zzac2.f46410a), zzac2.f46412d.f47282c);
                if (S != null && !S.f46411c.equals(zzac2.f46411c)) {
                    mo55221z().mo55103u().mo55094d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f47265l.mo55187D().mo55089f(zzac2.f46412d.f47282c), zzac2.f46411c, S.f46411c);
                }
                if (S != null && S.f46414g) {
                    zzac2.f46411c = S.f46411c;
                    zzac2.f46413f = S.f46413f;
                    zzac2.f46417s = S.f46417s;
                    zzac2.f46415o = S.f46415o;
                    zzac2.f46418z = S.f46418z;
                    zzac2.f46414g = true;
                    zzkw zzkw = zzac2.f46412d;
                    zzac2.f46412d = new zzkw(zzkw.f47282c, S.f46412d.f47283d, zzkw.mo55568l2(), S.f46412d.f47286o);
                } else if (TextUtils.isEmpty(zzac2.f46415o)) {
                    zzkw zzkw2 = zzac2.f46412d;
                    zzac2.f46412d = new zzkw(zzkw2.f47282c, zzac2.f46413f, zzkw2.mo55568l2(), zzac2.f46412d.f47286o);
                    zzac2.f46414g = true;
                    z = true;
                }
                if (zzac2.f46414g) {
                    zzkw zzkw3 = zzac2.f46412d;
                    zzky zzky = new zzky((String) Preconditions.m4488k(zzac2.f46410a), zzac2.f46411c, zzkw3.f47282c, zzkw3.f47283d, Preconditions.m4488k(zzkw3.mo55568l2()));
                    zzam zzam3 = this.f47256c;
                    m66032R(zzam3);
                    if (zzam3.mo54994v(zzky)) {
                        mo55221z().mo55097o().mo55094d("User property updated immediately", zzac2.f46410a, this.f47265l.mo55187D().mo55089f(zzky.f47290c), zzky.f47292e);
                    } else {
                        mo55221z().mo55098p().mo55094d("(2)Too many active user properties, ignoring", zzeh.m65566x(zzac2.f46410a), this.f47265l.mo55187D().mo55089f(zzky.f47290c), zzky.f47292e);
                    }
                    if (z && zzac2.f46418z != null) {
                        mo55512D(new zzaw(zzac2.f46418z, zzac2.f46413f), zzq);
                    }
                }
                zzam zzam4 = this.f47256c;
                m66032R(zzam4);
                if (zzam4.mo54993u(zzac2)) {
                    mo55221z().mo55097o().mo55094d("Conditional property added", zzac2.f46410a, this.f47265l.mo55187D().mo55089f(zzac2.f46412d.f47282c), zzac2.f46412d.mo55568l2());
                } else {
                    mo55221z().mo55098p().mo55094d("Too many conditional properties, ignoring", zzeh.m65566x(zzac2.f46410a), this.f47265l.mo55187D().mo55089f(zzac2.f46412d.f47282c), zzac2.f46412d.mo55568l2());
                }
                zzam zzam5 = this.f47256c;
                m66032R(zzam5);
                zzam5.mo54985m();
            } finally {
                zzam zzam6 = this.f47256c;
                m66032R(zzam6);
                zzam6.mo54980f0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final void mo55553y(String str, zzai zzai) {
        mo55185B().mo55073e();
        mo55526d();
        this.f47249A.put(str, zzai);
        zzam zzam = this.f47256c;
        m66032R(zzam);
        Preconditions.m4488k(str);
        Preconditions.m4488k(zzai);
        zzam.mo55073e();
        zzam.mo55503f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzai.mo54948h());
        try {
            if (zzam.mo54965P().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                zzam.f46899a.mo55221z().mo55098p().mo55092b("Failed to insert/update consent setting (got -1). appId", zzeh.m65566x(str));
            }
        } catch (SQLiteException e) {
            zzam.f46899a.mo55221z().mo55098p().mo55093c("Error storing consent setting. appId, error", zzeh.m65566x(str), e);
        }
    }

    /* renamed from: z */
    public final zzeh mo55221z() {
        return ((zzfr) Preconditions.m4488k(this.f47265l)).mo55221z();
    }
}
