package com.afollestad.materialdialogs.prefs;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.afollestad.materialdialogs.commons.R$layout;
import com.afollestad.materialdialogs.commons.R$styleable;
import java.lang.reflect.Method;

/* renamed from: com.afollestad.materialdialogs.prefs.a */
/* compiled from: PrefUtil */
class C1450a {
    /* renamed from: a */
    static void m702a(@NonNull Preference preference, @NonNull PreferenceManager.OnActivityDestroyListener onActivityDestroyListener) {
        try {
            PreferenceManager preferenceManager = preference.getPreferenceManager();
            Method declaredMethod = preferenceManager.getClass().getDeclaredMethod("registerOnActivityDestroyListener", new Class[]{PreferenceManager.OnActivityDestroyListener.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(preferenceManager, new Object[]{onActivityDestroyListener});
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    static void m703b(@NonNull Context context, @NonNull Preference preference, @Nullable AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (attributeSet != null) {
            int i = 0;
            while (true) {
                if (i < attributeSet.getAttributeCount()) {
                    if (((XmlResourceParser) attributeSet).getAttributeNamespace(0).equals("http://schemas.android.com/apk/res/android") && attributeSet.getAttributeName(i).equals("layout")) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.Preference, 0, 0);
            try {
                z2 = obtainStyledAttributes.getBoolean(R$styleable.Preference_useStockLayout, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (!z && !z2) {
            preference.setLayoutResource(R$layout.md_preference_custom);
        }
    }

    /* renamed from: c */
    static void m704c(@NonNull Preference preference, @NonNull PreferenceManager.OnActivityDestroyListener onActivityDestroyListener) {
        try {
            PreferenceManager preferenceManager = preference.getPreferenceManager();
            Method declaredMethod = preferenceManager.getClass().getDeclaredMethod("unregisterOnActivityDestroyListener", new Class[]{PreferenceManager.OnActivityDestroyListener.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(preferenceManager, new Object[]{onActivityDestroyListener});
        } catch (Exception unused) {
        }
    }
}
