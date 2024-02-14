package androidx.navigation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001J\r\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo71668d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "D", "navDestination", "Lja/u;", "destination", "unaryPlus", "addDestination", "build", "", "destinations", "Ljava/util/List;", "Landroidx/navigation/NavigatorProvider;", "provider", "Landroidx/navigation/NavigatorProvider;", "getProvider", "()Landroidx/navigation/NavigatorProvider;", "", "startDestination", "I", "id", "<init>", "(Landroidx/navigation/NavigatorProvider;II)V", "navigation-common-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@NavDestinationDsl
/* compiled from: NavGraphBuilder.kt */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations = new ArrayList();
    private final NavigatorProvider provider;
    private int startDestination;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavGraphBuilder(androidx.navigation.NavigatorProvider r3, @androidx.annotation.IdRes int r4, @androidx.annotation.IdRes int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.C13706o.m87930g(r3, r0)
            java.lang.Class<androidx.navigation.NavGraphNavigator> r0 = androidx.navigation.NavGraphNavigator.class
            androidx.navigation.Navigator r0 = r3.getNavigator(r0)
            java.lang.String r1 = "getNavigator(clazz.java)"
            kotlin.jvm.internal.C13706o.m87925b(r0, r1)
            r2.<init>(r0, r4)
            r2.provider = r3
            r2.startDestination = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.destinations = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavGraphBuilder.<init>(androidx.navigation.NavigatorProvider, int, int):void");
    }

    public final void addDestination(NavDestination navDestination) {
        C13706o.m87930g(navDestination, "destination");
        this.destinations.add(navDestination);
    }

    public final <D extends NavDestination> void destination(NavDestinationBuilder<? extends D> navDestinationBuilder) {
        C13706o.m87930g(navDestinationBuilder, "navDestination");
        this.destinations.add(navDestinationBuilder.build());
    }

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(NavDestination navDestination) {
        C13706o.m87930g(navDestination, "$this$unaryPlus");
        addDestination(navDestination);
    }

    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations((Collection<NavDestination>) this.destinations);
        int i = this.startDestination;
        if (i != 0) {
            navGraph.setStartDestination(i);
            return navGraph;
        }
        throw new IllegalStateException("You must set a startDestination");
    }
}
