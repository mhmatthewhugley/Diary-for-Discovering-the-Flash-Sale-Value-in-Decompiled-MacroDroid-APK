package dev.skomlach.common.contextprovider;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.p007os.ConfigurationCompat;
import androidx.core.p007os.LocaleListCompat;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p240d9.C11966a;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002R$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\f0\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001fR(\u0010\"\u001a\u0004\u0018\u00010\r2\b\u0010!\u001a\u0004\u0018\u00010\r8F@BX\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, mo71668d2 = {"Ldev/skomlach/common/contextprovider/a;", "", "Landroid/content/Context;", "i", "Lja/u;", "l", "context", "e", "", "path", "k", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/lang/ref/Reference;", "Landroid/content/res/Configuration;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "configurationRelay", "Landroid/app/Activity;", "c", "activityResumedRelay", "Ljava/util/concurrent/locks/ReentrantLock;", "d", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Landroid/app/Application;", "appRef", "f", "Landroid/app/Application;", "getAppInstance", "()Landroid/app/Application;", "appInstance", "()Landroid/app/Activity;", "activity", "<set-?>", "configuration", "Landroid/content/res/Configuration;", "h", "()Landroid/content/res/Configuration;", "g", "()Landroid/content/Context;", "appContext", "Ljava/util/Locale;", "j", "()Ljava/util/Locale;", "locale", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.common.contextprovider.a */
/* compiled from: AndroidContext.kt */
public final class C12104a {

    /* renamed from: a */
    public static final C12104a f58372a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicReference<Reference<Configuration>> f58373b = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicReference<Reference<Activity>> f58374c = new AtomicReference<>((Object) null);

    /* renamed from: d */
    private static final ReentrantLock f58375d = new ReentrantLock();

    /* renamed from: e */
    private static AtomicReference<Reference<Application>> f58376e;

    /* renamed from: f */
    private static final Application f58377f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "dev.skomlach.common.contextprovider.AndroidContext$appContext$2$1", mo71894f = "AndroidContext.kt", mo71895l = {}, mo71896m = "invokeSuspend")
    /* renamed from: dev.skomlach.common.contextprovider.a$a */
    /* compiled from: AndroidContext.kt */
    static final class C12105a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Context $it;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12105a(Context context, C13635d<? super C12105a> dVar) {
            super(2, dVar);
            this.$it = context;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C12105a(this.$it, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C12105a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C12104a.f58372a.m82565e(this.$it);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "dev.skomlach.common.contextprovider.AndroidContext$appContext$3", mo71894f = "AndroidContext.kt", mo71895l = {78}, mo71896m = "invokeSuspend")
    /* renamed from: dev.skomlach.common.contextprovider.a$b */
    /* compiled from: AndroidContext.kt */
    static final class C12106b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        @C13658f(mo71893c = "dev.skomlach.common.contextprovider.AndroidContext$appContext$3$1", mo71894f = "AndroidContext.kt", mo71895l = {}, mo71896m = "invokeSuspend")
        /* renamed from: dev.skomlach.common.contextprovider.a$b$a */
        /* compiled from: AndroidContext.kt */
        static final class C12107a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;

            C12107a(C13635d<? super C12107a> dVar) {
                super(2, dVar);
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C12107a(dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C12107a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C12104a.f58372a.m82568l();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C12106b(C13635d<? super C12106b> dVar) {
            super(2, dVar);
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C12106b(dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C12106b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15423h2 c2 = C15186a1.m93731c();
                C12107a aVar = new C12107a((C13635d<? super C12107a>) null);
                this.label = 1;
                if (C15414h.m94298g(c2, aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    @C13658f(mo71893c = "dev.skomlach.common.contextprovider.AndroidContext$appContext$4$1", mo71894f = "AndroidContext.kt", mo71895l = {}, mo71896m = "invokeSuspend")
    /* renamed from: dev.skomlach.common.contextprovider.a$c */
    /* compiled from: AndroidContext.kt */
    static final class C12108c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Context $it;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12108c(Context context, C13635d<? super C12108c> dVar) {
            super(2, dVar);
            this.$it = context;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C12108c(this.$it, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C12108c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C12104a.f58372a.m82565e(this.$it);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo71668d2 = {"dev/skomlach/common/contextprovider/a$d", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lja/u;", "onConfigurationChanged", "onLowMemory", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: dev.skomlach.common.contextprovider.a$d */
    /* compiled from: AndroidContext.kt */
    public static final class C12109d implements ComponentCallbacks {
        C12109d() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            C13706o.m87929f(configuration, "newConfig");
            C11966a aVar = C11966a.f58161a;
            aVar.mo67380c("AndroidContext", "onConfigurationChanged " + configuration);
            C12104a.f58373b.set(new SoftReference(configuration));
        }

        public void onLowMemory() {
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, mo71668d2 = {"dev/skomlach/common/contextprovider/a$e", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lja/u;", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: dev.skomlach.common.contextprovider.a$e */
    /* compiled from: AndroidContext.kt */
    public static final class C12110e implements Application.ActivityLifecycleCallbacks {
        C12110e() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C13706o.m87929f(activity, "activity");
            C11966a aVar = C11966a.f58161a;
            Configuration configuration = activity.getResources().getConfiguration();
            aVar.mo67380c("AndroidContext", "onConfigurationChanged " + configuration);
            C12104a.f58374c.set(new SoftReference(activity));
            C12104a.f58373b.set(new SoftReference(activity.getResources().getConfiguration()));
        }

        public void onActivityDestroyed(Activity activity) {
            C13706o.m87929f(activity, "activity");
            if (C13706o.m87924a(activity, C12104a.f58372a.mo68282f())) {
                C12104a.f58374c.set((Object) null);
            }
        }

        public void onActivityPaused(Activity activity) {
            C13706o.m87929f(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            C13706o.m87929f(activity, "activity");
            C12104a.f58374c.set(new SoftReference(activity));
            C12104a.f58373b.set(new SoftReference(activity.getResources().getConfiguration()));
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C13706o.m87929f(activity, "activity");
            C13706o.m87929f(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            C13706o.m87929f(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            C13706o.m87929f(activity, "activity");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.app.Application} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            dev.skomlach.common.contextprovider.a r0 = new dev.skomlach.common.contextprovider.a
            r0.<init>()
            f58372a = r0
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r1.<init>(r2)
            f58373b = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r2)
            f58374c = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            f58375d = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r2)
            f58376e = r1
            java.lang.Object r1 = r1.get()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r1.get()
            r2 = r1
            android.app.Application r2 = (android.app.Application) r2
        L_0x0033:
            f58377f = r2
            android.content.Context r0 = r0.mo68283g()
            d9.a r1 = p240d9.C11966a.f58161a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = r0.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Pkg "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2[r3] = r0
            r1.mo67380c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.common.contextprovider.C12104a.<clinit>():void");
    }

    private C12104a() {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m82565e(Context context) {
        try {
            String str = context.getApplicationInfo().dataDir;
            C13706o.m87928e(str, "context.applicationInfo.dataDir");
            m82567k(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private final Context m82566i() {
        Application application;
        try {
            Reference reference = f58376e.get();
            if (reference == null || (application = (Application) reference.get()) == null) {
                return null;
            }
            return C12111b.m82574b(application);
        } catch (Throwable unused) {
            Reference reference2 = f58376e.get();
            if (reference2 != null) {
                return (Application) reference2.get();
            }
            return null;
        }
    }

    /* renamed from: k */
    private final void m82567k(String str) throws IOException {
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod("setPermissions", new Class[]{String.class, cls2, cls2, cls2}).invoke((Object) null, new Object[]{str, 448, -1, -1});
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) invoke).intValue();
            if (intValue != 0) {
                throw new IOException("setPermissions failed with error code " + intValue);
            }
        } catch (Exception e) {
            throw new IOException("Failed to set permissions: " + e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m82568l() {
        Application application;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            AtomicReference<Reference<Application>> atomicReference = f58376e;
            Application application2 = null;
            try {
                Object invoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, new Object[0]);
                C13706o.m87927d(invoke, "null cannot be cast to non-null type android.app.Application");
                application = (Application) invoke;
            } catch (Throwable unused) {
                application = null;
            }
            if (application != null) {
                f58373b.set(new SoftReference(application.getResources().getConfiguration()));
                application.registerComponentCallbacks(new C12109d());
                application.registerActivityLifecycleCallbacks(new C12110e());
                application2 = application;
            }
            atomicReference.set(new SoftReference(application2));
            return;
        }
        throw new IllegalThreadStateException("Main thread required for correct init");
    }

    /* renamed from: f */
    public final Activity mo68282f() {
        try {
            Reference reference = f58374c.get();
            if (reference != null) {
                return (Activity) reference.get();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final Context mo68283g() {
        try {
            ReentrantLock reentrantLock = f58375d;
            C13329n.C13330a aVar = C13329n.f61327a;
            reentrantLock.lock();
            C13329n.m85676a(C13339u.f61331a);
        } catch (Throwable th) {
            ReentrantLock reentrantLock2 = f58375d;
            try {
                C13329n.C13330a aVar2 = C13329n.f61327a;
                reentrantLock2.unlock();
                C13329n.m85676a(C13339u.f61331a);
            } catch (Throwable th2) {
                C13329n.C13330a aVar3 = C13329n.f61327a;
                C13329n.m85676a(C13332o.m85684a(th2));
            }
            throw th;
        }
        Context i = m82566i();
        if (i != null) {
            C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C12105a(i, (C13635d<? super C12105a>) null), 2, (Object) null);
        } else {
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                Object unused2 = C15424i.m94328b((C13640g) null, new C12106b((C13635d<? super C12106b>) null), 1, (Object) null);
            } else {
                m82568l();
            }
            i = m82566i();
            if (i != null) {
                C15561w1 unused3 = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C12108c(i, (C13635d<? super C12108c>) null), 2, (Object) null);
            } else {
                throw new RuntimeException("Application is NULL");
            }
        }
        ReentrantLock reentrantLock3 = f58375d;
        C13329n.C13330a aVar4 = C13329n.f61327a;
        reentrantLock3.unlock();
        C13329n.m85676a(C13339u.f61331a);
        return i;
    }

    /* renamed from: h */
    public final Configuration mo68284h() {
        Reference reference = f58373b.get();
        if (reference != null) {
            return (Configuration) reference.get();
        }
        return null;
    }

    /* renamed from: j */
    public final Locale mo68285j() {
        Configuration h = mo68284h();
        if (h == null) {
            Locale locale = Locale.getDefault();
            C13706o.m87928e(locale, "getDefault()");
            return locale;
        }
        LocaleListCompat locales = ConfigurationCompat.getLocales(h);
        C13706o.m87928e(locales, "getLocales(\n            …etDefault()\n            )");
        Locale locale2 = !locales.isEmpty() ? locales.get(0) : Locale.getDefault();
        if (locale2 != null) {
            return locale2;
        }
        Locale locale3 = Locale.getDefault();
        C13706o.m87928e(locale3, "getDefault()");
        return locale3;
    }
}
