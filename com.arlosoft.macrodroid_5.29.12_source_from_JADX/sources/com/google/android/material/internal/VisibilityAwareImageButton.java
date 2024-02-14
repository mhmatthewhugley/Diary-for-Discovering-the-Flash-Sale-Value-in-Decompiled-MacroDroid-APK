package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a */
    private int f49685a;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo58242a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f49685a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f49685a;
    }

    public void setVisibility(int i) {
        mo58242a(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49685a = getVisibility();
    }
}
