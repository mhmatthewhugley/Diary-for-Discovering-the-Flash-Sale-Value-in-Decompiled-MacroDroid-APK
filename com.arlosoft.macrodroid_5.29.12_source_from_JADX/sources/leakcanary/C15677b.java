package leakcanary;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13328m;
import p297ja.C13337s;
import p297ja.C13339u;
import p309kc.C13542a;
import p309kc.C13547c;
import p370qa.C16254a;
import p471qf.C17227a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\r"}, mo71668d2 = {"Lleakcanary/b;", "", "Landroid/app/Application;", "application", "Lja/u;", "c", "b", "(Landroid/app/Application;)V", "", "Z", "failedClearing", "<init>", "()V", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
/* renamed from: leakcanary.b */
/* compiled from: ViewLocationHolderLeakFix.kt */
public final class C15677b {

    /* renamed from: a */
    private static C13328m<? extends ViewGroup, ? extends ArrayList<View>> f64954a;

    /* renamed from: b */
    private static boolean f64955b;

    /* renamed from: c */
    public static final C15677b f64956c = new C15677b();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u000b\u001a\u00020\u00062\u0010\b\u0001\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\f\u001a\u00020\u00062\u0010\b\u0001\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00020\u0002H\u0001J-\u0010\u000e\u001a\u00020\u00062\u0010\b\u0001\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00020\u00022\u0010\b\u0001\u0010\r\u001a\n \t*\u0004\u0018\u00010\u00040\u0004H\u0001J\u001b\u0010\u000f\u001a\u00020\u00062\u0010\b\u0001\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\u0010\u001a\u00020\u00062\u0010\b\u0001\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00020\u0002H\u0001¨\u0006\u0011"}, mo71668d2 = {"leakcanary/b$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lja/u;", "onActivityCreated", "onActivityDestroyed", "kotlin.jvm.PlatformType", "p0", "onActivityPaused", "onActivityResumed", "p1", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.b$a */
    /* compiled from: ViewLocationHolderLeakFix.kt */
    public static final class C15678a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final /* synthetic */ Application.ActivityLifecycleCallbacks f64957a;

        /* renamed from: c */
        final /* synthetic */ Application f64958c;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "invoke", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.b$a$a */
        /* compiled from: ViewLocationHolderLeakFix.kt */
        static final class C15679a extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ C15678a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15679a(C15678a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            public final void invoke() {
                C15677b.f64956c.m94923c(this.this$0.f64958c);
            }
        }

        C15678a(Application application) {
            this.f64958c = application;
            Class<Application.ActivityLifecycleCallbacks> cls = Application.ActivityLifecycleCallbacks.class;
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, C13547c.f61822a);
            if (newProxyInstance != null) {
                this.f64957a = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C13706o.m87930g(activity, "activity");
            C13542a.m87344b(activity, new C15679a(this));
        }

        public void onActivityDestroyed(Activity activity) {
            C13706o.m87930g(activity, "activity");
            C15677b.f64956c.m94923c(this.f64958c);
        }

        public void onActivityPaused(@RecentlyNonNull Activity activity) {
            this.f64957a.onActivityPaused(activity);
        }

        public void onActivityResumed(@RecentlyNonNull Activity activity) {
            this.f64957a.onActivityResumed(activity);
        }

        public void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
            this.f64957a.onActivitySaveInstanceState(activity, bundle);
        }

        public void onActivityStarted(@RecentlyNonNull Activity activity) {
            this.f64957a.onActivityStarted(activity);
        }

        public void onActivityStopped(@RecentlyNonNull Activity activity) {
            this.f64957a.onActivityStopped(activity);
        }
    }

    private C15677b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m94923c(Application application) {
        if (!f64955b) {
            try {
                if (f64954a == null) {
                    FrameLayout frameLayout = new FrameLayout(application);
                    for (int i = 0; i < 32; i++) {
                        frameLayout.addView(new View(application));
                    }
                    f64954a = C13337s.m85692a(frameLayout, new ArrayList());
                }
                C13328m<? extends ViewGroup, ? extends ArrayList<View>> mVar = f64954a;
                if (mVar == null) {
                    C13706o.m87939p();
                }
                ((ViewGroup) mVar.mo70152a()).addChildrenForAccessibility((ArrayList) mVar.mo70153b());
            } catch (Throwable th) {
                C17227a.C17228a a = C17227a.f68788b.mo80524a();
                if (a != null) {
                    a.mo80525a(th, "Failed to clear ViewLocationHolder leak, will not try again.");
                }
                f64955b = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo75066b(Application application) {
        C13706o.m87930g(application, "application");
        if (Build.VERSION.SDK_INT == 28) {
            application.registerActivityLifecycleCallbacks(new C15678a(application));
        }
    }
}
