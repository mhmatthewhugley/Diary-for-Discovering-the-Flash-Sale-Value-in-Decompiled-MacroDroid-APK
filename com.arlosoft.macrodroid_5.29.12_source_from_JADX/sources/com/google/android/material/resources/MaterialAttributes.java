package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialAttributes {
    @Nullable
    /* renamed from: a */
    public static TypedValue m69116a(@NonNull Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m69117b(@NonNull Context context, @AttrRes int i, boolean z) {
        TypedValue a = m69116a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }

    /* renamed from: c */
    public static int m69118c(@NonNull Context context, @AttrRes int i, int i2) {
        TypedValue a = m69116a(context, i);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    /* renamed from: d */
    public static int m69119d(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        TypedValue a = m69116a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: e */
    public static int m69120e(@NonNull View view, @AttrRes int i) {
        return m69119d(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
