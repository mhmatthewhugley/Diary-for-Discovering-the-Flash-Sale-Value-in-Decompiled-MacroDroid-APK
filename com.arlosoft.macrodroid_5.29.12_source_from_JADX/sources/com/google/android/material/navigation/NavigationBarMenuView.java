package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0144Px;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0146R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.C10462R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {

    /* renamed from: T */
    private static final int[] f49724T = {16842912};

    /* renamed from: U */
    private static final int[] f49725U = {-16842910};
    @Dimension

    /* renamed from: A */
    private int f49726A;

    /* renamed from: B */
    private ColorStateList f49727B;
    @Nullable

    /* renamed from: C */
    private final ColorStateList f49728C = mo58282d(16842808);
    @StyleRes

    /* renamed from: D */
    private int f49729D;
    @StyleRes

    /* renamed from: E */
    private int f49730E;

    /* renamed from: F */
    private Drawable f49731F;

    /* renamed from: G */
    private int f49732G;
    @NonNull

    /* renamed from: H */
    private SparseArray<BadgeDrawable> f49733H = new SparseArray<>(5);

    /* renamed from: I */
    private int f49734I = -1;

    /* renamed from: J */
    private int f49735J = -1;

    /* renamed from: K */
    private boolean f49736K;

    /* renamed from: L */
    private int f49737L;

    /* renamed from: M */
    private int f49738M;

    /* renamed from: N */
    private int f49739N;

    /* renamed from: O */
    private ShapeAppearanceModel f49740O;

    /* renamed from: P */
    private boolean f49741P = false;

    /* renamed from: Q */
    private ColorStateList f49742Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public NavigationBarPresenter f49743R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public MenuBuilder f49744S;
    @NonNull

    /* renamed from: a */
    private final TransitionSet f49745a;
    @NonNull

    /* renamed from: c */
    private final View.OnClickListener f49746c;

    /* renamed from: d */
    private final Pools.Pool<NavigationBarItemView> f49747d = new Pools.SynchronizedPool(5);
    @NonNull

    /* renamed from: f */
    private final SparseArray<View.OnTouchListener> f49748f = new SparseArray<>(5);

    /* renamed from: g */
    private int f49749g;
    @Nullable

    /* renamed from: o */
    private NavigationBarItemView[] f49750o;

    /* renamed from: p */
    private int f49751p = 0;

    /* renamed from: s */
    private int f49752s = 0;
    @Nullable

    /* renamed from: z */
    private ColorStateList f49753z;

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        AutoTransition autoTransition = new AutoTransition();
        this.f49745a = autoTransition;
        autoTransition.setOrdering(0);
        autoTransition.setDuration((long) MotionUtils.m68860d(getContext(), C10462R.attr.motionDurationLong1, getResources().getInteger(C10462R.integer.material_motion_duration_long_1)));
        autoTransition.setInterpolator(MotionUtils.m68861e(getContext(), C10462R.attr.motionEasingStandard, AnimationUtils.f48522b));
        autoTransition.addTransition(new TextScale());
        this.f49746c = new View.OnClickListener() {
            public void onClick(View view) {
                MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
                if (!NavigationBarMenuView.this.f49744S.performItemAction(itemData, NavigationBarMenuView.this.f49743R, 0)) {
                    itemData.setChecked(true);
                }
            }
        };
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    @Nullable
    /* renamed from: e */
    private Drawable m68890e() {
        if (this.f49740O == null || this.f49742Q == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f49740O);
        materialShapeDrawable.mo58656a0(this.f49742Q);
        return materialShapeDrawable;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView acquire = this.f49747d.acquire();
        return acquire == null ? mo56920f(getContext()) : acquire;
    }

    /* renamed from: h */
    private boolean m68891h(int i) {
        return i != -1;
    }

    /* renamed from: i */
    private void m68892i() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f49744S.size(); i++) {
            hashSet.add(Integer.valueOf(this.f49744S.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f49733H.size(); i2++) {
            int keyAt = this.f49733H.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f49733H.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if (m68891h(id) && (badgeDrawable = this.f49733H.get(id)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    /* renamed from: c */
    public void mo58281c() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f49747d.release(navigationBarItemView);
                    navigationBarItemView.mo58244f();
                }
            }
        }
        if (this.f49744S.size() == 0) {
            this.f49751p = 0;
            this.f49752s = 0;
            this.f49750o = null;
            return;
        }
        m68892i();
        this.f49750o = new NavigationBarItemView[this.f49744S.size()];
        boolean g = mo58283g(this.f49749g, this.f49744S.getVisibleItems().size());
        for (int i = 0; i < this.f49744S.size(); i++) {
            this.f49743R.mo58329c(true);
            this.f49744S.getItem(i).setCheckable(true);
            this.f49743R.mo58329c(false);
            NavigationBarItemView newItem = getNewItem();
            this.f49750o[i] = newItem;
            newItem.setIconTintList(this.f49753z);
            newItem.setIconSize(this.f49726A);
            newItem.setTextColor(this.f49728C);
            newItem.setTextAppearanceInactive(this.f49729D);
            newItem.setTextAppearanceActive(this.f49730E);
            newItem.setTextColor(this.f49727B);
            int i2 = this.f49734I;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.f49735J;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.f49737L);
            newItem.setActiveIndicatorHeight(this.f49738M);
            newItem.setActiveIndicatorMarginHorizontal(this.f49739N);
            newItem.setActiveIndicatorDrawable(m68890e());
            newItem.setActiveIndicatorResizeable(this.f49741P);
            newItem.setActiveIndicatorEnabled(this.f49736K);
            Drawable drawable = this.f49731F;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f49732G);
            }
            newItem.setShifting(g);
            newItem.setLabelVisibilityMode(this.f49749g);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f49744S.getItem(i);
            newItem.initialize(menuItemImpl, 0);
            newItem.setItemPosition(i);
            int itemId = menuItemImpl.getItemId();
            newItem.setOnTouchListener(this.f49748f.get(itemId));
            newItem.setOnClickListener(this.f49746c);
            int i4 = this.f49751p;
            if (i4 != 0 && itemId == i4) {
                this.f49752s = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f49744S.size() - 1, this.f49752s);
        this.f49752s = min;
        this.f49744S.getItem(min).setChecked(true);
    }

    @Nullable
    /* renamed from: d */
    public ColorStateList mo58282d(int i) {
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
        int[] iArr = f49725U;
        return new ColorStateList(new int[][]{iArr, f49724T, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: f */
    public abstract NavigationBarItemView mo56920f(@NonNull Context context);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo58283g(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f49733H;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f49753z;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f49742Q;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f49736K;
    }

    @C0144Px
    public int getItemActiveIndicatorHeight() {
        return this.f49738M;
    }

    @C0144Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f49739N;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.f49740O;
    }

    @C0144Px
    public int getItemActiveIndicatorWidth() {
        return this.f49737L;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) {
            return this.f49731F;
        }
        return navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f49732G;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f49726A;
    }

    @C0144Px
    public int getItemPaddingBottom() {
        return this.f49735J;
    }

    @C0144Px
    public int getItemPaddingTop() {
        return this.f49734I;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f49730E;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f49729D;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f49727B;
    }

    public int getLabelVisibilityMode() {
        return this.f49749g;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public MenuBuilder getMenu() {
        return this.f49744S;
    }

    public int getSelectedItemId() {
        return this.f49751p;
    }

    /* access modifiers changed from: protected */
    public int getSelectedItemPosition() {
        return this.f49752s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void initialize(@NonNull MenuBuilder menuBuilder) {
        this.f49744S = menuBuilder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo58304j(int i) {
        int size = this.f49744S.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f49744S.getItem(i2);
            if (i == item.getItemId()) {
                this.f49751p = i;
                this.f49752s = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo58305k() {
        MenuBuilder menuBuilder = this.f49744S;
        if (menuBuilder != null && this.f49750o != null) {
            int size = menuBuilder.size();
            if (size != this.f49750o.length) {
                mo58281c();
                return;
            }
            int i = this.f49751p;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f49744S.getItem(i2);
                if (item.isChecked()) {
                    this.f49751p = item.getItemId();
                    this.f49752s = i2;
                }
            }
            if (i != this.f49751p) {
                TransitionManager.beginDelayedTransition(this, this.f49745a);
            }
            boolean g = mo58283g(this.f49749g, this.f49744S.getVisibleItems().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f49743R.mo58329c(true);
                this.f49750o[i3].setLabelVisibilityMode(this.f49749g);
                this.f49750o[i3].setShifting(g);
                this.f49750o[i3].initialize((MenuItemImpl) this.f49744S.getItem(i3), 0);
                this.f49743R.mo58329c(false);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f49744S.getVisibleItems().size(), false, 1));
    }

    /* access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f49733H = sparseArray;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(sparseArray.get(navigationBarItemView.getId()));
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f49753z = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconTintList : navigationBarItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f49742Q = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorDrawable : navigationBarItemViewArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(m68890e());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f49736K = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorEnabled : navigationBarItemViewArr) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@C0144Px int i) {
        this.f49738M = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorHeight : navigationBarItemViewArr) {
                activeIndicatorHeight.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@C0144Px int i) {
        this.f49739N = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorMarginHorizontal : navigationBarItemViewArr) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f49741P = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorResizeable : navigationBarItemViewArr) {
                activeIndicatorResizeable.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f49740O = shapeAppearanceModel;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorDrawable : navigationBarItemViewArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(m68890e());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@C0144Px int i) {
        this.f49737L = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView activeIndicatorWidth : navigationBarItemViewArr) {
                activeIndicatorWidth.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f49731F = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f49732G = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.f49726A = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconSize : navigationBarItemViewArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(@C0144Px int i) {
        this.f49735J = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemPaddingBottom : navigationBarItemViewArr) {
                itemPaddingBottom.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@C0144Px int i) {
        this.f49734I = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemPaddingTop : navigationBarItemViewArr) {
                itemPaddingTop.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.f49730E = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f49727B;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.f49729D = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f49727B;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f49727B = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f49750o;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView textColor : navigationBarItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f49749g = i;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.f49743R = navigationBarPresenter;
    }
}
