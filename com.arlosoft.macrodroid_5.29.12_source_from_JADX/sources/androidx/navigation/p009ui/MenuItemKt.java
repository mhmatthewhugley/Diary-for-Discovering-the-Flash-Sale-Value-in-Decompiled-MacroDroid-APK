package androidx.navigation.p009ui;

import android.view.MenuItem;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo71668d2 = {"onNavDestinationSelected", "", "Landroid/view/MenuItem;", "navController", "Landroidx/navigation/NavController;", "navigation-ui-ktx_release"}, mo71669k = 2, mo71670mv = {1, 1, 16})
/* renamed from: androidx.navigation.ui.MenuItemKt */
/* compiled from: MenuItem.kt */
public final class MenuItemKt {
    public static final boolean onNavDestinationSelected(MenuItem menuItem, NavController navController) {
        C13706o.m87930g(menuItem, "$this$onNavDestinationSelected");
        C13706o.m87930g(navController, "navController");
        return NavigationUI.onNavDestinationSelected(menuItem, navController);
    }
}
