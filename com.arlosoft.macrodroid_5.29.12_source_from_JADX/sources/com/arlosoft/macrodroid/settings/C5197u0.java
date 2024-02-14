package com.arlosoft.macrodroid.settings;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.preference.Preference;

/* renamed from: com.arlosoft.macrodroid.settings.u0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5197u0 implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public static final /* synthetic */ C5197u0 f12998a = new C5197u0();

    private /* synthetic */ C5197u0() {
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return AppCompatDelegate.setDefaultNightMode(Integer.parseInt((String) obj));
    }
}
