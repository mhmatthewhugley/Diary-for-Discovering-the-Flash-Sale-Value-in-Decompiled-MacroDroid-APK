package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzpd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzhx extends zzf {
    @VisibleForTesting

    /* renamed from: c */
    protected zzhw f47032c;

    /* renamed from: d */
    private zzgr f47033d;

    /* renamed from: e */
    private final Set f47034e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f47035f;

    /* renamed from: g */
    private final AtomicReference f47036g = new AtomicReference();

    /* renamed from: h */
    private final Object f47037h = new Object();
    @GuardedBy("consentLock")

    /* renamed from: i */
    private zzai f47038i = new zzai((Boolean) null, (Boolean) null);
    @GuardedBy("consentLock")

    /* renamed from: j */
    private int f47039j = 100;

    /* renamed from: k */
    private final AtomicLong f47040k = new AtomicLong(0);

    /* renamed from: l */
    private long f47041l = -1;

    /* renamed from: m */
    private int f47042m = 100;

    /* renamed from: n */
    final zzs f47043n;
    @VisibleForTesting

    /* renamed from: o */
    protected boolean f47044o = true;

    /* renamed from: p */
    private final zzla f47045p = new zzhl(this);

    protected zzhx(zzfr zzfr) {
        super(zzfr);
        this.f47043n = new zzs(zzfr);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: O */
    public final void m65835O(Boolean bool, boolean z) {
        mo55073e();
        mo55140f();
        this.f46899a.mo55221z().mo55097o().mo55092b("Setting app measurement enabled (FE)", bool);
        this.f46899a.mo55189F().mo55131q(bool);
        if (z) {
            zzew F = this.f46899a.mo55189F();
            zzfr zzfr = F.f46899a;
            F.mo55073e();
            SharedPreferences.Editor edit = F.mo55127m().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f46899a.mo55213n() || (bool != null && !bool.booleanValue())) {
            m65836P();
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: P */
    public final void m65836P() {
        mo55073e();
        String a = this.f46899a.mo55189F().f46746m.mo55124a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo55355M("app", "_npa", (Object) null, this.f46899a.mo55201a().mo21950a());
            } else {
                mo55355M("app", "_npa", Long.valueOf(true != "true".equals(a) ? 0 : 1), this.f46899a.mo55201a().mo21950a());
            }
        }
        if (!this.f46899a.mo55212m() || !this.f47044o) {
            this.f46899a.mo55221z().mo55097o().mo55091a("Updating Scion state (FE)");
            this.f46899a.mo55194L().mo55463u();
            return;
        }
        this.f46899a.mo55221z().mo55097o().mo55091a("Recording app launch after enabling measurement for the first time (FE)");
        mo55368f0();
        zzof.m61057b();
        if (this.f46899a.mo55219x().mo54919A((String) null, zzdu.f46607f0)) {
            this.f46899a.mo55195M().f47218d.mo55495a();
        }
        this.f46899a.mo55185B().mo55181x(new zzgz(this));
    }

    /* renamed from: b0 */
    static /* bridge */ /* synthetic */ void m65837b0(zzhx zzhx, zzai zzai, zzai zzai2) {
        boolean z;
        zzah[] zzahArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzah zzah = zzahArr[i];
            if (!zzai2.mo54950i(zzah) && zzai.mo54950i(zzah)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = zzai.mo54952l(zzai2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || l) {
            zzhx.f46899a.mo55184A().mo55066t();
        }
    }

    /* renamed from: c0 */
    static /* synthetic */ void m65838c0(zzhx zzhx, zzai zzai, int i, long j, boolean z, boolean z2) {
        zzhx.mo55073e();
        zzhx.mo55140f();
        if (j > zzhx.f47041l || !zzai.m65386j(zzhx.f47042m, i)) {
            zzew F = zzhx.f46899a.mo55189F();
            zzfr zzfr = F.f46899a;
            F.mo55073e();
            if (F.mo55135u(i)) {
                SharedPreferences.Editor edit = F.mo55127m().edit();
                edit.putString("consent_settings", zzai.mo54948h());
                edit.putInt("consent_source", i);
                edit.apply();
                zzhx.f47041l = j;
                zzhx.f47042m = i;
                zzhx.f46899a.mo55194L().mo55460r(z);
                if (z2) {
                    zzhx.f46899a.mo55194L().mo55449S(new AtomicReference());
                    return;
                }
                return;
            }
            zzhx.f46899a.mo55221z().mo55101s().mo55092b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        zzhx.f46899a.mo55221z().mo55101s().mo55092b("Dropped out-of-date consent setting, proposed settings", zzai);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo55344A(String str, String str2, long j, Object obj) {
        this.f46899a.mo55185B().mo55181x(new zzhc(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo55345C(String str) {
        this.f47036g.set(str);
    }

    /* renamed from: D */
    public final void mo55346D(Bundle bundle) {
        mo55347E(bundle, this.f46899a.mo55201a().mo21950a());
    }

    /* renamed from: E */
    public final void mo55347E(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Preconditions.m4488k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f46899a.mo55221z().mo55103u().mo55091a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.m4488k(bundle2);
        zzgn.m65766a(bundle2, "app_id", cls2, (Object) null);
        zzgn.m65766a(bundle2, "origin", cls2, (Object) null);
        zzgn.m65766a(bundle2, "name", cls2, (Object) null);
        zzgn.m65766a(bundle2, "value", Object.class, (Object) null);
        zzgn.m65766a(bundle2, "trigger_event_name", cls2, (Object) null);
        zzgn.m65766a(bundle2, "trigger_timeout", cls, 0L);
        zzgn.m65766a(bundle2, "timed_out_event_name", cls2, (Object) null);
        zzgn.m65766a(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        zzgn.m65766a(bundle2, "triggered_event_name", cls2, (Object) null);
        zzgn.m65766a(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        zzgn.m65766a(bundle2, "time_to_live", cls, 0L);
        zzgn.m65766a(bundle2, "expired_event_name", cls2, (Object) null);
        zzgn.m65766a(bundle2, "expired_event_params", Bundle.class, (Object) null);
        Preconditions.m4484g(bundle2.getString("name"));
        Preconditions.m4484g(bundle2.getString("origin"));
        Preconditions.m4488k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f46899a.mo55196N().mo55602n0(string) != 0) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Invalid conditional user property name", this.f46899a.mo55187D().mo55089f(string));
        } else if (this.f46899a.mo55196N().mo55596j0(string, obj) == 0) {
            Object n = this.f46899a.mo55196N().mo55601n(string, obj);
            if (n == null) {
                this.f46899a.mo55221z().mo55098p().mo55093c("Unable to normalize conditional user property value", this.f46899a.mo55187D().mo55089f(string), obj);
                return;
            }
            zzgn.m65767b(bundle2, n);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f46899a.mo55219x();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f46899a.mo55221z().mo55098p().mo55093c("Invalid conditional user property timeout", this.f46899a.mo55187D().mo55089f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f46899a.mo55219x();
            if (j3 > 15552000000L || j3 < 1) {
                this.f46899a.mo55221z().mo55098p().mo55093c("Invalid conditional user property time to live", this.f46899a.mo55187D().mo55089f(string), Long.valueOf(j3));
            } else {
                this.f46899a.mo55185B().mo55181x(new zzhf(this, bundle2));
            }
        } else {
            this.f46899a.mo55221z().mo55098p().mo55093c("Invalid conditional user property value", this.f46899a.mo55187D().mo55089f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo55348F(Bundle bundle, int i, long j) {
        mo55140f();
        String g = zzai.m65385g(bundle);
        if (g != null) {
            this.f46899a.mo55221z().mo55104v().mo55092b("Ignoring invalid consent setting", g);
            this.f46899a.mo55221z().mo55104v().mo55091a("Valid consent values are 'granted', 'denied'");
        }
        mo55349G(zzai.m65383a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo55349G(zzai zzai, int i, long j) {
        zzai zzai2;
        boolean z;
        boolean z2;
        boolean z3;
        zzai zzai3 = zzai;
        int i2 = i;
        mo55140f();
        if (i2 != -10 && zzai.mo54945e() == null && zzai.mo54947f() == null) {
            this.f46899a.mo55221z().mo55104v().mo55091a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f47037h) {
            zzai2 = this.f47038i;
            z = true;
            z2 = false;
            if (zzai.m65386j(i2, this.f47039j)) {
                boolean k = zzai3.mo54951k(this.f47038i);
                zzah zzah = zzah.ANALYTICS_STORAGE;
                if (zzai3.mo54950i(zzah) && !this.f47038i.mo54950i(zzah)) {
                    z2 = true;
                }
                zzai3 = zzai3.mo54944d(this.f47038i);
                this.f47038i = zzai3;
                this.f47039j = i2;
                z3 = z2;
                z2 = k;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f46899a.mo55221z().mo55101s().mo55092b("Ignoring lower-priority consent settings, proposed settings", zzai3);
            return;
        }
        long andIncrement = this.f47040k.getAndIncrement();
        if (z2) {
            this.f47036g.set((Object) null);
            this.f46899a.mo55185B().mo55182y(new zzhr(this, zzai3, j, i, andIncrement, z3, zzai2));
            return;
        }
        zzhs zzhs = new zzhs(this, zzai3, i, andIncrement, z3, zzai2);
        if (i2 == 30 || i2 == -10) {
            this.f46899a.mo55185B().mo55182y(zzhs);
        } else {
            this.f46899a.mo55185B().mo55181x(zzhs);
        }
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo55350H(zzgr zzgr) {
        zzgr zzgr2;
        mo55073e();
        mo55140f();
        if (!(zzgr == null || zzgr == (zzgr2 = this.f47033d))) {
            Preconditions.m4494q(zzgr2 == null, "EventInterceptor already set.");
        }
        this.f47033d = zzgr;
    }

    /* renamed from: I */
    public final void mo55351I(Boolean bool) {
        mo55140f();
        this.f46899a.mo55185B().mo55181x(new zzhq(this, bool));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: J */
    public final void mo55352J(zzai zzai) {
        mo55073e();
        boolean z = (zzai.mo54950i(zzah.ANALYTICS_STORAGE) && zzai.mo54950i(zzah.AD_STORAGE)) || this.f46899a.mo55194L().mo55467y();
        if (z != this.f46899a.mo55213n()) {
            this.f46899a.mo55209j(z);
            zzew F = this.f46899a.mo55189F();
            zzfr zzfr = F.f46899a;
            F.mo55073e();
            Boolean valueOf = F.mo55127m().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.mo55127m().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m65835O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void mo55353K(String str, String str2, Object obj, boolean z) {
        mo55354L("auto", "_ldl", obj, true, this.f46899a.mo55201a().mo21950a());
    }

    /* renamed from: L */
    public final void mo55354L(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z) {
            i = this.f46899a.mo55196N().mo55602n0(str3);
        } else {
            zzlb N = this.f46899a.mo55196N();
            if (N.mo55589R("user property", str3)) {
                if (!N.mo55585N("user property", zzgq.f46909a, (String[]) null, str3)) {
                    i = 15;
                } else {
                    N.f46899a.mo55219x();
                    if (N.mo55584M("user property", 24, str3)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzlb N2 = this.f46899a.mo55196N();
            this.f46899a.mo55219x();
            this.f46899a.mo55196N().mo55573A(this.f47045p, (String) null, i, "_ev", N2.mo55605p(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int j0 = this.f46899a.mo55196N().mo55596j0(str3, obj2);
            if (j0 != 0) {
                zzlb N3 = this.f46899a.mo55196N();
                this.f46899a.mo55219x();
                String p = N3.mo55605p(str3, 24, true);
                if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                    i2 = obj.toString().length();
                } else {
                    i2 = 0;
                }
                this.f46899a.mo55196N().mo55573A(this.f47045p, (String) null, j0, "_ev", p, i2);
                return;
            }
            Object n = this.f46899a.mo55196N().mo55601n(str3, obj2);
            if (n != null) {
                mo55344A(str4, str2, j, n);
            }
        } else {
            mo55344A(str4, str2, j, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    @androidx.annotation.WorkerThread
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55355M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.m4484g(r9)
            com.google.android.gms.common.internal.Preconditions.m4484g(r10)
            r8.mo55073e()
            r8.mo55140f()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzfr r10 = r8.f46899a
            com.google.android.gms.measurement.internal.zzew r10 = r10.mo55189F()
            com.google.android.gms.measurement.internal.zzev r10 = r10.f46746m
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.mo55125b(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.zzfr r10 = r8.f46899a
            com.google.android.gms.measurement.internal.zzew r10 = r10.mo55189F()
            com.google.android.gms.measurement.internal.zzev r10 = r10.f46746m
            java.lang.String r0 = "unset"
            r10.mo55125b(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            com.google.android.gms.measurement.internal.zzfr r10 = r8.f46899a
            boolean r10 = r10.mo55212m()
            if (r10 != 0) goto L_0x007e
            com.google.android.gms.measurement.internal.zzfr r9 = r8.f46899a
            com.google.android.gms.measurement.internal.zzeh r9 = r9.mo55221z()
            com.google.android.gms.measurement.internal.zzef r9 = r9.mo55102t()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo55091a(r10)
            return
        L_0x007e:
            com.google.android.gms.measurement.internal.zzfr r10 = r8.f46899a
            boolean r10 = r10.mo55215p()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.zzkw r10 = new com.google.android.gms.measurement.internal.zzkw
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzfr r9 = r8.f46899a
            com.google.android.gms.measurement.internal.zzjm r9 = r9.mo55194L()
            r9.mo55465w(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhx.mo55355M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: N */
    public final void mo55356N(zzgs zzgs) {
        mo55140f();
        Preconditions.m4488k(zzgs);
        if (!this.f47034e.remove(zzgs)) {
            this.f46899a.mo55221z().mo55103u().mo55091a("OnEventListener had not been registered");
        }
    }

    /* renamed from: Q */
    public final int mo55357Q(String str) {
        Preconditions.m4484g(str);
        this.f46899a.mo55219x();
        return 25;
    }

    /* renamed from: R */
    public final Boolean mo55358R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f46899a.mo55185B().mo55177p(atomicReference, 15000, "boolean test flag value", new zzhi(this, atomicReference));
    }

    /* renamed from: S */
    public final Double mo55359S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f46899a.mo55185B().mo55177p(atomicReference, 15000, "double test flag value", new zzhp(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer mo55360T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f46899a.mo55185B().mo55177p(atomicReference, 15000, "int test flag value", new zzho(this, atomicReference));
    }

    /* renamed from: U */
    public final Long mo55361U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f46899a.mo55185B().mo55177p(atomicReference, 15000, "long test flag value", new zzhn(this, atomicReference));
    }

    /* renamed from: V */
    public final String mo55362V() {
        return (String) this.f47036g.get();
    }

    /* renamed from: W */
    public final String mo55363W() {
        zzie p = this.f46899a.mo55193K().mo55409p();
        if (p != null) {
            return p.f47058b;
        }
        return null;
    }

    /* renamed from: X */
    public final String mo55364X() {
        zzie p = this.f46899a.mo55193K().mo55409p();
        if (p != null) {
            return p.f47057a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String mo55365Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f46899a.mo55185B().mo55177p(atomicReference, 15000, "String test flag value", new zzhm(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList mo55366Z(String str, String str2) {
        if (this.f46899a.mo55185B().mo55175C()) {
            this.f46899a.mo55221z().mo55098p().mo55091a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f46899a.mo55207h();
        if (zzab.m65353a()) {
            this.f46899a.mo55221z().mo55098p().mo55091a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f46899a.mo55185B().mo55177p(atomicReference, 5000, "get conditional user properties", new zzhh(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlb.m66133t(list);
        }
        this.f46899a.mo55221z().mo55098p().mo55092b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: a0 */
    public final Map mo55367a0(String str, String str2, boolean z) {
        if (this.f46899a.mo55185B().mo55175C()) {
            this.f46899a.mo55221z().mo55098p().mo55091a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f46899a.mo55207h();
        if (zzab.m65353a()) {
            this.f46899a.mo55221z().mo55098p().mo55091a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f46899a.mo55185B().mo55177p(atomicReference, 5000, "get user properties", new zzhj(this, atomicReference, (String) null, str, str2, z));
        List<zzkw> list = (List) atomicReference.get();
        if (list == null) {
            this.f46899a.mo55221z().mo55098p().mo55092b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzkw zzkw : list) {
            Object l2 = zzkw.mo55568l2();
            if (l2 != null) {
                arrayMap.put(zzkw.f47282c, l2);
            }
        }
        return arrayMap;
    }

    @WorkerThread
    /* renamed from: f0 */
    public final void mo55368f0() {
        mo55073e();
        mo55140f();
        if (this.f46899a.mo55215p()) {
            if (this.f46899a.mo55219x().mo54919A((String) null, zzdu.f46595Z)) {
                zzag x = this.f46899a.mo55219x();
                x.f46899a.mo55207h();
                Boolean r = x.mo54935r("google_analytics_deferred_deep_link_enabled");
                if (r != null && r.booleanValue()) {
                    this.f46899a.mo55221z().mo55097o().mo55091a("Deferred Deep Link feature enabled.");
                    this.f46899a.mo55185B().mo55181x(new zzgy(this));
                }
            }
            this.f46899a.mo55194L().mo55445O();
            this.f47044o = false;
            zzew F = this.f46899a.mo55189F();
            F.mo55073e();
            String string = F.mo55127m().getString("previous_os_version", (String) null);
            F.f46899a.mo55220y().mo55243i();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo55127m().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f46899a.mo55220y().mo55243i();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo55375s("auto", "_ou", bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo55058l() {
        return false;
    }

    /* renamed from: m */
    public final void mo55369m(String str, String str2, Bundle bundle) {
        long a = this.f46899a.mo55201a().mo21950a();
        Preconditions.m4484g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f46899a.mo55185B().mo55181x(new zzhg(this, bundle2));
    }

    /* renamed from: n */
    public final void mo55370n() {
        if ((this.f46899a.mo55202c().getApplicationContext() instanceof Application) && this.f47032c != null) {
            ((Application) this.f46899a.mo55202c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f47032c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo55371o(Bundle bundle) {
        if (bundle == null) {
            this.f46899a.mo55189F().f46757x.mo55119b(new Bundle());
            return;
        }
        Bundle a = this.f46899a.mo55189F().f46757x.mo55118a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f46899a.mo55196N().mo55592U(obj)) {
                    this.f46899a.mo55196N().mo55573A(this.f47045p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f46899a.mo55221z().mo55104v().mo55093c("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlb.m66120W(str)) {
                this.f46899a.mo55221z().mo55104v().mo55092b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                zzlb N = this.f46899a.mo55196N();
                this.f46899a.mo55219x();
                if (N.mo55587P("param", str, 100, obj)) {
                    this.f46899a.mo55196N().mo55574C(a, str, obj);
                }
            }
        }
        this.f46899a.mo55196N();
        int k = this.f46899a.mo55219x().mo54928k();
        if (a.size() > k) {
            int i = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i++;
                if (i > k) {
                    a.remove(str2);
                }
            }
            this.f46899a.mo55196N().mo55573A(this.f47045p, (String) null, 26, (String) null, (String) null, 0);
            this.f46899a.mo55221z().mo55104v().mo55091a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f46899a.mo55189F().f46757x.mo55119b(a);
        this.f46899a.mo55194L().mo55462t(a);
    }

    /* renamed from: p */
    public final void mo55372p(String str, String str2, Bundle bundle) {
        mo55373q(str, str2, bundle, true, true, this.f46899a.mo55201a().mo21950a());
    }

    /* renamed from: q */
    public final void mo55373q(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str2;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == "screen_view" || (str3 != null && str2.equals("screen_view"))) {
            this.f46899a.mo55193K().mo55408E(bundle2, j);
        } else {
            mo55381y(str4, str2, j, bundle2, z2, !z2 || this.f47033d == null || zzlb.m66120W(str2), z, (String) null);
        }
    }

    /* renamed from: r */
    public final void mo55374r(String str, String str2, Bundle bundle, String str3) {
        zzfr.m65679r();
        mo55381y("auto", str2, this.f46899a.mo55201a().mo21950a(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final void mo55375s(String str, String str2, Bundle bundle) {
        mo55073e();
        mo55376t(str, str2, this.f46899a.mo55201a().mo21950a(), bundle);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final void mo55376t(String str, String str2, long j, Bundle bundle) {
        mo55073e();
        mo55377u(str, str2, j, bundle, true, this.f47033d == null || zzlb.m66120W(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.WorkerThread
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55377u(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.Preconditions.m4484g(r20)
            com.google.android.gms.common.internal.Preconditions.m4488k(r24)
            r19.mo55073e()
            r19.mo55140f()
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            boolean r1 = r1.mo55212m()
            if (r1 == 0) goto L_0x04f1
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzdy r1 = r1.mo55184A()
            java.util.List r1 = r1.mo55065s()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0043
        L_0x0033:
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55097o()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo55093c(r1, r9, r8)
            return
        L_0x0043:
            boolean r1 = r7.f47035f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x00a1
            r7.f47035f = r15
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r1 = r1.mo55216q()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo55202c()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo55202c()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.zzeh r1 = r1.mo55221z()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55103u()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo55092b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55101s()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo55091a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            r1.mo55207h()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            com.google.android.gms.common.util.Clock r0 = r0.mo55201a()
            long r5 = r0.mo21950a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo55355M(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            r0.mo55207h()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.zzlb.m66124a0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r0 = r0.mo55196N()
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzew r1 = r1.mo55189F()
            com.google.android.gms.measurement.internal.zzer r1 = r1.f46757x
            android.os.Bundle r1 = r1.mo55118a()
            r0.mo55617x(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            r1.mo55207h()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo55589R(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.zzgo.f46901a
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.zzgo.f46902b
            boolean r3 = r1.mo55585N(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.zzfr r3 = r1.f46899a
            r3.mo55219x()
            boolean r1 = r1.mo55584M(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r1 = r1.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55099q()
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r2 = r2.mo55187D()
            java.lang.String r2 = r2.mo55087d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo55092b(r3, r2)
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a
            r2.mo55219x()
            java.lang.String r0 = r1.mo55605p(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            com.google.android.gms.measurement.internal.zzla r2 = r7.f47045p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo55573A(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            r1.mo55207h()
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzim r1 = r1.mo55193K()
            com.google.android.gms.measurement.internal.zzie r1 = r1.mo55410q(r14)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0192
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0192
            r1.f47060d = r15
        L_0x0192:
            if (r25 == 0) goto L_0x0198
            if (r27 != 0) goto L_0x0198
            r3 = 1
            goto L_0x0199
        L_0x0198:
            r3 = 0
        L_0x0199:
            com.google.android.gms.measurement.internal.zzlb.m66134w(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.zzlb.m66120W(r21)
            if (r25 == 0) goto L_0x01e9
            com.google.android.gms.measurement.internal.zzgr r4 = r7.f47033d
            if (r4 == 0) goto L_0x01e9
            if (r3 != 0) goto L_0x01e9
            if (r1 == 0) goto L_0x01b3
            r16 = 1
            goto L_0x01eb
        L_0x01b3:
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55097o()
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r1 = r1.mo55187D()
            java.lang.String r1 = r1.mo55087d(r9)
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r2 = r2.mo55187D()
            java.lang.String r2 = r2.mo55085b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo55093c(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzgr r0 = r7.f47033d
            com.google.android.gms.common.internal.Preconditions.m4488k(r0)
            com.google.android.gms.measurement.internal.zzgr r1 = r7.f47033d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo55247a(r2, r3, r4, r5)
            return
        L_0x01e9:
            r16 = r1
        L_0x01eb:
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            boolean r1 = r1.mo55215p()
            if (r1 == 0) goto L_0x04f0
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            int r1 = r1.mo55597k0(r9)
            if (r1 == 0) goto L_0x0249
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r2 = r2.mo55221z()
            com.google.android.gms.measurement.internal.zzef r2 = r2.mo55099q()
            com.google.android.gms.measurement.internal.zzfr r3 = r7.f46899a
            com.google.android.gms.measurement.internal.zzec r3 = r3.mo55187D()
            java.lang.String r3 = r3.mo55087d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo55092b(r4, r3)
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r2 = r2.mo55196N()
            com.google.android.gms.measurement.internal.zzfr r3 = r7.f46899a
            r3.mo55219x()
            java.lang.String r0 = r2.mo55605p(r9, r0, r15)
            if (r9 == 0) goto L_0x022d
            int r14 = r21.length()
        L_0x022d:
            com.google.android.gms.measurement.internal.zzfr r2 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r2 = r2.mo55196N()
            com.google.android.gms.measurement.internal.zzla r3 = r7.f47045p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo55573A(r21, r22, r23, r24, r25, r26)
            return
        L_0x0249:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = com.google.android.gms.common.util.CollectionUtils.m4863c(r1)
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            r2 = r28
            r3 = r21
            r4 = r24
            r6 = r27
            android.os.Bundle r12 = r1.mo55615v0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.Preconditions.m4488k(r12)
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            r1.mo55207h()
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzim r1 = r1.mo55193K()
            com.google.android.gms.measurement.internal.zzie r1 = r1.mo55410q(r14)
            java.lang.String r5 = "_ae"
            if (r1 == 0) goto L_0x02ae
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x02ae
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzkc r1 = r1.mo55195M()
            com.google.android.gms.measurement.internal.zzka r1 = r1.f47219e
            com.google.android.gms.measurement.internal.zzkc r2 = r1.f47215d
            com.google.android.gms.measurement.internal.zzfr r2 = r2.f46899a
            com.google.android.gms.common.util.Clock r2 = r2.mo55201a()
            long r14 = r2.mo21952c()
            long r3 = r1.f47213b
            long r2 = r14 - r3
            r1.f47213b = r14
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ae
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            r1.mo55612u(r12, r2)
        L_0x02ae:
            com.google.android.gms.internal.measurement.zznw.m61041b()
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzag r1 = r1.mo55219x()
            com.google.android.gms.measurement.internal.zzdt r2 = com.google.android.gms.measurement.internal.zzdu.f46605e0
            boolean r1 = r1.mo54919A(r13, r2)
            if (r1 == 0) goto L_0x0338
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0317
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0317
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = com.google.android.gms.common.util.Strings.m4912b(r2)
            if (r3 == 0) goto L_0x02e3
            r2 = r13
            goto L_0x02e9
        L_0x02e3:
            if (r2 == 0) goto L_0x02e9
            java.lang.String r2 = r2.trim()
        L_0x02e9:
            com.google.android.gms.measurement.internal.zzfr r3 = r1.f46899a
            com.google.android.gms.measurement.internal.zzew r3 = r3.mo55189F()
            com.google.android.gms.measurement.internal.zzev r3 = r3.f46754u
            java.lang.String r3 = r3.mo55124a()
            boolean r3 = com.google.android.gms.measurement.internal.zzkz.m66118a(r2, r3)
            if (r3 != 0) goto L_0x0307
            com.google.android.gms.measurement.internal.zzfr r1 = r1.f46899a
            com.google.android.gms.measurement.internal.zzew r1 = r1.mo55189F()
            com.google.android.gms.measurement.internal.zzev r1 = r1.f46754u
            r1.mo55125b(r2)
            goto L_0x0338
        L_0x0307:
            com.google.android.gms.measurement.internal.zzfr r0 = r1.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55097o()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo55091a(r1)
            return
        L_0x0317:
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x0338
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r1 = r1.mo55196N()
            com.google.android.gms.measurement.internal.zzfr r1 = r1.f46899a
            com.google.android.gms.measurement.internal.zzew r1 = r1.mo55189F()
            com.google.android.gms.measurement.internal.zzev r1 = r1.f46754u
            java.lang.String r1 = r1.mo55124a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0338
            r12.putString(r2, r1)
        L_0x0338:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzew r1 = r1.mo55189F()
            com.google.android.gms.measurement.internal.zzes r1 = r1.f46748o
            long r1 = r1.mo55120a()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzew r1 = r1.mo55189F()
            boolean r1 = r1.mo55134t(r10)
            if (r1 == 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzew r1 = r1.mo55189F()
            com.google.android.gms.measurement.internal.zzeq r1 = r1.f46751r
            boolean r1 = r1.mo55117b()
            if (r1 == 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r1 = r1.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55102t()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo55091a(r2)
            r6 = 0
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.common.util.Clock r1 = r1.mo55201a()
            long r17 = r1.mo21950a()
            java.lang.String r2 = "auto"
            java.lang.String r15 = "_sid"
            r1 = r19
            r24 = r14
            r13 = r3
            r3 = r15
            r4 = r6
            r15 = r5
            r5 = r17
            r1.mo55355M(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.common.util.Clock r1 = r1.mo55201a()
            long r5 = r1.mo21950a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.mo55355M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.common.util.Clock r1 = r1.mo55201a()
            long r5 = r1.mo21950a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo55355M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzew r1 = r1.mo55189F()
            com.google.android.gms.measurement.internal.zzes r1 = r1.f46749p
            r1.mo55121b(r13)
            goto L_0x03ce
        L_0x03ca:
            r15 = r5
            r24 = r14
            r13 = r3
        L_0x03ce:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r13)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x03f5
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r1 = r1.mo55221z()
            com.google.android.gms.measurement.internal.zzef r1 = r1.mo55102t()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo55091a(r2)
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzkc r1 = r1.mo55195M()
            com.google.android.gms.measurement.internal.zzkb r1 = r1.f47218d
            r2 = 1
            r1.mo55496b(r10, r2)
        L_0x03f5:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0406:
            if (r3 >= r2) goto L_0x0454
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0451
            com.google.android.gms.measurement.internal.zzfr r5 = r7.f46899a
            r5.mo55196N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0426
            r6 = 1
            android.os.Bundle[] r13 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r13[r6] = r5
            goto L_0x044c
        L_0x0426:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0437
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r13 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r13)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044c
        L_0x0437:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x044b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x044c
        L_0x044b:
            r13 = 0
        L_0x044c:
            if (r13 == 0) goto L_0x0451
            r12.putParcelableArray(r4, r13)
        L_0x0451:
            int r3 = r3 + 1
            goto L_0x0406
        L_0x0454:
            r12 = 0
        L_0x0455:
            int r1 = r24.size()
            if (r12 >= r1) goto L_0x04c2
            r13 = r24
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x0468
            java.lang.String r2 = "_ep"
            goto L_0x0469
        L_0x0468:
            r2 = r9
        L_0x0469:
            r1.putString(r0, r8)
            if (r26 == 0) goto L_0x0478
            com.google.android.gms.measurement.internal.zzfr r3 = r7.f46899a
            com.google.android.gms.measurement.internal.zzlb r3 = r3.mo55196N()
            android.os.Bundle r1 = r3.mo55613u0(r1)
        L_0x0478:
            r14 = r1
            com.google.android.gms.measurement.internal.zzaw r5 = new com.google.android.gms.measurement.internal.zzaw
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau
            r3.<init>(r14)
            r1 = r5
            r4 = r20
            r25 = r0
            r0 = r5
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.measurement.internal.zzjm r1 = r1.mo55194L()
            r5 = r28
            r1.mo55455m(r0, r5)
            if (r16 != 0) goto L_0x04bb
            java.util.Set r0 = r7.f47034e
            java.util.Iterator r0 = r0.iterator()
        L_0x049e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04bb
            java.lang.Object r1 = r0.next()
            com.google.android.gms.measurement.internal.zzgs r1 = (com.google.android.gms.measurement.internal.zzgs) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo55248a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x049e
        L_0x04bb:
            int r12 = r12 + 1
            r0 = r25
            r24 = r13
            goto L_0x0455
        L_0x04c2:
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            r0.mo55207h()
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            com.google.android.gms.measurement.internal.zzim r0 = r0.mo55193K()
            r1 = 0
            com.google.android.gms.measurement.internal.zzie r0 = r0.mo55410q(r1)
            if (r0 == 0) goto L_0x04f0
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x04f0
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            com.google.android.gms.measurement.internal.zzkc r0 = r0.mo55195M()
            com.google.android.gms.measurement.internal.zzfr r1 = r7.f46899a
            com.google.android.gms.common.util.Clock r1 = r1.mo55201a()
            long r1 = r1.mo21952c()
            com.google.android.gms.measurement.internal.zzka r0 = r0.f47219e
            r3 = 1
            r0.mo55494d(r3, r3, r1)
        L_0x04f0:
            return
        L_0x04f1:
            com.google.android.gms.measurement.internal.zzfr r0 = r7.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55097o()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo55091a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhx.mo55377u(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: v */
    public final void mo55378v(zzgs zzgs) {
        mo55140f();
        Preconditions.m4488k(zzgs);
        if (!this.f47034e.add(zzgs)) {
            this.f46899a.mo55221z().mo55103u().mo55091a("OnEventListener already registered");
        }
    }

    /* renamed from: w */
    public final void mo55379w(long j) {
        this.f47036g.set((Object) null);
        this.f46899a.mo55185B().mo55181x(new zzhe(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo55380x(long j, boolean z) {
        mo55073e();
        mo55140f();
        this.f46899a.mo55221z().mo55097o().mo55091a("Resetting analytics data (FE)");
        zzkc M = this.f46899a.mo55195M();
        M.mo55073e();
        M.f47219e.mo55491a();
        zzpd.m61097b();
        if (this.f46899a.mo55219x().mo54919A((String) null, zzdu.f46625o0)) {
            this.f46899a.mo55184A().mo55066t();
        }
        boolean m = this.f46899a.mo55212m();
        zzew F = this.f46899a.mo55189F();
        F.f46738e.mo55121b(j);
        if (!TextUtils.isEmpty(F.f46899a.mo55189F().f46754u.mo55124a())) {
            F.f46754u.mo55125b((String) null);
        }
        zzof.m61057b();
        zzag x = F.f46899a.mo55219x();
        zzdt zzdt = zzdu.f46607f0;
        if (x.mo54919A((String) null, zzdt)) {
            F.f46748o.mo55121b(0);
        }
        F.f46749p.mo55121b(0);
        if (!F.f46899a.mo55219x().mo54922E()) {
            F.mo55132r(!m);
        }
        F.f46755v.mo55125b((String) null);
        F.f46756w.mo55121b(0);
        F.f46757x.mo55119b((Bundle) null);
        if (z) {
            this.f46899a.mo55194L().mo55457o();
        }
        zzof.m61057b();
        if (this.f46899a.mo55219x().mo54919A((String) null, zzdt)) {
            this.f46899a.mo55195M().f47218d.mo55495a();
        }
        this.f47044o = !m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo55381y(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f46899a.mo55185B().mo55181x(new zzhb(this, str, str2, j, bundle2, z, z2, z3, str3));
    }
}
