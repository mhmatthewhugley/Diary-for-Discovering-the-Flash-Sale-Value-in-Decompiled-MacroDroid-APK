package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Chip f50601a;

    /* renamed from: c */
    private final TextInputLayout f50602c;

    /* renamed from: d */
    private final EditText f50603d;

    /* renamed from: f */
    private TextWatcher f50604f;

    /* renamed from: g */
    private TextView f50605g;

    private class TextFormatter extends TextWatcherAdapter {
        private TextFormatter() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f50601a.setText(ChipTextInputComboView.this.m69960d("00"));
            } else {
                ChipTextInputComboView.this.f50601a.setText(ChipTextInputComboView.this.m69960d(editable));
            }
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m69960d(CharSequence charSequence) {
        return TimeModel.m70012a(getResources(), charSequence);
    }

    /* renamed from: h */
    private void m69961h() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f50603d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    /* renamed from: c */
    public void mo59340c(InputFilter inputFilter) {
        InputFilter[] filters = this.f50603d.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f50603d.setFilters(inputFilterArr);
    }

    /* renamed from: e */
    public TextInputLayout mo59341e() {
        return this.f50602c;
    }

    /* renamed from: f */
    public void mo59342f(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f50601a, accessibilityDelegateCompat);
    }

    /* renamed from: g */
    public void mo59343g(CharSequence charSequence) {
        this.f50601a.setText(m69960d(charSequence));
        if (!TextUtils.isEmpty(this.f50603d.getText())) {
            this.f50603d.removeTextChangedListener(this.f50604f);
            this.f50603d.setText((CharSequence) null);
            this.f50603d.addTextChangedListener(this.f50604f);
        }
    }

    public boolean isChecked() {
        return this.f50601a.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m69961h();
    }

    public void setChecked(boolean z) {
        this.f50601a.setChecked(z);
        int i = 0;
        this.f50603d.setVisibility(z ? 0 : 4);
        Chip chip = this.f50601a;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            ViewUtils.m68847n(this.f50603d);
            if (!TextUtils.isEmpty(this.f50603d.getText())) {
                EditText editText = this.f50603d;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f50601a.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f50601a.setTag(i, obj);
    }

    public void toggle() {
        this.f50601a.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C10462R.C10467layout.material_time_chip, this, false);
        this.f50601a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C10462R.C10467layout.material_time_input, this, false);
        this.f50602c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f50603d = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter();
        this.f50604f = textFormatter;
        editText.addTextChangedListener(textFormatter);
        m69961h();
        addView(chip);
        addView(textInputLayout);
        this.f50605g = (TextView) findViewById(C10462R.C10465id.material_label);
        editText.setSaveEnabled(false);
    }
}
