package com.firebase.p073ui.auth.p074ui.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.firebase.p073ui.auth.R$styleable;
import com.google.android.material.textfield.TextInputEditText;

/* renamed from: com.firebase.ui.auth.ui.phone.SpacedEditText */
public final class SpacedEditText extends TextInputEditText {

    /* renamed from: d */
    private float f16125d;

    /* renamed from: f */
    private SpannableStringBuilder f16126f = new SpannableStringBuilder("");

    public SpacedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo34246d(context, attributeSet);
    }

    /* renamed from: b */
    private SpannableStringBuilder m26039b(CharSequence charSequence) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = charSequence.length();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            i = length - 1;
            if (i3 >= i) {
                break;
            }
            spannableStringBuilder.append(charSequence.charAt(i3));
            spannableStringBuilder.append(" ");
            i2 += 2;
            spannableStringBuilder.setSpan(new ScaleXSpan(this.f16125d), i2, i2 + 1, 33);
            i3++;
        }
        if (length != 0) {
            spannableStringBuilder.append(charSequence.charAt(i));
        }
        return spannableStringBuilder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo34246d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SpacedEditText);
        this.f16125d = obtainStyledAttributes.getFloat(R$styleable.SpacedEditText_spacingProportion, 1.0f);
        obtainStyledAttributes.recycle();
    }

    public Editable getUnspacedText() {
        return this.f16126f;
    }

    public void setSelection(int i) {
        int min = Math.min(Math.max((i * 2) - 1, 0), (this.f16126f.length() * 2) - 1);
        try {
            super.setSelection(min);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage() + ", requestedIndex=" + i + ", newIndex= " + min + ", originalText=" + this.f16126f);
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f16126f = new SpannableStringBuilder(charSequence);
        super.setText(m26039b(charSequence), TextView.BufferType.SPANNABLE);
    }
}
