package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo71668d2 = {"<anonymous>", "Landroidx/savedstate/SavedStateRegistryOwner;", "view", "Landroid/view/View;", "invoke"}, mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
final class C1158x10fac0e3 extends C13708q implements C16265l<View, SavedStateRegistryOwner> {
    public static final C1158x10fac0e3 INSTANCE = new C1158x10fac0e3();

    C1158x10fac0e3() {
        super(1);
    }

    public final SavedStateRegistryOwner invoke(View view) {
        C13706o.m87929f(view, "view");
        Object tag = view.getTag(C1155R.C1156id.view_tree_saved_state_registry_owner);
        if (tag instanceof SavedStateRegistryOwner) {
            return (SavedStateRegistryOwner) tag;
        }
        return null;
    }
}
