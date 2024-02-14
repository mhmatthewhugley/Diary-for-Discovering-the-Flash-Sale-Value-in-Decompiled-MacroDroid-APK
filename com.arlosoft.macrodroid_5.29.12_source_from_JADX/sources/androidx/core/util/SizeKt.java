package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0005H\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\n\u001a\r\u0010\u0006\u001a\u00020\u0003*\u00020\u0004H\n\u001a\r\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\n¨\u0006\u0007"}, mo71668d2 = {"component1", "", "Landroid/util/Size;", "", "Landroid/util/SizeF;", "Landroidx/core/util/SizeFCompat;", "component2", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: Size.kt */
public final class SizeKt {
    @RequiresApi(21)
    public static final int component1(Size size) {
        C13706o.m87929f(size, "<this>");
        return size.getWidth();
    }

    @RequiresApi(21)
    public static final int component2(Size size) {
        C13706o.m87929f(size, "<this>");
        return size.getHeight();
    }

    @RequiresApi(21)
    public static final float component1(SizeF sizeF) {
        C13706o.m87929f(sizeF, "<this>");
        return sizeF.getWidth();
    }

    @RequiresApi(21)
    public static final float component2(SizeF sizeF) {
        C13706o.m87929f(sizeF, "<this>");
        return sizeF.getHeight();
    }

    public static final float component1(SizeFCompat sizeFCompat) {
        C13706o.m87929f(sizeFCompat, "<this>");
        return sizeFCompat.getWidth();
    }

    public static final float component2(SizeFCompat sizeFCompat) {
        C13706o.m87929f(sizeFCompat, "<this>");
        return sizeFCompat.getHeight();
    }
}
