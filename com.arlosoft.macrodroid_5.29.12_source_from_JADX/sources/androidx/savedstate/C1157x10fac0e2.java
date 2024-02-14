package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo71668d2 = {"<anonymous>", "Landroid/view/View;", "view", "invoke"}, mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 */
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
final class C1157x10fac0e2 extends C13708q implements C16265l<View, View> {
    public static final C1157x10fac0e2 INSTANCE = new C1157x10fac0e2();

    C1157x10fac0e2() {
        super(1);
    }

    public final View invoke(View view) {
        C13706o.m87929f(view, "view");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
