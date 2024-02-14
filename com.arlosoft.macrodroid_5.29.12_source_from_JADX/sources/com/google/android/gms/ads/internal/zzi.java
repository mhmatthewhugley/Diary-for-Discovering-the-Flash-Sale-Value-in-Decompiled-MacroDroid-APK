package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzapa;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzfmx;
import com.google.android.gms.internal.ads.zzfnz;
import com.google.android.gms.internal.ads.zzfot;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzi implements Runnable, zzapa {

    /* renamed from: A */
    private final Context f2328A;

    /* renamed from: B */
    private zzcgv f2329B;

    /* renamed from: C */
    private final zzcgv f2330C;

    /* renamed from: D */
    private final boolean f2331D;

    /* renamed from: E */
    final CountDownLatch f2332E = new CountDownLatch(1);

    /* renamed from: F */
    private int f2333F;

    /* renamed from: a */
    private final List f2334a = new Vector();

    /* renamed from: c */
    private final AtomicReference f2335c = new AtomicReference();

    /* renamed from: d */
    private final AtomicReference f2336d = new AtomicReference();
    @VisibleForTesting

    /* renamed from: f */
    protected boolean f2337f;

    /* renamed from: g */
    private final boolean f2338g;

    /* renamed from: o */
    private final boolean f2339o;

    /* renamed from: p */
    private final Executor f2340p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final zzfmx f2341s;

    /* renamed from: z */
    private Context f2342z;

    public zzi(Context context, zzcgv zzcgv) {
        this.f2342z = context;
        this.f2328A = context;
        this.f2329B = zzcgv;
        this.f2330C = zzcgv;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f2340p = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27018V1)).booleanValue();
        this.f2331D = booleanValue;
        this.f2341s = zzfmx.m50574a(context, newCachedThreadPool, booleanValue);
        this.f2338g = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26978R1)).booleanValue();
        this.f2339o = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27027W1)).booleanValue();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27008U1)).booleanValue()) {
            this.f2333F = 2;
        } else {
            this.f2333F = 1;
        }
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26859F2)).booleanValue()) {
            this.f2337f = mo20435j();
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27304y2)).booleanValue()) {
            zzchc.f28456a.execute(this);
            return;
        }
        zzaw.m1917b();
        if (zzcgi.m45184t()) {
            zzchc.f28456a.execute(this);
        } else {
            run();
        }
    }

    @Nullable
    /* renamed from: m */
    private final zzapa m2809m() {
        if (mo20437l() == 2) {
            return (zzapa) this.f2336d.get();
        }
        return (zzapa) this.f2335c.get();
    }

    /* renamed from: n */
    private final void m2810n() {
        zzapa m = m2809m();
        if (!this.f2334a.isEmpty() && m != null) {
            for (Object[] objArr : this.f2334a) {
                int length = objArr.length;
                if (length == 1) {
                    m.mo20430d((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    m.mo20429c(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f2334a.clear();
        }
    }

    /* renamed from: o */
    private final void m2811o(boolean z) {
        this.f2335c.set(zzapd.m42067x(this.f2329B.f28446a, m2812p(this.f2342z), z, this.f2333F));
    }

    /* renamed from: p */
    private static final Context m2812p(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final void mo20427a(View view) {
        zzapa m = m2809m();
        if (m != null) {
            m.mo20427a(view);
        }
    }

    /* renamed from: b */
    public final String mo20428b(Context context) {
        zzapa m;
        if (!mo20436k() || (m = m2809m()) == null) {
            return "";
        }
        m2810n();
        return m.mo20428b(m2812p(context));
    }

    /* renamed from: c */
    public final void mo20429c(int i, int i2, int i3) {
        zzapa m = m2809m();
        if (m != null) {
            m2810n();
            m.mo20429c(i, i2, i3);
            return;
        }
        this.f2334a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: d */
    public final void mo20430d(MotionEvent motionEvent) {
        zzapa m = m2809m();
        if (m != null) {
            m2810n();
            m.mo20430d(motionEvent);
            return;
        }
        this.f2334a.add(new Object[]{motionEvent});
    }

    /* renamed from: e */
    public final String mo20431e(Context context, String str, View view) {
        return mo20432f(context, str, view, (Activity) null);
    }

    /* renamed from: f */
    public final String mo20432f(Context context, String str, View view, Activity activity) {
        if (!mo20436k()) {
            return "";
        }
        zzapa m = m2809m();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27240r8)).booleanValue()) {
            zzt.m2905r();
            zzs.m2755f(view, 4, (MotionEvent) null);
        }
        if (m == null) {
            return "";
        }
        m2810n();
        return m.mo20432f(m2812p(context), str, view, activity);
    }

    /* renamed from: g */
    public final String mo20433g(Context context, View view, Activity activity) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27230q8)).booleanValue()) {
            zzapa m = m2809m();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27240r8)).booleanValue()) {
                zzt.m2905r();
                zzs.m2755f(view, 2, (MotionEvent) null);
            }
            return m != null ? m.mo20433g(context, view, activity) : "";
        } else if (!mo20436k()) {
            return "";
        } else {
            zzapa m2 = m2809m();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27240r8)).booleanValue()) {
                zzt.m2905r();
                zzs.m2755f(view, 2, (MotionEvent) null);
            }
            if (m2 != null) {
                return m2.mo20433g(context, view, activity);
            }
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo20434i(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzaox.m42007h(this.f2330C.f28446a, m2812p(this.f2328A), z, this.f2331D).mo41763o();
        } catch (NullPointerException e) {
            this.f2341s.mo45982c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo20435j() {
        Context context = this.f2342z;
        zzfmx zzfmx = this.f2341s;
        zzh zzh = new zzh(this);
        return new zzfot(this.f2342z, zzfnz.m50656b(context, zzfmx), zzh, ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26988S1)).booleanValue()).mo46056d(1);
    }

    /* renamed from: k */
    public final boolean mo20436k() {
        try {
            this.f2332E.await();
            return true;
        } catch (InterruptedException e) {
            zzcgp.m45230h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo20437l() {
        if (!this.f2338g || this.f2337f) {
            return this.f2333F;
        }
        return 1;
    }

    public final void run() {
        boolean z;
        long currentTimeMillis;
        try {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26859F2)).booleanValue()) {
                this.f2337f = mo20435j();
            }
            boolean z2 = this.f2329B.f28449f;
            z = false;
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26967Q0)).booleanValue() && z2) {
                z = true;
            }
            if (mo20437l() == 1) {
                m2811o(z);
                if (this.f2333F == 2) {
                    this.f2340p.execute(new zzg(this, z));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                zzaox h = zzaox.m42007h(this.f2329B.f28446a, m2812p(this.f2342z), z, this.f2331D);
                this.f2336d.set(h);
                if (this.f2339o && !h.mo41764q()) {
                    this.f2333F = 1;
                    m2811o(z);
                }
            }
        } catch (NullPointerException e) {
            this.f2333F = 1;
            m2811o(z);
            this.f2341s.mo45982c(2031, System.currentTimeMillis() - currentTimeMillis, e);
        } catch (Throwable th) {
            this.f2332E.countDown();
            this.f2342z = null;
            this.f2329B = null;
            throw th;
        }
        this.f2332E.countDown();
        this.f2342z = null;
        this.f2329B = null;
    }
}
