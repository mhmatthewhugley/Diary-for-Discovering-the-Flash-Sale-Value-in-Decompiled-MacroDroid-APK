package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J$\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004J\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\u0015¨\u0006#"}, mo71668d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/PopUpToBuilder;", "Lja/u;", "popUpToBuilder", "popUpTo", "Landroidx/navigation/AnimBuilder;", "animBuilder", "anim", "Landroidx/navigation/NavOptions;", "build$navigation_common_ktx_release", "()Landroidx/navigation/NavOptions;", "build", "Landroidx/navigation/NavOptions$Builder;", "builder", "Landroidx/navigation/NavOptions$Builder;", "", "launchSingleTop", "Z", "getLaunchSingleTop", "()Z", "setLaunchSingleTop", "(Z)V", "value", "I", "getPopUpTo", "()I", "setPopUpTo", "(I)V", "inclusive", "<init>", "()V", "navigation-common-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@NavOptionsDsl
/* compiled from: NavOptionsBuilder.kt */
public final class NavOptionsBuilder {
    private final NavOptions.Builder builder = new NavOptions.Builder();
    private boolean inclusive;
    private boolean launchSingleTop;
    @IdRes
    private int popUpTo = -1;

    public final void anim(C16265l<? super AnimBuilder, C13339u> lVar) {
        C13706o.m87930g(lVar, "animBuilder");
        AnimBuilder animBuilder = new AnimBuilder();
        lVar.invoke(animBuilder);
        this.builder.setEnterAnim(animBuilder.getEnter()).setExitAnim(animBuilder.getExit()).setPopEnterAnim(animBuilder.getPopEnter()).setPopExitAnim(animBuilder.getPopExit());
    }

    public final NavOptions build$navigation_common_ktx_release() {
        NavOptions.Builder builder2 = this.builder;
        builder2.setLaunchSingleTop(this.launchSingleTop);
        builder2.setPopUpTo(this.popUpTo, this.inclusive);
        NavOptions build = builder2.build();
        C13706o.m87925b(build, "builder.apply {\n        … inclusive)\n    }.build()");
        return build;
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    public final int getPopUpTo() {
        return this.popUpTo;
    }

    public final void popUpTo(@IdRes int i, C16265l<? super PopUpToBuilder, C13339u> lVar) {
        C13706o.m87930g(lVar, "popUpToBuilder");
        setPopUpTo(i);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        lVar.invoke(popUpToBuilder);
        this.inclusive = popUpToBuilder.getInclusive();
    }

    public final void setLaunchSingleTop(boolean z) {
        this.launchSingleTop = z;
    }

    public final void setPopUpTo(int i) {
        this.popUpTo = i;
        this.inclusive = false;
    }
}
