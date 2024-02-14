package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@RequiresApi(17)
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo71668d2 = {"Landroidx/window/layout/DisplayCompatHelperApi17;", "", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "point", "Lja/u;", "getRealSize", "<init>", "()V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: DisplayCompatHelper.kt */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        C13706o.m87929f(display, "display");
        C13706o.m87929f(point, "point");
        display.getRealSize(point);
    }
}
