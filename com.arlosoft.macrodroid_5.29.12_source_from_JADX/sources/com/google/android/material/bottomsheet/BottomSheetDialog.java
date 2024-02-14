package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.p023dx.p026io.Opcodes;
import com.google.android.material.C10462R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.shape.MaterialShapeDrawable;

public class BottomSheetDialog extends AppCompatDialog {

    /* renamed from: A */
    private boolean f48853A;
    @NonNull

    /* renamed from: B */
    private BottomSheetBehavior.BottomSheetCallback f48854B = new BottomSheetBehavior.BottomSheetCallback() {
        /* renamed from: a */
        public void mo28985a(@NonNull View view, float f) {
        }

        /* renamed from: b */
        public void mo28986b(@NonNull View view, int i) {
            if (i == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public BottomSheetBehavior<FrameLayout> f48855a;

    /* renamed from: c */
    private FrameLayout f48856c;

    /* renamed from: d */
    private CoordinatorLayout f48857d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public FrameLayout f48858f;

    /* renamed from: g */
    boolean f48859g;

    /* renamed from: o */
    boolean f48860o = true;

    /* renamed from: p */
    private boolean f48861p = true;

    /* renamed from: s */
    private boolean f48862s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public BottomSheetBehavior.BottomSheetCallback f48863z;

    private static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a */
        private final boolean f48869a;

        /* renamed from: b */
        private final boolean f48870b;

        /* renamed from: c */
        private final WindowInsetsCompat f48871c;

        /* renamed from: c */
        private void m67693c(View view) {
            if (view.getTop() < this.f48871c.getSystemWindowInsetTop()) {
                BottomSheetDialog.m67685m(view, this.f48869a);
                view.setPadding(view.getPaddingLeft(), this.f48871c.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                BottomSheetDialog.m67685m(view, this.f48870b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* renamed from: a */
        public void mo28985a(@NonNull View view, float f) {
            m67693c(view);
        }

        /* renamed from: b */
        public void mo28986b(@NonNull View view, int i) {
            m67693c(view);
        }

        private EdgeToEdgeCallback(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            ColorStateList colorStateList;
            this.f48871c = windowInsetsCompat;
            boolean z = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.f48870b = z;
            MaterialShapeDrawable B = BottomSheetBehavior.m67638y(view).mo56932B();
            if (B != null) {
                colorStateList = B.mo58684x();
            } else {
                colorStateList = ViewCompat.getBackgroundTintList(view);
            }
            if (colorStateList != null) {
                this.f48869a = MaterialColors.m68106f(colorStateList.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f48869a = MaterialColors.m68106f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f48869a = z;
            }
        }
    }

    public BottomSheetDialog(@NonNull Context context, @StyleRes int i) {
        super(context, getThemeResId(context, i));
        supportRequestWindowFeature(1);
        this.f48853A = getContext().getTheme().obtainStyledAttributes(new int[]{C10462R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    private static int getThemeResId(@NonNull Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C10462R.attr.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return C10462R.style.Theme_Design_Light_BottomSheetDialog;
    }

    /* renamed from: i */
    private FrameLayout m67684i() {
        if (this.f48856c == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C10462R.C10467layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f48856c = frameLayout;
            this.f48857d = (CoordinatorLayout) frameLayout.findViewById(C10462R.C10465id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f48856c.findViewById(C10462R.C10465id.design_bottom_sheet);
            this.f48858f = frameLayout2;
            BottomSheetBehavior<FrameLayout> y = BottomSheetBehavior.m67638y(frameLayout2);
            this.f48855a = y;
            y.mo56959o(this.f48854B);
            this.f48855a.mo56944R(this.f48860o);
        }
        return this.f48856c;
    }

    /* renamed from: m */
    public static void m67685m(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        }
    }

    /* renamed from: t */
    private View m67686t(int i, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        m67684i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f48856c.findViewById(C10462R.C10465id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.f48853A) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f48858f, new OnApplyWindowInsetsListener() {
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    if (BottomSheetDialog.this.f48863z != null) {
                        BottomSheetDialog.this.f48855a.mo56937H(BottomSheetDialog.this.f48863z);
                    }
                    if (windowInsetsCompat != null) {
                        BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                        BottomSheetBehavior.BottomSheetCallback unused = bottomSheetDialog.f48863z = new EdgeToEdgeCallback(bottomSheetDialog.f48858f, windowInsetsCompat);
                        BottomSheetDialog.this.f48855a.mo56959o(BottomSheetDialog.this.f48863z);
                    }
                    return windowInsetsCompat;
                }
            });
        }
        this.f48858f.removeAllViews();
        if (layoutParams == null) {
            this.f48858f.addView(view);
        } else {
            this.f48858f.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C10462R.C10465id.touch_outside).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.f48860o && bottomSheetDialog.isShowing() && BottomSheetDialog.this.mo56975n()) {
                    BottomSheetDialog.this.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(this.f48858f, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (BottomSheetDialog.this.f48860o) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                    return;
                }
                accessibilityNodeInfoCompat.setDismissable(false);
            }

            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (i == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.f48860o) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view, i, bundle);
            }
        });
        this.f48858f.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.f48856c;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> j = mo56972j();
        if (!this.f48859g || j.mo56933C() == 5) {
            super.cancel();
        } else {
            j.mo56951Y(5);
        }
    }

    @NonNull
    /* renamed from: j */
    public BottomSheetBehavior<FrameLayout> mo56972j() {
        if (this.f48855a == null) {
            m67684i();
        }
        return this.f48855a;
    }

    /* renamed from: k */
    public boolean mo56973k() {
        return this.f48859g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo56974l() {
        this.f48855a.mo56937H(this.f48854B);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo56975n() {
        if (!this.f48862s) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f48861p = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f48862s = true;
        }
        return this.f48861p;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f48853A && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f48856c;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f48857d;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(Opcodes.FILL_ARRAY_DATA_PAYLOAD);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f48855a;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo56933C() == 5) {
            this.f48855a.mo56951Y(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f48860o != z) {
            this.f48860o = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f48855a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo56944R(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f48860o) {
            this.f48860o = true;
        }
        this.f48861p = z;
        this.f48862s = true;
    }

    public void setContentView(@LayoutRes int i) {
        super.setContentView(m67686t(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(m67686t(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m67686t(0, view, layoutParams));
    }
}
