package p222c8;

import android.graphics.Color;
import androidx.annotation.ColorInt;

/* renamed from: c8.b */
/* compiled from: ColorUtil */
public final class C11160b {
    @ColorInt
    /* renamed from: a */
    public static int m74920a(@ColorInt int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.5f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: b */
    public static boolean m74921b(@ColorInt int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 160.0d;
    }
}
