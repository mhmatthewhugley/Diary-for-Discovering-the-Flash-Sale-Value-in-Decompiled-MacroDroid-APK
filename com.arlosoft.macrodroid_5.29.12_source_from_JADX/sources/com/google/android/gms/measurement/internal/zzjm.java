package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzjm extends zzf {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzjl f47170c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzdx f47171d;

    /* renamed from: e */
    private volatile Boolean f47172e;

    /* renamed from: f */
    private final zzap f47173f;

    /* renamed from: g */
    private final zzkd f47174g;

    /* renamed from: h */
    private final List f47175h = new ArrayList();

    /* renamed from: i */
    private final zzap f47176i;

    protected zzjm(zzfr zzfr) {
        super(zzfr);
        this.f47174g = new zzkd(zzfr.mo55201a());
        this.f47170c = new zzjl(this);
        this.f47173f = new zziw(this, zzfr);
        this.f47176i = new zziy(this, zzfr);
    }

    @WorkerThread
    /* renamed from: C */
    private final zzq m65930C(boolean z) {
        Pair a;
        this.f46899a.mo55207h();
        zzdy A = this.f46899a.mo55184A();
        String str = null;
        if (z) {
            zzeh z2 = this.f46899a.mo55221z();
            if (!(z2.f46899a.mo55189F().f46737d == null || (a = z2.f46899a.mo55189F().f46737d.mo55122a()) == null || a == zzew.f46735y)) {
                str = String.valueOf(a.second) + ":" + ((String) a.first);
            }
        }
        return A.mo55061o(str);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: D */
    public final void m65931D() {
        mo55073e();
        this.f46899a.mo55221z().mo55102t().mo55092b("Processing queued up service tasks", Integer.valueOf(this.f47175h.size()));
        for (Runnable run : this.f47175h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f46899a.mo55221z().mo55098p().mo55092b("Task exception while flushing queue", e);
            }
        }
        this.f47175h.clear();
        this.f47176i.mo54996b();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: E */
    public final void m65932E() {
        mo55073e();
        this.f47174g.mo55499b();
        zzap zzap = this.f47173f;
        this.f46899a.mo55219x();
        zzap.mo54998d(((Long) zzdu.f46580K.mo55037a((Object) null)).longValue());
    }

    @WorkerThread
    /* renamed from: F */
    private final void m65933F(Runnable runnable) throws IllegalStateException {
        mo55073e();
        if (mo55466x()) {
            runnable.run();
            return;
        }
        int size = this.f47175h.size();
        this.f46899a.mo55219x();
        if (((long) size) >= 1000) {
            this.f46899a.mo55221z().mo55098p().mo55091a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f47175h.add(runnable);
        this.f47176i.mo54998d(60000);
        mo55446P();
    }

    /* renamed from: G */
    private final boolean m65934G() {
        this.f46899a.mo55207h();
        return true;
    }

    /* renamed from: M */
    static /* bridge */ /* synthetic */ void m65939M(zzjm zzjm, ComponentName componentName) {
        zzjm.mo55073e();
        if (zzjm.f47171d != null) {
            zzjm.f47171d = null;
            zzjm.f46899a.mo55221z().mo55102t().mo55092b("Disconnected from device MeasurementService", componentName);
            zzjm.mo55073e();
            zzjm.mo55446P();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    @androidx.annotation.WorkerThread
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo55443A() {
        /*
            r6 = this;
            r6.mo55073e()
            r6.mo55140f()
            java.lang.Boolean r0 = r6.f47172e
            if (r0 != 0) goto L_0x0149
            r6.mo55073e()
            r6.mo55140f()
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzew r0 = r0.mo55189F()
            r0.mo55073e()
            android.content.SharedPreferences r1 = r0.mo55127m()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo55127m()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0143
        L_0x003f:
            com.google.android.gms.measurement.internal.zzfr r4 = r6.f46899a
            r4.mo55207h()
            com.google.android.gms.measurement.internal.zzfr r4 = r6.f46899a
            com.google.android.gms.measurement.internal.zzdy r4 = r4.mo55184A()
            int r4 = r4.mo55059m()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = 1
            goto L_0x010b
        L_0x0053:
            com.google.android.gms.measurement.internal.zzfr r4 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55102t()
            java.lang.String r5 = "Checking service availability"
            r4.mo55091a(r5)
            com.google.android.gms.measurement.internal.zzfr r4 = r6.f46899a
            com.google.android.gms.measurement.internal.zzlb r4 = r4.mo55196N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo55606p0(r5)
            if (r4 == 0) goto L_0x00fa
            if (r4 == r1) goto L_0x00ea
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b5
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55103u()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo55092b(r4, r1)
            goto L_0x00c4
        L_0x0095:
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55103u()
            java.lang.String r3 = "Service updating"
            r0.mo55091a(r3)
            goto L_0x0050
        L_0x00a5:
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55103u()
            java.lang.String r1 = "Service invalid"
            r0.mo55091a(r1)
            goto L_0x00c4
        L_0x00b5:
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55103u()
            java.lang.String r1 = "Service disabled"
            r0.mo55091a(r1)
        L_0x00c4:
            r1 = 0
            goto L_0x010b
        L_0x00c6:
            com.google.android.gms.measurement.internal.zzfr r4 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r4 = r4.mo55221z()
            com.google.android.gms.measurement.internal.zzef r4 = r4.mo55097o()
            java.lang.String r5 = "Service container out of date"
            r4.mo55091a(r5)
            com.google.android.gms.measurement.internal.zzfr r4 = r6.f46899a
            com.google.android.gms.measurement.internal.zzlb r4 = r4.mo55196N()
            int r4 = r4.mo55604o0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010b
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = 0
        L_0x00e8:
            r3 = r1
            goto L_0x00c4
        L_0x00ea:
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55102t()
            java.lang.String r4 = "Service missing"
            r0.mo55091a(r4)
            goto L_0x010b
        L_0x00fa:
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55102t()
            java.lang.String r3 = "Service available"
            r0.mo55091a(r3)
            goto L_0x0050
        L_0x010b:
            if (r3 != 0) goto L_0x0129
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzag r0 = r0.mo55219x()
            boolean r0 = r0.mo54924G()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55098p()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo55091a(r1)
            goto L_0x0142
        L_0x0129:
            if (r1 == 0) goto L_0x0142
            com.google.android.gms.measurement.internal.zzfr r0 = r6.f46899a
            com.google.android.gms.measurement.internal.zzew r0 = r0.mo55189F()
            r0.mo55073e()
            android.content.SharedPreferences r0 = r0.mo55127m()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0142:
            r1 = r3
        L_0x0143:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f47172e = r0
        L_0x0149:
            java.lang.Boolean r0 = r6.f47172e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjm.mo55443A():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean mo55444J() {
        return this.f47172e;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: O */
    public final void mo55445O() {
        mo55073e();
        mo55140f();
        zzq C = m65930C(true);
        this.f46899a.mo55186C().mo55077p();
        m65933F(new zzit(this, C));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: P */
    public final void mo55446P() {
        mo55073e();
        mo55140f();
        if (!mo55466x()) {
            if (mo55443A()) {
                this.f47170c.mo55439c();
            } else if (!this.f46899a.mo55219x().mo54924G()) {
                this.f46899a.mo55207h();
                List<ResolveInfo> queryIntentServices = this.f46899a.mo55202c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f46899a.mo55202c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f46899a.mo55221z().mo55098p().mo55091a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context c = this.f46899a.mo55202c();
                this.f46899a.mo55207h();
                intent.setComponent(new ComponentName(c, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f47170c.mo55438b(intent);
            }
        }
    }

    @WorkerThread
    /* renamed from: Q */
    public final void mo55447Q() {
        mo55073e();
        mo55140f();
        this.f47170c.mo55440d();
        try {
            ConnectionTracker.m4827b().mo21939c(this.f46899a.mo55202c(), this.f47170c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f47171d = null;
    }

    @WorkerThread
    /* renamed from: R */
    public final void mo55448R(zzcf zzcf) {
        mo55073e();
        mo55140f();
        m65933F(new zzis(this, m65930C(false), zzcf));
    }

    @WorkerThread
    /* renamed from: S */
    public final void mo55449S(AtomicReference atomicReference) {
        mo55073e();
        mo55140f();
        m65933F(new zzir(this, atomicReference, m65930C(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: T */
    public final void mo55450T(zzcf zzcf, String str, String str2) {
        mo55073e();
        mo55140f();
        m65933F(new zzje(this, str, str2, m65930C(false), zzcf));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: U */
    public final void mo55451U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo55073e();
        mo55140f();
        m65933F(new zzjd(this, atomicReference, (String) null, str2, str3, m65930C(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: V */
    public final void mo55452V(AtomicReference atomicReference, boolean z) {
        mo55073e();
        mo55140f();
        m65933F(new zzip(this, atomicReference, m65930C(false), z));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: W */
    public final void mo55453W(zzcf zzcf, String str, String str2, boolean z) {
        mo55073e();
        mo55140f();
        m65933F(new zzin(this, str, str2, m65930C(false), z, zzcf));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: X */
    public final void mo55454X(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo55073e();
        mo55140f();
        m65933F(new zzjf(this, atomicReference, (String) null, str2, str3, m65930C(false), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo55058l() {
        return false;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: m */
    public final void mo55455m(zzaw zzaw, String str) {
        Preconditions.m4488k(zzaw);
        mo55073e();
        mo55140f();
        m65934G();
        m65933F(new zzjb(this, true, m65930C(true), this.f46899a.mo55186C().mo55081t(zzaw), zzaw, str));
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo55456n(zzcf zzcf, zzaw zzaw, String str) {
        mo55073e();
        mo55140f();
        if (this.f46899a.mo55196N().mo55606p0(GooglePlayServicesUtilLight.f3065a) != 0) {
            this.f46899a.mo55221z().mo55103u().mo55091a("Not bundling data. Service unavailable or out of date");
            this.f46899a.mo55196N().mo55578G(zzcf, new byte[0]);
            return;
        }
        m65933F(new zzix(this, zzaw, str, zzcf));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: o */
    public final void mo55457o() {
        mo55073e();
        mo55140f();
        zzq C = m65930C(false);
        m65934G();
        this.f46899a.mo55186C().mo55076o();
        m65933F(new zziq(this, C));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: p */
    public final void mo55458p(zzdx zzdx, AbstractSafeParcelable abstractSafeParcelable, zzq zzq) {
        int i;
        mo55073e();
        mo55140f();
        m65934G();
        this.f46899a.mo55219x();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List n = this.f46899a.mo55186C().mo55075n(100);
            if (n != null) {
                arrayList.addAll(n);
                i = n.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzdx.mo55039D3((zzaw) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e) {
                        this.f46899a.mo55221z().mo55098p().mo55092b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkw) {
                    try {
                        zzdx.mo55049h4((zzkw) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e2) {
                        this.f46899a.mo55221z().mo55098p().mo55092b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzdx.mo55042Na((zzac) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e3) {
                        this.f46899a.mo55221z().mo55098p().mo55092b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f46899a.mo55221z().mo55098p().mo55091a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: q */
    public final void mo55459q(zzac zzac) {
        Preconditions.m4488k(zzac);
        mo55073e();
        mo55140f();
        this.f46899a.mo55207h();
        m65933F(new zzjc(this, true, m65930C(true), this.f46899a.mo55186C().mo55080s(zzac), new zzac(zzac), zzac));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: r */
    public final void mo55460r(boolean z) {
        mo55073e();
        mo55140f();
        if (z) {
            m65934G();
            this.f46899a.mo55186C().mo55076o();
        }
        if (mo55467y()) {
            m65933F(new zzja(this, m65930C(false)));
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: s */
    public final void mo55461s(zzie zzie) {
        mo55073e();
        mo55140f();
        m65933F(new zziu(this, zzie));
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo55462t(Bundle bundle) {
        mo55073e();
        mo55140f();
        m65933F(new zziv(this, m65930C(false), bundle));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: u */
    public final void mo55463u() {
        mo55073e();
        mo55140f();
        m65933F(new zziz(this, m65930C(true)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: v */
    public final void mo55464v(zzdx zzdx) {
        mo55073e();
        Preconditions.m4488k(zzdx);
        this.f47171d = zzdx;
        m65932E();
        m65931D();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: w */
    public final void mo55465w(zzkw zzkw) {
        mo55073e();
        mo55140f();
        m65934G();
        m65933F(new zzio(this, m65930C(true), this.f46899a.mo55186C().mo55082u(zzkw), zzkw));
    }

    @WorkerThread
    /* renamed from: x */
    public final boolean mo55466x() {
        mo55073e();
        mo55140f();
        return this.f47171d != null;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final boolean mo55467y() {
        mo55073e();
        mo55140f();
        if (!mo55443A() || this.f46899a.mo55196N().mo55604o0() >= ((Integer) zzdu.f46611h0.mo55037a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }
}
