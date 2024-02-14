package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0144Px;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a0 */
    private static final int f48781a0 = C10462R.style.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f48782A;

    /* renamed from: B */
    float f48783B = 0.5f;

    /* renamed from: C */
    int f48784C;

    /* renamed from: D */
    float f48785D = -1.0f;

    /* renamed from: E */
    boolean f48786E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f48787F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f48788G = true;

    /* renamed from: H */
    int f48789H = 4;

    /* renamed from: I */
    int f48790I = 4;
    @Nullable

    /* renamed from: J */
    ViewDragHelper f48791J;

    /* renamed from: K */
    private boolean f48792K;

    /* renamed from: L */
    private int f48793L;

    /* renamed from: M */
    private boolean f48794M;

    /* renamed from: N */
    private int f48795N;

    /* renamed from: O */
    int f48796O;

    /* renamed from: P */
    int f48797P;
    @Nullable

    /* renamed from: Q */
    WeakReference<V> f48798Q;
    @Nullable

    /* renamed from: R */
    WeakReference<View> f48799R;
    @NonNull

    /* renamed from: S */
    private final ArrayList<BottomSheetCallback> f48800S = new ArrayList<>();
    @Nullable

    /* renamed from: T */
    private VelocityTracker f48801T;

    /* renamed from: U */
    int f48802U;

    /* renamed from: V */
    private int f48803V;

    /* renamed from: W */
    boolean f48804W;
    @Nullable

    /* renamed from: X */
    private Map<View, Integer> f48805X;

    /* renamed from: Y */
    private int f48806Y = -1;

    /* renamed from: Z */
    private final ViewDragHelper.Callback f48807Z = new ViewDragHelper.Callback() {

        /* renamed from: a */
        private long f48840a;

        /* renamed from: a */
        private boolean m67672a(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f48797P + bottomSheetBehavior.mo56931A()) / 2;
        }

        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            int A = BottomSheetBehavior.this.mo56931A();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return MathUtils.clamp(i, A, bottomSheetBehavior.f48786E ? bottomSheetBehavior.f48797P : bottomSheetBehavior.f48784C);
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f48786E) {
                return bottomSheetBehavior.f48797P;
            }
            return bottomSheetBehavior.f48784C;
        }

        public void onViewDragStateChanged(int i) {
            if (i == 1 && BottomSheetBehavior.this.f48788G) {
                BottomSheetBehavior.this.mo56952Z(1);
            }
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo56960w(i2);
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 6;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f48786E || !bottomSheetBehavior.mo56955f0(view, f2)) {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.f48809b) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i4 = bottomSheetBehavior2.f48782A;
                            if (top >= i4) {
                                if (Math.abs(top - i4) >= Math.abs(top - BottomSheetBehavior.this.f48784C)) {
                                    i2 = BottomSheetBehavior.this.f48784C;
                                } else if (BottomSheetBehavior.this.mo56956g0()) {
                                    i2 = BottomSheetBehavior.this.f48784C;
                                } else {
                                    i = BottomSheetBehavior.this.f48782A;
                                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                                    bottomSheetBehavior3.mo56958i0(view, i3, i, bottomSheetBehavior3.mo56957h0());
                                }
                                i3 = 4;
                                BottomSheetBehavior bottomSheetBehavior32 = BottomSheetBehavior.this;
                                bottomSheetBehavior32.mo56958i0(view, i3, i, bottomSheetBehavior32.mo56957h0());
                            } else if (top < Math.abs(top - bottomSheetBehavior2.f48784C)) {
                                i = BottomSheetBehavior.this.mo56931A();
                            } else if (BottomSheetBehavior.this.mo56956g0()) {
                                i2 = BottomSheetBehavior.this.f48784C;
                                i3 = 4;
                                BottomSheetBehavior bottomSheetBehavior322 = BottomSheetBehavior.this;
                                bottomSheetBehavior322.mo56958i0(view, i3, i, bottomSheetBehavior322.mo56957h0());
                            } else {
                                i = BottomSheetBehavior.this.f48782A;
                                BottomSheetBehavior bottomSheetBehavior3222 = BottomSheetBehavior.this;
                                bottomSheetBehavior3222.mo56958i0(view, i3, i, bottomSheetBehavior3222.mo56957h0());
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.f48833z) < Math.abs(top - BottomSheetBehavior.this.f48784C)) {
                            i = BottomSheetBehavior.this.f48833z;
                        } else {
                            i2 = BottomSheetBehavior.this.f48784C;
                            i3 = 4;
                            BottomSheetBehavior bottomSheetBehavior32222 = BottomSheetBehavior.this;
                            bottomSheetBehavior32222.mo56958i0(view, i3, i, bottomSheetBehavior32222.mo56957h0());
                        }
                    } else {
                        if (BottomSheetBehavior.this.f48809b) {
                            i2 = BottomSheetBehavior.this.f48784C;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.f48782A) >= Math.abs(top2 - BottomSheetBehavior.this.f48784C)) {
                                i2 = BottomSheetBehavior.this.f48784C;
                            } else if (BottomSheetBehavior.this.mo56956g0()) {
                                i2 = BottomSheetBehavior.this.f48784C;
                            } else {
                                i = BottomSheetBehavior.this.f48782A;
                                BottomSheetBehavior bottomSheetBehavior322222 = BottomSheetBehavior.this;
                                bottomSheetBehavior322222.mo56958i0(view, i3, i, bottomSheetBehavior322222.mo56957h0());
                            }
                        }
                        i3 = 4;
                        BottomSheetBehavior bottomSheetBehavior3222222 = BottomSheetBehavior.this;
                        bottomSheetBehavior3222222.mo56958i0(view, i3, i, bottomSheetBehavior3222222.mo56957h0());
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || m67672a(view)) {
                    i = BottomSheetBehavior.this.f48797P;
                    i3 = 5;
                    BottomSheetBehavior bottomSheetBehavior32222222 = BottomSheetBehavior.this;
                    bottomSheetBehavior32222222.mo56958i0(view, i3, i, bottomSheetBehavior32222222.mo56957h0());
                } else if (BottomSheetBehavior.this.f48809b) {
                    i = BottomSheetBehavior.this.f48833z;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.mo56931A()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f48782A)) {
                    i = BottomSheetBehavior.this.mo56931A();
                } else {
                    i = BottomSheetBehavior.this.f48782A;
                    BottomSheetBehavior bottomSheetBehavior322222222 = BottomSheetBehavior.this;
                    bottomSheetBehavior322222222.mo56958i0(view, i3, i, bottomSheetBehavior322222222.mo56957h0());
                }
            } else if (BottomSheetBehavior.this.f48809b) {
                i = BottomSheetBehavior.this.f48833z;
            } else {
                int top3 = view.getTop();
                long currentTimeMillis = System.currentTimeMillis() - this.f48840a;
                if (BottomSheetBehavior.this.mo56956g0()) {
                    BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior4.mo56954d0(currentTimeMillis, (((float) top3) * 100.0f) / ((float) bottomSheetBehavior4.f48797P))) {
                        i = BottomSheetBehavior.this.f48832y;
                    } else {
                        i2 = BottomSheetBehavior.this.f48784C;
                        i3 = 4;
                        BottomSheetBehavior bottomSheetBehavior3222222222 = BottomSheetBehavior.this;
                        bottomSheetBehavior3222222222.mo56958i0(view, i3, i, bottomSheetBehavior3222222222.mo56957h0());
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                    int i5 = bottomSheetBehavior5.f48782A;
                    if (top3 > i5) {
                        i = i5;
                        BottomSheetBehavior bottomSheetBehavior32222222222 = BottomSheetBehavior.this;
                        bottomSheetBehavior32222222222.mo56958i0(view, i3, i, bottomSheetBehavior32222222222.mo56957h0());
                    }
                    i = bottomSheetBehavior5.mo56931A();
                }
            }
            i3 = 3;
            BottomSheetBehavior bottomSheetBehavior322222222222 = BottomSheetBehavior.this;
            bottomSheetBehavior322222222222.mo56958i0(view, i3, i, bottomSheetBehavior322222222222.mo56957h0());
        }

        public boolean tryCaptureView(@NonNull View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f48789H;
            if (i2 == 1 || bottomSheetBehavior.f48804W) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f48802U == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f48799R;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f48840a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f48798Q;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: a */
    private int f48808a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f48809b = true;

    /* renamed from: c */
    private boolean f48810c = false;

    /* renamed from: d */
    private float f48811d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f48812e;

    /* renamed from: f */
    private boolean f48813f;

    /* renamed from: g */
    private int f48814g;

    /* renamed from: h */
    private int f48815h;

    /* renamed from: i */
    private boolean f48816i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public MaterialShapeDrawable f48817j;

    /* renamed from: k */
    private int f48818k = -1;

    /* renamed from: l */
    private int f48819l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f48820m;

    /* renamed from: n */
    private boolean f48821n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f48822o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f48823p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f48824q;

    /* renamed from: r */
    private boolean f48825r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f48826s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f48827t;

    /* renamed from: u */
    private ShapeAppearanceModel f48828u;

    /* renamed from: v */
    private boolean f48829v;

    /* renamed from: w */
    private BottomSheetBehavior<V>.SettleRunnable f48830w = null;
    @Nullable

    /* renamed from: x */
    private ValueAnimator f48831x;

    /* renamed from: y */
    int f48832y;

    /* renamed from: z */
    int f48833z;

    public static abstract class BottomSheetCallback {
        /* renamed from: a */
        public abstract void mo28985a(@NonNull View view, float f);

        /* renamed from: b */
        public abstract void mo28986b(@NonNull View view, int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    private class SettleRunnable implements Runnable {

        /* renamed from: a */
        private final View f48849a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f48850c;

        /* renamed from: d */
        int f48851d;

        SettleRunnable(View view, int i) {
            this.f48849a = view;
            this.f48851d = i;
        }

        public void run() {
            ViewDragHelper viewDragHelper = BottomSheetBehavior.this.f48791J;
            if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
                BottomSheetBehavior.this.mo56952Z(this.f48851d);
            } else {
                ViewCompat.postOnAnimation(this.f48849a, this);
            }
            this.f48850c = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: D */
    private float m67606D() {
        VelocityTracker velocityTracker = this.f48801T;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f48811d);
        return this.f48801T.getYVelocity(this.f48802U);
    }

    /* renamed from: I */
    private void m67607I(V v, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        ViewCompat.replaceAccessibilityAction(v, accessibilityActionCompat, (CharSequence) null, m67634s(i));
    }

    /* renamed from: J */
    private void m67608J() {
        this.f48802U = -1;
        VelocityTracker velocityTracker = this.f48801T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f48801T = null;
        }
    }

    /* renamed from: K */
    private void m67609K(@NonNull SavedState savedState) {
        int i = this.f48808a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f48812e = savedState.f48845c;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f48809b = savedState.f48846d;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f48786E = savedState.f48847f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f48787F = savedState.f48848g;
            }
        }
    }

    /* renamed from: a0 */
    private void m67611a0(@NonNull View view) {
        final boolean z = Build.VERSION.SDK_INT >= 29 && !mo56934E() && !this.f48813f;
        if (this.f48822o || this.f48823p || this.f48824q || z) {
            ViewUtils.m68836c(view, new ViewUtils.OnApplyWindowInsetsListener() {
                /* renamed from: a */
                public WindowInsetsCompat mo56883a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                    int unused = BottomSheetBehavior.this.f48827t = windowInsetsCompat.getSystemWindowInsetTop();
                    boolean i = ViewUtils.m68842i(view);
                    int paddingBottom = view.getPaddingBottom();
                    int paddingLeft = view.getPaddingLeft();
                    int paddingRight = view.getPaddingRight();
                    if (BottomSheetBehavior.this.f48822o) {
                        int unused2 = BottomSheetBehavior.this.f48826s = windowInsetsCompat.getSystemWindowInsetBottom();
                        paddingBottom = relativePadding.f49684d + BottomSheetBehavior.this.f48826s;
                    }
                    if (BottomSheetBehavior.this.f48823p) {
                        paddingLeft = (i ? relativePadding.f49683c : relativePadding.f49681a) + windowInsetsCompat.getSystemWindowInsetLeft();
                    }
                    if (BottomSheetBehavior.this.f48824q) {
                        paddingRight = (i ? relativePadding.f49681a : relativePadding.f49683c) + windowInsetsCompat.getSystemWindowInsetRight();
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    if (z) {
                        int unused3 = BottomSheetBehavior.this.f48820m = windowInsetsCompat.getMandatorySystemGestureInsets().bottom;
                    }
                    if (BottomSheetBehavior.this.f48822o || z) {
                        BottomSheetBehavior.this.m67629m0(false);
                    }
                    return windowInsetsCompat;
                }
            });
        }
    }

    /* renamed from: c0 */
    private void m67614c0(final int i) {
        final View view = (View) this.f48798Q.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(view)) {
                mo56953b0(view, i);
            } else {
                view.post(new Runnable() {
                    public void run() {
                        BottomSheetBehavior.this.mo56953b0(view, i);
                    }
                });
            }
        }
    }

    /* renamed from: e0 */
    private boolean m67617e0() {
        return this.f48791J != null && (this.f48788G || this.f48789H == 1);
    }

    /* renamed from: j0 */
    private void m67623j0() {
        View view;
        WeakReference<V> weakReference = this.f48798Q;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewCompat.removeAccessibilityAction(view, 524288);
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            int i = this.f48806Y;
            if (i != -1) {
                ViewCompat.removeAccessibilityAction(view, i);
            }
            int i2 = 6;
            if (!this.f48809b && this.f48789H != 6) {
                this.f48806Y = m67630n(view, C10462R.string.bottomsheet_action_expand_halfway, 6);
            }
            if (this.f48786E && this.f48789H != 5) {
                m67607I(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
            }
            int i3 = this.f48789H;
            if (i3 == 3) {
                if (this.f48809b) {
                    i2 = 4;
                }
                m67607I(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, i2);
            } else if (i3 == 4) {
                if (this.f48809b) {
                    i2 = 3;
                }
                m67607I(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, i2);
            } else if (i3 == 6) {
                m67607I(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
                m67607I(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
            }
        }
    }

    /* renamed from: k0 */
    private void m67625k0(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f48829v != z) {
                this.f48829v = z;
                if (this.f48817j != null && (valueAnimator = this.f48831x) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f48831x.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f48831x.setFloatValues(new float[]{1.0f - f, f});
                    this.f48831x.start();
                }
            }
        }
    }

    /* renamed from: l0 */
    private void m67627l0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f48798Q;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f48805X == null) {
                        this.f48805X = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f48798Q.get()) {
                        if (z) {
                            this.f48805X.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f48810c) {
                                ViewCompat.setImportantForAccessibility(childAt, 4);
                            }
                        } else if (this.f48810c && (map = this.f48805X) != null && map.containsKey(childAt)) {
                            ViewCompat.setImportantForAccessibility(childAt, this.f48805X.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f48805X = null;
                } else if (this.f48810c) {
                    ((View) this.f48798Q.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m67629m0(boolean z) {
        View view;
        if (this.f48798Q != null) {
            m67631p();
            if (this.f48789H == 4 && (view = (View) this.f48798Q.get()) != null) {
                if (z) {
                    m67614c0(this.f48789H);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: n */
    private int m67630n(V v, @StringRes int i, int i2) {
        return ViewCompat.addAccessibilityAction(v, v.getResources().getString(i), m67634s(i2));
    }

    /* renamed from: p */
    private void m67631p() {
        int r = m67633r();
        if (this.f48809b) {
            this.f48784C = Math.max(this.f48797P - r, this.f48833z);
        } else {
            this.f48784C = this.f48797P - r;
        }
    }

    /* renamed from: q */
    private void m67632q() {
        this.f48782A = (int) (((float) this.f48797P) * (1.0f - this.f48783B));
    }

    /* renamed from: r */
    private int m67633r() {
        int i;
        if (this.f48813f) {
            return Math.min(Math.max(this.f48814g, this.f48797P - ((this.f48796O * 9) / 16)), this.f48795N) + this.f48826s;
        }
        if (this.f48821n || this.f48822o || (i = this.f48820m) <= 0) {
            return this.f48812e + this.f48826s;
        }
        return Math.max(this.f48812e, i + this.f48815h);
    }

    /* renamed from: s */
    private AccessibilityViewCommand m67634s(final int i) {
        return new AccessibilityViewCommand() {
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                BottomSheetBehavior.this.mo56951Y(i);
                return true;
            }
        };
    }

    /* renamed from: t */
    private void m67635t(@NonNull Context context, AttributeSet attributeSet, boolean z) {
        m67636u(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: u */
    private void m67636u(@NonNull Context context, AttributeSet attributeSet, boolean z, @Nullable ColorStateList colorStateList) {
        if (this.f48816i) {
            this.f48828u = ShapeAppearanceModel.m69264e(context, attributeSet, C10462R.attr.bottomSheetStyle, f48781a0).mo58721m();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f48828u);
            this.f48817j = materialShapeDrawable;
            materialShapeDrawable.mo58649P(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f48817j.setTint(typedValue.data);
                return;
            }
            this.f48817j.mo58656a0(colorStateList);
        }
    }

    /* renamed from: v */
    private void m67637v() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f48831x = ofFloat;
        ofFloat.setDuration(500);
        this.f48831x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.f48817j != null) {
                    BottomSheetBehavior.this.f48817j.mo58657b0(floatValue);
                }
            }
        });
    }

    @NonNull
    /* renamed from: y */
    public static <V extends View> BottomSheetBehavior<V> m67638y(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: z */
    private int m67639z(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), BasicMeasure.EXACTLY);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: A */
    public int mo56931A() {
        if (this.f48809b) {
            return this.f48833z;
        }
        return Math.max(this.f48832y, this.f48825r ? 0 : this.f48827t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public MaterialShapeDrawable mo56932B() {
        return this.f48817j;
    }

    /* renamed from: C */
    public int mo56933C() {
        return this.f48789H;
    }

    /* renamed from: E */
    public boolean mo56934E() {
        return this.f48821n;
    }

    /* renamed from: F */
    public boolean mo56935F() {
        return this.f48786E;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: G */
    public boolean mo56936G() {
        return true;
    }

    /* renamed from: H */
    public void mo56937H(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.f48800S.remove(bottomSheetCallback);
    }

    @Deprecated
    /* renamed from: L */
    public void mo56938L(BottomSheetCallback bottomSheetCallback) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f48800S.clear();
        if (bottomSheetCallback != null) {
            this.f48800S.add(bottomSheetCallback);
        }
    }

    /* renamed from: M */
    public void mo56939M(boolean z) {
        this.f48788G = z;
    }

    /* renamed from: N */
    public void mo56940N(int i) {
        if (i >= 0) {
            this.f48832y = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: O */
    public void mo56941O(boolean z) {
        if (this.f48809b != z) {
            this.f48809b = z;
            if (this.f48798Q != null) {
                m67631p();
            }
            mo56952Z((!this.f48809b || this.f48789H != 6) ? this.f48789H : 3);
            m67623j0();
        }
    }

    /* renamed from: P */
    public void mo56942P(boolean z) {
        this.f48821n = z;
    }

    /* renamed from: Q */
    public void mo56943Q(@FloatRange(from = 0.0d, fromInclusive = false, mo592to = 1.0d, toInclusive = false) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f48783B = f;
        if (this.f48798Q != null) {
            m67632q();
        }
    }

    /* renamed from: R */
    public void mo56944R(boolean z) {
        if (this.f48786E != z) {
            this.f48786E = z;
            if (!z && this.f48789H == 5) {
                mo56951Y(4);
            }
            m67623j0();
        }
    }

    /* renamed from: S */
    public void mo56945S(@C0144Px int i) {
        this.f48819l = i;
    }

    /* renamed from: T */
    public void mo56946T(@C0144Px int i) {
        this.f48818k = i;
    }

    /* renamed from: U */
    public void mo56947U(int i) {
        mo56948V(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56948V(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f48813f
            if (r4 != 0) goto L_0x0015
            r3.f48813f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f48813f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f48812e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f48813f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f48812e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.m67629m0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo56948V(int, boolean):void");
    }

    /* renamed from: W */
    public void mo56949W(int i) {
        this.f48808a = i;
    }

    /* renamed from: X */
    public void mo56950X(boolean z) {
        this.f48787F = z;
    }

    /* renamed from: Y */
    public void mo56951Y(int i) {
        if (i != this.f48789H) {
            if (this.f48798Q != null) {
                m67614c0(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f48786E && i == 5)) {
                this.f48789H = i;
                this.f48790I = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo56952Z(int i) {
        View view;
        if (this.f48789H != i) {
            this.f48789H = i;
            if (i == 4 || i == 3 || i == 6 || (this.f48786E && i == 5)) {
                this.f48790I = i;
            }
            WeakReference<V> weakReference = this.f48798Q;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    m67627l0(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m67627l0(false);
                }
                m67625k0(i);
                for (int i2 = 0; i2 < this.f48800S.size(); i2++) {
                    this.f48800S.get(i2).mo28986b(view, i);
                }
                m67623j0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo56953b0(@NonNull View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f48784C;
        } else if (i == 6) {
            int i4 = this.f48782A;
            if (!this.f48809b || i4 > (i3 = this.f48833z)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo56931A();
        } else if (!this.f48786E || i != 5) {
            Log.w("BottomSheetBehavior", "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
            return;
        } else {
            i2 = this.f48797P;
        }
        mo56958i0(view, i, i2, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d0 */
    public boolean mo56954d0(long j, @FloatRange(from = 0.0d, mo592to = 100.0d) float f) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public boolean mo56955f0(@NonNull View view, float f) {
        if (this.f48787F) {
            return true;
        }
        if (view.getTop() < this.f48784C) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f48784C)) / ((float) m67633r()) > 0.5f) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g0 */
    public boolean mo56956g0() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h0 */
    public boolean mo56957h0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo56958i0(View view, int i, int i2, boolean z) {
        ViewDragHelper viewDragHelper = this.f48791J;
        if (viewDragHelper != null && (!z ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i2) : viewDragHelper.settleCapturedViewAt(view.getLeft(), i2))) {
            mo56952Z(2);
            m67625k0(i);
            if (this.f48830w == null) {
                this.f48830w = new SettleRunnable(view, i);
            }
            if (!this.f48830w.f48850c) {
                BottomSheetBehavior<V>.SettleRunnable settleRunnable = this.f48830w;
                settleRunnable.f48851d = i;
                ViewCompat.postOnAnimation(view, settleRunnable);
                boolean unused = this.f48830w.f48850c = true;
                return;
            }
            this.f48830w.f48851d = i;
            return;
        }
        mo56952Z(i);
    }

    /* renamed from: o */
    public void mo56959o(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (!this.f48800S.contains(bottomSheetCallback)) {
            this.f48800S.add(bottomSheetCallback);
        }
    }

    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f48798Q = null;
        this.f48791J = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f48798Q = null;
        this.f48791J = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r10, @androidx.annotation.NonNull V r11, @androidx.annotation.NonNull android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f48788G
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.m67608J()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f48801T
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f48801T = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f48801T
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f48804W = r1
            r9.f48802U = r4
            boolean r11 = r9.f48792K
            if (r11 == 0) goto L_0x007f
            r9.f48792K = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f48803V = r7
            int r7 = r9.f48789H
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f48799R
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f48803V
            boolean r7 = r10.isPointInChildBounds(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f48802U = r7
            r9.f48804W = r2
        L_0x006e:
            int r7 = r9.f48802U
            if (r7 != r4) goto L_0x007c
            int r4 = r9.f48803V
            boolean r11 = r10.isPointInChildBounds(r11, r6, r4)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.f48792K = r11
        L_0x007f:
            boolean r11 = r9.f48792K
            if (r11 != 0) goto L_0x008e
            androidx.customview.widget.ViewDragHelper r11 = r9.f48791J
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.shouldInterceptTouchEvent(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f48799R
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f48792K
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f48789H
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.isPointInChildBounds(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            androidx.customview.widget.ViewDragHelper r10 = r9.f48791J
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f48803V
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            androidx.customview.widget.ViewDragHelper r11 = r9.f48791J
            int r11 = r11.getTouchSlop()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = 1
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f48792K = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        MaterialShapeDrawable materialShapeDrawable;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f48798Q == null) {
            this.f48814g = coordinatorLayout.getResources().getDimensionPixelSize(C10462R.dimen.design_bottom_sheet_peek_height_min);
            m67611a0(v);
            this.f48798Q = new WeakReference<>(v);
            if (this.f48816i && (materialShapeDrawable = this.f48817j) != null) {
                ViewCompat.setBackground(v, materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f48817j;
            if (materialShapeDrawable2 != null) {
                float f = this.f48785D;
                if (f == -1.0f) {
                    f = ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.mo58655Z(f);
                boolean z = this.f48789H == 3;
                this.f48829v = z;
                this.f48817j.mo58657b0(z ? 0.0f : 1.0f);
            }
            m67623j0();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
        }
        if (this.f48791J == null) {
            this.f48791J = ViewDragHelper.create(coordinatorLayout, this.f48807Z);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.f48796O = coordinatorLayout.getWidth();
        this.f48797P = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f48795N = height;
        int i2 = this.f48797P;
        int i3 = i2 - height;
        int i4 = this.f48827t;
        if (i3 < i4) {
            if (this.f48825r) {
                this.f48795N = i2;
            } else {
                this.f48795N = i2 - i4;
            }
        }
        this.f48833z = Math.max(0, i2 - this.f48795N);
        m67632q();
        m67631p();
        int i5 = this.f48789H;
        if (i5 == 3) {
            ViewCompat.offsetTopAndBottom(v, mo56931A());
        } else if (i5 == 6) {
            ViewCompat.offsetTopAndBottom(v, this.f48782A);
        } else if (this.f48786E && i5 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.f48797P);
        } else if (i5 == 4) {
            ViewCompat.offsetTopAndBottom(v, this.f48784C);
        } else if (i5 == 1 || i5 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        this.f48799R = new WeakReference<>(mo56961x(v));
        return true;
    }

    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m67639z(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f48818k, marginLayoutParams.width), m67639z(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f48819l, marginLayoutParams.height));
        return true;
    }

    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (!mo56936G() || (weakReference = this.f48799R) == null || view != weakReference.get()) {
            return false;
        }
        if (this.f48789H != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f48799R;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (!mo56936G() || view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo56931A()) {
                        iArr[1] = top - mo56931A();
                        ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                        mo56952Z(3);
                    } else if (this.f48788G) {
                        iArr[1] = i2;
                        ViewCompat.offsetTopAndBottom(v, -i2);
                        mo56952Z(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f48784C;
                    if (i4 > i5 && !this.f48786E) {
                        iArr[1] = top - i5;
                        ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                        mo56952Z(4);
                    } else if (this.f48788G) {
                        iArr[1] = i2;
                        ViewCompat.offsetTopAndBottom(v, -i2);
                        mo56952Z(1);
                    } else {
                        return;
                    }
                }
                mo56960w(v.getTop());
                this.f48793L = i2;
                this.f48794M = true;
            }
        }
    }

    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        m67609K(savedState);
        int i = savedState.f48844a;
        if (i == 1 || i == 2) {
            this.f48789H = 4;
            this.f48790I = 4;
            return;
        }
        this.f48789H = i;
        this.f48790I = i;
    }

    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.f48793L = 0;
        this.f48794M = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int i2;
        int i3;
        WeakReference<View> weakReference;
        int i4 = 3;
        if (v.getTop() == mo56931A()) {
            mo56952Z(3);
        } else if (!mo56936G() || ((weakReference = this.f48799R) != null && view == weakReference.get() && this.f48794M)) {
            if (this.f48793L > 0) {
                if (this.f48809b) {
                    i2 = this.f48833z;
                } else {
                    int top = v.getTop();
                    int i5 = this.f48782A;
                    if (top > i5) {
                        i2 = i5;
                    } else {
                        i2 = mo56931A();
                    }
                }
                mo56958i0(v, i4, i2, false);
                this.f48794M = false;
            } else if (!this.f48786E || !mo56955f0(v, m67606D())) {
                if (this.f48793L == 0) {
                    int top2 = v.getTop();
                    if (!this.f48809b) {
                        int i6 = this.f48782A;
                        if (top2 < i6) {
                            if (top2 < Math.abs(top2 - this.f48784C)) {
                                i2 = mo56931A();
                                mo56958i0(v, i4, i2, false);
                                this.f48794M = false;
                            } else if (mo56956g0()) {
                                i3 = this.f48784C;
                            } else {
                                i2 = this.f48782A;
                            }
                        } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f48784C)) {
                            i2 = this.f48782A;
                        } else {
                            i3 = this.f48784C;
                        }
                    } else if (Math.abs(top2 - this.f48833z) < Math.abs(top2 - this.f48784C)) {
                        i2 = this.f48833z;
                        mo56958i0(v, i4, i2, false);
                        this.f48794M = false;
                    } else {
                        i3 = this.f48784C;
                    }
                } else if (this.f48809b) {
                    i3 = this.f48784C;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f48782A) < Math.abs(top3 - this.f48784C)) {
                        i2 = this.f48782A;
                    } else {
                        i3 = this.f48784C;
                    }
                }
                i4 = 4;
                mo56958i0(v, i4, i2, false);
                this.f48794M = false;
            } else {
                i2 = this.f48797P;
                i4 = 5;
                mo56958i0(v, i4, i2, false);
                this.f48794M = false;
            }
            i4 = 6;
            mo56958i0(v, i4, i2, false);
            this.f48794M = false;
        }
    }

    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f48789H == 1 && actionMasked == 0) {
            return true;
        }
        if (m67617e0()) {
            this.f48791J.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            m67608J();
        }
        if (this.f48801T == null) {
            this.f48801T = VelocityTracker.obtain();
        }
        this.f48801T.addMovement(motionEvent);
        if (m67617e0() && actionMasked == 2 && !this.f48792K && Math.abs(((float) this.f48803V) - motionEvent.getY()) > ((float) this.f48791J.getTouchSlop())) {
            this.f48791J.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f48792K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo56960w(int i) {
        float f;
        float f2;
        View view = (View) this.f48798Q.get();
        if (view != null && !this.f48800S.isEmpty()) {
            int i2 = this.f48784C;
            if (i > i2 || i2 == mo56931A()) {
                int i3 = this.f48784C;
                f = (float) (i3 - i);
                f2 = (float) (this.f48797P - i3);
            } else {
                int i4 = this.f48784C;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo56931A());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f48800S.size(); i5++) {
                this.f48800S.get(i5).mo28985a(view, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @Nullable
    /* renamed from: x */
    public View mo56961x(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View x = mo56961x(viewGroup.getChildAt(i));
            if (x != null) {
                return x;
            }
        }
        return null;
    }

    protected static class SavedState extends AbsSavedState {
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

        /* renamed from: a */
        final int f48844a;

        /* renamed from: c */
        int f48845c;

        /* renamed from: d */
        boolean f48846d;

        /* renamed from: f */
        boolean f48847f;

        /* renamed from: g */
        boolean f48848g;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f48844a = parcel.readInt();
            this.f48845c = parcel.readInt();
            boolean z = false;
            this.f48846d = parcel.readInt() == 1;
            this.f48847f = parcel.readInt() == 1;
            this.f48848g = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f48844a);
            parcel.writeInt(this.f48845c);
            parcel.writeInt(this.f48846d ? 1 : 0);
            parcel.writeInt(this.f48847f ? 1 : 0);
            parcel.writeInt(this.f48848g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f48844a = bottomSheetBehavior.f48789H;
            this.f48845c = bottomSheetBehavior.f48812e;
            this.f48846d = bottomSheetBehavior.f48809b;
            this.f48847f = bottomSheetBehavior.f48786E;
            this.f48848g = bottomSheetBehavior.f48787F;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f48815h = context.getResources().getDimensionPixelSize(C10462R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.BottomSheetBehavior_Layout);
        this.f48816i = obtainStyledAttributes.hasValue(C10462R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        int i2 = C10462R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m67636u(context, attributeSet, hasValue, MaterialResources.m69121a(context, obtainStyledAttributes, i2));
        } else {
            m67635t(context, attributeSet, hasValue);
        }
        m67637v();
        this.f48785D = obtainStyledAttributes.getDimension(C10462R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = C10462R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            mo56946T(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C10462R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo56945S(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = C10462R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo56947U(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        } else {
            mo56947U(i);
        }
        mo56944R(obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo56942P(obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        mo56941O(obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo56950X(obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        mo56939M(obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        mo56949W(obtainStyledAttributes.getInt(C10462R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        mo56943Q(obtainStyledAttributes.getFloat(C10462R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i6 = C10462R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo56940N(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        } else {
            mo56940N(peekValue2.data);
        }
        this.f48822o = obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f48823p = obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f48824q = obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f48825r = obtainStyledAttributes.getBoolean(C10462R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        obtainStyledAttributes.recycle();
        this.f48811d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
