package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzgj extends zzdw {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzkt f46896a;

    /* renamed from: c */
    private Boolean f46897c;

    /* renamed from: d */
    private String f46898d = null;

    public zzgj(zzkt zzkt, String str) {
        Preconditions.m4488k(zzkt);
        this.f46896a = zzkt;
    }

    @BinderThread
    /* renamed from: Ib */
    private final void m65722Ib(zzq zzq, boolean z) {
        Preconditions.m4488k(zzq);
        Preconditions.m4484g(zzq.f47326a);
        m65723Jb(zzq.f47326a, false);
        this.f46896a.mo55533h0().mo55583L(zzq.f47327c, zzq.f47318H);
    }

    @BinderThread
    /* renamed from: Jb */
    private final void m65723Jb(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f46897c == null) {
                        if (!"com.google.android.gms".equals(this.f46898d) && !UidVerifier.m4913a(this.f46896a.mo55202c(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.m3573a(this.f46896a.mo55202c()).mo21179c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f46897c = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f46897c = Boolean.valueOf(z2);
                    }
                    if (this.f46897c.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f46896a.mo55221z().mo55098p().mo55092b("Measurement Service called with invalid calling package. appId", zzeh.m65566x(str));
                    throw e;
                }
            }
            if (this.f46898d == null && GooglePlayServicesUtilLight.m3571l(this.f46896a.mo55202c(), Binder.getCallingUid(), str)) {
                this.f46898d = str;
            }
            if (!str.equals(this.f46898d)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f46896a.mo55221z().mo55098p().mo55091a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: t1 */
    private final void m65725t1(zzaw zzaw, zzq zzq) {
        this.f46896a.mo55524b();
        this.f46896a.mo55531g(zzaw, zzq);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: A1 */
    public final zzaw mo55239A1(zzaw zzaw, zzq zzq) {
        zzau zzau;
        if (!(!"_cmp".equals(zzaw.f46479a) || (zzau = zzaw.f46480c) == null || zzau.zza() == 0)) {
            String q2 = zzaw.f46480c.mo55020q2("_cis");
            if ("referrer broadcast".equals(q2) || "referrer API".equals(q2)) {
                this.f46896a.mo55221z().mo55101s().mo55092b("Event has been filtered ", zzaw.toString());
                return new zzaw("_cmpx", zzaw.f46480c, zzaw.f46481d, zzaw.f46482f);
            }
        }
        return zzaw;
    }

    @BinderThread
    /* renamed from: D3 */
    public final void mo55039D3(zzaw zzaw, zzq zzq) {
        Preconditions.m4488k(zzaw);
        m65722Ib(zzq, false);
        mo55242sb(new zzgc(this, zzaw, zzq));
    }

    @BinderThread
    /* renamed from: F7 */
    public final byte[] mo55040F7(zzaw zzaw, String str) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(zzaw);
        m65723Jb(str, true);
        this.f46896a.mo55221z().mo55097o().mo55092b("Log and bundle. event", this.f46896a.mo55520X().mo55087d(zzaw.f46479a));
        long b = this.f46896a.mo55201a().mo21951b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f46896a.mo55185B().mo55179r(new zzge(this, zzaw, str)).get();
            if (bArr == null) {
                this.f46896a.mo55221z().mo55098p().mo55092b("Log and bundle returned null. appId", zzeh.m65566x(str));
                bArr = new byte[0];
            }
            this.f46896a.mo55221z().mo55097o().mo55094d("Log and bundle processed. event, size, time_ms", this.f46896a.mo55520X().mo55087d(zzaw.f46479a), Integer.valueOf(bArr.length), Long.valueOf((this.f46896a.mo55201a().mo21951b() / 1000000) - b));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f46896a.mo55221z().mo55098p().mo55094d("Failed to log and bundle. appId, event, error", zzeh.m65566x(str), this.f46896a.mo55520X().mo55087d(zzaw.f46479a), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: M3 */
    public final void mo55041M3(zzq zzq) {
        m65722Ib(zzq, false);
        mo55242sb(new zzgh(this, zzq));
    }

    @BinderThread
    /* renamed from: Na */
    public final void mo55042Na(zzac zzac, zzq zzq) {
        Preconditions.m4488k(zzac);
        Preconditions.m4488k(zzac.f46412d);
        m65722Ib(zzq, false);
        zzac zzac2 = new zzac(zzac);
        zzac2.f46410a = zzq.f47326a;
        mo55242sb(new zzft(this, zzac2, zzq));
    }

    @BinderThread
    /* renamed from: O4 */
    public final void mo55043O4(zzq zzq) {
        Preconditions.m4484g(zzq.f47326a);
        Preconditions.m4488k(zzq.f47323M);
        zzgb zzgb = new zzgb(this, zzq);
        Preconditions.m4488k(zzgb);
        if (this.f46896a.mo55185B().mo55175C()) {
            zzgb.run();
        } else {
            this.f46896a.mo55185B().mo55182y(zzgb);
        }
    }

    @BinderThread
    /* renamed from: O7 */
    public final String mo55044O7(zzq zzq) {
        m65722Ib(zzq, false);
        return this.f46896a.mo55537j0(zzq);
    }

    @BinderThread
    /* renamed from: S4 */
    public final List mo55045S4(String str, String str2, boolean z, zzq zzq) {
        m65722Ib(zzq, false);
        String str3 = zzq.f47326a;
        Preconditions.m4488k(str3);
        try {
            List<zzky> list = (List) this.f46896a.mo55185B().mo55178q(new zzfv(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzky zzky : list) {
                if (z || !zzlb.m66120W(zzky.f47290c)) {
                    arrayList.add(new zzkw(zzky));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f46896a.mo55221z().mo55098p().mo55093c("Failed to query user properties. appId", zzeh.m65566x(zzq.f47326a), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: S9 */
    public final void mo55055S9(zzaw zzaw, String str, String str2) {
        Preconditions.m4488k(zzaw);
        Preconditions.m4484g(str);
        m65723Jb(str, true);
        mo55242sb(new zzgd(this, zzaw, str));
    }

    @BinderThread
    /* renamed from: Z6 */
    public final void mo55046Z6(zzq zzq) {
        m65722Ib(zzq, false);
        mo55242sb(new zzga(this, zzq));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z8 */
    public final void mo55240Z8(zzaw zzaw, zzq zzq) {
        zzc zzc;
        if (!this.f46896a.mo55523a0().mo55150C(zzq.f47326a)) {
            m65725t1(zzaw, zzq);
            return;
        }
        this.f46896a.mo55221z().mo55102t().mo55092b("EES config found for", zzq.f47326a);
        zzfi a0 = this.f46896a.mo55523a0();
        String str = zzq.f47326a;
        if (TextUtils.isEmpty(str)) {
            zzc = null;
        } else {
            zzc = (zzc) a0.f46783j.get(str);
        }
        if (zzc != null) {
            try {
                Map I = this.f46896a.mo55532g0().mo55559I(zzaw.f46480c.mo55016m2(), true);
                String a = zzgo.m65768a(zzaw.f46479a);
                if (a == null) {
                    a = zzaw.f46479a;
                }
                if (zzc.mo50785e(new zzaa(a, zzaw.f46482f, I))) {
                    if (zzc.mo50787g()) {
                        this.f46896a.mo55221z().mo55102t().mo55092b("EES edited event", zzaw.f46479a);
                        m65725t1(this.f46896a.mo55532g0().mo55567y(zzc.mo50781a().mo50691b()), zzq);
                    } else {
                        m65725t1(zzaw, zzq);
                    }
                    if (zzc.mo50786f()) {
                        for (zzaa zzaa : zzc.mo50781a().mo50692c()) {
                            this.f46896a.mo55221z().mo55102t().mo55092b("EES logging created event", zzaa.mo50683d());
                            m65725t1(this.f46896a.mo55532g0().mo55567y(zzaa), zzq);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f46896a.mo55221z().mo55098p().mo55093c("EES error. appId, eventName", zzq.f47327c, zzaw.f46479a);
            }
            this.f46896a.mo55221z().mo55102t().mo55092b("EES was not applied to event", zzaw.f46479a);
            m65725t1(zzaw, zzq);
            return;
        }
        this.f46896a.mo55221z().mo55102t().mo55092b("EES not loaded for", zzq.f47326a);
        m65725t1(zzaw, zzq);
    }

    @BinderThread
    /* renamed from: a4 */
    public final void mo55047a4(long j, String str, String str2, String str3) {
        mo55242sb(new zzgi(this, str2, str3, str, j));
    }

    @BinderThread
    /* renamed from: c8 */
    public final List mo55048c8(String str, String str2, String str3) {
        m65723Jb(str, true);
        try {
            return (List) this.f46896a.mo55185B().mo55178q(new zzfy(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f46896a.mo55221z().mo55098p().mo55092b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: h4 */
    public final void mo55049h4(zzkw zzkw, zzq zzq) {
        Preconditions.m4488k(zzkw);
        m65722Ib(zzq, false);
        mo55242sb(new zzgf(this, zzkw, zzq));
    }

    @BinderThread
    /* renamed from: i2 */
    public final void mo55056i2(zzac zzac) {
        Preconditions.m4488k(zzac);
        Preconditions.m4488k(zzac.f46412d);
        Preconditions.m4484g(zzac.f46410a);
        m65723Jb(zzac.f46410a, true);
        mo55242sb(new zzfu(this, new zzac(zzac)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ia */
    public final /* synthetic */ void mo55241ia(String str, Bundle bundle) {
        zzam W = this.f46896a.mo55519W();
        W.mo55073e();
        W.mo55503f();
        byte[] h = W.f47227b.mo55532g0().mo55554A(new zzar(W.f46899a, "", str, "dep", 0, 0, bundle)).mo51306h();
        W.f46899a.mo55221z().mo55102t().mo55093c("Saving default event parameters, appId, data size", W.f46899a.mo55187D().mo55087d(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", h);
        try {
            if (W.mo54965P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                W.f46899a.mo55221z().mo55098p().mo55092b("Failed to insert default event parameters (got -1). appId", zzeh.m65566x(str));
            }
        } catch (SQLiteException e) {
            W.f46899a.mo55221z().mo55098p().mo55093c("Error storing default event parameters. appId", zzeh.m65566x(str), e);
        }
    }

    @BinderThread
    /* renamed from: k7 */
    public final void mo55050k7(Bundle bundle, zzq zzq) {
        m65722Ib(zzq, false);
        String str = zzq.f47326a;
        Preconditions.m4488k(str);
        mo55242sb(new zzfs(this, str, bundle));
    }

    @BinderThread
    /* renamed from: n2 */
    public final List mo55051n2(zzq zzq, boolean z) {
        m65722Ib(zzq, false);
        String str = zzq.f47326a;
        Preconditions.m4488k(str);
        try {
            List<zzky> list = (List) this.f46896a.mo55185B().mo55178q(new zzgg(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzky zzky : list) {
                if (z || !zzlb.m66120W(zzky.f47290c)) {
                    arrayList.add(new zzkw(zzky));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f46896a.mo55221z().mo55098p().mo55093c("Failed to get user properties. appId", zzeh.m65566x(zzq.f47326a), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: sb */
    public final void mo55242sb(Runnable runnable) {
        Preconditions.m4488k(runnable);
        if (this.f46896a.mo55185B().mo55175C()) {
            runnable.run();
        } else {
            this.f46896a.mo55185B().mo55181x(runnable);
        }
    }

    @BinderThread
    /* renamed from: t5 */
    public final void mo55052t5(zzq zzq) {
        Preconditions.m4484g(zzq.f47326a);
        m65723Jb(zzq.f47326a, false);
        mo55242sb(new zzfz(this, zzq));
    }

    @BinderThread
    /* renamed from: t7 */
    public final List mo55053t7(String str, String str2, String str3, boolean z) {
        m65723Jb(str, true);
        try {
            List<zzky> list = (List) this.f46896a.mo55185B().mo55178q(new zzfw(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzky zzky : list) {
                if (z || !zzlb.m66120W(zzky.f47290c)) {
                    arrayList.add(new zzkw(zzky));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f46896a.mo55221z().mo55098p().mo55093c("Failed to get user properties as. appId", zzeh.m65566x(str), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: t9 */
    public final List mo55054t9(String str, String str2, zzq zzq) {
        m65722Ib(zzq, false);
        String str3 = zzq.f47326a;
        Preconditions.m4488k(str3);
        try {
            return (List) this.f46896a.mo55185B().mo55178q(new zzfx(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f46896a.mo55221z().mo55098p().mo55092b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }
}
