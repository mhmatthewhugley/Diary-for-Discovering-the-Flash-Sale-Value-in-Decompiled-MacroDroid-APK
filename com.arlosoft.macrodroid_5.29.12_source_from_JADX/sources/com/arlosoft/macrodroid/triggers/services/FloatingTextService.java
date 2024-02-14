package com.arlosoft.macrodroid.triggers.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.android.p023dx.rop.code.RegisterSpec;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.database.C4378d;
import com.arlosoft.macrodroid.extensions.C4657d;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.utils.C6363a1;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p038md.C2030d;
import p148q0.C8151a;
import p297ja.C13339u;
import p370qa.C16265l;

/* compiled from: FloatingTextService.kt */
public final class FloatingTextService extends Service {

    /* renamed from: E */
    public static final C6099a f14458E = new C6099a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f14459A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f14460B;

    /* renamed from: C */
    private WindowManager.LayoutParams f14461C;

    /* renamed from: D */
    private final Timer f14462D;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WindowManager f14463a;

    /* renamed from: c */
    private final List<C6123c> f14464c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f14465d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4373a f14466f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public View f14467g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f14468o;

    /* renamed from: p */
    private boolean f14469p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f14470s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f14471z;

    /* renamed from: com.arlosoft.macrodroid.triggers.services.FloatingTextService$a */
    /* compiled from: FloatingTextService.kt */
    public static final class C6099a {
        private C6099a() {
        }

        public /* synthetic */ C6099a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo32048a(Context context) {
            C13706o.m87929f(context, "context");
            context.startService(new Intent(context, FloatingTextService.class));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.FloatingTextService$b */
    /* compiled from: View.kt */
    public static final class C6100b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f14472a;

        /* renamed from: b */
        final /* synthetic */ int f14473b;

        /* renamed from: c */
        final /* synthetic */ int f14474c;

        /* renamed from: d */
        final /* synthetic */ C4378d f14475d;

        /* renamed from: e */
        final /* synthetic */ FloatingTextService f14476e;

        public C6100b(View view, int i, int i2, C4378d dVar, FloatingTextService floatingTextService) {
            this.f14472a = view;
            this.f14473b = i;
            this.f14474c = i2;
            this.f14475d = dVar;
            this.f14476e = floatingTextService;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C13706o.m87929f(view, "view");
            view.removeOnLayoutChangeListener(this);
            int width = this.f14472a.getWidth();
            int height = this.f14472a.getHeight();
            int i9 = this.f14473b - width;
            int i10 = this.f14474c - height;
            int m = (int) (((float) (-(i10 / 2))) + (((float) i10) * this.f14475d.mo28674m()));
            ViewGroup.LayoutParams layoutParams = this.f14472a.getLayoutParams();
            C13706o.m87927d(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            layoutParams2.x = (int) (((float) (-(i9 / 2))) + (((float) i9) * this.f14475d.mo28673l()));
            layoutParams2.y = m;
            WindowManager d = this.f14476e.f14463a;
            if (d == null) {
                C13706o.m87945v("windowManager");
                d = null;
            }
            d.updateViewLayout(this.f14472a, layoutParams2);
            C13706o.m87928e(this.f14472a, "floatingViewContainer");
            this.f14472a.setVisibility(0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.FloatingTextService$c */
    /* compiled from: FloatingTextService.kt */
    public static final class C6101c implements View.OnTouchListener {

        /* renamed from: a */
        private long f14477a;

        /* renamed from: c */
        final /* synthetic */ C4378d f14478c;

        /* renamed from: d */
        final /* synthetic */ TextView f14479d;

        /* renamed from: f */
        final /* synthetic */ View f14480f;

        /* renamed from: g */
        final /* synthetic */ FloatingTextService f14481g;

        /* renamed from: o */
        final /* synthetic */ int f14482o;

        /* renamed from: p */
        final /* synthetic */ int f14483p;

        /* renamed from: s */
        final /* synthetic */ int f14484s;

        /* renamed from: z */
        final /* synthetic */ C6123c f14485z;

        C6101c(C4378d dVar, TextView textView, View view, FloatingTextService floatingTextService, int i, int i2, int i3, C6123c cVar) {
            this.f14478c = dVar;
            this.f14479d = textView;
            this.f14480f = view;
            this.f14481g = floatingTextService;
            this.f14482o = i;
            this.f14483p = i2;
            this.f14484s = i3;
            this.f14485z = cVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C13706o.m87929f(view, RegisterSpec.PREFIX);
            C13706o.m87929f(motionEvent, NotificationCompat.CATEGORY_EVENT);
            if (this.f14478c != null && ViewCompat.isAttachedToWindow(this.f14479d)) {
                try {
                    ViewGroup.LayoutParams layoutParams = this.f14480f.getLayoutParams();
                    C13706o.m87927d(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        WindowManager windowManager = null;
                        if (action == 1) {
                            WindowManager d = this.f14481g.f14463a;
                            if (d == null) {
                                C13706o.m87945v("windowManager");
                                d = null;
                            }
                            d.updateViewLayout(this.f14480f, layoutParams2);
                            WindowManager d2 = this.f14481g.f14463a;
                            if (d2 == null) {
                                C13706o.m87945v("windowManager");
                            } else {
                                windowManager = d2;
                            }
                            windowManager.updateViewLayout(this.f14480f, layoutParams2);
                            ViewGroup.LayoutParams layoutParams3 = this.f14480f.getLayoutParams();
                            C13706o.m87927d(layoutParams3, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                            int i = ((WindowManager.LayoutParams) layoutParams3).x;
                            ViewGroup.LayoutParams layoutParams4 = this.f14480f.getLayoutParams();
                            C13706o.m87927d(layoutParams4, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                            int i2 = ((WindowManager.LayoutParams) layoutParams4).y;
                            int width = this.f14480f.getWidth();
                            int height = this.f14480f.getHeight();
                            int i3 = this.f14484s - width;
                            int i4 = this.f14482o - height;
                            this.f14481g.f14466f.mo28634A(this.f14478c.mo28664e(), ((float) ((i3 / 2) + i)) / ((float) i3), ((float) ((i4 / 2) + i2)) / ((float) i4));
                            this.f14481g.f14468o = false;
                            if (this.f14481g.f14467g != null && ((double) i2) >= ((double) (this.f14482o / 2)) - (((double) this.f14483p) * 1.3d) && ((double) Math.abs(i)) < ((double) this.f14483p) * 0.5d) {
                                this.f14481g.m24155u(this.f14485z);
                            }
                            this.f14481g.m24154t();
                        } else if (action == 2) {
                            if (System.currentTimeMillis() > this.f14477a + ((long) 100)) {
                                this.f14481g.f14468o = true;
                                int e = rawX - this.f14481g.f14470s;
                                int g = rawY - this.f14481g.f14471z;
                                layoutParams2.x = this.f14481g.f14459A + e;
                                layoutParams2.y = this.f14481g.f14460B + g;
                                WindowManager d3 = this.f14481g.f14463a;
                                if (d3 == null) {
                                    C13706o.m87945v("windowManager");
                                    d3 = null;
                                }
                                d3.updateViewLayout(this.f14480f, layoutParams2);
                                if (((float) e) > this.f14481g.f14465d || ((float) g) > this.f14481g.f14465d) {
                                    ViewGroup.LayoutParams layoutParams5 = this.f14480f.getLayoutParams();
                                    C13706o.m87927d(layoutParams5, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                                    int i5 = ((WindowManager.LayoutParams) layoutParams5).x;
                                    ViewGroup.LayoutParams layoutParams6 = this.f14480f.getLayoutParams();
                                    C13706o.m87927d(layoutParams6, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                                    if (((double) ((WindowManager.LayoutParams) layoutParams6).y) < ((double) (this.f14482o / 2)) - (((double) this.f14483p) * 1.3d) || ((double) Math.abs(i5)) >= ((double) this.f14483p) * 0.5d) {
                                        FloatingTextService.m24158x(this.f14481g, (float) this.f14482o, false, 2, (Object) null);
                                    } else {
                                        this.f14481g.m24157w((float) this.f14482o, true);
                                    }
                                }
                            }
                        }
                    } else {
                        this.f14477a = System.currentTimeMillis();
                        this.f14481g.f14470s = rawX;
                        this.f14481g.f14471z = rawY;
                        this.f14481g.f14459A = layoutParams2.x;
                        this.f14481g.f14460B = layoutParams2.y;
                    }
                } catch (IllegalArgumentException e2) {
                    C8151a.m33873n(e2);
                }
            }
            return true;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.FloatingTextService$d */
    /* compiled from: FloatingTextService.kt */
    public static final class C6102d extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ FloatingTextService f14486a;

        C6102d(FloatingTextService floatingTextService) {
            this.f14486a = floatingTextService;
        }

        public void run() {
            this.f14486a.m24159y();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.FloatingTextService$e */
    /* compiled from: FloatingTextService.kt */
    static final class C6103e extends C13708q implements C16265l<Context, C13339u> {
        final /* synthetic */ C6123c $floatingView;
        final /* synthetic */ String $text;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6103e(C6123c cVar, String str) {
            super(1);
            this.$floatingView = cVar;
            this.$text = str;
        }

        /* renamed from: a */
        public final void mo32052a(Context context) {
            C13706o.m87929f(context, "$this$runOnUiThread");
            if (!C13706o.m87924a(this.$floatingView.mo32140c().getText(), this.$text)) {
                this.$floatingView.mo32140c().setText(this.$text);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo32052a((Context) obj);
            return C13339u.f61331a;
        }
    }

    public FloatingTextService() {
        C4373a h = C4373a.m17336h();
        C13706o.m87928e(h, "getInstance()");
        this.f14466f = h;
        this.f14462D = new Timer();
    }

    /* renamed from: r */
    private final void m24152r(C4378d dVar, TextView textView) {
        textView.setText(C4023j0.m15760t0(this, dVar.mo28668h(), dVar.mo28672k(), C4934n.m18998M().mo29682Q(dVar.mo28666f())));
        int a = dVar.mo28660a();
        int i = 1;
        if (a != 0) {
            if (a == 1) {
                i = 3;
            } else if (a == 2) {
                i = 5;
            }
        }
        textView.setGravity(i);
        textView.setTextColor(dVar.mo28670i());
        textView.setTextSize(2, (float) dVar.mo28671j());
        int b = C4657d.m18117b(dVar.mo28667g());
        textView.setPadding(b, b, b, b);
        textView.setAlpha(((float) dVar.mo28661b()) / 100.0f);
        m24156v(textView, dVar.mo28663d(), dVar.mo28662c());
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r11v7, types: [android.view.WindowManager] */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m24153s() {
        /*
            r17 = this;
            r10 = r17
            monitor-enter(r17)
            java.util.List<com.arlosoft.macrodroid.triggers.services.c> r1 = r10.f14464c     // Catch:{ all -> 0x01b0 }
            monitor-enter(r1)     // Catch:{ all -> 0x01b0 }
            java.util.List<com.arlosoft.macrodroid.triggers.services.c> r0 = r10.f14464c     // Catch:{ all -> 0x01ad }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01ad }
        L_0x000c:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x01ad }
            r11 = 0
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x01ad }
            com.arlosoft.macrodroid.triggers.services.c r2 = (com.arlosoft.macrodroid.triggers.services.C6123c) r2     // Catch:{ all -> 0x01ad }
            android.view.WindowManager r3 = r10.f14463a     // Catch:{ Exception -> 0x000c }
            if (r3 != 0) goto L_0x0023
            java.lang.String r3 = "windowManager"
            kotlin.jvm.internal.C13706o.m87945v(r3)     // Catch:{ Exception -> 0x000c }
            goto L_0x0024
        L_0x0023:
            r11 = r3
        L_0x0024:
            android.view.View r2 = r2.mo32138a()     // Catch:{ Exception -> 0x000c }
            r11.removeView(r2)     // Catch:{ Exception -> 0x000c }
            goto L_0x000c
        L_0x002c:
            java.util.List<com.arlosoft.macrodroid.triggers.services.c> r0 = r10.f14464c     // Catch:{ all -> 0x01ad }
            r0.clear()     // Catch:{ all -> 0x01ad }
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x01ad }
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            boolean r0 = com.arlosoft.macrodroid.settings.C5163j2.m20013M0(r17)     // Catch:{ all -> 0x01b0 }
            if (r0 != 0) goto L_0x003c
            monitor-exit(r17)
            return
        L_0x003c:
            android.view.WindowManager r0 = r10.f14463a     // Catch:{ all -> 0x01b0 }
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "windowManager"
            kotlin.jvm.internal.C13706o.m87945v(r0)     // Catch:{ all -> 0x01b0 }
            r0 = r11
        L_0x0046:
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x01b0 }
            int r12 = r0.getWidth()     // Catch:{ all -> 0x01b0 }
            android.view.WindowManager r0 = r10.f14463a     // Catch:{ all -> 0x01b0 }
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "windowManager"
            kotlin.jvm.internal.C13706o.m87945v(r0)     // Catch:{ all -> 0x01b0 }
            r0 = r11
        L_0x0058:
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x01b0 }
            int r13 = r0.getHeight()     // Catch:{ all -> 0x01b0 }
            r14 = 0
            if (r12 >= r13) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            com.arlosoft.macrodroid.database.a r1 = r10.f14466f     // Catch:{ all -> 0x01b0 }
            java.util.List r0 = r1.mo28638e(r0)     // Catch:{ all -> 0x01b0 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x01b0 }
        L_0x0070:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x0197
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x01b0 }
            com.arlosoft.macrodroid.database.d r0 = (com.arlosoft.macrodroid.database.C4378d) r0     // Catch:{ all -> 0x01b0 }
            boolean r1 = r0.mo28675n()     // Catch:{ all -> 0x01b0 }
            if (r1 == 0) goto L_0x0070
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams     // Catch:{ all -> 0x01b0 }
            r3 = -2
            r4 = -2
            r5 = 0
            r6 = 0
            int r7 = com.arlosoft.macrodroid.utils.C6363a1.m24607a()     // Catch:{ all -> 0x01b0 }
            r8 = 786472(0xc0028, float:1.102082E-39)
            r9 = -3
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01b0 }
            r10.f14461C = r1     // Catch:{ all -> 0x01b0 }
            kotlin.jvm.internal.C13706o.m87926c(r1)     // Catch:{ all -> 0x01b0 }
            r2 = 2132017508(0x7f140164, float:1.9673296E38)
            r1.windowAnimations = r2     // Catch:{ all -> 0x01b0 }
            android.content.Context r1 = r17.getBaseContext()     // Catch:{ all -> 0x01b0 }
            r2 = 2131558721(0x7f0d0141, float:1.8742766E38)
            android.view.View r9 = android.view.View.inflate(r1, r2, r11)     // Catch:{ all -> 0x01b0 }
            r1 = 2131362812(0x7f0a03fc, float:1.8345415E38)
            android.view.View r1 = r9.findViewById(r1)     // Catch:{ all -> 0x01b0 }
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch:{ all -> 0x01b0 }
            com.arlosoft.macrodroid.triggers.services.c r7 = new com.arlosoft.macrodroid.triggers.services.c     // Catch:{ all -> 0x01b0 }
            java.lang.String r1 = r0.mo28664e()     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "floatingViewContainer"
            kotlin.jvm.internal.C13706o.m87928e(r9, r2)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "floatingTextView"
            kotlin.jvm.internal.C13706o.m87928e(r8, r2)     // Catch:{ all -> 0x01b0 }
            r7.<init>(r1, r9, r8)     // Catch:{ all -> 0x01b0 }
            r1 = 4
            r9.setVisibility(r1)     // Catch:{ all -> 0x01b0 }
            boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r9)     // Catch:{ all -> 0x01b0 }
            if (r1 == 0) goto L_0x011e
            boolean r1 = r9.isLayoutRequested()     // Catch:{ all -> 0x01b0 }
            if (r1 != 0) goto L_0x011e
            int r1 = r9.getWidth()     // Catch:{ all -> 0x01b0 }
            int r2 = r9.getHeight()     // Catch:{ all -> 0x01b0 }
            int r1 = r12 - r1
            int r2 = r13 - r2
            int r3 = r1 / 2
            int r3 = -r3
            float r3 = (float) r3     // Catch:{ all -> 0x01b0 }
            float r1 = (float) r1     // Catch:{ all -> 0x01b0 }
            float r4 = r0.mo28673l()     // Catch:{ all -> 0x01b0 }
            float r1 = r1 * r4
            float r3 = r3 + r1
            int r1 = (int) r3     // Catch:{ all -> 0x01b0 }
            int r3 = r2 / 2
            int r3 = -r3
            float r3 = (float) r3     // Catch:{ all -> 0x01b0 }
            float r2 = (float) r2     // Catch:{ all -> 0x01b0 }
            float r4 = r0.mo28674m()     // Catch:{ all -> 0x01b0 }
            float r2 = r2 * r4
            float r3 = r3 + r2
            int r2 = (int) r3     // Catch:{ all -> 0x01b0 }
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()     // Catch:{ all -> 0x01b0 }
            java.lang.String r4 = "null cannot be cast to non-null type android.view.WindowManager.LayoutParams"
            kotlin.jvm.internal.C13706o.m87927d(r3, r4)     // Catch:{ all -> 0x01b0 }
            android.view.WindowManager$LayoutParams r3 = (android.view.WindowManager.LayoutParams) r3     // Catch:{ all -> 0x01b0 }
            r3.x = r1     // Catch:{ all -> 0x01b0 }
            r3.y = r2     // Catch:{ all -> 0x01b0 }
            android.view.WindowManager r1 = r17.f14463a     // Catch:{ all -> 0x01b0 }
            if (r1 != 0) goto L_0x0117
            java.lang.String r1 = "windowManager"
            kotlin.jvm.internal.C13706o.m87945v(r1)     // Catch:{ all -> 0x01b0 }
            r1 = r11
        L_0x0117:
            r1.updateViewLayout(r9, r3)     // Catch:{ all -> 0x01b0 }
            r9.setVisibility(r14)     // Catch:{ all -> 0x01b0 }
            goto L_0x012e
        L_0x011e:
            com.arlosoft.macrodroid.triggers.services.FloatingTextService$b r6 = new com.arlosoft.macrodroid.triggers.services.FloatingTextService$b     // Catch:{ all -> 0x01b0 }
            r1 = r6
            r2 = r9
            r3 = r12
            r4 = r13
            r5 = r0
            r11 = r6
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01b0 }
            r9.addOnLayoutChangeListener(r11)     // Catch:{ all -> 0x01b0 }
        L_0x012e:
            java.util.List<com.arlosoft.macrodroid.triggers.services.c> r1 = r10.f14464c     // Catch:{ all -> 0x01b0 }
            monitor-enter(r1)     // Catch:{ all -> 0x01b0 }
            java.util.List<com.arlosoft.macrodroid.triggers.services.c> r2 = r10.f14464c     // Catch:{ all -> 0x0194 }
            r2.add(r7)     // Catch:{ all -> 0x0194 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            java.lang.String r1 = "floatingText"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)     // Catch:{ all -> 0x01b0 }
            r10.m24152r(r0, r8)     // Catch:{ all -> 0x01b0 }
            r1 = 48
            int r11 = com.arlosoft.macrodroid.extensions.C4657d.m18117b(r1)     // Catch:{ all -> 0x01b0 }
            com.arlosoft.macrodroid.triggers.services.FloatingTextService$c r6 = new com.arlosoft.macrodroid.triggers.services.FloatingTextService$c     // Catch:{ all -> 0x01b0 }
            r1 = r6
            r2 = r0
            r3 = r8
            r4 = r9
            r5 = r17
            r0 = r6
            r6 = r13
            r16 = r7
            r7 = r11
            r11 = r8
            r8 = r12
            r14 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01b0 }
            r11.setOnTouchListener(r0)     // Catch:{ all -> 0x01b0 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01b0 }
            r1 = 23
            if (r0 < r1) goto L_0x016e
            boolean r0 = android.provider.Settings.canDrawOverlays(r17)     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x016a
            goto L_0x016e
        L_0x016a:
            r11 = 0
            r14 = 0
            goto L_0x0070
        L_0x016e:
            android.view.WindowManager r0 = r10.f14463a     // Catch:{ Exception -> 0x017e }
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "windowManager"
            kotlin.jvm.internal.C13706o.m87945v(r0)     // Catch:{ Exception -> 0x017e }
            r0 = 0
        L_0x0178:
            android.view.WindowManager$LayoutParams r1 = r10.f14461C     // Catch:{ Exception -> 0x017e }
            r0.addView(r14, r1)     // Catch:{ Exception -> 0x017e }
            goto L_0x016a
        L_0x017e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b0 }
            r1.<init>()     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "Failed to add floating text: "
            r1.append(r2)     // Catch:{ all -> 0x01b0 }
            r1.append(r0)     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01b0 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)     // Catch:{ all -> 0x01b0 }
            goto L_0x016a
        L_0x0194:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            throw r0     // Catch:{ all -> 0x01b0 }
        L_0x0197:
            java.util.List<com.arlosoft.macrodroid.triggers.services.c> r1 = r10.f14464c     // Catch:{ all -> 0x01b0 }
            monitor-enter(r1)     // Catch:{ all -> 0x01b0 }
            java.util.List<com.arlosoft.macrodroid.triggers.services.c> r0 = r10.f14464c     // Catch:{ all -> 0x01aa }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x01a5
            r17.stopSelf()     // Catch:{ all -> 0x01aa }
        L_0x01a5:
            ja.u r0 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x01aa }
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            monitor-exit(r17)
            return
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            throw r0     // Catch:{ all -> 0x01b0 }
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b0 }
            throw r0     // Catch:{ all -> 0x01b0 }
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.services.FloatingTextService.m24153s():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m24154t() {
        if (this.f14467g != null) {
            try {
                WindowManager windowManager = this.f14463a;
                if (windowManager == null) {
                    C13706o.m87945v("windowManager");
                    windowManager = null;
                }
                windowManager.removeView(this.f14467g);
            } catch (Exception unused) {
            }
            this.f14467g = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m24155u(C6123c cVar) {
        this.f14466f.mo28648q(cVar.mo32139b());
        WindowManager windowManager = this.f14463a;
        if (windowManager == null) {
            C13706o.m87945v("windowManager");
            windowManager = null;
        }
        windowManager.removeView(cVar.mo32138a());
        synchronized (this.f14464c) {
            this.f14464c.remove(cVar);
            if (this.f14464c.isEmpty()) {
                stopSelf();
            }
            C13339u uVar = C13339u.f61331a;
        }
    }

    /* renamed from: v */
    private final void m24156v(TextView textView, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) C4657d.m18117b(i));
        gradientDrawable.setColor(i2);
        textView.setBackground(gradientDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m24157w(float f, boolean z) {
        if (this.f14467g == null) {
            WindowManager windowManager = null;
            this.f14467g = View.inflate(getBaseContext(), C17535R$layout.floating_button_delete, (ViewGroup) null);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, (((int) f) / 2) - C4657d.m18117b(48), C6363a1.m24607a(), 786472, -3);
            layoutParams.windowAnimations = C17542R$style.FloatingButtonAnimation;
            WindowManager windowManager2 = this.f14463a;
            if (windowManager2 == null) {
                C13706o.m87945v("windowManager");
            } else {
                windowManager = windowManager2;
            }
            windowManager.addView(this.f14467g, layoutParams);
        }
        View view = this.f14467g;
        if (view != null) {
            view.setBackgroundResource(z ? C17530R$drawable.floating_button_delete_active_background : C17530R$drawable.floating_button_delete_background);
        }
    }

    /* renamed from: x */
    static /* synthetic */ void m24158x(FloatingTextService floatingTextService, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        floatingTextService.m24157w(f, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m24159y() {
        for (C4378d next : this.f14466f.mo28638e(true)) {
            if (next.mo28675n()) {
                synchronized (this.f14464c) {
                    for (C6123c next2 : this.f14464c) {
                        if (C13706o.m87924a(next2.mo32139b(), next.mo28664e())) {
                            C2030d.m8417a(this, new C6103e(next2, C4023j0.m15760t0(this, next.mo28668h(), next.mo28672k(), C4934n.m18998M().mo29682Q(next.mo28666f()))));
                        }
                    }
                    C13339u uVar = C13339u.f61331a;
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C13706o.m87929f(intent, "intent");
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C13706o.m87929f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m24153s();
    }

    public void onCreate() {
        super.onCreate();
        Object systemService = getSystemService("window");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f14463a = (WindowManager) systemService;
        this.f14469p = true;
        this.f14462D.scheduleAtFixedRate(new C6102d(this), 0, 1000);
    }

    public void onDestroy() {
        this.f14469p = false;
        this.f14462D.cancel();
        synchronized (this.f14464c) {
            for (C6123c next : this.f14464c) {
                try {
                    WindowManager windowManager = this.f14463a;
                    if (windowManager == null) {
                        C13706o.m87945v("windowManager");
                        windowManager = null;
                    }
                    windowManager.removeView(next.mo32138a());
                } catch (Exception unused) {
                }
            }
            this.f14464c.clear();
            C13339u uVar = C13339u.f61331a;
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f14465d = (float) C4657d.m18117b(5);
        m24153s();
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        C13706o.m87929f(intent, "rootIntent");
        stopSelf();
    }
}
