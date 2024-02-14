package com.arlosoft.macrodroid.logcat;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.android.p023dx.rop.code.RegisterSpec;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.events.FloatingButtonsUpdateEvent;
import com.arlosoft.macrodroid.logcat.LogcatMessageSelectActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.LogcatTrigger;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.melnykov.fab.FloatingActionButton;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p148q0.C8151a;
import p149q1.C8157f;
import p161s1.C10180a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;

/* compiled from: LogcatButtonService.kt */
public final class LogcatButtonService extends Service {

    /* renamed from: L */
    public static final C4834a f12159L = new C4834a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f12160A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f12161B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f12162C;

    /* renamed from: D */
    private WindowManager.LayoutParams f12163D;

    /* renamed from: E */
    private LogcatTrigger f12164E;

    /* renamed from: F */
    private Macro f12165F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f12166G;

    /* renamed from: H */
    private boolean f12167H;

    /* renamed from: I */
    private C15561w1 f12168I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public InputStream f12169J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public ArrayList<LogcatMessage> f12170K = new ArrayList<>();

    /* renamed from: a */
    public C4848c f12171a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WindowManager f12172c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public View f12173d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f12174f;

    /* renamed from: g */
    private int f12175g;

    /* renamed from: o */
    private int f12176o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f12177p;

    /* renamed from: s */
    private boolean f12178s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f12179z;

    /* renamed from: com.arlosoft.macrodroid.logcat.LogcatButtonService$a */
    /* compiled from: LogcatButtonService.kt */
    public static final class C4834a {
        private C4834a() {
        }

        public /* synthetic */ C4834a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo29363a(Context context, Macro macro, LogcatTrigger logcatTrigger, int i) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(macro, "macro");
            C13706o.m87929f(logcatTrigger, "trigger");
            Intent intent = new Intent(context, LogcatButtonService.class);
            intent.putExtra("trigger", logcatTrigger);
            intent.putExtra(C8157f.ITEM_TYPE, macro);
            intent.putExtra("enabled_buffers", i);
            context.startService(intent);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logcat.LogcatButtonService$b */
    /* compiled from: LogcatButtonService.kt */
    public static final class C4835b implements View.OnTouchListener {

        /* renamed from: a */
        private long f12180a;

        /* renamed from: c */
        final /* synthetic */ FloatingActionButton f12181c;

        /* renamed from: d */
        final /* synthetic */ LogcatButtonService f12182d;

        C4835b(FloatingActionButton floatingActionButton, LogcatButtonService logcatButtonService) {
            this.f12181c = floatingActionButton;
            this.f12182d = logcatButtonService;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C13706o.m87929f(view, RegisterSpec.PREFIX);
            C13706o.m87929f(motionEvent, NotificationCompat.CATEGORY_EVENT);
            FloatingActionButton floatingActionButton = this.f12181c;
            if (floatingActionButton != null && ViewCompat.isAttachedToWindow(floatingActionButton)) {
                try {
                    View b = this.f12182d.f12173d;
                    C13706o.m87926c(b);
                    ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                    C13706o.m87927d(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.f12180a = System.currentTimeMillis();
                        this.f12182d.f12179z = rawX;
                        this.f12182d.f12160A = rawY;
                        this.f12182d.f12161B = layoutParams2.x;
                        this.f12182d.f12162C = layoutParams2.y;
                        this.f12181c.setPressed(true);
                    } else if (action == 1) {
                        int h = rawX - this.f12182d.f12179z;
                        int j = rawY - this.f12182d.f12160A;
                        WindowManager g = this.f12182d.f12172c;
                        C13706o.m87926c(g);
                        g.updateViewLayout(this.f12182d.f12173d, layoutParams2);
                        if (!this.f12182d.f12177p || (((float) h) < this.f12182d.f12174f && ((float) j) < this.f12182d.f12174f)) {
                            this.f12182d.m18713v();
                        }
                        WindowManager g2 = this.f12182d.f12172c;
                        C13706o.m87926c(g2);
                        g2.updateViewLayout(this.f12182d.f12173d, layoutParams2);
                        this.f12181c.setPressed(false);
                        View b2 = this.f12182d.f12173d;
                        C13706o.m87926c(b2);
                        ViewGroup.LayoutParams layoutParams3 = b2.getLayoutParams();
                        C13706o.m87927d(layoutParams3, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                        int i = ((WindowManager.LayoutParams) layoutParams3).x;
                        View b3 = this.f12182d.f12173d;
                        C13706o.m87926c(b3);
                        ViewGroup.LayoutParams layoutParams4 = b3.getLayoutParams();
                        C13706o.m87927d(layoutParams4, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                        int i2 = ((WindowManager.LayoutParams) layoutParams4).y;
                        this.f12182d.f12177p = false;
                    } else if (action == 2) {
                        if (System.currentTimeMillis() > this.f12180a + ((long) 525)) {
                            this.f12182d.f12177p = true;
                            int h2 = rawX - this.f12182d.f12179z;
                            int j2 = rawY - this.f12182d.f12160A;
                            layoutParams2.x = this.f12182d.f12161B + h2;
                            layoutParams2.y = this.f12182d.f12162C + j2;
                            WindowManager g3 = this.f12182d.f12172c;
                            C13706o.m87926c(g3);
                            g3.updateViewLayout(this.f12182d.f12173d, layoutParams2);
                        }
                    }
                } catch (IllegalArgumentException e) {
                    C8151a.m33873n(e);
                }
            }
            return true;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logcat.LogcatButtonService$c */
    /* compiled from: LogcatButtonService.kt */
    static final class C4836c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ LogcatButtonService this$0;

        /* renamed from: com.arlosoft.macrodroid.logcat.LogcatButtonService$c$a */
        /* compiled from: LogcatButtonService.kt */
        static final class C4837a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ LogcatButtonService this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4837a(LogcatButtonService logcatButtonService, C13635d<? super C4837a> dVar) {
                super(2, dVar);
                this.this$0 = logcatButtonService;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C4837a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C4837a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.stopSelf();
                    this.this$0.m18715x();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4836c(LogcatButtonService logcatButtonService, C13635d<? super C4836c> dVar) {
            super(2, dVar);
            this.this$0 = logcatButtonService;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4836c(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4836c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f4, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            kotlin.p312io.C13667b.m87853a(r2, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f8, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object unused = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r0 = r11.label
                if (r0 != 0) goto L_0x012f
                p297ja.C13332o.m85685b(r12)
                java.lang.String r12 = "Logcat message capture started"
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18873l(r12)     // Catch:{ Exception -> 0x010e }
                long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x010e }
                com.arlosoft.macrodroid.triggers.LogcatTrigger$b r12 = com.arlosoft.macrodroid.triggers.LogcatTrigger.f13642d     // Catch:{ Exception -> 0x010e }
                com.arlosoft.macrodroid.logcat.LogcatButtonService r2 = r11.this$0     // Catch:{ Exception -> 0x010e }
                int r2 = r2.f12166G     // Catch:{ Exception -> 0x010e }
                java.lang.String r12 = r12.mo31308c(r2)     // Catch:{ Exception -> 0x010e }
                java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x010e }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010e }
                r3.<init>()     // Catch:{ Exception -> 0x010e }
                java.lang.String r4 = "logcat -c -b "
                r3.append(r4)     // Catch:{ Exception -> 0x010e }
                r3.append(r12)     // Catch:{ Exception -> 0x010e }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x010e }
                java.lang.Process r2 = r2.exec(r3)     // Catch:{ Exception -> 0x010e }
                r2.waitFor()     // Catch:{ Exception -> 0x010e }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x010e }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010e }
                r4.<init>()     // Catch:{ Exception -> 0x010e }
                java.lang.String r5 = "WAITED FOR "
                r4.append(r5)     // Catch:{ Exception -> 0x010e }
                long r2 = r2 - r0
                r4.append(r2)     // Catch:{ Exception -> 0x010e }
                java.lang.String r0 = "ms"
                r4.append(r0)     // Catch:{ Exception -> 0x010e }
                java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x010e }
                r6 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18867f(r5, r6, r8, r9, r10)     // Catch:{ Exception -> 0x010e }
                com.arlosoft.macrodroid.logcat.LogcatButtonService r0 = r11.this$0     // Catch:{ Exception -> 0x010e }
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x010e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010e }
                r2.<init>()     // Catch:{ Exception -> 0x010e }
                java.lang.String r3 = "logcat -v tag -b "
                r2.append(r3)     // Catch:{ Exception -> 0x010e }
                r2.append(r12)     // Catch:{ Exception -> 0x010e }
                java.lang.String r12 = r2.toString()     // Catch:{ Exception -> 0x010e }
                java.lang.Process r12 = r1.exec(r12)     // Catch:{ Exception -> 0x010e }
                java.io.InputStream r12 = r12.getInputStream()     // Catch:{ Exception -> 0x010e }
                r0.f12169J = r12     // Catch:{ Exception -> 0x010e }
                com.arlosoft.macrodroid.logcat.LogcatButtonService r12 = r11.this$0     // Catch:{ Exception -> 0x010e }
                java.io.InputStream r12 = r12.f12169J     // Catch:{ Exception -> 0x010e }
                r0 = 0
                if (r12 == 0) goto L_0x00f9
                java.nio.charset.Charset r1 = kotlin.text.C15147d.f64349b     // Catch:{ Exception -> 0x010e }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x010e }
                r2.<init>(r12, r1)     // Catch:{ Exception -> 0x010e }
                r12 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r2 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x010e }
                if (r1 == 0) goto L_0x0099
                java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ Exception -> 0x010e }
                goto L_0x009f
            L_0x0099:
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x010e }
                r1.<init>(r2, r12)     // Catch:{ Exception -> 0x010e }
                r2 = r1
            L_0x009f:
                com.arlosoft.macrodroid.logcat.LogcatButtonService r12 = r11.this$0     // Catch:{ Exception -> 0x010e }
                kotlin.sequences.h r1 = kotlin.p312io.C13675i.m87861d(r2)     // Catch:{ all -> 0x00f2 }
                r3 = 2500(0x9c4, float:3.503E-42)
                kotlin.sequences.h r1 = kotlin.sequences.C15132p.m93477A(r1, r3)     // Catch:{ all -> 0x00f2 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00f2 }
            L_0x00af:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00f2 }
                if (r3 == 0) goto L_0x00ec
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00f2 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00f2 }
                r10 = 2
                java.lang.String r5 = ":"
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r3
                int r4 = kotlin.text.C15177w.m93682a0(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00af }
                java.lang.String r4 = r3.substring(r10, r4)     // Catch:{ Exception -> 0x00af }
                java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r4, r5)     // Catch:{ Exception -> 0x00af }
                int r5 = r4.length()     // Catch:{ Exception -> 0x00af }
                int r5 = r5 + 4
                java.lang.String r3 = r3.substring(r5)     // Catch:{ Exception -> 0x00af }
                java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r3, r5)     // Catch:{ Exception -> 0x00af }
                java.util.ArrayList r5 = r12.f12170K     // Catch:{ Exception -> 0x00af }
                com.arlosoft.macrodroid.logcat.LogcatMessage r6 = new com.arlosoft.macrodroid.logcat.LogcatMessage     // Catch:{ Exception -> 0x00af }
                r6.<init>(r4, r3)     // Catch:{ Exception -> 0x00af }
                r5.add(r6)     // Catch:{ Exception -> 0x00af }
                goto L_0x00af
            L_0x00ec:
                ja.u r12 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00f2 }
                kotlin.p312io.C13667b.m87853a(r2, r0)     // Catch:{ Exception -> 0x010e }
                goto L_0x00f9
            L_0x00f2:
                r12 = move-exception
                throw r12     // Catch:{ all -> 0x00f4 }
            L_0x00f4:
                r0 = move-exception
                kotlin.p312io.C13667b.m87853a(r2, r12)     // Catch:{ Exception -> 0x010e }
                throw r0     // Catch:{ Exception -> 0x010e }
            L_0x00f9:
                kotlinx.coroutines.p1 r12 = kotlinx.coroutines.C15503p1.f64723a     // Catch:{ Exception -> 0x010e }
                kotlinx.coroutines.h2 r1 = kotlinx.coroutines.C15186a1.m93731c()     // Catch:{ Exception -> 0x010e }
                r2 = 0
                com.arlosoft.macrodroid.logcat.LogcatButtonService$c$a r3 = new com.arlosoft.macrodroid.logcat.LogcatButtonService$c$a     // Catch:{ Exception -> 0x010e }
                com.arlosoft.macrodroid.logcat.LogcatButtonService r4 = r11.this$0     // Catch:{ Exception -> 0x010e }
                r3.<init>(r4, r0)     // Catch:{ Exception -> 0x010e }
                r4 = 2
                r5 = 0
                r0 = r12
                kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x010e }
                goto L_0x012c
            L_0x010e:
                r12 = move-exception
                boolean r0 = r12 instanceof java.io.InterruptedIOException
                if (r0 != 0) goto L_0x012c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Logcat message capture failed: {"
                r0.append(r1)
                r0.append(r12)
                r12 = 125(0x7d, float:1.75E-43)
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r12)
            L_0x012c:
                ja.u r12 = p297ja.C13339u.f61331a
                return r12
            L_0x012f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.logcat.LogcatButtonService.C4836c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public LogcatButtonService() {
        MacroDroidApplication.f9883I.mo27302a().mo38310o(this);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m18712t() {
        /*
            r12 = this;
            monitor-enter(r12)
            android.view.View r0 = r12.f12173d     // Catch:{ all -> 0x00d6 }
            r1 = 0
            if (r0 == 0) goto L_0x0012
            android.view.WindowManager r0 = r12.f12172c     // Catch:{ Exception -> 0x0010 }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x0010 }
            android.view.View r2 = r12.f12173d     // Catch:{ Exception -> 0x0010 }
            r0.removeView(r2)     // Catch:{ Exception -> 0x0010 }
        L_0x0010:
            r12.f12173d = r1     // Catch:{ all -> 0x00d6 }
        L_0x0012:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r12.getSystemService(r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.C13706o.m87927d(r0, r2)     // Catch:{ all -> 0x00d6 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ all -> 0x00d6 }
            r12.f12172c = r0     // Catch:{ all -> 0x00d6 }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ all -> 0x00d6 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x00d6 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d6 }
            r12.f12175g = r0     // Catch:{ all -> 0x00d6 }
            android.view.WindowManager r0 = r12.f12172c     // Catch:{ all -> 0x00d6 }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ all -> 0x00d6 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x00d6 }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x00d6 }
            com.arlosoft.macrodroid.settings.C5163j2.m19991J(r12)     // Catch:{ all -> 0x00d6 }
            int r2 = r12.f12175g     // Catch:{ all -> 0x00d6 }
            android.content.res.Resources r2 = r12.getResources()     // Catch:{ all -> 0x00d6 }
            r3 = 2131165382(0x7f0700c6, float:1.794498E38)
            int r2 = r2.getDimensionPixelSize(r3)     // Catch:{ all -> 0x00d6 }
            r12.f12176o = r2     // Catch:{ all -> 0x00d6 }
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ all -> 0x00d6 }
            r3 = 0
            int r0 = -r0
            int r0 = r0 / 6
            r2.<init>(r3, r0)     // Catch:{ all -> 0x00d6 }
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams     // Catch:{ all -> 0x00d6 }
            int r6 = r12.f12176o     // Catch:{ all -> 0x00d6 }
            int r7 = r2.x     // Catch:{ all -> 0x00d6 }
            int r8 = r2.y     // Catch:{ all -> 0x00d6 }
            int r9 = com.arlosoft.macrodroid.utils.C6363a1.m24607a()     // Catch:{ all -> 0x00d6 }
            r10 = 786472(0xc0028, float:1.102082E-39)
            r11 = -3
            r4 = r0
            r5 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00d6 }
            r12.f12163D = r0     // Catch:{ all -> 0x00d6 }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ all -> 0x00d6 }
            r2 = 2132017508(0x7f140164, float:1.9673296E38)
            r0.windowAnimations = r2     // Catch:{ all -> 0x00d6 }
            android.content.Context r0 = r12.getBaseContext()     // Catch:{ all -> 0x00d6 }
            r2 = 2131558719(0x7f0d013f, float:1.8742762E38)
            android.view.View r0 = android.view.View.inflate(r0, r2, r1)     // Catch:{ all -> 0x00d6 }
            r12.f12173d = r0     // Catch:{ all -> 0x00d6 }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ all -> 0x00d6 }
            r1 = 2131362762(0x7f0a03ca, float:1.8345314E38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ all -> 0x00d6 }
            java.lang.String r1 = "floatingView!!.findViewById(R.id.fab)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)     // Catch:{ all -> 0x00d6 }
            com.melnykov.fab.FloatingActionButton r0 = (com.melnykov.fab.FloatingActionButton) r0     // Catch:{ all -> 0x00d6 }
            r1 = 2131100106(0x7f0601ca, float:1.7812584E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r12, r1)     // Catch:{ all -> 0x00d6 }
            r0.setColorNormal(r2)     // Catch:{ all -> 0x00d6 }
            r2 = 2131100107(0x7f0601cb, float:1.7812586E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r12, r2)     // Catch:{ all -> 0x00d6 }
            r0.setColorRipple(r2)     // Catch:{ all -> 0x00d6 }
            int r1 = androidx.core.content.ContextCompat.getColor(r12, r1)     // Catch:{ all -> 0x00d6 }
            r0.setColorPressed(r1)     // Catch:{ all -> 0x00d6 }
            r1 = 2131231209(0x7f0801e9, float:1.8078493E38)
            r0.setImageResource(r1)     // Catch:{ all -> 0x00d6 }
            com.arlosoft.macrodroid.logcat.LogcatButtonService$b r1 = new com.arlosoft.macrodroid.logcat.LogcatButtonService$b     // Catch:{ all -> 0x00d6 }
            r1.<init>(r0, r12)     // Catch:{ all -> 0x00d6 }
            r0.setOnTouchListener(r1)     // Catch:{ all -> 0x00d6 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d6 }
            r1 = 23
            if (r0 < r1) goto L_0x00c8
            boolean r0 = android.provider.Settings.canDrawOverlays(r12)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00d4
        L_0x00c8:
            android.view.WindowManager r0 = r12.f12172c     // Catch:{ Exception -> 0x00d4 }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x00d4 }
            android.view.View r1 = r12.f12173d     // Catch:{ Exception -> 0x00d4 }
            android.view.WindowManager$LayoutParams r2 = r12.f12163D     // Catch:{ Exception -> 0x00d4 }
            r0.addView(r1, r2)     // Catch:{ Exception -> 0x00d4 }
        L_0x00d4:
            monitor-exit(r12)
            return
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.logcat.LogcatButtonService.m18712t():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m18713v() {
        if (!this.f12178s) {
            this.f12178s = true;
            View view = this.f12173d;
            C13706o.m87926c(view);
            View findViewById = view.findViewById(C17532R$id.fab);
            C13706o.m87928e(findViewById, "floatingView!!.findViewById(R.id.fab)");
            ((FloatingActionButton) findViewById).setImageResource(C17530R$drawable.material_ic_stop_24px_svg);
            C15626c.makeText(this, C17541R$string.capturing_logcat_message_hit_stop_when_done, 1).show();
            m18714w();
            return;
        }
        stopSelf();
        m18715x();
    }

    /* renamed from: w */
    private final void m18714w() {
        this.f12170K.clear();
        C15561w1 w1Var = this.f12168I;
        if (w1Var != null) {
            C15561w1.C15562a.m94723a(w1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f12168I = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C4836c(this, (C13635d<? super C4836c>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final synchronized void m18715x() {
        if (!this.f12167H) {
            LogcatTrigger logcatTrigger = null;
            try {
                InputStream inputStream = this.f12169J;
                if (inputStream != null) {
                    inputStream.close();
                }
                C15561w1 w1Var = this.f12168I;
                if (w1Var != null) {
                    C15561w1.C15562a.m94723a(w1Var, (CancellationException) null, 1, (Object) null);
                }
                this.f12168I = null;
                this.f12169J = null;
                C4878b.m18873l("Logcat message capture ended");
            } catch (Exception e) {
                FirebaseCrashlytics.m6487a().mo22936d(e);
                C4878b.m18868g("Closing logcat message capture failed: " + e);
            }
            mo29362u().mo29392c(this.f12170K);
            LogcatMessageSelectActivity.C4839a aVar = LogcatMessageSelectActivity.f12185F;
            Macro macro = this.f12165F;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            LogcatTrigger logcatTrigger2 = this.f12164E;
            if (logcatTrigger2 == null) {
                C13706o.m87945v("trigger");
            } else {
                logcatTrigger = logcatTrigger2;
            }
            aVar.mo29379a(this, macro, logcatTrigger, this.f12166G);
            this.f12167H = true;
        }
    }

    public IBinder onBind(Intent intent) {
        C13706o.m87929f(intent, "intent");
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C13706o.m87929f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m18712t();
    }

    public void onCreate() {
        super.onCreate();
        C10180a.m40075a().mo80019m(this);
    }

    public void onDestroy() {
        C10180a.m40075a().mo80020p(this);
        if (this.f12173d != null) {
            try {
                WindowManager windowManager = this.f12172c;
                C13706o.m87926c(windowManager);
                windowManager.removeView(this.f12173d);
            } catch (Exception unused) {
            }
        }
        super.onDestroy();
    }

    public final void onEventMainThread(FloatingButtonsUpdateEvent floatingButtonsUpdateEvent) {
        m18712t();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 3;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(C8157f.ITEM_TYPE);
        C13706o.m87926c(parcelableExtra);
        this.f12165F = (Macro) parcelableExtra;
        Parcelable parcelableExtra2 = intent.getParcelableExtra("trigger");
        C13706o.m87926c(parcelableExtra2);
        this.f12164E = (LogcatTrigger) parcelableExtra2;
        this.f12166G = intent.getIntExtra("enabled_buffers", 0);
        this.f12174f = TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        m18712t();
        return 3;
    }

    public void onTaskRemoved(Intent intent) {
        C13706o.m87929f(intent, "rootIntent");
        stopSelf();
    }

    /* renamed from: u */
    public final C4848c mo29362u() {
        C4848c cVar = this.f12171a;
        if (cVar != null) {
            return cVar;
        }
        C13706o.m87945v("logcatMessageRepository");
        return null;
    }
}
