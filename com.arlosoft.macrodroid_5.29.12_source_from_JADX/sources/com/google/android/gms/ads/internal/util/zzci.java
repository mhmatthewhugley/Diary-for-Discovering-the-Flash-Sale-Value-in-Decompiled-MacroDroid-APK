package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchp;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzci {

    /* renamed from: a */
    private final View f2254a;

    /* renamed from: b */
    private Activity f2255b;

    /* renamed from: c */
    private boolean f2256c;

    /* renamed from: d */
    private boolean f2257d;

    /* renamed from: e */
    private boolean f2258e;

    /* renamed from: f */
    private final ViewTreeObserver.OnGlobalLayoutListener f2259f;

    public zzci(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f2255b = activity;
        this.f2254a = view;
        this.f2259f = onGlobalLayoutListener;
    }

    /* renamed from: f */
    private static ViewTreeObserver m2636f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: g */
    private final void m2637g() {
        if (!this.f2256c) {
            Activity activity = this.f2255b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2259f;
                ViewTreeObserver f = m2636f(activity);
                if (f != null) {
                    f.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            zzt.m2913z();
            zzchp.m45262a(this.f2254a, this.f2259f);
            this.f2256c = true;
        }
    }

    /* renamed from: h */
    private final void m2638h() {
        Activity activity = this.f2255b;
        if (activity != null && this.f2256c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2259f;
            ViewTreeObserver f = m2636f(activity);
            if (f != null) {
                f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f2256c = false;
        }
    }

    /* renamed from: a */
    public final void mo20347a() {
        this.f2258e = false;
        m2638h();
    }

    /* renamed from: b */
    public final void mo20348b() {
        this.f2258e = true;
        if (this.f2257d) {
            m2637g();
        }
    }

    /* renamed from: c */
    public final void mo20349c() {
        this.f2257d = true;
        if (this.f2258e) {
            m2637g();
        }
    }

    /* renamed from: d */
    public final void mo20350d() {
        this.f2257d = false;
        m2638h();
    }

    /* renamed from: e */
    public final void mo20351e(Activity activity) {
        this.f2255b = activity;
    }
}
