package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p361pa.C16147a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, mo71668d2 = {"Landroidx/navigation/fragment/FragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "build", "Landroidx/navigation/fragment/FragmentNavigator;", "navigator", "", "id", "Lxa/d;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "<init>", "(Landroidx/navigation/fragment/FragmentNavigator;ILxa/d;)V", "navigation-fragment-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@NavDestinationDsl
/* compiled from: FragmentNavigatorDestinationBuilder.kt */
public final class FragmentNavigatorDestinationBuilder extends NavDestinationBuilder<FragmentNavigator.Destination> {
    private final C16875d<? extends Fragment> fragmentClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentNavigatorDestinationBuilder(FragmentNavigator fragmentNavigator, @IdRes int i, C16875d<? extends Fragment> dVar) {
        super(fragmentNavigator, i);
        C13706o.m87930g(fragmentNavigator, "navigator");
        C13706o.m87930g(dVar, "fragmentClass");
        this.fragmentClass = dVar;
    }

    public FragmentNavigator.Destination build() {
        FragmentNavigator.Destination destination = (FragmentNavigator.Destination) super.build();
        destination.setClassName(C16147a.m96968b(this.fragmentClass).getName());
        return destination;
    }
}
