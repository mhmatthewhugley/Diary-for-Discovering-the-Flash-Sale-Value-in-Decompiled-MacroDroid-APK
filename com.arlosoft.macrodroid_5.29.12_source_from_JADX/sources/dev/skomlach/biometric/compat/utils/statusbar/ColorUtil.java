package dev.skomlach.biometric.compat.utils.statusbar;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bJ6\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004¨\u0006\u0013"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/statusbar/ColorUtil;", "", "()V", "blend", "", "color1", "color2", "ratio", "", "colorDistance", "r1", "g1", "b1", "r2", "g2", "b2", "isDark", "", "color", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: ColorUtil.kt */
public final class ColorUtil {
    public static final ColorUtil INSTANCE = new ColorUtil();

    private ColorUtil() {
    }

    public static /* synthetic */ int blend$default(ColorUtil colorUtil, int i, int i2, double d, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            d = 0.5d;
        }
        return colorUtil.blend(i, i2, d);
    }

    public final int blend(int i, int i2, double d) {
        float f = (float) d;
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f) + (((float) Color.alpha(i2)) * f2)), (int) ((((float) Color.red(i)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f) + (((float) Color.blue(i2)) * f2)));
    }

    public final double colorDistance(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d4 - d;
        double d8 = d5 - d2;
        double d9 = d6 - d3;
        return Math.sqrt((d7 * d7) + (d8 * d8) + (d9 * d9));
    }

    public final boolean isDark(int i) {
        return ColorUtils.calculateLuminance(i) < 0.5d;
    }

    public final double colorDistance(int i, int i2) {
        return colorDistance((double) (((float) Color.red(i)) / 255.0f), (double) (((float) Color.green(i)) / 255.0f), (double) (((float) Color.blue(i)) / 255.0f), (double) (((float) Color.red(i2)) / 255.0f), (double) (((float) Color.green(i2)) / 255.0f), (double) (((float) Color.blue(i2)) / 255.0f));
    }
}
