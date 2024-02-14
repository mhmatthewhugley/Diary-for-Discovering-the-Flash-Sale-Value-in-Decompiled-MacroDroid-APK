package p200z3;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: z3.a */
/* compiled from: CubeInRotationTransformation */
public class C10435a implements ViewPager.PageTransformer {
    public void transformPage(View view, float f) {
        if (f < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f <= 1.0f) {
            float abs = ((1.0f - Math.abs(f)) * 0.100000024f) + 0.9f;
            view.setScaleX(abs);
            view.setScaleY(abs);
            view.setAlpha(Math.max(0.98f, 1.0f - Math.abs(f)));
        } else {
            view.setAlpha(0.0f);
        }
    }
}
