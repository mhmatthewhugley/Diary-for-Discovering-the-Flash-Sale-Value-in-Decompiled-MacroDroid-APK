package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0144Px;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {

    /* renamed from: T */
    private static final int[] f49686T = {16842912};

    /* renamed from: U */
    private static final ActiveIndicatorTransform f49687U = new ActiveIndicatorTransform();

    /* renamed from: V */
    private static final ActiveIndicatorTransform f49688V = new ActiveIndicatorUnlabeledTransform();
    @Nullable

    /* renamed from: A */
    private final View f49689A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final ImageView f49690B;

    /* renamed from: C */
    private final ViewGroup f49691C;

    /* renamed from: D */
    private final TextView f49692D;

    /* renamed from: E */
    private final TextView f49693E;

    /* renamed from: F */
    private int f49694F = -1;
    @Nullable

    /* renamed from: G */
    private MenuItemImpl f49695G;
    @Nullable

    /* renamed from: H */
    private ColorStateList f49696H;
    @Nullable

    /* renamed from: I */
    private Drawable f49697I;
    @Nullable

    /* renamed from: J */
    private Drawable f49698J;

    /* renamed from: K */
    private ValueAnimator f49699K;

    /* renamed from: L */
    private ActiveIndicatorTransform f49700L = f49687U;

    /* renamed from: M */
    private float f49701M = 0.0f;

    /* renamed from: N */
    private boolean f49702N = false;

    /* renamed from: O */
    private int f49703O = 0;

    /* renamed from: P */
    private int f49704P = 0;

    /* renamed from: Q */
    private boolean f49705Q = false;

    /* renamed from: R */
    private int f49706R = 0;
    @Nullable

    /* renamed from: S */
    private BadgeDrawable f49707S;

    /* renamed from: a */
    private boolean f49708a = false;

    /* renamed from: c */
    private int f49709c;

    /* renamed from: d */
    private int f49710d;

    /* renamed from: f */
    private float f49711f;

    /* renamed from: g */
    private float f49712g;

    /* renamed from: o */
    private float f49713o;

    /* renamed from: p */
    private int f49714p;

    /* renamed from: s */
    private boolean f49715s;
    @Nullable

    /* renamed from: z */
    private final FrameLayout f49716z;

    private static class ActiveIndicatorTransform {
        private ActiveIndicatorTransform() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo58277a(@FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            return AnimationUtils.m67221b(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public float mo58278b(@FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2) {
            return AnimationUtils.m67220a(0.4f, 1.0f, f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public float mo58279c(@FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2) {
            return 1.0f;
        }

        /* renamed from: d */
        public void mo58280d(@FloatRange(from = 0.0d, mo592to = 1.0d) float f, @FloatRange(from = 0.0d, mo592to = 1.0d) float f2, @NonNull View view) {
            view.setScaleX(mo58278b(f, f2));
            view.setScaleY(mo58279c(f, f2));
            view.setAlpha(mo58277a(f, f2));
        }
    }

    private static class ActiveIndicatorUnlabeledTransform extends ActiveIndicatorTransform {
        private ActiveIndicatorUnlabeledTransform() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public float mo58279c(float f, float f2) {
            return mo58278b(f, f2);
        }
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f49716z = (FrameLayout) findViewById(C10462R.C10465id.navigation_bar_item_icon_container);
        this.f49689A = findViewById(C10462R.C10465id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(C10462R.C10465id.navigation_bar_item_icon_view);
        this.f49690B = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C10462R.C10465id.navigation_bar_item_labels_group);
        this.f49691C = viewGroup;
        TextView textView = (TextView) findViewById(C10462R.C10465id.navigation_bar_item_small_label_view);
        this.f49692D = textView;
        TextView textView2 = (TextView) findViewById(C10462R.C10465id.navigation_bar_item_large_label_view);
        this.f49693E = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f49709c = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f49710d = viewGroup.getPaddingBottom();
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        m68866e(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (NavigationBarItemView.this.f49690B.getVisibility() == 0) {
                        NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                        navigationBarItemView.m68877r(navigationBarItemView.f49690B);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private void m68866e(float f, float f2) {
        this.f49711f = f - f2;
        this.f49712g = (f2 * 1.0f) / f;
        this.f49713o = (f * 1.0f) / f2;
    }

    @Nullable
    /* renamed from: g */
    private FrameLayout m68867g(View view) {
        ImageView imageView = this.f49690B;
        if (view != imageView || !BadgeUtils.f48693a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f49716z;
        return frameLayout != null ? frameLayout : this.f49690B;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable = this.f49707S;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f49690B.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        int i;
        BadgeDrawable badgeDrawable = this.f49707S;
        if (badgeDrawable == null) {
            i = 0;
        } else {
            i = badgeDrawable.getMinimumWidth() - this.f49707S.mo56818j();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(i, layoutParams.leftMargin) + this.f49690B.getMeasuredWidth() + Math.max(i, layoutParams.rightMargin);
    }

    /* renamed from: h */
    private boolean m68868h() {
        return this.f49707S != null;
    }

    /* renamed from: i */
    private boolean m68869i() {
        return this.f49705Q && this.f49714p == 2;
    }

    /* renamed from: j */
    private void m68870j(@FloatRange(from = 0.0d, mo592to = 1.0d) final float f) {
        if (!this.f49702N || !this.f49708a || !ViewCompat.isAttachedToWindow(this)) {
            m68872m(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.f49699K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49699K = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f49701M, f});
        this.f49699K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NavigationBarItemView.this.m68872m(((Float) valueAnimator.getAnimatedValue()).floatValue(), f);
            }
        });
        this.f49699K.setInterpolator(MotionUtils.m68861e(getContext(), C10462R.attr.motionEasingStandard, AnimationUtils.f48522b));
        this.f49699K.setDuration((long) MotionUtils.m68860d(getContext(), C10462R.attr.motionDurationLong1, getResources().getInteger(C10462R.integer.material_motion_duration_long_1)));
        this.f49699K.start();
    }

    /* renamed from: k */
    private void m68871k() {
        MenuItemImpl menuItemImpl = this.f49695G;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m68872m(@FloatRange(from = 0.0d, mo592to = 1.0d) float f, float f2) {
        View view = this.f49689A;
        if (view != null) {
            this.f49700L.mo58280d(f, f2, view);
        }
        this.f49701M = f;
    }

    /* renamed from: n */
    private static void m68873n(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: o */
    private static void m68874o(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: p */
    private void m68875p(@Nullable View view) {
        if (m68868h() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.m67484a(this.f49707S, view, m68867g(view));
        }
    }

    /* renamed from: q */
    private void m68876q(@Nullable View view) {
        if (m68868h()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.m67487d(this.f49707S, view);
            }
            this.f49707S = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m68877r(View view) {
        if (m68868h()) {
            BadgeUtils.m67488e(this.f49707S, view, m68867g(view));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m68878s(int i) {
        if (this.f49689A != null) {
            int min = Math.min(this.f49703O, i - (this.f49706R * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49689A.getLayoutParams();
            layoutParams.height = m68869i() ? min : this.f49704P;
            layoutParams.width = min;
            this.f49689A.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: t */
    private void m68879t() {
        if (m68869i()) {
            this.f49700L = f49688V;
        } else {
            this.f49700L = f49687U;
        }
    }

    /* renamed from: u */
    private static void m68880u(@NonNull View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo58244f() {
        mo58251l();
        this.f49695G = null;
        this.f49701M = 0.0f;
        this.f49708a = false;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f49689A;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.f49707S;
    }

    /* access modifiers changed from: protected */
    @DrawableRes
    public int getItemBackgroundResId() {
        return C10462R.C10464drawable.mtrl_navigation_bar_item_background;
    }

    @Nullable
    public MenuItemImpl getItemData() {
        return this.f49695G;
    }

    /* access modifiers changed from: protected */
    @DimenRes
    public int getItemDefaultMarginResId() {
        return C10462R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    /* access modifiers changed from: protected */
    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f49694F;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49691C.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f49691C.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49691C.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f49691C.getMeasuredWidth() + layoutParams.rightMargin);
    }

    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i) {
        CharSequence charSequence;
        this.f49695G = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        if (!TextUtils.isEmpty(menuItemImpl.getTooltipText())) {
            charSequence = menuItemImpl.getTooltipText();
        } else {
            charSequence = menuItemImpl.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, charSequence);
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.f49708a = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo58251l() {
        m68876q(this.f49690B);
    }

    @NonNull
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.f49695G;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f49695G.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f49686T);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f49707S;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f49695G.getTitle();
            if (!TextUtils.isEmpty(this.f49695G.getContentDescription())) {
                title = this.f49695G.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f49707S.mo56815h());
        }
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            wrap.setClickable(false);
            wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        wrap.setRoleDescription(getResources().getString(C10462R.string.item_view_role_description));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new Runnable() {
            public void run() {
                NavigationBarItemView.this.m68878s(i);
            }
        });
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.f49689A;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f49702N = z;
        View view = this.f49689A;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f49704P = i;
        m68878s(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@C0144Px int i) {
        this.f49706R = i;
        m68878s(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f49705Q = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f49703O = i;
        m68878s(getWidth());
    }

    /* access modifiers changed from: package-private */
    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        this.f49707S = badgeDrawable;
        ImageView imageView = this.f49690B;
        if (imageView != null) {
            m68875p(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f49693E;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f49693E;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f49692D;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f49692D;
        textView4.setPivotY((float) textView4.getBaseline());
        m68870j(z ? 1.0f : 0.0f);
        int i = this.f49714p;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m68874o(getIconOrContainer(), this.f49709c, 49);
                    m68880u(this.f49691C, this.f49710d);
                    this.f49693E.setVisibility(0);
                } else {
                    m68874o(getIconOrContainer(), this.f49709c, 17);
                    m68880u(this.f49691C, 0);
                    this.f49693E.setVisibility(4);
                }
                this.f49692D.setVisibility(4);
            } else if (i == 1) {
                m68880u(this.f49691C, this.f49710d);
                if (z) {
                    m68874o(getIconOrContainer(), (int) (((float) this.f49709c) + this.f49711f), 49);
                    m68873n(this.f49693E, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f49692D;
                    float f = this.f49712g;
                    m68873n(textView5, f, f, 4);
                } else {
                    m68874o(getIconOrContainer(), this.f49709c, 49);
                    TextView textView6 = this.f49693E;
                    float f2 = this.f49713o;
                    m68873n(textView6, f2, f2, 4);
                    m68873n(this.f49692D, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m68874o(getIconOrContainer(), this.f49709c, 17);
                this.f49693E.setVisibility(8);
                this.f49692D.setVisibility(8);
            }
        } else if (this.f49715s) {
            if (z) {
                m68874o(getIconOrContainer(), this.f49709c, 49);
                m68880u(this.f49691C, this.f49710d);
                this.f49693E.setVisibility(0);
            } else {
                m68874o(getIconOrContainer(), this.f49709c, 17);
                m68880u(this.f49691C, 0);
                this.f49693E.setVisibility(4);
            }
            this.f49692D.setVisibility(4);
        } else {
            m68880u(this.f49691C, this.f49710d);
            if (z) {
                m68874o(getIconOrContainer(), (int) (((float) this.f49709c) + this.f49711f), 49);
                m68873n(this.f49693E, 1.0f, 1.0f, 0);
                TextView textView7 = this.f49692D;
                float f3 = this.f49712g;
                m68873n(textView7, f3, f3, 4);
            } else {
                m68874o(getIconOrContainer(), this.f49709c, 49);
                TextView textView8 = this.f49693E;
                float f4 = this.f49713o;
                m68873n(textView8, f4, f4, 4);
                m68873n(this.f49692D, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f49692D.setEnabled(z);
        this.f49693E.setEnabled(z);
        this.f49690B.setEnabled(z);
        if (z) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, (PointerIconCompat) null);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != this.f49697I) {
            this.f49697I = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                this.f49698J = drawable;
                ColorStateList colorStateList = this.f49696H;
                if (colorStateList != null) {
                    DrawableCompat.setTintList(drawable, colorStateList);
                }
            }
            this.f49690B.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49690B.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f49690B.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.f49696H = colorStateList;
        if (this.f49695G != null && (drawable = this.f49698J) != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            this.f49698J.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f49710d != i) {
            this.f49710d = i;
            m68871k();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f49709c != i) {
            this.f49709c = i;
            m68871k();
        }
    }

    public void setItemPosition(int i) {
        this.f49694F = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f49714p != i) {
            this.f49714p = i;
            m68879t();
            m68878s(getWidth());
            m68871k();
        }
    }

    public void setShifting(boolean z) {
        if (this.f49715s != z) {
            this.f49715s = z;
            m68871k();
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.f49693E, i);
        m68866e(this.f49692D.getTextSize(), this.f49693E.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.f49692D, i);
        m68866e(this.f49692D.getTextSize(), this.f49693E.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f49692D.setTextColor(colorStateList);
            this.f49693E.setTextColor(colorStateList);
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f49692D.setText(charSequence);
        this.f49693E.setText(charSequence);
        MenuItemImpl menuItemImpl = this.f49695G;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.f49695G;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.f49695G.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    public boolean showsIcon() {
        return true;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        ViewCompat.setBackground(this, drawable);
    }
}
