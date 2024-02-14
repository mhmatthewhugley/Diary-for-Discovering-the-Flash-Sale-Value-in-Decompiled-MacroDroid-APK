package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, mo71668d2 = {"Landroid/view/View;", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Lja/u;", "set", "(Landroid/view/View;Landroidx/savedstate/SavedStateRegistryOwner;)V", "setViewTreeSavedStateRegistryOwner", "get", "(Landroid/view/View;)Landroidx/savedstate/SavedStateRegistryOwner;", "findViewTreeSavedStateRegistryOwner", "savedstate_release"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        C13706o.m87929f(view, "<this>");
        return (SavedStateRegistryOwner) C15132p.m93488q(C15132p.m93495x(C15125n.m93473h(view, C1157x10fac0e2.INSTANCE), C1158x10fac0e3.INSTANCE));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        C13706o.m87929f(view, "<this>");
        view.setTag(C1155R.C1156id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
