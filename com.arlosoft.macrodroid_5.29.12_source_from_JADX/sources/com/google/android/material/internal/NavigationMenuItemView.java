package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0146R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C10462R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {

    /* renamed from: H */
    private static final int[] f49575H = {16842912};

    /* renamed from: A */
    private final CheckedTextView f49576A;

    /* renamed from: B */
    private FrameLayout f49577B;

    /* renamed from: C */
    private MenuItemImpl f49578C;

    /* renamed from: D */
    private ColorStateList f49579D;

    /* renamed from: E */
    private boolean f49580E;

    /* renamed from: F */
    private Drawable f49581F;

    /* renamed from: G */
    private final AccessibilityDelegateCompat f49582G;

    /* renamed from: p */
    private int f49583p;

    /* renamed from: s */
    private boolean f49584s;

    /* renamed from: z */
    boolean f49585z;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m68723a() {
        if (m68725d()) {
            this.f49576A.setVisibility(8);
            FrameLayout frameLayout = this.f49577B;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.f49577B.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f49576A.setVisibility(0);
        FrameLayout frameLayout2 = this.f49577B;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.f49577B.setLayoutParams(layoutParams2);
        }
    }

    @Nullable
    /* renamed from: b */
    private StateListDrawable m68724b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0146R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f49575H, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: d */
    private boolean m68725d() {
        return this.f49578C.getTitle() == null && this.f49578C.getIcon() == null && this.f49578C.getActionView() != null;
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f49577B == null) {
                this.f49577B = (FrameLayout) ((ViewStub) findViewById(C10462R.C10465id.design_menu_item_action_area_stub)).inflate();
            }
            this.f49577B.removeAllViews();
            this.f49577B.addView(view);
        }
    }

    /* renamed from: c */
    public void mo58119c() {
        FrameLayout frameLayout = this.f49577B;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f49576A.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public MenuItemImpl getItemData() {
        return this.f49578C;
    }

    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i) {
        this.f49578C = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.setBackground(this, m68724b());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        m68723a();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.f49578C;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f49578C.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f49575H);
        }
        return onCreateDrawableState;
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f49585z != z) {
            this.f49585z = z;
            this.f49582G.sendAccessibilityEvent(this.f49576A, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f49576A.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f49580E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                DrawableCompat.setTintList(drawable, this.f49579D);
            }
            int i = this.f49583p;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f49584s) {
            if (this.f49581F == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), C10462R.C10464drawable.navigation_empty_icon, getContext().getTheme());
                this.f49581F = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f49583p;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f49581F;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.f49576A, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f49576A.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@Dimension int i) {
        this.f49583p = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f49579D = colorStateList;
        this.f49580E = colorStateList != null;
        MenuItemImpl menuItemImpl = this.f49578C;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f49576A.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f49584s = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        TextViewCompat.setTextAppearance(this.f49576A, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f49576A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f49576A.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C105731 r4 = new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(NavigationMenuItemView.this.f49585z);
            }
        };
        this.f49582G = r4;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C10462R.C10467layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C10462R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C10462R.C10465id.design_menu_item_text);
        this.f49576A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(checkedTextView, r4);
    }
}
