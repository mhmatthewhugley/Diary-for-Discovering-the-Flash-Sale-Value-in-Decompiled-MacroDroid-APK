package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zznw;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzfr implements zzgm {

    /* renamed from: H */
    private static volatile zzfr f46811H;

    /* renamed from: A */
    private volatile Boolean f46812A;
    @VisibleForTesting

    /* renamed from: B */
    protected Boolean f46813B;
    @VisibleForTesting

    /* renamed from: C */
    protected Boolean f46814C;

    /* renamed from: D */
    private volatile boolean f46815D;

    /* renamed from: E */
    private int f46816E;

    /* renamed from: F */
    private final AtomicInteger f46817F = new AtomicInteger(0);
    @VisibleForTesting

    /* renamed from: G */
    final long f46818G;

    /* renamed from: a */
    private final Context f46819a;

    /* renamed from: b */
    private final String f46820b;

    /* renamed from: c */
    private final String f46821c;

    /* renamed from: d */
    private final String f46822d;

    /* renamed from: e */
    private final boolean f46823e;

    /* renamed from: f */
    private final zzab f46824f;

    /* renamed from: g */
    private final zzag f46825g;

    /* renamed from: h */
    private final zzew f46826h;

    /* renamed from: i */
    private final zzeh f46827i;

    /* renamed from: j */
    private final zzfo f46828j;

    /* renamed from: k */
    private final zzkc f46829k;

    /* renamed from: l */
    private final zzlb f46830l;

    /* renamed from: m */
    private final zzec f46831m;

    /* renamed from: n */
    private final Clock f46832n;

    /* renamed from: o */
    private final zzim f46833o;

    /* renamed from: p */
    private final zzhx f46834p;

    /* renamed from: q */
    private final zzd f46835q;

    /* renamed from: r */
    private final zzib f46836r;

    /* renamed from: s */
    private final String f46837s;

    /* renamed from: t */
    private zzea f46838t;

    /* renamed from: u */
    private zzjm f46839u;

    /* renamed from: v */
    private zzaq f46840v;

    /* renamed from: w */
    private zzdy f46841w;

    /* renamed from: x */
    private boolean f46842x = false;

    /* renamed from: y */
    private Boolean f46843y;

    /* renamed from: z */
    private long f46844z;

    zzfr(zzgu zzgu) {
        long j;
        Bundle bundle;
        boolean z = false;
        Preconditions.m4488k(zzgu);
        Context context = zzgu.f46912a;
        zzab zzab = new zzab(context);
        this.f46824f = zzab;
        zzdr.f46561a = zzab;
        this.f46819a = context;
        this.f46820b = zzgu.f46913b;
        this.f46821c = zzgu.f46914c;
        this.f46822d = zzgu.f46915d;
        this.f46823e = zzgu.f46919h;
        this.f46812A = zzgu.f46916e;
        this.f46837s = zzgu.f46921j;
        this.f46815D = true;
        zzcl zzcl = zzgu.f46918g;
        if (!(zzcl == null || (bundle = zzcl.f41312p) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f46813B = (Boolean) obj;
            }
            Object obj2 = zzcl.f41312p.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f46814C = (Boolean) obj2;
            }
        }
        zzib.m60294e(context);
        Clock d = DefaultClock.m4871d();
        this.f46832n = d;
        Long l = zzgu.f46920i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = d.mo21950a();
        }
        this.f46818G = j;
        this.f46825g = new zzag(this);
        zzew zzew = new zzew(this);
        zzew.mo55244j();
        this.f46826h = zzew;
        zzeh zzeh = new zzeh(this);
        zzeh.mo55244j();
        this.f46827i = zzeh;
        zzlb zzlb = new zzlb(this);
        zzlb.mo55244j();
        this.f46830l = zzlb;
        this.f46831m = new zzec(new zzgt(zzgu, this));
        this.f46835q = new zzd(this);
        zzim zzim = new zzim(this);
        zzim.mo55141g();
        this.f46833o = zzim;
        zzhx zzhx = new zzhx(this);
        zzhx.mo55141g();
        this.f46834p = zzhx;
        zzkc zzkc = new zzkc(this);
        zzkc.mo55141g();
        this.f46829k = zzkc;
        zzib zzib = new zzib(this);
        zzib.mo55244j();
        this.f46836r = zzib;
        zzfo zzfo = new zzfo(this);
        zzfo.mo55244j();
        this.f46828j = zzfo;
        zzcl zzcl2 = zzgu.f46918g;
        z = (zzcl2 == null || zzcl2.f41307c == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            zzhx I = mo55191I();
            if (I.f46899a.f46819a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f46899a.f46819a.getApplicationContext();
                if (I.f47032c == null) {
                    I.f47032c = new zzhw(I, (zzhv) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f47032c);
                    application.registerActivityLifecycleCallbacks(I.f47032c);
                    I.f46899a.mo55221z().mo55102t().mo55091a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo55221z().mo55103u().mo55091a("Application context is not an Application");
        }
        zzfo.mo55181x(new zzfq(this, zzgu));
    }

    /* renamed from: H */
    public static zzfr m65677H(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.f41310g == null || zzcl.f41311o == null)) {
            zzcl = new zzcl(zzcl.f41306a, zzcl.f41307c, zzcl.f41308d, zzcl.f41309f, (String) null, (String) null, zzcl.f41312p, (String) null);
        }
        Preconditions.m4488k(context);
        Preconditions.m4488k(context.getApplicationContext());
        if (f46811H == null) {
            synchronized (zzfr.class) {
                if (f46811H == null) {
                    f46811H = new zzfr(new zzgu(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.f41312p) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.m4488k(f46811H);
            f46811H.f46812A = Boolean.valueOf(zzcl.f41312p.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.m4488k(f46811H);
        return f46811H;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m65678b(zzfr zzfr, zzgu zzgu) {
        zzfr.mo55185B().mo55073e();
        zzfr.f46825g.mo54938u();
        zzaq zzaq = new zzaq(zzfr);
        zzaq.mo55244j();
        zzfr.f46840v = zzaq;
        zzdy zzdy = new zzdy(zzfr, zzgu.f46917f);
        zzdy.mo55141g();
        zzfr.f46841w = zzdy;
        zzea zzea = new zzea(zzfr);
        zzea.mo55141g();
        zzfr.f46838t = zzea;
        zzjm zzjm = new zzjm(zzfr);
        zzjm.mo55141g();
        zzfr.f46839u = zzjm;
        zzfr.f46830l.mo55245k();
        zzfr.f46826h.mo55245k();
        zzfr.f46841w.mo55142i();
        zzef s = zzfr.mo55221z().mo55101s();
        zzfr.f46825g.mo54932o();
        s.mo55092b("App measurement initialized, version", 74029L);
        zzfr.mo55221z().mo55101s().mo55091a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String q = zzdy.mo55063q();
        if (TextUtils.isEmpty(zzfr.f46820b)) {
            if (zzfr.mo55196N().mo55591T(q)) {
                zzfr.mo55221z().mo55101s().mo55091a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzfr.mo55221z().mo55101s().mo55091a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(q)));
            }
        }
        zzfr.mo55221z().mo55097o().mo55091a("Debug-level message logging enabled");
        if (zzfr.f46816E != zzfr.f46817F.get()) {
            zzfr.mo55221z().mo55098p().mo55093c("Not all components initialized", Integer.valueOf(zzfr.f46816E), Integer.valueOf(zzfr.f46817F.get()));
        }
        zzfr.f46842x = true;
    }

    /* renamed from: r */
    static final void m65679r() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: s */
    private static final void m65680s(zzgk zzgk) {
        if (zzgk == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: t */
    private static final void m65681t(zzf zzf) {
        if (zzf == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzf.mo55143k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzf.getClass())));
        }
    }

    /* renamed from: u */
    private static final void m65682u(zzgl zzgl) {
        if (zzgl == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzgl.mo55246l()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgl.getClass())));
        }
    }

    /* renamed from: A */
    public final zzdy mo55184A() {
        m65681t(this.f46841w);
        return this.f46841w;
    }

    /* renamed from: B */
    public final zzfo mo55185B() {
        m65682u(this.f46828j);
        return this.f46828j;
    }

    /* renamed from: C */
    public final zzea mo55186C() {
        m65681t(this.f46838t);
        return this.f46838t;
    }

    /* renamed from: D */
    public final zzec mo55187D() {
        return this.f46831m;
    }

    /* renamed from: E */
    public final zzeh mo55188E() {
        zzeh zzeh = this.f46827i;
        if (zzeh == null || !zzeh.mo55246l()) {
            return null;
        }
        return zzeh;
    }

    /* renamed from: F */
    public final zzew mo55189F() {
        m65680s(this.f46826h);
        return this.f46826h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final zzfo mo55190G() {
        return this.f46828j;
    }

    /* renamed from: I */
    public final zzhx mo55191I() {
        m65681t(this.f46834p);
        return this.f46834p;
    }

    /* renamed from: J */
    public final zzib mo55192J() {
        m65682u(this.f46836r);
        return this.f46836r;
    }

    /* renamed from: K */
    public final zzim mo55193K() {
        m65681t(this.f46833o);
        return this.f46833o;
    }

    /* renamed from: L */
    public final zzjm mo55194L() {
        m65681t(this.f46839u);
        return this.f46839u;
    }

    /* renamed from: M */
    public final zzkc mo55195M() {
        m65681t(this.f46829k);
        return this.f46829k;
    }

    /* renamed from: N */
    public final zzlb mo55196N() {
        m65680s(this.f46830l);
        return this.f46830l;
    }

    /* renamed from: O */
    public final String mo55197O() {
        return this.f46820b;
    }

    /* renamed from: P */
    public final String mo55198P() {
        return this.f46821c;
    }

    /* renamed from: Q */
    public final String mo55199Q() {
        return this.f46822d;
    }

    /* renamed from: R */
    public final String mo55200R() {
        return this.f46837s;
    }

    /* renamed from: a */
    public final Clock mo55201a() {
        return this.f46832n;
    }

    /* renamed from: c */
    public final Context mo55202c() {
        return this.f46819a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo55203d() {
        this.f46817F.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo55204e(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo55221z().mo55103u().mo55093c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo55189F().f46752s.mo55116a(true);
            if (bArr == null || bArr.length == 0) {
                mo55221z().mo55097o().mo55091a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo55221z().mo55097o().mo55091a("Deferred Deep Link is empty.");
                    return;
                }
                zzlb N = mo55196N();
                zzfr zzfr = N.f46899a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f46899a.f46819a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f46834p.mo55375s("auto", "_cmp", bundle);
                        zzlb N2 = mo55196N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f46899a.f46819a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f46899a.f46819a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f46899a.mo55221z().mo55098p().mo55092b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo55221z().mo55103u().mo55093c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo55221z().mo55098p().mo55092b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo55221z().mo55103u().mo55093c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo55205f() {
        this.f46816E++;
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo55206g() {
        mo55185B().mo55073e();
        m65682u(mo55192J());
        String q = mo55184A().mo55063q();
        Pair n = mo55189F().mo55128n(q);
        if (!this.f46825g.mo54942y() || ((Boolean) n.second).booleanValue() || TextUtils.isEmpty((CharSequence) n.first)) {
            mo55221z().mo55097o().mo55091a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzib J = mo55192J();
        J.mo55243i();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f46899a.f46819a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo55221z().mo55103u().mo55091a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzlb N = mo55196N();
        mo55184A().f46899a.f46825g.mo54932o();
        URL q2 = N.mo55607q(74029, q, (String) n.first, mo55189F().f46753t.mo55120a() - 1);
        if (q2 != null) {
            zzib J2 = mo55192J();
            zzfp zzfp = new zzfp(this);
            J2.mo55073e();
            J2.mo55243i();
            Preconditions.m4488k(q2);
            Preconditions.m4488k(zzfp);
            J2.f46899a.mo55185B().mo55180w(new zzia(J2, q, q2, (byte[]) null, (Map) null, zzfp, (byte[]) null));
        }
    }

    /* renamed from: h */
    public final zzab mo55207h() {
        return this.f46824f;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: i */
    public final void mo55208i(boolean z) {
        this.f46812A = Boolean.valueOf(z);
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo55209j(boolean z) {
        mo55185B().mo55073e();
        this.f46815D = z;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: k */
    public final void mo55210k(zzcl zzcl) {
        zzai zzai;
        mo55185B().mo55073e();
        zzai o = mo55189F().mo55129o();
        zzew F = mo55189F();
        zzfr zzfr = F.f46899a;
        F.mo55073e();
        int i = 100;
        int i2 = F.mo55127m().getInt("consent_source", 100);
        zzag zzag = this.f46825g;
        zzfr zzfr2 = zzag.f46899a;
        Boolean r = zzag.mo54935r("google_analytics_default_allow_ad_storage");
        zzag zzag2 = this.f46825g;
        zzfr zzfr3 = zzag2.f46899a;
        Boolean r2 = zzag2.mo54935r("google_analytics_default_allow_analytics_storage");
        if (!(r == null && r2 == null) && mo55189F().mo55135u(-10)) {
            zzai = new zzai(r, r2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo55184A().mo55064r()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo55191I().mo55349G(zzai.f46427b, -10, this.f46818G);
            } else if (TextUtils.isEmpty(mo55184A().mo55064r()) && zzcl != null && zzcl.f41312p != null && mo55189F().mo55135u(30)) {
                zzai = zzai.m65383a(zzcl.f41312p);
                if (!zzai.equals(zzai.f46427b)) {
                    i = 30;
                }
            }
            zzai = null;
        }
        if (zzai != null) {
            mo55191I().mo55349G(zzai, i, this.f46818G);
            o = zzai;
        }
        mo55191I().mo55352J(o);
        if (mo55189F().f46738e.mo55120a() == 0) {
            mo55221z().mo55102t().mo55092b("Persisting first open", Long.valueOf(this.f46818G));
            mo55189F().f46738e.mo55121b(this.f46818G);
        }
        mo55191I().f47043n.mo55626c();
        if (mo55215p()) {
            if (!TextUtils.isEmpty(mo55184A().mo55064r()) || !TextUtils.isEmpty(mo55184A().mo55062p())) {
                zzlb N = mo55196N();
                String r3 = mo55184A().mo55064r();
                zzew F2 = mo55189F();
                F2.mo55073e();
                String string = F2.mo55127m().getString("gmp_app_id", (String) null);
                String p = mo55184A().mo55062p();
                zzew F3 = mo55189F();
                F3.mo55073e();
                if (N.mo55594b0(r3, string, p, F3.mo55127m().getString("admob_app_id", (String) null))) {
                    mo55221z().mo55101s().mo55091a("Rechecking which service to use due to a GMP App Id change");
                    zzew F4 = mo55189F();
                    F4.mo55073e();
                    Boolean p2 = F4.mo55130p();
                    SharedPreferences.Editor edit = F4.mo55127m().edit();
                    edit.clear();
                    edit.apply();
                    if (p2 != null) {
                        F4.mo55131q(p2);
                    }
                    mo55186C().mo55076o();
                    this.f46839u.mo55447Q();
                    this.f46839u.mo55446P();
                    mo55189F().f46738e.mo55121b(this.f46818G);
                    mo55189F().f46740g.mo55125b((String) null);
                }
                zzew F5 = mo55189F();
                String r4 = mo55184A().mo55064r();
                F5.mo55073e();
                SharedPreferences.Editor edit2 = F5.mo55127m().edit();
                edit2.putString("gmp_app_id", r4);
                edit2.apply();
                zzew F6 = mo55189F();
                String p3 = mo55184A().mo55062p();
                F6.mo55073e();
                SharedPreferences.Editor edit3 = F6.mo55127m().edit();
                edit3.putString("admob_app_id", p3);
                edit3.apply();
            }
            if (!mo55189F().mo55129o().mo54950i(zzah.ANALYTICS_STORAGE)) {
                mo55189F().f46740g.mo55125b((String) null);
            }
            mo55191I().mo55345C(mo55189F().f46740g.mo55124a());
            zznw.m61041b();
            if (this.f46825g.mo54919A((String) null, zzdu.f46605e0)) {
                try {
                    mo55196N().f46899a.f46819a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo55189F().f46754u.mo55124a())) {
                        mo55221z().mo55103u().mo55091a("Remote config removed with active feature rollouts");
                        mo55189F().f46754u.mo55125b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo55184A().mo55064r()) || !TextUtils.isEmpty(mo55184A().mo55062p())) {
                boolean m = mo55212m();
                if (!mo55189F().mo55133s() && !this.f46825g.mo54922E()) {
                    mo55189F().mo55132r(!m);
                }
                if (m) {
                    mo55191I().mo55368f0();
                }
                mo55195M().f47218d.mo55495a();
                mo55194L().mo55449S(new AtomicReference());
                mo55194L().mo55462t(mo55189F().f46757x.mo55118a());
            }
        } else if (mo55212m()) {
            if (!mo55196N().mo55590S("android.permission.INTERNET")) {
                mo55221z().mo55098p().mo55091a("App is missing INTERNET permission");
            }
            if (!mo55196N().mo55590S("android.permission.ACCESS_NETWORK_STATE")) {
                mo55221z().mo55098p().mo55091a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.m4929a(this.f46819a).mo21964g() && !this.f46825g.mo54924G()) {
                if (!zzlb.m66122Y(this.f46819a)) {
                    mo55221z().mo55098p().mo55091a("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzlb.m66123Z(this.f46819a, false)) {
                    mo55221z().mo55098p().mo55091a("AppMeasurementService not registered/enabled");
                }
            }
            mo55221z().mo55098p().mo55091a("Uploading is not possible. App measurement disabled");
        }
        mo55189F().f46747n.mo55116a(true);
    }

    @WorkerThread
    /* renamed from: l */
    public final boolean mo55211l() {
        return this.f46812A != null && this.f46812A.booleanValue();
    }

    @WorkerThread
    /* renamed from: m */
    public final boolean mo55212m() {
        return mo55217v() == 0;
    }

    @WorkerThread
    /* renamed from: n */
    public final boolean mo55213n() {
        mo55185B().mo55073e();
        return this.f46815D;
    }

    /* renamed from: o */
    public final boolean mo55214o() {
        return TextUtils.isEmpty(this.f46820b);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: p */
    public final boolean mo55215p() {
        if (this.f46842x) {
            mo55185B().mo55073e();
            Boolean bool = this.f46843y;
            if (bool == null || this.f46844z == 0 || (!bool.booleanValue() && Math.abs(this.f46832n.mo21952c() - this.f46844z) > 1000)) {
                this.f46844z = this.f46832n.mo21952c();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo55196N().mo55590S("android.permission.INTERNET") && mo55196N().mo55590S("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.m4929a(this.f46819a).mo21964g() || this.f46825g.mo54924G() || (zzlb.m66122Y(this.f46819a) && zzlb.m66123Z(this.f46819a, false))));
                this.f46843y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo55196N().mo55583L(mo55184A().mo55064r(), mo55184A().mo55062p()) && TextUtils.isEmpty(mo55184A().mo55062p())) {
                        z = false;
                    }
                    this.f46843y = Boolean.valueOf(z);
                }
            }
            return this.f46843y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: q */
    public final boolean mo55216q() {
        return this.f46823e;
    }

    @WorkerThread
    /* renamed from: v */
    public final int mo55217v() {
        mo55185B().mo55073e();
        if (this.f46825g.mo54922E()) {
            return 1;
        }
        Boolean bool = this.f46814C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo55185B().mo55073e();
        if (!this.f46815D) {
            return 8;
        }
        Boolean p = mo55189F().mo55130p();
        if (p == null) {
            zzag zzag = this.f46825g;
            zzab zzab = zzag.f46899a.f46824f;
            Boolean r = zzag.mo54935r("firebase_analytics_collection_enabled");
            if (r == null) {
                Boolean bool2 = this.f46813B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.f46812A == null || this.f46812A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (r.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (p.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* renamed from: w */
    public final zzd mo55218w() {
        zzd zzd = this.f46835q;
        if (zzd != null) {
            return zzd;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: x */
    public final zzag mo55219x() {
        return this.f46825g;
    }

    /* renamed from: y */
    public final zzaq mo55220y() {
        m65682u(this.f46840v);
        return this.f46840v;
    }

    /* renamed from: z */
    public final zzeh mo55221z() {
        m65682u(this.f46827i);
        return this.f46827i;
    }
}
