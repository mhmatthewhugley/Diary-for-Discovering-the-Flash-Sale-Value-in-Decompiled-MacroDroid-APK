package leakcanary;

import android.annotation.Nullable;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.os.UserManager;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13328m;
import p297ja.C13337s;
import p297ja.C13339u;
import p309kc.C13545b;
import p309kc.C13547c;
import p309kc.C13549d;
import p370qa.C16254a;
import p370qa.C16265l;
import p471qf.C17227a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H$R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, mo71668d2 = {"Lleakcanary/a;", "", "Landroid/app/Application;", "application", "Lja/u;", "f", "", "applied", "Z", "<init>", "(Ljava/lang/String;I)V", "H", "e", "MEDIA_SESSION_LEGACY_HELPER", "TEXT_LINE_POOL", "USER_MANAGER", "FLUSH_HANDLER_THREADS", "ACCESSIBILITY_NODE_INFO", "CONNECTIVITY_MANAGER", "SAMSUNG_CLIPBOARD_MANAGER", "BUBBLE_POPUP", "LAST_HOVERED_VIEW", "ACTIVITY_MANAGER", "VIEW_LOCATION_HOLDER", "IMM_FOCUSED_VIEW", "IMM_CUR_ROOT_VIEW", "SPELL_CHECKER", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
/* renamed from: leakcanary.a */
/* compiled from: AndroidLeakFixes.kt */
public enum C15635a {
    ;
    
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static final ScheduledExecutorService f64906G = null;

    /* renamed from: H */
    public static final C15645e f64907H = null;
    /* access modifiers changed from: private */
    public boolean applied;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$a;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$a */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15636a extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$a$a */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15637a implements Runnable {

            /* renamed from: a */
            public static final C15637a f64917a = null;

            static {
                f64917a = new C15637a();
            }

            C15637a() {
            }

            public final void run() {
                for (int i = 0; i < 50; i++) {
                    AccessibilityNodeInfo.obtain();
                }
            }
        }

        C15636a(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (Build.VERSION.SDK_INT < 28) {
                C15635a.f64906G.scheduleAtFixedRate(C15637a.f64917a, 5, 5, TimeUnit.SECONDS);
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$b;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$b */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15638b extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$b$a */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15639a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15638b f64918a;

            /* renamed from: c */
            final /* synthetic */ Application f64919c;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Landroid/app/Activity;", "activity", "Lja/u;", "a", "(Landroid/app/Activity;)V"}, mo71669k = 3, mo71670mv = {1, 4, 1})
            /* renamed from: leakcanary.a$b$a$a */
            /* compiled from: AndroidLeakFixes.kt */
            static final class C15640a extends C13708q implements C16265l<Activity, C13339u> {
                final /* synthetic */ Field $contextField;
                final /* synthetic */ C15639a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15640a(C15639a aVar, Field field) {
                    super(1);
                    this.this$0 = aVar;
                    this.$contextField = field;
                }

                /* renamed from: a */
                public final void mo75001a(Activity activity) {
                    C13706o.m87930g(activity, "activity");
                    try {
                        if (C13706o.m87924a(this.$contextField.get((Object) null), activity)) {
                            this.$contextField.set((Object) null, (Object) null);
                        }
                    } catch (Exception e) {
                        C17227a.C17228a a = C17227a.f68788b.mo80524a();
                        if (a != null) {
                            a.mo80525a(e, "Could not fix the " + this.this$0.f64918a.name() + " leak");
                        }
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo75001a((Activity) obj);
                    return C13339u.f61331a;
                }
            }

            C15639a(C15638b bVar, Application application) {
                this.f64918a = bVar;
                this.f64919c = application;
            }

            public final void run() {
                try {
                    Field declaredField = this.f64919c.getSystemService("activity").getClass().getDeclaredField("mContext");
                    C13706o.m87925b(declaredField, "application\n            …DeclaredField(\"mContext\")");
                    declaredField.setAccessible(true);
                    if ((declaredField.getModifiers() | 8) != declaredField.getModifiers()) {
                        C17227a.C17228a a = C17227a.f68788b.mo80524a();
                        if (a != null) {
                            a.mo80526b("Could not fix the " + this.f64918a.name() + " leak, contextField=" + declaredField);
                            return;
                        }
                        return;
                    }
                    C15635a.f64907H.mo75005g(this.f64919c, new C15640a(this, declaredField));
                } catch (Exception e) {
                    C17227a.C17228a a2 = C17227a.f68788b.mo80524a();
                    if (a2 != null) {
                        a2.mo80525a(e, "Could not fix the " + this.f64918a.name() + " leak");
                    }
                }
            }
        }

        C15638b(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (!(!C13706o.m87924a(Build.MANUFACTURER, "samsung")) && Build.VERSION.SDK_INT == 22) {
                C15635a.f64906G.execute(new C15639a(this, application));
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$c;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$c */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15641c extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$c$a */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15642a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15641c f64920a;

            /* renamed from: c */
            final /* synthetic */ Application f64921c;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Landroid/app/Activity;", "it", "Lja/u;", "a", "(Landroid/app/Activity;)V"}, mo71669k = 3, mo71670mv = {1, 4, 1})
            /* renamed from: leakcanary.a$c$a$a */
            /* compiled from: AndroidLeakFixes.kt */
            static final class C15643a extends C13708q implements C16265l<Activity, C13339u> {
                final /* synthetic */ Field $helperField;
                final /* synthetic */ C15642a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15643a(C15642a aVar, Field field) {
                    super(1);
                    this.this$0 = aVar;
                    this.$helperField = field;
                }

                /* renamed from: a */
                public final void mo75003a(Activity activity) {
                    C13706o.m87930g(activity, "it");
                    try {
                        this.$helperField.set((Object) null, (Object) null);
                    } catch (Exception e) {
                        C17227a.C17228a a = C17227a.f68788b.mo80524a();
                        if (a != null) {
                            a.mo80525a(e, "Could not fix the " + this.this$0.f64920a.name() + " leak");
                        }
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo75003a((Activity) obj);
                    return C13339u.f61331a;
                }
            }

            C15642a(C15641c cVar, Application application) {
                this.f64920a = cVar;
                this.f64921c = application;
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("android.widget.BubblePopupHelper");
                    C13706o.m87925b(cls, "Class.forName(\"android.widget.BubblePopupHelper\")");
                    Field declaredField = cls.getDeclaredField("sHelper");
                    C13706o.m87925b(declaredField, "helperClass.getDeclaredField(\"sHelper\")");
                    declaredField.setAccessible(true);
                    C15635a.f64907H.mo75005g(this.f64921c, new C15643a(this, declaredField));
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Could not fix the " + this.f64920a.name() + " leak");
                    }
                }
            }
        }

        C15641c(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (!(!C13706o.m87924a(Build.MANUFACTURER, "LGE")) && 21 >= Build.VERSION.SDK_INT) {
                C15635a.f64906G.execute(new C15642a(this, application));
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$d;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$d */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15644d extends C15635a {
        C15644d(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (Build.VERSION.SDK_INT <= 23) {
                try {
                    application.getSystemService("connectivity");
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Could not fix the " + name() + " leak");
                    }
                }
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001a\u0010\f\u001a\u00020\u0004*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u001a\u0010\u000f\u001a\u00020\u0004*\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H\u0002J\f\u0010\u0011\u001a\u00020\u0010*\u00020\nH\u0002J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J'\u0010\u001a\u001a\u00020\u0004*\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001c\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, mo71668d2 = {"Lleakcanary/a$e;", "", "Landroid/os/Handler;", "Lkotlin/Function0;", "Lja/u;", "onIdle", "j", "", "Landroid/os/HandlerThread;", "f", "Landroid/view/Window;", "callback", "i", "", "block", "h", "Lleakcanary/a$e$a;", "k", "Landroid/app/Application;", "application", "", "Lleakcanary/a;", "fixes", "d", "Lkotlin/Function1;", "Landroid/app/Activity;", "g", "(Landroid/app/Application;Lqa/l;)V", "", "LG", "Ljava/lang/String;", "SAMSUNG", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "backgroundExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "<init>", "()V", "a", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$e */
    /* compiled from: AndroidLeakFixes.kt */
    public static final class C15645e {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020\u0001¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0001J\u0019\u0010\n\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\t0\tH\u0001J\u0019\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\t0\tH\u0001J\u0019\u0010\r\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\f0\fH\u0001J\u0019\u0010\u000e\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0001J\u0019\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0001J\u0019\u0010\u0011\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00100\u0010H\u0001J\u0019\u0010\u0012\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00100\u0010H\u0001J\t\u0010\u0013\u001a\u00020\u0002H\u0001J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00142\u0010\b\u0001\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00150\u0015H\u0001J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u0014H\u0001J\t\u0010\u001a\u001a\u00020\u0002H\u0001J#\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00142\u0010\b\u0001\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u001b0\u001bH\u0001J#\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00142\u0010\b\u0001\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00150\u0015H\u0001J#\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00142\u0010\b\u0001\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00150\u0015H\u0001J5\u0010 \u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00142\u0010\b\u0001\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00180\u00182\u0010\b\u0001\u0010\u001f\u001a\n \u0005*\u0004\u0018\u00010\u00150\u0015H\u0001J\t\u0010!\u001a\u00020\u0007H\u0001J\u0019\u0010!\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\"0\"H\u0001J\u0019\u0010$\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010#0#H\u0001J\u0011\u0010%\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0001J\u001b\u0010'\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010&0&H\u0001J#\u0010'\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010&0&2\u0006\u0010\u0016\u001a\u00020\u0014H\u0001R#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070)0(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0014\u00100\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, mo71668d2 = {"Lleakcanary/a$e$a;", "Landroid/view/Window$Callback;", "Lja/u;", "onContentChanged", "Landroid/view/MotionEvent;", "kotlin.jvm.PlatformType", "p0", "", "dispatchGenericMotionEvent", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "dispatchKeyShortcutEvent", "Landroid/view/accessibility/AccessibilityEvent;", "dispatchPopulateAccessibilityEvent", "dispatchTouchEvent", "dispatchTrackballEvent", "Landroid/view/ActionMode;", "onActionModeFinished", "onActionModeStarted", "onAttachedToWindow", "", "Landroid/view/Menu;", "p1", "onCreatePanelMenu", "Landroid/view/View;", "onCreatePanelView", "onDetachedFromWindow", "Landroid/view/MenuItem;", "onMenuItemSelected", "onMenuOpened", "onPanelClosed", "p2", "onPreparePanel", "onSearchRequested", "Landroid/view/SearchEvent;", "Landroid/view/WindowManager$LayoutParams;", "onWindowAttributesChanged", "onWindowFocusChanged", "Landroid/view/ActionMode$Callback;", "onWindowStartingActionMode", "", "Lkotlin/Function0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "onContentChangedCallbacks", "c", "Landroid/view/Window$Callback;", "delegate", "<init>", "(Landroid/view/Window$Callback;)V", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$e$a */
        /* compiled from: AndroidLeakFixes.kt */
        private static final class C15646a implements Window.Callback {

            /* renamed from: a */
            private final List<C16254a<Boolean>> f64922a;

            /* renamed from: c */
            private final Window.Callback f64923c;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lkotlin/Function0;", "", "callback", "a", "(Lqa/a;)Z"}, mo71669k = 3, mo71670mv = {1, 4, 1})
            /* renamed from: leakcanary.a$e$a$a */
            /* compiled from: AndroidLeakFixes.kt */
            static final class C15647a extends C13708q implements C16265l<C16254a<? extends Boolean>, Boolean> {

                /* renamed from: a */
                public static final C15647a f64924a = null;

                static {
                    f64924a = new C15647a();
                }

                C15647a() {
                    super(1);
                }

                /* renamed from: a */
                public final boolean mo75030a(C16254a<Boolean> aVar) {
                    C13706o.m87930g(aVar, "callback");
                    return !aVar.invoke().booleanValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(mo75030a((C16254a) obj));
                }
            }

            public C15646a(Window.Callback callback) {
                C13706o.m87930g(callback, "delegate");
                this.f64923c = callback;
                this.f64922a = new ArrayList();
            }

            /* renamed from: a */
            public final List<C16254a<Boolean>> mo75006a() {
                return this.f64922a;
            }

            public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                return this.f64923c.dispatchGenericMotionEvent(motionEvent);
            }

            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                return this.f64923c.dispatchKeyEvent(keyEvent);
            }

            public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                return this.f64923c.dispatchKeyShortcutEvent(keyEvent);
            }

            public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                return this.f64923c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            }

            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return this.f64923c.dispatchTouchEvent(motionEvent);
            }

            public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                return this.f64923c.dispatchTrackballEvent(motionEvent);
            }

            public void onActionModeFinished(ActionMode actionMode) {
                this.f64923c.onActionModeFinished(actionMode);
            }

            public void onActionModeStarted(ActionMode actionMode) {
                this.f64923c.onActionModeStarted(actionMode);
            }

            public void onAttachedToWindow() {
                this.f64923c.onAttachedToWindow();
            }

            public void onContentChanged() {
                boolean unused = C13624y.m87795D(this.f64922a, C15647a.f64924a);
                this.f64923c.onContentChanged();
            }

            public boolean onCreatePanelMenu(int i, @RecentlyNonNull Menu menu) {
                return this.f64923c.onCreatePanelMenu(i, menu);
            }

            @Nullable
            public View onCreatePanelView(int i) {
                return this.f64923c.onCreatePanelView(i);
            }

            public void onDetachedFromWindow() {
                this.f64923c.onDetachedFromWindow();
            }

            public boolean onMenuItemSelected(int i, @RecentlyNonNull MenuItem menuItem) {
                return this.f64923c.onMenuItemSelected(i, menuItem);
            }

            public boolean onMenuOpened(int i, @RecentlyNonNull Menu menu) {
                return this.f64923c.onMenuOpened(i, menu);
            }

            public void onPanelClosed(int i, @RecentlyNonNull Menu menu) {
                this.f64923c.onPanelClosed(i, menu);
            }

            public boolean onPreparePanel(int i, @RecentlyNullable View view, @RecentlyNonNull Menu menu) {
                return this.f64923c.onPreparePanel(i, view, menu);
            }

            public boolean onSearchRequested() {
                return this.f64923c.onSearchRequested();
            }

            public boolean onSearchRequested(SearchEvent searchEvent) {
                return this.f64923c.onSearchRequested(searchEvent);
            }

            public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                this.f64923c.onWindowAttributesChanged(layoutParams);
            }

            public void onWindowFocusChanged(boolean z) {
                this.f64923c.onWindowFocusChanged(z);
            }

            @Nullable
            public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
                return this.f64923c.onWindowStartingActionMode(callback);
            }

            @Nullable
            public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
                return this.f64923c.onWindowStartingActionMode(callback, i);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\n\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u0010\b\u0001\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\b0\bH\u0001J\u001b\u0010\u000b\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\f\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0001J-\u0010\r\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u0010\b\u0001\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\b0\bH\u0001J\u001b\u0010\u000e\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\u000f\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0001¨\u0006\u0010"}, mo71668d2 = {"leakcanary/a$e$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Lja/u;", "onActivityDestroyed", "kotlin.jvm.PlatformType", "p0", "Landroid/os/Bundle;", "p1", "onActivityCreated", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$e$b */
        /* compiled from: AndroidLeakFixes.kt */
        public static final class C15648b implements Application.ActivityLifecycleCallbacks {

            /* renamed from: a */
            private final /* synthetic */ Application.ActivityLifecycleCallbacks f64925a;

            /* renamed from: c */
            final /* synthetic */ C16265l f64926c;

            C15648b(C16265l lVar) {
                this.f64926c = lVar;
                Class<Application.ActivityLifecycleCallbacks> cls = Application.ActivityLifecycleCallbacks.class;
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, C13547c.f61822a);
                if (newProxyInstance != null) {
                    this.f64925a = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
            }

            public void onActivityCreated(@RecentlyNonNull Activity activity, @RecentlyNullable Bundle bundle) {
                this.f64925a.onActivityCreated(activity, bundle);
            }

            public void onActivityDestroyed(Activity activity) {
                C13706o.m87930g(activity, "activity");
                this.f64926c.invoke(activity);
            }

            public void onActivityPaused(@RecentlyNonNull Activity activity) {
                this.f64925a.onActivityPaused(activity);
            }

            public void onActivityResumed(@RecentlyNonNull Activity activity) {
                this.f64925a.onActivityResumed(activity);
            }

            public void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
                this.f64925a.onActivitySaveInstanceState(activity, bundle);
            }

            public void onActivityStarted(@RecentlyNonNull Activity activity) {
                this.f64925a.onActivityStarted(activity);
            }

            public void onActivityStopped(@RecentlyNonNull Activity activity) {
                this.f64925a.onActivityStopped(activity);
            }
        }

        @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo71668d2 = {"<anonymous>", "", "invoke"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$e$c */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15649c extends C13708q implements C16254a<Boolean> {
            final /* synthetic */ C16254a $callback;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15649c(C16254a aVar) {
                super(0);
                this.$callback = aVar;
            }

            public final boolean invoke() {
                this.$callback.invoke();
                return false;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$e$d */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15650d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C16254a f64927a;

            @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo71668d2 = {"<anonymous>", "", "queueIdle"}, mo71669k = 3, mo71670mv = {1, 4, 1})
            /* renamed from: leakcanary.a$e$d$a */
            /* compiled from: AndroidLeakFixes.kt */
            static final class C15651a implements MessageQueue.IdleHandler {

                /* renamed from: a */
                final /* synthetic */ C15650d f64928a;

                C15651a(C15650d dVar) {
                    this.f64928a = dVar;
                }

                public final boolean queueIdle() {
                    this.f64928a.f64927a.invoke();
                    return true;
                }
            }

            C15650d(C16254a aVar) {
                this.f64927a = aVar;
            }

            public final void run() {
                Looper.myQueue().addIdleHandler(new C15651a(this));
            }
        }

        private C15645e() {
        }

        public /* synthetic */ C15645e(C13695i iVar) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ void m94899e(C15645e eVar, Application application, Set set, int i, Object obj) {
            if ((i & 2) != 0) {
                set = EnumSet.allOf(C15635a.class);
                C13706o.m87925b(set, "EnumSet.allOf(AndroidLeakFixes::class.java)");
            }
            eVar.mo75004d(application, set);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final List<HandlerThread> m94900f() {
            Thread[] threadArr;
            Thread currentThread = Thread.currentThread();
            C13706o.m87925b(currentThread, "Thread.currentThread()");
            ThreadGroup threadGroup = currentThread.getThreadGroup();
            if (threadGroup == null) {
                C13706o.m87939p();
            }
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
                C13706o.m87925b(threadGroup, "rootGroup.parent");
            }
            int activeCount = threadGroup.activeCount();
            while (true) {
                threadArr = new Thread[activeCount];
                if (threadGroup.enumerate(threadArr, true) != threadArr.length) {
                    break;
                }
                activeCount = threadArr.length * 2;
            }
            ArrayList arrayList = new ArrayList();
            for (Thread thread : threadArr) {
                HandlerThread handlerThread = thread instanceof HandlerThread ? (HandlerThread) thread : null;
                if (handlerThread != null) {
                    arrayList.add(handlerThread);
                }
            }
            return arrayList;
        }

        /* renamed from: h */
        private final void m94901h(Window window, C16254a<Boolean> aVar) {
            m94904k(window).mo75006a().add(aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final void m94902i(Window window, C16254a<C13339u> aVar) {
            if (window.peekDecorView() == null) {
                m94901h(window, new C15649c(aVar));
            } else {
                aVar.invoke();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final void m94903j(Handler handler, C16254a<C13339u> aVar) {
            try {
                handler.post(new C15650d(aVar));
            } catch (RuntimeException unused) {
            }
        }

        /* renamed from: k */
        private final C15646a m94904k(Window window) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof C15646a) {
                return (C15646a) callback;
            }
            C13706o.m87925b(callback, "currentCallback");
            C15646a aVar = new C15646a(callback);
            window.setCallback(aVar);
            return aVar;
        }

        /* renamed from: d */
        public final void mo75004d(Application application, Set<? extends C15635a> set) {
            C13706o.m87930g(application, "application");
            C13706o.m87930g(set, "fixes");
            C13545b.m87345a();
            for (C15635a aVar : set) {
                if (!aVar.applied) {
                    aVar.mo74998f(application);
                    aVar.applied = true;
                } else {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80526b(aVar.name() + " leak fix already applied.");
                    }
                }
            }
        }

        /* renamed from: g */
        public final void mo75005g(Application application, C16265l<? super Activity, C13339u> lVar) {
            C13706o.m87930g(application, "$this$onActivityDestroyed");
            C13706o.m87930g(lVar, "block");
            application.registerActivityLifecycleCallbacks(new C15648b(lVar));
        }
    }

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo71668d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Runnable;", "newThread"}, mo71669k = 3, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$f */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15652f implements ThreadFactory {

        /* renamed from: a */
        public static final C15652f f64929a = null;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"leakcanary/a$f$a", "Ljava/lang/Thread;", "Lja/u;", "run", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$f$a */
        /* compiled from: AndroidLeakFixes.kt */
        public static final class C15653a extends Thread {

            /* renamed from: a */
            final /* synthetic */ Runnable f64930a;

            C15653a(Runnable runnable) {
                this.f64930a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f64930a.run();
            }
        }

        static {
            f64929a = new C15652f();
        }

        C15652f() {
        }

        public final Thread newThread(Runnable runnable) {
            C15653a aVar = new C15653a(runnable);
            aVar.setName("plumber-android-leaks");
            return aVar;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$g;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$g */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15654g extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$g$a */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15655a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Set f64931a;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "invoke", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
            /* renamed from: leakcanary.a$g$a$a */
            /* compiled from: AndroidLeakFixes.kt */
            static final class C15656a extends C13708q implements C16254a<C13339u> {
                final /* synthetic */ Handler $flushHandler;
                final /* synthetic */ HandlerThread $handlerThread;
                final /* synthetic */ C13678a0 $scheduleFlush;

                @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
                /* renamed from: leakcanary.a$g$a$a$a */
                /* compiled from: AndroidLeakFixes.kt */
                static final class C15657a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C15656a f64932a;

                    C15657a(C15656a aVar) {
                        this.f64932a = aVar;
                    }

                    public final void run() {
                        this.f64932a.$scheduleFlush.element = true;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15656a(HandlerThread handlerThread, C13678a0 a0Var, Handler handler) {
                    super(0);
                    this.$handlerThread = handlerThread;
                    this.$scheduleFlush = a0Var;
                    this.$flushHandler = handler;
                }

                public final void invoke() {
                    C17227a.C17228a a;
                    if (this.$handlerThread.isAlive()) {
                        C13678a0 a0Var = this.$scheduleFlush;
                        if (a0Var.element) {
                            a0Var.element = false;
                            try {
                                if (!this.$flushHandler.postDelayed(new C15657a(this), 1000) && (a = C17227a.f68788b.mo80524a()) != null) {
                                    a.mo80526b("Failed to post to " + this.$handlerThread.getName());
                                }
                            } catch (RuntimeException e) {
                                C17227a.C17228a a2 = C17227a.f68788b.mo80524a();
                                if (a2 != null) {
                                    a2.mo80525a(e, "Failed to post to " + this.$handlerThread.getName());
                                }
                            }
                        }
                    }
                }
            }

            C15655a(Set set) {
                this.f64931a = set;
            }

            public final void run() {
                List<HandlerThread> a = C15635a.f64907H.m94900f();
                ArrayList<C13328m> arrayList = new ArrayList<>();
                for (HandlerThread handlerThread : a) {
                    int threadId = handlerThread.getThreadId();
                    C13328m a2 = (threadId == -1 || this.f64931a.contains(Integer.valueOf(threadId))) ? null : C13337s.m85692a(Integer.valueOf(threadId), handlerThread);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                Set set = this.f64931a;
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
                for (C13328m c : arrayList) {
                    arrayList2.add(Integer.valueOf(((Number) c.mo70154c()).intValue()));
                }
                boolean unused = C13624y.m87797z(set, arrayList2);
                ArrayList<HandlerThread> arrayList3 = new ArrayList<>(C13616u.m87774u(arrayList, 10));
                for (C13328m d : arrayList) {
                    arrayList3.add((HandlerThread) d.mo70155d());
                }
                for (HandlerThread handlerThread2 : arrayList3) {
                    C17227a.C17228a a3 = C17227a.f68788b.mo80524a();
                    if (a3 != null) {
                        a3.mo80526b("Setting up flushing for " + handlerThread2);
                    }
                    C13678a0 a0Var = new C13678a0();
                    a0Var.element = true;
                    Handler handler = new Handler(handlerThread2.getLooper());
                    C15635a.f64907H.m94903j(handler, new C15656a(handlerThread2, a0Var, handler));
                }
            }
        }

        C15654g(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            C15635a.f64906G.scheduleWithFixedDelay(new C15655a(new LinkedHashSet()), 2, 3, TimeUnit.SECONDS);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$h;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$h */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15658h extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\n\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u0010\b\u0001\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\b0\bH\u0001J\u001b\u0010\u000b\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\f\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0001J-\u0010\r\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00022\u0010\b\u0001\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\b0\bH\u0001J\u001b\u0010\u000e\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\u000f\u001a\u00020\u00042\u0010\b\u0001\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u0002H\u0001¨\u0006\u0010"}, mo71668d2 = {"leakcanary/a$h$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Lja/u;", "onActivityDestroyed", "kotlin.jvm.PlatformType", "p0", "Landroid/os/Bundle;", "p1", "onActivityCreated", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$h$a */
        /* compiled from: AndroidLeakFixes.kt */
        public static final class C15659a implements Application.ActivityLifecycleCallbacks {

            /* renamed from: a */
            private final /* synthetic */ Application.ActivityLifecycleCallbacks f64933a;

            /* renamed from: c */
            final /* synthetic */ Field f64934c;

            /* renamed from: d */
            final /* synthetic */ InputMethodManager f64935d;

            C15659a(Field field, InputMethodManager inputMethodManager) {
                this.f64934c = field;
                this.f64935d = inputMethodManager;
                Class<Application.ActivityLifecycleCallbacks> cls = Application.ActivityLifecycleCallbacks.class;
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, C13547c.f61822a);
                if (newProxyInstance != null) {
                    this.f64933a = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
            }

            public void onActivityCreated(@RecentlyNonNull Activity activity, @RecentlyNullable Bundle bundle) {
                this.f64933a.onActivityCreated(activity, bundle);
            }

            public void onActivityDestroyed(Activity activity) {
                C13706o.m87930g(activity, "activity");
                try {
                    View view = (View) this.f64934c.get(this.f64935d);
                    if (view != null && activity.getWindow() != null) {
                        Window window = activity.getWindow();
                        C13706o.m87925b(window, "activity.window");
                        if (window.getDecorView() == view) {
                            this.f64934c.set(this.f64935d, (Object) null);
                        }
                    }
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Could not update InputMethodManager.mCurRootView field");
                    }
                }
            }

            public void onActivityPaused(@RecentlyNonNull Activity activity) {
                this.f64933a.onActivityPaused(activity);
            }

            public void onActivityResumed(@RecentlyNonNull Activity activity) {
                this.f64933a.onActivityResumed(activity);
            }

            public void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
                this.f64933a.onActivitySaveInstanceState(activity, bundle);
            }

            public void onActivityStarted(@RecentlyNonNull Activity activity) {
                this.f64933a.onActivityStarted(activity);
            }

            public void onActivityStopped(@RecentlyNonNull Activity activity) {
                this.f64933a.onActivityStopped(activity);
            }
        }

        C15658h(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (Build.VERSION.SDK_INT < 29) {
                Object systemService = application.getSystemService("input_method");
                if (systemService != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    try {
                        Field declaredField = InputMethodManager.class.getDeclaredField("mCurRootView");
                        C13706o.m87925b(declaredField, "InputMethodManager::clas…aredField(\"mCurRootView\")");
                        declaredField.setAccessible(true);
                        application.registerActivityLifecycleCallbacks(new C15659a(declaredField, inputMethodManager));
                    } catch (Exception e) {
                        C17227a.C17228a a = C17227a.f68788b.mo80524a();
                        if (a != null) {
                            a.mo80525a(e, "Could not read InputMethodManager.mCurRootView field");
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0015¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$i;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$i */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15660i extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001b\u0010\n\u001a\u00020\u00062\u0010\b\u0001\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\u000b\u001a\u00020\u00062\u0010\b\u0001\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\f\u001a\u00020\u00062\u0010\b\u0001\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00020\u0002H\u0001J-\u0010\u000e\u001a\u00020\u00062\u0010\b\u0001\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00020\u00022\u0010\b\u0001\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00040\u0004H\u0001J\u001b\u0010\u000f\u001a\u00020\u00062\u0010\b\u0001\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00020\u0002H\u0001J\u001b\u0010\u0010\u001a\u00020\u00062\u0010\b\u0001\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00020\u0002H\u0001¨\u0006\u0011"}, mo71668d2 = {"leakcanary/a$i$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lja/u;", "onActivityCreated", "kotlin.jvm.PlatformType", "p0", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "p1", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$i$a */
        /* compiled from: AndroidLeakFixes.kt */
        public static final class C15661a implements Application.ActivityLifecycleCallbacks {

            /* renamed from: a */
            private final /* synthetic */ Application.ActivityLifecycleCallbacks f64936a;

            /* renamed from: c */
            final /* synthetic */ InputMethodManager f64937c;

            /* renamed from: d */
            final /* synthetic */ Field f64938d;

            /* renamed from: f */
            final /* synthetic */ Field f64939f;

            /* renamed from: g */
            final /* synthetic */ Method f64940g;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "invoke", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
            /* renamed from: leakcanary.a$i$a$a */
            /* compiled from: AndroidLeakFixes.kt */
            static final class C15662a extends C13708q implements C16254a<C13339u> {
                final /* synthetic */ Activity $activity;
                final /* synthetic */ C15661a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15662a(C15661a aVar, Activity activity) {
                    super(0);
                    this.this$0 = aVar;
                    this.$activity = activity;
                }

                public final void invoke() {
                    C15661a aVar = this.this$0;
                    C13549d dVar = new C13549d(aVar.f64937c, aVar.f64938d, aVar.f64939f, aVar.f64940g);
                    Window window = this.$activity.getWindow();
                    C13706o.m87925b(window, "activity.window");
                    View decorView = window.getDecorView();
                    C13706o.m87925b(decorView, "activity.window.decorView");
                    View rootView = decorView.getRootView();
                    C13706o.m87925b(rootView, "rootView");
                    rootView.getViewTreeObserver().addOnGlobalFocusChangeListener(dVar);
                }
            }

            C15661a(InputMethodManager inputMethodManager, Field field, Field field2, Method method) {
                this.f64937c = inputMethodManager;
                this.f64938d = field;
                this.f64939f = field2;
                this.f64940g = method;
                Class<Application.ActivityLifecycleCallbacks> cls = Application.ActivityLifecycleCallbacks.class;
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, C13547c.f61822a);
                if (newProxyInstance != null) {
                    this.f64936a = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                C13706o.m87930g(activity, "activity");
                C15645e eVar = C15635a.f64907H;
                Window window = activity.getWindow();
                C13706o.m87925b(window, "activity.window");
                eVar.m94902i(window, new C15662a(this, activity));
            }

            public void onActivityDestroyed(@RecentlyNonNull Activity activity) {
                this.f64936a.onActivityDestroyed(activity);
            }

            public void onActivityPaused(@RecentlyNonNull Activity activity) {
                this.f64936a.onActivityPaused(activity);
            }

            public void onActivityResumed(@RecentlyNonNull Activity activity) {
                this.f64936a.onActivityResumed(activity);
            }

            public void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
                this.f64936a.onActivitySaveInstanceState(activity, bundle);
            }

            public void onActivityStarted(@RecentlyNonNull Activity activity) {
                this.f64936a.onActivityStarted(activity);
            }

            public void onActivityStopped(@RecentlyNonNull Activity activity) {
                this.f64936a.onActivityStopped(activity);
            }
        }

        C15660i(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (Build.VERSION.SDK_INT <= 23) {
                Object systemService = application.getSystemService("input_method");
                if (systemService != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    try {
                        Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                        C13706o.m87925b(declaredField, "InputMethodManager::clas…laredField(\"mServedView\")");
                        declaredField.setAccessible(true);
                        Field declaredField2 = InputMethodManager.class.getDeclaredField("mH");
                        C13706o.m87925b(declaredField2, "InputMethodManager::clas…va.getDeclaredField(\"mH\")");
                        declaredField2.setAccessible(true);
                        Method declaredMethod = InputMethodManager.class.getDeclaredMethod("finishInputLocked", new Class[0]);
                        C13706o.m87925b(declaredMethod, "InputMethodManager::clas…thod(\"finishInputLocked\")");
                        declaredMethod.setAccessible(true);
                        Method declaredMethod2 = InputMethodManager.class.getDeclaredMethod("focusIn", new Class[]{View.class});
                        C13706o.m87925b(declaredMethod2, "InputMethodManager::clas…iew::class.java\n        )");
                        declaredMethod2.setAccessible(true);
                        application.registerActivityLifecycleCallbacks(new C15661a(inputMethodManager, declaredField2, declaredField, declaredMethod));
                    } catch (Exception e) {
                        C17227a.C17228a a = C17227a.f68788b.mo80524a();
                        if (a != null) {
                            a.mo80525a(e, "Could not fix the " + name() + " leak");
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$j;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$j */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15663j extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$j$a */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15664a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15663j f64941a;

            /* renamed from: c */
            final /* synthetic */ Application f64942c;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Landroid/app/Activity;", "it", "Lja/u;", "a", "(Landroid/app/Activity;)V"}, mo71669k = 3, mo71670mv = {1, 4, 1})
            /* renamed from: leakcanary.a$j$a$a */
            /* compiled from: AndroidLeakFixes.kt */
            static final class C15665a extends C13708q implements C16265l<Activity, C13339u> {
                final /* synthetic */ Field $field;
                final /* synthetic */ C15664a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15665a(C15664a aVar, Field field) {
                    super(1);
                    this.this$0 = aVar;
                    this.$field = field;
                }

                /* renamed from: a */
                public final void mo75059a(Activity activity) {
                    C13706o.m87930g(activity, "it");
                    try {
                        this.$field.set((Object) null, (Object) null);
                    } catch (Exception e) {
                        C17227a.C17228a a = C17227a.f68788b.mo80524a();
                        if (a != null) {
                            a.mo80525a(e, "Could not fix the " + this.this$0.f64941a.name() + " leak");
                        }
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo75059a((Activity) obj);
                    return C13339u.f61331a;
                }
            }

            C15664a(C15663j jVar, Application application) {
                this.f64941a = jVar;
                this.f64942c = application;
            }

            public final void run() {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mLastHoveredView");
                    C13706o.m87925b(declaredField, "TextView::class.java.get…Field(\"mLastHoveredView\")");
                    declaredField.setAccessible(true);
                    C15635a.f64907H.mo75005g(this.f64942c, new C15665a(this, declaredField));
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Could not fix the " + this.f64941a.name() + " leak");
                    }
                }
            }
        }

        C15663j(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (!(!C13706o.m87924a(Build.MANUFACTURER, "samsung")) && 21 >= Build.VERSION.SDK_INT) {
                C15635a.f64906G.execute(new C15664a(this, application));
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$k;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$k */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15666k extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$k$a */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15667a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15666k f64943a;

            /* renamed from: c */
            final /* synthetic */ Application f64944c;

            C15667a(C15666k kVar, Application application) {
                this.f64943a = kVar;
                this.f64944c = application;
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("android.media.session.MediaSessionLegacyHelper");
                    C13706o.m87925b(cls, "Class.forName(\"android.m…ediaSessionLegacyHelper\")");
                    Method declaredMethod = cls.getDeclaredMethod("getHelper", new Class[]{Context.class});
                    C13706o.m87925b(declaredMethod, "clazz.getDeclaredMethod(…er\", Context::class.java)");
                    declaredMethod.invoke((Object) null, new Object[]{this.f64944c});
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Could not fix the " + this.f64943a.name() + " leak");
                    }
                }
            }
        }

        C15666k(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (Build.VERSION.SDK_INT == 21) {
                C15635a.f64906G.execute(new C15667a(this, application));
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$l;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$l */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15668l extends C15635a {
        C15668l(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (!(!C13706o.m87924a(Build.MANUFACTURER, "samsung")) && 21 >= Build.VERSION.SDK_INT) {
                try {
                    Class<?> cls = Class.forName("android.sec.clipboard.ClipboardUIManager");
                    C13706o.m87925b(cls, "Class.forName(\"android.s…oard.ClipboardUIManager\")");
                    Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[]{Context.class});
                    C13706o.m87925b(declaredMethod, "managerClass.getDeclared…ce\", Context::class.java)");
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke((Object) null, new Object[]{application});
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Could not fix the " + name() + " leak");
                    }
                }
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0015¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$m;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$m */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15669m extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo71668d2 = {"", "<anonymous parameter 0>", "Ljava/lang/reflect/Method;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Lja/u;", "a", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$m$a */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15670a implements InvocationHandler {

            /* renamed from: a */
            public static final C15670a f64945a = null;

            static {
                f64945a = new C15670a();
            }

            C15670a() {
            }

            /* renamed from: a */
            public final void mo75061a(Object obj, Method method, Object[] objArr) {
                C13706o.m87930g(obj, "<anonymous parameter 0>");
                C13706o.m87930g(method, "<anonymous parameter 1>");
                C17227a.C17228a a = C17227a.f68788b.mo80524a();
                if (a != null) {
                    a.mo80526b("Received call to no-op SpellCheckerSessionListener after session closed");
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
                mo75061a(obj, method, objArr);
                return C13339u.f61331a;
            }
        }

        @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, mo71668d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$m$b */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15671b implements InvocationHandler {

            /* renamed from: a */
            final /* synthetic */ Field f64946a;

            /* renamed from: b */
            final /* synthetic */ Field f64947b;

            /* renamed from: c */
            final /* synthetic */ Map f64948c;

            /* renamed from: d */
            final /* synthetic */ Object f64949d;

            /* renamed from: e */
            final /* synthetic */ Field f64950e;

            /* renamed from: f */
            final /* synthetic */ Object f64951f;

            C15671b(Field field, Field field2, Map map, Object obj, Field field3, Object obj2) {
                this.f64946a = field;
                this.f64947b = field2;
                this.f64948c = map;
                this.f64949d = obj;
                this.f64950e = field3;
                this.f64951f = obj2;
            }

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                C13706o.m87930g(obj, "<anonymous parameter 0>");
                C13706o.m87930g(method, "method");
                try {
                    if (C13706o.m87924a(method.getName(), "getSpellCheckerService")) {
                        if (objArr == null) {
                            C13706o.m87939p();
                        }
                        Object obj2 = objArr[3];
                        Object obj3 = this.f64946a.get(obj2);
                        if (obj3 == null) {
                            C13706o.m87939p();
                        }
                        Object obj4 = this.f64947b.get(obj3);
                        if (obj4 == null) {
                            C13706o.m87939p();
                        }
                        this.f64948c.put(obj2, obj4);
                    } else if (C13706o.m87924a(method.getName(), "finishSpellCheckerService")) {
                        if (objArr == null) {
                            C13706o.m87939p();
                        }
                        Object remove = this.f64948c.remove(objArr[0]);
                        if (remove == null) {
                            C13706o.m87939p();
                        }
                        this.f64950e.set(remove, this.f64949d);
                    }
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Unable to fix SpellChecker leak");
                    }
                }
                if (objArr == null) {
                    return method.invoke(this.f64951f, new Object[0]);
                }
                try {
                    return method.invoke(this.f64951f, Arrays.copyOf(objArr, objArr.length));
                } catch (InvocationTargetException e2) {
                    Throwable targetException = e2.getTargetException();
                    C13706o.m87925b(targetException, "invocationException.targetException");
                    throw targetException;
                }
            }
        }

        C15669m(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (Build.VERSION.SDK_INT == 23) {
                Class<TextServicesManager> cls = TextServicesManager.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
                    C13706o.m87925b(declaredMethod, "textServiceClass.getDeclaredMethod(\"getInstance\")");
                    Field declaredField = cls.getDeclaredField("sService");
                    C13706o.m87925b(declaredField, "textServiceClass.getDeclaredField(\"sService\")");
                    declaredField.setAccessible(true);
                    Class<?> cls2 = Class.forName("com.android.internal.textservice.ITextServicesManager");
                    C13706o.m87925b(cls2, "Class.forName(\"com.andro…ce.ITextServicesManager\")");
                    Class<?> cls3 = Class.forName("android.view.textservice.SpellCheckerSession");
                    C13706o.m87925b(cls3, "Class.forName(\"android.v…ice.SpellCheckerSession\")");
                    Field declaredField2 = cls3.getDeclaredField("mSpellCheckerSessionListener");
                    C13706o.m87925b(declaredField2, "spellCheckSessionClass.g…lCheckerSessionListener\")");
                    declaredField2.setAccessible(true);
                    Class<?> cls4 = Class.forName("android.view.textservice.SpellCheckerSession$SpellCheckerSessionListenerImpl");
                    C13706o.m87925b(cls4, "Class.forName(\n         …ListenerImpl\"\n          )");
                    Field declaredField3 = cls4.getDeclaredField("mHandler");
                    C13706o.m87925b(declaredField3, "spellCheckerSessionListe…DeclaredField(\"mHandler\")");
                    declaredField3.setAccessible(true);
                    Class<?> cls5 = Class.forName("android.view.textservice.SpellCheckerSession$1");
                    C13706o.m87925b(cls5, "Class.forName(\"android.v….SpellCheckerSession\\$1\")");
                    Field declaredField4 = cls5.getDeclaredField("this$0");
                    C13706o.m87925b(declaredField4, "spellCheckSessionHandler…etDeclaredField(\"this$0\")");
                    declaredField4.setAccessible(true);
                    Class<?> cls6 = Class.forName("android.view.textservice.SpellCheckerSession$SpellCheckerSessionListener");
                    C13706o.m87925b(cls6, "Class.forName(\"android.v…lCheckerSessionListener\")");
                    Object newProxyInstance = Proxy.newProxyInstance(cls6.getClassLoader(), new Class[]{cls6}, C15670a.f64945a);
                    C13706o.m87925b(newProxyInstance, "Proxy.newProxyInstance(\n…ssion closed\" }\n        }");
                    declaredMethod.invoke((Object) null, new Object[0]);
                    Object obj = declaredField.get((Object) null);
                    if (obj == null) {
                        C13706o.m87939p();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Object newProxyInstance2 = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new C15671b(declaredField3, declaredField4, linkedHashMap, newProxyInstance, declaredField2, obj));
                    C13706o.m87925b(newProxyInstance2, "Proxy.newProxyInstance(\n…ion\n          }\n        }");
                    declaredField.set((Object) null, newProxyInstance2);
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Unable to fix SpellChecker leak");
                    }
                }
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$n;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$n */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15672n extends C15635a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 1})
        /* renamed from: leakcanary.a$n$a */
        /* compiled from: AndroidLeakFixes.kt */
        static final class C15673a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15672n f64952a;

            /* renamed from: c */
            final /* synthetic */ Application f64953c;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Landroid/app/Activity;", "it", "Lja/u;", "a", "(Landroid/app/Activity;)V"}, mo71669k = 3, mo71670mv = {1, 4, 1})
            /* renamed from: leakcanary.a$n$a$a */
            /* compiled from: AndroidLeakFixes.kt */
            static final class C15674a extends C13708q implements C16265l<Activity, C13339u> {
                final /* synthetic */ Object $sCached;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C15674a(Object obj) {
                    super(1);
                    this.$sCached = obj;
                }

                /* renamed from: a */
                public final void mo75065a(Activity activity) {
                    C13706o.m87930g(activity, "it");
                    synchronized (this.$sCached) {
                        int length = Array.getLength(this.$sCached);
                        for (int i = 0; i < length; i++) {
                            Array.set(this.$sCached, i, (Object) null);
                        }
                        C13339u uVar = C13339u.f61331a;
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo75065a((Activity) obj);
                    return C13339u.f61331a;
                }
            }

            C15673a(C15672n nVar, Application application) {
                this.f64952a = nVar;
                this.f64953c = application;
            }

            public final void run() {
                try {
                    Class<?> cls = Class.forName("android.text.TextLine");
                    C13706o.m87925b(cls, "Class.forName(\"android.text.TextLine\")");
                    Field declaredField = cls.getDeclaredField("sCached");
                    C13706o.m87925b(declaredField, "textLineClass.getDeclaredField(\"sCached\")");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get((Object) null);
                    if (obj == null || !obj.getClass().isArray()) {
                        C17227a.C17228a a = C17227a.f68788b.mo80524a();
                        if (a != null) {
                            a.mo80526b("Could not fix the " + this.f64952a.name() + " leak, sCached=" + obj);
                            return;
                        }
                        return;
                    }
                    C15635a.f64907H.mo75005g(this.f64953c, new C15674a(obj));
                } catch (Exception e) {
                    C17227a.C17228a a2 = C17227a.f68788b.mo80524a();
                    if (a2 != null) {
                        a2.mo80525a(e, "Could not fix the " + this.f64952a.name() + " leak");
                    }
                }
            }
        }

        C15672n(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (Build.VERSION.SDK_INT < 28) {
                C15635a.f64906G.execute(new C15673a(this, application));
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0015¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$o;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$o */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15675o extends C15635a {
        C15675o(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            if (25 >= Build.VERSION.SDK_INT) {
                try {
                    Method declaredMethod = UserManager.class.getDeclaredMethod("get", new Class[]{Context.class});
                    C13706o.m87925b(declaredMethod, "UserManager::class.java.…et\", Context::class.java)");
                    declaredMethod.invoke((Object) null, new Object[]{application});
                } catch (Exception e) {
                    C17227a.C17228a a = C17227a.f68788b.mo80524a();
                    if (a != null) {
                        a.mo80525a(e, "Could not fix the " + name() + " leak");
                    }
                }
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, mo71668d2 = {"Lleakcanary/a$p;", "Lleakcanary/a;", "Landroid/app/Application;", "application", "Lja/u;", "f", "plumber-android_release"}, mo71669k = 1, mo71670mv = {1, 4, 1})
    /* renamed from: leakcanary.a$p */
    /* compiled from: AndroidLeakFixes.kt */
    static final class C15676p extends C15635a {
        C15676p(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo74998f(Application application) {
            C13706o.m87930g(application, "application");
            C15677b.f64956c.mo75066b(application);
        }
    }

    static {
        f64907H = new C15645e((C13695i) null);
        f64906G = Executors.newSingleThreadScheduledExecutor(C15652f.f64929a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo74998f(Application application);
}
