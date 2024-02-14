package androidx.navigation.fragment;

import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgs;
import androidx.navigation.NavArgsLazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\b¨\u0006\u0005"}, mo71668d2 = {"navArgs", "Landroidx/navigation/NavArgsLazy;", "Args", "Landroidx/navigation/NavArgs;", "Landroidx/fragment/app/Fragment;", "navigation-fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 1, 16})
/* compiled from: FragmentNavArgsLazy.kt */
public final class FragmentNavArgsLazyKt {
    @MainThread
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(Fragment fragment) {
        C13706o.m87930g(fragment, "$this$navArgs");
        C13706o.m87933j(4, "Args");
        return new NavArgsLazy<>(C13687e0.m87868b(NavArgs.class), new FragmentNavArgsLazyKt$navArgs$1(fragment));
    }
}
