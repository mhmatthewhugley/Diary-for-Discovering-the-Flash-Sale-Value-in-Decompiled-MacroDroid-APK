package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\bø\u0001\u0000\u001a\u001d\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\n\u001a'\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H\n\u001a'\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\b\u001a#\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\b\u001a7\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\b\u001a\u0015\u0010\u0019\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\n\u001a\u0015\u0010\u0019\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001aH\n\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001b"}, mo71668d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lja/u;", "block", "applyCanvas", "", "x", "y", "get", "color", "set", "width", "height", "", "filter", "scale", "Landroid/graphics/Bitmap$Config;", "config", "createBitmap", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "Landroid/graphics/Point;", "p", "contains", "Landroid/graphics/PointF;", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Bitmap.kt */
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(bitmap, "<this>");
        C13706o.m87929f(lVar, "block");
        lVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        int i;
        C13706o.m87929f(bitmap, "<this>");
        C13706o.m87929f(point, "p");
        int width = bitmap.getWidth();
        int i2 = point.x;
        return (i2 >= 0 && i2 < width) && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config) {
        C13706o.m87929f(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        C13706o.m87928e(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        C13706o.m87929f(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        C13706o.m87928e(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static final int get(Bitmap bitmap, int i, int i2) {
        C13706o.m87929f(bitmap, "<this>");
        return bitmap.getPixel(i, i2);
    }

    public static final Bitmap scale(Bitmap bitmap, int i, int i2, boolean z) {
        C13706o.m87929f(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        C13706o.m87928e(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        C13706o.m87929f(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        C13706o.m87928e(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void set(Bitmap bitmap, int i, int i2, @ColorInt int i3) {
        C13706o.m87929f(bitmap, "<this>");
        bitmap.setPixel(i, i2, i3);
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        C13706o.m87929f(bitmap, "<this>");
        C13706o.m87929f(pointF, "p");
        float f = pointF.x;
        if (f >= 0.0f && f < ((float) bitmap.getWidth())) {
            float f2 = pointF.y;
            return f2 >= 0.0f && f2 < ((float) bitmap.getHeight());
        }
    }

    @RequiresApi(26)
    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace) {
        C13706o.m87929f(config, "config");
        C13706o.m87929f(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        C13706o.m87928e(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            C13706o.m87928e(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        C13706o.m87929f(config, "config");
        C13706o.m87929f(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        C13706o.m87928e(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }
}
