package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C10462R;

public class TabItem extends View {

    /* renamed from: a */
    public final CharSequence f50301a;

    /* renamed from: c */
    public final Drawable f50302c;

    /* renamed from: d */
    public final int f50303d;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C10462R.styleable.TabItem);
        this.f50301a = obtainStyledAttributes.getText(C10462R.styleable.TabItem_android_text);
        this.f50302c = obtainStyledAttributes.getDrawable(C10462R.styleable.TabItem_android_icon);
        this.f50303d = obtainStyledAttributes.getResourceId(C10462R.styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
