package com.takisoft.preferencex;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.preference.EditTextPreference;

public class EditTextPreference extends androidx.preference.EditTextPreference {
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public EditTextPreference.OnBindEditTextListener f57634a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SparseArrayCompat<TypedValue> f57635c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f57636d;

    /* renamed from: com.takisoft.preferencex.EditTextPreference$a */
    class C11741a implements EditTextPreference.OnBindEditTextListener {
        C11741a() {
        }

        public void onBindEditText(@NonNull EditText editText) {
            if (!EditTextPreference.this.f57636d) {
                EditTextPreference.this.m81928g(editText);
            }
            int size = EditTextPreference.this.f57635c.size();
            for (int i = 0; i < size; i++) {
                int keyAt = EditTextPreference.this.f57635c.keyAt(i);
                int i2 = ((TypedValue) EditTextPreference.this.f57635c.valueAt(i)).data;
                switch (keyAt) {
                    case 16843091:
                        editText.setMaxLines(i2);
                        break;
                    case 16843092:
                        editText.setLines(i2);
                        break;
                    case 16843094:
                        editText.setMinLines(i2);
                        break;
                    case 16843095:
                        editText.setMaxEms(i2);
                        break;
                    case 16843096:
                        editText.setEms(i2);
                        break;
                    case 16843098:
                        editText.setMinEms(i2);
                        break;
                    case 16843296:
                        editText.setInputType(i2);
                        break;
                    case 16843660:
                        boolean z = true;
                        if (i2 != 1) {
                            z = false;
                        }
                        editText.setAllCaps(z);
                        break;
                }
            }
            if (EditTextPreference.this.f57634a != null) {
                EditTextPreference.this.f57634a.onBindEditText(editText);
            }
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextPreferenceStyle);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m81928g(@NonNull View view) {
        View findViewById;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (findViewById = ((ViewGroup) parent).findViewById(16908299)) != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                findViewById.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: i */
    private void m81929i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                int attributeNameResource = attributeSet.getAttributeNameResource(i);
                int attributeResourceValue = attributeSet.getAttributeResourceValue(i, 0);
                TypedValue typedValue = null;
                switch (attributeNameResource) {
                    case 16843091:
                    case 16843092:
                    case 16843094:
                    case 16843095:
                    case 16843096:
                    case 16843098:
                        typedValue = new TypedValue();
                        typedValue.resourceId = attributeResourceValue;
                        typedValue.data = attributeSet.getAttributeIntValue(i, -1);
                        typedValue.type = 16;
                        break;
                    case 16843296:
                        typedValue = new TypedValue();
                        typedValue.resourceId = attributeResourceValue;
                        typedValue.data = attributeSet.getAttributeIntValue(i, 1);
                        typedValue.type = 17;
                        break;
                    case 16843660:
                        typedValue = new TypedValue();
                        typedValue.resourceId = attributeResourceValue;
                        typedValue.data = attributeSet.getAttributeBooleanValue(i, false) ? 1 : 0;
                        typedValue.type = 18;
                        break;
                }
                if (typedValue != null) {
                    this.f57635c.put(attributeNameResource, typedValue);
                }
            }
        }
    }

    public void setOnBindEditTextListener(@Nullable EditTextPreference.OnBindEditTextListener onBindEditTextListener) {
        this.f57634a = onBindEditTextListener;
    }

    public void setText(String str) {
        String text = getText();
        super.setText(str);
        if (!TextUtils.equals(str, text)) {
            notifyChanged();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f57635c = new SparseArrayCompat<>();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.EditTextPreference, i, i2);
        this.f57636d = obtainStyledAttributes.getBoolean(R$styleable.EditTextPreference_pref_disableMessagePaddingFix, false);
        obtainStyledAttributes.recycle();
        m81929i(attributeSet);
        super.setOnBindEditTextListener(new C11741a());
    }
}
