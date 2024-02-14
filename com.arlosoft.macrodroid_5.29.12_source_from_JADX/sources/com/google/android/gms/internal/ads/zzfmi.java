package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfmi implements zzfln {

    /* renamed from: i */
    private static final zzfmi f36098i = new zzfmi();

    /* renamed from: j */
    private static final Handler f36099j = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static Handler f36100k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f36101l = new zzfme();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f36102m = new zzfmf();

    /* renamed from: a */
    private final List f36103a = new ArrayList();

    /* renamed from: b */
    private int f36104b;

    /* renamed from: c */
    private boolean f36105c = false;

    /* renamed from: d */
    private final List f36106d = new ArrayList();

    /* renamed from: e */
    private final zzflp f36107e = new zzflp();

    /* renamed from: f */
    private final zzfmb f36108f = new zzfmb();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzfmc f36109g = new zzfmc(new zzfml());

    /* renamed from: h */
    private long f36110h;

    zzfmi() {
    }

    /* renamed from: d */
    public static zzfmi m50552d() {
        return f36098i;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m50555g(zzfmi zzfmi) {
        zzfmi.f36104b = 0;
        zzfmi.f36106d.clear();
        zzfmi.f36105c = false;
        for (zzfkv zzfkv : zzflg.m50458a().mo45892b()) {
        }
        zzfmi.f36110h = System.nanoTime();
        zzfmi.f36108f.mo45954i();
        long nanoTime = System.nanoTime();
        zzflo a = zzfmi.f36107e.mo45929a();
        if (zzfmi.f36108f.mo45950e().size() > 0) {
            Iterator it = zzfmi.f36108f.mo45950e().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a2 = zzflw.m50515a(0, 0, 0, 0);
                View a3 = zzfmi.f36108f.mo45946a(str);
                zzflo b = zzfmi.f36107e.mo45930b();
                String c = zzfmi.f36108f.mo45948c(str);
                if (c != null) {
                    JSONObject b2 = b.mo45928b(a3);
                    zzflw.m50516b(b2, str);
                    zzflw.m50520f(b2, c);
                    zzflw.m50517c(a2, b2);
                }
                zzflw.m50523i(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfmi.f36109g.mo45959c(a2, hashSet, nanoTime);
            }
        }
        if (zzfmi.f36108f.mo45951f().size() > 0) {
            JSONObject a4 = zzflw.m50515a(0, 0, 0, 0);
            zzfmi.m50556k((View) null, a, a4, 1, false);
            zzflw.m50523i(a4);
            zzfmi.f36109g.mo45960d(a4, zzfmi.f36108f.mo45951f(), nanoTime);
        } else {
            zzfmi.f36109g.mo45958b();
        }
        zzfmi.f36108f.mo45952g();
        long nanoTime2 = System.nanoTime() - zzfmi.f36110h;
        if (zzfmi.f36103a.size() > 0) {
            for (zzfmh zzfmh : zzfmi.f36103a) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfmh.zzb();
                if (zzfmh instanceof zzfmg) {
                    ((zzfmg) zzfmh).zza();
                }
            }
        }
    }

    /* renamed from: k */
    private final void m50556k(View view, zzflo zzflo, JSONObject jSONObject, int i, boolean z) {
        zzflo.mo45927a(view, jSONObject, this, i == 1, z);
    }

    /* renamed from: l */
    private static final void m50557l() {
        Handler handler = f36100k;
        if (handler != null) {
            handler.removeCallbacks(f36102m);
            f36100k = null;
        }
    }

    /* renamed from: a */
    public final void mo45926a(View view, zzflo zzflo, JSONObject jSONObject, boolean z) {
        int k;
        boolean z2;
        if (zzflz.m50530b(view) == null && (k = this.f36108f.mo45956k(view)) != 3) {
            JSONObject b = zzflo.mo45928b(view);
            zzflw.m50517c(jSONObject, b);
            String d = this.f36108f.mo45949d(view);
            if (d != null) {
                zzflw.m50516b(b, d);
                zzflw.m50519e(b, Boolean.valueOf(this.f36108f.mo45955j(view)));
                this.f36108f.mo45953h();
            } else {
                zzfma b2 = this.f36108f.mo45947b(view);
                if (b2 != null) {
                    zzflw.m50518d(b, b2);
                    z2 = true;
                } else {
                    z2 = false;
                }
                m50556k(view, zzflo, b, k, z || z2);
            }
            this.f36104b++;
        }
    }

    /* renamed from: h */
    public final void mo45967h() {
        m50557l();
    }

    /* renamed from: i */
    public final void mo45968i() {
        if (f36100k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f36100k = handler;
            handler.post(f36101l);
            f36100k.postDelayed(f36102m, 200);
        }
    }

    /* renamed from: j */
    public final void mo45969j() {
        m50557l();
        this.f36103a.clear();
        f36099j.post(new zzfmd(this));
    }
}
