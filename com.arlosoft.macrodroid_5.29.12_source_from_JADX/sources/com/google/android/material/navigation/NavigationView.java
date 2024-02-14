package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.C0144Px;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0146R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: J */
    private static final int[] f49770J = {16842912};

    /* renamed from: K */
    private static final int[] f49771K = {-16842910};

    /* renamed from: L */
    private static final int f49772L = C10462R.style.Widget_Design_NavigationView;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final int[] f49773A;

    /* renamed from: B */
    private MenuInflater f49774B;

    /* renamed from: C */
    private ViewTreeObserver.OnGlobalLayoutListener f49775C;

    /* renamed from: D */
    private boolean f49776D;

    /* renamed from: E */
    private boolean f49777E;

    /* renamed from: F */
    private int f49778F;
    @C0144Px

    /* renamed from: G */
    private int f49779G;
    @Nullable

    /* renamed from: H */
    private Path f49780H;

    /* renamed from: I */
    private final RectF f49781I;
    @NonNull

    /* renamed from: o */
    private final NavigationMenu f49782o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final NavigationMenuPresenter f49783p;

    /* renamed from: s */
    OnNavigationItemSelectedListener f49784s;

    /* renamed from: z */
    private final int f49785z;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.navigationViewStyle);
    }

    @Nullable
    /* renamed from: e */
    private ColorStateList m68916e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0146R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f49771K;
        return new ColorStateList(new int[][]{iArr, f49770J, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    /* renamed from: f */
    private final Drawable m68917f(@NonNull TintTypedArray tintTypedArray) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.m69261b(getContext(), tintTypedArray.getResourceId(C10462R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(C10462R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).mo58721m());
        materialShapeDrawable.mo58656a0(MaterialResources.m69122b(getContext(), tintTypedArray, C10462R.styleable.NavigationView_itemShapeFillColor));
        return new InsetDrawable(materialShapeDrawable, tintTypedArray.getDimensionPixelSize(C10462R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(C10462R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(C10462R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(C10462R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: g */
    private boolean m68918g(@NonNull TintTypedArray tintTypedArray) {
        return tintTypedArray.hasValue(C10462R.styleable.NavigationView_itemShapeAppearance) || tintTypedArray.hasValue(C10462R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private MenuInflater getMenuInflater() {
        if (this.f49774B == null) {
            this.f49774B = new SupportMenuInflater(getContext());
        }
        return this.f49774B;
    }

    /* renamed from: l */
    private void m68919l(@C0144Px int i, @C0144Px int i2) {
        if (!(getParent() instanceof DrawerLayout) || this.f49779G <= 0 || !(getBackground() instanceof MaterialShapeDrawable)) {
            this.f49780H = null;
            this.f49781I.setEmpty();
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        ShapeAppearanceModel.Builder v = materialShapeDrawable.getShapeAppearanceModel().mo58707v();
        if (GravityCompat.getAbsoluteGravity(this.f49778F, ViewCompat.getLayoutDirection(this)) == 3) {
            v.mo58719I((float) this.f49779G);
            v.mo58733z((float) this.f49779G);
        } else {
            v.mo58715E((float) this.f49779G);
            v.mo58729v((float) this.f49779G);
        }
        materialShapeDrawable.setShapeAppearanceModel(v.mo58721m());
        if (this.f49780H == null) {
            this.f49780H = new Path();
        }
        this.f49780H.reset();
        this.f49781I.set(0.0f, 0.0f, (float) i, (float) i2);
        ShapeAppearancePathProvider.m69330k().mo58734d(materialShapeDrawable.getShapeAppearanceModel(), materialShapeDrawable.mo58685y(), this.f49781I, this.f49780H);
        invalidate();
    }

    /* renamed from: m */
    private void m68920m() {
        this.f49775C = new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.f49773A);
                boolean z = true;
                boolean z2 = NavigationView.this.f49773A[1] == 0;
                NavigationView.this.f49783p.mo58155r(z2);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z2 && navigationView2.mo58408k());
                Activity a = ContextUtils.m68711a(NavigationView.this.getContext());
                if (a != null) {
                    boolean z3 = a.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                    boolean z4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    if (!z3 || !z4 || !navigationView3.mo58407j()) {
                        z = false;
                    }
                    navigationView3.setDrawBottomInsetForeground(z);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.f49775C);
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo58198a(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.f49783p.mo58140c(windowInsetsCompat);
    }

    /* renamed from: d */
    public void mo58389d(@NonNull View view) {
        this.f49783p.mo58139b(view);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f49780H == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f49780H);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f49783p.mo58141d();
    }

    @C0144Px
    public int getDividerInsetEnd() {
        return this.f49783p.mo58142e();
    }

    @C0144Px
    public int getDividerInsetStart() {
        return this.f49783p.mo58143f();
    }

    public int getHeaderCount() {
        return this.f49783p.mo58144g();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f49783p.mo58145h();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f49783p.mo58146i();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f49783p.mo58147j();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f49783p.mo58150m();
    }

    public int getItemMaxLines() {
        return this.f49783p.mo58148k();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f49783p.mo58149l();
    }

    @C0144Px
    public int getItemVerticalPadding() {
        return this.f49783p.mo58151n();
    }

    @NonNull
    public Menu getMenu() {
        return this.f49782o;
    }

    @C0144Px
    public int getSubheaderInsetEnd() {
        return this.f49783p.mo58152o();
    }

    @C0144Px
    public int getSubheaderInsetStart() {
        return this.f49783p.mo58153p();
    }

    /* renamed from: h */
    public View mo58405h(@LayoutRes int i) {
        return this.f49783p.mo58154q(i);
    }

    /* renamed from: i */
    public void mo58406i(int i) {
        this.f49783p.mo58138J(true);
        getMenuInflater().inflate(i, this.f49782o);
        this.f49783p.mo58138J(false);
        this.f49783p.updateMenuView(false);
    }

    /* renamed from: j */
    public boolean mo58407j() {
        return this.f49777E;
    }

    /* renamed from: k */
    public boolean mo58408k() {
        return this.f49776D;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m69254e(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f49775C);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f49785z), BasicMeasure.EXACTLY);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f49785z, BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f49782o.restorePresenterStates(savedState.f49788a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f49788a = bundle;
        this.f49782o.savePresenterStates(bundle);
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m68919l(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f49777E = z;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem findItem = this.f49782o.findItem(i);
        if (findItem != null) {
            this.f49783p.mo58156s((MenuItemImpl) findItem);
        }
    }

    public void setDividerInsetEnd(@C0144Px int i) {
        this.f49783p.mo58157t(i);
    }

    public void setDividerInsetStart(@C0144Px int i) {
        this.f49783p.mo58158u(i);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.m69253d(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f49783p.mo58160w(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.f49783p.mo58161x(i);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        this.f49783p.mo58161x(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@Dimension int i) {
        this.f49783p.mo58162y(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f49783p.mo58162y(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@Dimension int i) {
        this.f49783p.mo58163z(i);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f49783p.mo58129A(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f49783p.mo58130B(i);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.f49783p.mo58131C(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f49783p.mo58132D(colorStateList);
    }

    public void setItemVerticalPadding(@C0144Px int i) {
        this.f49783p.mo58133E(i);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i) {
        this.f49783p.mo58133E(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f49784s = onNavigationItemSelectedListener;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.f49783p;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.mo58134F(i);
        }
    }

    public void setSubheaderInsetEnd(@C0144Px int i) {
        this.f49783p.mo58136H(i);
    }

    public void setSubheaderInsetStart(@C0144Px int i) {
        this.f49783p.mo58136H(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f49776D = z;
    }

    public static class SavedState extends AbsSavedState {
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
        @Nullable

        /* renamed from: a */
        public Bundle f49788a;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f49788a = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f49788a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r6 = f49772L
            android.content.Context r12 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r12, r13, r14, r6)
            r11.<init>(r12, r13, r14)
            com.google.android.material.internal.NavigationMenuPresenter r12 = new com.google.android.material.internal.NavigationMenuPresenter
            r12.<init>()
            r11.f49783p = r12
            r0 = 2
            int[] r0 = new int[r0]
            r11.f49773A = r0
            r7 = 1
            r11.f49776D = r7
            r11.f49777E = r7
            r8 = 0
            r11.f49778F = r8
            r11.f49779G = r8
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r11.f49781I = r0
            android.content.Context r9 = r11.getContext()
            com.google.android.material.internal.NavigationMenu r10 = new com.google.android.material.internal.NavigationMenu
            r10.<init>(r9)
            r11.f49782o = r10
            int[] r2 = com.google.android.material.C10462R.styleable.NavigationView
            int[] r5 = new int[r8]
            r0 = r9
            r1 = r13
            r3 = r14
            r4 = r6
            androidx.appcompat.widget.TintTypedArray r0 = com.google.android.material.internal.ThemeEnforcement.m68823i(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C10462R.styleable.NavigationView_android_background
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            androidx.core.view.ViewCompat.setBackground(r11, r1)
        L_0x004c:
            int r1 = com.google.android.material.C10462R.styleable.NavigationView_drawerLayoutCornerSize
            int r1 = r0.getDimensionPixelSize(r1, r8)
            r11.f49779G = r1
            int r1 = com.google.android.material.C10462R.styleable.NavigationView_android_layout_gravity
            int r1 = r0.getInt(r1, r8)
            r11.f49778F = r1
            android.graphics.drawable.Drawable r1 = r11.getBackground()
            if (r1 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r1 = r11.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x0092
        L_0x006a:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r13 = com.google.android.material.shape.ShapeAppearanceModel.m69264e(r9, r13, r14, r6)
            com.google.android.material.shape.ShapeAppearanceModel r13 = r13.mo58721m()
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>((com.google.android.material.shape.ShapeAppearanceModel) r13)
            boolean r13 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L_0x008c
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            int r13 = r14.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r1.mo58656a0(r13)
        L_0x008c:
            r1.mo58649P(r9)
            androidx.core.view.ViewCompat.setBackground(r11, r1)
        L_0x0092:
            int r13 = com.google.android.material.C10462R.styleable.NavigationView_elevation
            boolean r14 = r0.hasValue(r13)
            if (r14 == 0) goto L_0x00a2
            int r13 = r0.getDimensionPixelSize(r13, r8)
            float r13 = (float) r13
            r11.setElevation(r13)
        L_0x00a2:
            int r13 = com.google.android.material.C10462R.styleable.NavigationView_android_fitsSystemWindows
            boolean r13 = r0.getBoolean(r13, r8)
            r11.setFitsSystemWindows(r13)
            int r13 = com.google.android.material.C10462R.styleable.NavigationView_android_maxWidth
            int r13 = r0.getDimensionPixelSize(r13, r8)
            r11.f49785z = r13
            int r13 = com.google.android.material.C10462R.styleable.NavigationView_subheaderColor
            boolean r14 = r0.hasValue(r13)
            r1 = 0
            if (r14 == 0) goto L_0x00c1
            android.content.res.ColorStateList r13 = r0.getColorStateList(r13)
            goto L_0x00c2
        L_0x00c1:
            r13 = r1
        L_0x00c2:
            int r14 = com.google.android.material.C10462R.styleable.NavigationView_subheaderTextAppearance
            boolean r2 = r0.hasValue(r14)
            if (r2 == 0) goto L_0x00cf
            int r14 = r0.getResourceId(r14, r8)
            goto L_0x00d0
        L_0x00cf:
            r14 = 0
        L_0x00d0:
            r2 = 16842808(0x1010038, float:2.3693715E-38)
            if (r14 != 0) goto L_0x00db
            if (r13 != 0) goto L_0x00db
            android.content.res.ColorStateList r13 = r11.m68916e(r2)
        L_0x00db:
            int r3 = com.google.android.material.C10462R.styleable.NavigationView_itemIconTint
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L_0x00e8
            android.content.res.ColorStateList r2 = r0.getColorStateList(r3)
            goto L_0x00ec
        L_0x00e8:
            android.content.res.ColorStateList r2 = r11.m68916e(r2)
        L_0x00ec:
            int r3 = com.google.android.material.C10462R.styleable.NavigationView_itemTextAppearance
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L_0x00f9
            int r3 = r0.getResourceId(r3, r8)
            goto L_0x00fa
        L_0x00f9:
            r3 = 0
        L_0x00fa:
            int r4 = com.google.android.material.C10462R.styleable.NavigationView_itemIconSize
            boolean r5 = r0.hasValue(r4)
            if (r5 == 0) goto L_0x0109
            int r4 = r0.getDimensionPixelSize(r4, r8)
            r11.setItemIconSize(r4)
        L_0x0109:
            int r4 = com.google.android.material.C10462R.styleable.NavigationView_itemTextColor
            boolean r5 = r0.hasValue(r4)
            if (r5 == 0) goto L_0x0115
            android.content.res.ColorStateList r1 = r0.getColorStateList(r4)
        L_0x0115:
            if (r3 != 0) goto L_0x0120
            if (r1 != 0) goto L_0x0120
            r1 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r1 = r11.m68916e(r1)
        L_0x0120:
            int r4 = com.google.android.material.C10462R.styleable.NavigationView_itemBackground
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r4)
            if (r4 != 0) goto L_0x0132
            boolean r5 = r11.m68918g(r0)
            if (r5 == 0) goto L_0x0132
            android.graphics.drawable.Drawable r4 = r11.m68917f(r0)
        L_0x0132:
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_itemHorizontalPadding
            boolean r6 = r0.hasValue(r5)
            if (r6 == 0) goto L_0x0141
            int r5 = r0.getDimensionPixelSize(r5, r8)
            r11.setItemHorizontalPadding(r5)
        L_0x0141:
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_itemVerticalPadding
            boolean r6 = r0.hasValue(r5)
            if (r6 == 0) goto L_0x0150
            int r5 = r0.getDimensionPixelSize(r5, r8)
            r11.setItemVerticalPadding(r5)
        L_0x0150:
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_dividerInsetStart
            int r5 = r0.getDimensionPixelSize(r5, r8)
            r11.setDividerInsetStart(r5)
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_dividerInsetEnd
            int r5 = r0.getDimensionPixelSize(r5, r8)
            r11.setDividerInsetEnd(r5)
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_subheaderInsetStart
            int r5 = r0.getDimensionPixelSize(r5, r8)
            r11.setSubheaderInsetStart(r5)
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_subheaderInsetEnd
            int r5 = r0.getDimensionPixelSize(r5, r8)
            r11.setSubheaderInsetEnd(r5)
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_topInsetScrimEnabled
            boolean r6 = r11.f49776D
            boolean r5 = r0.getBoolean(r5, r6)
            r11.setTopInsetScrimEnabled(r5)
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_bottomInsetScrimEnabled
            boolean r6 = r11.f49777E
            boolean r5 = r0.getBoolean(r5, r6)
            r11.setBottomInsetScrimEnabled(r5)
            int r5 = com.google.android.material.C10462R.styleable.NavigationView_itemIconPadding
            int r5 = r0.getDimensionPixelSize(r5, r8)
            int r6 = com.google.android.material.C10462R.styleable.NavigationView_itemMaxLines
            int r6 = r0.getInt(r6, r7)
            r11.setItemMaxLines(r6)
            com.google.android.material.navigation.NavigationView$1 r6 = new com.google.android.material.navigation.NavigationView$1
            r6.<init>()
            r10.setCallback(r6)
            r12.mo58159v(r7)
            r12.initForMenu(r9, r10)
            if (r14 == 0) goto L_0x01ac
            r12.mo58137I(r14)
        L_0x01ac:
            r12.mo58135G(r13)
            r12.mo58129A(r2)
            int r13 = r11.getOverScrollMode()
            r12.mo58134F(r13)
            if (r3 == 0) goto L_0x01be
            r12.mo58131C(r3)
        L_0x01be:
            r12.mo58132D(r1)
            r12.mo58160w(r4)
            r12.mo58162y(r5)
            r10.addMenuPresenter(r12)
            androidx.appcompat.view.menu.MenuView r12 = r12.getMenuView(r11)
            android.view.View r12 = (android.view.View) r12
            r11.addView(r12)
            int r12 = com.google.android.material.C10462R.styleable.NavigationView_menu
            boolean r13 = r0.hasValue(r12)
            if (r13 == 0) goto L_0x01e2
            int r12 = r0.getResourceId(r12, r8)
            r11.mo58406i(r12)
        L_0x01e2:
            int r12 = com.google.android.material.C10462R.styleable.NavigationView_headerLayout
            boolean r13 = r0.hasValue(r12)
            if (r13 == 0) goto L_0x01f1
            int r12 = r0.getResourceId(r12, r8)
            r11.mo58405h(r12)
        L_0x01f1:
            r0.recycle()
            r11.m68920m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.f49782o.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f49783p.mo58156s((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
