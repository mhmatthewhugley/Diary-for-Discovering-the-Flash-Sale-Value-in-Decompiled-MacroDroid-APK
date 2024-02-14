package dev.skomlach.biometric.compat.utils.themes;

import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.core.graphics.ColorUtils;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002\u001a&\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo71668d2 = {"BRIGHT_IMAGE_MEAN_LUMINANCE", "", "DARK_PIXEL_LUMINANCE", "DARK_THEME_MEAN_LUMINANCE", "HINT_SUPPORTS_DARK_TEXT", "", "HINT_SUPPORTS_DARK_THEME", "MAX_DARK_AREA", "calculateDarkHints", "source", "Landroid/graphics/Bitmap;", "generateBitmapFromColors", "primaryColor", "secondaryColor", "tertiaryColor", "getIsOsDarkTheme", "Ldev/skomlach/biometric/compat/utils/themes/DarkThemeCheckResult;", "context", "Landroid/content/Context;", "biometric_release"}, mo71669k = 2, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: DarkLightThemeDetection.kt */
public final class DarkLightThemeDetectionKt {
    private static final float BRIGHT_IMAGE_MEAN_LUMINANCE = 0.75f;
    private static final float DARK_PIXEL_LUMINANCE = 0.45f;
    private static final float DARK_THEME_MEAN_LUMINANCE = 0.25f;
    private static final int HINT_SUPPORTS_DARK_TEXT = 1;
    private static final int HINT_SUPPORTS_DARK_THEME = 2;
    private static final float MAX_DARK_AREA = 0.05f;

    private static final int calculateDarkHints(Bitmap bitmap) {
        int i = 0;
        if (bitmap == null) {
            return 0;
        }
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        double d = 0.0d;
        int b = C16518c.m98607b(((float) width) * MAX_DARK_AREA);
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        float[] fArr = new float[3];
        int i2 = 0;
        for (int i3 = 0; i3 < width; i3++) {
            ColorUtils.colorToHSL(iArr[i3], fArr);
            float f = fArr[2];
            int alpha = Color.alpha(iArr[i3]);
            if (f < DARK_PIXEL_LUMINANCE && alpha != 0) {
                i2++;
            }
            d += (double) f;
        }
        double d2 = d / ((double) width);
        if (d2 > 0.75d && i2 < b) {
            i = 1;
        }
        return d2 < 0.25d ? i | 2 : i;
    }

    private static final Bitmap generateBitmapFromColors(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        int[] iArr = {i, i2, i3};
        Bitmap createBitmap = Bitmap.createBitmap(6, 1, Bitmap.Config.ARGB_8888);
        for (int i4 = 0; i4 < 3; i4++) {
            createBitmap.setPixel(i4, 0, iArr[0]);
        }
        for (int i5 = 3; i5 < 5; i5++) {
            createBitmap.setPixel(i5, 0, iArr[1]);
        }
        for (int i6 = 5; i6 < 6; i6++) {
            createBitmap.setPixel(i6, 0, iArr[2]);
        }
        C13706o.m87928e(createBitmap, "bitmap");
        return createBitmap;
    }

    public static final DarkThemeCheckResult getIsOsDarkTheme(Context context) {
        int i;
        C13706o.m87929f(context, "context");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 26) {
            return DarkThemeCheckResult.UNDEFINED;
        }
        if (i2 > 28) {
            return DarkThemeCheckResult.UNDEFINED;
        }
        boolean z = true;
        WallpaperColors wallpaperColors = WallpaperManager.getInstance(context).getWallpaperColors(1);
        if (wallpaperColors == null) {
            return DarkThemeCheckResult.UNDEFINED;
        }
        try {
            Method method = WallpaperColors.class.getMethod("getColorHints", new Class[0]);
            boolean isAccessible = method.isAccessible();
            if (!isAccessible) {
                method.setAccessible(true);
            }
            Object invoke = method.invoke(wallpaperColors, new Object[0]);
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) invoke).intValue();
            if (!isAccessible) {
                method.setAccessible(false);
            }
        } catch (Throwable unused) {
            int argb = wallpaperColors.getPrimaryColor().toArgb();
            Color secondaryColor = wallpaperColors.getSecondaryColor();
            int argb2 = secondaryColor != null ? secondaryColor.toArgb() : argb;
            Color tertiaryColor = wallpaperColors.getTertiaryColor();
            i = calculateDarkHints(generateBitmapFromColors(argb, argb2, tertiaryColor != null ? tertiaryColor.toArgb() : argb2));
        }
        if ((i & 2) == 0) {
            z = false;
        }
        if (z) {
            return DarkThemeCheckResult.DARK;
        }
        return DarkThemeCheckResult.LIGHT;
    }
}
