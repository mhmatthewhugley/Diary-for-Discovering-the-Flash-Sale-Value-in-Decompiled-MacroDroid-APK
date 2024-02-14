package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0006"}, mo71668d2 = {"Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lja/u;", "optionsBuilder", "Landroidx/navigation/NavOptions;", "navOptions", "navigation-common-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: NavOptionsBuilder.kt */
public final class NavOptionsBuilderKt {
    public static final NavOptions navOptions(C16265l<? super NavOptionsBuilder, C13339u> lVar) {
        C13706o.m87930g(lVar, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        lVar.invoke(navOptionsBuilder);
        return navOptionsBuilder.build$navigation_common_ktx_release();
    }
}
