package com.arlosoft.macrodroid.settings;

import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* renamed from: com.arlosoft.macrodroid.settings.n0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5176n0 implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C5141f2 f12961a;

    /* renamed from: b */
    public final /* synthetic */ ListPreference f12962b;

    public /* synthetic */ C5176n0(C5141f2 f2Var, ListPreference listPreference) {
        this.f12961a = f2Var;
        this.f12962b = listPreference;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return this.f12961a.m19884l2(this.f12962b, preference, obj);
    }
}
