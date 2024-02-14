package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: V */
    private static final int f49343V = C10462R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: W */
    static final Property<View, Float> f49344W;

    /* renamed from: a0 */
    static final Property<View, Float> f49345a0;

    /* renamed from: b0 */
    static final Property<View, Float> f49346b0;

    /* renamed from: c0 */
    static final Property<View, Float> f49347c0;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f49348H;

    /* renamed from: I */
    private final AnimatorTracker f49349I;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: J */
    public final MotionStrategy f49350J;
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: K */
    public final MotionStrategy f49351K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final MotionStrategy f49352L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final MotionStrategy f49353M;

    /* renamed from: N */
    private final int f49354N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f49355O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f49356P;
    @NonNull

    /* renamed from: Q */
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f49357Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f49358R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f49359S;

    /* renamed from: T */
    private boolean f49360T;
    @NonNull

    /* renamed from: U */
    protected ColorStateList f49361U;

    class ChangeSizeStrategy extends BaseMotionStrategy {

        /* renamed from: g */
        private final Size f49368g;

        /* renamed from: h */
        private final boolean f49369h;

        ChangeSizeStrategy(AnimatorTracker animatorTracker, Size size, boolean z) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
            this.f49368g = size;
            this.f49369h = z;
        }

        /* renamed from: a */
        public void mo57847a() {
            boolean unused = ExtendedFloatingActionButton.this.f49358R = this.f49369h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f49368g.getLayoutParams().width;
                layoutParams.height = this.f49368g.getLayoutParams().height;
                ViewCompat.setPaddingRelative(ExtendedFloatingActionButton.this, this.f49368g.mo57824b(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f49368g.mo57823a(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: c */
        public boolean mo57848c() {
            return this.f49369h == ExtendedFloatingActionButton.this.f49358R || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        /* renamed from: e */
        public int mo57849e() {
            return this.f49369h ? C10462R.animator.mtrl_extended_fab_change_size_expand_motion_spec : C10462R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        /* renamed from: f */
        public void mo57774f() {
            super.mo57774f();
            boolean unused = ExtendedFloatingActionButton.this.f49359S = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f49368g.getLayoutParams().width;
                layoutParams.height = this.f49368g.getLayoutParams().height;
            }
        }

        @NonNull
        /* renamed from: h */
        public AnimatorSet mo57776h() {
            MotionSpec m = mo57779m();
            if (m.mo56593j("width")) {
                PropertyValuesHolder[] g = m.mo56589g("width");
                g[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f49368g.getWidth()});
                m.mo56595l("width", g);
            }
            if (m.mo56593j("height")) {
                PropertyValuesHolder[] g2 = m.mo56589g("height");
                g2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f49368g.getHeight()});
                m.mo56595l("height", g2);
            }
            if (m.mo56593j("paddingStart")) {
                PropertyValuesHolder[] g3 = m.mo56589g("paddingStart");
                g3[0].setFloatValues(new float[]{(float) ViewCompat.getPaddingStart(ExtendedFloatingActionButton.this), (float) this.f49368g.mo57824b()});
                m.mo56595l("paddingStart", g3);
            }
            if (m.mo56593j("paddingEnd")) {
                PropertyValuesHolder[] g4 = m.mo56589g("paddingEnd");
                g4[0].setFloatValues(new float[]{(float) ViewCompat.getPaddingEnd(ExtendedFloatingActionButton.this), (float) this.f49368g.mo57823a()});
                m.mo56595l("paddingEnd", g4);
            }
            if (m.mo56593j("labelOpacity")) {
                PropertyValuesHolder[] g5 = m.mo56589g("labelOpacity");
                boolean z = this.f49369h;
                float f = 0.0f;
                float f2 = z ? 0.0f : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                g5[0].setFloatValues(new float[]{f2, f});
                m.mo56595l("labelOpacity", g5);
            }
            return super.mo57778l(m);
        }

        /* renamed from: j */
        public void mo57850j(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                if (this.f49369h) {
                    onChangedCallback.mo57856a(ExtendedFloatingActionButton.this);
                } else {
                    onChangedCallback.mo57859d(ExtendedFloatingActionButton.this);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.f49358R = this.f49369h;
            boolean unused2 = ExtendedFloatingActionButton.this.f49359S = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    class HideStrategy extends BaseMotionStrategy {

        /* renamed from: g */
        private boolean f49376g;

        public HideStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        /* renamed from: a */
        public void mo57847a() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: c */
        public boolean mo57848c() {
            return ExtendedFloatingActionButton.this.m68431y();
        }

        /* renamed from: d */
        public void mo57773d() {
            super.mo57773d();
            this.f49376g = true;
        }

        /* renamed from: e */
        public int mo57849e() {
            return C10462R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        /* renamed from: f */
        public void mo57774f() {
            super.mo57774f();
            int unused = ExtendedFloatingActionButton.this.f49348H = 0;
            if (!this.f49376g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        /* renamed from: j */
        public void mo57850j(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.mo57857b(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f49376g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f49348H = 1;
        }
    }

    public static abstract class OnChangedCallback {
        /* renamed from: a */
        public void mo57856a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: b */
        public void mo57857b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: c */
        public void mo57858c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: d */
        public void mo57859d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(AnimatorTracker animatorTracker) {
            super(ExtendedFloatingActionButton.this, animatorTracker);
        }

        /* renamed from: a */
        public void mo57847a() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: c */
        public boolean mo57848c() {
            return ExtendedFloatingActionButton.this.m68432z();
        }

        /* renamed from: e */
        public int mo57849e() {
            return C10462R.animator.mtrl_extended_fab_show_motion_spec;
        }

        /* renamed from: f */
        public void mo57774f() {
            super.mo57774f();
            int unused = ExtendedFloatingActionButton.this.f49348H = 0;
        }

        /* renamed from: j */
        public void mo57850j(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.mo57858c(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f49348H = 2;
        }
    }

    interface Size {
        /* renamed from: a */
        int mo57823a();

        /* renamed from: b */
        int mo57824b();

        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        f49344W = new Property<View, Float>(cls, "width") {
            @NonNull
            /* renamed from: a */
            public Float get(@NonNull View view) {
                return Float.valueOf((float) view.getLayoutParams().width);
            }

            /* renamed from: b */
            public void set(@NonNull View view, @NonNull Float f) {
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
            }
        };
        f49345a0 = new Property<View, Float>(cls, "height") {
            @NonNull
            /* renamed from: a */
            public Float get(@NonNull View view) {
                return Float.valueOf((float) view.getLayoutParams().height);
            }

            /* renamed from: b */
            public void set(@NonNull View view, @NonNull Float f) {
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
            }
        };
        f49346b0 = new Property<View, Float>(cls, "paddingStart") {
            @NonNull
            /* renamed from: a */
            public Float get(@NonNull View view) {
                return Float.valueOf((float) ViewCompat.getPaddingStart(view));
            }

            /* renamed from: b */
            public void set(@NonNull View view, @NonNull Float f) {
                ViewCompat.setPaddingRelative(view, f.intValue(), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom());
            }
        };
        f49347c0 = new Property<View, Float>(cls, "paddingEnd") {
            @NonNull
            /* renamed from: a */
            public Float get(@NonNull View view) {
                return Float.valueOf((float) ViewCompat.getPaddingEnd(view));
            }

            /* renamed from: b */
            public void set(@NonNull View view, @NonNull Float f) {
                ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
            }
        };
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.extendedFloatingActionButtonStyle);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m68415A(@NonNull final MotionStrategy motionStrategy, @Nullable final OnChangedCallback onChangedCallback) {
        if (!motionStrategy.mo57848c()) {
            if (!m68417C()) {
                motionStrategy.mo57847a();
                motionStrategy.mo57850j(onChangedCallback);
                return;
            }
            measure(0, 0);
            AnimatorSet h = motionStrategy.mo57776h();
            h.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a */
                private boolean f49364a;

                public void onAnimationCancel(Animator animator) {
                    this.f49364a = true;
                    motionStrategy.mo57773d();
                }

                public void onAnimationEnd(Animator animator) {
                    motionStrategy.mo57774f();
                    if (!this.f49364a) {
                        motionStrategy.mo57850j(onChangedCallback);
                    }
                }

                public void onAnimationStart(Animator animator) {
                    motionStrategy.onAnimationStart(animator);
                    this.f49364a = false;
                }
            });
            for (Animator.AnimatorListener addListener : motionStrategy.mo57777i()) {
                h.addListener(addListener);
            }
            h.start();
        }
    }

    /* renamed from: B */
    private void m68416B() {
        this.f49361U = getTextColors();
    }

    /* renamed from: C */
    private boolean m68417C() {
        return (ViewCompat.isLaidOut(this) || (!m68432z() && this.f49360T)) && !isInEditMode();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public boolean m68431y() {
        if (getVisibility() == 0) {
            if (this.f49348H == 1) {
                return true;
            }
            return false;
        } else if (this.f49348H != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public boolean m68432z() {
        if (getVisibility() != 0) {
            if (this.f49348H == 2) {
                return true;
            }
            return false;
        } else if (this.f49348H != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo57802D(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f49357Q;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public int getCollapsedSize() {
        int i = this.f49354N;
        return i < 0 ? (Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) * 2) + getIconSize() : i;
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        return this.f49351K.mo57772b();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.f49353M.mo57772b();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.f49352L.mo57772b();
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        return this.f49350J.mo57772b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49358R && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f49358R = false;
            this.f49350J.mo57847a();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f49360T = z;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49351K.mo57775g(motionSpec);
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(MotionSpec.m67236d(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f49358R != z) {
            MotionStrategy motionStrategy = z ? this.f49351K : this.f49350J;
            if (!motionStrategy.mo57848c()) {
                motionStrategy.mo57847a();
            }
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49353M.mo57775g(motionSpec);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.m67236d(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f49358R && !this.f49359S) {
            this.f49355O = ViewCompat.getPaddingStart(this);
            this.f49356P = ViewCompat.getPaddingEnd(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f49358R && !this.f49359S) {
            this.f49355O = i;
            this.f49356P = i3;
        }
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49352L.mo57775g(motionSpec);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.m67236d(getContext(), i));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f49350J.mo57775g(motionSpec);
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(MotionSpec.m67236d(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        m68416B();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f49343V
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f49348H = r10
            com.google.android.material.floatingactionbutton.AnimatorTracker r1 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r1.<init>()
            r0.f49349I = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy
            r11.<init>(r1)
            r0.f49352L = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy
            r12.<init>(r1)
            r0.f49353M = r12
            r13 = 1
            r0.f49358R = r13
            r0.f49359S = r10
            r0.f49360T = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f49357Q = r1
            int[] r3 = com.google.android.material.C10462R.styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.ThemeEnforcement.m68822h(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.C10462R.styleable.ExtendedFloatingActionButton_showMotionSpec
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.m67235c(r14, r1, r2)
            int r3 = com.google.android.material.C10462R.styleable.ExtendedFloatingActionButton_hideMotionSpec
            com.google.android.material.animation.MotionSpec r3 = com.google.android.material.animation.MotionSpec.m67235c(r14, r1, r3)
            int r4 = com.google.android.material.C10462R.styleable.ExtendedFloatingActionButton_extendMotionSpec
            com.google.android.material.animation.MotionSpec r4 = com.google.android.material.animation.MotionSpec.m67235c(r14, r1, r4)
            int r5 = com.google.android.material.C10462R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            com.google.android.material.animation.MotionSpec r5 = com.google.android.material.animation.MotionSpec.m67235c(r14, r1, r5)
            int r6 = com.google.android.material.C10462R.styleable.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f49354N = r6
            int r6 = androidx.core.view.ViewCompat.getPaddingStart(r16)
            r0.f49355O = r6
            int r6 = androidx.core.view.ViewCompat.getPaddingEnd(r16)
            r0.f49356P = r6
            com.google.android.material.floatingactionbutton.AnimatorTracker r6 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1 r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f49351K = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2 r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f49350J = r10
            r11.mo57775g(r2)
            r12.mo57775g(r3)
            r15.mo57775g(r4)
            r10.mo57775g(r5)
            r1.recycle()
            com.google.android.material.shape.CornerSize r1 = com.google.android.material.shape.ShapeAppearanceModel.f50037m
            r2 = r18
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = com.google.android.material.shape.ShapeAppearanceModel.m69266g(r14, r2, r8, r9, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.mo58721m()
            r0.setShapeAppearanceModel(r1)
            r16.m68416B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f49371a;
        @Nullable

        /* renamed from: b */
        private OnChangedCallback f49372b;
        @Nullable

        /* renamed from: c */
        private OnChangedCallback f49373c;

        /* renamed from: d */
        private boolean f49374d;

        /* renamed from: e */
        private boolean f49375e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f49374d = false;
            this.f49375e = true;
        }

        /* renamed from: c */
        private static boolean m68452c(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: f */
        private boolean m68453f(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((this.f49374d || this.f49375e) && layoutParams.getAnchorId() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        private boolean m68454h(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m68453f(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f49371a == null) {
                this.f49371a = new Rect();
            }
            Rect rect = this.f49371a;
            DescendantOffsetUtils.m68712a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo57855g(extendedFloatingActionButton);
                return true;
            }
            mo57851a(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: i */
        private boolean m68455i(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m68453f(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo57855g(extendedFloatingActionButton);
                return true;
            }
            mo57851a(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo57851a(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            MotionStrategy motionStrategy;
            boolean z = this.f49375e;
            OnChangedCallback onChangedCallback = z ? this.f49373c : this.f49372b;
            if (z) {
                motionStrategy = extendedFloatingActionButton.f49351K;
            } else {
                motionStrategy = extendedFloatingActionButton.f49352L;
            }
            extendedFloatingActionButton.m68415A(motionStrategy, onChangedCallback);
        }

        /* renamed from: b */
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: d */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m68454h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m68452c(view)) {
                return false;
            } else {
                m68455i(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: e */
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m68452c(view) && m68455i(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m68454h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo57855g(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            MotionStrategy motionStrategy;
            boolean z = this.f49375e;
            OnChangedCallback onChangedCallback = z ? this.f49373c : this.f49372b;
            if (z) {
                motionStrategy = extendedFloatingActionButton.f49350J;
            } else {
                motionStrategy = extendedFloatingActionButton.f49353M;
            }
            extendedFloatingActionButton.m68415A(motionStrategy, onChangedCallback);
        }

        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10462R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f49374d = obtainStyledAttributes.getBoolean(C10462R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f49375e = obtainStyledAttributes.getBoolean(C10462R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m68416B();
    }
}
