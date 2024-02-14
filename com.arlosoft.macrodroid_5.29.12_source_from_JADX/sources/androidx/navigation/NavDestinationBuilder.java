package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B!\u0012\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000'\u0012\b\b\u0001\u0010,\u001a\u00020\u000f¢\u0006\u0004\b0\u00101J\"\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004J\u001a\u0010\f\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006J\"\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0006J\u000f\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020%0\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\"\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000'8\u0004X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, mo71668d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "", "name", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "Lja/u;", "argumentBuilder", "argument", "uriPattern", "deepLink", "Landroidx/navigation/NavDeepLinkDslBuilder;", "navDeepLink", "", "actionId", "Landroidx/navigation/NavActionBuilder;", "actionBuilder", "action", "build", "()Landroidx/navigation/NavDestination;", "", "label", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "Landroidx/navigation/NavArgument;", "arguments", "Ljava/util/Map;", "", "Landroidx/navigation/NavDeepLink;", "deepLinks", "Ljava/util/List;", "Landroidx/navigation/NavAction;", "actions", "Landroidx/navigation/Navigator;", "navigator", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "id", "I", "getId", "()I", "<init>", "(Landroidx/navigation/Navigator;I)V", "navigation-common-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@NavDestinationDsl
/* compiled from: NavDestinationBuilder.kt */
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions = new LinkedHashMap();
    private Map<String, NavArgument> arguments = new LinkedHashMap();
    private List<NavDeepLink> deepLinks = new ArrayList();

    /* renamed from: id */
    private final int f550id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;

    public NavDestinationBuilder(Navigator<? extends D> navigator2, @IdRes int i) {
        C13706o.m87930g(navigator2, "navigator");
        this.navigator = navigator2;
        this.f550id = i;
    }

    public final void action(int i, C16265l<? super NavActionBuilder, C13339u> lVar) {
        C13706o.m87930g(lVar, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer valueOf = Integer.valueOf(i);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        lVar.invoke(navActionBuilder);
        map.put(valueOf, navActionBuilder.build$navigation_common_ktx_release());
    }

    public final void argument(String str, C16265l<? super NavArgumentBuilder, C13339u> lVar) {
        C13706o.m87930g(str, "name");
        C13706o.m87930g(lVar, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        lVar.invoke(navArgumentBuilder);
        map.put(str, navArgumentBuilder.build());
    }

    public D build() {
        D createDestination = this.navigator.createDestination();
        createDestination.setId(this.f550id);
        createDestination.setLabel(this.label);
        for (Map.Entry next : this.arguments.entrySet()) {
            createDestination.addArgument((String) next.getKey(), (NavArgument) next.getValue());
        }
        for (NavDeepLink addDeepLink : this.deepLinks) {
            createDestination.addDeepLink(addDeepLink);
        }
        for (Map.Entry next2 : this.actions.entrySet()) {
            createDestination.putAction(((Number) next2.getKey()).intValue(), (NavAction) next2.getValue());
        }
        return createDestination;
    }

    public final void deepLink(String str) {
        C13706o.m87930g(str, "uriPattern");
        this.deepLinks.add(new NavDeepLink(str));
    }

    public final int getId() {
        return this.f550id;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    /* access modifiers changed from: protected */
    public final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void deepLink(C16265l<? super NavDeepLinkDslBuilder, C13339u> lVar) {
        C13706o.m87930g(lVar, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        lVar.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_ktx_release());
    }
}
