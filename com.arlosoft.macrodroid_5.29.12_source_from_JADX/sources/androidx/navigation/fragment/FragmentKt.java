package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo71668d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroidx/fragment/app/Fragment;", "navigation-fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 1, 16})
/* compiled from: Fragment.kt */
public final class FragmentKt {
    public static final NavController findNavController(Fragment fragment) {
        C13706o.m87930g(fragment, "$this$findNavController");
        NavController findNavController = NavHostFragment.findNavController(fragment);
        C13706o.m87925b(findNavController, "NavHostFragment.findNavController(this)");
        return findNavController;
    }
}
