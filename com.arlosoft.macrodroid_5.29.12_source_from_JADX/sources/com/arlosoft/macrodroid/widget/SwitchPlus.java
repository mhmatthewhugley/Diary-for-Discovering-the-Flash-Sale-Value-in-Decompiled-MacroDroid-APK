package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;

public class SwitchPlus extends SwitchCompat {

    /* renamed from: a */
    private int f15397a;

    /* renamed from: c */
    private int f15398c = Color.argb(255, 128, 128, 128);

    public SwitchPlus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25124b(context);
    }

    /* renamed from: a */
    private void m25123a(boolean z) {
        int i;
        if (z) {
            i = this.f15397a;
        } else {
            i = this.f15398c;
        }
        try {
            Drawable thumbDrawable = getThumbDrawable();
            if (thumbDrawable != null) {
                thumbDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m25124b(Context context) {
        this.f15397a = ContextCompat.getColor(context, C17528R$color.macro_list_switch_on_thumb);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        m25123a(z);
    }

    public void setOffColor(@ColorInt int i) {
        this.f15398c = i;
    }

    public SwitchPlus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25124b(context);
    }
}
