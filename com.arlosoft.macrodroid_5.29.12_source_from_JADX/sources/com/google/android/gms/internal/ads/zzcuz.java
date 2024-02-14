package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcuz implements zzdda, zzdeo, zzddu, zza, zzddq {

    /* renamed from: A */
    private final zzbkb f31611A;

    /* renamed from: B */
    private final zzfju f31612B;

    /* renamed from: C */
    private final WeakReference f31613C;

    /* renamed from: D */
    private final WeakReference f31614D;

    /* renamed from: E */
    private boolean f31615E;

    /* renamed from: F */
    private final AtomicBoolean f31616F = new AtomicBoolean();

    /* renamed from: G */
    private final zzbkd f31617G;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f31618a;

    /* renamed from: c */
    private final Executor f31619c;

    /* renamed from: d */
    private final Executor f31620d;

    /* renamed from: f */
    private final ScheduledExecutorService f31621f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzfdw f31622g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final zzfdk f31623o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final zzfki f31624p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final zzfeo f31625s;

    /* renamed from: z */
    private final zzape f31626z;

    zzcuz(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfdw zzfdw, zzfdk zzfdk, zzfki zzfki, zzfeo zzfeo, @Nullable View view, @Nullable zzcmp zzcmp, zzape zzape, zzbkb zzbkb, zzbkd zzbkd, zzfju zzfju, byte[] bArr) {
        this.f31618a = context;
        this.f31619c = executor;
        this.f31620d = executor2;
        this.f31621f = scheduledExecutorService;
        this.f31622g = zzfdw;
        this.f31623o = zzfdk;
        this.f31624p = zzfki;
        this.f31625s = zzfeo;
        this.f31626z = zzape;
        this.f31613C = new WeakReference(view);
        this.f31614D = new WeakReference(zzcmp);
        this.f31611A = zzbkb;
        this.f31617G = zzbkd;
        this.f31612B = zzfju;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m46850u() {
        int i;
        String g = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26889I2)).booleanValue() ? this.f31626z.mo41776c().mo20433g(this.f31618a, (View) this.f31613C.get(), (Activity) null) : null;
        if ((!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27172l0)).booleanValue() || !this.f31622g.f35590b.f35587b.f35571g) && ((Boolean) zzbkr.f27459h.mo42728e()).booleanValue()) {
            if (((Boolean) zzbkr.f27458g.mo42728e()).booleanValue() && ((i = this.f31623o.f35521b) == 1 || i == 2 || i == 5)) {
                zzcmp zzcmp = (zzcmp) this.f31614D.get();
            }
            zzfzg.m51423r((zzfyx) zzfzg.m51420o(zzfyx.m51389C(zzfzg.m51414i((Object) null)), ((Long) zzay.m1924c().mo42663b(zzbjc.f26957P0)).longValue(), TimeUnit.MILLISECONDS, this.f31621f), new zzcuy(this, g), this.f31619c);
            return;
        }
        zzfeo zzfeo = this.f31625s;
        zzfki zzfki = this.f31624p;
        zzfdw zzfdw = this.f31622g;
        zzfdk zzfdk = this.f31623o;
        zzfeo.mo45629a(zzfki.mo45856d(zzfdw, zzfdk, false, g, (String) null, zzfdk.f35525d));
    }

    /* renamed from: y */
    private final void m46851y(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f31613C.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m46850u();
        } else {
            this.f31621f.schedule(new zzcus(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: H */
    public final void mo44387H() {
        zzfeo zzfeo = this.f31625s;
        zzfki zzfki = this.f31624p;
        zzfdw zzfdw = this.f31622g;
        zzfdk zzfdk = this.f31623o;
        zzfeo.mo45629a(zzfki.mo45855c(zzfdw, zzfdk, zzfdk.f35537j));
    }

    /* renamed from: M0 */
    public final void mo44388M0(zze zze) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27203o1)).booleanValue()) {
            this.f31625s.mo45629a(this.f31624p.mo45855c(this.f31622g, this.f31623o, zzfki.m50409f(2, zze.f1934a, this.f31623o.f35549p)));
        }
    }

    /* renamed from: h */
    public final void mo44389h() {
    }

    /* renamed from: j */
    public final void mo44390j() {
        if (this.f31616F.compareAndSet(false, true)) {
            int intValue = ((Integer) zzay.m1924c().mo42663b(zzbjc.f26929M2)).intValue();
            if (intValue > 0) {
                m46851y(intValue, ((Integer) zzay.m1924c().mo42663b(zzbjc.f26939N2)).intValue());
                return;
            }
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26919L2)).booleanValue()) {
                this.f31620d.execute(new zzcuv(this));
            } else {
                m46850u();
            }
        }
    }

    /* renamed from: k */
    public final void mo44391k() {
    }

    /* renamed from: l */
    public final void mo44392l() {
    }

    /* renamed from: n */
    public final synchronized void mo44393n() {
        if (this.f31615E) {
            ArrayList arrayList = new ArrayList(this.f31623o.f35525d);
            arrayList.addAll(this.f31623o.f35531g);
            this.f31625s.mo45629a(this.f31624p.mo45856d(this.f31622g, this.f31623o, true, (String) null, (String) null, arrayList));
        } else {
            zzfeo zzfeo = this.f31625s;
            zzfki zzfki = this.f31624p;
            zzfdw zzfdw = this.f31622g;
            zzfdk zzfdk = this.f31623o;
            zzfeo.mo45629a(zzfki.mo45855c(zzfdw, zzfdk, zzfdk.f35545n));
            zzfeo zzfeo2 = this.f31625s;
            zzfki zzfki2 = this.f31624p;
            zzfdw zzfdw2 = this.f31622g;
            zzfdk zzfdk2 = this.f31623o;
            zzfeo2.mo45629a(zzfki2.mo45855c(zzfdw2, zzfdk2, zzfdk2.f35531g));
        }
        this.f31615E = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo44394o() {
        this.f31619c.execute(new zzcuw(this));
    }

    public final void onAdClicked() {
        if ((!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27172l0)).booleanValue() || !this.f31622g.f35590b.f35587b.f35571g) && ((Boolean) zzbkr.f27455d.mo42728e()).booleanValue()) {
            zzfzg.m51423r(zzfzg.m51411f(zzfyx.m51389C(this.f31611A.mo42726a()), Throwable.class, zzcut.f31602a, zzchc.f28461f), new zzcux(this), this.f31619c);
            return;
        }
        zzfeo zzfeo = this.f31625s;
        zzfki zzfki = this.f31624p;
        zzfdw zzfdw = this.f31622g;
        zzfdk zzfdk = this.f31623o;
        List c = zzfki.mo45855c(zzfdw, zzfdk, zzfdk.f35523c);
        int i = 1;
        if (true == zzt.m2904q().mo43505v(this.f31618a)) {
            i = 2;
        }
        zzfeo.mo45631c(c, i);
    }

    /* renamed from: q */
    public final void mo44395q() {
        zzfeo zzfeo = this.f31625s;
        zzfki zzfki = this.f31624p;
        zzfdw zzfdw = this.f31622g;
        zzfdk zzfdk = this.f31623o;
        zzfeo.mo45629a(zzfki.mo45855c(zzfdw, zzfdk, zzfdk.f35533h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo44396r(int i, int i2) {
        m46851y(i - 1, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo44397s(int i, int i2) {
        this.f31619c.execute(new zzcuu(this, i, i2));
    }

    /* renamed from: x */
    public final void mo44398x(zzcbs zzcbs, String str, String str2) {
        zzfeo zzfeo = this.f31625s;
        zzfki zzfki = this.f31624p;
        zzfdk zzfdk = this.f31623o;
        zzfeo.mo45629a(zzfki.mo45857e(zzfdk, zzfdk.f35535i, zzcbs));
    }
}
