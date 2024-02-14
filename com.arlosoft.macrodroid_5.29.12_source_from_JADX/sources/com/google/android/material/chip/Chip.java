package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.C0144Px;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.C10462R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.List;

public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable {

    /* renamed from: I */
    private static final int f48967I = C10462R.style.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static final Rect f48968J = new Rect();

    /* renamed from: K */
    private static final int[] f48969K = {16842913};

    /* renamed from: L */
    private static final int[] f48970L = {16842911};

    /* renamed from: A */
    private boolean f48971A;

    /* renamed from: B */
    private int f48972B;
    @Dimension(unit = 1)

    /* renamed from: C */
    private int f48973C;
    @NonNull

    /* renamed from: D */
    private final ChipTouchHelper f48974D;

    /* renamed from: E */
    private boolean f48975E;

    /* renamed from: F */
    private final Rect f48976F;

    /* renamed from: G */
    private final RectF f48977G;

    /* renamed from: H */
    private final TextAppearanceFontCallback f48978H;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public ChipDrawable f48979a;
    @Nullable

    /* renamed from: c */
    private InsetDrawable f48980c;
    @Nullable

    /* renamed from: d */
    private RippleDrawable f48981d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public View.OnClickListener f48982f;
    @Nullable

    /* renamed from: g */
    private CompoundButton.OnCheckedChangeListener f48983g;

    /* renamed from: o */
    private boolean f48984o;

    /* renamed from: p */
    private boolean f48985p;

    /* renamed from: s */
    private boolean f48986s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f48987z;

    private class ChipTouchHelper extends ExploreByTouchHelper {
        ChipTouchHelper(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int getVirtualViewAt(float f, float f2) {
            return (!Chip.this.m67864m() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.m67864m() && Chip.this.mo57228r() && Chip.this.f48982f != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo57229s();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCheckable(Chip.this.mo57227q());
            accessibilityNodeInfoCompat.setClickable(Chip.this.isClickable());
            accessibilityNodeInfoCompat.setClassName(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityNodeInfoCompat.setText(text);
            } else {
                accessibilityNodeInfoCompat.setContentDescription(text);
            }
        }

        /* access modifiers changed from: protected */
        public void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C10462R.string.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    accessibilityNodeInfoCompat.setContentDescription(context.getString(i2, objArr).trim());
                }
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                accessibilityNodeInfoCompat.setEnabled(Chip.this.isEnabled());
                return;
            }
            accessibilityNodeInfoCompat.setContentDescription(charSequence);
            accessibilityNodeInfoCompat.setBoundsInParent(Chip.f48968J);
        }

        /* access modifiers changed from: protected */
        public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f48987z = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.chipStyle);
    }

    /* renamed from: A */
    private void m67852A() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo58607n(getContext(), paint, this.f48978H);
        }
    }

    /* renamed from: B */
    private void m67853B(@Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f48977G.setEmpty();
        if (m67864m() && this.f48982f != null) {
            this.f48979a.mo57394f1(this.f48977G);
        }
        return this.f48977G;
    }

    /* access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f48976F.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f48976F;
    }

    @Nullable
    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57421p1();
        }
        return null;
    }

    /* renamed from: i */
    private void m67861i(@NonNull ChipDrawable chipDrawable) {
        chipDrawable.mo57440w2(this);
    }

    @NonNull
    /* renamed from: j */
    private int[] m67862j() {
        int isEnabled = isEnabled();
        if (this.f48987z) {
            isEnabled++;
        }
        if (this.f48986s) {
            isEnabled++;
        }
        if (this.f48985p) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f48987z) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f48986s) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f48985p) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m67863l() {
        if (getBackgroundDrawable() == this.f48980c && this.f48979a.getCallback() == null) {
            this.f48979a.setCallback(this.f48980c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m67864m() {
        ChipDrawable chipDrawable = this.f48979a;
        return (chipDrawable == null || chipDrawable.mo57379Y0() == null) ? false : true;
    }

    /* renamed from: n */
    private void m67865n(Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.Chip, i, f48967I, new int[0]);
        this.f48971A = h.getBoolean(C10462R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.f48973C = (int) Math.ceil((double) h.getDimension(C10462R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) ViewUtils.m68837d(getContext(), 48))));
        h.recycle();
    }

    /* renamed from: o */
    private void m67866o() {
        setOutlineProvider(new ViewOutlineProvider() {
            public void getOutline(View view, @NonNull Outline outline) {
                if (Chip.this.f48979a != null) {
                    Chip.this.f48979a.getOutline(outline);
                } else {
                    outline.setAlpha(0.0f);
                }
            }
        });
    }

    /* renamed from: p */
    private void m67867p(int i, int i2, int i3, int i4) {
        this.f48980c = new InsetDrawable(this.f48979a, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f48986s != z) {
            this.f48986s = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f48985p != z) {
            this.f48985p = z;
            refreshDrawableState();
        }
    }

    /* renamed from: t */
    private void m67868t() {
        if (this.f48980c != null) {
            this.f48980c = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m67871x();
        }
    }

    /* renamed from: v */
    private void m67869v(@Nullable ChipDrawable chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.mo57440w2((ChipDrawable.Delegate) null);
        }
    }

    /* renamed from: w */
    private void m67870w() {
        if (!m67864m() || !mo57228r() || this.f48982f == null) {
            ViewCompat.setAccessibilityDelegate(this, (AccessibilityDelegateCompat) null);
            this.f48975E = false;
            return;
        }
        ViewCompat.setAccessibilityDelegate(this, this.f48974D);
        this.f48975E = true;
    }

    /* renamed from: x */
    private void m67871x() {
        if (RippleUtils.f49933a) {
            m67872y();
            return;
        }
        this.f48979a.mo57365R2(true);
        ViewCompat.setBackground(this, getBackgroundDrawable());
        m67873z();
        m67863l();
    }

    /* renamed from: y */
    private void m67872y() {
        this.f48981d = new RippleDrawable(RippleUtils.m69155d(this.f48979a.mo57413m1()), getBackgroundDrawable(), (Drawable) null);
        this.f48979a.mo57365R2(false);
        ViewCompat.setBackground(this, this.f48981d);
        m67873z();
    }

    /* renamed from: z */
    private void m67873z() {
        ChipDrawable chipDrawable;
        if (!TextUtils.isEmpty(getText()) && (chipDrawable = this.f48979a) != null) {
            int Q0 = (int) (chipDrawable.mo57360Q0() + this.f48979a.mo57423q1() + this.f48979a.mo57441x0());
            int V0 = (int) (this.f48979a.mo57373V0() + this.f48979a.mo57425r1() + this.f48979a.mo57432t0());
            if (this.f48980c != null) {
                Rect rect = new Rect();
                this.f48980c.getPadding(rect);
                V0 += rect.left;
                Q0 += rect.right;
            }
            ViewCompat.setPaddingRelative(this, V0, getPaddingTop(), Q0, getPaddingBottom());
        }
    }

    /* renamed from: a */
    public void mo57184a() {
        mo57218k(this.f48973C);
        requestLayout();
        invalidateOutline();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (!this.f48975E) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return this.f48974D.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f48975E) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f48974D.dispatchKeyEvent(keyEvent) || this.f48974D.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.f48979a;
        if ((chipDrawable == null || !chipDrawable.mo57439w1()) ? false : this.f48979a.mo57427s2(m67862j())) {
            invalidate();
        }
    }

    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!mo57227q()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).mo57461p()) ? "android.widget.CompoundButton" : "android.widget.RadioButton";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f48980c;
        return insetDrawable == null ? this.f48979a : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57348M0();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57351N0();
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57354O0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.mo57357P0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f48979a;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57360Q0();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57363R0();
        }
        return null;
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57366S0();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57369T0();
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57371U0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57373V0();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57375W0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57377X0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57379Y0();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57381Z0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57383a1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57385b1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57387c1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57392e1();
        }
        return null;
    }

    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57404i1();
        }
        return null;
    }

    public void getFocusedRect(@NonNull Rect rect) {
        if (!this.f48975E || !(this.f48974D.getKeyboardFocusedVirtualViewId() == 1 || this.f48974D.getAccessibilityFocusedVirtualViewId() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57407j1();
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57409k1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57411l1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57413m1();
        }
        return null;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f48979a.getShapeAppearanceModel();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57415n1();
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57423q1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            return chipDrawable.mo57425r1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public boolean mo57218k(@Dimension int i) {
        this.f48973C = i;
        int i2 = 0;
        if (!mo57322u()) {
            if (this.f48980c != null) {
                m67868t();
            } else {
                m67871x();
            }
            return false;
        }
        int max = Math.max(0, i - this.f48979a.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f48979a.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.f48980c != null) {
                Rect rect = new Rect();
                this.f48980c.getPadding(rect);
                if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                    m67871x();
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            m67867p(i3, i2, i3, i2);
            m67871x();
            return true;
        }
        if (this.f48980c != null) {
            m67868t();
        } else {
            m67871x();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m69255f(this, this.f48979a);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f48969K);
        }
        if (mo57227q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f48970L);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f48975E) {
            this.f48974D.onFocusChanged(z, i, rect);
        }
    }

    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(mo57227q());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(chipGroup.mo58101b(this), 1, chipGroup.mo57447c() ? chipGroup.mo57458o(this) : -1, 1, false, isChecked()));
        }
    }

    @Nullable
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f48972B != i) {
            this.f48972B = i;
            m67873z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f48985p
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f48985p
            if (r0 == 0) goto L_0x0034
            r5.mo57229s()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean mo57227q() {
        ChipDrawable chipDrawable = this.f48979a;
        return chipDrawable != null && chipDrawable.mo57437v1();
    }

    /* renamed from: r */
    public boolean mo57228r() {
        ChipDrawable chipDrawable = this.f48979a;
        return chipDrawable != null && chipDrawable.mo57442x1();
    }

    @CallSuper
    /* renamed from: s */
    public boolean mo57229s() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f48982f;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f48975E) {
            this.f48974D.sendEventForVirtualView(1, 1);
        }
        return z;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f48981d) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f48981d) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57332E1(z);
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57334F1(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable == null) {
            this.f48984o = z;
        } else if (chipDrawable.mo57437v1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f48983g) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57336G1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57338H1(i);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57340I1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57342J1(i);
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57344K1(i);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57349M1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57352N1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57355O1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57358P1(i);
        }
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.f48979a;
        if (chipDrawable2 != chipDrawable) {
            m67869v(chipDrawable2);
            this.f48979a = chipDrawable;
            chipDrawable.mo57339H2(false);
            m67861i(this.f48979a);
            mo57218k(this.f48973C);
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57361Q1(f);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57364R1(i);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57367S1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57370T1(i);
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57372U1(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57374V1(i);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57376W1(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57378X1(i);
        }
    }

    public void setChipIconVisible(@BoolRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57380Y1(i);
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57384a2(f);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57386b2(i);
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57388c2(f);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57390d2(i);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57393e2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57395f2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57396g2(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57403h2(i);
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57408j2(drawable);
        }
        m67870w();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57410k2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57412l2(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57414m2(i);
        }
    }

    public void setCloseIconResource(@DrawableRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57416n2(i);
        }
        m67870w();
    }

    public void setCloseIconSize(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57418o2(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57422p2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57424q2(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57426r2(i);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57434t2(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57435u2(i);
        }
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo58655Z(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f48979a != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                ChipDrawable chipDrawable = this.f48979a;
                if (chipDrawable != null) {
                    chipDrawable.mo57443x2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f48971A = z;
        mo57218k(this.f48973C);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57444y2(motionSpec);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57445z2(i);
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57327A2(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57328B2(i);
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57330C2(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57331D2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f48979a != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(@C0144Px int i) {
        super.setMaxWidth(i);
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57333E2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f48983g = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f48982f = onClickListener;
        m67870w();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57335F2(colorStateList);
        }
        if (!this.f48979a.mo57433t1()) {
            m67872y();
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57337G2(i);
            if (!this.f48979a.mo57433t1()) {
                m67872y();
            }
        }
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f48979a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57341I2(motionSpec);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57343J2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(chipDrawable.mo57368S2() ? null : charSequence, bufferType);
            ChipDrawable chipDrawable2 = this.f48979a;
            if (chipDrawable2 != null) {
                chipDrawable2.mo57345K2(charSequence);
            }
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57347L2(textAppearance);
        }
        m67852A();
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57353N2(f);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57356O2(i);
        }
    }

    public void setTextStartPadding(float f) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57359P2(f);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57362Q2(i);
        }
    }

    /* renamed from: u */
    public boolean mo57322u() {
        return this.f48971A;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f48967I
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f48976F = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f48977G = r8
            com.google.android.material.chip.Chip$1 r8 = new com.google.android.material.chip.Chip$1
            r8.<init>()
            r7.f48978H = r8
            android.content.Context r8 = r7.getContext()
            r7.m67853B(r9)
            com.google.android.material.chip.ChipDrawable r6 = com.google.android.material.chip.ChipDrawable.m67885C0(r8, r9, r10, r4)
            r7.m67865n(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = androidx.core.view.ViewCompat.getElevation(r7)
            r6.mo58655Z(r0)
            int[] r2 = com.google.android.material.C10462R.styleable.Chip
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L_0x0051
            int r10 = com.google.android.material.C10462R.styleable.Chip_android_textColor
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.m69121a(r8, r9, r10)
            r7.setTextColor(r8)
        L_0x0051:
            int r8 = com.google.android.material.C10462R.styleable.Chip_shapeAppearance
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$ChipTouchHelper r9 = new com.google.android.material.chip.Chip$ChipTouchHelper
            r9.<init>(r7)
            r7.f48974D = r9
            r7.m67870w()
            if (r8 != 0) goto L_0x0069
            r7.m67866o()
        L_0x0069:
            boolean r8 = r7.f48984o
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.mo57417o1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.mo57404i1()
            r7.setEllipsize(r8)
            r7.m67852A()
            com.google.android.material.chip.ChipDrawable r8 = r7.f48979a
            boolean r8 = r8.mo57368S2()
            if (r8 != 0) goto L_0x008e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L_0x008e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.m67873z()
            boolean r8 = r7.mo57322u()
            if (r8 == 0) goto L_0x00a2
            int r8 = r7.f48973C
            r7.setMinHeight(r8)
        L_0x00a2:
            int r8 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            r7.f48972B = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57438v2(z);
        }
        m67870w();
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57346L1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57382Z1(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57350M2(i);
        }
        m67852A();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ChipDrawable chipDrawable = this.f48979a;
        if (chipDrawable != null) {
            chipDrawable.mo57350M2(i);
        }
        m67852A();
    }
}
