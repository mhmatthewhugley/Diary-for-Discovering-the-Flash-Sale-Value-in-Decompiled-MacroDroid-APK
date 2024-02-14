package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    @Nullable

    /* renamed from: d */
    private Runnable f48627d;

    /* renamed from: e */
    OverScroller f48628e;

    /* renamed from: f */
    private boolean f48629f;

    /* renamed from: g */
    private int f48630g = -1;

    /* renamed from: h */
    private int f48631h;

    /* renamed from: i */
    private int f48632i = -1;
    @Nullable

    /* renamed from: j */
    private VelocityTracker f48633j;

    private class FlingRunnable implements Runnable {

        /* renamed from: a */
        private final CoordinatorLayout f48634a;

        /* renamed from: c */
        private final V f48635c;

        FlingRunnable(CoordinatorLayout coordinatorLayout, V v) {
            this.f48634a = coordinatorLayout;
            this.f48635c = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f48635c != null && (overScroller = HeaderBehavior.this.f48628e) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.mo56781l(this.f48634a, this.f48635c, headerBehavior.f48628e.getCurrY());
                    ViewCompat.postOnAnimation(this.f48635c, this);
                    return;
                }
                HeaderBehavior.this.mo56674j(this.f48634a, this.f48635c);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* renamed from: e */
    private void m67376e() {
        if (this.f48633j == null) {
            this.f48633j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo56670d(V v) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo56779f(CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f48627d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f48627d = null;
        }
        if (this.f48628e == null) {
            this.f48628e = new OverScroller(v.getContext());
        }
        this.f48628e.fling(0, mo56688a(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f48628e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v);
            this.f48627d = flingRunnable;
            ViewCompat.postOnAnimation(v, flingRunnable);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo56674j(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo56671g(@NonNull V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo56672h(@NonNull V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo56673i() {
        return mo56688a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo56674j(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final int mo56780k(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo56675m(coordinatorLayout, v, mo56673i() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo56781l(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo56675m(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo56675m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        int a = mo56688a();
        if (i2 == 0 || a < i2 || a > i3 || a == (clamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        mo56689c(clamp);
        return a - clamp;
    }

    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f48632i < 0) {
            this.f48632i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f48629f) {
            int i = this.f48630g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f48631h) > this.f48632i) {
                this.f48631h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f48630g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo56670d(v) && coordinatorLayout.isPointInChildBounds(v, x, y2);
            this.f48629f = z;
            if (z) {
                this.f48631h = y2;
                this.f48630g = motionEvent.getPointerId(0);
                m67376e();
                OverScroller overScroller = this.f48628e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f48628e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f48633j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.NonNull V r13, @androidx.annotation.NonNull android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f48630g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f48631h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f48630g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f48631h
            int r7 = r1 - r0
            r11.f48631h = r0
            int r8 = r11.mo56671g(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo56780k(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f48633j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f48633j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f48633j
            int r4 = r11.f48630g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo56672h(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo56779f(r6, r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f48629f = r3
            r11.f48630g = r1
            android.view.VelocityTracker r13 = r11.f48633j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f48633j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f48633j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f48629f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
