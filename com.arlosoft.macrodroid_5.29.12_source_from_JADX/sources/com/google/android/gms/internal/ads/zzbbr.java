package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbbr implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: G */
    private static final long f26531G = ((Long) zzay.m1924c().mo42663b(zzbjc.f27113f1)).longValue();

    /* renamed from: A */
    private final zzbz f26532A = new zzbz(f26531G);

    /* renamed from: B */
    private boolean f26533B = false;

    /* renamed from: C */
    private int f26534C = -1;

    /* renamed from: D */
    private final HashSet f26535D = new HashSet();

    /* renamed from: E */
    private final DisplayMetrics f26536E;

    /* renamed from: F */
    private final Rect f26537F;

    /* renamed from: a */
    private final Context f26538a;

    /* renamed from: c */
    private Application f26539c;

    /* renamed from: d */
    private final WindowManager f26540d;

    /* renamed from: f */
    private final PowerManager f26541f;

    /* renamed from: g */
    private final KeyguardManager f26542g;
    @Nullable
    @VisibleForTesting

    /* renamed from: o */
    BroadcastReceiver f26543o;

    /* renamed from: p */
    private WeakReference f26544p;

    /* renamed from: s */
    final WeakReference f26545s;

    /* renamed from: z */
    private zzbcd f26546z;

    public zzbbr(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f26538a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f26540d = windowManager;
        this.f26541f = (PowerManager) applicationContext.getSystemService("power");
        this.f26542g = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f26539c = application;
            this.f26546z = new zzbcd(application, this);
        }
        this.f26536E = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f26537F = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f26545s;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m43069m(view2);
        }
        this.f26545s = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                m43068l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: h */
    private final int m43064h(int i) {
        return (int) (((float) i) / this.f26536E.density);
    }

    /* renamed from: i */
    private final void m43065i(Activity activity, int i) {
        Window window;
        if (this.f26545s != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f26545s.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f26534C = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        if (r11 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012b, code lost:
        if (r11 == 0) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0199 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m43066j(int r33) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            java.util.HashSet r0 = r1.f26535D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference r0 = r1.f26545s
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r0 = 2
            int[] r8 = new int[r0]
            int[] r0 = new int[r0]
            r9 = 0
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0069
            boolean r12 = r3.getGlobalVisibleRect(r5)
            boolean r13 = r3.getLocalVisibleRect(r6)
            r3.getHitRect(r7)
            r3.getLocationOnScreen(r8)     // Catch:{ Exception -> 0x0049 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r0 = move-exception
            java.lang.String r14 = "Failure getting view location."
            com.google.android.gms.internal.ads.zzcgp.m45227e(r14, r0)
        L_0x004f:
            r0 = r8[r11]
            r4.left = r0
            r8 = r8[r10]
            r4.top = r8
            int r8 = r3.getWidth()
            int r0 = r0 + r8
            r4.right = r0
            int r0 = r4.top
            int r8 = r3.getHeight()
            int r0 = r0 + r8
            r4.bottom = r0
            r8 = r3
            goto L_0x006c
        L_0x0069:
            r8 = r9
            r12 = 0
            r13 = 0
        L_0x006c:
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27143i1
            com.google.android.gms.internal.ads.zzbja r14 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r14.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            if (r8 == 0) goto L_0x00bd
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ae }
            r0.<init>()     // Catch:{ Exception -> 0x00ae }
            android.view.ViewParent r14 = r8.getParent()     // Catch:{ Exception -> 0x00ae }
        L_0x0089:
            boolean r15 = r14 instanceof android.view.View     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00c1
            r15 = r14
            android.view.View r15 = (android.view.View) r15     // Catch:{ Exception -> 0x00ae }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ae }
            r11.<init>()     // Catch:{ Exception -> 0x00ae }
            boolean r17 = r15.isScrollContainer()     // Catch:{ Exception -> 0x00ae }
            if (r17 == 0) goto L_0x00a8
            boolean r15 = r15.getGlobalVisibleRect(r11)     // Catch:{ Exception -> 0x00ae }
            if (r15 == 0) goto L_0x00a8
            android.graphics.Rect r11 = r1.mo42397a(r11)     // Catch:{ Exception -> 0x00ae }
            r0.add(r11)     // Catch:{ Exception -> 0x00ae }
        L_0x00a8:
            android.view.ViewParent r14 = r14.getParent()     // Catch:{ Exception -> 0x00ae }
            r11 = 0
            goto L_0x0089
        L_0x00ae:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcfy r11 = com.google.android.gms.ads.internal.zzt.m2904q()
            java.lang.String r14 = "PositionWatcher.getParentScrollViewRects"
            r11.mo43503t(r0, r14)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00c1
        L_0x00bd:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x00c1:
            r31 = r0
            r0 = 8
            if (r8 == 0) goto L_0x00cc
            int r11 = r8.getWindowVisibility()
            goto L_0x00ce
        L_0x00cc:
            r11 = 8
        L_0x00ce:
            int r14 = r1.f26534C
            r15 = -1
            if (r14 == r15) goto L_0x00d4
            r11 = r14
        L_0x00d4:
            com.google.android.gms.ads.internal.zzt.m2905r()
            long r26 = com.google.android.gms.ads.internal.util.zzs.m2743Q(r8)
            com.google.android.gms.internal.ads.zzbiu r14 = com.google.android.gms.internal.ads.zzbjc.f27190m8
            com.google.android.gms.internal.ads.zzbja r15 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r14 = r15.mo42663b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0118
            if (r3 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.zzt.m2905r()
            android.os.PowerManager r3 = r1.f26541f
            android.app.KeyguardManager r14 = r1.f26542g
            boolean r3 = com.google.android.gms.ads.internal.util.zzs.m2765p(r8, r3, r14)
            if (r3 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27220p8
            com.google.android.gms.internal.ads.zzbja r14 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r14.mo42663b(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r14 = (long) r3
            int r3 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
            goto L_0x012d
        L_0x0118:
            if (r3 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.zzt.m2905r()
            android.os.PowerManager r3 = r1.f26541f
            android.app.KeyguardManager r14 = r1.f26542g
            boolean r3 = com.google.android.gms.ads.internal.util.zzs.m2765p(r8, r3, r14)
            if (r3 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0130
            if (r13 == 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
        L_0x012d:
            r3 = 1
            r11 = 0
            goto L_0x0131
        L_0x0130:
            r3 = 0
        L_0x0131:
            com.google.android.gms.internal.ads.zzbiu r14 = com.google.android.gms.internal.ads.zzbjc.f27240r8
            com.google.android.gms.internal.ads.zzbja r15 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r14 = r15.mo42663b(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x018a
            com.google.android.gms.ads.internal.zzt.m2905r()
            android.os.PowerManager r14 = r1.f26541f
            android.app.KeyguardManager r15 = r1.f26542g
            boolean r14 = com.google.android.gms.ads.internal.util.zzs.m2765p(r8, r14, r15)
            if (r10 == r14) goto L_0x0152
            r14 = 0
            goto L_0x0154
        L_0x0152:
            r14 = 64
        L_0x0154:
            if (r10 == r12) goto L_0x0158
            r15 = 0
            goto L_0x015a
        L_0x0158:
            r15 = 8
        L_0x015a:
            r14 = r14 | r15
            if (r10 == r13) goto L_0x015f
            r15 = 0
            goto L_0x0161
        L_0x015f:
            r15 = 16
        L_0x0161:
            r14 = r14 | r15
            if (r11 != 0) goto L_0x0167
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0168
        L_0x0167:
            r11 = 0
        L_0x0168:
            r11 = r11 | r14
            com.google.android.gms.internal.ads.zzbiu r14 = com.google.android.gms.internal.ads.zzbjc.f27220p8
            com.google.android.gms.internal.ads.zzbja r15 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r14 = r15.mo42663b(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            long r14 = (long) r14
            int r17 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r17 < 0) goto L_0x0181
            r14 = 32
            goto L_0x0182
        L_0x0181:
            r14 = 0
        L_0x0182:
            com.google.android.gms.ads.internal.zzt.m2905r()
            r11 = r11 | r14
            r11 = r11 | r3
            com.google.android.gms.ads.internal.util.zzs.m2755f(r8, r11, r9)
        L_0x018a:
            if (r2 != r10) goto L_0x019a
            com.google.android.gms.ads.internal.util.zzbz r9 = r1.f26532A
            boolean r9 = r9.mo20337b()
            if (r9 != 0) goto L_0x019a
            boolean r9 = r1.f26533B
            if (r3 == r9) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            return
        L_0x019a:
            if (r3 != 0) goto L_0x01a4
            boolean r9 = r1.f26533B
            if (r9 != 0) goto L_0x01a4
            if (r2 == r10) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            return
        L_0x01a4:
            com.google.android.gms.internal.ads.zzbbp r2 = new com.google.android.gms.internal.ads.zzbbp
            com.google.android.gms.common.util.Clock r9 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r17 = r9.mo21952c()
            android.os.PowerManager r9 = r1.f26541f
            boolean r9 = r9.isScreenOn()
            if (r8 == 0) goto L_0x01bd
            boolean r11 = r8.isAttachedToWindow()
            if (r11 == 0) goto L_0x01bd
            goto L_0x01be
        L_0x01bd:
            r10 = 0
        L_0x01be:
            if (r8 == 0) goto L_0x01c7
            int r0 = r8.getWindowVisibility()
            r19 = r0
            goto L_0x01c9
        L_0x01c7:
            r19 = 8
        L_0x01c9:
            android.graphics.Rect r0 = r1.f26537F
            android.graphics.Rect r20 = r1.mo42397a(r0)
            android.graphics.Rect r21 = r1.mo42397a(r4)
            android.graphics.Rect r22 = r1.mo42397a(r5)
            android.graphics.Rect r24 = r1.mo42397a(r6)
            android.graphics.Rect r28 = r1.mo42397a(r7)
            android.util.DisplayMetrics r0 = r1.f26536E
            float r0 = r0.density
            r29 = r0
            r14 = r2
            r15 = r17
            r17 = r9
            r18 = r10
            r23 = r12
            r25 = r13
            r30 = r3
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            java.util.HashSet r0 = r1.f26535D
            java.util.Iterator r0 = r0.iterator()
        L_0x01fb:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x020b
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.ads.zzbbq r4 = (com.google.android.gms.internal.ads.zzbbq) r4
            r4.mo42396O0(r2)
            goto L_0x01fb
        L_0x020b:
            r1.f26533B = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbr.m43066j(int):void");
    }

    /* renamed from: k */
    private final void m43067k() {
        zzs.f2304i.post(new zzbbn(this));
    }

    /* renamed from: l */
    private final void m43068l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f26544p = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f26543o == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f26543o = new zzbbo(this);
            zzt.m2911x().mo20345c(this.f26538a, this.f26543o, intentFilter);
        }
        Application application = this.f26539c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f26546z);
            } catch (Exception e) {
                zzcgp.m45227e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: m */
    private final void m43069m(View view) {
        try {
            WeakReference weakReference = this.f26544p;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f26544p = null;
            }
        } catch (Exception e) {
            zzcgp.m45227e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzcgp.m45227e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f26543o != null) {
            try {
                zzt.m2911x().mo20346d(this.f26538a, this.f26543o);
            } catch (IllegalStateException e3) {
                zzcgp.m45227e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzt.m2904q().mo43503t(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f26543o = null;
        }
        Application application = this.f26539c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f26546z);
            } catch (Exception e5) {
                zzcgp.m45227e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Rect mo42397a(Rect rect) {
        return new Rect(m43064h(rect.left), m43064h(rect.top), m43064h(rect.right), m43064h(rect.bottom));
    }

    /* renamed from: c */
    public final void mo42398c(zzbbq zzbbq) {
        this.f26535D.add(zzbbq);
        m43066j(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo42399d() {
        m43066j(3);
    }

    /* renamed from: e */
    public final void mo42400e(zzbbq zzbbq) {
        this.f26535D.remove(zzbbq);
    }

    /* renamed from: f */
    public final void mo42401f() {
        this.f26532A.mo20336a(f26531G);
    }

    /* renamed from: g */
    public final void mo42402g(long j) {
        this.f26532A.mo20336a(j);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m43065i(activity, 0);
        m43066j(3);
        m43067k();
    }

    public final void onActivityDestroyed(Activity activity) {
        m43066j(3);
        m43067k();
    }

    public final void onActivityPaused(Activity activity) {
        m43065i(activity, 4);
        m43066j(3);
        m43067k();
    }

    public final void onActivityResumed(Activity activity) {
        m43065i(activity, 0);
        m43066j(3);
        m43067k();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m43066j(3);
        m43067k();
    }

    public final void onActivityStarted(Activity activity) {
        m43065i(activity, 0);
        m43066j(3);
        m43067k();
    }

    public final void onActivityStopped(Activity activity) {
        m43066j(3);
        m43067k();
    }

    public final void onGlobalLayout() {
        m43066j(2);
        m43067k();
    }

    public final void onScrollChanged() {
        m43066j(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f26534C = -1;
        m43068l(view);
        m43066j(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f26534C = -1;
        m43066j(3);
        m43067k();
        m43069m(view);
    }
}
