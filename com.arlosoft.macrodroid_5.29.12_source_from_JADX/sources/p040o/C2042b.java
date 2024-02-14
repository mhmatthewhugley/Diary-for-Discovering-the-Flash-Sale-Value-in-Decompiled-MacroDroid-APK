package p040o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ColorInt;

/* renamed from: o.b */
/* compiled from: RippleHelper */
public class C2042b {
    /* renamed from: a */
    public static void m8452a(Drawable drawable, @ColorInt int i) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i));
        }
    }
}
