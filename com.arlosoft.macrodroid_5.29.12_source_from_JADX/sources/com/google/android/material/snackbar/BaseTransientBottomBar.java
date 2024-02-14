package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    @NonNull

    /* renamed from: t */
    static final Handler f50190t = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo58860T();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo58852H(message.arg1);
                return true;
            }
        }
    });
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final boolean f50191u = false;

    /* renamed from: v */
    private static final int[] f50192v = {C10462R.attr.snackbarStyle};
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final String f50193w = BaseTransientBottomBar.class.getSimpleName();
    @NonNull

    /* renamed from: a */
    private final ViewGroup f50194a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f50195b;
    @NonNull

    /* renamed from: c */
    protected final SnackbarBaseLayout f50196c;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: d */
    public final ContentViewCallback f50197d;

    /* renamed from: e */
    private int f50198e;

    /* renamed from: f */
    private boolean f50199f;
    @Nullable

    /* renamed from: g */
    private Anchor f50200g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f50201h = false;
    @RequiresApi(29)

    /* renamed from: i */
    private final Runnable f50202i = new Runnable() {
        public void run() {
            int b;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f50196c != null && baseTransientBottomBar.f50195b != null && (b = (BaseTransientBottomBar.this.m69488C() - BaseTransientBottomBar.this.m69490F()) + ((int) BaseTransientBottomBar.this.f50196c.getTranslationY())) < BaseTransientBottomBar.this.f50207n) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f50196c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f50193w, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f50207n - b;
                BaseTransientBottomBar.this.f50196c.requestLayout();
            }
        }
    };
    @Nullable

    /* renamed from: j */
    private Rect f50203j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f50204k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f50205l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f50206m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f50207n;

    /* renamed from: o */
    private int f50208o;

    /* renamed from: p */
    private List<BaseCallback<B>> f50209p;

    /* renamed from: q */
    private Behavior f50210q;
    @Nullable

    /* renamed from: r */
    private final AccessibilityManager f50211r;
    @NonNull

    /* renamed from: s */
    SnackbarManager.Callback f50212s = new SnackbarManager.Callback() {
        /* renamed from: a */
        public void mo58879a(int i) {
            Handler handler = BaseTransientBottomBar.f50190t;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        public void show() {
            Handler handler = BaseTransientBottomBar.f50190t;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    };

    static class Anchor implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @NonNull

        /* renamed from: a */
        private final WeakReference<BaseTransientBottomBar> f50235a;
        @NonNull

        /* renamed from: c */
        private final WeakReference<View> f50236c;

        /* renamed from: c */
        private boolean m69543c() {
            if (this.f50235a.get() != null) {
                return false;
            }
            mo58887b();
            return true;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: a */
        public View mo58886a() {
            return (View) this.f50236c.get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo58887b() {
            if (this.f50236c.get() != null) {
                ((View) this.f50236c.get()).removeOnAttachStateChangeListener(this);
                ViewUtils.m68844k((View) this.f50236c.get(), this);
            }
            this.f50236c.clear();
            this.f50235a.clear();
        }

        public void onGlobalLayout() {
            if (!m69543c() && ((BaseTransientBottomBar) this.f50235a.get()).f50201h) {
                ((BaseTransientBottomBar) this.f50235a.get()).m69492M();
            }
        }

        public void onViewAttachedToWindow(View view) {
            if (!m69543c()) {
                ViewUtils.m68834a(view, this);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (!m69543c()) {
                ViewUtils.m68844k(view, this);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        /* renamed from: a */
        public void mo83a(B b, int i) {
        }

        /* renamed from: b */
        public void mo58891b(B b) {
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {
        @NonNull

        /* renamed from: k */
        private final BehaviorDelegate f50237k = new BehaviorDelegate(this);

        /* access modifiers changed from: private */
        /* renamed from: l */
        public void m69549l(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f50237k.mo58894c(baseTransientBottomBar);
        }

        /* renamed from: a */
        public boolean mo56849a(View view) {
            return this.f50237k.mo58892a(view);
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f50237k.mo58893b(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BehaviorDelegate {

        /* renamed from: a */
        private SnackbarManager.Callback f50238a;

        public BehaviorDelegate(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo56852h(0.1f);
            swipeDismissBehavior.mo56850f(0.6f);
            swipeDismissBehavior.mo56853i(0);
        }

        /* renamed from: a */
        public boolean mo58892a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        /* renamed from: b */
        public void mo58893b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    SnackbarManager.m69609c().mo58966k(this.f50238a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                SnackbarManager.m69609c().mo58965j(this.f50238a);
            }
        }

        /* renamed from: c */
        public void mo58894c(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f50238a = baseTransientBottomBar.f50212s;
        }
    }

    @Deprecated
    public interface ContentViewCallback extends ContentViewCallback {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected interface OnAttachStateChangeListener {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected interface OnLayoutChangeListener {
        /* renamed from: a */
        void mo58884a(View view, int i, int i2, int i3, int i4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: A */
        private static final View.OnTouchListener f50239A = new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };

        /* renamed from: a */
        private OnLayoutChangeListener f50240a;

        /* renamed from: c */
        private OnAttachStateChangeListener f50241c;

        /* renamed from: d */
        private int f50242d;

        /* renamed from: f */
        private final float f50243f;

        /* renamed from: g */
        private final float f50244g;

        /* renamed from: o */
        private final int f50245o;

        /* renamed from: p */
        private final int f50246p;

        /* renamed from: s */
        private ColorStateList f50247s;

        /* renamed from: z */
        private PorterDuff.Mode f50248z;

        protected SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
            super(MaterialThemeOverlay.m69957c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C10462R.styleable.SnackbarLayout);
            int i = C10462R.styleable.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                ViewCompat.setElevation(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f50242d = obtainStyledAttributes.getInt(C10462R.styleable.SnackbarLayout_animationMode, 0);
            this.f50243f = obtainStyledAttributes.getFloat(C10462R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(MaterialResources.m69121a(context2, obtainStyledAttributes, C10462R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ViewUtils.m68843j(obtainStyledAttributes.getInt(C10462R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f50244g = obtainStyledAttributes.getFloat(C10462R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f50245o = obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f50246p = obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f50239A);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.setBackground(this, m69555a());
            }
        }

        @NonNull
        /* renamed from: a */
        private Drawable m69555a() {
            float dimension = getResources().getDimension(C10462R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(MaterialColors.m68109i(this, C10462R.attr.colorSurface, C10462R.attr.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f50247s == null) {
                return DrawableCompat.wrap(gradientDrawable);
            }
            Drawable wrap = DrawableCompat.wrap(gradientDrawable);
            DrawableCompat.setTintList(wrap, this.f50247s);
            return wrap;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f50244g;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f50242d;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f50243f;
        }

        /* access modifiers changed from: package-private */
        public int getMaxInlineActionWidth() {
            return this.f50246p;
        }

        /* access modifiers changed from: package-private */
        public int getMaxWidth() {
            return this.f50245o;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            OnAttachStateChangeListener onAttachStateChangeListener = this.f50241c;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewAttachedToWindow(this);
            }
            ViewCompat.requestApplyInsets(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            OnAttachStateChangeListener onAttachStateChangeListener = this.f50241c;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            OnLayoutChangeListener onLayoutChangeListener = this.f50240a;
            if (onLayoutChangeListener != null) {
                onLayoutChangeListener.mo58884a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (this.f50245o > 0 && getMeasuredWidth() > (i3 = this.f50245o)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY), i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f50242d = i;
        }

        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (!(drawable == null || this.f50247s == null)) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.f50247s);
                DrawableCompat.setTintMode(drawable, this.f50248z);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f50247s = colorStateList;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(wrap, colorStateList);
                DrawableCompat.setTintMode(wrap, this.f50248z);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f50248z = mode;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(wrap, mode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f50241c = onAttachStateChangeListener;
        }

        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f50239A);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
            this.f50240a = onLayoutChangeListener;
        }
    }

    protected BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull ContentViewCallback contentViewCallback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (contentViewCallback != null) {
            this.f50194a = viewGroup;
            this.f50197d = contentViewCallback;
            this.f50195b = context;
            ThemeEnforcement.m68815a(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(mo58850D(), viewGroup, false);
            this.f50196c = snackbarBaseLayout;
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.mo58954c(snackbarBaseLayout.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
            }
            snackbarBaseLayout.addView(view);
            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f50203j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            ViewCompat.setAccessibilityLiveRegion(snackbarBaseLayout, 1);
            ViewCompat.setImportantForAccessibility(snackbarBaseLayout, 1);
            ViewCompat.setFitsSystemWindows(snackbarBaseLayout, true);
            ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new OnApplyWindowInsetsListener() {
                @NonNull
                public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                    int unused = BaseTransientBottomBar.this.f50204k = windowInsetsCompat.getSystemWindowInsetBottom();
                    int unused2 = BaseTransientBottomBar.this.f50205l = windowInsetsCompat.getSystemWindowInsetLeft();
                    int unused3 = BaseTransientBottomBar.this.f50206m = windowInsetsCompat.getSystemWindowInsetRight();
                    BaseTransientBottomBar.this.m69500Z();
                    return windowInsetsCompat;
                }
            });
            ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new AccessibilityDelegateCompat() {
                public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                }

                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.performAccessibilityAction(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.mo58863v();
                    return true;
                }
            });
            this.f50211r = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: B */
    private ValueAnimator m69487B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.f48524d);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseTransientBottomBar.this.f50196c.setScaleX(floatValue);
                BaseTransientBottomBar.this.f50196c.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }

    /* access modifiers changed from: private */
    @RequiresApi(17)
    /* renamed from: C */
    public int m69488C() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f50195b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: E */
    private int m69489E() {
        int height = this.f50196c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f50196c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public int m69490F() {
        int[] iArr = new int[2];
        this.f50196c.getLocationOnScreen(iArr);
        return iArr[1] + this.f50196c.getHeight();
    }

    /* renamed from: J */
    private boolean m69491J() {
        ViewGroup.LayoutParams layoutParams = this.f50196c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof SwipeDismissBehavior);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m69492M() {
        this.f50208o = m69519u();
        m69500Z();
    }

    /* renamed from: P */
    private void m69493P(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior swipeDismissBehavior = this.f50210q;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo58849A();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m69549l(this);
        }
        swipeDismissBehavior.mo56851g(new SwipeDismissBehavior.OnDismissListener() {
            /* renamed from: a */
            public void mo56854a(@NonNull View view) {
                if (view.getParent() != null) {
                    view.setVisibility(8);
                }
                BaseTransientBottomBar.this.mo58864w(0);
            }

            /* renamed from: b */
            public void mo56855b(int i) {
                if (i == 0) {
                    SnackbarManager.m69609c().mo58966k(BaseTransientBottomBar.this.f50212s);
                } else if (i == 1 || i == 2) {
                    SnackbarManager.m69609c().mo58965j(BaseTransientBottomBar.this.f50212s);
                }
            }
        });
        layoutParams.setBehavior(swipeDismissBehavior);
        if (mo58865y() == null) {
            layoutParams.insetEdge = 80;
        }
    }

    /* renamed from: R */
    private boolean m69494R() {
        return this.f50207n > 0 && !this.f50199f && m69491J();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m69495U() {
        if (mo58858Q()) {
            mo58862s();
            return;
        }
        if (this.f50196c.getParent() != null) {
            this.f50196c.setVisibility(0);
        }
        mo58855L();
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m69496V() {
        ValueAnimator x = m69520x(0.0f, 1.0f);
        ValueAnimator B = m69487B(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{x, B});
        animatorSet.setDuration(150);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo58855L();
            }
        });
        animatorSet.start();
    }

    /* renamed from: W */
    private void m69497W(final int i) {
        ValueAnimator x = m69520x(1.0f, 0.0f);
        x.setDuration(75);
        x.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo58854K(i);
            }
        });
        x.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m69498X() {
        int E = m69489E();
        if (f50191u) {
            ViewCompat.offsetTopAndBottom(this.f50196c, E);
        } else {
            this.f50196c.setTranslationY((float) E);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{E, 0});
        valueAnimator.setInterpolator(AnimationUtils.f48522b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo58855L();
            }

            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f50197d.mo58913a(70, 180);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(E) {

            /* renamed from: a */
            private int f50219a;

            /* renamed from: b */
            final /* synthetic */ int f50220b;

            {
                this.f50220b = r2;
                this.f50219a = r2;
            }

            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f50191u) {
                    ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.f50196c, intValue - this.f50219a);
                } else {
                    BaseTransientBottomBar.this.f50196c.setTranslationY((float) intValue);
                }
                this.f50219a = intValue;
            }
        });
        valueAnimator.start();
    }

    /* renamed from: Y */
    private void m69499Y(final int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m69489E()});
        valueAnimator.setInterpolator(AnimationUtils.f48522b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo58854K(i);
            }

            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f50197d.mo58914b(0, 180);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a */
            private int f50224a = 0;

            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f50191u) {
                    ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.f50196c, intValue - this.f50224a);
                } else {
                    BaseTransientBottomBar.this.f50196c.setTranslationY((float) intValue);
                }
                this.f50224a = intValue;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m69500Z() {
        ViewGroup.LayoutParams layoutParams = this.f50196c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f50203j == null) {
            Log.w(f50193w, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        int i = mo58865y() != null ? this.f50208o : this.f50204k;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = this.f50203j;
        marginLayoutParams.bottomMargin = rect.bottom + i;
        marginLayoutParams.leftMargin = rect.left + this.f50205l;
        marginLayoutParams.rightMargin = rect.right + this.f50206m;
        this.f50196c.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m69494R()) {
            this.f50196c.removeCallbacks(this.f50202i);
            this.f50196c.post(this.f50202i);
        }
    }

    /* renamed from: t */
    private void m69518t(int i) {
        if (this.f50196c.getAnimationMode() == 1) {
            m69497W(i);
        } else {
            m69499Y(i);
        }
    }

    /* renamed from: u */
    private int m69519u() {
        if (mo58865y() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        mo58865y().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f50194a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f50194a.getHeight()) - i;
    }

    /* renamed from: x */
    private ValueAnimator m69520x(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.f48521a);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseTransientBottomBar.this.f50196c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: A */
    public SwipeDismissBehavior<? extends View> mo58849A() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    @LayoutRes
    /* renamed from: D */
    public int mo58850D() {
        return mo58851G() ? C10462R.C10467layout.mtrl_layout_snackbar : C10462R.C10467layout.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo58851G() {
        TypedArray obtainStyledAttributes = this.f50195b.obtainStyledAttributes(f50192v);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo58852H(int i) {
        if (!mo58858Q() || this.f50196c.getVisibility() != 0) {
            mo58854K(i);
        } else {
            m69518t(i);
        }
    }

    /* renamed from: I */
    public boolean mo58853I() {
        return SnackbarManager.m69609c().mo58962e(this.f50212s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo58854K(int i) {
        SnackbarManager.m69609c().mo58963h(this.f50212s);
        List<BaseCallback<B>> list = this.f50209p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f50209p.get(size).mo83a(this, i);
            }
        }
        ViewParent parent = this.f50196c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f50196c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo58855L() {
        SnackbarManager.m69609c().mo58964i(this.f50212s);
        List<BaseCallback<B>> list = this.f50209p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f50209p.get(size).mo58891b(this);
            }
        }
    }

    @NonNull
    /* renamed from: N */
    public B mo58856N(@Nullable BaseCallback<B> baseCallback) {
        List<BaseCallback<B>> list;
        if (baseCallback == null || (list = this.f50209p) == null) {
            return this;
        }
        list.remove(baseCallback);
        return this;
    }

    @NonNull
    /* renamed from: O */
    public B mo58857O(int i) {
        this.f50198e = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo58858Q() {
        AccessibilityManager accessibilityManager = this.f50211r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    public void mo58859S() {
        SnackbarManager.m69609c().mo58967m(mo58866z(), this.f50212s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo58860T() {
        this.f50196c.setOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                WindowInsets rootWindowInsets;
                if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f50196c.getRootWindowInsets()) != null) {
                    int unused = BaseTransientBottomBar.this.f50207n = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    BaseTransientBottomBar.this.m69500Z();
                }
            }

            public void onViewDetachedFromWindow(View view) {
                if (BaseTransientBottomBar.this.mo58853I()) {
                    BaseTransientBottomBar.f50190t.post(new Runnable() {
                        public void run() {
                            BaseTransientBottomBar.this.mo58854K(3);
                        }
                    });
                }
            }
        });
        if (this.f50196c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f50196c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                m69493P((CoordinatorLayout.LayoutParams) layoutParams);
            }
            m69492M();
            this.f50196c.setVisibility(4);
            this.f50194a.addView(this.f50196c);
        }
        if (ViewCompat.isLaidOut(this.f50196c)) {
            m69495U();
        } else {
            this.f50196c.setOnLayoutChangeListener(new OnLayoutChangeListener() {
                /* renamed from: a */
                public void mo58884a(View view, int i, int i2, int i3, int i4) {
                    BaseTransientBottomBar.this.f50196c.setOnLayoutChangeListener((OnLayoutChangeListener) null);
                    BaseTransientBottomBar.this.m69495U();
                }
            });
        }
    }

    @NonNull
    /* renamed from: r */
    public B mo58861r(@Nullable BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        if (this.f50209p == null) {
            this.f50209p = new ArrayList();
        }
        this.f50209p.add(baseCallback);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo58862s() {
        this.f50196c.post(new Runnable() {
            public void run() {
                SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f50196c;
                if (snackbarBaseLayout != null) {
                    if (snackbarBaseLayout.getParent() != null) {
                        BaseTransientBottomBar.this.f50196c.setVisibility(0);
                    }
                    if (BaseTransientBottomBar.this.f50196c.getAnimationMode() == 1) {
                        BaseTransientBottomBar.this.m69496V();
                    } else {
                        BaseTransientBottomBar.this.m69498X();
                    }
                }
            }
        });
    }

    /* renamed from: v */
    public void mo58863v() {
        mo58864w(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo58864w(int i) {
        SnackbarManager.m69609c().mo58960b(this.f50212s, i);
    }

    @Nullable
    /* renamed from: y */
    public View mo58865y() {
        Anchor anchor = this.f50200g;
        if (anchor == null) {
            return null;
        }
        return anchor.mo58886a();
    }

    /* renamed from: z */
    public int mo58866z() {
        return this.f50198e;
    }
}
