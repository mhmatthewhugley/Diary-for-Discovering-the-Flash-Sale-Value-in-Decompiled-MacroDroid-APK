package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {

    /* renamed from: e1 */
    private static final int f50500e1 = C10462R.style.Widget_Design_TextInputLayout;

    /* renamed from: A */
    boolean f50501A;

    /* renamed from: A0 */
    private final LinkedHashSet<OnEndIconChangedListener> f50502A0;

    /* renamed from: B */
    private int f50503B;

    /* renamed from: B0 */
    private ColorStateList f50504B0;

    /* renamed from: C */
    private boolean f50505C;

    /* renamed from: C0 */
    private boolean f50506C0;
    @Nullable

    /* renamed from: D */
    private TextView f50507D;

    /* renamed from: D0 */
    private PorterDuff.Mode f50508D0;

    /* renamed from: E */
    private int f50509E;

    /* renamed from: E0 */
    private boolean f50510E0;

    /* renamed from: F */
    private int f50511F;
    @Nullable

    /* renamed from: F0 */
    private Drawable f50512F0;

    /* renamed from: G */
    private CharSequence f50513G;

    /* renamed from: G0 */
    private int f50514G0;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f50515H;

    /* renamed from: H0 */
    private Drawable f50516H0;

    /* renamed from: I */
    private TextView f50517I;

    /* renamed from: I0 */
    private View.OnLongClickListener f50518I0;
    @Nullable

    /* renamed from: J */
    private ColorStateList f50519J;

    /* renamed from: J0 */
    private View.OnLongClickListener f50520J0;

    /* renamed from: K */
    private int f50521K;
    @NonNull

    /* renamed from: K0 */
    private final CheckableImageButton f50522K0;
    @Nullable

    /* renamed from: L */
    private Fade f50523L;

    /* renamed from: L0 */
    private ColorStateList f50524L0;
    @Nullable

    /* renamed from: M */
    private Fade f50525M;

    /* renamed from: M0 */
    private ColorStateList f50526M0;
    @Nullable

    /* renamed from: N */
    private ColorStateList f50527N;

    /* renamed from: N0 */
    private ColorStateList f50528N0;
    @Nullable

    /* renamed from: O */
    private ColorStateList f50529O;
    @ColorInt

    /* renamed from: O0 */
    private int f50530O0;
    @Nullable

    /* renamed from: P */
    private CharSequence f50531P;
    @ColorInt

    /* renamed from: P0 */
    private int f50532P0;
    @NonNull

    /* renamed from: Q */
    private final TextView f50533Q;
    @ColorInt

    /* renamed from: Q0 */
    private int f50534Q0;
    @Nullable

    /* renamed from: R */
    private CharSequence f50535R;

    /* renamed from: R0 */
    private ColorStateList f50536R0;
    @NonNull

    /* renamed from: S */
    private final TextView f50537S;
    @ColorInt

    /* renamed from: S0 */
    private int f50538S0;

    /* renamed from: T */
    private boolean f50539T;
    @ColorInt

    /* renamed from: T0 */
    private int f50540T0;

    /* renamed from: U */
    private CharSequence f50541U;
    @ColorInt

    /* renamed from: U0 */
    private int f50542U0;

    /* renamed from: V */
    private boolean f50543V;
    @ColorInt

    /* renamed from: V0 */
    private int f50544V0;
    @Nullable

    /* renamed from: W */
    private MaterialShapeDrawable f50545W;
    @ColorInt

    /* renamed from: W0 */
    private int f50546W0;

    /* renamed from: X0 */
    private boolean f50547X0;

    /* renamed from: Y0 */
    final CollapsingTextHelper f50548Y0;

    /* renamed from: Z0 */
    private boolean f50549Z0;
    @NonNull

    /* renamed from: a */
    private final FrameLayout f50550a;
    @Nullable

    /* renamed from: a0 */
    private MaterialShapeDrawable f50551a0;

    /* renamed from: a1 */
    private boolean f50552a1;
    @NonNull

    /* renamed from: b0 */
    private ShapeAppearanceModel f50553b0;

    /* renamed from: b1 */
    private ValueAnimator f50554b1;
    @NonNull

    /* renamed from: c */
    private final LinearLayout f50555c;

    /* renamed from: c0 */
    private final int f50556c0;

    /* renamed from: c1 */
    private boolean f50557c1;
    @NonNull

    /* renamed from: d */
    private final LinearLayout f50558d;

    /* renamed from: d0 */
    private int f50559d0;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public boolean f50560d1;

    /* renamed from: e0 */
    private int f50561e0;
    @NonNull

    /* renamed from: f */
    private final FrameLayout f50562f;

    /* renamed from: f0 */
    private int f50563f0;

    /* renamed from: g */
    EditText f50564g;

    /* renamed from: g0 */
    private int f50565g0;

    /* renamed from: h0 */
    private int f50566h0;
    @ColorInt

    /* renamed from: i0 */
    private int f50567i0;
    @ColorInt

    /* renamed from: j0 */
    private int f50568j0;

    /* renamed from: k0 */
    private final Rect f50569k0;

    /* renamed from: l0 */
    private final Rect f50570l0;

    /* renamed from: m0 */
    private final RectF f50571m0;

    /* renamed from: n0 */
    private Typeface f50572n0;

    /* renamed from: o */
    private CharSequence f50573o;
    @NonNull

    /* renamed from: o0 */
    private final CheckableImageButton f50574o0;

    /* renamed from: p */
    private int f50575p;

    /* renamed from: p0 */
    private ColorStateList f50576p0;

    /* renamed from: q0 */
    private boolean f50577q0;

    /* renamed from: r0 */
    private PorterDuff.Mode f50578r0;

    /* renamed from: s */
    private int f50579s;

    /* renamed from: s0 */
    private boolean f50580s0;
    @Nullable

    /* renamed from: t0 */
    private Drawable f50581t0;

    /* renamed from: u0 */
    private int f50582u0;

    /* renamed from: v0 */
    private View.OnLongClickListener f50583v0;

    /* renamed from: w0 */
    private final LinkedHashSet<OnEditTextAttachedListener> f50584w0;

    /* renamed from: x0 */
    private int f50585x0;

    /* renamed from: y0 */
    private final SparseArray<EndIconDelegate> f50586y0;

    /* renamed from: z */
    private final IndicatorViewController f50587z;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: z0 */
    public final CheckableImageButton f50588z0;

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {

        /* renamed from: a */
        private final TextInputLayout f50593a;

        public AccessibilityDelegate(@NonNull TextInputLayout textInputLayout) {
            this.f50593a = textInputLayout;
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.f50593a.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f50593a.getHint();
            CharSequence error = this.f50593a.getError();
            CharSequence placeholderText = this.f50593a.getPlaceholderText();
            int counterMaxLength = this.f50593a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f50593a.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f50593a.mo59169O();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                accessibilityNodeInfoCompat.setText(charSequence);
                if (z3 && placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(charSequence);
                } else {
                    if (z) {
                        charSequence = text + ", " + charSequence;
                    }
                    accessibilityNodeInfoCompat.setText(charSequence);
                }
                accessibilityNodeInfoCompat.setShowingHintText(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(C10462R.C10465id.textinput_helper_text);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface OnEditTextAttachedListener {
        /* renamed from: a */
        void mo59101a(@NonNull TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        /* renamed from: a */
        void mo59102a(@NonNull TextInputLayout textInputLayout, int i);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            @Nullable
            /* renamed from: a */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @NonNull
            /* renamed from: b */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @NonNull
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        @Nullable

        /* renamed from: a */
        CharSequence f50594a;

        /* renamed from: c */
        boolean f50595c;
        @Nullable

        /* renamed from: d */
        CharSequence f50596d;
        @Nullable

        /* renamed from: f */
        CharSequence f50597f;
        @Nullable

        /* renamed from: g */
        CharSequence f50598g;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f50594a + " hint=" + this.f50596d + " helperText=" + this.f50597f + " placeholderText=" + this.f50598g + "}";
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f50594a, parcel, i);
            parcel.writeInt(this.f50595c ? 1 : 0);
            TextUtils.writeToParcel(this.f50596d, parcel, i);
            TextUtils.writeToParcel(this.f50597f, parcel, i);
            TextUtils.writeToParcel(this.f50598g, parcel, i);
        }

        SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f50594a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f50595c = parcel.readInt() != 1 ? false : true;
            this.f50596d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f50597f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f50598g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.textInputStyle);
    }

    /* renamed from: A */
    private Fade m69860A() {
        Fade fade = new Fade();
        fade.setDuration(87);
        fade.setInterpolator(AnimationUtils.f48521a);
        return fade;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m69861A0(int i) {
        if (i != 0 || this.f50547X0) {
            m69876K();
        } else {
            m69901k0();
        }
    }

    /* renamed from: B */
    private boolean m69862B() {
        return this.f50539T && !TextUtils.isEmpty(this.f50541U) && (this.f50545W instanceof CutoutDrawable);
    }

    /* renamed from: B0 */
    private void m69863B0() {
        if (this.f50564g != null) {
            ViewCompat.setPaddingRelative(this.f50533Q, mo59171R() ? 0 : ViewCompat.getPaddingStart(this.f50564g), this.f50564g.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C10462R.dimen.material_input_text_to_prefix_suffix_padding), this.f50564g.getCompoundPaddingBottom());
        }
    }

    /* renamed from: C */
    private void m69864C() {
        Iterator it = this.f50584w0.iterator();
        while (it.hasNext()) {
            ((OnEditTextAttachedListener) it.next()).mo59101a(this);
        }
    }

    /* renamed from: C0 */
    private void m69865C0() {
        this.f50533Q.setVisibility((this.f50531P == null || mo59169O()) ? 8 : 0);
        m69916s0();
    }

    /* renamed from: D */
    private void m69866D(int i) {
        Iterator it = this.f50502A0.iterator();
        while (it.hasNext()) {
            ((OnEndIconChangedListener) it.next()).mo59102a(this, i);
        }
    }

    /* renamed from: D0 */
    private void m69867D0(boolean z, boolean z2) {
        int defaultColor = this.f50536R0.getDefaultColor();
        int colorForState = this.f50536R0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f50536R0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f50567i0 = colorForState2;
        } else if (z2) {
            this.f50567i0 = colorForState;
        } else {
            this.f50567i0 = defaultColor;
        }
    }

    /* renamed from: E */
    private void m69868E(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable = this.f50551a0;
        if (materialShapeDrawable != null) {
            Rect bounds = materialShapeDrawable.getBounds();
            bounds.top = bounds.bottom - this.f50563f0;
            this.f50551a0.draw(canvas);
        }
    }

    /* renamed from: E0 */
    private void m69869E0() {
        if (this.f50564g != null) {
            ViewCompat.setPaddingRelative(this.f50537S, getContext().getResources().getDimensionPixelSize(C10462R.dimen.material_input_text_to_prefix_suffix_padding), this.f50564g.getPaddingTop(), (mo59167L() || m69877M()) ? 0 : ViewCompat.getPaddingEnd(this.f50564g), this.f50564g.getPaddingBottom());
        }
    }

    /* renamed from: F */
    private void m69870F(@NonNull Canvas canvas) {
        if (this.f50539T) {
            this.f50548Y0.mo58078l(canvas);
        }
    }

    /* renamed from: F0 */
    private void m69871F0() {
        int visibility = this.f50537S.getVisibility();
        int i = 0;
        boolean z = this.f50535R != null && !mo59169O();
        TextView textView = this.f50537S;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f50537S.getVisibility()) {
            getEndIconDelegate().mo59096c(z);
        }
        m69916s0();
    }

    /* renamed from: G */
    private void m69872G(boolean z) {
        ValueAnimator valueAnimator = this.f50554b1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f50554b1.cancel();
        }
        if (!z || !this.f50552a1) {
            this.f50548Y0.mo58086q0(0.0f);
        } else {
            mo59233i(0.0f);
        }
        if (m69862B() && ((CutoutDrawable) this.f50545W).mo59109r0()) {
            m69925y();
        }
        this.f50547X0 = true;
        m69876K();
        m69865C0();
        m69871F0();
    }

    /* renamed from: H */
    private int m69873H(int i, boolean z) {
        int compoundPaddingLeft = i + this.f50564g.getCompoundPaddingLeft();
        return (this.f50531P == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f50533Q.getMeasuredWidth()) + this.f50533Q.getPaddingLeft();
    }

    /* renamed from: I */
    private int m69874I(int i, boolean z) {
        int compoundPaddingRight = i - this.f50564g.getCompoundPaddingRight();
        return (this.f50531P == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f50533Q.getMeasuredWidth() - this.f50533Q.getPaddingRight());
    }

    /* renamed from: J */
    private boolean m69875J() {
        return this.f50585x0 != 0;
    }

    /* renamed from: K */
    private void m69876K() {
        TextView textView = this.f50517I;
        if (textView != null && this.f50515H) {
            textView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(this.f50550a, this.f50525M);
            this.f50517I.setVisibility(4);
        }
    }

    /* renamed from: M */
    private boolean m69877M() {
        return this.f50522K0.getVisibility() == 0;
    }

    /* renamed from: Q */
    private boolean m69878Q() {
        if (this.f50559d0 != 1 || this.f50564g.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    private int[] m69879S(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: T */
    private void m69880T() {
        m69910p();
        m69889c0();
        mo59166G0();
        m69905m0();
        m69895h();
        if (this.f50559d0 != 0) {
            m69921v0();
        }
    }

    /* renamed from: U */
    private void m69881U() {
        if (m69862B()) {
            RectF rectF = this.f50571m0;
            this.f50548Y0.mo58082o(rectF, this.f50564g.getWidth(), this.f50564g.getGravity());
            m69902l(rectF);
            rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.f50563f0));
            ((CutoutDrawable) this.f50545W).mo59112x0(rectF);
        }
    }

    /* renamed from: V */
    private void m69882V() {
        if (m69862B() && !this.f50547X0) {
            m69925y();
            m69881U();
        }
    }

    /* renamed from: W */
    private static void m69883W(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m69883W((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: Z */
    private void m69884Z(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m69879S(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTintList(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: b0 */
    private void m69887b0() {
        TextView textView = this.f50517I;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: c0 */
    private void m69889c0() {
        if (m69899j0()) {
            ViewCompat.setBackground(this.f50564g, this.f50545W);
        }
    }

    /* renamed from: d0 */
    private static void m69891d0(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = ViewCompat.hasOnClickListeners(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (hasOnClickListeners || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        ViewCompat.setImportantForAccessibility(checkableImageButton, i);
    }

    /* renamed from: e0 */
    private static void m69892e0(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnClickListener onClickListener, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m69891d0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f0 */
    private static void m69893f0(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m69891d0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: g */
    private void m69894g() {
        TextView textView = this.f50517I;
        if (textView != null) {
            this.f50550a.addView(textView);
            this.f50517I.setVisibility(0);
        }
    }

    private EndIconDelegate getEndIconDelegate() {
        EndIconDelegate endIconDelegate = this.f50586y0.get(this.f50585x0);
        return endIconDelegate != null ? endIconDelegate : this.f50586y0.get(0);
    }

    @Nullable
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f50522K0.getVisibility() == 0) {
            return this.f50522K0;
        }
        if (!m69875J() || !mo59167L()) {
            return null;
        }
        return this.f50588z0;
    }

    /* renamed from: h */
    private void m69895h() {
        if (this.f50564g != null && this.f50559d0 == 1) {
            if (MaterialResources.m69128h(getContext())) {
                EditText editText = this.f50564g;
                ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(C10462R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.f50564g), getResources().getDimensionPixelSize(C10462R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.m69127g(getContext())) {
                EditText editText2 = this.f50564g;
                ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(C10462R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.f50564g), getResources().getDimensionPixelSize(C10462R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    /* renamed from: h0 */
    private boolean m69896h0() {
        return (this.f50522K0.getVisibility() == 0 || ((m69875J() && mo59167L()) || this.f50535R != null)) && this.f50558d.getMeasuredWidth() > 0;
    }

    /* renamed from: i0 */
    private boolean m69897i0() {
        return !(getStartIconDrawable() == null && this.f50531P == null) && this.f50555c.getMeasuredWidth() > 0;
    }

    /* renamed from: j */
    private void m69898j() {
        MaterialShapeDrawable materialShapeDrawable = this.f50545W;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(this.f50553b0);
            if (m69922w()) {
                this.f50545W.mo58671k0((float) this.f50563f0, this.f50567i0);
            }
            int q = m69911q();
            this.f50568j0 = q;
            this.f50545W.mo58656a0(ColorStateList.valueOf(q));
            if (this.f50585x0 == 3) {
                this.f50564g.getBackground().invalidateSelf();
            }
            m69900k();
            invalidate();
        }
    }

    /* renamed from: j0 */
    private boolean m69899j0() {
        EditText editText = this.f50564g;
        return (editText == null || this.f50545W == null || editText.getBackground() != null || this.f50559d0 == 0) ? false : true;
    }

    /* renamed from: k */
    private void m69900k() {
        if (this.f50551a0 != null) {
            if (m69923x()) {
                this.f50551a0.mo58656a0(ColorStateList.valueOf(this.f50567i0));
            }
            invalidate();
        }
    }

    /* renamed from: k0 */
    private void m69901k0() {
        TextView textView = this.f50517I;
        if (textView != null && this.f50515H) {
            textView.setText(this.f50513G);
            TransitionManager.beginDelayedTransition(this.f50550a, this.f50523L);
            this.f50517I.setVisibility(0);
            this.f50517I.bringToFront();
        }
    }

    /* renamed from: l */
    private void m69902l(@NonNull RectF rectF) {
        float f = rectF.left;
        int i = this.f50556c0;
        rectF.left = f - ((float) i);
        rectF.right += (float) i;
    }

    /* renamed from: l0 */
    private void m69903l0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m69904m();
            return;
        }
        Drawable mutate = DrawableCompat.wrap(getEndIconDrawable()).mutate();
        DrawableCompat.setTint(mutate, this.f50587z.mo59139o());
        this.f50588z0.setImageDrawable(mutate);
    }

    /* renamed from: m */
    private void m69904m() {
        m69906n(this.f50588z0, this.f50506C0, this.f50504B0, this.f50510E0, this.f50508D0);
    }

    /* renamed from: m0 */
    private void m69905m0() {
        if (this.f50559d0 != 1) {
            return;
        }
        if (MaterialResources.m69128h(getContext())) {
            this.f50561e0 = getResources().getDimensionPixelSize(C10462R.dimen.material_font_2_0_box_collapsed_padding_top);
        } else if (MaterialResources.m69127g(getContext())) {
            this.f50561e0 = getResources().getDimensionPixelSize(C10462R.dimen.material_font_1_3_box_collapsed_padding_top);
        }
    }

    /* renamed from: n */
    private void m69906n(@NonNull CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (z) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
            if (z2) {
                DrawableCompat.setTintMode(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: n0 */
    private void m69907n0(@NonNull Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.f50551a0;
        if (materialShapeDrawable != null) {
            int i = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i - this.f50566h0, rect.right, i);
        }
    }

    /* renamed from: o */
    private void m69908o() {
        m69906n(this.f50574o0, this.f50577q0, this.f50576p0, this.f50580s0, this.f50578r0);
    }

    /* renamed from: o0 */
    private void m69909o0() {
        if (this.f50507D != null) {
            EditText editText = this.f50564g;
            mo59238p0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: p */
    private void m69910p() {
        int i = this.f50559d0;
        if (i == 0) {
            this.f50545W = null;
            this.f50551a0 = null;
        } else if (i == 1) {
            this.f50545W = new MaterialShapeDrawable(this.f50553b0);
            this.f50551a0 = new MaterialShapeDrawable();
        } else if (i == 2) {
            if (!this.f50539T || (this.f50545W instanceof CutoutDrawable)) {
                this.f50545W = new MaterialShapeDrawable(this.f50553b0);
            } else {
                this.f50545W = new CutoutDrawable(this.f50553b0);
            }
            this.f50551a0 = null;
        } else {
            throw new IllegalArgumentException(this.f50559d0 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: q */
    private int m69911q() {
        return this.f50559d0 == 1 ? MaterialColors.m68107g(MaterialColors.m68105e(this, C10462R.attr.colorSurface, 0), this.f50568j0) : this.f50568j0;
    }

    /* renamed from: q0 */
    private static void m69912q0(@NonNull Context context, @NonNull TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C10462R.string.character_counter_overflowed_content_description : C10462R.string.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    @NonNull
    /* renamed from: r */
    private Rect m69913r(@NonNull Rect rect) {
        if (this.f50564g != null) {
            Rect rect2 = this.f50570l0;
            boolean z = ViewCompat.getLayoutDirection(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.f50559d0;
            if (i == 1) {
                rect2.left = m69873H(rect.left, z);
                rect2.top = rect.top + this.f50561e0;
                rect2.right = m69874I(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = m69873H(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = m69874I(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.f50564g.getPaddingLeft();
                rect2.top = rect.top - m69920v();
                rect2.right = rect.right - this.f50564g.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r0 */
    private void m69914r0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f50507D;
        if (textView != null) {
            mo59182g0(textView, this.f50505C ? this.f50509E : this.f50511F);
            if (!this.f50505C && (colorStateList2 = this.f50527N) != null) {
                this.f50507D.setTextColor(colorStateList2);
            }
            if (this.f50505C && (colorStateList = this.f50529O) != null) {
                this.f50507D.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: s */
    private int m69915s(@NonNull Rect rect, @NonNull Rect rect2, float f) {
        if (m69878Q()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f50564g.getCompoundPaddingBottom();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m69916s0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f50564g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m69897i0()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f50555c
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f50564g
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f50581t0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f50582u0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f50581t0 = r6
            r10.f50582u0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f50564g
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f50581t0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f50564g
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f50581t0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f50564g
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r0)
            android.widget.EditText r6 = r10.f50564g
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r6, r2, r7, r8, r0)
            r10.f50581t0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.m69896h0()
            if (r6 == 0) goto L_0x00d3
            android.widget.TextView r2 = r10.f50537S
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f50564g
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.MarginLayoutParamsCompat.getMarginStart(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f50564g
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r6)
            android.graphics.drawable.Drawable r7 = r10.f50512F0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f50514G0
            if (r8 == r2) goto L_0x00ad
            r10.f50514G0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f50564g
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.f50512F0
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r2, r4, r3)
            goto L_0x00f4
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f50512F0 = r7
            r10.f50514G0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f50512F0
            if (r2 == r7) goto L_0x00d1
            r0 = r6[r4]
            r10.f50516H0 = r0
            android.widget.EditText r0 = r10.f50564g
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r2, r7, r3)
            goto L_0x00f4
        L_0x00d1:
            r5 = r0
            goto L_0x00f4
        L_0x00d3:
            android.graphics.drawable.Drawable r6 = r10.f50512F0
            if (r6 == 0) goto L_0x00f5
            android.widget.EditText r6 = r10.f50564g
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f50512F0
            if (r4 != r7) goto L_0x00f1
            android.widget.EditText r0 = r10.f50564g
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f50516H0
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r1, r4, r7, r3)
            goto L_0x00f2
        L_0x00f1:
            r5 = r0
        L_0x00f2:
            r10.f50512F0 = r2
        L_0x00f4:
            r0 = r5
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m69916s0():boolean");
    }

    private void setEditText(EditText editText) {
        if (this.f50564g == null) {
            if (this.f50585x0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f50564g = editText;
            setMinWidth(this.f50575p);
            setMaxWidth(this.f50579s);
            m69880T();
            setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
            this.f50548Y0.mo58055D0(this.f50564g.getTypeface());
            this.f50548Y0.mo58081n0(this.f50564g.getTextSize());
            int gravity = this.f50564g.getGravity();
            this.f50548Y0.mo58072d0((gravity & -113) | 48);
            this.f50548Y0.mo58080m0(gravity);
            this.f50564g.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(@NonNull Editable editable) {
                    TextInputLayout textInputLayout = TextInputLayout.this;
                    textInputLayout.mo59326w0(!textInputLayout.f50560d1);
                    TextInputLayout textInputLayout2 = TextInputLayout.this;
                    if (textInputLayout2.f50501A) {
                        textInputLayout2.mo59238p0(editable.length());
                    }
                    if (TextInputLayout.this.f50515H) {
                        TextInputLayout.this.m69861A0(editable.length());
                    }
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            if (this.f50526M0 == null) {
                this.f50526M0 = this.f50564g.getHintTextColors();
            }
            if (this.f50539T) {
                if (TextUtils.isEmpty(this.f50541U)) {
                    CharSequence hint = this.f50564g.getHint();
                    this.f50573o = hint;
                    setHint(hint);
                    this.f50564g.setHint((CharSequence) null);
                }
                this.f50543V = true;
            }
            if (this.f50507D != null) {
                mo59238p0(this.f50564g.getText().length());
            }
            mo59325t0();
            this.f50587z.mo59134e();
            this.f50555c.bringToFront();
            this.f50558d.bringToFront();
            this.f50562f.bringToFront();
            this.f50522K0.bringToFront();
            m69864C();
            m69863B0();
            m69869E0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m69924x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f50522K0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f50562f;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        m69869E0();
        if (!m69875J()) {
            m69916s0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f50541U)) {
            this.f50541U = charSequence;
            this.f50548Y0.mo58051B0(charSequence);
            if (!this.f50547X0) {
                m69881U();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f50515H != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f50517I = appCompatTextView;
                appCompatTextView.setId(C10462R.C10465id.textinput_placeholder);
                Fade A = m69860A();
                this.f50523L = A;
                A.setStartDelay(67);
                this.f50525M = m69860A();
                ViewCompat.setAccessibilityLiveRegion(this.f50517I, 1);
                setPlaceholderTextAppearance(this.f50521K);
                setPlaceholderTextColor(this.f50519J);
                m69894g();
            } else {
                m69887b0();
                this.f50517I = null;
            }
            this.f50515H = z;
        }
    }

    /* renamed from: t */
    private int m69917t(@NonNull Rect rect, float f) {
        if (m69878Q()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f50564g.getCompoundPaddingTop();
    }

    @NonNull
    /* renamed from: u */
    private Rect m69918u(@NonNull Rect rect) {
        if (this.f50564g != null) {
            Rect rect2 = this.f50570l0;
            float B = this.f50548Y0.mo58050B();
            rect2.left = rect.left + this.f50564g.getCompoundPaddingLeft();
            rect2.top = m69917t(rect, B);
            rect2.right = rect.right - this.f50564g.getCompoundPaddingRight();
            rect2.bottom = m69915s(rect, rect2, B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u0 */
    private boolean m69919u0() {
        int max;
        if (this.f50564g == null || this.f50564g.getMeasuredHeight() >= (max = Math.max(this.f50558d.getMeasuredHeight(), this.f50555c.getMeasuredHeight()))) {
            return false;
        }
        this.f50564g.setMinimumHeight(max);
        return true;
    }

    /* renamed from: v */
    private int m69920v() {
        float r;
        if (!this.f50539T) {
            return 0;
        }
        int i = this.f50559d0;
        if (i == 0 || i == 1) {
            r = this.f50548Y0.mo58087r();
        } else if (i != 2) {
            return 0;
        } else {
            r = this.f50548Y0.mo58087r() / 2.0f;
        }
        return (int) r;
    }

    /* renamed from: v0 */
    private void m69921v0() {
        if (this.f50559d0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f50550a.getLayoutParams();
            int v = m69920v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.f50550a.requestLayout();
            }
        }
    }

    /* renamed from: w */
    private boolean m69922w() {
        return this.f50559d0 == 2 && m69923x();
    }

    /* renamed from: x */
    private boolean m69923x() {
        return this.f50563f0 > -1 && this.f50567i0 != 0;
    }

    /* renamed from: x0 */
    private void m69924x0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f50564g;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f50564g;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.f50587z.mo59136k();
        ColorStateList colorStateList2 = this.f50526M0;
        if (colorStateList2 != null) {
            this.f50548Y0.mo58071c0(colorStateList2);
            this.f50548Y0.mo58079l0(this.f50526M0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f50526M0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f50546W0) : this.f50546W0;
            this.f50548Y0.mo58071c0(ColorStateList.valueOf(colorForState));
            this.f50548Y0.mo58079l0(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.f50548Y0.mo58071c0(this.f50587z.mo59140p());
        } else if (this.f50505C && (textView = this.f50507D) != null) {
            this.f50548Y0.mo58071c0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f50528N0) != null) {
            this.f50548Y0.mo58071c0(colorStateList);
        }
        if (z3 || !this.f50549Z0 || (isEnabled() && z4)) {
            if (z2 || this.f50547X0) {
                m69927z(z);
            }
        } else if (z2 || !this.f50547X0) {
            m69872G(z);
        }
    }

    /* renamed from: y */
    private void m69925y() {
        if (m69862B()) {
            ((CutoutDrawable) this.f50545W).mo59110u0();
        }
    }

    /* renamed from: y0 */
    private void m69926y0() {
        EditText editText;
        if (this.f50517I != null && (editText = this.f50564g) != null) {
            this.f50517I.setGravity(editText.getGravity());
            this.f50517I.setPadding(this.f50564g.getCompoundPaddingLeft(), this.f50564g.getCompoundPaddingTop(), this.f50564g.getCompoundPaddingRight(), this.f50564g.getCompoundPaddingBottom());
        }
    }

    /* renamed from: z */
    private void m69927z(boolean z) {
        ValueAnimator valueAnimator = this.f50554b1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f50554b1.cancel();
        }
        if (!z || !this.f50552a1) {
            this.f50548Y0.mo58086q0(1.0f);
        } else {
            mo59233i(1.0f);
        }
        this.f50547X0 = false;
        if (m69862B()) {
            m69881U();
        }
        m69928z0();
        m69865C0();
        m69871F0();
    }

    /* renamed from: z0 */
    private void m69928z0() {
        EditText editText = this.f50564g;
        m69861A0(editText == null ? 0 : editText.getText().length());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f50564g;
     */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo59166G0() {
        /*
            r6 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.f50545W
            if (r0 == 0) goto L_0x00fc
            int r0 = r6.f50559d0
            if (r0 != 0) goto L_0x000a
            goto L_0x00fc
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f50564g
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f50564g
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f50546W0
            r6.f50567i0 = r4
            goto L_0x0081
        L_0x003f:
            com.google.android.material.textfield.IndicatorViewController r4 = r6.f50587z
            boolean r4 = r4.mo59136k()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.f50536R0
            if (r4 == 0) goto L_0x004f
            r6.m69867D0(r0, r3)
            goto L_0x0081
        L_0x004f:
            com.google.android.material.textfield.IndicatorViewController r4 = r6.f50587z
            int r4 = r4.mo59139o()
            r6.f50567i0 = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.f50505C
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.f50507D
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.f50536R0
            if (r5 == 0) goto L_0x0068
            r6.m69867D0(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.f50567i0 = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.f50534Q0
            r6.f50567i0 = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.f50532P0
            r6.f50567i0 = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.f50530O0
            r6.f50567i0 = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.IndicatorViewController r4 = r6.f50587z
            boolean r4 = r4.mo59146x()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.IndicatorViewController r4 = r6.f50587z
            boolean r4 = r4.mo59136k()
            if (r4 == 0) goto L_0x0098
            r1 = 1
        L_0x0098:
            r6.setErrorIconVisible(r1)
            r6.mo59173Y()
            r6.mo59174a0()
            r6.mo59172X()
            com.google.android.material.textfield.EndIconDelegate r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo59114d()
            if (r1 == 0) goto L_0x00b7
            com.google.android.material.textfield.IndicatorViewController r1 = r6.f50587z
            boolean r1 = r1.mo59136k()
            r6.m69903l0(r1)
        L_0x00b7:
            int r1 = r6.f50563f0
            if (r0 == 0) goto L_0x00c6
            boolean r4 = r6.isEnabled()
            if (r4 == 0) goto L_0x00c6
            int r4 = r6.f50566h0
            r6.f50563f0 = r4
            goto L_0x00ca
        L_0x00c6:
            int r4 = r6.f50565g0
            r6.f50563f0 = r4
        L_0x00ca:
            int r4 = r6.f50563f0
            if (r4 == r1) goto L_0x00d6
            int r1 = r6.f50559d0
            r4 = 2
            if (r1 != r4) goto L_0x00d6
            r6.m69882V()
        L_0x00d6:
            int r1 = r6.f50559d0
            if (r1 != r2) goto L_0x00f9
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00e5
            int r0 = r6.f50540T0
            r6.f50568j0 = r0
            goto L_0x00f9
        L_0x00e5:
            if (r3 == 0) goto L_0x00ee
            if (r0 != 0) goto L_0x00ee
            int r0 = r6.f50544V0
            r6.f50568j0 = r0
            goto L_0x00f9
        L_0x00ee:
            if (r0 == 0) goto L_0x00f5
            int r0 = r6.f50542U0
            r6.f50568j0 = r0
            goto L_0x00f9
        L_0x00f5:
            int r0 = r6.f50538S0
            r6.f50568j0 = r0
        L_0x00f9:
            r6.m69898j()
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo59166G0():void");
    }

    /* renamed from: L */
    public boolean mo59167L() {
        return this.f50562f.getVisibility() == 0 && this.f50588z0.getVisibility() == 0;
    }

    /* renamed from: N */
    public boolean mo59168N() {
        return this.f50587z.mo59147y();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: O */
    public final boolean mo59169O() {
        return this.f50547X0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: P */
    public boolean mo59170P() {
        return this.f50543V;
    }

    /* renamed from: R */
    public boolean mo59171R() {
        return this.f50574o0.getVisibility() == 0;
    }

    /* renamed from: X */
    public void mo59172X() {
        m69884Z(this.f50588z0, this.f50504B0);
    }

    /* renamed from: Y */
    public void mo59173Y() {
        m69884Z(this.f50522K0, this.f50524L0);
    }

    /* renamed from: a0 */
    public void mo59174a0() {
        m69884Z(this.f50574o0, this.f50576p0);
    }

    public void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f50550a.addView(view, layoutParams2);
            this.f50550a.setLayoutParams(layoutParams);
            m69921v0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.f50564g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f50573o != null) {
            boolean z = this.f50543V;
            this.f50543V = false;
            CharSequence hint = editText.getHint();
            this.f50564g.setHint(this.f50573o);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f50564g.setHint(hint);
                this.f50543V = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f50550a.getChildCount());
            for (int i2 = 0; i2 < this.f50550a.getChildCount(); i2++) {
                View childAt = this.f50550a.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f50564g) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f50560d1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f50560d1 = false;
    }

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        m69870F(canvas);
        m69868E(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f50557c1) {
            boolean z = true;
            this.f50557c1 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            CollapsingTextHelper collapsingTextHelper = this.f50548Y0;
            boolean A0 = collapsingTextHelper != null ? collapsingTextHelper.mo58049A0(drawableState) | false : false;
            if (this.f50564g != null) {
                if (!ViewCompat.isLaidOut(this) || !isEnabled()) {
                    z = false;
                }
                mo59326w0(z);
            }
            mo59325t0();
            mo59166G0();
            if (A0) {
                invalidate();
            }
            this.f50557c1 = false;
        }
    }

    /* renamed from: e */
    public void mo59180e(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.f50584w0.add(onEditTextAttachedListener);
        if (this.f50564g != null) {
            onEditTextAttachedListener.mo59101a(this);
        }
    }

    /* renamed from: f */
    public void mo59181f(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.f50502A0.add(onEndIconChangedListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo59182g0(@NonNull TextView textView, @StyleRes int i) {
        boolean z = true;
        try {
            TextViewCompat.setTextAppearance(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            TextViewCompat.setTextAppearance(textView, C10462R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(ContextCompat.getColor(getContext(), C10462R.C10463color.design_error));
        }
    }

    public int getBaseline() {
        EditText editText = this.f50564g;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m69920v();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f50559d0;
        if (i == 1 || i == 2) {
            return this.f50545W;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f50568j0;
    }

    public int getBoxBackgroundMode() {
        return this.f50559d0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f50561e0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f50545W.mo58680s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f50545W.mo58681t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f50545W.mo58646J();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f50545W.mo58645I();
    }

    public int getBoxStrokeColor() {
        return this.f50534Q0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f50536R0;
    }

    public int getBoxStrokeWidth() {
        return this.f50565g0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f50566h0;
    }

    public int getCounterMaxLength() {
        return this.f50503B;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f50501A || !this.f50505C || (textView = this.f50507D) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f50527N;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f50527N;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f50526M0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f50564g;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f50588z0.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f50588z0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f50585x0;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f50588z0;
    }

    @Nullable
    public CharSequence getError() {
        if (this.f50587z.mo59146x()) {
            return this.f50587z.mo59138n();
        }
        return null;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f50587z.mo59137m();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f50587z.mo59139o();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f50522K0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final int getErrorTextCurrentColor() {
        return this.f50587z.mo59139o();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.f50587z.mo59147y()) {
            return this.f50587z.mo59141q();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.f50587z.mo59142r();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f50539T) {
            return this.f50541U;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f50548Y0.mo58087r();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.f50548Y0.mo58092v();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f50528N0;
    }

    @C0144Px
    public int getMaxWidth() {
        return this.f50579s;
    }

    @C0144Px
    public int getMinWidth() {
        return this.f50575p;
    }

    @Deprecated
    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f50588z0.getContentDescription();
    }

    @Deprecated
    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f50588z0.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f50515H) {
            return this.f50513G;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f50521K;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f50519J;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f50531P;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f50533Q.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f50533Q;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f50574o0.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f50574o0.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f50535R;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f50537S.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f50537S;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f50572n0;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: i */
    public void mo59233i(float f) {
        if (this.f50548Y0.mo58054D() != f) {
            if (this.f50554b1 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f50554b1 = valueAnimator;
                valueAnimator.setInterpolator(AnimationUtils.f48522b);
                this.f50554b1.setDuration(167);
                this.f50554b1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        TextInputLayout.this.f50548Y0.mo58086q0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.f50554b1.setFloatValues(new float[]{this.f50548Y0.mo58054D(), f});
            this.f50554b1.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f50564g;
        if (editText != null) {
            Rect rect = this.f50569k0;
            DescendantOffsetUtils.m68712a(this, editText, rect);
            m69907n0(rect);
            if (this.f50539T) {
                this.f50548Y0.mo58081n0(this.f50564g.getTextSize());
                int gravity = this.f50564g.getGravity();
                this.f50548Y0.mo58072d0((gravity & -113) | 48);
                this.f50548Y0.mo58080m0(gravity);
                this.f50548Y0.mo58069Z(m69913r(rect));
                this.f50548Y0.mo58076i0(m69918u(rect));
                this.f50548Y0.mo58066V();
                if (m69862B() && !this.f50547X0) {
                    m69881U();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean u0 = m69919u0();
        boolean s0 = m69916s0();
        if (u0 || s0) {
            this.f50564g.post(new Runnable() {
                public void run() {
                    TextInputLayout.this.f50564g.requestLayout();
                }
            });
        }
        m69926y0();
        m69863B0();
        m69869E0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f50594a);
        if (savedState.f50595c) {
            this.f50588z0.post(new Runnable() {
                public void run() {
                    TextInputLayout.this.f50588z0.performClick();
                    TextInputLayout.this.f50588z0.jumpDrawablesToCurrentState();
                }
            });
        }
        setHint(savedState.f50596d);
        setHelperText(savedState.f50597f);
        setPlaceholderText(savedState.f50598g);
        requestLayout();
    }

    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f50587z.mo59136k()) {
            savedState.f50594a = getError();
        }
        savedState.f50595c = m69875J() && this.f50588z0.isChecked();
        savedState.f50596d = getHint();
        savedState.f50597f = getHelperText();
        savedState.f50598g = getPlaceholderText();
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo59238p0(int i) {
        boolean z = this.f50505C;
        int i2 = this.f50503B;
        if (i2 == -1) {
            this.f50507D.setText(String.valueOf(i));
            this.f50507D.setContentDescription((CharSequence) null);
            this.f50505C = false;
        } else {
            this.f50505C = i > i2;
            m69912q0(getContext(), this.f50507D, i, this.f50503B, this.f50505C);
            if (z != this.f50505C) {
                m69914r0();
            }
            this.f50507D.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(C10462R.string.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f50503B)})));
        }
        if (this.f50564g != null && z != this.f50505C) {
            mo59326w0(false);
            mo59166G0();
            mo59325t0();
        }
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.f50568j0 != i) {
            this.f50568j0 = i;
            this.f50538S0 = i;
            this.f50542U0 = i;
            this.f50544V0 = i;
            m69898j();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f50538S0 = defaultColor;
        this.f50568j0 = defaultColor;
        this.f50540T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f50542U0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f50544V0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m69898j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f50559d0) {
            this.f50559d0 = i;
            if (this.f50564g != null) {
                m69880T();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f50561e0 = i;
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.f50534Q0 != i) {
            this.f50534Q0 = i;
            mo59166G0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f50530O0 = colorStateList.getDefaultColor();
            this.f50546W0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f50532P0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f50534Q0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f50534Q0 != colorStateList.getDefaultColor()) {
            this.f50534Q0 = colorStateList.getDefaultColor();
        }
        mo59166G0();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f50536R0 != colorStateList) {
            this.f50536R0 = colorStateList;
            mo59166G0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f50565g0 = i;
        mo59166G0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f50566h0 = i;
        mo59166G0();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f50501A != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f50507D = appCompatTextView;
                appCompatTextView.setId(C10462R.C10465id.textinput_counter);
                Typeface typeface = this.f50572n0;
                if (typeface != null) {
                    this.f50507D.setTypeface(typeface);
                }
                this.f50507D.setMaxLines(1);
                this.f50587z.mo59133d(this.f50507D, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f50507D.getLayoutParams(), getResources().getDimensionPixelOffset(C10462R.dimen.mtrl_textinput_counter_margin_start));
                m69914r0();
                m69909o0();
            } else {
                this.f50587z.mo59148z(this.f50507D, 2);
                this.f50507D = null;
            }
            this.f50501A = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f50503B != i) {
            if (i > 0) {
                this.f50503B = i;
            } else {
                this.f50503B = -1;
            }
            if (this.f50501A) {
                m69909o0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f50509E != i) {
            this.f50509E = i;
            m69914r0();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f50529O != colorStateList) {
            this.f50529O = colorStateList;
            m69914r0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f50511F != i) {
            this.f50511F = i;
            m69914r0();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f50527N != colorStateList) {
            this.f50527N = colorStateList;
            m69914r0();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f50526M0 = colorStateList;
        this.f50528N0 = colorStateList;
        if (this.f50564g != null) {
            mo59326w0(false);
        }
    }

    public void setEnabled(boolean z) {
        m69883W(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f50588z0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f50588z0.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        setEndIconDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f50585x0;
        this.f50585x0 = i;
        m69866D(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo59113b(this.f50559d0)) {
            getEndIconDelegate().mo59095a();
            m69904m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f50559d0 + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        m69892e0(this.f50588z0, onClickListener, this.f50518I0);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f50518I0 = onLongClickListener;
        m69893f0(this.f50588z0, onLongClickListener);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f50504B0 != colorStateList) {
            this.f50504B0 = colorStateList;
            this.f50506C0 = true;
            m69904m();
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f50508D0 != mode) {
            this.f50508D0 = mode;
            this.f50510E0 = true;
            m69904m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo59167L() != z) {
            this.f50588z0.setVisibility(z ? 0 : 8);
            m69869E0();
            m69916s0();
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f50587z.mo59146x()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f50587z.mo59131M(charSequence);
        } else {
            this.f50587z.mo59143t();
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.f50587z.mo59123B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f50587z.mo59124C(z);
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        setErrorIconDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
        mo59173Y();
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        m69892e0(this.f50522K0, onClickListener, this.f50520J0);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f50520J0 = onLongClickListener;
        m69893f0(this.f50522K0, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.f50524L0 = colorStateList;
        Drawable drawable = this.f50522K0.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTintList(drawable, colorStateList);
        }
        if (this.f50522K0.getDrawable() != drawable) {
            this.f50522K0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        Drawable drawable = this.f50522K0.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTintMode(drawable, mode);
        }
        if (this.f50522K0.getDrawable() != drawable) {
            this.f50522K0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        this.f50587z.mo59125D(i);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.f50587z.mo59126E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f50549Z0 != z) {
            this.f50549Z0 = z;
            mo59326w0(false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo59168N()) {
                setHelperTextEnabled(true);
            }
            this.f50587z.mo59132N(charSequence);
        } else if (mo59168N()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.f50587z.mo59129H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f50587z.mo59128G(z);
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        this.f50587z.mo59127F(i);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f50539T) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f50552a1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f50539T) {
            this.f50539T = z;
            if (!z) {
                this.f50543V = false;
                if (!TextUtils.isEmpty(this.f50541U) && TextUtils.isEmpty(this.f50564g.getHint())) {
                    this.f50564g.setHint(this.f50541U);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f50564g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f50541U)) {
                        setHint(hint);
                    }
                    this.f50564g.setHint((CharSequence) null);
                }
                this.f50543V = true;
            }
            if (this.f50564g != null) {
                m69921v0();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.f50548Y0.mo58070a0(i);
        this.f50528N0 = this.f50548Y0.mo58084p();
        if (this.f50564g != null) {
            mo59326w0(false);
            m69921v0();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f50528N0 != colorStateList) {
            if (this.f50526M0 == null) {
                this.f50548Y0.mo58071c0(colorStateList);
            }
            this.f50528N0 = colorStateList;
            if (this.f50564g != null) {
                mo59326w0(false);
            }
        }
    }

    public void setMaxWidth(@C0144Px int i) {
        this.f50579s = i;
        EditText editText = this.f50564g;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(@C0144Px int i) {
        this.f50575p = i;
        EditText editText = this.f50564g;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(@DimenRes int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f50585x0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f50504B0 = colorStateList;
        this.f50506C0 = true;
        m69904m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f50508D0 = mode;
        this.f50510E0 = true;
        m69904m();
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (!this.f50515H || !TextUtils.isEmpty(charSequence)) {
            if (!this.f50515H) {
                setPlaceholderTextEnabled(true);
            }
            this.f50513G = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m69928z0();
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.f50521K = i;
        TextView textView = this.f50517I;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f50519J != colorStateList) {
            this.f50519J = colorStateList;
            TextView textView = this.f50517I;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.f50531P = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f50533Q.setText(charSequence);
        m69865C0();
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.f50533Q, i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f50533Q.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f50574o0.setCheckable(z);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        m69892e0(this.f50574o0, onClickListener, this.f50583v0);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f50583v0 = onLongClickListener;
        m69893f0(this.f50574o0, onLongClickListener);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f50576p0 != colorStateList) {
            this.f50576p0 = colorStateList;
            this.f50577q0 = true;
            m69908o();
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f50578r0 != mode) {
            this.f50578r0 = mode;
            this.f50580s0 = true;
            m69908o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo59171R() != z) {
            this.f50574o0.setVisibility(z ? 0 : 8);
            m69863B0();
            m69916s0();
        }
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f50535R = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f50537S.setText(charSequence);
        m69871F0();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.f50537S, i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f50537S.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.f50564g;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f50572n0) {
            this.f50572n0 = typeface;
            this.f50548Y0.mo58055D0(typeface);
            this.f50587z.mo59130J(typeface);
            TextView textView = this.f50507D;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo59325t0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f50564g;
        if (editText != null && this.f50559d0 == 0 && (background = editText.getBackground()) != null) {
            if (DrawableUtils.canSafelyMutateDrawable(background)) {
                background = background.mutate();
            }
            if (this.f50587z.mo59136k()) {
                background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.f50587z.mo59139o(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f50505C || (textView = this.f50507D) == null) {
                DrawableCompat.clearColorFilter(background);
                this.f50564g.refreshDrawableState();
            } else {
                background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo59326w0(boolean z) {
        m69924x0(z, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r27, @androidx.annotation.Nullable android.util.AttributeSet r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r7 = r28
            r8 = r29
            int r9 = f50500e1
            r1 = r27
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f50575p = r10
            r0.f50579s = r10
            com.google.android.material.textfield.IndicatorViewController r1 = new com.google.android.material.textfield.IndicatorViewController
            r1.<init>(r0)
            r0.f50587z = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f50569k0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f50570l0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f50571m0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f50584w0 = r1
            r11 = 0
            r0.f50585x0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f50586y0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f50502A0 = r1
            com.google.android.material.internal.CollapsingTextHelper r1 = new com.google.android.material.internal.CollapsingTextHelper
            r1.<init>(r0)
            r0.f50548Y0 = r1
            android.content.Context r13 = r26.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r13)
            r0.f50550a = r2
            r2.setAddStatesFromChildren(r14)
            r0.addView(r2)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r13)
            r0.f50555c = r15
            r15.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r6 = -2
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.<init>(r6, r10, r4)
            r15.setLayoutParams(r3)
            r2.addView(r15)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f50558d = r5
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r6, r10, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r13)
            r0.f50562f = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r6, r10)
            r4.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.f48521a
            r1.mo58053C0(r2)
            r1.mo58097y0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo58072d0(r2)
            int[] r3 = com.google.android.material.C10462R.styleable.TextInputLayout
            r1 = 5
            int[] r2 = new int[r1]
            int r1 = com.google.android.material.C10462R.styleable.TextInputLayout_counterTextAppearance
            r2[r11] = r1
            int r11 = com.google.android.material.C10462R.styleable.TextInputLayout_counterOverflowTextAppearance
            r2[r14] = r11
            int r10 = com.google.android.material.C10462R.styleable.TextInputLayout_errorTextAppearance
            r14 = 2
            r2[r14] = r10
            int r14 = com.google.android.material.C10462R.styleable.TextInputLayout_helperTextTextAppearance
            r16 = r12
            r12 = 3
            r2[r12] = r14
            int r12 = com.google.android.material.C10462R.styleable.TextInputLayout_hintTextAppearance
            r17 = 4
            r2[r17] = r12
            r17 = r15
            r15 = r1
            r1 = r13
            r18 = r2
            r2 = r28
            r19 = r4
            r4 = r29
            r20 = r11
            r11 = r5
            r5 = r9
            r6 = r18
            androidx.appcompat.widget.TintTypedArray r1 = com.google.android.material.internal.ThemeEnforcement.m68823i(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_hintEnabled
            r3 = 1
            boolean r2 = r1.getBoolean(r2, r3)
            r0.f50539T = r2
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.getText(r2)
            r0.setHint((java.lang.CharSequence) r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.getBoolean(r2, r3)
            r0.f50552a1 = r2
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_expandedHintEnabled
            boolean r2 = r1.getBoolean(r2, r3)
            r0.f50549Z0 = r2
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_android_minWidth
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0122
            r3 = -1
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setMinWidth(r2)
            goto L_0x0123
        L_0x0122:
            r3 = -1
        L_0x0123:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_android_maxWidth
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x0132
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.setMaxWidth(r2)
        L_0x0132:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.m69264e(r13, r7, r8, r9)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.mo58721m()
            r0.f50553b0 = r2
            android.content.res.Resources r2 = r13.getResources()
            int r3 = com.google.android.material.C10462R.dimen.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f50556c0 = r2
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_boxCollapsedPaddingTop
            r3 = 0
            int r2 = r1.getDimensionPixelOffset(r2, r3)
            r0.f50561e0 = r2
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r13.getResources()
            int r4 = com.google.android.material.C10462R.dimen.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.f50565g0 = r2
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r13.getResources()
            int r4 = com.google.android.material.C10462R.dimen.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r0.f50566h0 = r2
            int r2 = r0.f50565g0
            r0.f50563f0 = r2
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.getDimension(r2, r3)
            int r4 = com.google.android.material.C10462R.styleable.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.getDimension(r4, r3)
            int r5 = com.google.android.material.C10462R.styleable.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.getDimension(r5, r3)
            int r6 = com.google.android.material.C10462R.styleable.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.getDimension(r6, r3)
            com.google.android.material.shape.ShapeAppearanceModel r6 = r0.f50553b0
            com.google.android.material.shape.ShapeAppearanceModel$Builder r6 = r6.mo58707v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x01a1
            r6.mo58715E(r2)
        L_0x01a1:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01a8
            r6.mo58719I(r4)
        L_0x01a8:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01af
            r6.mo58733z(r5)
        L_0x01af:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x01b6
            r6.mo58729v(r3)
        L_0x01b6:
            com.google.android.material.shape.ShapeAppearanceModel r2 = r6.mo58721m()
            r0.f50553b0 = r2
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.m69122b(r13, r1, r2)
            if (r2 == 0) goto L_0x021f
            int r3 = r2.getDefaultColor()
            r0.f50538S0 = r3
            r0.f50568j0 = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01fa
            r3 = 1
            int[] r5 = new int[r3]
            r3 = 0
            r5[r3] = r4
            r3 = -1
            int r4 = r2.getColorForState(r5, r3)
            r0.f50540T0 = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r2.getColorForState(r5, r3)
            r0.f50542U0 = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r5, r3)
            r0.f50544V0 = r2
            goto L_0x022a
        L_0x01fa:
            r3 = -1
            int r2 = r0.f50538S0
            r0.f50542U0 = r2
            int r2 = com.google.android.material.C10462R.C10463color.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r13, r2)
            r5 = 1
            int[] r6 = new int[r5]
            r7 = 0
            r6[r7] = r4
            int r4 = r2.getColorForState(r6, r3)
            r0.f50540T0 = r4
            int[] r4 = new int[r5]
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r4[r7] = r5
            int r2 = r2.getColorForState(r4, r3)
            r0.f50544V0 = r2
            goto L_0x022a
        L_0x021f:
            r7 = 0
            r0.f50568j0 = r7
            r0.f50538S0 = r7
            r0.f50540T0 = r7
            r0.f50542U0 = r7
            r0.f50544V0 = r7
        L_0x022a:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_android_textColorHint
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x023a
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.f50528N0 = r2
            r0.f50526M0 = r2
        L_0x023a:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r3 = com.google.android.material.resources.MaterialResources.m69122b(r13, r1, r2)
            r4 = 0
            int r2 = r1.getColor(r2, r4)
            r0.f50534Q0 = r2
            int r2 = com.google.android.material.C10462R.C10463color.mtrl_textinput_default_box_stroke_color
            int r2 = androidx.core.content.ContextCompat.getColor(r13, r2)
            r0.f50530O0 = r2
            int r2 = com.google.android.material.C10462R.C10463color.mtrl_textinput_disabled_color
            int r2 = androidx.core.content.ContextCompat.getColor(r13, r2)
            r0.f50546W0 = r2
            int r2 = com.google.android.material.C10462R.C10463color.mtrl_textinput_hovered_box_stroke_color
            int r2 = androidx.core.content.ContextCompat.getColor(r13, r2)
            r0.f50532P0 = r2
            if (r3 == 0) goto L_0x0264
            r0.setBoxStrokeColorStateList(r3)
        L_0x0264:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_boxStrokeErrorColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0273
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.m69122b(r13, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0273:
            r2 = -1
            int r3 = r1.getResourceId(r12, r2)
            if (r3 == r2) goto L_0x0283
            r2 = 0
            int r3 = r1.getResourceId(r12, r2)
            r0.setHintTextAppearance(r3)
            goto L_0x0284
        L_0x0283:
            r2 = 0
        L_0x0284:
            int r3 = r1.getResourceId(r10, r2)
            int r4 = com.google.android.material.C10462R.styleable.TextInputLayout_errorContentDescription
            java.lang.CharSequence r4 = r1.getText(r4)
            int r5 = com.google.android.material.C10462R.styleable.TextInputLayout_errorEnabled
            boolean r5 = r1.getBoolean(r5, r2)
            android.content.Context r6 = r26.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = com.google.android.material.C10462R.C10467layout.design_text_input_end_icon
            android.view.View r6 = r6.inflate(r7, r11, r2)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f50522K0 = r6
            int r8 = com.google.android.material.C10462R.C10465id.text_input_error_icon
            r6.setId(r8)
            r8 = 8
            r6.setVisibility(r8)
            boolean r9 = com.google.android.material.resources.MaterialResources.m69127g(r13)
            if (r9 == 0) goto L_0x02bf
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r9, r2)
        L_0x02bf:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_errorIconDrawable
            boolean r9 = r1.hasValue(r2)
            if (r9 == 0) goto L_0x02ce
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x02ce:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_errorIconTint
            boolean r9 = r1.hasValue(r2)
            if (r9 == 0) goto L_0x02dd
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.m69122b(r13, r1, r2)
            r0.setErrorIconTintList(r2)
        L_0x02dd:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_errorIconTintMode
            boolean r9 = r1.hasValue(r2)
            r10 = 0
            if (r9 == 0) goto L_0x02f2
            r9 = -1
            int r2 = r1.getInt(r2, r9)
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.ViewUtils.m68843j(r2, r10)
            r0.setErrorIconTintMode(r2)
        L_0x02f2:
            android.content.res.Resources r2 = r26.getResources()
            int r9 = com.google.android.material.C10462R.string.error_icon_content_description
            java.lang.CharSequence r2 = r2.getText(r9)
            r6.setContentDescription(r2)
            r2 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r2)
            r2 = 0
            r6.setClickable(r2)
            r6.setPressable(r2)
            r6.setFocusable(r2)
            int r9 = r1.getResourceId(r14, r2)
            int r12 = com.google.android.material.C10462R.styleable.TextInputLayout_helperTextEnabled
            boolean r12 = r1.getBoolean(r12, r2)
            int r14 = com.google.android.material.C10462R.styleable.TextInputLayout_helperText
            java.lang.CharSequence r14 = r1.getText(r14)
            int r10 = com.google.android.material.C10462R.styleable.TextInputLayout_placeholderTextAppearance
            int r10 = r1.getResourceId(r10, r2)
            int r8 = com.google.android.material.C10462R.styleable.TextInputLayout_placeholderText
            java.lang.CharSequence r8 = r1.getText(r8)
            r18 = r10
            int r10 = com.google.android.material.C10462R.styleable.TextInputLayout_prefixTextAppearance
            int r10 = r1.getResourceId(r10, r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_prefixText
            java.lang.CharSequence r2 = r1.getText(r2)
            r21 = r10
            int r10 = com.google.android.material.C10462R.styleable.TextInputLayout_suffixTextAppearance
            r22 = r2
            r2 = 0
            int r10 = r1.getResourceId(r10, r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_suffixText
            java.lang.CharSequence r2 = r1.getText(r2)
            r23 = r10
            int r10 = com.google.android.material.C10462R.styleable.TextInputLayout_counterEnabled
            r24 = r2
            r2 = 0
            boolean r10 = r1.getBoolean(r10, r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_counterMaxLength
            r25 = r10
            r10 = -1
            int r2 = r1.getInt(r2, r10)
            r0.setCounterMaxLength(r2)
            r2 = 0
            int r10 = r1.getResourceId(r15, r2)
            r0.f50511F = r10
            r10 = r20
            int r10 = r1.getResourceId(r10, r2)
            r0.f50509E = r10
            android.content.Context r10 = r26.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r15 = com.google.android.material.C10462R.C10467layout.design_text_input_start_icon
            r20 = r8
            r8 = r17
            android.view.View r10 = r10.inflate(r15, r8, r2)
            com.google.android.material.internal.CheckableImageButton r10 = (com.google.android.material.internal.CheckableImageButton) r10
            r0.f50574o0 = r10
            r15 = 8
            r10.setVisibility(r15)
            boolean r15 = com.google.android.material.resources.MaterialResources.m69127g(r13)
            if (r15 == 0) goto L_0x0398
            android.view.ViewGroup$LayoutParams r15 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r15, r2)
        L_0x0398:
            r2 = 0
            r0.setStartIconOnClickListener(r2)
            r0.setStartIconOnLongClickListener(r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_startIconDrawable
            boolean r15 = r1.hasValue(r2)
            if (r15 == 0) goto L_0x03c7
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_startIconContentDescription
            boolean r15 = r1.hasValue(r2)
            if (r15 == 0) goto L_0x03bd
            java.lang.CharSequence r2 = r1.getText(r2)
            r0.setStartIconContentDescription((java.lang.CharSequence) r2)
        L_0x03bd:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_startIconCheckable
            r15 = 1
            boolean r2 = r1.getBoolean(r2, r15)
            r0.setStartIconCheckable(r2)
        L_0x03c7:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_startIconTint
            boolean r15 = r1.hasValue(r2)
            if (r15 == 0) goto L_0x03d6
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.m69122b(r13, r1, r2)
            r0.setStartIconTintList(r2)
        L_0x03d6:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_startIconTintMode
            boolean r15 = r1.hasValue(r2)
            if (r15 == 0) goto L_0x03eb
            r15 = -1
            int r2 = r1.getInt(r2, r15)
            r15 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.ViewUtils.m68843j(r2, r15)
            r0.setStartIconTintMode(r2)
        L_0x03eb:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_boxBackgroundMode
            r15 = 0
            int r2 = r1.getInt(r2, r15)
            r0.setBoxBackgroundMode(r2)
            android.content.Context r2 = r26.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r17 = r4
            r4 = r19
            android.view.View r2 = r2.inflate(r7, r4, r15)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f50588z0 = r2
            r4.addView(r2)
            r7 = 8
            r2.setVisibility(r7)
            boolean r7 = com.google.android.material.resources.MaterialResources.m69127g(r13)
            if (r7 == 0) goto L_0x0420
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r2, r15)
        L_0x0420:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_endIconDrawable
            int r2 = r1.getResourceId(r2, r15)
            com.google.android.material.textfield.CustomEndIconDelegate r7 = new com.google.android.material.textfield.CustomEndIconDelegate
            r7.<init>(r0, r2)
            r29 = r3
            r15 = r16
            r3 = -1
            r15.append(r3, r7)
            com.google.android.material.textfield.NoEndIconDelegate r3 = new com.google.android.material.textfield.NoEndIconDelegate
            r3.<init>(r0)
            r7 = 0
            r15.append(r7, r3)
            com.google.android.material.textfield.PasswordToggleEndIconDelegate r3 = new com.google.android.material.textfield.PasswordToggleEndIconDelegate
            if (r2 != 0) goto L_0x0449
            r16 = r5
            int r5 = com.google.android.material.C10462R.styleable.TextInputLayout_passwordToggleDrawable
            int r5 = r1.getResourceId(r5, r7)
            goto L_0x044c
        L_0x0449:
            r16 = r5
            r5 = r2
        L_0x044c:
            r3.<init>(r0, r5)
            r5 = 1
            r15.append(r5, r3)
            com.google.android.material.textfield.ClearTextEndIconDelegate r3 = new com.google.android.material.textfield.ClearTextEndIconDelegate
            r3.<init>(r0, r2)
            r5 = 2
            r15.append(r5, r3)
            com.google.android.material.textfield.DropdownMenuEndIconDelegate r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate
            r3.<init>(r0, r2)
            r2 = 3
            r15.append(r2, r3)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_endIconMode
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x048f
            r3 = 0
            int r2 = r1.getInt(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_endIconContentDescription
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0484
            java.lang.CharSequence r2 = r1.getText(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0484:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_endIconCheckable
            r3 = 1
            boolean r2 = r1.getBoolean(r2, r3)
            r0.setEndIconCheckable(r2)
            goto L_0x04cc
        L_0x048f:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x04cc
            r3 = 0
            boolean r2 = r1.getBoolean(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r2 = r1.getText(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_passwordToggleTint
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x04b7
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.m69122b(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04b7:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_passwordToggleTintMode
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x04cc
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.ViewUtils.m68843j(r2, r3)
            r0.setEndIconTintMode(r2)
        L_0x04cc:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x04f8
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_endIconTint
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x04e3
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.m69122b(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04e3:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_endIconTintMode
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x04f8
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.ViewUtils.m68843j(r2, r3)
            r0.setEndIconTintMode(r2)
        L_0x04f8:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13)
            r0.f50533Q = r2
            int r3 = com.google.android.material.C10462R.C10465id.textinput_prefix_text
            r2.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r5 = -2
            r3.<init>(r5, r5)
            r2.setLayoutParams(r3)
            r3 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r2, r3)
            r8.addView(r10)
            r8.addView(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13)
            r0.f50537S = r2
            int r3 = com.google.android.material.C10462R.C10465id.textinput_suffix_text
            r2.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r7 = 80
            r3.<init>(r5, r5, r7)
            r2.setLayoutParams(r3)
            r3 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r2, r3)
            r11.addView(r2)
            r11.addView(r6)
            r11.addView(r4)
            r0.setHelperTextEnabled(r12)
            r0.setHelperText(r14)
            r0.setHelperTextTextAppearance(r9)
            r2 = r16
            r0.setErrorEnabled(r2)
            r2 = r29
            r0.setErrorTextAppearance(r2)
            r2 = r17
            r0.setErrorContentDescription(r2)
            int r2 = r0.f50511F
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f50509E
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r20
            r0.setPlaceholderText(r2)
            r2 = r18
            r0.setPlaceholderTextAppearance(r2)
            r2 = r22
            r0.setPrefixText(r2)
            r2 = r21
            r0.setPrefixTextAppearance(r2)
            r2 = r24
            r0.setSuffixText(r2)
            r2 = r23
            r0.setSuffixTextAppearance(r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_errorTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0589
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setErrorTextColor(r2)
        L_0x0589:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_helperTextTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0598
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setHelperTextColor(r2)
        L_0x0598:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_hintTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x05a7
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setHintTextColor(r2)
        L_0x05a7:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_counterTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x05b6
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setCounterTextColor(r2)
        L_0x05b6:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_counterOverflowTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x05c5
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05c5:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_placeholderTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x05d4
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05d4:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_prefixTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x05e3
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setPrefixTextColor(r2)
        L_0x05e3:
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_suffixTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x05f2
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r0.setSuffixTextColor(r2)
        L_0x05f2:
            r2 = r25
            r0.setCounterEnabled(r2)
            int r2 = com.google.android.material.C10462R.styleable.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.getBoolean(r2, r3)
            r0.setEnabled(r2)
            r1.recycle()
            r1 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0611
            androidx.core.view.ViewCompat.setImportantForAutofill(r0, r3)
        L_0x0611:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f50588z0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f50588z0.setImageDrawable(drawable);
        if (drawable != null) {
            m69904m();
            mo59172X();
        }
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f50574o0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f50574o0.setImageDrawable(drawable);
        if (drawable != null) {
            m69908o();
            setStartIconVisible(true);
            mo59174a0();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f50522K0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f50587z.mo59146x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f50588z0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f50588z0.setImageDrawable(drawable);
    }

    public void setHint(@StringRes int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
