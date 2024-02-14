package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\n\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\n\u001a\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\n¨\u0006\f"}, mo71668d2 = {"Landroidx/navigation/NavGraph;", "", "id", "Landroidx/navigation/NavDestination;", "get", "", "contains", "node", "Lja/u;", "plusAssign", "other", "minusAssign", "navigation-common-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: NavGraph.kt */
public final class NavGraphKt {
    public static final boolean contains(NavGraph navGraph, @IdRes int i) {
        C13706o.m87930g(navGraph, "$this$contains");
        return navGraph.findNode(i) != null;
    }

    public static final NavDestination get(NavGraph navGraph, @IdRes int i) {
        C13706o.m87930g(navGraph, "$this$get");
        NavDestination findNode = navGraph.findNode(i);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + i + " was found in " + navGraph);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination navDestination) {
        C13706o.m87930g(navGraph, "$this$minusAssign");
        C13706o.m87930g(navDestination, "node");
        navGraph.remove(navDestination);
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination navDestination) {
        C13706o.m87930g(navGraph, "$this$plusAssign");
        C13706o.m87930g(navDestination, "node");
        navGraph.addDestination(navDestination);
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph navGraph2) {
        C13706o.m87930g(navGraph, "$this$plusAssign");
        C13706o.m87930g(navGraph2, "other");
        navGraph.addAll(navGraph2);
    }
}
