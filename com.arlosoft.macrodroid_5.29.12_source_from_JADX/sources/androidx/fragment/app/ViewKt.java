package androidx.fragment.app;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo71668d2 = {"findFragment", "F", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/fragment/app/Fragment;", "fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: View.kt */
public final class ViewKt {
    public static final <F extends Fragment> F findFragment(View view) {
        C13706o.m87929f(view, "<this>");
        F findFragment = FragmentManager.findFragment(view);
        C13706o.m87928e(findFragment, "findFragment(this)");
        return findFragment;
    }
}
