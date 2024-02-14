package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;

class DropdownMenuEndIconDelegate extends EndIconDelegate {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final boolean f50426r = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final TextWatcher f50427e = new TextWatcherAdapter() {
        public void afterTextChanged(Editable editable) {
            final AutoCompleteTextView e = DropdownMenuEndIconDelegate.m69794y(DropdownMenuEndIconDelegate.this.f50455a.getEditText());
            if (DropdownMenuEndIconDelegate.this.f50437o.isTouchExplorationEnabled() && DropdownMenuEndIconDelegate.m69769D(e) && !DropdownMenuEndIconDelegate.this.f50457c.hasFocus()) {
                e.dismissDropDown();
            }
            e.post(new Runnable() {
                public void run() {
                    boolean isPopupShowing = e.isPopupShowing();
                    DropdownMenuEndIconDelegate.this.m69770E(isPopupShowing);
                    boolean unused = DropdownMenuEndIconDelegate.this.f50432j = isPopupShowing;
                }
            });
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final View.OnFocusChangeListener f50428f = new View.OnFocusChangeListener() {
        public void onFocusChange(View view, boolean z) {
            DropdownMenuEndIconDelegate.this.f50455a.setEndIconActivated(z);
            if (!z) {
                DropdownMenuEndIconDelegate.this.m69770E(false);
                boolean unused = DropdownMenuEndIconDelegate.this.f50432j = false;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final TextInputLayout.AccessibilityDelegate f50429g = new TextInputLayout.AccessibilityDelegate(this.f50455a) {
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!DropdownMenuEndIconDelegate.m69769D(DropdownMenuEndIconDelegate.this.f50455a.getEditText())) {
                accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
            }
            if (accessibilityNodeInfoCompat.isShowingHintText()) {
                accessibilityNodeInfoCompat.setHintText((CharSequence) null);
            }
        }

        public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView e = DropdownMenuEndIconDelegate.m69794y(DropdownMenuEndIconDelegate.this.f50455a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && DropdownMenuEndIconDelegate.this.f50437o.isTouchExplorationEnabled() && !DropdownMenuEndIconDelegate.m69769D(DropdownMenuEndIconDelegate.this.f50455a.getEditText())) {
                DropdownMenuEndIconDelegate.this.m69773H(e);
            }
        }
    };

    /* renamed from: h */
    private final TextInputLayout.OnEditTextAttachedListener f50430h = new TextInputLayout.OnEditTextAttachedListener() {
        /* renamed from: a */
        public void mo59101a(@NonNull TextInputLayout textInputLayout) {
            AutoCompleteTextView e = DropdownMenuEndIconDelegate.m69794y(textInputLayout.getEditText());
            DropdownMenuEndIconDelegate.this.m69771F(e);
            DropdownMenuEndIconDelegate.this.m69791v(e);
            DropdownMenuEndIconDelegate.this.m69772G(e);
            e.setThreshold(0);
            e.removeTextChangedListener(DropdownMenuEndIconDelegate.this.f50427e);
            e.addTextChangedListener(DropdownMenuEndIconDelegate.this.f50427e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!DropdownMenuEndIconDelegate.m69769D(e)) {
                ViewCompat.setImportantForAccessibility(DropdownMenuEndIconDelegate.this.f50457c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(DropdownMenuEndIconDelegate.this.f50429g);
            textInputLayout.setEndIconVisible(true);
        }
    };

    /* renamed from: i */
    private final TextInputLayout.OnEndIconChangedListener f50431i = new TextInputLayout.OnEndIconChangedListener() {
        /* renamed from: a */
        public void mo59102a(@NonNull TextInputLayout textInputLayout, int i) {
            final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new Runnable() {
                    public void run() {
                        autoCompleteTextView.removeTextChangedListener(DropdownMenuEndIconDelegate.this.f50427e);
                    }
                });
                if (autoCompleteTextView.getOnFocusChangeListener() == DropdownMenuEndIconDelegate.this.f50428f) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (DropdownMenuEndIconDelegate.f50426r) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f50432j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f50433k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f50434l = LocationRequestCompat.PASSIVE_INTERVAL;

    /* renamed from: m */
    private StateListDrawable f50435m;

    /* renamed from: n */
    private MaterialShapeDrawable f50436n;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: o */
    public AccessibilityManager f50437o;

    /* renamed from: p */
    private ValueAnimator f50438p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ValueAnimator f50439q;

    DropdownMenuEndIconDelegate(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        super(textInputLayout, i);
    }

    /* renamed from: A */
    private MaterialShapeDrawable m69766A(float f, float f2, float f3, int i) {
        ShapeAppearanceModel m = ShapeAppearanceModel.m69260a().mo58715E(f).mo58719I(f).mo58729v(f2).mo58733z(f2).mo58721m();
        MaterialShapeDrawable m2 = MaterialShapeDrawable.m69196m(this.f50456b, f3);
        m2.setShapeAppearanceModel(m);
        m2.mo58658c0(0, i, 0, i);
        return m2;
    }

    /* renamed from: B */
    private void m69767B() {
        this.f50439q = m69795z(67, 0.0f, 1.0f);
        ValueAnimator z = m69795z(50, 1.0f, 0.0f);
        this.f50438p = z;
        z.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                dropdownMenuEndIconDelegate.f50457c.setChecked(dropdownMenuEndIconDelegate.f50433k);
                DropdownMenuEndIconDelegate.this.f50439q.start();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public boolean m69768C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f50434l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static boolean m69769D(@NonNull EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m69770E(boolean z) {
        if (this.f50433k != z) {
            this.f50433k = z;
            this.f50439q.cancel();
            this.f50438p.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m69771F(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (f50426r) {
            int boxBackgroundMode = this.f50455a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f50436n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f50435m);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m69772G(@NonNull final AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (DropdownMenuEndIconDelegate.this.m69768C()) {
                        boolean unused = DropdownMenuEndIconDelegate.this.f50432j = false;
                    }
                    DropdownMenuEndIconDelegate.this.m69773H(autoCompleteTextView);
                }
                return false;
            }
        });
        autoCompleteTextView.setOnFocusChangeListener(this.f50428f);
        if (f50426r) {
            autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() {
                public void onDismiss() {
                    boolean unused = DropdownMenuEndIconDelegate.this.f50432j = true;
                    long unused2 = DropdownMenuEndIconDelegate.this.f50434l = System.currentTimeMillis();
                    DropdownMenuEndIconDelegate.this.m69770E(false);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m69773H(@Nullable AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m69768C()) {
                this.f50432j = false;
            }
            if (!this.f50432j) {
                if (f50426r) {
                    m69770E(!this.f50433k);
                } else {
                    this.f50433k = !this.f50433k;
                    this.f50457c.toggle();
                }
                if (this.f50433k) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f50432j = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m69791v(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (!m69769D(autoCompleteTextView)) {
            int boxBackgroundMode = this.f50455a.getBoxBackgroundMode();
            MaterialShapeDrawable boxBackground = this.f50455a.getBoxBackground();
            int d = MaterialColors.m68104d(autoCompleteTextView, C10462R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m69793x(autoCompleteTextView, d, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m69792w(autoCompleteTextView, d, iArr, boxBackground);
            }
        }
    }

    /* renamed from: w */
    private void m69792w(@NonNull AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        int boxBackgroundColor = this.f50455a.getBoxBackgroundColor();
        int[] iArr2 = {MaterialColors.m68108h(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f50426r) {
            ViewCompat.setBackground(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), materialShapeDrawable, materialShapeDrawable));
            return;
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable2.mo58656a0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable, materialShapeDrawable2});
        int paddingStart = ViewCompat.getPaddingStart(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        ViewCompat.setBackground(autoCompleteTextView, layerDrawable);
        ViewCompat.setPaddingRelative(autoCompleteTextView, paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    /* renamed from: x */
    private void m69793x(@NonNull AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        LayerDrawable layerDrawable;
        int d = MaterialColors.m68104d(autoCompleteTextView, C10462R.attr.colorSurface);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int h = MaterialColors.m68108h(i, d, 0.1f);
        materialShapeDrawable2.mo58656a0(new ColorStateList(iArr, new int[]{h, 0}));
        if (f50426r) {
            materialShapeDrawable2.setTint(d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h, d});
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
            materialShapeDrawable3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable});
        }
        ViewCompat.setBackground(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: y */
    public static AutoCompleteTextView m69794y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    private ValueAnimator m69795z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.f48521a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                DropdownMenuEndIconDelegate.this.f50457c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo59095a() {
        float dimensionPixelOffset = (float) this.f50456b.getResources().getDimensionPixelOffset(C10462R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f50456b.getResources().getDimensionPixelOffset(C10462R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f50456b.getResources().getDimensionPixelOffset(C10462R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable A = m69766A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        MaterialShapeDrawable A2 = m69766A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f50436n = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f50435m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f50435m.addState(new int[0], A2);
        int i = this.f50458d;
        if (i == 0) {
            i = f50426r ? C10462R.C10464drawable.mtrl_dropdown_arrow : C10462R.C10464drawable.mtrl_ic_arrow_drop_down;
        }
        this.f50455a.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.f50455a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C10462R.string.exposed_dropdown_menu_content_description));
        this.f50455a.setEndIconOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DropdownMenuEndIconDelegate.this.m69773H((AutoCompleteTextView) DropdownMenuEndIconDelegate.this.f50455a.getEditText());
            }
        });
        this.f50455a.mo59180e(this.f50430h);
        this.f50455a.mo59181f(this.f50431i);
        m69767B();
        this.f50437o = (AccessibilityManager) this.f50456b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo59113b(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo59114d() {
        return true;
    }
}
