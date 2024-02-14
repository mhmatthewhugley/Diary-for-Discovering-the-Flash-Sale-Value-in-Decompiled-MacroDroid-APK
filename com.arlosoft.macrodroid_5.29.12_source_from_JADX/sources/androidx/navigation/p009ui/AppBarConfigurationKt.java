package androidx.navigation.p009ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.navigation.NavGraph;
import androidx.navigation.p009ui.AppBarConfiguration;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\b\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\b\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\b¨\u0006\u000e"}, mo71668d2 = {"AppBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "topLevelMenu", "Landroid/view/Menu;", "drawerLayout", "Landroidx/customview/widget/Openable;", "fallbackOnNavigateUpListener", "Lkotlin/Function0;", "", "navGraph", "Landroidx/navigation/NavGraph;", "topLevelDestinationIds", "", "", "navigation-ui-ktx_release"}, mo71669k = 2, mo71670mv = {1, 1, 16})
/* renamed from: androidx.navigation.ui.AppBarConfigurationKt */
/* compiled from: AppBarConfiguration.kt */
public final class AppBarConfigurationKt {
    public static final AppBarConfiguration AppBarConfiguration(NavGraph navGraph, Openable openable, C16254a<Boolean> aVar) {
        C13706o.m87930g(navGraph, "navGraph");
        C13706o.m87930g(aVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C0855x56421ee5(aVar)).build();
        C13706o.m87925b(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(NavGraph navGraph, Openable openable, C16254a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            aVar = AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE;
        }
        C13706o.m87930g(navGraph, "navGraph");
        C13706o.m87930g(aVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C0855x56421ee5(aVar)).build();
        C13706o.m87925b(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static final AppBarConfiguration AppBarConfiguration(Menu menu, Openable openable, C16254a<Boolean> aVar) {
        C13706o.m87930g(menu, "topLevelMenu");
        C13706o.m87930g(aVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(menu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C0855x56421ee5(aVar)).build();
        C13706o.m87925b(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Menu menu, Openable openable, C16254a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            aVar = AppBarConfigurationKt$AppBarConfiguration$2.INSTANCE;
        }
        C13706o.m87930g(menu, "topLevelMenu");
        C13706o.m87930g(aVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(menu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C0855x56421ee5(aVar)).build();
        C13706o.m87925b(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static final AppBarConfiguration AppBarConfiguration(Set<Integer> set, Openable openable, C16254a<Boolean> aVar) {
        C13706o.m87930g(set, "topLevelDestinationIds");
        C13706o.m87930g(aVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(set).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C0855x56421ee5(aVar)).build();
        C13706o.m87925b(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Set set, Openable openable, C16254a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            aVar = AppBarConfigurationKt$AppBarConfiguration$3.INSTANCE;
        }
        C13706o.m87930g(set, "topLevelDestinationIds");
        C13706o.m87930g(aVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder((Set<Integer>) set).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C0855x56421ee5(aVar)).build();
        C13706o.m87925b(build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }
}