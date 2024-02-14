package com.takisoft.preferencex;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.android.dex.DexFormat;
import com.android.p023dx.p026io.Opcodes;

@Deprecated
public class AutoSummaryEditTextPreference extends EditTextPreference {

    /* renamed from: f */
    private CharSequence f57629f;

    /* renamed from: g */
    private CharSequence f57630g;

    /* renamed from: o */
    private String f57631o;

    /* renamed from: p */
    private int f57632p;

    /* renamed from: s */
    private int f57633s;

    public AutoSummaryEditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextPreferenceStyle);
    }

    public CharSequence getSummary() {
        String text = getText();
        if (!(!TextUtils.isEmpty(text))) {
            return this.f57630g;
        }
        int i = this.f57633s;
        if ((i & 16) == 16 || (i & 128) == 128 || (i & Opcodes.SHL_INT_LIT8) == 224) {
            int i2 = this.f57632p;
            if (i2 <= 0) {
                i2 = text.length();
            }
            text = new String(new char[i2]).replaceAll(DexFormat.MAGIC_SUFFIX, this.f57631o);
        }
        CharSequence charSequence = this.f57629f;
        if (charSequence == null) {
            return text;
        }
        return String.format(charSequence.toString(), new Object[]{text});
    }

    public void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null && this.f57630g != null) {
            this.f57630g = null;
        } else if (charSequence != null && !charSequence.equals(this.f57630g)) {
            this.f57630g = charSequence.toString();
        }
    }

    public AutoSummaryEditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AutoSummaryEditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f57633s = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AutoSummaryEditTextPreference, i, 0);
        this.f57629f = obtainStyledAttributes.getText(R$styleable.AutoSummaryEditTextPreference_pref_summaryHasText);
        this.f57631o = obtainStyledAttributes.getString(R$styleable.AutoSummaryEditTextPreference_pref_summaryPasswordSubstitute);
        this.f57632p = obtainStyledAttributes.getInt(R$styleable.f57643x76bdd3b, 5);
        if (this.f57631o == null) {
            this.f57631o = "•";
        }
        obtainStyledAttributes.recycle();
        this.f57630g = super.getSummary();
        for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
            if (16843296 == attributeSet.getAttributeNameResource(i3)) {
                this.f57633s = attributeSet.getAttributeIntValue(i3, 1);
                return;
            }
        }
    }
}
