package p250e9;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.collection.LruCache;
import androidx.window.WindowHelper;
import dev.skomlach.common.R$bool;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12112a;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p240d9.C11966a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0006\u0010\n\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011¨\u0006#"}, mo71668d2 = {"Le9/a;", "", "", "b", "msg", "Ljava/lang/StringBuilder;", "sb", "Lja/u;", "l", "i", "k", "Landroid/app/Activity;", "c", "()Landroid/app/Activity;", "activity", "", "d", "()I", "navigationBarHeight", "e", "navigationBarWidth", "h", "statusBarHeight", "Landroid/graphics/Point;", "f", "()Landroid/graphics/Point;", "realScreenSize", "j", "()Z", "isInMultiWindow", "g", "screenOrientation", "<init>", "()V", "a", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: e9.a */
/* compiled from: MultiWindowSupport.kt */
public final class C12175a {

    /* renamed from: a */
    public static final C12176a f58613a = new C12176a((C13695i) null);

    /* renamed from: b */
    private static final LruCache<Configuration, Point> f58614b = new LruCache<>(1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Context f58615c = C12104a.f58372a.mo68283g();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo71668d2 = {"Le9/a$a;", "", "", "b", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "a", "()Landroid/content/Context;", "Landroidx/collection/LruCache;", "Landroid/content/res/Configuration;", "Landroid/graphics/Point;", "realScreenSize", "Landroidx/collection/LruCache;", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: e9.a$a */
    /* compiled from: MultiWindowSupport.kt */
    public static final class C12176a {
        private C12176a() {
        }

        public /* synthetic */ C12176a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Context mo68459a() {
            return C12175a.f58615c;
        }

        /* renamed from: b */
        public final boolean mo68460b() {
            Resources resources = mo68459a().getResources();
            Configuration h = C12104a.f58372a.mo68284h();
            if (h == null) {
                h = resources.getConfiguration();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                resources = mo68459a().createConfigurationContext(h).getResources();
            } else {
                resources.updateConfiguration(h, resources.getDisplayMetrics());
            }
            return resources.getBoolean(R$bool.biometric_compat_is_tablet);
        }
    }

    /* renamed from: b */
    private final boolean m82830b() {
        Rect rect = new Rect();
        ViewGroup viewGroup = (ViewGroup) m82831c().findViewById(16908290);
        viewGroup.getGlobalVisibleRect(rect);
        if (rect.width() == 0 && rect.height() == 0) {
            return false;
        }
        Point f = m82834f();
        int h = m82835h();
        int d = m82832d();
        int e = m82833e();
        int height = ((f.y - rect.height()) - h) - d;
        int width = f.x - rect.width();
        if ((!f58613a.mo68460b()) && mo68456g() == 2) {
            height += d;
            width -= e;
        }
        boolean z = (height == 0 && width == 0) ? false : true;
        viewGroup.getLocationOnScreen(new int[2]);
        StringBuilder sb = new StringBuilder();
        String simpleName = m82831c().getClass().getSimpleName();
        sb.append(simpleName + " Activity screen:");
        m82837l("isMultiWindow " + z, sb);
        m82837l("final " + width + "x" + height, sb);
        m82837l("NavBarW/H " + e + "x" + d, sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("statusBarH ");
        sb2.append(h);
        m82837l(sb2.toString(), sb);
        m82837l("View " + rect, sb);
        m82837l("realScreenSize " + f, sb);
        C11966a.f58161a.mo67380c(sb.toString());
        return z;
    }

    /* renamed from: c */
    private final Activity m82831c() {
        Activity f = C12104a.f58372a.mo68282f();
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("No activity on screen");
    }

    /* renamed from: d */
    private final int m82832d() {
        int i;
        if (!m82836i()) {
            return 0;
        }
        Resources resources = m82831c().getResources();
        int g = mo68456g();
        String str = "navigation_bar_height";
        if (!(!f58613a.mo68460b())) {
            if (g != 1) {
                str = "navigation_bar_height_landscape";
            }
            i = resources.getIdentifier(str, "dimen", "android");
        } else {
            if (g != 1) {
                str = "navigation_bar_width";
            }
            i = resources.getIdentifier(str, "dimen", "android");
        }
        if (i > 0) {
            return resources.getDimensionPixelSize(i);
        }
        return 0;
    }

    /* renamed from: e */
    private final int m82833e() {
        int i;
        if (!m82836i()) {
            return 0;
        }
        Resources resources = m82831c().getResources();
        int g = mo68456g();
        String str = "navigation_bar_height";
        if (!(!f58613a.mo68460b())) {
            if (g == 1) {
                str = "navigation_bar_height_landscape";
            }
            i = resources.getIdentifier(str, "dimen", "android");
        } else {
            if (g == 1) {
                str = "navigation_bar_width";
            }
            i = resources.getIdentifier(str, "dimen", "android");
        }
        if (i > 0) {
            return resources.getDimensionPixelSize(i);
        }
        return 0;
    }

    /* renamed from: f */
    private final Point m82834f() {
        Configuration configuration = m82831c().getResources().getConfiguration();
        LruCache<Configuration, Point> lruCache = f58614b;
        Point point = lruCache.get(configuration);
        if (point != null) {
            return point;
        }
        Rect maximumWindowMetrics = WindowHelper.INSTANCE.getMaximumWindowMetrics(m82831c());
        Point point2 = new Point(maximumWindowMetrics.width(), maximumWindowMetrics.height());
        lruCache.put(configuration, point2);
        return point2;
    }

    /* renamed from: h */
    private final int m82835h() {
        int identifier = m82831c().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return m82831c().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: i */
    private final boolean m82836i() {
        Point f = m82834f();
        int i = f.y;
        int i2 = f.x;
        Rect currentWindowMetrics = WindowHelper.INSTANCE.getCurrentWindowMetrics(m82831c());
        int height = currentWindowMetrics.height();
        if (i2 - currentWindowMetrics.width() > 0 || i - height > 0) {
            return true;
        }
        boolean z = !ViewConfiguration.get(m82831c()).hasPermanentMenuKey() && !KeyCharacterMap.deviceHasKey(4) && !KeyCharacterMap.deviceHasKey(3);
        Resources resources = m82831c().getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if ((identifier > 0 && resources.getBoolean(identifier)) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m82837l(Object obj, StringBuilder sb) {
        sb.append(" [");
        sb.append(obj);
        sb.append("] ");
    }

    /* renamed from: g */
    public final int mo68456g() {
        int i = m82831c().getResources().getConfiguration().orientation;
        if (i != 0) {
            return i;
        }
        Rect currentWindowMetrics = WindowHelper.INSTANCE.getCurrentWindowMetrics(m82831c());
        if (currentWindowMetrics.width() == currentWindowMetrics.height()) {
            return 3;
        }
        return currentWindowMetrics.width() < currentWindowMetrics.height() ? 1 : 2;
    }

    /* renamed from: j */
    public final boolean mo68457j() {
        if (Build.VERSION.SDK_INT >= 24) {
            boolean z = !C12112a.m82576a(m82831c()) && m82831c().isInMultiWindowMode();
            StringBuilder sb = new StringBuilder();
            String simpleName = m82831c().getClass().getSimpleName();
            sb.append(simpleName + " Activity screen:");
            m82837l("isMultiWindow " + z, sb);
            C11966a.f58161a.mo67380c(sb.toString());
            return z;
        }
        try {
            Class<?> cls = Class.forName("meizu.splitmode.FlymeSplitModeManager");
            Object invoke = cls.getMethod("isSplitMode", new Class[0]).invoke(cls.getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{m82831c()}), new Object[0]);
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) invoke).booleanValue();
            StringBuilder sb2 = new StringBuilder();
            String simpleName2 = m82831c().getClass().getSimpleName();
            sb2.append(simpleName2 + " Activity screen:");
            m82837l("isMultiWindow " + booleanValue, sb2);
            C11966a.f58161a.mo67380c(sb2.toString());
            return booleanValue;
        } catch (Throwable unused) {
            if (!C12112a.m82576a(m82831c())) {
                return m82830b();
            }
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo68458k() {
        Rect rect = new Rect();
        ViewGroup viewGroup = (ViewGroup) m82831c().findViewById(16908290);
        viewGroup.getGlobalVisibleRect(rect);
        if (rect.width() == 0 && rect.height() == 0) {
            return false;
        }
        Point f = m82834f();
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        boolean z = mo68457j() && f.y / 2 < iArr[1] + (rect.width() / 2);
        StringBuilder sb = new StringBuilder();
        String simpleName = m82831c().getClass().getSimpleName();
        sb.append(simpleName + " Activity screen:");
        m82837l("isWindowOnScreenBottom " + z, sb);
        C11966a.f58161a.mo67380c(sb.toString());
        return z;
    }
}
