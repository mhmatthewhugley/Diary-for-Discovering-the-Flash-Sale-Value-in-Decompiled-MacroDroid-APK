package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationBarMenu extends MenuBuilder {
    @NonNull

    /* renamed from: a */
    private final Class<?> f49722a;

    /* renamed from: b */
    private final int f49723b;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.f49722a = cls;
        this.f49723b = i;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public MenuItem addInternal(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.f49723b) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i, i2, i3, charSequence);
            if (addInternal instanceof MenuItemImpl) {
                ((MenuItemImpl) addInternal).setExclusiveCheckable(true);
            }
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.f49722a.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f49723b + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @NonNull
    public SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f49722a.getSimpleName() + " does not support submenus");
    }
}
