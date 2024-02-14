package com.arlosoft.macrodroid;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4032k0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6433t;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15478k0;
import p148q0.C8151a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: MacroDroidService.kt */
public final class MacroDroidService extends Service {

    /* renamed from: a */
    public static final C2296a f7040a = new C2296a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f7041c;

    /* renamed from: d */
    private static boolean f7042d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static Thread f7043f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C6433t f7044g = new C6433t();

    /* renamed from: com.arlosoft.macrodroid.MacroDroidService$a */
    /* compiled from: MacroDroidService.kt */
    public static final class C2296a {

        /* renamed from: com.arlosoft.macrodroid.MacroDroidService$a$a */
        /* compiled from: MacroDroidService.kt */
        public static final class C2297a extends Thread {

            /* renamed from: a */
            final /* synthetic */ Context f7045a;

            /* renamed from: c */
            final /* synthetic */ Intent f7046c;

            C2297a(Context context, Intent intent) {
                this.f7045a = context;
                this.f7046c = intent;
            }

            public void run() {
                int i = 0;
                while (i < 20 && isAlive()) {
                    if (MacroDroidService.f7041c) {
                        this.f7045a.getApplicationContext().stopService(this.f7046c);
                        return;
                    }
                    try {
                        Thread.sleep(100);
                        i++;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        }

        /* renamed from: com.arlosoft.macrodroid.MacroDroidService$a$b */
        /* compiled from: MacroDroidService.kt */
        static final class C2298b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ Notification $notification;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2298b(Context context, Notification notification, C13635d<? super C2298b> dVar) {
                super(2, dVar);
                this.$context = context;
                this.$notification = notification;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C2298b(this.$context, this.$notification, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C2298b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    try {
                        Object systemService = this.$context.getSystemService("notification");
                        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService).notify(7987673, this.$notification);
                    } catch (Exception e) {
                        C4878b.m18868g("Failed to update notification: " + e);
                        C8151a.m33873n(e);
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private C2296a() {
        }

        public /* synthetic */ C2296a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final Notification m9506d(Context context) {
            int V = C4061t1.m15976V(context, C5163j2.m20027O0(context));
            if (V == -1) {
                V = C5163j2.m20020N0(context);
            }
            try {
                context.getResources().getResourceName(V);
            } catch (Resources.NotFoundException unused) {
                V = C17530R$drawable.active_icon_new;
            }
            if (Build.VERSION.SDK_INT >= 26 || !C5163j2.m20103Z(context)) {
                int c1 = C5163j2.m20128c1(context);
                if (C5163j2.m20035P1(context)) {
                    return C4032k0.m15915a(context, V, c1, "persistent_notification");
                }
                return C4032k0.m15916b(context, V, c1, "persistent_notification");
            }
            long a0 = C5163j2.m20111a0(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > a0 + ((long) 86400000)) {
                C4878b.m18882u("<WARNING> - Force Hide Icon is enabled, please disable this if you see any issues");
                C5163j2.m20044Q3(context, currentTimeMillis);
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m9507j(boolean z, Context context) {
            C13706o.m87929f(context, "$context");
            new Handler(Looper.getMainLooper()).post(new C3898c0(z, context));
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m9508k(boolean z, Context context) {
            Notification d;
            C13706o.m87929f(context, "$context");
            if ((z || (!C5163j2.m20035P1(context) && C5163j2.m20007L1(context))) && (d = MacroDroidService.f7040a.m9506d(context)) != null) {
                try {
                    C4878b.m18879r("Updating MacroDroid notification bar");
                    Object systemService = context.getSystemService("notification");
                    C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService).notify(7987673, d);
                } catch (Exception e) {
                    C4878b.m18868g("Failed to update notification: " + e);
                    C8151a.m33873n(e);
                }
            }
        }

        /* renamed from: e */
        public final C6433t mo24640e() {
            return MacroDroidService.f7044g;
        }

        /* renamed from: f */
        public final void mo24641f(Context context) {
            C13706o.m87929f(context, "context");
            Thread a = MacroDroidService.f7043f;
            if (a != null) {
                a.interrupt();
            }
            Intent intent = new Intent(context.getApplicationContext(), MacroDroidService.class);
            if (Build.VERSION.SDK_INT < 26) {
                context.startService(intent);
            } else {
                context.getApplicationContext().startForegroundService(intent);
            }
        }

        /* renamed from: g */
        public final void mo24642g(Context context) {
            C13706o.m87929f(context, "context");
            Intent intent = new Intent(context.getApplicationContext(), MacroDroidService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                MacroDroidService.f7043f = new C2297a(context, intent);
                Thread a = MacroDroidService.f7043f;
                if (a != null) {
                    a.start();
                    return;
                }
                return;
            }
            context.getApplicationContext().stopService(intent);
        }

        /* renamed from: h */
        public final Object mo24643h(Context context, C13635d<? super C13339u> dVar) {
            Notification d;
            if (!C5163j2.m20007L1(context) || C5163j2.m20035P1(context) || (d = m9506d(context)) == null) {
                return C13339u.f61331a;
            }
            Object g = C15414h.m94298g(C15186a1.m93731c(), new C2298b(context, d, (C13635d<? super C2298b>) null), dVar);
            return g == C13652d.m87832c() ? g : C13339u.f61331a;
        }

        /* renamed from: i */
        public final void mo24644i(Context context, boolean z) {
            C13706o.m87929f(context, "context");
            mo24640e().mo32491b(Void.class, new C3876b0(z, context), 250, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: e */
    public static final void m9500e(Context context) {
        f7040a.mo24641f(context);
    }

    /* renamed from: f */
    public static final void m9501f(Context context) {
        f7040a.mo24642g(context);
    }

    /* renamed from: g */
    public static final void m9502g(Context context, boolean z) {
        f7040a.mo24644i(context, z);
    }

    public IBinder onBind(Intent intent) {
        C13706o.m87929f(intent, "intent");
        return null;
    }

    public void onCreate() {
        super.onCreate();
        f7042d = true;
        C4878b.m18864c("MacroDroidService - onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        C4878b.m18864c("KeepAlive service is being destroyed");
        f7041c = false;
        f7042d = false;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        C4878b.m18864c("MacroDroidService - onStartCommand");
        Notification c = f7040a.m9506d(this);
        if (c != null) {
            startForeground(7987673, c);
            C4878b.m18864c("After call to startForeground");
            f7041c = true;
        } else if (Build.VERSION.SDK_INT >= 26) {
            C8151a.m33873n(new Exception("Create Notification returned null"));
        }
        Application application = getApplication();
        C13706o.m87927d(application, "null cannot be cast to non-null type com.arlosoft.macrodroid.app.MacroDroidApplication");
        ((MacroDroidApplication) application).mo27300y().mo27320b();
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        C4878b.m18879r("MacroDroid service task removed - attempting restart mechanism");
        try {
            Intent intent2 = new Intent(this, DummyActivity.class);
            intent2.addFlags(268435456);
            startActivity(intent2);
        } catch (Exception unused) {
        }
    }
}
