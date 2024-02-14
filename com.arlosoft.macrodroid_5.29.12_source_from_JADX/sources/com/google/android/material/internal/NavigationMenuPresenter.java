package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0144Px;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.C10462R;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuPresenter implements MenuPresenter {

    /* renamed from: A */
    int f49587A = 0;

    /* renamed from: B */
    ColorStateList f49588B;

    /* renamed from: C */
    ColorStateList f49589C;

    /* renamed from: D */
    Drawable f49590D;

    /* renamed from: E */
    int f49591E;
    @C0144Px

    /* renamed from: F */
    int f49592F;

    /* renamed from: G */
    int f49593G;

    /* renamed from: H */
    int f49594H;
    @C0144Px

    /* renamed from: I */
    int f49595I;
    @C0144Px

    /* renamed from: J */
    int f49596J;
    @C0144Px

    /* renamed from: K */
    int f49597K;
    @C0144Px

    /* renamed from: L */
    int f49598L;

    /* renamed from: M */
    boolean f49599M;

    /* renamed from: N */
    boolean f49600N = true;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f49601O;

    /* renamed from: P */
    private int f49602P;

    /* renamed from: Q */
    int f49603Q;

    /* renamed from: R */
    private int f49604R = -1;

    /* renamed from: S */
    final View.OnClickListener f49605S = new View.OnClickListener() {
        public void onClick(View view) {
            boolean z = true;
            NavigationMenuPresenter.this.mo58138J(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.f49609f.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData == null || !itemData.isCheckable() || !performItemAction) {
                z = false;
            } else {
                NavigationMenuPresenter.this.f49611o.mo58172K(itemData);
            }
            NavigationMenuPresenter.this.mo58138J(false);
            if (z) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    /* renamed from: a */
    private NavigationMenuView f49606a;

    /* renamed from: c */
    LinearLayout f49607c;

    /* renamed from: d */
    private MenuPresenter.Callback f49608d;

    /* renamed from: f */
    MenuBuilder f49609f;

    /* renamed from: g */
    private int f49610g;

    /* renamed from: o */
    NavigationMenuAdapter f49611o;

    /* renamed from: p */
    LayoutInflater f49612p;

    /* renamed from: s */
    int f49613s = 0;
    @Nullable

    /* renamed from: z */
    ColorStateList f49614z;

    private static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    private class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: a */
        private final ArrayList<NavigationMenuItem> f49616a = new ArrayList<>();

        /* renamed from: b */
        private MenuItemImpl f49617b;

        /* renamed from: c */
        private boolean f49618c;

        NavigationMenuAdapter() {
            m68765I();
        }

        /* renamed from: B */
        private void m68764B(int i, int i2) {
            while (i < i2) {
                ((NavigationMenuTextItem) this.f49616a.get(i)).f49623b = true;
                i++;
            }
        }

        /* renamed from: I */
        private void m68765I() {
            if (!this.f49618c) {
                this.f49618c = true;
                this.f49616a.clear();
                this.f49616a.add(new NavigationMenuHeaderItem());
                int i = -1;
                int size = NavigationMenuPresenter.this.f49609f.getVisibleItems().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl menuItemImpl = NavigationMenuPresenter.this.f49609f.getVisibleItems().get(i3);
                    if (menuItemImpl.isChecked()) {
                        mo58172K(menuItemImpl);
                    }
                    if (menuItemImpl.isCheckable()) {
                        menuItemImpl.setExclusiveCheckable(false);
                    }
                    if (menuItemImpl.hasSubMenu()) {
                        SubMenu subMenu = menuItemImpl.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f49616a.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.f49603Q, 0));
                            }
                            this.f49616a.add(new NavigationMenuTextItem(menuItemImpl));
                            int size2 = this.f49616a.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                                if (menuItemImpl2.isVisible()) {
                                    if (!z2 && menuItemImpl2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (menuItemImpl2.isCheckable()) {
                                        menuItemImpl2.setExclusiveCheckable(false);
                                    }
                                    if (menuItemImpl.isChecked()) {
                                        mo58172K(menuItemImpl);
                                    }
                                    this.f49616a.add(new NavigationMenuTextItem(menuItemImpl2));
                                }
                            }
                            if (z2) {
                                m68764B(size2, this.f49616a.size());
                            }
                        }
                    } else {
                        int groupId = menuItemImpl.getGroupId();
                        if (groupId != i) {
                            i2 = this.f49616a.size();
                            z = menuItemImpl.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<NavigationMenuItem> arrayList = this.f49616a;
                                int i5 = NavigationMenuPresenter.this.f49603Q;
                                arrayList.add(new NavigationMenuSeparatorItem(i5, i5));
                            }
                        } else if (!z && menuItemImpl.getIcon() != null) {
                            m68764B(i2, this.f49616a.size());
                            z = true;
                        }
                        NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(menuItemImpl);
                        navigationMenuTextItem.f49623b = z;
                        this.f49616a.add(navigationMenuTextItem);
                        i = groupId;
                    }
                }
                this.f49618c = false;
            }
        }

        @NonNull
        /* renamed from: C */
        public Bundle mo58165C() {
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.f49617b;
            if (menuItemImpl != null) {
                bundle.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f49616a.size();
            for (int i = 0; i < size; i++) {
                NavigationMenuItem navigationMenuItem = this.f49616a.get(i);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    MenuItemImpl a = ((NavigationMenuTextItem) navigationMenuItem).mo58177a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: D */
        public MenuItemImpl mo58166D() {
            return this.f49617b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo58167E() {
            int i = NavigationMenuPresenter.this.f49607c.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < NavigationMenuPresenter.this.f49611o.getItemCount(); i2++) {
                if (NavigationMenuPresenter.this.f49611o.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: F */
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
                navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.f49589C);
                int i2 = NavigationMenuPresenter.this.f49587A;
                if (i2 != 0) {
                    navigationMenuItemView.setTextAppearance(i2);
                }
                ColorStateList colorStateList = NavigationMenuPresenter.this.f49588B;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = NavigationMenuPresenter.this.f49590D;
                ViewCompat.setBackground(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.f49616a.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.f49623b);
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                int i3 = navigationMenuPresenter.f49591E;
                int i4 = navigationMenuPresenter.f49592F;
                navigationMenuItemView.setPadding(i3, i4, i3, i4);
                navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.f49593G);
                NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
                if (navigationMenuPresenter2.f49599M) {
                    navigationMenuItemView.setIconSize(navigationMenuPresenter2.f49594H);
                }
                navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.f49601O);
                navigationMenuItemView.initialize(navigationMenuTextItem.mo58177a(), 0);
            } else if (itemViewType == 1) {
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.f49616a.get(i)).mo58177a().getTitle());
                int i5 = NavigationMenuPresenter.this.f49613s;
                if (i5 != 0) {
                    TextViewCompat.setTextAppearance(textView, i5);
                }
                textView.setPadding(NavigationMenuPresenter.this.f49597K, textView.getPaddingTop(), NavigationMenuPresenter.this.f49598L, textView.getPaddingBottom());
                ColorStateList colorStateList2 = NavigationMenuPresenter.this.f49614z;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
            } else if (itemViewType == 2) {
                NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.f49616a.get(i);
                viewHolder.itemView.setPadding(NavigationMenuPresenter.this.f49595I, navigationMenuSeparatorItem.mo58176b(), NavigationMenuPresenter.this.f49596J, navigationMenuSeparatorItem.mo58175a());
            }
        }

        @Nullable
        /* renamed from: G */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.f49612p, viewGroup, navigationMenuPresenter.f49605S);
            } else if (i == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.f49612p, viewGroup);
            } else {
                if (i == 2) {
                    return new SeparatorViewHolder(NavigationMenuPresenter.this.f49612p, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new HeaderViewHolder(NavigationMenuPresenter.this.f49607c);
            }
        }

        /* renamed from: H */
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).mo58119c();
            }
        }

        /* renamed from: J */
        public void mo58171J(@NonNull Bundle bundle) {
            MenuItemImpl a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f49618c = true;
                int size = this.f49616a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = this.f49616a.get(i2);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (a2 = ((NavigationMenuTextItem) navigationMenuItem).mo58177a()) != null && a2.getItemId() == i) {
                        mo58172K(a2);
                        break;
                    }
                    i2++;
                }
                this.f49618c = false;
                m68765I();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f49616a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    NavigationMenuItem navigationMenuItem2 = this.f49616a.get(i3);
                    if (!(!(navigationMenuItem2 instanceof NavigationMenuTextItem) || (a = ((NavigationMenuTextItem) navigationMenuItem2).mo58177a()) == null || (actionView = a.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: K */
        public void mo58172K(@NonNull MenuItemImpl menuItemImpl) {
            if (this.f49617b != menuItemImpl && menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.f49617b;
                if (menuItemImpl2 != null) {
                    menuItemImpl2.setChecked(false);
                }
                this.f49617b = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        /* renamed from: L */
        public void mo58173L(boolean z) {
            this.f49618c = z;
        }

        /* renamed from: M */
        public void mo58174M() {
            m68765I();
            notifyDataSetChanged();
        }

        public int getItemCount() {
            return this.f49616a.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            NavigationMenuItem navigationMenuItem = this.f49616a.get(i);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).mo58177a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    private static class NavigationMenuHeaderItem implements NavigationMenuItem {
        NavigationMenuHeaderItem() {
        }
    }

    private interface NavigationMenuItem {
    }

    private static class NavigationMenuSeparatorItem implements NavigationMenuItem {

        /* renamed from: a */
        private final int f49620a;

        /* renamed from: b */
        private final int f49621b;

        public NavigationMenuSeparatorItem(int i, int i2) {
            this.f49620a = i;
            this.f49621b = i2;
        }

        /* renamed from: a */
        public int mo58175a() {
            return this.f49621b;
        }

        /* renamed from: b */
        public int mo58176b() {
            return this.f49620a;
        }
    }

    private static class NavigationMenuTextItem implements NavigationMenuItem {

        /* renamed from: a */
        private final MenuItemImpl f49622a;

        /* renamed from: b */
        boolean f49623b;

        NavigationMenuTextItem(MenuItemImpl menuItemImpl) {
            this.f49622a = menuItemImpl;
        }

        /* renamed from: a */
        public MenuItemImpl mo58177a() {
            return this.f49622a;
        }
    }

    private class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        NavigationMenuViewAccessibilityDelegate(@NonNull RecyclerView recyclerView) {
            super(recyclerView);
        }

        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(NavigationMenuPresenter.this.f49611o.mo58167E(), 0, false));
        }
    }

    private static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C10462R.C10467layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C10462R.C10467layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C10462R.C10467layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    /* renamed from: K */
    private void m68727K() {
        int i = (this.f49607c.getChildCount() != 0 || !this.f49600N) ? 0 : this.f49602P;
        NavigationMenuView navigationMenuView = this.f49606a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: A */
    public void mo58129A(@Nullable ColorStateList colorStateList) {
        this.f49589C = colorStateList;
        updateMenuView(false);
    }

    /* renamed from: B */
    public void mo58130B(int i) {
        this.f49601O = i;
        updateMenuView(false);
    }

    /* renamed from: C */
    public void mo58131C(@StyleRes int i) {
        this.f49587A = i;
        updateMenuView(false);
    }

    /* renamed from: D */
    public void mo58132D(@Nullable ColorStateList colorStateList) {
        this.f49588B = colorStateList;
        updateMenuView(false);
    }

    /* renamed from: E */
    public void mo58133E(@C0144Px int i) {
        this.f49592F = i;
        updateMenuView(false);
    }

    /* renamed from: F */
    public void mo58134F(int i) {
        this.f49604R = i;
        NavigationMenuView navigationMenuView = this.f49606a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: G */
    public void mo58135G(@Nullable ColorStateList colorStateList) {
        this.f49614z = colorStateList;
        updateMenuView(false);
    }

    /* renamed from: H */
    public void mo58136H(@C0144Px int i) {
        this.f49597K = i;
        updateMenuView(false);
    }

    /* renamed from: I */
    public void mo58137I(@StyleRes int i) {
        this.f49613s = i;
        updateMenuView(false);
    }

    /* renamed from: J */
    public void mo58138J(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.f49611o;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.mo58173L(z);
        }
    }

    /* renamed from: b */
    public void mo58139b(@NonNull View view) {
        this.f49607c.addView(view);
        NavigationMenuView navigationMenuView = this.f49606a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: c */
    public void mo58140c(@NonNull WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.f49602P != systemWindowInsetTop) {
            this.f49602P = systemWindowInsetTop;
            m68727K();
        }
        NavigationMenuView navigationMenuView = this.f49606a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.f49607c, windowInsetsCompat);
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Nullable
    /* renamed from: d */
    public MenuItemImpl mo58141d() {
        return this.f49611o.mo58166D();
    }

    @C0144Px
    /* renamed from: e */
    public int mo58142e() {
        return this.f49596J;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @C0144Px
    /* renamed from: f */
    public int mo58143f() {
        return this.f49595I;
    }

    public boolean flagActionItems() {
        return false;
    }

    /* renamed from: g */
    public int mo58144g() {
        return this.f49607c.getChildCount();
    }

    public int getId() {
        return this.f49610g;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f49606a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f49612p.inflate(C10462R.C10467layout.design_navigation_menu, viewGroup, false);
            this.f49606a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.f49606a));
            if (this.f49611o == null) {
                this.f49611o = new NavigationMenuAdapter();
            }
            int i = this.f49604R;
            if (i != -1) {
                this.f49606a.setOverScrollMode(i);
            }
            this.f49607c = (LinearLayout) this.f49612p.inflate(C10462R.C10467layout.design_navigation_item_header, this.f49606a, false);
            this.f49606a.setAdapter(this.f49611o);
        }
        return this.f49606a;
    }

    @Nullable
    /* renamed from: h */
    public Drawable mo58145h() {
        return this.f49590D;
    }

    /* renamed from: i */
    public int mo58146i() {
        return this.f49591E;
    }

    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f49612p = LayoutInflater.from(context);
        this.f49609f = menuBuilder;
        this.f49603Q = context.getResources().getDimensionPixelOffset(C10462R.dimen.design_navigation_separator_vertical_padding);
    }

    /* renamed from: j */
    public int mo58147j() {
        return this.f49593G;
    }

    /* renamed from: k */
    public int mo58148k() {
        return this.f49601O;
    }

    @Nullable
    /* renamed from: l */
    public ColorStateList mo58149l() {
        return this.f49588B;
    }

    @Nullable
    /* renamed from: m */
    public ColorStateList mo58150m() {
        return this.f49589C;
    }

    @C0144Px
    /* renamed from: n */
    public int mo58151n() {
        return this.f49592F;
    }

    @C0144Px
    /* renamed from: o */
    public int mo58152o() {
        return this.f49598L;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.f49608d;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f49606a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f49611o.mo58171J(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f49607c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f49606a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f49606a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.f49611o;
        if (navigationMenuAdapter != null) {
            bundle.putBundle("android:menu:adapter", navigationMenuAdapter.mo58165C());
        }
        if (this.f49607c != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f49607c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @C0144Px
    /* renamed from: p */
    public int mo58153p() {
        return this.f49597K;
    }

    /* renamed from: q */
    public View mo58154q(@LayoutRes int i) {
        View inflate = this.f49612p.inflate(i, this.f49607c, false);
        mo58139b(inflate);
        return inflate;
    }

    /* renamed from: r */
    public void mo58155r(boolean z) {
        if (this.f49600N != z) {
            this.f49600N = z;
            m68727K();
        }
    }

    /* renamed from: s */
    public void mo58156s(@NonNull MenuItemImpl menuItemImpl) {
        this.f49611o.mo58172K(menuItemImpl);
    }

    public void setCallback(MenuPresenter.Callback callback) {
        this.f49608d = callback;
    }

    /* renamed from: t */
    public void mo58157t(@C0144Px int i) {
        this.f49596J = i;
        updateMenuView(false);
    }

    /* renamed from: u */
    public void mo58158u(@C0144Px int i) {
        this.f49595I = i;
        updateMenuView(false);
    }

    public void updateMenuView(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.f49611o;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.mo58174M();
        }
    }

    /* renamed from: v */
    public void mo58159v(int i) {
        this.f49610g = i;
    }

    /* renamed from: w */
    public void mo58160w(@Nullable Drawable drawable) {
        this.f49590D = drawable;
        updateMenuView(false);
    }

    /* renamed from: x */
    public void mo58161x(int i) {
        this.f49591E = i;
        updateMenuView(false);
    }

    /* renamed from: y */
    public void mo58162y(int i) {
        this.f49593G = i;
        updateMenuView(false);
    }

    /* renamed from: z */
    public void mo58163z(@Dimension int i) {
        if (this.f49594H != i) {
            this.f49594H = i;
            this.f49599M = true;
            updateMenuView(false);
        }
    }
}
