package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.viewmodel.C0755R;

public class ViewTreeViewModelStoreOwner {
    private ViewTreeViewModelStoreOwner() {
    }

    @Nullable
    public static ViewModelStoreOwner get(@NonNull View view) {
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) view.getTag(C0755R.C0756id.view_tree_view_model_store_owner);
        if (viewModelStoreOwner != null) {
            return viewModelStoreOwner;
        }
        ViewParent parent = view.getParent();
        while (viewModelStoreOwner == null && (parent instanceof View)) {
            View view2 = (View) parent;
            viewModelStoreOwner = (ViewModelStoreOwner) view2.getTag(C0755R.C0756id.view_tree_view_model_store_owner);
            parent = view2.getParent();
        }
        return viewModelStoreOwner;
    }

    public static void set(@NonNull View view, @Nullable ViewModelStoreOwner viewModelStoreOwner) {
        view.setTag(C0755R.C0756id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
