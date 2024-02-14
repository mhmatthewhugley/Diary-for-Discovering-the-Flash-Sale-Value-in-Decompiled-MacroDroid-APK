package androidx.navigation.p009ui;

import androidx.navigation.NavController;
import com.google.android.material.navigation.NavigationView;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, mo71668d2 = {"Lcom/google/android/material/navigation/NavigationView;", "Landroidx/navigation/NavController;", "navController", "Lja/u;", "setupWithNavController", "navigation-ui-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: androidx.navigation.ui.NavigationViewKt */
/* compiled from: NavigationView.kt */
public final class NavigationViewKt {
    public static final void setupWithNavController(NavigationView navigationView, NavController navController) {
        C13706o.m87930g(navigationView, "$this$setupWithNavController");
        C13706o.m87930g(navController, "navController");
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}
