package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C10462R;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: A */
    private static final int[] f50249A;

    /* renamed from: B */
    private static final int[] f50250B;
    @Nullable

    /* renamed from: x */
    private final AccessibilityManager f50251x;

    /* renamed from: y */
    private boolean f50252y;
    @Nullable

    /* renamed from: z */
    private BaseTransientBottomBar.BaseCallback<Snackbar> f50253z;

    /* renamed from: com.google.android.material.snackbar.Snackbar$1 */
    class C106471 implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f50254a;

        /* renamed from: c */
        final /* synthetic */ Snackbar f50255c;

        public void onClick(View view) {
            this.f50254a.onClick(view);
            this.f50255c.mo58864w(1);
        }
    }

    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
        /* renamed from: c */
        public void mo83a(Snackbar snackbar, int i) {
        }

        /* renamed from: d */
        public void mo58891b(Snackbar snackbar) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), BasicMeasure.EXACTLY));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i = C10462R.attr.snackbarButtonStyle;
        f50249A = new int[]{i};
        f50250B = new int[]{i, C10462R.attr.snackbarTextViewStyle};
    }

    private Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        this.f50251x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Nullable
    /* renamed from: a0 */
    private static ViewGroup m69558a0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: b0 */
    private static boolean m69559b0(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f50250B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: c0 */
    public static Snackbar m69560c0(@NonNull View view, @NonNull CharSequence charSequence, int i) {
        return m69561d0((Context) null, view, charSequence, i);
    }

    @NonNull
    /* renamed from: d0 */
    private static Snackbar m69561d0(@Nullable Context context, @NonNull View view, @NonNull CharSequence charSequence, int i) {
        ViewGroup a0 = m69558a0(view);
        if (a0 != null) {
            if (context == null) {
                context = a0.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(m69559b0(context) ? C10462R.C10467layout.mtrl_layout_snackbar_include : C10462R.C10467layout.design_layout_snackbar_include, a0, false);
            Snackbar snackbar = new Snackbar(context, a0, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo58916f0(charSequence);
            snackbar.mo58857O(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: S */
    public void mo58859S() {
        super.mo58859S();
    }

    @NonNull
    @Deprecated
    /* renamed from: e0 */
    public Snackbar mo58915e0(@Nullable Callback callback) {
        BaseTransientBottomBar.BaseCallback<Snackbar> baseCallback = this.f50253z;
        if (baseCallback != null) {
            mo58856N(baseCallback);
        }
        if (callback != null) {
            mo58861r(callback);
        }
        this.f50253z = callback;
        return this;
    }

    @NonNull
    /* renamed from: f0 */
    public Snackbar mo58916f0(@NonNull CharSequence charSequence) {
        ((SnackbarContentLayout) this.f50196c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: v */
    public void mo58863v() {
        super.mo58863v();
    }

    /* renamed from: z */
    public int mo58866z() {
        int z = super.mo58866z();
        if (z == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f50251x.getRecommendedTimeoutMillis(z, (this.f50252y ? 4 : 0) | 1 | 2);
        } else if (!this.f50252y || !this.f50251x.isTouchExplorationEnabled()) {
            return z;
        } else {
            return -2;
        }
    }
}
