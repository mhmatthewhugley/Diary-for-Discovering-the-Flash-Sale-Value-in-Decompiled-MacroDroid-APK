package androidx.navigation.p009ui;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, mo71668d2 = {"Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lja/u;", "setupWithNavController", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "navigation-ui-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: androidx.navigation.ui.CollapsingToolbarLayoutKt */
/* compiled from: CollapsingToolbarLayout.kt */
public final class CollapsingToolbarLayoutKt {
    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setupWithNavController(com.google.android.material.appbar.CollapsingToolbarLayout r3, androidx.appcompat.widget.Toolbar r4, androidx.navigation.NavController r5, androidx.drawerlayout.widget.DrawerLayout r6) {
        /*
            java.lang.String r0 = "$this$setupWithNavController"
            kotlin.jvm.internal.C13706o.m87930g(r3, r0)
            java.lang.String r0 = "toolbar"
            kotlin.jvm.internal.C13706o.m87930g(r4, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.C13706o.m87930g(r5, r0)
            androidx.navigation.NavGraph r0 = r5.getGraph()
            java.lang.String r1 = "navController.graph"
            kotlin.jvm.internal.C13706o.m87925b(r0, r1)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r1 = androidx.navigation.p009ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r2.<init>((androidx.navigation.NavGraph) r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r6 = r2.setOpenableLayout(r6)
            if (r1 == 0) goto L_0x002c
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r0 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r0.<init>(r1)
            r1 = r0
        L_0x002c:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r1 = (androidx.navigation.p009ui.AppBarConfiguration.OnNavigateUpListener) r1
            androidx.navigation.ui.AppBarConfiguration$Builder r6 = r6.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r6 = r6.build()
            java.lang.String r0 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.C13706o.m87925b(r6, r0)
            androidx.navigation.p009ui.NavigationUI.setupWithNavController((com.google.android.material.appbar.CollapsingToolbarLayout) r3, (androidx.appcompat.widget.Toolbar) r4, (androidx.navigation.NavController) r5, (androidx.navigation.p009ui.AppBarConfiguration) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p009ui.CollapsingToolbarLayoutKt.setupWithNavController(com.google.android.material.appbar.CollapsingToolbarLayout, androidx.appcompat.widget.Toolbar, androidx.navigation.NavController, androidx.drawerlayout.widget.DrawerLayout):void");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void setupWithNavController$default(com.google.android.material.appbar.CollapsingToolbarLayout r1, androidx.appcompat.widget.Toolbar r2, androidx.navigation.NavController r3, androidx.navigation.p009ui.AppBarConfiguration r4, int r5, java.lang.Object r6) {
        /*
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0030
            androidx.navigation.NavGraph r4 = r3.getGraph()
            java.lang.String r5 = "navController.graph"
            kotlin.jvm.internal.C13706o.m87925b(r4, r5)
            r5 = 0
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r6 = androidx.navigation.p009ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r0 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r0.<init>((androidx.navigation.NavGraph) r4)
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r0.setOpenableLayout(r5)
            if (r6 == 0) goto L_0x0021
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r5 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r5.<init>(r6)
            r6 = r5
        L_0x0021:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r6 = (androidx.navigation.p009ui.AppBarConfiguration.OnNavigateUpListener) r6
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r4.setFallbackOnNavigateUpListener(r6)
            androidx.navigation.ui.AppBarConfiguration r4 = r4.build()
            java.lang.String r5 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.C13706o.m87925b(r4, r5)
        L_0x0030:
            setupWithNavController((com.google.android.material.appbar.CollapsingToolbarLayout) r1, (androidx.appcompat.widget.Toolbar) r2, (androidx.navigation.NavController) r3, (androidx.navigation.p009ui.AppBarConfiguration) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p009ui.CollapsingToolbarLayoutKt.setupWithNavController$default(com.google.android.material.appbar.CollapsingToolbarLayout, androidx.appcompat.widget.Toolbar, androidx.navigation.NavController, androidx.navigation.ui.AppBarConfiguration, int, java.lang.Object):void");
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration) {
        C13706o.m87930g(collapsingToolbarLayout, "$this$setupWithNavController");
        C13706o.m87930g(toolbar, "toolbar");
        C13706o.m87930g(navController, "navController");
        C13706o.m87930g(appBarConfiguration, "configuration");
        NavigationUI.setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }
}
