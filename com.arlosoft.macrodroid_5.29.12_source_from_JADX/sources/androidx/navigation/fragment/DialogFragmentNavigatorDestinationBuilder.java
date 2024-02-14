package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.fragment.DialogFragmentNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p361pa.C16147a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, mo71668d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "build", "Landroidx/navigation/fragment/DialogFragmentNavigator;", "navigator", "", "id", "Lxa/d;", "Landroidx/fragment/app/DialogFragment;", "fragmentClass", "<init>", "(Landroidx/navigation/fragment/DialogFragmentNavigator;ILxa/d;)V", "navigation-fragment-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@NavDestinationDsl
/* compiled from: DialogFragmentNavigatorDestinationBuilder.kt */
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<DialogFragmentNavigator.Destination> {
    private final C16875d<? extends DialogFragment> fragmentClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator dialogFragmentNavigator, @IdRes int i, C16875d<? extends DialogFragment> dVar) {
        super(dialogFragmentNavigator, i);
        C13706o.m87930g(dialogFragmentNavigator, "navigator");
        C13706o.m87930g(dVar, "fragmentClass");
        this.fragmentClass = dVar;
    }

    public DialogFragmentNavigator.Destination build() {
        DialogFragmentNavigator.Destination destination = (DialogFragmentNavigator.Destination) super.build();
        destination.setClassName(C16147a.m96968b(this.fragmentClass).getName());
        return destination;
    }
}
