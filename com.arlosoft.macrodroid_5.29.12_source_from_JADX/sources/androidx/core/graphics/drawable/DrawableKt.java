package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0144Px;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a2\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\b\u0003\u0010\t\u001a\u00020\u00012\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u00012\b\b\u0003\u0010\f\u001a\u00020\u0001¨\u0006\u000f"}, mo71668d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "toBitmap", "toBitmapOrNull", "left", "top", "right", "bottom", "Lja/u;", "updateBounds", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Drawable.kt */
public final class DrawableKt {
    public static final Bitmap toBitmap(Drawable drawable, @C0144Px int i, @C0144Px int i2, Bitmap.Config config) {
        C13706o.m87929f(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            } else if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    C13706o.m87928e(bitmap, "bitmap");
                    return bitmap;
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
                C13706o.m87928e(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
                return createScaledBitmap;
            }
        }
        Rect bounds = drawable.getBounds();
        C13706o.m87928e(bounds, "bounds");
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        C13706o.m87928e(createBitmap, "bitmap");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i, i2, config);
    }

    public static final Bitmap toBitmapOrNull(Drawable drawable, @C0144Px int i, @C0144Px int i2, Bitmap.Config config) {
        C13706o.m87929f(drawable, "<this>");
        if (!(drawable instanceof BitmapDrawable) || ((BitmapDrawable) drawable).getBitmap() != null) {
            return toBitmap(drawable, i, i2, config);
        }
        return null;
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return toBitmapOrNull(drawable, i, i2, config);
    }

    public static final void updateBounds(Drawable drawable, @C0144Px int i, @C0144Px int i2, @C0144Px int i3, @C0144Px int i4) {
        C13706o.m87929f(drawable, "<this>");
        drawable.setBounds(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i5 & 2) != 0) {
            i2 = drawable.getBounds().top;
        }
        if ((i5 & 4) != 0) {
            i3 = drawable.getBounds().right;
        }
        if ((i5 & 8) != 0) {
            i4 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i, i2, i3, i4);
    }
}