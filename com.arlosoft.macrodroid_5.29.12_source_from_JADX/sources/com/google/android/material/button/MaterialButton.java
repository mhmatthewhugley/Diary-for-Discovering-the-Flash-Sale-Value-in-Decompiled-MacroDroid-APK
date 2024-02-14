package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C10462R;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {

    /* renamed from: E */
    private static final int[] f48874E = {16842911};

    /* renamed from: F */
    private static final int[] f48875F = {16842912};

    /* renamed from: G */
    private static final int f48876G = C10462R.style.Widget_MaterialComponents_Button;
    @C0144Px

    /* renamed from: A */
    private int f48877A;

    /* renamed from: B */
    private boolean f48878B;

    /* renamed from: C */
    private boolean f48879C;

    /* renamed from: D */
    private int f48880D;
    @NonNull

    /* renamed from: a */
    private final MaterialButtonHelper f48881a;
    @NonNull

    /* renamed from: c */
    private final LinkedHashSet<OnCheckedChangeListener> f48882c;
    @Nullable

    /* renamed from: d */
    private OnPressedChangeListener f48883d;
    @Nullable

    /* renamed from: f */
    private PorterDuff.Mode f48884f;
    @Nullable

    /* renamed from: g */
    private ColorStateList f48885g;
    @Nullable

    /* renamed from: o */
    private Drawable f48886o;
    @C0144Px

    /* renamed from: p */
    private int f48887p;
    @C0144Px

    /* renamed from: s */
    private int f48888s;
    @C0144Px

    /* renamed from: z */
    private int f48889z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OnCheckedChangeListener {
        /* renamed from: a */
        void mo57038a(MaterialButton materialButton, boolean z);
    }

    interface OnPressedChangeListener {
        /* renamed from: a */
        void mo57039a(MaterialButton materialButton, boolean z);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            @NonNull
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

        /* renamed from: a */
        boolean f48890a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m67715a(@NonNull Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f48890a = z;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f48890a ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m67715a(parcel);
        }
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.materialButtonStyle);
    }

    /* renamed from: c */
    private boolean m67702c() {
        int i = this.f48880D;
        return i == 3 || i == 4;
    }

    /* renamed from: d */
    private boolean m67703d() {
        int i = this.f48880D;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    private boolean m67704e() {
        int i = this.f48880D;
        return i == 16 || i == 32;
    }

    /* renamed from: f */
    private boolean m67705f() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    /* renamed from: g */
    private boolean m67706g() {
        MaterialButtonHelper materialButtonHelper = this.f48881a;
        return materialButtonHelper != null && !materialButtonHelper.mo57062o();
    }

    @NonNull
    private String getA11yClassName() {
        return (mo56982b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: i */
    private void m67707i() {
        if (m67703d()) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f48886o, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (m67702c()) {
            TextViewCompat.setCompoundDrawablesRelative(this, (Drawable) null, (Drawable) null, this.f48886o, (Drawable) null);
        } else if (m67704e()) {
            TextViewCompat.setCompoundDrawablesRelative(this, (Drawable) null, this.f48886o, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: j */
    private void m67708j(boolean z) {
        Drawable drawable = this.f48886o;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f48886o = mutate;
            DrawableCompat.setTintList(mutate, this.f48885g);
            PorterDuff.Mode mode = this.f48884f;
            if (mode != null) {
                DrawableCompat.setTintMode(this.f48886o, mode);
            }
            int i = this.f48887p;
            if (i == 0) {
                i = this.f48886o.getIntrinsicWidth();
            }
            int i2 = this.f48887p;
            if (i2 == 0) {
                i2 = this.f48886o.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f48886o;
            int i3 = this.f48888s;
            int i4 = this.f48889z;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f48886o.setVisible(true, z);
        }
        if (z) {
            m67707i();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!m67703d() || drawable3 == this.f48886o) && ((!m67702c() || drawable5 == this.f48886o) && (!m67704e() || drawable4 == this.f48886o))) {
            z2 = false;
        }
        if (z2) {
            m67707i();
        }
    }

    /* renamed from: k */
    private void m67709k(int i, int i2) {
        if (this.f48886o != null && getLayout() != null) {
            if (m67703d() || m67702c()) {
                this.f48889z = 0;
                int i3 = this.f48880D;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.f48888s = 0;
                    m67708j(false);
                    return;
                }
                int i4 = this.f48887p;
                if (i4 == 0) {
                    i4 = this.f48886o.getIntrinsicWidth();
                }
                int textWidth = (((((i - getTextWidth()) - ViewCompat.getPaddingEnd(this)) - i4) - this.f48877A) - ViewCompat.getPaddingStart(this)) / 2;
                boolean f = m67705f();
                if (this.f48880D != 4) {
                    z = false;
                }
                if (f != z) {
                    textWidth = -textWidth;
                }
                if (this.f48888s != textWidth) {
                    this.f48888s = textWidth;
                    m67708j(false);
                }
            } else if (m67704e()) {
                this.f48888s = 0;
                if (this.f48880D == 16) {
                    this.f48889z = 0;
                    m67708j(false);
                    return;
                }
                int i5 = this.f48887p;
                if (i5 == 0) {
                    i5 = this.f48886o.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f48877A) - getPaddingBottom()) / 2;
                if (this.f48889z != textHeight) {
                    this.f48889z = textHeight;
                    m67708j(false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo56981a(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f48882c.add(onCheckedChangeListener);
    }

    /* renamed from: b */
    public boolean mo56982b() {
        MaterialButtonHelper materialButtonHelper = this.f48881a;
        return materialButtonHelper != null && materialButtonHelper.mo57063p();
    }

    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @C0144Px
    public int getCornerRadius() {
        if (m67706g()) {
            return this.f48881a.mo57051b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f48886o;
    }

    public int getIconGravity() {
        return this.f48880D;
    }

    @C0144Px
    public int getIconPadding() {
        return this.f48877A;
    }

    @C0144Px
    public int getIconSize() {
        return this.f48887p;
    }

    public ColorStateList getIconTint() {
        return this.f48885g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f48884f;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f48881a.mo57052c();
    }

    @Dimension
    public int getInsetTop() {
        return this.f48881a.mo57053d();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (m67706g()) {
            return this.f48881a.mo57056h();
        }
        return null;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (m67706g()) {
            return this.f48881a.mo57057i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m67706g()) {
            return this.f48881a.mo57058j();
        }
        return null;
    }

    @C0144Px
    public int getStrokeWidth() {
        if (m67706g()) {
            return this.f48881a.mo57059k();
        }
        return 0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (m67706g()) {
            return this.f48881a.mo57060l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m67706g()) {
            return this.f48881a.mo57061m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public void mo56998h(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.f48882c.remove(onCheckedChangeListener);
    }

    public boolean isChecked() {
        return this.f48878B;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m67706g()) {
            MaterialShapeUtils.m69255f(this, this.f48881a.mo57055f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo56982b()) {
            Button.mergeDrawableStates(onCreateDrawableState, f48874E);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f48875F);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo56982b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MaterialButtonHelper materialButtonHelper;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (materialButtonHelper = this.f48881a) != null) {
            materialButtonHelper.mo57050H(i4 - i2, i3 - i);
        }
    }

    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f48890a);
    }

    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f48890a = this.f48878B;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m67709k(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m67709k(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f48886o != null) {
            if (this.f48886o.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(@ColorInt int i) {
        if (m67706g()) {
            this.f48881a.mo57065r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!m67706g()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f48881a.mo57066s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m67706g()) {
            this.f48881a.mo57067t(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo56982b() && isEnabled() && this.f48878B != z) {
            this.f48878B = z;
            refreshDrawableState();
            if (!this.f48879C) {
                this.f48879C = true;
                Iterator it = this.f48882c.iterator();
                while (it.hasNext()) {
                    ((OnCheckedChangeListener) it.next()).mo57038a(this, this.f48878B);
                }
                this.f48879C = false;
            }
        }
    }

    public void setCornerRadius(@C0144Px int i) {
        if (m67706g()) {
            this.f48881a.mo57068u(i);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (m67706g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (m67706g()) {
            this.f48881a.mo57055f().mo58655Z(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f48886o != drawable) {
            this.f48886o = drawable;
            m67708j(true);
            m67709k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f48880D != i) {
            this.f48880D = i;
            m67709k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@C0144Px int i) {
        if (this.f48877A != i) {
            this.f48877A = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@DrawableRes int i) {
        setIcon(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setIconSize(@C0144Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f48887p != i) {
            this.f48887p = i;
            m67708j(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f48885g != colorStateList) {
            this.f48885g = colorStateList;
            m67708j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f48884f != mode) {
            this.f48884f = mode;
            m67708j(false);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(@Dimension int i) {
        this.f48881a.mo57069v(i);
    }

    public void setInsetTop(@Dimension int i) {
        this.f48881a.mo57070w(i);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(@Nullable OnPressedChangeListener onPressedChangeListener) {
        this.f48883d = onPressedChangeListener;
    }

    public void setPressed(boolean z) {
        OnPressedChangeListener onPressedChangeListener = this.f48883d;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.mo57039a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (m67706g()) {
            this.f48881a.mo57071x(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (m67706g()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (m67706g()) {
            this.f48881a.mo57072y(shapeAppearanceModel);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m67706g()) {
            this.f48881a.mo57073z(z);
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (m67706g()) {
            this.f48881a.mo57046A(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (m67706g()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(@C0144Px int i) {
        if (m67706g()) {
            this.f48881a.mo57047B(i);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (m67706g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (m67706g()) {
            this.f48881a.mo57048C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (m67706g()) {
            this.f48881a.mo57049D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f48878B);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f48876G
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f48882c = r9
            r9 = 0
            r8.f48878B = r9
            r8.f48879C = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C10462R.styleable.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f48877A = r1
            int r1 = com.google.android.material.C10462R.styleable.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.m68843j(r1, r2)
            r8.f48884f = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.C10462R.styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.m69121a(r1, r0, r2)
            r8.f48885g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.C10462R.styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.MaterialResources.m69124d(r1, r0, r2)
            r8.f48886o = r1
            int r1 = com.google.android.material.C10462R.styleable.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f48880D = r1
            int r1 = com.google.android.material.C10462R.styleable.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f48887p = r1
            com.google.android.material.shape.ShapeAppearanceModel$Builder r10 = com.google.android.material.shape.ShapeAppearanceModel.m69264e(r7, r10, r11, r6)
            com.google.android.material.shape.ShapeAppearanceModel r10 = r10.mo58721m()
            com.google.android.material.button.MaterialButtonHelper r11 = new com.google.android.material.button.MaterialButtonHelper
            r11.<init>(r8, r10)
            r8.f48881a = r11
            r11.mo57064q(r0)
            r0.recycle()
            int r10 = r8.f48877A
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f48886o
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.m67708j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
