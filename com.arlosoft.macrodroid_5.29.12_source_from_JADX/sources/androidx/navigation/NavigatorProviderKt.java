package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p361pa.C16147a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\n¢\u0006\u0004\b\u0006\u0010\n\u001a7\u0010\r\u001a\u0014\u0012\u000e\b\u0001\u0012\n \f*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n\u001a\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¨\u0006\u0010"}, mo71668d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "T", "Landroidx/navigation/NavigatorProvider;", "", "name", "get", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;)Landroidx/navigation/Navigator;", "Lxa/d;", "clazz", "(Landroidx/navigation/NavigatorProvider;Lxa/d;)Landroidx/navigation/Navigator;", "navigator", "kotlin.jvm.PlatformType", "set", "Lja/u;", "plusAssign", "navigation-common-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: NavigatorProvider.kt */
public final class NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String str) {
        C13706o.m87930g(navigatorProvider, "$this$get");
        C13706o.m87930g(str, "name");
        T navigator = navigatorProvider.getNavigator(str);
        C13706o.m87925b(navigator, "getNavigator(name)");
        return navigator;
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        C13706o.m87930g(navigatorProvider, "$this$plusAssign");
        C13706o.m87930g(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String str, Navigator<? extends NavDestination> navigator) {
        C13706o.m87930g(navigatorProvider, "$this$set");
        C13706o.m87930g(str, "name");
        C13706o.m87930g(navigator, "navigator");
        return navigatorProvider.addNavigator(str, navigator);
    }

    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, C16875d<T> dVar) {
        C13706o.m87930g(navigatorProvider, "$this$get");
        C13706o.m87930g(dVar, "clazz");
        T navigator = navigatorProvider.getNavigator(C16147a.m96968b(dVar));
        C13706o.m87925b(navigator, "getNavigator(clazz.java)");
        return navigator;
    }
}
