package p359p8;

import android.content.Context;
import android.graphics.Color;

/* renamed from: p8.a */
/* compiled from: Utils */
public class C16104a {
    /* renamed from: a */
    public static double m96727a(double d, double d2, double d3) {
        return Math.min(Math.max(d, d2), d3);
    }

    /* renamed from: b */
    public static int m96728b(int i, float f) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: c */
    public static int m96729c(Context context, int i) {
        return Math.round(((float) i) * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    /* renamed from: d */
    public static double m96730d(double d, double d2, double d3, double d4, double d5) {
        return d4 + (((d - d2) / (d3 - d2)) * (d5 - d4));
    }
}
