package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.base.C1733R;
import com.google.android.gms.common.util.DeviceProperties;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    /* renamed from: b */
    private static final int m4619b(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException("Unknown color scheme: " + i);
    }

    /* renamed from: a */
    public final void mo21748a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C1733R.C1735drawable.common_google_signin_btn_icon_dark;
        int i5 = C1733R.C1735drawable.common_google_signin_btn_icon_light;
        int b = m4619b(i2, i4, i5, i5);
        int i6 = C1733R.C1735drawable.common_google_signin_btn_text_dark;
        int i7 = C1733R.C1735drawable.common_google_signin_btn_text_light;
        int b2 = m4619b(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            b = b2;
        } else if (i != 2) {
            throw new IllegalStateException("Unknown button size: " + i);
        }
        Drawable wrap = DrawableCompat.wrap(resources.getDrawable(b));
        DrawableCompat.setTintList(wrap, resources.getColorStateList(C1733R.C1734color.common_google_signin_btn_tint));
        DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(wrap);
        int i8 = C1733R.C1734color.common_google_signin_btn_text_dark;
        int i9 = C1733R.C1734color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.m4488k(resources.getColorStateList(m4619b(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(C1733R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C1733R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException("Unknown button size: " + i);
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.m4880f(getContext())) {
            setGravity(19);
        }
    }
}
