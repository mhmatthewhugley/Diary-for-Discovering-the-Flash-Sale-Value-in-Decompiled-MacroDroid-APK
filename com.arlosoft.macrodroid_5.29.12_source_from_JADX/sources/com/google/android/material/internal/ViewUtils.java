package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C10462R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ViewUtils {

    public interface OnApplyWindowInsetsListener {
        /* renamed from: a */
        WindowInsetsCompat mo56883a(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    /* renamed from: a */
    public static void m68834a(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: b */
    public static void m68835b(@NonNull View view, @Nullable AttributeSet attributeSet, int i, int i2, @Nullable final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C10462R.styleable.Insets, i, i2);
        final boolean z = obtainStyledAttributes.getBoolean(C10462R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z2 = obtainStyledAttributes.getBoolean(C10462R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z3 = obtainStyledAttributes.getBoolean(C10462R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m68836c(view, new OnApplyWindowInsetsListener() {
            @NonNull
            /* renamed from: a */
            public WindowInsetsCompat mo56883a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull RelativePadding relativePadding) {
                if (z) {
                    relativePadding.f49684d += windowInsetsCompat.getSystemWindowInsetBottom();
                }
                boolean i = ViewUtils.m68842i(view);
                if (z2) {
                    if (i) {
                        relativePadding.f49683c += windowInsetsCompat.getSystemWindowInsetLeft();
                    } else {
                        relativePadding.f49681a += windowInsetsCompat.getSystemWindowInsetLeft();
                    }
                }
                if (z3) {
                    if (i) {
                        relativePadding.f49681a += windowInsetsCompat.getSystemWindowInsetRight();
                    } else {
                        relativePadding.f49683c += windowInsetsCompat.getSystemWindowInsetRight();
                    }
                }
                relativePadding.mo58241a(view);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.mo56883a(view, windowInsetsCompat, relativePadding) : windowInsetsCompat;
            }
        });
    }

    /* renamed from: c */
    public static void m68836c(@NonNull View view, @NonNull final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(ViewCompat.getPaddingStart(view), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
        ViewCompat.setOnApplyWindowInsetsListener(view, new androidx.core.view.OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return onApplyWindowInsetsListener.mo56883a(view, windowInsetsCompat, new RelativePadding(relativePadding));
            }
        });
        m68846m(view);
    }

    /* renamed from: d */
    public static float m68837d(@NonNull Context context, @Dimension(unit = 0) int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    @Nullable
    /* renamed from: e */
    public static ViewGroup m68838e(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    /* renamed from: f */
    public static ViewOverlayImpl m68839f(@NonNull View view) {
        return m68840g(m68838e(view));
    }

    @Nullable
    /* renamed from: g */
    public static ViewOverlayImpl m68840g(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    /* renamed from: h */
    public static float m68841h(@NonNull View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ViewCompat.getElevation((View) parent);
        }
        return f;
    }

    /* renamed from: i */
    public static boolean m68842i(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    /* renamed from: j */
    public static PorterDuff.Mode m68843j(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: k */
    public static void m68844k(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m68845l(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    /* renamed from: l */
    public static void m68845l(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: m */
    public static void m68846m(@NonNull View view) {
        if (ViewCompat.isAttachedToWindow(view)) {
            ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(@NonNull View view) {
                    view.removeOnAttachStateChangeListener(this);
                    ViewCompat.requestApplyInsets(view);
                }

                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
    }

    /* renamed from: n */
    public static void m68847n(@NonNull final View view) {
        view.requestFocus();
        view.post(new Runnable() {
            public void run() {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }

    public static class RelativePadding {

        /* renamed from: a */
        public int f49681a;

        /* renamed from: b */
        public int f49682b;

        /* renamed from: c */
        public int f49683c;

        /* renamed from: d */
        public int f49684d;

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.f49681a = i;
            this.f49682b = i2;
            this.f49683c = i3;
            this.f49684d = i4;
        }

        /* renamed from: a */
        public void mo58241a(View view) {
            ViewCompat.setPaddingRelative(view, this.f49681a, this.f49682b, this.f49683c, this.f49684d);
        }

        public RelativePadding(@NonNull RelativePadding relativePadding) {
            this.f49681a = relativePadding.f49681a;
            this.f49682b = relativePadding.f49682b;
            this.f49683c = relativePadding.f49683c;
            this.f49684d = relativePadding.f49684d;
        }
    }
}
