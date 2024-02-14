package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: J */
    private static final int f48544J = C10462R.style.Widget_Design_AppBarLayout;

    /* renamed from: A */
    private boolean f48545A;

    /* renamed from: B */
    private boolean f48546B;

    /* renamed from: C */
    private boolean f48547C;
    @IdRes

    /* renamed from: D */
    private int f48548D;
    @Nullable

    /* renamed from: E */
    private WeakReference<View> f48549E;
    @Nullable

    /* renamed from: F */
    private ValueAnimator f48550F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final List<LiftOnScrollListener> f48551G;

    /* renamed from: H */
    private int[] f48552H;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: I */
    public Drawable f48553I;

    /* renamed from: a */
    private int f48554a;

    /* renamed from: c */
    private int f48555c;

    /* renamed from: d */
    private int f48556d;

    /* renamed from: f */
    private int f48557f;

    /* renamed from: g */
    private boolean f48558g;

    /* renamed from: o */
    private int f48559o;
    @Nullable

    /* renamed from: p */
    private WindowInsetsCompat f48560p;

    /* renamed from: s */
    private List<BaseOnOffsetChangedListener> f48561s;

    /* renamed from: z */
    private boolean f48562z;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f48566k;

        /* renamed from: l */
        private int f48567l;

        /* renamed from: m */
        private ValueAnimator f48568m;

        /* renamed from: n */
        private SavedState f48569n;
        @Nullable

        /* renamed from: o */
        private WeakReference<View> f48570o;

        /* renamed from: p */
        private BaseDragCallback f48571p;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo56680a(@NonNull T t);
        }

        public BaseBehavior() {
        }

        /* renamed from: A */
        private int m67285A(@NonNull T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator d = layoutParams.mo56693d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (d != null) {
                    int c = layoutParams.mo56692c();
                    if ((c & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((c & 2) != 0) {
                            i2 -= ViewCompat.getMinimumHeight(childAt);
                        }
                    }
                    if (ViewCompat.getFitsSystemWindows(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * d.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: L */
        private boolean m67286L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            List<View> dependents = coordinatorLayout.getDependents(t);
            int size = dependents.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i).getLayoutParams()).getBehavior();
                if (!(behavior instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) behavior).mo56785g() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: M */
        private void m67287M(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            int i = mo56673i();
            int x = m67299x(t, i);
            if (x >= 0) {
                View childAt = t.getChildAt(x);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int c = layoutParams.mo56692c();
                if ((c & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (x == t.getChildCount() - 1) {
                        i3 += t.getTopInset() + t.getPaddingTop();
                    }
                    if (m67296u(c, 2)) {
                        i3 += ViewCompat.getMinimumHeight(childAt);
                    } else if (m67296u(c, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt) + i3;
                        if (i < minimumHeight) {
                            i2 = minimumHeight;
                        } else {
                            i3 = minimumHeight;
                        }
                    }
                    if (m67296u(c, 32)) {
                        i2 += layoutParams.topMargin;
                        i3 -= layoutParams.bottomMargin;
                    }
                    if (i < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    m67293q(coordinatorLayout, t, MathUtils.clamp(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: N */
        private void m67288N(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
            ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
            View v = m67297v(coordinatorLayout);
            if (v != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.LayoutParams) v.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior)) {
                m67291o(coordinatorLayout, t, v);
            }
        }

        /* renamed from: O */
        private void m67289O(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, boolean z) {
            View w = m67298w(t, i);
            boolean z2 = false;
            if (w != null) {
                int c = ((LayoutParams) w.getLayoutParams()).mo56692c();
                if ((c & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(w);
                    if (i2 <= 0 || (c & 12) == 0 ? !((c & 2) == 0 || (-i) < (w.getBottom() - minimumHeight) - t.getTopInset()) : (-i) >= (w.getBottom() - minimumHeight) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.mo56632n()) {
                z2 = t.mo56658z(m67297v(coordinatorLayout));
            }
            boolean w2 = t.mo56656w(z2);
            if (z || (w2 && m67286L(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        /* renamed from: o */
        private void m67291o(CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view) {
            if (mo56673i() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m67292p(coordinatorLayout, t, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD, false);
            }
            if (mo56673i() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                final int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    final CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                    final T t2 = t;
                    final View view2 = view;
                    ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, (CharSequence) null, new AccessibilityViewCommand() {
                        public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                            BaseBehavior.this.onNestedPreScroll(coordinatorLayout2, t2, view2, 0, i, new int[]{0, 0}, 1);
                            return true;
                        }
                    });
                    return;
                }
                return;
            }
            m67292p(coordinatorLayout, t, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, true);
        }

        /* renamed from: p */
        private void m67292p(CoordinatorLayout coordinatorLayout, @NonNull final T t, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, final boolean z) {
            ViewCompat.replaceAccessibilityAction(coordinatorLayout, accessibilityActionCompat, (CharSequence) null, new AccessibilityViewCommand() {
                public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                    t.setExpanded(z);
                    return true;
                }
            });
        }

        /* renamed from: q */
        private void m67293q(CoordinatorLayout coordinatorLayout, @NonNull T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo56673i() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m67294r(coordinatorLayout, t, i, i2);
        }

        /* renamed from: r */
        private void m67294r(final CoordinatorLayout coordinatorLayout, final T t, int i, int i2) {
            int i3 = mo56673i();
            if (i3 == i) {
                ValueAnimator valueAnimator = this.f48568m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f48568m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f48568m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f48568m = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.f48525e);
                this.f48568m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                        BaseBehavior.this.mo56781l(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.f48568m.setDuration((long) Math.min(i2, 600));
            this.f48568m.setIntValues(new int[]{i3, i});
            this.f48568m.start();
        }

        /* renamed from: t */
        private boolean m67295t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view) {
            return t.mo56631l() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: u */
        private static boolean m67296u(int i, int i2) {
            return (i & i2) == i2;
        }

        @Nullable
        /* renamed from: v */
        private View m67297v(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Nullable
        /* renamed from: w */
        private static View m67298w(@NonNull AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: x */
        private int m67299x(@NonNull T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m67296u(layoutParams.mo56692c(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo56674j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            m67287M(coordinatorLayout, t);
            if (t.mo56632n()) {
                t.mo56656w(t.mo56658z(m67297v(coordinatorLayout)));
            }
        }

        /* renamed from: C */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i) {
            int i2;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            SavedState savedState = this.f48569n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            m67293q(coordinatorLayout, t, i3, 0.0f);
                        } else {
                            mo56781l(coordinatorLayout, t, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m67293q(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            mo56781l(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.f48583a) {
                mo56781l(coordinatorLayout, t, -t.getTotalScrollRange());
            } else {
                View childAt = t.getChildAt(savedState.f48584c);
                int i4 = -childAt.getBottom();
                if (this.f48569n.f48586f) {
                    i2 = ViewCompat.getMinimumHeight(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f48569n.f48585d);
                }
                mo56781l(coordinatorLayout, t, i4 + i2);
            }
            t.mo56642s();
            this.f48569n = null;
            mo56689c(MathUtils.clamp(mo56688a(), -t.getTotalScrollRange(), 0));
            m67289O(coordinatorLayout, t, mo56688a(), 0, true);
            t.mo56633o(mo56688a());
            m67288N(coordinatorLayout, t);
            return onLayoutChild;
        }

        /* renamed from: D */
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.LayoutParams) t.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: E */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo56780k(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo56632n()) {
                t.mo56656w(t.mo56658z(view));
            }
        }

        /* renamed from: F */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo56780k(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m67288N(coordinatorLayout, t);
            }
        }

        /* renamed from: G */
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                this.f48569n = savedState;
                super.onRestoreInstanceState(coordinatorLayout, t, savedState.getSuperState());
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.f48569n = null;
        }

        /* renamed from: H */
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            int a = mo56688a();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + a;
                if (childAt.getTop() + a > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.f48583a = (-mo56688a()) >= t.getTotalScrollRange();
                    savedState.f48584c = i;
                    if (bottom == ViewCompat.getMinimumHeight(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f48586f = z;
                    savedState.f48585d = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        /* renamed from: I */
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo56632n() || m67295t(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f48568m) != null) {
                valueAnimator.cancel();
            }
            this.f48570o = null;
            this.f48567l = i2;
            return z;
        }

        /* renamed from: J */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i) {
            if (this.f48567l == 0 || i == 1) {
                m67287M(coordinatorLayout, t);
                if (t.mo56632n()) {
                    t.mo56656w(t.mo56658z(view));
                }
            }
            this.f48570o = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public int mo56675m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3) {
            int i4 = mo56673i();
            int i5 = 0;
            if (i2 == 0 || i4 < i2 || i4 > i3) {
                this.f48566k = 0;
            } else {
                int clamp = MathUtils.clamp(i, i2, i3);
                if (i4 != clamp) {
                    int A = t.mo56630j() ? m67285A(t, clamp) : clamp;
                    boolean c = mo56689c(A);
                    int i6 = i4 - clamp;
                    this.f48566k = clamp - A;
                    if (c) {
                        while (i5 < t.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t.getChildAt(i5).getLayoutParams();
                            ChildScrollEffect b = layoutParams.mo56691b();
                            if (!(b == null || (layoutParams.mo56692c() & 1) == 0)) {
                                b.mo56690a(t, t.getChildAt(i5), (float) mo56688a());
                            }
                            i5++;
                        }
                    }
                    if (!c && t.mo56630j()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t);
                    }
                    t.mo56633o(mo56688a());
                    m67289O(coordinatorLayout, t, clamp, clamp < i4 ? -1 : 1, false);
                    i5 = i6;
                }
            }
            m67288N(coordinatorLayout, t);
            return i5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo56673i() {
            return mo56688a() + this.f48566k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo56670d(T t) {
            BaseDragCallback baseDragCallback = this.f48571p;
            if (baseDragCallback != null) {
                return baseDragCallback.mo56680a(t);
            }
            WeakReference<View> weakReference = this.f48570o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public int mo56671g(@NonNull T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public int mo56672h(@NonNull T t) {
            return t.getTotalScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
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
            boolean f48583a;

            /* renamed from: c */
            int f48584c;

            /* renamed from: d */
            float f48585d;

            /* renamed from: f */
            boolean f48586f;

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f48583a = parcel.readByte() != 0;
                this.f48584c = parcel.readInt();
                this.f48585d = parcel.readFloat();
                this.f48586f = parcel.readByte() == 0 ? false : z;
            }

            public void writeToParcel(@NonNull Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f48583a ? (byte) 1 : 0);
                parcel.writeInt(this.f48584c);
                parcel.writeFloat(this.f48585d);
                parcel.writeByte(this.f48586f ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        /* renamed from: a */
        void mo56687a(T t, int i);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ boolean mo56661C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: D */
        public /* bridge */ /* synthetic */ boolean mo56662D(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ void mo56663E(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ void mo56664F(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ void mo56665G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ Parcelable mo56666H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo56667I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: J */
        public /* bridge */ /* synthetic */ void mo56668J(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo56688a() {
            return super.mo56688a();
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ boolean mo56689c(int i) {
            return super.mo56689c(i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class ChildScrollEffect {
        /* renamed from: a */
        public abstract void mo56690a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {

        /* renamed from: a */
        private final Rect f48587a = new Rect();

        /* renamed from: b */
        private final Rect f48588b = new Rect();

        /* renamed from: b */
        private static void m67335b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        /* renamed from: a */
        public void mo56690a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f) {
            m67335b(this.f48587a, appBarLayout, view);
            float abs = ((float) this.f48587a.top) - Math.abs(f);
            if (abs <= 0.0f) {
                float clamp = 1.0f - MathUtils.clamp(Math.abs(abs / ((float) this.f48587a.height())), 0.0f, 1.0f);
                float height = (-abs) - ((((float) this.f48587a.height()) * 0.3f) * (1.0f - (clamp * clamp)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f48588b);
                this.f48588b.offset(0, (int) (-height));
                ViewCompat.setClipBounds(view, this.f48588b);
                return;
            }
            ViewCompat.setClipBounds(view, (Rect) null);
            view.setTranslationY(0.0f);
        }
    }

    public interface LiftOnScrollListener {
        /* renamed from: a */
        void mo56696a(@Dimension float f, @ColorInt int i);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: n */
        private static int m67344n(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).mo56673i();
            }
            return 0;
        }

        /* renamed from: o */
        private void m67345o(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f48566k) + mo56786i()) - mo56784e(view2));
            }
        }

        /* renamed from: p */
        private void m67346p(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo56632n()) {
                    appBarLayout.mo56656w(appBarLayout.mo56658z(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public float mo56698f(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int n = m67344n(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + n > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) n) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo56699h(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo56699h(view);
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: m */
        public AppBarLayout mo56697d(@NonNull List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            m67345o(view, view2);
            m67346p(view, view2);
            return false;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
            }
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout m = mo56697d(coordinatorLayout.getDependencies(view));
            if (m != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f48637d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    m.mo56654t(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.ScrollingViewBehavior_Layout);
            mo56787k(obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.appBarLayoutStyle);
    }

    /* renamed from: A */
    private boolean m67256A() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ViewCompat.getFitsSystemWindows(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private void m67257B(@NonNull final MaterialShapeDrawable materialShapeDrawable, boolean z) {
        float dimension = getResources().getDimension(C10462R.dimen.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f48550F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f48550F = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C10462R.integer.app_bar_elevation_anim_duration));
        this.f48550F.setInterpolator(AnimationUtils.f48521a);
        this.f48550F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                materialShapeDrawable.mo58655Z(floatValue);
                if (AppBarLayout.this.f48553I instanceof MaterialShapeDrawable) {
                    ((MaterialShapeDrawable) AppBarLayout.this.f48553I).mo58655Z(floatValue);
                }
                for (LiftOnScrollListener a : AppBarLayout.this.f48551G) {
                    a.mo56696a(floatValue, materialShapeDrawable.mo58638A());
                }
            }
        });
        this.f48550F.start();
    }

    /* renamed from: C */
    private void m67258C() {
        setWillNotDraw(!m67267y());
    }

    /* renamed from: e */
    private void m67261e() {
        WeakReference<View> weakReference = this.f48549E;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f48549E = null;
    }

    @Nullable
    /* renamed from: f */
    private View m67262f(@Nullable View view) {
        int i;
        if (this.f48549E == null && (i = this.f48548D) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f48548D);
            }
            if (findViewById != null) {
                this.f48549E = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f48549E;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: k */
    private boolean m67263k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).mo56694e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m67264m() {
        this.f48555c = -1;
        this.f48556d = -1;
        this.f48557f = -1;
    }

    /* renamed from: u */
    private void m67265u(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f48559o = i2 | i;
        requestLayout();
    }

    /* renamed from: v */
    private boolean m67266v(boolean z) {
        if (this.f48545A == z) {
            return false;
        }
        this.f48545A = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: y */
    private boolean m67267y() {
        return this.f48553I != null && getTopInset() > 0;
    }

    /* renamed from: c */
    public void mo56609c(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.f48561s == null) {
            this.f48561s = new ArrayList();
        }
        if (baseOnOffsetChangedListener != null && !this.f48561s.contains(baseOnOffsetChangedListener)) {
            this.f48561s.add(baseOnOffsetChangedListener);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void mo56611d(OnOffsetChangedListener onOffsetChangedListener) {
        mo56609c(onOffsetChangedListener);
    }

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (m67267y()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f48554a));
            this.f48553I.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f48553I;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.f48556d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f48589a;
            if ((i4 & 5) == 5) {
                int i5 = layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i4 & 8) != 0) {
                    minimumHeight = ViewCompat.getMinimumHeight(childAt);
                } else if ((i4 & 2) != 0) {
                    minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + minimumHeight;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f48556d = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f48557f;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i4 = layoutParams.f48589a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f48557f = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f48548D;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f48559o;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f48553I;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f48560p;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f48555c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f48589a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if (i2 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f48555c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo56630j() {
        return this.f48558g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo56631l() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: n */
    public boolean mo56632n() {
        return this.f48547C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo56633o(int i) {
        this.f48554a = i;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        List<BaseOnOffsetChangedListener> list = this.f48561s;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.f48561s.get(i2);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.mo56687a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m69254e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f48552H == null) {
            this.f48552H = new int[4];
        }
        int[] iArr = this.f48552H;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f48545A;
        int i2 = C10462R.attr.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.f48546B) ? -C10462R.attr.state_lifted : C10462R.attr.state_lifted;
        int i3 = C10462R.attr.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.f48546B) ? -C10462R.attr.state_collapsed : C10462R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m67261e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (ViewCompat.getFitsSystemWindows(this) && m67256A()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        m67264m();
        this.f48558g = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).mo56693d() != null) {
                this.f48558g = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f48553I;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f48562z) {
            if (!this.f48547C && !m67263k()) {
                z2 = false;
            }
            m67266v(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && m67256A()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m67264m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public WindowInsetsCompat mo56639p(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.f48560p, windowInsetsCompat2)) {
            this.f48560p = windowInsetsCompat2;
            m67258C();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    /* renamed from: q */
    public void mo56640q(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.f48561s;
        if (list != null && baseOnOffsetChangedListener != null) {
            list.remove(baseOnOffsetChangedListener);
        }
    }

    /* renamed from: r */
    public void mo56641r(OnOffsetChangedListener onOffsetChangedListener) {
        mo56640q(onOffsetChangedListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo56642s() {
        this.f48559o = 0;
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.m69253d(this, f);
    }

    public void setExpanded(boolean z) {
        mo56654t(z, ViewCompat.isLaidOut(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f48547C = z;
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i) {
        this.f48548D = i;
        m67261e();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f48562z = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f48553I;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f48553I = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f48553I.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f48553I, ViewCompat.getLayoutDirection(this));
                this.f48553I.setVisible(getVisibility() == 0, false);
                this.f48553I.setCallback(this);
            }
            m67258C();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        ViewUtilsLollipop.m67411b(this, f);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f48553I;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public void mo56654t(boolean z, boolean z2) {
        m67265u(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f48553I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo56656w(boolean z) {
        return mo56657x(z, !this.f48562z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo56657x(boolean z, boolean z2) {
        if (!z2 || this.f48546B == z) {
            return false;
        }
        this.f48546B = z;
        refreshDrawableState();
        if (!this.f48547C || !(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        m67257B((MaterialShapeDrawable) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo56658z(@Nullable View view) {
        View f = m67262f(view);
        if (f != null) {
            view = f;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f48544J
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f48555c = r10
            r9.f48556d = r10
            r9.f48557f = r10
            r6 = 0
            r9.f48559o = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f48551G = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            com.google.android.material.appbar.ViewUtilsLollipop.m67410a(r9)
        L_0x002f:
            com.google.android.material.appbar.ViewUtilsLollipop.m67412c(r9, r11, r12, r4)
            int[] r2 = com.google.android.material.C10462R.styleable.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r12 = com.google.android.material.C10462R.styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.ViewCompat.setBackground(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.mo58656a0(r12)
            r0.mo58649P(r7)
            androidx.core.view.ViewCompat.setBackground(r9, r0)
        L_0x006a:
            int r12 = com.google.android.material.C10462R.styleable.AppBarLayout_expanded
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0079
            boolean r12 = r11.getBoolean(r12, r6)
            r9.m67265u(r12, r6, r6)
        L_0x0079:
            int r12 = com.google.android.material.C10462R.styleable.AppBarLayout_elevation
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0089
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.ViewUtilsLollipop.m67411b(r9, r12)
        L_0x0089:
            r12 = 26
            if (r8 < r12) goto L_0x00ab
            int r12 = com.google.android.material.C10462R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x009c:
            int r12 = com.google.android.material.C10462R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00ab
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x00ab:
            int r12 = com.google.android.material.C10462R.styleable.AppBarLayout_liftOnScroll
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f48547C = r12
            int r12 = com.google.android.material.C10462R.styleable.AppBarLayout_liftOnScrollTargetViewId
            int r10 = r11.getResourceId(r12, r10)
            r9.f48548D = r10
            int r10 = com.google.android.material.C10462R.styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$1 r10 = new com.google.android.material.appbar.AppBarLayout$1
            r10.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f48589a = 1;

        /* renamed from: b */
        private ChildScrollEffect f48590b;

        /* renamed from: c */
        Interpolator f48591c;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.AppBarLayout_Layout);
            this.f48589a = obtainStyledAttributes.getInt(C10462R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            mo56695f(m67337a(obtainStyledAttributes.getInt(C10462R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0)));
            int i = C10462R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f48591c = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @Nullable
        /* renamed from: a */
        private ChildScrollEffect m67337a(int i) {
            if (i != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        @Nullable
        /* renamed from: b */
        public ChildScrollEffect mo56691b() {
            return this.f48590b;
        }

        /* renamed from: c */
        public int mo56692c() {
            return this.f48589a;
        }

        /* renamed from: d */
        public Interpolator mo56693d() {
            return this.f48591c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo56694e() {
            int i = this.f48589a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void mo56695f(@Nullable ChildScrollEffect childScrollEffect) {
            this.f48590b = childScrollEffect;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
