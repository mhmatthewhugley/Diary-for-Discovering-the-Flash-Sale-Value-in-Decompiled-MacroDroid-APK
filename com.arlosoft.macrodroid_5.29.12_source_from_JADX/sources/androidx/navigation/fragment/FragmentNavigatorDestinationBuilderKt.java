package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\b\u001a7\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\b¨\u0006\n"}, mo71668d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/navigation/NavGraphBuilder;", "", "id", "Lja/u;", "fragment", "Lkotlin/Function1;", "Landroidx/navigation/fragment/FragmentNavigatorDestinationBuilder;", "builder", "navigation-fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: FragmentNavigatorDestinationBuilder.kt */
public final class FragmentNavigatorDestinationBuilderKt {
    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, @IdRes int i, C16265l<? super FragmentNavigatorDestinationBuilder, C13339u> lVar) {
        C13706o.m87930g(navGraphBuilder, "$this$fragment");
        C13706o.m87930g(lVar, "builder");
        Navigator navigator = navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        C13706o.m87925b(navigator, "getNavigator(clazz.java)");
        C13706o.m87933j(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) navigator, i, C13687e0.m87868b(Fragment.class));
        lVar.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, @IdRes int i) {
        C13706o.m87930g(navGraphBuilder, "$this$fragment");
        Navigator navigator = navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        C13706o.m87925b(navigator, "getNavigator(clazz.java)");
        C13706o.m87933j(4, "F");
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder((FragmentNavigator) navigator, i, C13687e0.m87868b(Fragment.class)));
    }
}
