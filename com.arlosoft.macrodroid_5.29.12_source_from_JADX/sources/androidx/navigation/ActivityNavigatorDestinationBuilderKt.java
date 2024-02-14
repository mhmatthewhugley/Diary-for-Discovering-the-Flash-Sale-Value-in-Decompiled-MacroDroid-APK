package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\b¨\u0006\b"}, mo71668d2 = {"Landroidx/navigation/NavGraphBuilder;", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Lja/u;", "builder", "activity", "navigation-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: ActivityNavigatorDestinationBuilder.kt */
public final class ActivityNavigatorDestinationBuilderKt {
    public static final void activity(NavGraphBuilder navGraphBuilder, @IdRes int i, C16265l<? super ActivityNavigatorDestinationBuilder, C13339u> lVar) {
        C13706o.m87930g(navGraphBuilder, "$this$activity");
        C13706o.m87930g(lVar, "builder");
        Navigator navigator = navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        C13706o.m87925b(navigator, "getNavigator(clazz.java)");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navigator, i);
        lVar.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}
