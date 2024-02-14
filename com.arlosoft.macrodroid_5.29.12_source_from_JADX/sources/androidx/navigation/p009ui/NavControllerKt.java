package androidx.navigation.p009ui;

import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo71668d2 = {"navigateUp", "", "Landroidx/navigation/NavController;", "drawerLayout", "Landroidx/customview/widget/Openable;", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "navigation-ui-ktx_release"}, mo71669k = 2, mo71670mv = {1, 1, 16})
/* renamed from: androidx.navigation.ui.NavControllerKt */
/* compiled from: NavController.kt */
public final class NavControllerKt {
    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean navigateUp(androidx.navigation.NavController r3, androidx.customview.widget.Openable r4) {
        /*
            java.lang.String r0 = "$this$navigateUp"
            kotlin.jvm.internal.C13706o.m87930g(r3, r0)
            androidx.navigation.NavGraph r0 = r3.getGraph()
            java.lang.String r1 = "graph"
            kotlin.jvm.internal.C13706o.m87925b(r0, r1)
            androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$1 r1 = androidx.navigation.p009ui.AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE
            androidx.navigation.ui.AppBarConfiguration$Builder r2 = new androidx.navigation.ui.AppBarConfiguration$Builder
            r2.<init>((androidx.navigation.NavGraph) r0)
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r2.setOpenableLayout(r4)
            if (r1 == 0) goto L_0x0021
            androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 r0 = new androidx.navigation.ui.AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0
            r0.<init>(r1)
            r1 = r0
        L_0x0021:
            androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener r1 = (androidx.navigation.p009ui.AppBarConfiguration.OnNavigateUpListener) r1
            androidx.navigation.ui.AppBarConfiguration$Builder r4 = r4.setFallbackOnNavigateUpListener(r1)
            androidx.navigation.ui.AppBarConfiguration r4 = r4.build()
            java.lang.String r0 = "AppBarConfiguration.Buil…eUpListener)\n    .build()"
            kotlin.jvm.internal.C13706o.m87925b(r4, r0)
            boolean r3 = androidx.navigation.p009ui.NavigationUI.navigateUp((androidx.navigation.NavController) r3, (androidx.navigation.p009ui.AppBarConfiguration) r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.p009ui.NavControllerKt.navigateUp(androidx.navigation.NavController, androidx.customview.widget.Openable):boolean");
    }

    public static final boolean navigateUp(NavController navController, AppBarConfiguration appBarConfiguration) {
        C13706o.m87930g(navController, "$this$navigateUp");
        C13706o.m87930g(appBarConfiguration, "appBarConfiguration");
        return NavigationUI.navigateUp(navController, appBarConfiguration);
    }
}
