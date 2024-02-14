package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    ViewDragHelper f48703a;

    /* renamed from: b */
    OnDismissListener f48704b;

    /* renamed from: c */
    private boolean f48705c;

    /* renamed from: d */
    private float f48706d = 0.0f;

    /* renamed from: e */
    private boolean f48707e;

    /* renamed from: f */
    int f48708f = 2;

    /* renamed from: g */
    float f48709g = 0.5f;

    /* renamed from: h */
    float f48710h = 0.0f;

    /* renamed from: i */
    float f48711i = 0.5f;

    /* renamed from: j */
    private final ViewDragHelper.Callback f48712j = new ViewDragHelper.Callback() {

        /* renamed from: a */
        private int f48713a;

        /* renamed from: b */
        private int f48714b = -1;

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m67510a(@androidx.annotation.NonNull android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f48708f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f48713a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f48709g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C104811.m67510a(android.view.View, float):boolean");
        }

        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = ViewCompat.getLayoutDirection(view) == 1;
            int i5 = SwipeDismissBehavior.this.f48708f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f48713a - view.getWidth();
                    i4 = view.getWidth() + this.f48713a;
                } else if (z) {
                    i3 = this.f48713a;
                    width = view.getWidth();
                } else {
                    i3 = this.f48713a - view.getWidth();
                    i4 = this.f48713a;
                }
                return SwipeDismissBehavior.m67501c(i3, i, i4);
            } else if (z) {
                i3 = this.f48713a - view.getWidth();
                i4 = this.f48713a;
                return SwipeDismissBehavior.m67501c(i3, i, i4);
            } else {
                i3 = this.f48713a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m67501c(i3, i, i4);
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        public void onViewCaptured(@NonNull View view, int i) {
            this.f48714b = i;
            this.f48713a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f48704b;
            if (onDismissListener != null) {
                onDismissListener.mo56855b(i);
            }
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f48713a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f48710h);
            float width2 = ((float) this.f48713a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f48711i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m67500b(0.0f, 1.0f - SwipeDismissBehavior.m67503e(width, width2, f), 1.0f));
            }
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
            boolean z;
            int i;
            OnDismissListener onDismissListener;
            this.f48714b = -1;
            int width = view.getWidth();
            if (m67510a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f48713a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f48713a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f48703a.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new SettleRunnable(view, z));
            } else if (z && (onDismissListener = SwipeDismissBehavior.this.f48704b) != null) {
                onDismissListener.mo56854a(view);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            int i2 = this.f48714b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo56849a(view);
        }
    };

    public interface OnDismissListener {
        /* renamed from: a */
        void mo56854a(View view);

        /* renamed from: b */
        void mo56855b(int i);
    }

    private class SettleRunnable implements Runnable {

        /* renamed from: a */
        private final View f48717a;

        /* renamed from: c */
        private final boolean f48718c;

        SettleRunnable(View view, boolean z) {
            this.f48717a = view;
            this.f48718c = z;
        }

        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f48703a;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.f48717a, this);
            } else if (this.f48718c && (onDismissListener = SwipeDismissBehavior.this.f48704b) != null) {
                onDismissListener.mo56854a(this.f48717a);
            }
        }
    }

    /* renamed from: b */
    static float m67500b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: c */
    static int m67501c(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: d */
    private void m67502d(ViewGroup viewGroup) {
        ViewDragHelper viewDragHelper;
        if (this.f48703a == null) {
            if (this.f48707e) {
                viewDragHelper = ViewDragHelper.create(viewGroup, this.f48706d, this.f48712j);
            } else {
                viewDragHelper = ViewDragHelper.create(viewGroup, this.f48712j);
            }
            this.f48703a = viewDragHelper;
        }
    }

    /* renamed from: e */
    static float m67503e(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: j */
    private void m67504j(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (mo56849a(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, (CharSequence) null, new AccessibilityViewCommand() {
                public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                    boolean z = false;
                    if (!SwipeDismissBehavior.this.mo56849a(view)) {
                        return false;
                    }
                    boolean z2 = ViewCompat.getLayoutDirection(view) == 1;
                    int i = SwipeDismissBehavior.this.f48708f;
                    if ((i == 0 && z2) || (i == 1 && !z2)) {
                        z = true;
                    }
                    int width = view.getWidth();
                    if (z) {
                        width = -width;
                    }
                    ViewCompat.offsetLeftAndRight(view, width);
                    view.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.f48704b;
                    if (onDismissListener != null) {
                        onDismissListener.mo56854a(view);
                    }
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo56849a(@NonNull View view) {
        return true;
    }

    /* renamed from: f */
    public void mo56850f(float f) {
        this.f48711i = m67500b(0.0f, f, 1.0f);
    }

    /* renamed from: g */
    public void mo56851g(@Nullable OnDismissListener onDismissListener) {
        this.f48704b = onDismissListener;
    }

    /* renamed from: h */
    public void mo56852h(float f) {
        this.f48710h = m67500b(0.0f, f, 1.0f);
    }

    /* renamed from: i */
    public void mo56853i(int i) {
        this.f48708f = i;
    }

    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = this.f48705c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f48705c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f48705c = false;
        }
        if (!z) {
            return false;
        }
        m67502d(coordinatorLayout);
        return this.f48703a.shouldInterceptTouchEvent(motionEvent);
    }

    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (ViewCompat.getImportantForAccessibility(v) == 0) {
            ViewCompat.setImportantForAccessibility(v, 1);
            m67504j(v);
        }
        return onLayoutChild;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.f48703a;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }
}
