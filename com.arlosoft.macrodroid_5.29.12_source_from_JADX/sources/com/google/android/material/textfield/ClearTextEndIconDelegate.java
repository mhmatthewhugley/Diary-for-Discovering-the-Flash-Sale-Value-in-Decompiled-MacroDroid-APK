package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.textfield.TextInputLayout;

class ClearTextEndIconDelegate extends EndIconDelegate {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final TextWatcher f50406e = new TextWatcher() {
        public void afterTextChanged(@NonNull Editable editable) {
            if (ClearTextEndIconDelegate.this.f50455a.getSuffixText() == null) {
                ClearTextEndIconDelegate clearTextEndIconDelegate = ClearTextEndIconDelegate.this;
                clearTextEndIconDelegate.m69746i(clearTextEndIconDelegate.m69750m());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final View.OnFocusChangeListener f50407f = new View.OnFocusChangeListener() {
        public void onFocusChange(View view, boolean z) {
            ClearTextEndIconDelegate clearTextEndIconDelegate = ClearTextEndIconDelegate.this;
            clearTextEndIconDelegate.m69746i(clearTextEndIconDelegate.m69750m());
        }
    };

    /* renamed from: g */
    private final TextInputLayout.OnEditTextAttachedListener f50408g = new TextInputLayout.OnEditTextAttachedListener() {
        /* renamed from: a */
        public void mo59101a(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(ClearTextEndIconDelegate.this.m69750m());
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(ClearTextEndIconDelegate.this.f50407f);
            ClearTextEndIconDelegate clearTextEndIconDelegate = ClearTextEndIconDelegate.this;
            clearTextEndIconDelegate.f50457c.setOnFocusChangeListener(clearTextEndIconDelegate.f50407f);
            editText.removeTextChangedListener(ClearTextEndIconDelegate.this.f50406e);
            editText.addTextChangedListener(ClearTextEndIconDelegate.this.f50406e);
        }
    };

    /* renamed from: h */
    private final TextInputLayout.OnEndIconChangedListener f50409h = new TextInputLayout.OnEndIconChangedListener() {
        /* renamed from: a */
        public void mo59102a(@NonNull TextInputLayout textInputLayout, int i) {
            final EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new Runnable() {
                    public void run() {
                        editText.removeTextChangedListener(ClearTextEndIconDelegate.this.f50406e);
                    }
                });
                if (editText.getOnFocusChangeListener() == ClearTextEndIconDelegate.this.f50407f) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                if (ClearTextEndIconDelegate.this.f50457c.getOnFocusChangeListener() == ClearTextEndIconDelegate.this.f50407f) {
                    ClearTextEndIconDelegate.this.f50457c.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    };

    /* renamed from: i */
    private AnimatorSet f50410i;

    /* renamed from: j */
    private ValueAnimator f50411j;

    ClearTextEndIconDelegate(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        super(textInputLayout, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m69746i(boolean z) {
        boolean z2 = this.f50455a.mo59167L() == z;
        if (z && !this.f50410i.isRunning()) {
            this.f50411j.cancel();
            this.f50410i.start();
            if (z2) {
                this.f50410i.end();
            }
        } else if (!z) {
            this.f50410i.cancel();
            this.f50411j.start();
            if (z2) {
                this.f50411j.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m69747j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.f48521a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                ClearTextEndIconDelegate.this.f50457c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m69748k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(AnimationUtils.f48524d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ClearTextEndIconDelegate.this.f50457c.setScaleX(floatValue);
                ClearTextEndIconDelegate.this.f50457c.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }

    /* renamed from: l */
    private void m69749l() {
        ValueAnimator k = m69748k();
        ValueAnimator j = m69747j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50410i = animatorSet;
        animatorSet.playTogether(new Animator[]{k, j});
        this.f50410i.addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                ClearTextEndIconDelegate.this.f50455a.setEndIconVisible(true);
            }
        });
        ValueAnimator j2 = m69747j(1.0f, 0.0f);
        this.f50411j = j2;
        j2.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                ClearTextEndIconDelegate.this.f50455a.setEndIconVisible(false);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m69750m() {
        EditText editText = this.f50455a.getEditText();
        return editText != null && (editText.hasFocus() || this.f50457c.hasFocus()) && editText.getText().length() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59095a() {
        TextInputLayout textInputLayout = this.f50455a;
        int i = this.f50458d;
        if (i == 0) {
            i = C10462R.C10464drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f50455a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C10462R.string.clear_text_end_icon_content_description));
        this.f50455a.setEndIconOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Editable text = ClearTextEndIconDelegate.this.f50455a.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                ClearTextEndIconDelegate.this.f50455a.mo59172X();
            }
        });
        this.f50455a.mo59180e(this.f50408g);
        this.f50455a.mo59181f(this.f50409h);
        m69749l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo59096c(boolean z) {
        if (this.f50455a.getSuffixText() != null) {
            m69746i(z);
        }
    }
}
