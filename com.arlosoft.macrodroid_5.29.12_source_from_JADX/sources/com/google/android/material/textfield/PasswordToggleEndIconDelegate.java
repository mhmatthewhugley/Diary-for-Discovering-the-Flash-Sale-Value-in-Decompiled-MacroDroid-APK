package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.C10462R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;

class PasswordToggleEndIconDelegate extends EndIconDelegate {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final TextWatcher f50489e = new TextWatcherAdapter() {
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = PasswordToggleEndIconDelegate.this;
            passwordToggleEndIconDelegate.f50457c.setChecked(!passwordToggleEndIconDelegate.m69854g());
        }
    };

    /* renamed from: f */
    private final TextInputLayout.OnEditTextAttachedListener f50490f = new TextInputLayout.OnEditTextAttachedListener() {
        /* renamed from: a */
        public void mo59101a(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = PasswordToggleEndIconDelegate.this;
            passwordToggleEndIconDelegate.f50457c.setChecked(!passwordToggleEndIconDelegate.m69854g());
            editText.removeTextChangedListener(PasswordToggleEndIconDelegate.this.f50489e);
            editText.addTextChangedListener(PasswordToggleEndIconDelegate.this.f50489e);
        }
    };

    /* renamed from: g */
    private final TextInputLayout.OnEndIconChangedListener f50491g = new TextInputLayout.OnEndIconChangedListener() {
        /* renamed from: a */
        public void mo59102a(@NonNull TextInputLayout textInputLayout, int i) {
            final EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new Runnable() {
                    public void run() {
                        editText.removeTextChangedListener(PasswordToggleEndIconDelegate.this.f50489e);
                    }
                });
            }
        }
    };

    PasswordToggleEndIconDelegate(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        super(textInputLayout, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m69854g() {
        EditText editText = this.f50455a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m69855h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59095a() {
        TextInputLayout textInputLayout = this.f50455a;
        int i = this.f50458d;
        if (i == 0) {
            i = C10462R.C10464drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f50455a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C10462R.string.password_toggle_content_description));
        this.f50455a.setEndIconOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText editText = PasswordToggleEndIconDelegate.this.f50455a.getEditText();
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    if (PasswordToggleEndIconDelegate.this.m69854g()) {
                        editText.setTransformationMethod((TransformationMethod) null);
                    } else {
                        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        editText.setSelection(selectionEnd);
                    }
                    PasswordToggleEndIconDelegate.this.f50455a.mo59172X();
                }
            }
        });
        this.f50455a.mo59180e(this.f50490f);
        this.f50455a.mo59181f(this.f50491g);
        EditText editText = this.f50455a.getEditText();
        if (m69855h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
