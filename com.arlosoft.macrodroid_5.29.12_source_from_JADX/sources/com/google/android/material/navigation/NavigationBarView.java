package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.C0144Px;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class NavigationBarView extends FrameLayout {
    @NonNull

    /* renamed from: a */
    private final NavigationBarMenu f49761a;
    @NonNull

    /* renamed from: c */
    private final NavigationBarMenuView f49762c;
    @NonNull

    /* renamed from: d */
    private final NavigationBarPresenter f49763d;
    @Nullable

    /* renamed from: f */
    private ColorStateList f49764f;

    /* renamed from: g */
    private MenuInflater f49765g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public OnItemSelectedListener f49766o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public OnItemReselectedListener f49767p;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        /* renamed from: a */
        void mo58382a(@NonNull MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
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
        @Nullable

        /* renamed from: a */
        Bundle f49769a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m68910a(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.f49769a = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f49769a);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m68910a(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(MaterialThemeOverlay.m69957c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f49763d = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C10462R.styleable.NavigationBarView;
        int i3 = C10462R.styleable.NavigationBarView_itemTextAppearanceInactive;
        int i4 = C10462R.styleable.NavigationBarView_itemTextAppearanceActive;
        TintTypedArray i5 = ThemeEnforcement.m68823i(context2, attributeSet, iArr, i, i2, i3, i4);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.f49761a = navigationBarMenu;
        NavigationBarMenuView d = mo56925d(context2);
        this.f49762c = d;
        navigationBarPresenter.mo58328b(d);
        navigationBarPresenter.mo58327a(1);
        d.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        int i6 = C10462R.styleable.NavigationBarView_itemIconTint;
        if (i5.hasValue(i6)) {
            d.setIconTintList(i5.getColorStateList(i6));
        } else {
            d.setIconTintList(d.mo58282d(16842808));
        }
        setItemIconSize(i5.getDimensionPixelSize(C10462R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(C10462R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (i5.hasValue(i3)) {
            setItemTextAppearanceInactive(i5.getResourceId(i3, 0));
        }
        if (i5.hasValue(i4)) {
            setItemTextAppearanceActive(i5.getResourceId(i4, 0));
        }
        int i7 = C10462R.styleable.NavigationBarView_itemTextColor;
        if (i5.hasValue(i7)) {
            setItemTextColor(i5.getColorStateList(i7));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ViewCompat.setBackground(this, m68906c(context2));
        }
        int i8 = C10462R.styleable.NavigationBarView_itemPaddingTop;
        if (i5.hasValue(i8)) {
            setItemPaddingTop(i5.getDimensionPixelSize(i8, 0));
        }
        int i9 = C10462R.styleable.NavigationBarView_itemPaddingBottom;
        if (i5.hasValue(i9)) {
            setItemPaddingBottom(i5.getDimensionPixelSize(i9, 0));
        }
        int i10 = C10462R.styleable.NavigationBarView_elevation;
        if (i5.hasValue(i10)) {
            setElevation((float) i5.getDimensionPixelSize(i10, 0));
        }
        DrawableCompat.setTintList(getBackground().mutate(), MaterialResources.m69122b(context2, i5, C10462R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(i5.getInteger(C10462R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int resourceId = i5.getResourceId(C10462R.styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            d.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(MaterialResources.m69122b(context2, i5, C10462R.styleable.NavigationBarView_itemRippleColor));
        }
        int resourceId2 = i5.getResourceId(C10462R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, C10462R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(C10462R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(C10462R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(MaterialResources.m69121a(context2, obtainStyledAttributes, C10462R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.m69261b(context2, obtainStyledAttributes.getResourceId(C10462R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).mo58721m());
            obtainStyledAttributes.recycle();
        }
        int i11 = C10462R.styleable.NavigationBarView_menu;
        if (i5.hasValue(i11)) {
            mo58336e(i5.getResourceId(i11, 0));
        }
        i5.recycle();
        addView(d);
        navigationBarMenu.setCallback(new MenuBuilder.Callback() {
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
                if (NavigationBarView.this.f49767p != null && menuItem.getItemId() == NavigationBarView.this.getSelectedItemId()) {
                    NavigationBarView.this.f49767p.mo58382a(menuItem);
                    return true;
                } else if (NavigationBarView.this.f49766o == null || NavigationBarView.this.f49766o.onNavigationItemSelected(menuItem)) {
                    return false;
                } else {
                    return true;
                }
            }

            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
    }

    @NonNull
    /* renamed from: c */
    private MaterialShapeDrawable m68906c(Context context) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.mo58656a0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.mo58649P(context);
        return materialShapeDrawable;
    }

    private MenuInflater getMenuInflater() {
        if (this.f49765g == null) {
            this.f49765g = new SupportMenuInflater(getContext());
        }
        return this.f49765g;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract NavigationBarMenuView mo56925d(@NonNull Context context);

    /* renamed from: e */
    public void mo58336e(int i) {
        this.f49763d.mo58329c(true);
        getMenuInflater().inflate(i, this.f49761a);
        this.f49763d.mo58329c(false);
        this.f49763d.updateMenuView(true);
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f49762c.getItemActiveIndicatorColor();
    }

    @C0144Px
    public int getItemActiveIndicatorHeight() {
        return this.f49762c.getItemActiveIndicatorHeight();
    }

    @C0144Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f49762c.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f49762c.getItemActiveIndicatorShapeAppearance();
    }

    @C0144Px
    public int getItemActiveIndicatorWidth() {
        return this.f49762c.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f49762c.getItemBackground();
    }

    @Deprecated
    @DrawableRes
    public int getItemBackgroundResource() {
        return this.f49762c.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f49762c.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f49762c.getIconTintList();
    }

    @C0144Px
    public int getItemPaddingBottom() {
        return this.f49762c.getItemPaddingBottom();
    }

    @C0144Px
    public int getItemPaddingTop() {
        return this.f49762c.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f49764f;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f49762c.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f49762c.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f49762c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f49762c.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f49761a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.f49762c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f49763d;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f49762c.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m69254e(this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f49761a.restorePresenterStates(savedState.f49769a);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f49769a = bundle;
        this.f49761a.savePresenterStates(bundle);
        return savedState;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.m69253d(this, f);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f49762c.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f49762c.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@C0144Px int i) {
        this.f49762c.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@C0144Px int i) {
        this.f49762c.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f49762c.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@C0144Px int i) {
        this.f49762c.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f49762c.setItemBackground(drawable);
        this.f49764f = null;
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.f49762c.setItemBackgroundRes(i);
        this.f49764f = null;
    }

    public void setItemIconSize(@Dimension int i) {
        this.f49762c.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@DimenRes int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f49762c.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@C0144Px int i) {
        this.f49762c.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@C0144Px int i) {
        this.f49762c.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f49764f != colorStateList) {
            this.f49764f = colorStateList;
            if (colorStateList == null) {
                this.f49762c.setItemBackground((Drawable) null);
                return;
            }
            this.f49762c.setItemBackground(new RippleDrawable(RippleUtils.m69152a(colorStateList), (Drawable) null, (Drawable) null));
        } else if (colorStateList == null && this.f49762c.getItemBackground() != null) {
            this.f49762c.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.f49762c.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.f49762c.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f49762c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f49762c.getLabelVisibilityMode() != i) {
            this.f49762c.setLabelVisibilityMode(i);
            this.f49763d.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener onItemReselectedListener) {
        this.f49767p = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener onItemSelectedListener) {
        this.f49766o = onItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i) {
        MenuItem findItem = this.f49761a.findItem(i);
        if (findItem != null && !this.f49761a.performItemAction(findItem, this.f49763d, 0)) {
            findItem.setChecked(true);
        }
    }
}
