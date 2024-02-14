package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: U */
    private static final int f48592U = C10462R.style.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    private final Rect f48593A;
    @NonNull

    /* renamed from: B */
    final CollapsingTextHelper f48594B;
    @NonNull

    /* renamed from: C */
    final ElevationOverlayProvider f48595C;

    /* renamed from: D */
    private boolean f48596D;

    /* renamed from: E */
    private boolean f48597E;
    @Nullable

    /* renamed from: F */
    private Drawable f48598F;
    @Nullable

    /* renamed from: G */
    Drawable f48599G;

    /* renamed from: H */
    private int f48600H;

    /* renamed from: I */
    private boolean f48601I;

    /* renamed from: J */
    private ValueAnimator f48602J;

    /* renamed from: K */
    private long f48603K;

    /* renamed from: L */
    private int f48604L;

    /* renamed from: M */
    private AppBarLayout.OnOffsetChangedListener f48605M;

    /* renamed from: N */
    int f48606N;

    /* renamed from: O */
    private int f48607O;
    @Nullable

    /* renamed from: P */
    WindowInsetsCompat f48608P;

    /* renamed from: Q */
    private int f48609Q;

    /* renamed from: R */
    private boolean f48610R;

    /* renamed from: S */
    private int f48611S;

    /* renamed from: T */
    private boolean f48612T;

    /* renamed from: a */
    private boolean f48613a;

    /* renamed from: c */
    private int f48614c;
    @Nullable

    /* renamed from: d */
    private ViewGroup f48615d;
    @Nullable

    /* renamed from: f */
    private View f48616f;

    /* renamed from: g */
    private View f48617g;

    /* renamed from: o */
    private int f48618o;

    /* renamed from: p */
    private int f48619p;

    /* renamed from: s */
    private int f48620s;

    /* renamed from: z */
    private int f48621z;

    private class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        OffsetUpdateListener() {
        }

        /* renamed from: a */
        public void mo56687a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f48606N = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f48608P;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper j = CollapsingToolbarLayout.m67357j(childAt);
                int i3 = layoutParams.f48624a;
                if (i3 == 1) {
                    j.mo56800f(MathUtils.clamp(-i, 0, CollapsingToolbarLayout.this.mo56731h(childAt)));
                } else if (i3 == 2) {
                    j.mo56800f(Math.round(((float) (-i)) * layoutParams.f48625b));
                }
            }
            CollapsingToolbarLayout.this.mo56775u();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f48599G != null && systemWindowInsetTop > 0) {
                ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int minimumHeight = (height - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this)) - systemWindowInsetTop;
            float f = (float) minimumHeight;
            CollapsingToolbarLayout.this.f48594B.mo58089s0(Math.min(1.0f, ((float) (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger())) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f48594B.mo58074g0(collapsingToolbarLayout3.f48606N + minimumHeight);
            CollapsingToolbarLayout.this.f48594B.mo58086q0(((float) Math.abs(i)) / f);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.collapsingToolbarLayoutStyle);
    }

    /* renamed from: a */
    private void m67351a(int i) {
        m67353c();
        ValueAnimator valueAnimator = this.f48602J;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f48602J = valueAnimator2;
            valueAnimator2.setInterpolator(i > this.f48600H ? AnimationUtils.f48523c : AnimationUtils.f48524d);
            this.f48602J.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.f48602J.cancel();
        }
        this.f48602J.setDuration(this.f48603K);
        this.f48602J.setIntValues(new int[]{this.f48600H, i});
        this.f48602J.start();
    }

    /* renamed from: b */
    private void m67352b(AppBarLayout appBarLayout) {
        if (m67358k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m67353c() {
        /*
            r6 = this;
            boolean r0 = r6.f48613a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f48615d = r0
            r6.f48616f = r0
            int r1 = r6.f48614c
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f48615d = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.m67354d(r1)
            r6.f48616f = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.f48615d
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = m67359l(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.f48615d = r0
        L_0x003e:
            r6.m67365t()
            r6.f48613a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.m67353c():void");
    }

    @NonNull
    /* renamed from: d */
    private View m67354d(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: g */
    private static int m67355g(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: i */
    private static CharSequence m67356i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    /* renamed from: j */
    static ViewOffsetHelper m67357j(@NonNull View view) {
        int i = C10462R.C10465id.view_offset_helper;
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(i);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(i, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    /* renamed from: k */
    private boolean m67358k() {
        return this.f48607O == 1;
    }

    /* renamed from: l */
    private static boolean m67359l(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    /* renamed from: m */
    private boolean m67360m(View view) {
        View view2 = this.f48616f;
        if (view2 == null || view2 == this) {
            if (view == this.f48615d) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m67361p(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.f48616f;
        if (view == null) {
            view = this.f48615d;
        }
        int h = mo56731h(view);
        DescendantOffsetUtils.m68712a(this, this.f48617g, this.f48593A);
        ViewGroup viewGroup = this.f48615d;
        int i4 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i4 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i = toolbar.getTitleMarginTop();
            i3 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i4 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i = toolbar2.getTitleMarginTop();
            i3 = toolbar2.getTitleMarginBottom();
        }
        CollapsingTextHelper collapsingTextHelper = this.f48594B;
        Rect rect = this.f48593A;
        int i5 = rect.left + (z ? i2 : i4);
        int i6 = rect.top + h + i;
        int i7 = rect.right;
        if (!z) {
            i4 = i2;
        }
        collapsingTextHelper.mo58068Y(i5, i6, i7 - i4, (rect.bottom + h) - i3);
    }

    /* renamed from: q */
    private void m67362q() {
        setContentDescription(getTitle());
    }

    /* renamed from: r */
    private void m67363r(@NonNull Drawable drawable, int i, int i2) {
        m67364s(drawable, this.f48615d, i, i2);
    }

    /* renamed from: s */
    private void m67364s(@NonNull Drawable drawable, @Nullable View view, int i, int i2) {
        if (m67358k() && view != null && this.f48596D) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: t */
    private void m67365t() {
        View view;
        if (!this.f48596D && (view = this.f48617g) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f48617g);
            }
        }
        if (this.f48596D && this.f48615d != null) {
            if (this.f48617g == null) {
                this.f48617g = new View(getContext());
            }
            if (this.f48617g.getParent() == null) {
                this.f48615d.addView(this.f48617g, -1, -1);
            }
        }
    }

    /* renamed from: v */
    private void m67366v(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (this.f48596D && (view = this.f48617g) != null) {
            boolean z2 = false;
            boolean z3 = ViewCompat.isAttachedToWindow(view) && this.f48617g.getVisibility() == 0;
            this.f48597E = z3;
            if (z3 || z) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    z2 = true;
                }
                m67361p(z2);
                this.f48594B.mo58075h0(z2 ? this.f48620s : this.f48618o, this.f48593A.top + this.f48619p, (i3 - i) - (z2 ? this.f48618o : this.f48620s), (i4 - i2) - this.f48621z);
                this.f48594B.mo58067W(z);
            }
        }
    }

    /* renamed from: w */
    private void m67367w() {
        if (this.f48615d != null && this.f48596D && TextUtils.isEmpty(this.f48594B.mo58063L())) {
            setTitle(m67356i(this.f48615d));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m67353c();
        if (this.f48615d == null && (drawable = this.f48598F) != null && this.f48600H > 0) {
            drawable.mutate().setAlpha(this.f48600H);
            this.f48598F.draw(canvas);
        }
        if (this.f48596D && this.f48597E) {
            if (this.f48615d == null || this.f48598F == null || this.f48600H <= 0 || !m67358k() || this.f48594B.mo58054D() >= this.f48594B.mo58056E()) {
                this.f48594B.mo58078l(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f48598F.getBounds(), Region.Op.DIFFERENCE);
                this.f48594B.mo58078l(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f48599G != null && this.f48600H > 0) {
            WindowInsetsCompat windowInsetsCompat = this.f48608P;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.f48599G.setBounds(0, -this.f48606N, getWidth(), systemWindowInsetTop - this.f48606N);
                this.f48599G.mutate().setAlpha(this.f48600H);
                this.f48599G.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f48598F == null || this.f48600H <= 0 || !m67360m(view)) {
            z = false;
        } else {
            m67364s(this.f48598F, view, getWidth(), getHeight());
            this.f48598F.mutate().setAlpha(this.f48600H);
            this.f48598F.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f48599G;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f48598F;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.f48594B;
        if (collapsingTextHelper != null) {
            z |= collapsingTextHelper.mo58049A0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f48594B.mo58085q();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.f48594B.mo58091u();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f48598F;
    }

    public int getExpandedTitleGravity() {
        return this.f48594B.mo58048A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f48621z;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f48620s;
    }

    public int getExpandedTitleMarginStart() {
        return this.f48618o;
    }

    public int getExpandedTitleMarginTop() {
        return this.f48619p;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.f48594B.mo58052C();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f48594B.mo58057F();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f48594B.mo58058G();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f48594B.mo58059H();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f48594B.mo58060I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f48594B.mo58061J();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.f48600H;
    }

    public long getScrimAnimationDuration() {
        return this.f48603K;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f48604L;
        if (i >= 0) {
            return i + this.f48609Q + this.f48611S;
        }
        WindowInsetsCompat windowInsetsCompat = this.f48608P;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight());
        }
        return getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f48599G;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f48596D) {
            return this.f48594B.mo58063L();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f48607O;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f48594B.mo58062K();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo56731h(@NonNull View view) {
        return ((getHeight() - m67357j(view).mo56796b()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public WindowInsetsCompat mo56732n(@NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.f48608P, windowInsetsCompat2)) {
            this.f48608P = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    /* renamed from: o */
    public void mo56733o(boolean z, boolean z2) {
        if (this.f48601I != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m67351a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f48601I = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m67352b(appBarLayout);
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.f48605M == null) {
                this.f48605M = new OffsetUpdateListener();
            }
            appBarLayout.mo56611d(this.f48605M);
            ViewCompat.requestApplyInsets(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.f48605M;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo56641r(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.f48608P;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m67357j(getChildAt(i6)).mo56798d();
        }
        m67366v(i, i2, i3, i4, false);
        m67367w();
        mo56775u();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m67357j(getChildAt(i7)).mo56795a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m67353c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.f48608P;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if ((mode == 0 || this.f48610R) && systemWindowInsetTop > 0) {
            this.f48609Q = systemWindowInsetTop;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, BasicMeasure.EXACTLY));
        }
        if (this.f48612T && this.f48594B.mo58061J() > 1) {
            m67367w();
            m67366v(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int y = this.f48594B.mo58096y();
            if (y > 1) {
                this.f48611S = Math.round(this.f48594B.mo58098z()) * (y - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f48611S, BasicMeasure.EXACTLY));
            }
        }
        ViewGroup viewGroup = this.f48615d;
        if (viewGroup != null) {
            View view = this.f48616f;
            if (view == null || view == this) {
                setMinimumHeight(m67355g(viewGroup));
            } else {
                setMinimumHeight(m67355g(view));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f48598F;
        if (drawable != null) {
            m67363r(drawable, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f48594B.mo58072d0(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.f48594B.mo58070a0(i);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.f48594B.mo58073e0(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f48598F;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f48598F = drawable3;
            if (drawable3 != null) {
                m67363r(drawable3, getWidth(), getHeight());
                this.f48598F.setCallback(this);
                this.f48598F.setAlpha(this.f48600H);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i));
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f48594B.mo58080m0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f48621z = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f48620s = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f48618o = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f48619p = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.f48594B.mo58077j0(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f48594B.mo58079l0(colorStateList);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.f48594B.mo58083o0(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f48612T = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f48610R = z;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.f48594B.mo58090t0(i);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.f48594B.mo58093v0(f);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.f48594B.mo58094w0(f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        this.f48594B.mo58095x0(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f48594B.mo58099z0(z);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f48600H) {
            if (!(this.f48598F == null || (viewGroup = this.f48615d) == null)) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.f48600H = i;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j) {
        this.f48603K = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i) {
        if (this.f48604L != i) {
            this.f48604L = i;
            mo56775u();
        }
    }

    public void setScrimsShown(boolean z) {
        mo56733o(z, ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f48599G;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f48599G = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f48599G.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f48599G, ViewCompat.getLayoutDirection(this));
                this.f48599G.setVisible(getVisibility() == 0, false);
                this.f48599G.setCallback(this);
                this.f48599G.setAlpha(this.f48600H);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f48594B.mo58051B0(charSequence);
        m67362q();
    }

    public void setTitleCollapseMode(int i) {
        this.f48607O = i;
        boolean k = m67358k();
        this.f48594B.mo58088r0(k);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m67352b((AppBarLayout) parent);
        }
        if (k && this.f48598F == null) {
            setContentScrimColor(this.f48595C.mo57761d(getResources().getDimension(C10462R.dimen.design_appbar_elevation)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f48596D) {
            this.f48596D = z;
            m67362q();
            m67365t();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f48594B.mo58097y0(timeInterpolator);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f48599G;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f48599G.setVisible(z, false);
        }
        Drawable drawable2 = this.f48598F;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f48598F.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo56775u() {
        if (this.f48598F != null || this.f48599G != null) {
            setScrimsShown(getHeight() + this.f48606N < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f48598F || drawable == this.f48599G;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f48592U
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = 1
            r10.f48613a = r11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f48593A = r0
            r6 = -1
            r10.f48604L = r6
            r7 = 0
            r10.f48609Q = r7
            r10.f48611S = r7
            android.content.Context r8 = r10.getContext()
            com.google.android.material.internal.CollapsingTextHelper r9 = new com.google.android.material.internal.CollapsingTextHelper
            r9.<init>(r10)
            r10.f48594B = r9
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.f48525e
            r9.mo58053C0(r0)
            r9.mo58099z0(r7)
            com.google.android.material.elevation.ElevationOverlayProvider r0 = new com.google.android.material.elevation.ElevationOverlayProvider
            r0.<init>(r8)
            r10.f48595C = r0
            int[] r2 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo58080m0(r13)
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo58072d0(r13)
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_expandedTitleMargin
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f48621z = r13
            r10.f48620s = r13
            r10.f48619p = r13
            r10.f48618o = r13
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0074
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f48618o = r13
        L_0x0074:
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0082
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f48620s = r13
        L_0x0082:
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0090
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f48619p = r13
        L_0x0090:
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x009e
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f48621z = r13
        L_0x009e:
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_titleEnabled
            boolean r13 = r12.getBoolean(r13, r11)
            r10.f48596D = r13
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_title
            java.lang.CharSequence r13 = r12.getText(r13)
            r10.setTitle(r13)
            int r13 = com.google.android.material.C10462R.style.TextAppearance_Design_CollapsingToolbar_Expanded
            r9.mo58077j0(r13)
            int r13 = androidx.appcompat.C0146R.style.TextAppearance_AppCompat_Widget_ActionBar_Title
            r9.mo58070a0(r13)
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00c8
            int r13 = r12.getResourceId(r13, r7)
            r9.mo58077j0(r13)
        L_0x00c8:
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00d7
            int r13 = r12.getResourceId(r13, r7)
            r9.mo58070a0(r13)
        L_0x00d7:
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_expandedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00e6
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.m69121a(r8, r12, r13)
            r9.mo58079l0(r13)
        L_0x00e6:
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00f5
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.m69121a(r8, r12, r13)
            r9.mo58071c0(r13)
        L_0x00f5:
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r13 = r12.getDimensionPixelSize(r13, r6)
            r10.f48604L = r13
            int r13 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_maxLines
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x010c
            int r11 = r12.getInt(r13, r11)
            r9.mo58095x0(r11)
        L_0x010c:
            int r11 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_titlePositionInterpolator
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L_0x011f
            int r11 = r12.getResourceId(r11, r7)
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r8, r11)
            r9.mo58097y0(r11)
        L_0x011f:
            int r11 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_scrimAnimationDuration
            r13 = 600(0x258, float:8.41E-43)
            int r11 = r12.getInt(r11, r13)
            long r0 = (long) r11
            r10.f48603K = r0
            int r11 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setContentScrim(r11)
            int r11 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarScrim(r11)
            int r11 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_titleCollapseMode
            int r11 = r12.getInt(r11, r7)
            r10.setTitleCollapseMode(r11)
            int r11 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_toolbarId
            int r11 = r12.getResourceId(r11, r6)
            r10.f48614c = r11
            int r11 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f48610R = r11
            int r11 = com.google.android.material.C10462R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f48612T = r11
            r12.recycle()
            r10.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$1 r11 = new com.google.android.material.appbar.CollapsingToolbarLayout$1
            r11.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f48594B.mo58071c0(colorStateList);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f48624a = 0;

        /* renamed from: b */
        float f48625b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.CollapsingToolbarLayout_Layout);
            this.f48624a = obtainStyledAttributes.getInt(C10462R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            mo56778a(obtainStyledAttributes.getFloat(C10462R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo56778a(float f) {
            this.f48625b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
