package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.resources.MaterialResources;
import java.util.ArrayList;
import java.util.List;

final class IndicatorViewController {

    /* renamed from: a */
    private final Context f50459a;
    @NonNull

    /* renamed from: b */
    private final TextInputLayout f50460b;

    /* renamed from: c */
    private LinearLayout f50461c;

    /* renamed from: d */
    private int f50462d;

    /* renamed from: e */
    private FrameLayout f50463e;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public Animator f50464f;

    /* renamed from: g */
    private final float f50465g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f50466h;

    /* renamed from: i */
    private int f50467i;
    @Nullable

    /* renamed from: j */
    private CharSequence f50468j;

    /* renamed from: k */
    private boolean f50469k;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: l */
    public TextView f50470l;
    @Nullable

    /* renamed from: m */
    private CharSequence f50471m;

    /* renamed from: n */
    private int f50472n;
    @Nullable

    /* renamed from: o */
    private ColorStateList f50473o;

    /* renamed from: p */
    private CharSequence f50474p;

    /* renamed from: q */
    private boolean f50475q;
    @Nullable

    /* renamed from: r */
    private TextView f50476r;

    /* renamed from: s */
    private int f50477s;
    @Nullable

    /* renamed from: t */
    private ColorStateList f50478t;

    /* renamed from: u */
    private Typeface f50479u;

    public IndicatorViewController(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f50459a = context;
        this.f50460b = textInputLayout;
        this.f50465g = (float) context.getResources().getDimensionPixelSize(C10462R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    private void m69805A(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = m69817l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = m69817l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.f50466h = i2;
        }
    }

    /* renamed from: I */
    private void m69806I(@Nullable TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: K */
    private void m69807K(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    private boolean m69808L(@Nullable TextView textView, @Nullable CharSequence charSequence) {
        return ViewCompat.isLaidOut(this.f50460b) && this.f50460b.isEnabled() && (this.f50467i != this.f50466h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: O */
    private void m69809O(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f50464f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m69814h(arrayList2, this.f50475q, this.f50476r, 2, i3, i4);
                m69814h(arrayList2, this.f50469k, this.f50470l, 1, i3, i4);
                AnimatorSetCompat.m67223a(animatorSet, arrayList);
                final TextView l = m69817l(i);
                final TextView l2 = m69817l(i2);
                final int i5 = i2;
                final int i6 = i;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        int unused = IndicatorViewController.this.f50466h = i5;
                        Animator unused2 = IndicatorViewController.this.f50464f = null;
                        TextView textView = l;
                        if (textView != null) {
                            textView.setVisibility(4);
                            if (i6 == 1 && IndicatorViewController.this.f50470l != null) {
                                IndicatorViewController.this.f50470l.setText((CharSequence) null);
                            }
                        }
                        TextView textView2 = l2;
                        if (textView2 != null) {
                            textView2.setTranslationY(0.0f);
                            l2.setAlpha(1.0f);
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        TextView textView = l2;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }
                });
                animatorSet.start();
            } else {
                m69805A(i, i2);
            }
            this.f50460b.mo59325t0();
            this.f50460b.mo59326w0(z2);
            this.f50460b.mo59166G0();
        }
    }

    /* renamed from: f */
    private boolean m69813f() {
        return (this.f50461c == null || this.f50460b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m69814h(@NonNull List<Animator> list, boolean z, @Nullable TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m69815i(textView, i3 == i));
                if (i3 == i) {
                    list.add(m69816j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m69815i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(AnimationUtils.f48521a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m69816j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f50465g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(AnimationUtils.f48524d);
        return ofFloat;
    }

    @Nullable
    /* renamed from: l */
    private TextView m69817l(int i) {
        if (i == 1) {
            return this.f50470l;
        }
        if (i != 2) {
            return null;
        }
        return this.f50476r;
    }

    /* renamed from: s */
    private int m69818s(boolean z, @DimenRes int i, int i2) {
        return z ? this.f50459a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: v */
    private boolean m69819v(int i) {
        if (i != 1 || this.f50470l == null || TextUtils.isEmpty(this.f50468j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo59123B(@Nullable CharSequence charSequence) {
        this.f50471m = charSequence;
        TextView textView = this.f50470l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo59124C(boolean z) {
        if (this.f50469k != z) {
            mo59135g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f50459a);
                this.f50470l = appCompatTextView;
                appCompatTextView.setId(C10462R.C10465id.textinput_error);
                this.f50470l.setTextAlignment(5);
                Typeface typeface = this.f50479u;
                if (typeface != null) {
                    this.f50470l.setTypeface(typeface);
                }
                mo59125D(this.f50472n);
                mo59126E(this.f50473o);
                mo59123B(this.f50471m);
                this.f50470l.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.f50470l, 1);
                mo59133d(this.f50470l, 0);
            } else {
                mo59143t();
                mo59148z(this.f50470l, 0);
                this.f50470l = null;
                this.f50460b.mo59325t0();
                this.f50460b.mo59166G0();
            }
            this.f50469k = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo59125D(@StyleRes int i) {
        this.f50472n = i;
        TextView textView = this.f50470l;
        if (textView != null) {
            this.f50460b.mo59182g0(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo59126E(@Nullable ColorStateList colorStateList) {
        this.f50473o = colorStateList;
        TextView textView = this.f50470l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo59127F(@StyleRes int i) {
        this.f50477s = i;
        TextView textView = this.f50476r;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo59128G(boolean z) {
        if (this.f50475q != z) {
            mo59135g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f50459a);
                this.f50476r = appCompatTextView;
                appCompatTextView.setId(C10462R.C10465id.textinput_helper_text);
                this.f50476r.setTextAlignment(5);
                Typeface typeface = this.f50479u;
                if (typeface != null) {
                    this.f50476r.setTypeface(typeface);
                }
                this.f50476r.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.f50476r, 1);
                mo59127F(this.f50477s);
                mo59129H(this.f50478t);
                mo59133d(this.f50476r, 1);
            } else {
                mo59144u();
                mo59148z(this.f50476r, 1);
                this.f50476r = null;
                this.f50460b.mo59325t0();
                this.f50460b.mo59166G0();
            }
            this.f50475q = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo59129H(@Nullable ColorStateList colorStateList) {
        this.f50478t = colorStateList;
        TextView textView = this.f50476r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo59130J(Typeface typeface) {
        if (typeface != this.f50479u) {
            this.f50479u = typeface;
            m69806I(this.f50470l, typeface);
            m69806I(this.f50476r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo59131M(CharSequence charSequence) {
        mo59135g();
        this.f50468j = charSequence;
        this.f50470l.setText(charSequence);
        int i = this.f50466h;
        if (i != 1) {
            this.f50467i = 1;
        }
        m69809O(i, this.f50467i, m69808L(this.f50470l, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo59132N(CharSequence charSequence) {
        mo59135g();
        this.f50474p = charSequence;
        this.f50476r.setText(charSequence);
        int i = this.f50466h;
        if (i != 2) {
            this.f50467i = 2;
        }
        m69809O(i, this.f50467i, m69808L(this.f50476r, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo59133d(TextView textView, int i) {
        if (this.f50461c == null && this.f50463e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f50459a);
            this.f50461c = linearLayout;
            linearLayout.setOrientation(0);
            this.f50460b.addView(this.f50461c, -1, -2);
            this.f50463e = new FrameLayout(this.f50459a);
            this.f50461c.addView(this.f50463e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f50460b.getEditText() != null) {
                mo59134e();
            }
        }
        if (mo59145w(i)) {
            this.f50463e.setVisibility(0);
            this.f50463e.addView(textView);
        } else {
            this.f50461c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f50461c.setVisibility(0);
        this.f50462d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo59134e() {
        if (m69813f()) {
            EditText editText = this.f50460b.getEditText();
            boolean g = MaterialResources.m69127g(this.f50459a);
            LinearLayout linearLayout = this.f50461c;
            int i = C10462R.dimen.material_helper_text_font_1_3_padding_horizontal;
            ViewCompat.setPaddingRelative(linearLayout, m69818s(g, i, ViewCompat.getPaddingStart(editText)), m69818s(g, C10462R.dimen.material_helper_text_font_1_3_padding_top, this.f50459a.getResources().getDimensionPixelSize(C10462R.dimen.material_helper_text_default_padding_top)), m69818s(g, i, ViewCompat.getPaddingEnd(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo59135g() {
        Animator animator = this.f50464f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo59136k() {
        return m69819v(this.f50467i);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: m */
    public CharSequence mo59137m() {
        return this.f50471m;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: n */
    public CharSequence mo59138n() {
        return this.f50468j;
    }

    /* access modifiers changed from: package-private */
    @ColorInt
    /* renamed from: o */
    public int mo59139o() {
        TextView textView = this.f50470l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: p */
    public ColorStateList mo59140p() {
        TextView textView = this.f50470l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence mo59141q() {
        return this.f50474p;
    }

    /* access modifiers changed from: package-private */
    @ColorInt
    /* renamed from: r */
    public int mo59142r() {
        TextView textView = this.f50476r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo59143t() {
        this.f50468j = null;
        mo59135g();
        if (this.f50466h == 1) {
            if (!this.f50475q || TextUtils.isEmpty(this.f50474p)) {
                this.f50467i = 0;
            } else {
                this.f50467i = 2;
            }
        }
        m69809O(this.f50466h, this.f50467i, m69808L(this.f50470l, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo59144u() {
        mo59135g();
        int i = this.f50466h;
        if (i == 2) {
            this.f50467i = 0;
        }
        m69809O(i, this.f50467i, m69808L(this.f50476r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo59145w(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo59146x() {
        return this.f50469k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo59147y() {
        return this.f50475q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo59148z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f50461c != null) {
            if (!mo59145w(i) || (frameLayout = this.f50463e) == null) {
                this.f50461c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f50462d - 1;
            this.f50462d = i2;
            m69807K(this.f50461c, i2);
        }
    }
}
