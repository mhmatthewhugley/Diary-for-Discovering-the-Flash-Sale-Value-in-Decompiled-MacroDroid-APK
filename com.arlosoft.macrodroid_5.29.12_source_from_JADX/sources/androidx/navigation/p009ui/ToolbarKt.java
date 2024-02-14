package androidx.navigation.p009ui;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\t"}, mo71668d2 = {"Landroidx/appcompat/widget/Toolbar;", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lja/u;", "setupWithNavController", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "navigation-ui-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: androidx.navigation.ui.ToolbarKt */
/* compiled from: Toolbar.kt */
public final class ToolbarKt {
    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setupWithNavController(androidx.appcompat.widget.Toolbar r3, androidx.navigation.NavController r4, androidx.drawerlayout.widget.DrawerLayout r5) {
        /*
            java.lang.String r0 = "$this$setupWithNavController"
            kotlin.jvm.internal.C13706o.m87930g(r3, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.C13706o.m87930g(r4, r0)
            androidx.navigation.NavGraph r0 = r4.getGraph()
            java.lang.String r1 = "navController.graph"
            kotlin.jvm.internal.C13706o.m87925b(r0, r1)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r1 = androidx.navigation.p009ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r2.<init>((androidx.navigation.NavGraph) r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r5 = r2.setOpenableLayout(r5)
            if (r1 == 0) goto L_0x0026
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r0 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r0.<init>(r1)
            r1 = r0
        L_0x0026:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r1 = (androidx.navigation.p009ui.AppBarConfiguration.OnNavigateUpListener) r1
            androidx.navigation.ui.AppBarConfiguration$Builder r5 = r5.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r5 = r5.build()
            java.lang.String r0 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.C13706o.m87925b(r5, r0)
            androidx.navigation.p009ui.NavigationUI.setupWithNavController((androidx.appcompat.widget.Toolbar) r3, (androidx.navigation.NavController) r4, (androidx.navigation.p009ui.AppBarConfiguration) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p009ui.ToolbarKt.setupWithNavController(androidx.appcompat.widget.Toolbar, androidx.navigation.NavController, androidx.drawerlayout.widget.DrawerLayout):void");
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void setupWithNavController$default(androidx.appcompat.widget.Toolbar r1, androidx.navigation.NavController r2, androidx.navigation.p009ui.AppBarConfiguration r3, int r4, java.lang.Object r5) {
        /*
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0030
            androidx.navigation.NavGraph r3 = r2.getGraph()
            java.lang.String r4 = "navController.graph"
            kotlin.jvm.internal.C13706o.m87925b(r3, r4)
            r4 = 0
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r5 = androidx.navigation.p009ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r0.<init>((androidx.navigation.NavGraph) r3)
            androidx.navigation.ui.AppBarConfiguration$Builder r3 = r0.setOpenableLayout(r4)
            if (r5 == 0) goto L_0x0021
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r4 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r4.<init>(r5)
            r5 = r4
        L_0x0021:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r5 = (androidx.navigation.p009ui.AppBarConfiguration.OnNavigateUpListener) r5
            androidx.navigation.ui.AppBarConfiguration$Builder r3 = r3.setFallbackOnNavigateUpListener(r5)
            androidx.navigation.ui.AppBarConfiguration r3 = r3.build()
            java.lang.String r4 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.C13706o.m87925b(r3, r4)
        L_0x0030:
            setupWithNavController((androidx.appcompat.widget.Toolbar) r1, (androidx.navigation.NavController) r2, (androidx.navigation.p009ui.AppBarConfiguration) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p009ui.ToolbarKt.setupWithNavController$default(androidx.appcompat.widget.Toolbar, androidx.navigation.NavController, androidx.navigation.ui.AppBarConfiguration, int, java.lang.Object):void");
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration) {
        C13706o.m87930g(toolbar, "$this$setupWithNavController");
        C13706o.m87930g(navController, "navController");
        C13706o.m87930g(appBarConfiguration, "configuration");
        NavigationUI.setupWithNavController(toolbar, navController, appBarConfiguration);
    }
}
