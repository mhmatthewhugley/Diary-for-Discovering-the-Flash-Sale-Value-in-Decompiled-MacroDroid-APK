package com.arlosoft.macrodroid.triggers.services;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.util.Pair;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.events.FloatingButtonsUpdateEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.FloatingButtonTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6363a1;
import com.arlosoft.macrodroid.utils.C6433t;
import com.melnykov.fab.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p161s1.C10180a;

public class FloatingButtonService extends Service {

    /* renamed from: A */
    final C6433t f14434A = new C6433t();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f14435B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f14436C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f14437D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f14438E = 0;

    /* renamed from: F */
    WindowManager.LayoutParams f14439F;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WindowManager f14440a;

    /* renamed from: c */
    private List<View> f14441c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f14442d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4373a f14443f = C4373a.m17336h();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f14444g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f14445o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public View f14446p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f14447s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f14448z;

    /* renamed from: com.arlosoft.macrodroid.triggers.services.FloatingButtonService$a */
    class C6096a implements View.OnTouchListener {

        /* renamed from: a */
        long f14449a = 0;

        /* renamed from: c */
        long f14450c = 0;

        /* renamed from: d */
        final /* synthetic */ FloatingActionButton f14451d;

        /* renamed from: f */
        final /* synthetic */ View f14452f;

        /* renamed from: g */
        final /* synthetic */ int f14453g;

        /* renamed from: o */
        final /* synthetic */ FloatingButtonTrigger f14454o;

        C6096a(FloatingActionButton floatingActionButton, View view, int i, FloatingButtonTrigger floatingButtonTrigger) {
            this.f14451d = floatingActionButton;
            this.f14452f = view;
            this.f14453g = i;
            this.f14454o = floatingButtonTrigger;
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x01a2 A[Catch:{ IllegalArgumentException -> 0x025b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
            /*
                r18 = this;
                r1 = r18
                com.melnykov.fab.FloatingActionButton r0 = r1.f14451d
                r2 = 1
                if (r0 == 0) goto L_0x025f
                boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
                if (r0 != 0) goto L_0x000f
                goto L_0x025f
            L_0x000f:
                android.view.View r0 = r1.f14452f     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0     // Catch:{ IllegalArgumentException -> 0x025b }
                float r3 = r20.getRawX()     // Catch:{ IllegalArgumentException -> 0x025b }
                int r3 = (int) r3     // Catch:{ IllegalArgumentException -> 0x025b }
                float r4 = r20.getRawY()     // Catch:{ IllegalArgumentException -> 0x025b }
                int r4 = (int) r4     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r20.getAction()     // Catch:{ IllegalArgumentException -> 0x025b }
                if (r5 == 0) goto L_0x0237
                r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r8 = 4608533498688228557(0x3ff4cccccccccccd, double:1.3)
                r10 = 2
                r11 = 0
                if (r5 == r2) goto L_0x00ce
                if (r5 == r10) goto L_0x0036
                goto L_0x025f
            L_0x0036:
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalArgumentException -> 0x025b }
                long r14 = r1.f14449a     // Catch:{ IllegalArgumentException -> 0x025b }
                r16 = 325(0x145, double:1.606E-321)
                long r14 = r14 + r16
                int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r5 <= 0) goto L_0x025f
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                boolean unused = r5.f14447s = r2     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r5.f14435B     // Catch:{ IllegalArgumentException -> 0x025b }
                int r3 = r3 - r5
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r5.f14436C     // Catch:{ IllegalArgumentException -> 0x025b }
                int r4 = r4 - r5
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r5.f14437D     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r5 + r3
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r12 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r12 = r12.f14438E     // Catch:{ IllegalArgumentException -> 0x025b }
                int r12 = r12 + r4
                r0.x = r5     // Catch:{ IllegalArgumentException -> 0x025b }
                r0.y = r12     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.WindowManager r5 = r5.f14440a     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.View r12 = r1.f14452f     // Catch:{ IllegalArgumentException -> 0x025b }
                r5.updateViewLayout(r12, r0)     // Catch:{ IllegalArgumentException -> 0x025b }
                float r0 = (float) r3     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r3 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                float r3 = r3.f14442d     // Catch:{ IllegalArgumentException -> 0x025b }
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 > 0) goto L_0x008a
                float r0 = (float) r4     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r3 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                float r3 = r3.f14442d     // Catch:{ IllegalArgumentException -> 0x025b }
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x025f
            L_0x008a:
                android.view.View r0 = r1.f14452f     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0     // Catch:{ IllegalArgumentException -> 0x025b }
                int r0 = r0.x     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.View r3 = r1.f14452f     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.WindowManager$LayoutParams r3 = (android.view.WindowManager.LayoutParams) r3     // Catch:{ IllegalArgumentException -> 0x025b }
                int r3 = r3.y     // Catch:{ IllegalArgumentException -> 0x025b }
                double r3 = (double) r3     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r1.f14453g     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r5 / r10
                double r12 = (double) r5     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r5.f14445o     // Catch:{ IllegalArgumentException -> 0x025b }
                double r14 = (double) r5     // Catch:{ IllegalArgumentException -> 0x025b }
                double r14 = r14 * r8
                double r12 = r12 - r14
                int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                if (r5 < 0) goto L_0x00c4
                int r0 = java.lang.Math.abs(r0)     // Catch:{ IllegalArgumentException -> 0x025b }
                double r3 = (double) r0     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r0 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r0 = r0.f14445o     // Catch:{ IllegalArgumentException -> 0x025b }
                double r8 = (double) r0     // Catch:{ IllegalArgumentException -> 0x025b }
                double r8 = r8 * r6
                int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x00c4
                r11 = 1
            L_0x00c4:
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r0 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r3 = r1.f14453g     // Catch:{ IllegalArgumentException -> 0x025b }
                float r3 = (float) r3     // Catch:{ IllegalArgumentException -> 0x025b }
                r0.m24134z(r3, r11)     // Catch:{ IllegalArgumentException -> 0x025b }
                goto L_0x025f
            L_0x00ce:
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r5.f14435B     // Catch:{ IllegalArgumentException -> 0x025b }
                int r3 = r3 - r5
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r5.f14436C     // Catch:{ IllegalArgumentException -> 0x025b }
                int r4 = r4 - r5
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.WindowManager r5 = r5.f14440a     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.View r12 = r1.f14452f     // Catch:{ IllegalArgumentException -> 0x025b }
                r5.updateViewLayout(r12, r0)     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                boolean r5 = r5.f14447s     // Catch:{ IllegalArgumentException -> 0x025b }
                if (r5 == 0) goto L_0x0105
                float r3 = (float) r3     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                float r5 = r5.f14442d     // Catch:{ IllegalArgumentException -> 0x025b }
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 >= 0) goto L_0x0112
                float r3 = (float) r4     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r4 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                float r4 = r4.f14442d     // Catch:{ IllegalArgumentException -> 0x025b }
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 >= 0) goto L_0x0112
            L_0x0105:
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r3 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                com.melnykov.fab.FloatingActionButton r4 = r1.f14451d     // Catch:{ IllegalArgumentException -> 0x025b }
                java.lang.Object r4 = r4.getTag()     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.Trigger r4 = (com.arlosoft.macrodroid.triggers.Trigger) r4     // Catch:{ IllegalArgumentException -> 0x025b }
                r3.m24131w(r4)     // Catch:{ IllegalArgumentException -> 0x025b }
            L_0x0112:
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r3 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.WindowManager r3 = r3.f14440a     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.View r4 = r1.f14452f     // Catch:{ IllegalArgumentException -> 0x025b }
                r3.updateViewLayout(r4, r0)     // Catch:{ IllegalArgumentException -> 0x025b }
                com.melnykov.fab.FloatingActionButton r0 = r1.f14451d     // Catch:{ IllegalArgumentException -> 0x025b }
                r0.setPressed(r11)     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.View r0 = r1.f14452f     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0     // Catch:{ IllegalArgumentException -> 0x025b }
                int r0 = r0.x     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.View r3 = r1.f14452f     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.WindowManager$LayoutParams r3 = (android.view.WindowManager.LayoutParams) r3     // Catch:{ IllegalArgumentException -> 0x025b }
                int r3 = r3.y     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r4 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                boolean unused = r4.f14447s = r11     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r4 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                android.view.View r4 = r4.f14446p     // Catch:{ IllegalArgumentException -> 0x025b }
                if (r4 == 0) goto L_0x0206
                double r4 = (double) r3     // Catch:{ IllegalArgumentException -> 0x025b }
                int r12 = r1.f14453g     // Catch:{ IllegalArgumentException -> 0x025b }
                int r12 = r12 / r10
                double r12 = (double) r12     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r10 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r10 = r10.f14445o     // Catch:{ IllegalArgumentException -> 0x025b }
                double r14 = (double) r10     // Catch:{ IllegalArgumentException -> 0x025b }
                double r14 = r14 * r8
                double r12 = r12 - r14
                int r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                if (r8 < 0) goto L_0x0206
                int r4 = java.lang.Math.abs(r0)     // Catch:{ IllegalArgumentException -> 0x025b }
                double r4 = (double) r4     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r8 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r8 = r8.f14445o     // Catch:{ IllegalArgumentException -> 0x025b }
                double r8 = (double) r8     // Catch:{ IllegalArgumentException -> 0x025b }
                double r8 = r8 * r6
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 >= 0) goto L_0x0206
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r4 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.macro.Macro r4 = r4.mo27837X0()     // Catch:{ IllegalArgumentException -> 0x025b }
                if (r4 == 0) goto L_0x0205
                com.arlosoft.macrodroid.action.WaitUntilTriggerAction r5 = r4.getWaitForTriggerActive()     // Catch:{ IllegalArgumentException -> 0x025b }
                if (r5 == 0) goto L_0x019f
                java.util.ArrayList r5 = r5.mo26117B3()     // Catch:{ IllegalArgumentException -> 0x025b }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ IllegalArgumentException -> 0x025b }
            L_0x017e:
                boolean r6 = r5.hasNext()     // Catch:{ IllegalArgumentException -> 0x025b }
                if (r6 == 0) goto L_0x019f
                java.lang.Object r6 = r5.next()     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.Trigger r6 = (com.arlosoft.macrodroid.triggers.Trigger) r6     // Catch:{ IllegalArgumentException -> 0x025b }
                long r6 = r6.mo27847f1()     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r8 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                long r8 = r8.mo27847f1()     // Catch:{ IllegalArgumentException -> 0x025b }
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 != 0) goto L_0x017e
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r5 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                r5.mo31543T2()     // Catch:{ IllegalArgumentException -> 0x025b }
                r5 = 1
                goto L_0x01a0
            L_0x019f:
                r5 = 0
            L_0x01a0:
                if (r5 != 0) goto L_0x0205
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r5 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                boolean r5 = r5.mo31156z3()     // Catch:{ IllegalArgumentException -> 0x025b }
                if (r5 == 0) goto L_0x01b5
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r4 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                r4.mo27818D2(r11)     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r4 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                r4.m24130v()     // Catch:{ IllegalArgumentException -> 0x025b }
                goto L_0x0205
            L_0x01b5:
                r4.setEnabled(r11)     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.macro.n r5 = com.arlosoft.macrodroid.macro.C4934n.m18998M()     // Catch:{ IllegalArgumentException -> 0x025b }
                r5.mo29700r0(r4)     // Catch:{ IllegalArgumentException -> 0x025b }
                x8.c r4 = p161s1.C10180a.m40075a()     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.events.MacroEnabledStateChangeEvent r5 = new com.arlosoft.macrodroid.events.MacroEnabledStateChangeEvent     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r6 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.macro.Macro r6 = r6.mo27837X0()     // Catch:{ IllegalArgumentException -> 0x025b }
                r5.<init>(r6, r11)     // Catch:{ IllegalArgumentException -> 0x025b }
                r4.mo80018i(r5)     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r4 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                android.content.Context r4 = r4.getApplicationContext()     // Catch:{ IllegalArgumentException -> 0x025b }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x025b }
                r5.<init>()     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r6 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.macro.Macro r6 = r6.mo27837X0()     // Catch:{ IllegalArgumentException -> 0x025b }
                java.lang.String r6 = r6.getName()     // Catch:{ IllegalArgumentException -> 0x025b }
                r5.append(r6)     // Catch:{ IllegalArgumentException -> 0x025b }
                java.lang.String r6 = " "
                r5.append(r6)     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r6 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                r7 = 2131953062(0x7f1305a6, float:1.9542584E38)
                java.lang.String r6 = r6.getString(r7)     // Catch:{ IllegalArgumentException -> 0x025b }
                r5.append(r6)     // Catch:{ IllegalArgumentException -> 0x025b }
                java.lang.String r5 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x025b }
                lc.c r4 = p319lc.C15626c.m94876a(r4, r5, r11)     // Catch:{ IllegalArgumentException -> 0x025b }
                r4.show()     // Catch:{ IllegalArgumentException -> 0x025b }
            L_0x0205:
                r11 = 1
            L_0x0206:
                if (r11 != 0) goto L_0x0231
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r4 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r4 = r4.f14444g     // Catch:{ IllegalArgumentException -> 0x025b }
                int r5 = r1.f14453g     // Catch:{ IllegalArgumentException -> 0x025b }
                if (r4 >= r5) goto L_0x0222
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r4 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.database.a r4 = r4.f14443f     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r5 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                long r5 = r5.mo27847f1()     // Catch:{ IllegalArgumentException -> 0x025b }
                r4.mo28655z(r5, r0, r3)     // Catch:{ IllegalArgumentException -> 0x025b }
                goto L_0x0231
            L_0x0222:
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r4 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.database.a r4 = r4.f14443f     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.FloatingButtonTrigger r5 = r1.f14454o     // Catch:{ IllegalArgumentException -> 0x025b }
                long r5 = r5.mo27847f1()     // Catch:{ IllegalArgumentException -> 0x025b }
                r4.mo28654y(r5, r0, r3)     // Catch:{ IllegalArgumentException -> 0x025b }
            L_0x0231:
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r0 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                r0.m24132x()     // Catch:{ IllegalArgumentException -> 0x025b }
                goto L_0x025f
            L_0x0237:
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalArgumentException -> 0x025b }
                r1.f14449a = r5     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r5 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int unused = r5.f14435B = r3     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r3 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int unused = r3.f14436C = r4     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r3 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r4 = r0.x     // Catch:{ IllegalArgumentException -> 0x025b }
                int unused = r3.f14437D = r4     // Catch:{ IllegalArgumentException -> 0x025b }
                com.arlosoft.macrodroid.triggers.services.FloatingButtonService r3 = com.arlosoft.macrodroid.triggers.services.FloatingButtonService.this     // Catch:{ IllegalArgumentException -> 0x025b }
                int r0 = r0.y     // Catch:{ IllegalArgumentException -> 0x025b }
                int unused = r3.f14438E = r0     // Catch:{ IllegalArgumentException -> 0x025b }
                com.melnykov.fab.FloatingActionButton r0 = r1.f14451d     // Catch:{ IllegalArgumentException -> 0x025b }
                r0.setPressed(r2)     // Catch:{ IllegalArgumentException -> 0x025b }
                goto L_0x025f
            L_0x025b:
                r0 = move-exception
                p148q0.C8151a.m33873n(r0)
            L_0x025f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.FloatingButtonService.C6096a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.FloatingButtonService$b */
    class C6097b implements Runnable {

        /* renamed from: com.arlosoft.macrodroid.triggers.services.FloatingButtonService$b$a */
        class C6098a implements Runnable {
            C6098a() {
            }

            public void run() {
                if (FloatingButtonService.this.f14448z) {
                    FloatingButtonService.this.m24130v();
                }
            }
        }

        C6097b() {
        }

        public void run() {
            new Handler(Looper.getMainLooper()).post(new C6098a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public synchronized void m24130v() {
        Set<String> set;
        int i;
        int i2;
        synchronized (this) {
            for (View removeView : this.f14441c) {
                try {
                    this.f14440a.removeView(removeView);
                } catch (Exception unused) {
                }
            }
            this.f14441c.clear();
            if (C5163j2.m20013M0(this)) {
                WindowManager windowManager = (WindowManager) getSystemService("window");
                this.f14440a = windowManager;
                this.f14444g = windowManager.getDefaultDisplay().getWidth();
                int height = this.f14440a.getDefaultDisplay().getHeight();
                boolean z = this.f14444g < height;
                Set<String> J = C5163j2.m19991J(this);
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (it.hasNext()) {
                        Trigger next2 = it.next();
                        if (!(next2 instanceof FloatingButtonTrigger) || !next2.mo27822G1() || J.contains(next.getCategory())) {
                            set = J;
                        } else {
                            FloatingButtonTrigger floatingButtonTrigger = (FloatingButtonTrigger) next2;
                            Pair<Integer, Integer> n = this.f14443f.mo28645n(floatingButtonTrigger.mo27847f1(), z, this.f14444g, height, this.f14445o);
                            if (floatingButtonTrigger.mo31138C3() == 0) {
                                this.f14445o = getResources().getDimensionPixelSize(C17529R$dimen.floating_button_size);
                            } else {
                                this.f14445o = getResources().getDimensionPixelSize(C17529R$dimen.floating_button_size_mini);
                            }
                            Point t3 = floatingButtonTrigger.mo31150t3();
                            if (t3 != null) {
                                int i3 = t3.x - (this.f14444g / 2);
                                int i4 = this.f14445o;
                                i2 = i3 + (i4 / 2);
                                i = (t3.y - (height / 2)) + (i4 / 2);
                            } else if (n == null) {
                                i2 = (this.f14444g / 2) - (this.f14445o / 2);
                                i = 0;
                            } else {
                                int intValue = ((Integer) n.first).intValue();
                                i = ((Integer) n.second).intValue();
                                i2 = intValue;
                            }
                            int i5 = this.f14444g;
                            int i6 = this.f14445o;
                            if (i2 < ((-i5) / 2) + (i6 / 2)) {
                                i2 = ((-i5) / 2) + (i6 / 2);
                            } else if (i2 > (i5 / 2) - (i6 / 2)) {
                                i2 = (i5 / 2) - (i6 / 2);
                            }
                            int i7 = i2;
                            int i8 = -height;
                            if (i < (i8 / 2) + (i6 / 2)) {
                                i = (i8 / 2) + (i6 / 2);
                            } else if (i > (height / 2) - (i6 / 2)) {
                                i = (height / 2) - (i6 / 2);
                            }
                            int i9 = i;
                            int i10 = this.f14445o;
                            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i10, i10, i7, i9, floatingButtonTrigger.mo31137B3() ? C6363a1.m24609c() : C6363a1.m24607a(), 786472, -3);
                            this.f14439F = layoutParams;
                            layoutParams.windowAnimations = C17542R$style.FloatingButtonAnimation;
                            View inflate = View.inflate(getApplicationContext(), C17535R$layout.floating_button, (ViewGroup) null);
                            FloatingActionButton floatingActionButton = (FloatingActionButton) inflate.findViewById(C17532R$id.fab);
                            this.f14441c.add(inflate);
                            floatingActionButton.setTag(floatingButtonTrigger);
                            int y = m24133y(floatingButtonTrigger.mo31149r3());
                            floatingActionButton.setColorNormal(floatingButtonTrigger.mo31149r3());
                            floatingActionButton.setColorRipple(y);
                            floatingActionButton.setColorPressed(floatingButtonTrigger.mo31149r3());
                            floatingActionButton.setAlpha(((float) floatingButtonTrigger.mo31148q3()) / 100.0f);
                            floatingButtonTrigger.mo31143Q3(floatingActionButton);
                            floatingActionButton.setType(floatingButtonTrigger.mo31138C3() == 0 ? 0 : 1);
                            set = J;
                            floatingActionButton.setOnTouchListener(new C6096a(floatingActionButton, inflate, height, floatingButtonTrigger));
                            if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(this)) {
                                try {
                                    this.f14440a.addView(inflate, this.f14439F);
                                } catch (Exception e) {
                                    C4878b.m18868g("Failed to add floating button: " + e);
                                }
                            }
                        }
                        J = set;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m24131w(Trigger trigger) {
        if (trigger.mo31374R2()) {
            Macro X0 = trigger.mo27837X0();
            if (X0 == null) {
                C4878b.m18868g("No macro associated with floating button trigger");
                return;
            }
            X0.setTriggerThatInvoked(trigger);
            if (X0.canInvoke(X0.getTriggerContextInfo())) {
                trigger.mo27837X0().invokeActions(X0.getTriggerContextInfo());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m24132x() {
        View view = this.f14446p;
        if (view != null) {
            try {
                this.f14440a.removeView(view);
            } catch (Exception unused) {
            }
            this.f14446p = null;
        }
    }

    /* renamed from: y */
    public static int m24133y(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.75f;
        return Color.HSVToColor(fArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m24134z(float f, boolean z) {
        if (this.f14446p == null) {
            this.f14446p = View.inflate(getBaseContext(), C17535R$layout.floating_button_delete, (ViewGroup) null);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, (((int) f) / 2) - this.f14445o, C6363a1.m24607a(), 786472, -3);
            layoutParams.windowAnimations = C17542R$style.FloatingButtonAnimation;
            this.f14440a.addView(this.f14446p, layoutParams);
        }
        this.f14446p.setBackgroundResource(z ? C17530R$drawable.floating_button_delete_active_background : C17530R$drawable.floating_button_delete_background);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m24130v();
    }

    public void onCreate() {
        super.onCreate();
        this.f14448z = true;
        C10180a.m40075a().mo80019m(this);
    }

    public void onDestroy() {
        this.f14448z = false;
        C10180a.m40075a().mo80020p(this);
        for (View removeView : this.f14441c) {
            try {
                this.f14440a.removeView(removeView);
            } catch (Exception unused) {
            }
        }
        this.f14441c.clear();
        super.onDestroy();
    }

    public void onEventMainThread(FloatingButtonsUpdateEvent floatingButtonsUpdateEvent) {
        this.f14434A.mo32491b(Void.class, new C6097b(), 400, TimeUnit.MILLISECONDS);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f14442d = TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        m24130v();
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        stopSelf();
    }
}
