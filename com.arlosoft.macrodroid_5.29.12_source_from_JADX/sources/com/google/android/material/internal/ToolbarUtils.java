package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ToolbarUtils {
    private ToolbarUtils() {
    }

    @Nullable
    /* renamed from: a */
    public static ActionMenuItemView m68824a(@NonNull Toolbar toolbar, @IdRes int i) {
        ActionMenuView b = m68825b(toolbar);
        if (b == null) {
            return null;
        }
        for (int i2 = 0; i2 < b.getChildCount(); i2++) {
            View childAt = b.getChildAt(i2);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static ActionMenuView m68825b(@NonNull Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static TextView m68826c(@NonNull Toolbar toolbar) {
        return m68827d(toolbar, toolbar.getSubtitle());
    }

    @Nullable
    /* renamed from: d */
    private static TextView m68827d(@NonNull Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static TextView m68828e(@NonNull Toolbar toolbar) {
        return m68827d(toolbar, toolbar.getTitle());
    }
}
