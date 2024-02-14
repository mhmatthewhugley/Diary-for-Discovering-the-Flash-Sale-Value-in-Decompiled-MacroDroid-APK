package com.firebase.p073ui.auth.util.p075ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.TextViewCompat;
import com.firebase.p073ui.auth.R$styleable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.util.ui.SupportVectorDrawablesButton */
public class SupportVectorDrawablesButton extends AppCompatButton {
    public SupportVectorDrawablesButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26050a(attributeSet);
    }

    /* renamed from: a */
    private void m26050a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.SupportVectorDrawablesButton);
            TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds((TextView) this, obtainStyledAttributes.getDrawable(R$styleable.SupportVectorDrawablesButton_drawableStartCompat), obtainStyledAttributes.getDrawable(R$styleable.SupportVectorDrawablesButton_drawableTopCompat), obtainStyledAttributes.getDrawable(R$styleable.SupportVectorDrawablesButton_drawableEndCompat), obtainStyledAttributes.getDrawable(R$styleable.SupportVectorDrawablesButton_drawableBottomCompat));
            obtainStyledAttributes.recycle();
        }
    }

    public SupportVectorDrawablesButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26050a(attributeSet);
    }
}
