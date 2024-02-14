package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;

public class ElevationOverlayProvider {

    /* renamed from: f */
    private static final int f49302f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a */
    private final boolean f49303a;

    /* renamed from: b */
    private final int f49304b;

    /* renamed from: c */
    private final int f49305c;

    /* renamed from: d */
    private final int f49306d;

    /* renamed from: e */
    private final float f49307e;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.m69117b(context, C10462R.attr.elevationOverlayEnabled, false), MaterialColors.m68102b(context, C10462R.attr.elevationOverlayColor, 0), MaterialColors.m68102b(context, C10462R.attr.elevationOverlayAccentColor, 0), MaterialColors.m68102b(context, C10462R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: f */
    private boolean m68382f(@ColorInt int i) {
        return ColorUtils.setAlphaComponent(i, 255) == this.f49306d;
    }

    /* renamed from: a */
    public float mo57758a(float f) {
        float f2 = this.f49307e;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    /* renamed from: b */
    public int mo57759b(@ColorInt int i, float f) {
        int i2;
        float a = mo57758a(f);
        int alpha = Color.alpha(i);
        int h = MaterialColors.m68108h(ColorUtils.setAlphaComponent(i, 255), this.f49304b, a);
        if (a > 0.0f && (i2 = this.f49305c) != 0) {
            h = MaterialColors.m68107g(h, ColorUtils.setAlphaComponent(i2, f49302f));
        }
        return ColorUtils.setAlphaComponent(h, alpha);
    }

    @ColorInt
    /* renamed from: c */
    public int mo57760c(@ColorInt int i, float f) {
        return (!this.f49303a || !m68382f(i)) ? i : mo57759b(i, f);
    }

    @ColorInt
    /* renamed from: d */
    public int mo57761d(float f) {
        return mo57760c(this.f49306d, f);
    }

    /* renamed from: e */
    public boolean mo57762e() {
        return this.f49303a;
    }

    public ElevationOverlayProvider(boolean z, @ColorInt int i, @ColorInt int i2, @ColorInt int i3, float f) {
        this.f49303a = z;
        this.f49304b = i;
        this.f49305c = i2;
        this.f49306d = i3;
        this.f49307e = f;
    }
}
