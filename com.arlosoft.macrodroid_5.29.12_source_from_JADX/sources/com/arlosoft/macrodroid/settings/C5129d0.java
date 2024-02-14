package com.arlosoft.macrodroid.settings;

import androidx.preference.Preference;
import com.arlosoft.macrodroid.common.EncryptedEditTextPreference;

/* renamed from: com.arlosoft.macrodroid.settings.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5129d0 implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EncryptedEditTextPreference f12880a;

    public /* synthetic */ C5129d0(EncryptedEditTextPreference encryptedEditTextPreference) {
        this.f12880a = encryptedEditTextPreference;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return C5141f2.m19801C1(this.f12880a, preference, obj);
    }
}
