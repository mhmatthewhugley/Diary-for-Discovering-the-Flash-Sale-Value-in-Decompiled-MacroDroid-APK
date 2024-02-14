package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaql implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: D */
    private static final Handler f25327D = new Handler(Looper.getMainLooper());

    /* renamed from: A */
    private byte f25328A = -1;

    /* renamed from: B */
    private int f25329B = -1;

    /* renamed from: C */
    private long f25330C = -3;

    /* renamed from: a */
    private final Context f25331a;

    /* renamed from: c */
    private Application f25332c;
    @Nullable

    /* renamed from: d */
    private final PowerManager f25333d;
    @Nullable

    /* renamed from: f */
    private final KeyguardManager f25334f;

    /* renamed from: g */
    private BroadcastReceiver f25335g;

    /* renamed from: o */
    private final zzapx f25336o;

    /* renamed from: p */
    private WeakReference f25337p;
    @Nullable

    /* renamed from: s */
    private WeakReference f25338s;

    /* renamed from: z */
    private zzapu f25339z;

    public zzaql(Context context, zzapx zzapx) {
        Context applicationContext = context.getApplicationContext();
        this.f25331a = applicationContext;
        this.f25336o = zzapx;
        this.f25333d = (PowerManager) applicationContext.getSystemService("power");
        this.f25334f = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f25332c = application;
            this.f25339z = new zzapu(application, this);
        }
        mo41827d((View) null);
    }

    /* renamed from: e */
    private final void m42139e(Activity activity, int i) {
        Window window;
        if (this.f25338s != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View b = mo41826b();
            if (b != null && peekDecorView != null && b.getRootView() == peekDecorView.getRootView()) {
                this.f25329B = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        if ((r5.flags & 524288) != 0) goto L_0x0060;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m42140f() {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.f25338s
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.View r0 = r7.mo41826b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0013
            r7.f25330C = r2
            r7.f25328A = r1
            return
        L_0x0013:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L_0x0024
            r4 = r4 | 2
        L_0x0024:
            android.os.PowerManager r5 = r7.f25333d
            if (r5 == 0) goto L_0x0030
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L_0x0030
            r4 = r4 | 4
        L_0x0030:
            com.google.android.gms.internal.ads.zzapx r5 = r7.f25336o
            boolean r5 = r5.mo41795a()
            if (r5 != 0) goto L_0x0060
            android.app.KeyguardManager r5 = r7.f25334f
            if (r5 == 0) goto L_0x005e
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L_0x005e
            android.app.Activity r5 = com.google.android.gms.internal.ads.zzaqh.m42129b(r0)
            if (r5 != 0) goto L_0x0049
            goto L_0x005e
        L_0x0049:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L_0x0051
            r5 = 0
            goto L_0x0055
        L_0x0051:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L_0x0055:
            if (r5 == 0) goto L_0x005e
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L_0x0060
        L_0x005e:
            r4 = r4 | 8
        L_0x0060:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x006d
            r4 = r4 | 16
        L_0x006d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x007a
            r4 = r4 | 32
        L_0x007a:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.f25329B
            if (r5 == r1) goto L_0x0083
            r0 = r5
        L_0x0083:
            if (r0 == 0) goto L_0x0087
            r4 = r4 | 64
        L_0x0087:
            byte r0 = r7.f25328A
            if (r0 == r4) goto L_0x009a
            byte r0 = (byte) r4
            r7.f25328A = r0
            if (r4 != 0) goto L_0x0095
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0098
        L_0x0095:
            long r0 = (long) r4
            long r0 = r2 - r0
        L_0x0098:
            r7.f25330C = r0
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaql.m42140f():void");
    }

    /* renamed from: g */
    private final void m42141g() {
        f25327D.post(new zzaqj(this));
    }

    /* renamed from: h */
    private final void m42142h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f25337p = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f25335g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzaqk zzaqk = new zzaqk(this);
            this.f25335g = zzaqk;
            this.f25331a.registerReceiver(zzaqk, intentFilter);
        }
        Application application = this.f25332c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f25339z);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ Exception -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m42143i(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference r1 = r3.f25337p     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001b }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001b }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001b }
            if (r2 == 0) goto L_0x0019
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001b }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001b }
        L_0x0019:
            r3.f25337p = r0     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002c }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002c }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f25335g
            if (r4 == 0) goto L_0x0038
            android.content.Context r1 = r3.f25331a     // Catch:{ Exception -> 0x0036 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3.f25335g = r0
        L_0x0038:
            android.app.Application r4 = r3.f25332c
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.zzapu r0 = r3.f25339z     // Catch:{ Exception -> 0x0041 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaql.m42143i(android.view.View):void");
    }

    /* renamed from: a */
    public final long mo41825a() {
        if (this.f25330C <= -2 && mo41826b() == null) {
            this.f25330C = -3;
        }
        return this.f25330C;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final View mo41826b() {
        WeakReference weakReference = this.f25338s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo41827d(View view) {
        long j;
        View b = mo41826b();
        if (b != null) {
            b.removeOnAttachStateChangeListener(this);
            m42143i(b);
        }
        this.f25338s = new WeakReference(view);
        if (view != null) {
            if (!(view.getWindowToken() == null && view.getWindowVisibility() == 8)) {
                m42142h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.f25330C = j;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m42139e(activity, 0);
        m42140f();
    }

    public final void onActivityDestroyed(Activity activity) {
        m42140f();
    }

    public final void onActivityPaused(Activity activity) {
        m42139e(activity, 4);
        m42140f();
    }

    public final void onActivityResumed(Activity activity) {
        m42139e(activity, 0);
        m42140f();
        m42141g();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m42140f();
    }

    public final void onActivityStarted(Activity activity) {
        m42139e(activity, 0);
        m42140f();
    }

    public final void onActivityStopped(Activity activity) {
        m42140f();
    }

    public final void onGlobalLayout() {
        m42140f();
    }

    public final void onScrollChanged() {
        m42140f();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f25329B = -1;
        m42142h(view);
        m42140f();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f25329B = -1;
        m42140f();
        m42141g();
        m42143i(view);
    }
}
