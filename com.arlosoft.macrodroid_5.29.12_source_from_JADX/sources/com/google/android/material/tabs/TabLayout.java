package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {

    /* renamed from: l0 */
    private static final int f50304l0 = C10462R.style.Widget_Design_TabLayout;

    /* renamed from: m0 */
    private static final Pools.Pool<Tab> f50305m0 = new Pools.SynchronizedPool(16);

    /* renamed from: A */
    ColorStateList f50306A;

    /* renamed from: B */
    ColorStateList f50307B;
    @NonNull

    /* renamed from: C */
    Drawable f50308C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f50309D;

    /* renamed from: E */
    PorterDuff.Mode f50310E;

    /* renamed from: F */
    float f50311F;

    /* renamed from: G */
    float f50312G;

    /* renamed from: H */
    final int f50313H;

    /* renamed from: I */
    int f50314I;

    /* renamed from: J */
    private final int f50315J;

    /* renamed from: K */
    private final int f50316K;

    /* renamed from: L */
    private final int f50317L;

    /* renamed from: M */
    private int f50318M;

    /* renamed from: N */
    int f50319N;

    /* renamed from: O */
    int f50320O;

    /* renamed from: P */
    int f50321P;

    /* renamed from: Q */
    int f50322Q;

    /* renamed from: R */
    boolean f50323R;

    /* renamed from: S */
    boolean f50324S;

    /* renamed from: T */
    int f50325T;

    /* renamed from: U */
    int f50326U;

    /* renamed from: V */
    boolean f50327V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TabIndicatorInterpolator f50328W;

    /* renamed from: a */
    private final ArrayList<Tab> f50329a;
    @Nullable

    /* renamed from: a0 */
    private BaseOnTabSelectedListener f50330a0;

    /* renamed from: b0 */
    private final ArrayList<BaseOnTabSelectedListener> f50331b0;
    @Nullable

    /* renamed from: c */
    private Tab f50332c;
    @Nullable

    /* renamed from: c0 */
    private BaseOnTabSelectedListener f50333c0;
    @NonNull

    /* renamed from: d */
    final SlidingTabIndicator f50334d;

    /* renamed from: d0 */
    private ValueAnimator f50335d0;
    @Nullable

    /* renamed from: e0 */
    ViewPager f50336e0;

    /* renamed from: f */
    int f50337f;
    @Nullable

    /* renamed from: f0 */
    private PagerAdapter f50338f0;

    /* renamed from: g */
    int f50339g;

    /* renamed from: g0 */
    private DataSetObserver f50340g0;

    /* renamed from: h0 */
    private TabLayoutOnPageChangeListener f50341h0;

    /* renamed from: i0 */
    private AdapterChangeListener f50342i0;

    /* renamed from: j0 */
    private boolean f50343j0;

    /* renamed from: k0 */
    private final Pools.Pool<TabView> f50344k0;

    /* renamed from: o */
    int f50345o;

    /* renamed from: p */
    int f50346p;

    /* renamed from: s */
    int f50347s;

    /* renamed from: z */
    ColorStateList f50348z;

    private class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {

        /* renamed from: a */
        private boolean f50350a;

        AdapterChangeListener() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo59049a(boolean z) {
            this.f50350a = z;
        }

        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f50336e0 == viewPager) {
                tabLayout.mo58987H(pagerAdapter2, this.f50350a);
            }
        }
    }

    @Deprecated
    public interface BaseOnTabSelectedListener<T extends Tab> {
        /* renamed from: a */
        void mo30427a(T t);

        /* renamed from: b */
        void mo30428b(T t);

        /* renamed from: c */
        void mo30429c(T t);
    }

    public @interface LabelVisibility {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    private class PagerAdapterObserver extends DataSetObserver {
        PagerAdapterObserver() {
        }

        public void onChanged() {
            TabLayout.this.mo58981A();
        }

        public void onInvalidated() {
            TabLayout.this.mo58981A();
        }
    }

    class SlidingTabIndicator extends LinearLayout {

        /* renamed from: a */
        ValueAnimator f50353a;

        /* renamed from: c */
        int f50354c = -1;

        /* renamed from: d */
        float f50355d;

        /* renamed from: f */
        private int f50356f = -1;

        SlidingTabIndicator(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m69682e() {
            View childAt = getChildAt(this.f50354c);
            TabIndicatorInterpolator a = TabLayout.this.f50328W;
            TabLayout tabLayout = TabLayout.this;
            a.mo58980d(tabLayout, childAt, tabLayout.f50308C);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m69683h(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                TabIndicatorInterpolator a = TabLayout.this.f50328W;
                TabLayout tabLayout = TabLayout.this;
                a.mo58979c(tabLayout, view, view2, f, tabLayout.f50308C);
            } else {
                Drawable drawable = TabLayout.this.f50308C;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f50308C.getBounds().bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        /* renamed from: i */
        private void m69684i(boolean z, final int i, int i2) {
            final View childAt = getChildAt(this.f50354c);
            final View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m69682e();
                return;
            }
            C106611 r2 = new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.m69683h(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f50353a = valueAnimator;
                valueAnimator.setInterpolator(AnimationUtils.f48522b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(r2);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        SlidingTabIndicator.this.f50354c = i;
                    }

                    public void onAnimationStart(Animator animator) {
                        SlidingTabIndicator.this.f50354c = i;
                    }
                });
                valueAnimator.start();
                return;
            }
            this.f50353a.removeAllUpdateListeners();
            this.f50353a.addUpdateListener(r2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo59052c(int i, int i2) {
            ValueAnimator valueAnimator = this.f50353a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f50353a.cancel();
            }
            m69684i(true, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo59053d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void draw(@NonNull Canvas canvas) {
            int height = TabLayout.this.f50308C.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f50308C.getIntrinsicHeight();
            }
            int i = TabLayout.this.f50321P;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                if (i != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.f50308C.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f50308C.getBounds();
                TabLayout.this.f50308C.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f50308C;
                if (tabLayout.f50309D != 0) {
                    drawable = DrawableCompat.wrap(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f50309D, PorterDuff.Mode.SRC_IN);
                    } else {
                        DrawableCompat.setTint(drawable, TabLayout.this.f50309D);
                    }
                } else if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter((ColorFilter) null);
                } else {
                    DrawableCompat.setTintList(drawable, (ColorStateList) null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo59055f(int i, float f) {
            ValueAnimator valueAnimator = this.f50353a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f50353a.cancel();
            }
            this.f50354c = i;
            this.f50355d = f;
            m69683h(getChildAt(i), getChildAt(this.f50354c + 1), this.f50355d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo59056g(int i) {
            Rect bounds = TabLayout.this.f50308C.getBounds();
            TabLayout.this.f50308C.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f50353a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m69682e();
            } else {
                m69684i(false, this.f50354c, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f50319N == 1 || tabLayout.f50322Q == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) ViewUtils.m68837d(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f50319N = 0;
                            tabLayout2.mo58992P(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f50356f != i) {
                requestLayout();
                this.f50356f = i;
            }
        }
    }

    public static class Tab {
        @Nullable

        /* renamed from: a */
        private Object f50363a;
        @Nullable

        /* renamed from: b */
        private Drawable f50364b;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: c */
        public CharSequence f50365c;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: d */
        public CharSequence f50366d;

        /* renamed from: e */
        private int f50367e = -1;
        @Nullable

        /* renamed from: f */
        private View f50368f;
        /* access modifiers changed from: private */
        @LabelVisibility

        /* renamed from: g */
        public int f50369g = 1;
        @Nullable

        /* renamed from: h */
        public TabLayout f50370h;
        @NonNull

        /* renamed from: i */
        public TabView f50371i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f50372j = -1;

        @Nullable
        /* renamed from: e */
        public View mo59063e() {
            return this.f50368f;
        }

        @Nullable
        /* renamed from: f */
        public Drawable mo59064f() {
            return this.f50364b;
        }

        /* renamed from: g */
        public int mo59065g() {
            return this.f50367e;
        }

        @LabelVisibility
        /* renamed from: h */
        public int mo59066h() {
            return this.f50369g;
        }

        @Nullable
        /* renamed from: i */
        public CharSequence mo59067i() {
            return this.f50365c;
        }

        /* renamed from: j */
        public boolean mo59068j() {
            TabLayout tabLayout = this.f50370h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.f50367e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo59069k() {
            this.f50370h = null;
            this.f50371i = null;
            this.f50363a = null;
            this.f50364b = null;
            this.f50372j = -1;
            this.f50365c = null;
            this.f50366d = null;
            this.f50367e = -1;
            this.f50368f = null;
        }

        /* renamed from: l */
        public void mo59070l() {
            TabLayout tabLayout = this.f50370h;
            if (tabLayout != null) {
                tabLayout.mo58985F(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        /* renamed from: m */
        public Tab mo59071m(@Nullable CharSequence charSequence) {
            this.f50366d = charSequence;
            mo59077s();
            return this;
        }

        @NonNull
        /* renamed from: n */
        public Tab mo59072n(@LayoutRes int i) {
            return mo59073o(LayoutInflater.from(this.f50371i.getContext()).inflate(i, this.f50371i, false));
        }

        @NonNull
        /* renamed from: o */
        public Tab mo59073o(@Nullable View view) {
            this.f50368f = view;
            mo59077s();
            return this;
        }

        @NonNull
        /* renamed from: p */
        public Tab mo59074p(@Nullable Drawable drawable) {
            this.f50364b = drawable;
            TabLayout tabLayout = this.f50370h;
            if (tabLayout.f50319N == 1 || tabLayout.f50322Q == 2) {
                tabLayout.mo58992P(true);
            }
            mo59077s();
            if (BadgeUtils.f48693a && this.f50371i.m69720l() && this.f50371i.f50382g.isVisible()) {
                this.f50371i.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo59075q(int i) {
            this.f50367e = i;
        }

        @NonNull
        /* renamed from: r */
        public Tab mo59076r(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f50366d) && !TextUtils.isEmpty(charSequence)) {
                this.f50371i.setContentDescription(charSequence);
            }
            this.f50365c = charSequence;
            mo59077s();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo59077s() {
            TabView tabView = this.f50371i;
            if (tabView != null) {
                tabView.mo59089t();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        @NonNull

        /* renamed from: a */
        private final WeakReference<TabLayout> f50373a;

        /* renamed from: c */
        private int f50374c;

        /* renamed from: d */
        private int f50375d;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f50373a = new WeakReference<>(tabLayout);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo59078a() {
            this.f50375d = 0;
            this.f50374c = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f50374c = this.f50375d;
            this.f50375d = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f50373a.get();
            if (tabLayout != null) {
                int i3 = this.f50375d;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f50374c == 1;
                if (!(i3 == 2 && this.f50374c == 0)) {
                    z = true;
                }
                tabLayout.mo58989J(i, f, z2, z);
            }
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = (TabLayout) this.f50373a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f50375d;
                tabLayout.mo58986G(tabLayout.mo59045x(i), i2 == 0 || (i2 == 2 && this.f50374c == 0));
            }
        }
    }

    public final class TabView extends LinearLayout {

        /* renamed from: A */
        private int f50376A = 2;

        /* renamed from: a */
        private Tab f50378a;

        /* renamed from: c */
        private TextView f50379c;

        /* renamed from: d */
        private ImageView f50380d;
        @Nullable

        /* renamed from: f */
        private View f50381f;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: g */
        public BadgeDrawable f50382g;
        @Nullable

        /* renamed from: o */
        private View f50383o;
        @Nullable

        /* renamed from: p */
        private TextView f50384p;
        @Nullable

        /* renamed from: s */
        private ImageView f50385s;
        @Nullable

        /* renamed from: z */
        private Drawable f50386z;

        public TabView(@NonNull Context context) {
            super(context);
            m69727u(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.f50337f, TabLayout.this.f50339g, TabLayout.this.f50345o, TabLayout.this.f50346p);
            setGravity(17);
            setOrientation(TabLayout.this.f50323R ^ true ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        /* renamed from: f */
        private void m69714f(@Nullable final View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        if (view.getVisibility() == 0) {
                            TabView.this.m69726s(view);
                        }
                    }
                });
            }
        }

        /* renamed from: g */
        private float m69715g(@NonNull Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.f50382g;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if (this.f50382g == null) {
                this.f50382g = BadgeDrawable.m67420c(getContext());
            }
            m69725r();
            BadgeDrawable badgeDrawable = this.f50382g;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m69716h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @NonNull
        /* renamed from: i */
        private FrameLayout m69717i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m69718j(@NonNull Canvas canvas) {
            Drawable drawable = this.f50386z;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f50386z.draw(canvas);
            }
        }

        @Nullable
        /* renamed from: k */
        private FrameLayout m69719k(@NonNull View view) {
            if ((view == this.f50380d || view == this.f50379c) && BadgeUtils.f48693a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public boolean m69720l() {
            return this.f50382g != null;
        }

        /* renamed from: m */
        private void m69721m() {
            ViewGroup viewGroup;
            if (BadgeUtils.f48693a) {
                viewGroup = m69717i();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C10462R.C10467layout.design_layout_tab_icon, viewGroup, false);
            this.f50380d = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* renamed from: n */
        private void m69722n() {
            ViewGroup viewGroup;
            if (BadgeUtils.f48693a) {
                viewGroup = m69717i();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C10462R.C10467layout.design_layout_tab_text, viewGroup, false);
            this.f50379c = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: p */
        private void m69723p(@Nullable View view) {
            if (m69720l() && view != null) {
                m69716h(false);
                BadgeUtils.m67484a(this.f50382g, view, m69719k(view));
                this.f50381f = view;
            }
        }

        /* renamed from: q */
        private void m69724q() {
            if (m69720l()) {
                m69716h(true);
                View view = this.f50381f;
                if (view != null) {
                    BadgeUtils.m67487d(this.f50382g, view);
                    this.f50381f = null;
                }
            }
        }

        /* renamed from: r */
        private void m69725r() {
            Tab tab;
            Tab tab2;
            if (m69720l()) {
                if (this.f50383o != null) {
                    m69724q();
                } else if (this.f50380d != null && (tab2 = this.f50378a) != null && tab2.mo59064f() != null) {
                    View view = this.f50381f;
                    ImageView imageView = this.f50380d;
                    if (view != imageView) {
                        m69724q();
                        m69723p(this.f50380d);
                        return;
                    }
                    m69726s(imageView);
                } else if (this.f50379c == null || (tab = this.f50378a) == null || tab.mo59066h() != 1) {
                    m69724q();
                } else {
                    View view2 = this.f50381f;
                    TextView textView = this.f50379c;
                    if (view2 != textView) {
                        m69724q();
                        m69723p(this.f50379c);
                        return;
                    }
                    m69726s(textView);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m69726s(@NonNull View view) {
            if (m69720l() && view == this.f50381f) {
                BadgeUtils.m67488e(this.f50382g, view, m69719k(view));
            }
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: u */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m69727u(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f50313H
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r6, r0)
                r5.f50386z = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f50386z
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f50386z = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f50307B
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f50307B
                android.content.res.ColorStateList r2 = com.google.android.material.ripple.RippleUtils.m69152a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f50327V
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                androidx.core.view.ViewCompat.setBackground(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.m69727u(android.content.Context):void");
        }

        /* renamed from: w */
        private void m69728w(@Nullable TextView textView, @Nullable ImageView imageView) {
            Tab tab = this.f50378a;
            CharSequence charSequence = null;
            Drawable mutate = (tab == null || tab.mo59064f() == null) ? null : DrawableCompat.wrap(this.f50378a.mo59064f()).mutate();
            if (mutate != null) {
                DrawableCompat.setTintList(mutate, TabLayout.this.f50306A);
                PorterDuff.Mode mode = TabLayout.this.f50310E;
                if (mode != null) {
                    DrawableCompat.setTintMode(mutate, mode);
                }
            }
            Tab tab2 = this.f50378a;
            CharSequence i = tab2 != null ? tab2.mo59067i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(i);
            if (textView != null) {
                if (z) {
                    textView.setText(i);
                    if (this.f50378a.f50369g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int d = (!z || imageView.getVisibility() != 0) ? 0 : (int) ViewUtils.m68837d(getContext(), 8);
                if (TabLayout.this.f50323R) {
                    if (d != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, d);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (d != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = d;
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.f50378a;
            if (tab3 != null) {
                charSequence = tab3.f50366d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    i = charSequence;
                }
                TooltipCompat.setTooltipText(this, i);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f50386z;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f50386z.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.f50379c, this.f50380d, this.f50383o};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.f50379c, this.f50380d, this.f50383o};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        @Nullable
        public Tab getTab() {
            return this.f50378a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo59083o() {
            setTab((Tab) null);
            setSelected(false);
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f50382g;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f50382g.mo56815h());
            }
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.f50378a.mo59065g(), 1, false, isSelected()));
            if (isSelected()) {
                wrap.setClickable(false);
                wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            wrap.setRoleDescription(getResources().getString(C10462R.string.item_view_role_description));
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f50314I, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f50379c != null) {
                float f = TabLayout.this.f50311F;
                int i3 = this.f50376A;
                ImageView imageView = this.f50380d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f50379c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f50312G;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f50379c.getTextSize();
                int lineCount = this.f50379c.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.f50379c);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.f50322Q == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f50379c.getLayout()) == null || m69715g(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f50379c.setTextSize(0, f);
                        this.f50379c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f50378a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f50378a.mo59070l();
            return true;
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f50379c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f50380d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f50383o;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(@Nullable Tab tab) {
            if (tab != this.f50378a) {
                this.f50378a = tab;
                mo59089t();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo59089t() {
            Tab tab = this.f50378a;
            View e = tab != null ? tab.mo59063e() : null;
            if (e != null) {
                ViewParent parent = e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(e);
                    }
                    addView(e);
                }
                this.f50383o = e;
                TextView textView = this.f50379c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f50380d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f50380d.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) e.findViewById(16908308);
                this.f50384p = textView2;
                if (textView2 != null) {
                    this.f50376A = TextViewCompat.getMaxLines(textView2);
                }
                this.f50385s = (ImageView) e.findViewById(16908294);
            } else {
                View view = this.f50383o;
                if (view != null) {
                    removeView(view);
                    this.f50383o = null;
                }
                this.f50384p = null;
                this.f50385s = null;
            }
            if (this.f50383o == null) {
                if (this.f50380d == null) {
                    m69721m();
                }
                if (this.f50379c == null) {
                    m69722n();
                    this.f50376A = TextViewCompat.getMaxLines(this.f50379c);
                }
                TextViewCompat.setTextAppearance(this.f50379c, TabLayout.this.f50347s);
                ColorStateList colorStateList = TabLayout.this.f50348z;
                if (colorStateList != null) {
                    this.f50379c.setTextColor(colorStateList);
                }
                m69728w(this.f50379c, this.f50380d);
                m69725r();
                m69714f(this.f50380d);
                m69714f(this.f50379c);
            } else {
                TextView textView3 = this.f50384p;
                if (!(textView3 == null && this.f50385s == null)) {
                    m69728w(textView3, this.f50385s);
                }
            }
            if (tab != null && !TextUtils.isEmpty(tab.f50366d)) {
                setContentDescription(tab.f50366d);
            }
            setSelected(tab != null && tab.mo59068j());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public final void mo59090v() {
            setOrientation(TabLayout.this.f50323R ^ true ? 1 : 0);
            TextView textView = this.f50384p;
            if (textView == null && this.f50385s == null) {
                m69728w(this.f50379c, this.f50380d);
            } else {
                m69728w(textView, this.f50385s);
            }
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {

        /* renamed from: a */
        private final ViewPager f50389a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.f50389a = viewPager;
        }

        /* renamed from: a */
        public void mo30427a(@NonNull Tab tab) {
            this.f50389a.setCurrentItem(tab.mo59065g());
        }

        /* renamed from: b */
        public void mo30428b(Tab tab) {
        }

        /* renamed from: c */
        public void mo30429c(Tab tab) {
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.tabStyle);
    }

    /* renamed from: E */
    private void m69634E(int i) {
        TabView tabView = (TabView) this.f50334d.getChildAt(i);
        this.f50334d.removeViewAt(i);
        if (tabView != null) {
            tabView.mo59083o();
            this.f50344k0.release(tabView);
        }
        requestLayout();
    }

    /* renamed from: M */
    private void m69635M(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f50336e0;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f50341h0;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.f50342i0;
            if (adapterChangeListener != null) {
                this.f50336e0.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.f50333c0;
        if (baseOnTabSelectedListener != null) {
            mo58984D(baseOnTabSelectedListener);
            this.f50333c0 = null;
        }
        if (viewPager != null) {
            this.f50336e0 = viewPager;
            if (this.f50341h0 == null) {
                this.f50341h0 = new TabLayoutOnPageChangeListener(this);
            }
            this.f50341h0.mo59078a();
            viewPager.addOnPageChangeListener(this.f50341h0);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.f50333c0 = viewPagerOnTabSelectedListener;
            mo58997c(viewPagerOnTabSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo58987H(adapter, z);
            }
            if (this.f50342i0 == null) {
                this.f50342i0 = new AdapterChangeListener();
            }
            this.f50342i0.mo59049a(z);
            viewPager.addOnAdapterChangeListener(this.f50342i0);
            mo58988I(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f50336e0 = null;
            mo58987H((PagerAdapter) null, false);
        }
        this.f50343j0 = z2;
    }

    /* renamed from: N */
    private void m69636N() {
        int size = this.f50329a.size();
        for (int i = 0; i < size; i++) {
            this.f50329a.get(i).mo59077s();
        }
    }

    /* renamed from: O */
    private void m69637O(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.f50322Q == 1 && this.f50319N == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.f50329a.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                Tab tab = this.f50329a.get(i);
                if (tab != null && tab.mo59064f() != null && !TextUtils.isEmpty(tab.mo59067i())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f50323R) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f50315J;
        if (i != -1) {
            return i;
        }
        int i2 = this.f50322Q;
        if (i2 == 0 || i2 == 2) {
            return this.f50317L;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f50334d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m69640h(@NonNull TabItem tabItem) {
        Tab z = mo59047z();
        CharSequence charSequence = tabItem.f50301a;
        if (charSequence != null) {
            z.mo59076r(charSequence);
        }
        Drawable drawable = tabItem.f50302c;
        if (drawable != null) {
            z.mo59074p(drawable);
        }
        int i = tabItem.f50303d;
        if (i != 0) {
            z.mo59072n(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            z.mo59071m(tabItem.getContentDescription());
        }
        mo58999e(z);
    }

    /* renamed from: i */
    private void m69641i(@NonNull Tab tab) {
        TabView tabView = tab.f50371i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f50334d.addView(tabView, tab.mo59065g(), m69649q());
    }

    /* renamed from: j */
    private void m69642j(View view) {
        if (view instanceof TabItem) {
            m69640h((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: k */
    private void m69643k(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.f50334d.mo59053d()) {
                mo58988I(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int n = m69646n(i, 0.0f);
            if (scrollX != n) {
                m69654w();
                this.f50335d0.setIntValues(new int[]{scrollX, n});
                this.f50335d0.start();
            }
            this.f50334d.mo59052c(i, this.f50320O);
        }
    }

    /* renamed from: l */
    private void m69644l(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f50334d.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f50334d.setGravity(GravityCompat.START);
    }

    /* renamed from: m */
    private void m69645m() {
        int i;
        int i2 = this.f50322Q;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f50318M - this.f50337f);
        } else {
            i = 0;
        }
        ViewCompat.setPaddingRelative(this.f50334d, i, 0, 0, 0);
        int i3 = this.f50322Q;
        if (i3 == 0) {
            m69644l(this.f50319N);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f50319N == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f50334d.setGravity(1);
        }
        mo58992P(true);
    }

    /* renamed from: n */
    private int m69646n(int i, float f) {
        View childAt;
        int i2 = this.f50322Q;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f50334d.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        View childAt2 = i4 < this.f50334d.getChildCount() ? this.f50334d.getChildAt(i4) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return ViewCompat.getLayoutDirection(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: o */
    private void m69647o(@NonNull Tab tab, int i) {
        tab.mo59075q(i);
        this.f50329a.add(i, tab);
        int size = this.f50329a.size();
        while (true) {
            i++;
            if (i < size) {
                this.f50329a.get(i).mo59075q(i);
            } else {
                return;
            }
        }
    }

    @NonNull
    /* renamed from: p */
    private static ColorStateList m69648p(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @NonNull
    /* renamed from: q */
    private LinearLayout.LayoutParams m69649q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m69637O(layoutParams);
        return layoutParams;
    }

    @NonNull
    /* renamed from: s */
    private TabView m69650s(@NonNull Tab tab) {
        Pools.Pool<TabView> pool = this.f50344k0;
        TabView acquire = pool != null ? pool.acquire() : null;
        if (acquire == null) {
            acquire = new TabView(getContext());
        }
        acquire.setTab(tab);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.f50366d)) {
            acquire.setContentDescription(tab.f50365c);
        } else {
            acquire.setContentDescription(tab.f50366d);
        }
        return acquire;
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f50334d.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f50334d.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: t */
    private void m69651t(@NonNull Tab tab) {
        for (int size = this.f50331b0.size() - 1; size >= 0; size--) {
            this.f50331b0.get(size).mo30429c(tab);
        }
    }

    /* renamed from: u */
    private void m69652u(@NonNull Tab tab) {
        for (int size = this.f50331b0.size() - 1; size >= 0; size--) {
            this.f50331b0.get(size).mo30427a(tab);
        }
    }

    /* renamed from: v */
    private void m69653v(@NonNull Tab tab) {
        for (int size = this.f50331b0.size() - 1; size >= 0; size--) {
            this.f50331b0.get(size).mo30428b(tab);
        }
    }

    /* renamed from: w */
    private void m69654w() {
        if (this.f50335d0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f50335d0 = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.f48522b);
            this.f50335d0.setDuration((long) this.f50320O);
            this.f50335d0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo58981A() {
        int currentItem;
        mo58983C();
        PagerAdapter pagerAdapter = this.f50338f0;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                mo59001g(mo59047z().mo59076r(this.f50338f0.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f50336e0;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo58985F(mo59045x(currentItem));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo58982B(Tab tab) {
        return f50305m0.release(tab);
    }

    /* renamed from: C */
    public void mo58983C() {
        for (int childCount = this.f50334d.getChildCount() - 1; childCount >= 0; childCount--) {
            m69634E(childCount);
        }
        Iterator<Tab> it = this.f50329a.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.mo59069k();
            mo58982B(next);
        }
        this.f50332c = null;
    }

    @Deprecated
    /* renamed from: D */
    public void mo58984D(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.f50331b0.remove(baseOnTabSelectedListener);
    }

    /* renamed from: F */
    public void mo58985F(@Nullable Tab tab) {
        mo58986G(tab, true);
    }

    /* renamed from: G */
    public void mo58986G(@Nullable Tab tab, boolean z) {
        Tab tab2 = this.f50332c;
        if (tab2 != tab) {
            int g = tab != null ? tab.mo59065g() : -1;
            if (z) {
                if ((tab2 == null || tab2.mo59065g() == -1) && g != -1) {
                    mo58988I(g, 0.0f, true);
                } else {
                    m69643k(g);
                }
                if (g != -1) {
                    setSelectedTabView(g);
                }
            }
            this.f50332c = tab;
            if (tab2 != null) {
                m69653v(tab2);
            }
            if (tab != null) {
                m69652u(tab);
            }
        } else if (tab2 != null) {
            m69651t(tab);
            m69643k(tab.mo59065g());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo58987H(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f50338f0;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.f50340g0) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f50338f0 = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f50340g0 == null) {
                this.f50340g0 = new PagerAdapterObserver();
            }
            pagerAdapter.registerDataSetObserver(this.f50340g0);
        }
        mo58981A();
    }

    /* renamed from: I */
    public void mo58988I(int i, float f, boolean z) {
        mo58989J(i, f, z, true);
    }

    /* renamed from: J */
    public void mo58989J(int i, float f, boolean z, boolean z2) {
        int i2;
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f50334d.getChildCount()) {
            if (z2) {
                this.f50334d.mo59055f(i, f);
            }
            ValueAnimator valueAnimator = this.f50335d0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f50335d0.cancel();
            }
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = m69646n(i, f);
            }
            scrollTo(i2, 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: K */
    public void mo58990K(int i, int i2) {
        setTabTextColors(m69648p(i, i2));
    }

    /* renamed from: L */
    public void mo58991L(@Nullable ViewPager viewPager, boolean z) {
        m69635M(viewPager, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo58992P(boolean z) {
        for (int i = 0; i < this.f50334d.getChildCount(); i++) {
            View childAt = this.f50334d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m69637O((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m69642j(view);
    }

    @Deprecated
    /* renamed from: c */
    public void mo58997c(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (!this.f50331b0.contains(baseOnTabSelectedListener)) {
            this.f50331b0.add(baseOnTabSelectedListener);
        }
    }

    /* renamed from: d */
    public void mo58998d(@NonNull OnTabSelectedListener onTabSelectedListener) {
        mo58997c(onTabSelectedListener);
    }

    /* renamed from: e */
    public void mo58999e(@NonNull Tab tab) {
        mo59001g(tab, this.f50329a.isEmpty());
    }

    /* renamed from: f */
    public void mo59000f(@NonNull Tab tab, int i, boolean z) {
        if (tab.f50370h == this) {
            m69647o(tab, i);
            m69641i(tab);
            if (z) {
                tab.mo59070l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: g */
    public void mo59001g(@NonNull Tab tab, boolean z) {
        mo59000f(tab, this.f50329a.size(), z);
    }

    public int getSelectedTabPosition() {
        Tab tab = this.f50332c;
        if (tab != null) {
            return tab.mo59065g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f50329a.size();
    }

    public int getTabGravity() {
        return this.f50319N;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f50306A;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f50326U;
    }

    public int getTabIndicatorGravity() {
        return this.f50321P;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f50314I;
    }

    public int getTabMode() {
        return this.f50322Q;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f50307B;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f50308C;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f50348z;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m69254e(this);
        if (this.f50336e0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m69635M((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f50343j0) {
            setupWithViewPager((ViewPager) null);
            this.f50343j0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(@NonNull Canvas canvas) {
        for (int i = 0; i < this.f50334d.getChildCount(); i++) {
            View childAt = this.f50334d.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m69718j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.m68837d(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f50316K
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.m68837d(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f50314I = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f50322Q
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Tab mo59019r() {
        Tab acquire = f50305m0.acquire();
        return acquire == null ? new Tab() : acquire;
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.m69253d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f50323R != z) {
            this.f50323R = z;
            for (int i = 0; i < this.f50334d.getChildCount(); i++) {
                View childAt = this.f50334d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo59090v();
                }
            }
            m69645m();
        }
    }

    public void setInlineLabelResource(@BoolRes int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m69654w();
        this.f50335d0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (this.f50308C != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f50308C = drawable;
            int i = this.f50325T;
            if (i == -1) {
                i = drawable.getIntrinsicHeight();
            }
            this.f50334d.mo59056g(i);
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f50309D = i;
        mo58992P(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f50321P != i) {
            this.f50321P = i;
            ViewCompat.postInvalidateOnAnimation(this.f50334d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f50325T = i;
        this.f50334d.mo59056g(i);
    }

    public void setTabGravity(int i) {
        if (this.f50319N != i) {
            this.f50319N = i;
            m69645m();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f50306A != colorStateList) {
            this.f50306A = colorStateList;
            m69636N();
        }
    }

    public void setTabIconTintResource(@ColorRes int i) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f50326U = i;
        if (i == 0) {
            this.f50328W = new TabIndicatorInterpolator();
        } else if (i == 1) {
            this.f50328W = new ElasticTabIndicatorInterpolator();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f50324S = z;
        this.f50334d.m69682e();
        ViewCompat.postInvalidateOnAnimation(this.f50334d);
    }

    public void setTabMode(int i) {
        if (i != this.f50322Q) {
            this.f50322Q = i;
            m69645m();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f50307B != colorStateList) {
            this.f50307B = colorStateList;
            for (int i = 0; i < this.f50334d.getChildCount(); i++) {
                View childAt = this.f50334d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m69727u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f50348z != colorStateList) {
            this.f50348z = colorStateList;
            m69636N();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        mo58987H(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f50327V != z) {
            this.f50327V = z;
            for (int i = 0; i < this.f50334d.getChildCount(); i++) {
                View childAt = this.f50334d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m69727u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        mo58991L(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Nullable
    /* renamed from: x */
    public Tab mo59045x(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f50329a.get(i);
    }

    /* renamed from: y */
    public boolean mo59046y() {
        return this.f50324S;
    }

    @NonNull
    /* renamed from: z */
    public Tab mo59047z() {
        Tab r = mo59019r();
        r.f50370h = this;
        r.f50371i = m69650s(r);
        if (r.f50372j != -1) {
            r.f50371i.setId(r.f50372j);
        }
        return r;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = f50304l0
            android.content.Context r12 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f50329a = r12
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r11.f50308C = r12
            r12 = 0
            r11.f50309D = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.f50314I = r0
            r6 = -1
            r11.f50325T = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f50331b0 = r0
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r1 = 12
            r0.<init>(r1)
            r11.f50344k0 = r0
            android.content.Context r7 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$SlidingTabIndicator r8 = new com.google.android.material.tabs.TabLayout$SlidingTabIndicator
            r8.<init>(r7)
            r11.f50334d = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r6)
            super.addView(r8, r12, r0)
            int[] r2 = com.google.android.material.C10462R.styleable.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = com.google.android.material.C10462R.styleable.TabLayout_tabTextAppearance
            r5[r12] = r10
            r0 = r7
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x0084
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo58656a0(r14)
            r0.mo58649P(r7)
            float r14 = androidx.core.view.ViewCompat.getElevation(r11)
            r0.mo58655Z(r14)
            androidx.core.view.ViewCompat.setBackground(r11, r0)
        L_0x0084:
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r14 = com.google.android.material.resources.MaterialResources.m69124d(r7, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIndicatorColor
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIndicatorHeight
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r8.mo59056g(r14)
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIndicatorAnimationMode
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f50346p = r14
            r11.f50345o = r14
            r11.f50339g = r14
            r11.f50337f = r14
            int r0 = com.google.android.material.C10462R.styleable.TabLayout_tabPaddingStart
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.f50337f = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabPaddingTop
            int r0 = r11.f50339g
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f50339g = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabPaddingEnd
            int r0 = r11.f50345o
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f50345o = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabPaddingBottom
            int r0 = r11.f50346p
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f50346p = r14
            int r14 = com.google.android.material.C10462R.style.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.f50347s = r14
            int[] r0 = androidx.appcompat.C0146R.styleable.TextAppearance
            android.content.res.TypedArray r14 = r7.obtainStyledAttributes(r14, r0)
            int r0 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textSize     // Catch:{ all -> 0x01b9 }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01b9 }
            float r0 = (float) r0     // Catch:{ all -> 0x01b9 }
            r11.f50311F = r0     // Catch:{ all -> 0x01b9 }
            int r0 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textColor     // Catch:{ all -> 0x01b9 }
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.m69121a(r7, r14, r0)     // Catch:{ all -> 0x01b9 }
            r11.f50348z = r0     // Catch:{ all -> 0x01b9 }
            r14.recycle()
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x011e
            android.content.res.ColorStateList r14 = com.google.android.material.resources.MaterialResources.m69121a(r7, r13, r14)
            r11.f50348z = r14
        L_0x011e:
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabSelectedTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0136
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.f50348z
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = m69648p(r0, r14)
            r11.f50348z = r14
        L_0x0136:
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = com.google.android.material.resources.MaterialResources.m69121a(r7, r13, r14)
            r11.f50306A = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r6)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.google.android.material.internal.ViewUtils.m68843j(r14, r0)
            r11.f50310E = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabRippleColor
            android.content.res.ColorStateList r14 = com.google.android.material.resources.MaterialResources.m69121a(r7, r13, r14)
            r11.f50307B = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.f50320O = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabMinWidth
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f50315J = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabMaxWidth
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f50316K = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabBackground
            int r14 = r13.getResourceId(r14, r12)
            r11.f50313H = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabContentStart
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f50318M = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabMode
            int r14 = r13.getInt(r14, r9)
            r11.f50322Q = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabGravity
            int r14 = r13.getInt(r14, r12)
            r11.f50319N = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabInlineLabel
            boolean r14 = r13.getBoolean(r14, r12)
            r11.f50323R = r14
            int r14 = com.google.android.material.C10462R.styleable.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r14, r12)
            r11.f50327V = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = com.google.android.material.C10462R.dimen.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f50312G = r13
            int r13 = com.google.android.material.C10462R.dimen.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.f50317L = r12
            r11.m69645m()
            return
        L_0x01b9:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addView(View view, int i) {
        m69642j(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.f50330a0;
        if (baseOnTabSelectedListener2 != null) {
            mo58984D(baseOnTabSelectedListener2);
        }
        this.f50330a0 = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            mo58997c(baseOnTabSelectedListener);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m69642j(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m69642j(view);
    }

    public void setSelectedTabIndicator(@DrawableRes int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
