package androidx.core.view;

import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: View.kt */
/* synthetic */ class ViewKt$ancestors$1 extends C13704m implements C16265l<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final ViewParent invoke(ViewParent viewParent) {
        C13706o.m87929f(viewParent, "p0");
        return viewParent.getParent();
    }
}
