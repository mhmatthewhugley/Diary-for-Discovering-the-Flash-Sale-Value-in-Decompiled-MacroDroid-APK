package androidx.navigation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo71668d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroid/view/View;", "navigation-runtime-ktx_release"}, mo71669k = 2, mo71670mv = {1, 1, 16})
/* compiled from: View.kt */
public final class ViewKt {
    public static final NavController findNavController(View view) {
        C13706o.m87930g(view, "$this$findNavController");
        NavController findNavController = Navigation.findNavController(view);
        C13706o.m87925b(findNavController, "Navigation.findNavController(this)");
        return findNavController;
    }
}
