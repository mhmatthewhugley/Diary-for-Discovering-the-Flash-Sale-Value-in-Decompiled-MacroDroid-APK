package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C10462R;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: N */
    private static final int f48720N = C10462R.style.Widget_MaterialComponents_BottomAppBar;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final boolean f48721A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final boolean f48722B;

    /* renamed from: C */
    private int f48723C;

    /* renamed from: D */
    private ArrayList<AnimationListener> f48724D;
    /* access modifiers changed from: private */
    @MenuRes

    /* renamed from: E */
    public int f48725E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f48726F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f48727G;

    /* renamed from: H */
    private Behavior f48728H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f48729I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f48730J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f48731K;
    @NonNull

    /* renamed from: L */
    AnimatorListenerAdapter f48732L;
    @NonNull

    /* renamed from: M */
    TransformationCallback<FloatingActionButton> f48733M;
    @Nullable

    /* renamed from: a */
    private Integer f48734a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f48735c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MaterialShapeDrawable f48736d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public Animator f48737f;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: g */
    public Animator f48738g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f48739o;

    /* renamed from: p */
    private int f48740p;

    /* renamed from: s */
    private boolean f48741s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final boolean f48742z;

    interface AnimationListener {
        /* renamed from: a */
        void mo56894a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo56895b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    static class SavedState extends AbsSavedState {
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
        int f48766a;

        /* renamed from: c */
        boolean f48767c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f48766a);
            parcel.writeInt(this.f48767c ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f48766a = parcel.readInt();
            this.f48767c = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.bottomAppBarStyle);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m67520H(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.mo57861e(this.f48732L);
        floatingActionButton.mo57862f(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                BottomAppBar.this.f48732L.onAnimationStart(animator);
                FloatingActionButton r = BottomAppBar.this.m67526O();
                if (r != null) {
                    r.setTranslationX(BottomAppBar.this.getFabTranslationX());
                }
            }
        });
        floatingActionButton.mo57863g(this.f48733M);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m67521I() {
        Animator animator = this.f48738g;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f48737f;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: K */
    private void m67522K(int i, @NonNull List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m67526O(), "translationX", new float[]{m67528R(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: L */
    private void m67523L(final int i, final boolean z, @NonNull List<Animator> list) {
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo56858Q(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a */
                    public boolean f48751a;

                    public void onAnimationCancel(Animator animator) {
                        this.f48751a = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        if (!this.f48751a) {
                            boolean z = BottomAppBar.this.f48725E != 0;
                            BottomAppBar bottomAppBar = BottomAppBar.this;
                            bottomAppBar.mo56859W(bottomAppBar.f48725E);
                            BottomAppBar.this.m67539c0(actionMenuView, i, z, z);
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m67524M() {
        ArrayList<AnimationListener> arrayList;
        int i = this.f48723C - 1;
        this.f48723C = i;
        if (i == 0 && (arrayList = this.f48724D) != null) {
            Iterator<AnimationListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo56894a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m67525N() {
        ArrayList<AnimationListener> arrayList;
        int i = this.f48723C;
        this.f48723C = i + 1;
        if (i == 0 && (arrayList = this.f48724D) != null) {
            Iterator<AnimationListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo56895b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: O */
    public FloatingActionButton m67526O() {
        View P = m67527P();
        if (P instanceof FloatingActionButton) {
            return (FloatingActionButton) P;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    @androidx.annotation.Nullable
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m67527P() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.getDependents(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m67527P():android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public float m67528R(int i) {
        boolean i2 = ViewUtils.m68842i(this);
        int i3 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f48735c + (i2 ? this.f48731K : this.f48730J));
        if (i2) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    /* renamed from: S */
    private boolean m67529S() {
        FloatingActionButton O = m67526O();
        return O != null && O.mo57892p();
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m67530T(int i, boolean z) {
        if (!ViewCompat.isLaidOut(this)) {
            this.f48726F = false;
            mo56859W(this.f48725E);
            return;
        }
        Animator animator = this.f48738g;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m67529S()) {
            i = 0;
            z = false;
        }
        m67523L(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f48738g = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                BottomAppBar.this.m67524M();
                boolean unused = BottomAppBar.this.f48726F = false;
                Animator unused2 = BottomAppBar.this.f48738g = null;
            }

            public void onAnimationStart(Animator animator) {
                BottomAppBar.this.m67525N();
            }
        });
        this.f48738g.start();
    }

    /* renamed from: U */
    private void m67531U(int i) {
        if (this.f48739o != i && ViewCompat.isLaidOut(this)) {
            Animator animator = this.f48737f;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f48740p == 1) {
                m67522K(i, arrayList);
            } else {
                mo56857J(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f48737f = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.m67524M();
                    Animator unused = BottomAppBar.this.f48737f = null;
                }

                public void onAnimationStart(Animator animator) {
                    BottomAppBar.this.m67525N();
                }
            });
            this.f48737f.start();
        }
    }

    @Nullable
    /* renamed from: V */
    private Drawable m67532V(@Nullable Drawable drawable) {
        if (drawable == null || this.f48734a == null) {
            return drawable;
        }
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(wrap, this.f48734a.intValue());
        return wrap;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m67533X() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f48738g == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m67529S()) {
                m67537b0(actionMenuView, 0, false);
            } else {
                m67537b0(actionMenuView, this.f48739o, this.f48727G);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m67534Y() {
        getTopEdgeTreatment().mo56917q(getFabTranslationX());
        View P = m67527P();
        this.f48736d.mo58657b0((!this.f48727G || !m67529S()) ? 0.0f : 1.0f);
        if (P != null) {
            P.setTranslationY(getFabTranslationY());
            P.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: b0 */
    private void m67537b0(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        m67539c0(actionMenuView, i, z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m67539c0(@NonNull final ActionMenuView actionMenuView, final int i, final boolean z, boolean z2) {
        C104918 r0 = new Runnable() {
            public void run() {
                ActionMenuView actionMenuView = actionMenuView;
                actionMenuView.setTranslationX((float) BottomAppBar.this.mo56858Q(actionMenuView, i, z));
            }
        };
        if (z2) {
            actionMenuView.post(r0);
        } else {
            r0.run();
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f48729I;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m67528R(this.f48739o);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo56906c();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f48731K;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f48730J;
    }

    /* access modifiers changed from: private */
    @NonNull
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.f48736d.getShapeAppearanceModel().mo58701p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo56857J(final int i, List<Animator> list) {
        FloatingActionButton O = m67526O();
        if (O != null && !O.mo57885o()) {
            m67525N();
            O.mo57883m(new FloatingActionButton.OnVisibilityChangedListener() {
                /* renamed from: a */
                public void mo56886a(@NonNull FloatingActionButton floatingActionButton) {
                    floatingActionButton.setTranslationX(BottomAppBar.this.m67528R(i));
                    floatingActionButton.mo57927u(new FloatingActionButton.OnVisibilityChangedListener() {
                        /* renamed from: b */
                        public void mo56887b(FloatingActionButton floatingActionButton) {
                            BottomAppBar.this.m67524M();
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public int mo56858Q(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean i2 = ViewUtils.m68842i(this);
        int measuredWidth = i2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                if (i2) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((i2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (i2 ? this.f48730J : -this.f48731K));
    }

    /* renamed from: W */
    public void mo56859W(@MenuRes int i) {
        if (i != 0) {
            this.f48725E = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    /* renamed from: Z */
    public void mo56860Z(int i, @MenuRes int i2) {
        this.f48725E = i2;
        this.f48726F = true;
        m67530T(i, this.f48727G);
        m67531U(i);
        this.f48739o = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean mo56861a0(@C0144Px int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo56910g()) {
            return false;
        }
        getTopEdgeTreatment().mo56916p(f);
        this.f48736d.invalidateSelf();
        return true;
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.f48736d.mo58644H();
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo56906c();
    }

    public int getFabAlignmentMode() {
        return this.f48739o;
    }

    public int getFabAnimationMode() {
        return this.f48740p;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo56908e();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo56909f();
    }

    public boolean getHideOnScroll() {
        return this.f48741s;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m69255f(this, this.f48736d);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m67521I();
            m67534Y();
        }
        m67533X();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f48739o = savedState.f48766a;
        this.f48727G = savedState.f48767c;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f48766a = this.f48739o;
        savedState.f48767c = this.f48727G;
        return savedState;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.f48736d, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo56912k(f);
            this.f48736d.invalidateSelf();
            m67534Y();
        }
    }

    public void setElevation(float f) {
        this.f48736d.mo58655Z(f);
        getBehavior().mo56843e(this, this.f48736d.mo58641D() - this.f48736d.mo58640C());
    }

    public void setFabAlignmentMode(int i) {
        mo56860Z(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f48740p = i;
    }

    /* access modifiers changed from: package-private */
    public void setFabCornerSize(@Dimension float f) {
        if (f != getTopEdgeTreatment().mo56907d()) {
            getTopEdgeTreatment().mo56913l(f);
            this.f48736d.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo56914n(f);
            this.f48736d.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo56915o(f);
            this.f48736d.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f48741s = z;
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(m67532V(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f48734a = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f48720N
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.shape.MaterialShapeDrawable r11 = new com.google.android.material.shape.MaterialShapeDrawable
            r11.<init>()
            r10.f48736d = r11
            r7 = 0
            r10.f48723C = r7
            r10.f48725E = r7
            r10.f48726F = r7
            r0 = 1
            r10.f48727G = r0
            com.google.android.material.bottomappbar.BottomAppBar$1 r0 = new com.google.android.material.bottomappbar.BottomAppBar$1
            r0.<init>()
            r10.f48732L = r0
            com.google.android.material.bottomappbar.BottomAppBar$2 r0 = new com.google.android.material.bottomappbar.BottomAppBar$2
            r0.<init>()
            r10.f48733M = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C10462R.styleable.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.m69121a(r8, r0, r1)
            int r2 = com.google.android.material.C10462R.styleable.BottomAppBar_navigationIconTint
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x004e
            r3 = -1
            int r2 = r0.getColor(r2, r3)
            r10.setNavigationIconTint(r2)
        L_0x004e:
            int r2 = com.google.android.material.C10462R.styleable.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = com.google.android.material.C10462R.styleable.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = com.google.android.material.C10462R.styleable.BottomAppBar_fabCradleRoundedCornerRadius
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = com.google.android.material.C10462R.styleable.BottomAppBar_fabCradleVerticalOffset
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = com.google.android.material.C10462R.styleable.BottomAppBar_fabAlignmentMode
            int r9 = r0.getInt(r9, r7)
            r10.f48739o = r9
            int r9 = com.google.android.material.C10462R.styleable.BottomAppBar_fabAnimationMode
            int r9 = r0.getInt(r9, r7)
            r10.f48740p = r9
            int r9 = com.google.android.material.C10462R.styleable.BottomAppBar_hideOnScroll
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f48741s = r9
            int r9 = com.google.android.material.C10462R.styleable.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f48742z = r9
            int r9 = com.google.android.material.C10462R.styleable.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f48721A = r9
            int r9 = com.google.android.material.C10462R.styleable.BottomAppBar_paddingRightSystemWindowInsets
            boolean r7 = r0.getBoolean(r9, r7)
            r10.f48722B = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = com.google.android.material.C10462R.dimen.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.f48735c = r0
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = new com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment
            r0.<init>(r3, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = com.google.android.material.shape.ShapeAppearanceModel.m69260a()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r3.mo58712B(r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.mo58721m()
            r11.setShapeAppearanceModel(r0)
            r0 = 2
            r11.mo58668i0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.mo58659d0(r0)
            r11.mo58649P(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r11, r1)
            androidx.core.view.ViewCompat.setBackground(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$3 r11 = new com.google.android.material.bottomappbar.BottomAppBar$3
            r11.<init>()
            com.google.android.material.internal.ViewUtils.m68835b(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @NonNull
    public Behavior getBehavior() {
        if (this.f48728H == null) {
            this.f48728H = new Behavior();
        }
        return this.f48728H;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final Rect f48761e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f48762f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f48763g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f48764h = new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f48762f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo57880j(Behavior.this.f48761e);
                int height = Behavior.this.f48761e.height();
                bottomAppBar.mo56861a0(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().mo58703r().mo58627a(new RectF(Behavior.this.f48761e)));
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (Behavior.this.f48763g == 0) {
                    layoutParams.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C10462R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    layoutParams.leftMargin = bottomAppBar.getLeftInset();
                    layoutParams.rightMargin = bottomAppBar.getRightInset();
                    if (ViewUtils.m68842i(floatingActionButton)) {
                        layoutParams.leftMargin += bottomAppBar.f48735c;
                    } else {
                        layoutParams.rightMargin += bottomAppBar.f48735c;
                    }
                }
            }
        };

        public Behavior() {
        }

        /* renamed from: m */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i) {
            this.f48762f = new WeakReference<>(bottomAppBar);
            View y = bottomAppBar.m67527P();
            if (y != null && !ViewCompat.isLaidOut(y)) {
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) y.getLayoutParams();
                layoutParams.anchorGravity = 49;
                this.f48763g = layoutParams.bottomMargin;
                if (y instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) y;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C10462R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C10462R.animator.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f48764h);
                    bottomAppBar.m67520H(floatingActionButton);
                }
                bottomAppBar.m67534Y();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: n */
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
