package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\b¨\u0006\n"}, mo71668d2 = {"Landroidx/navigation/NavController;", "", "id", "startDestination", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Lja/u;", "builder", "Landroidx/navigation/NavGraph;", "createGraph", "navigation-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: NavController.kt */
public final class NavControllerKt {
    public static final NavGraph createGraph(NavController navController, @IdRes int i, @IdRes int i2, C16265l<? super NavGraphBuilder, C13339u> lVar) {
        C13706o.m87930g(navController, "$this$createGraph");
        C13706o.m87930g(lVar, "builder");
        NavigatorProvider navigatorProvider = navController.getNavigatorProvider();
        C13706o.m87925b(navigatorProvider, "navigatorProvider");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i, i2);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, int i, int i2, C16265l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        C13706o.m87930g(navController, "$this$createGraph");
        C13706o.m87930g(lVar, "builder");
        NavigatorProvider navigatorProvider = navController.getNavigatorProvider();
        C13706o.m87925b(navigatorProvider, "navigatorProvider");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i, i2);
        lVar.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
