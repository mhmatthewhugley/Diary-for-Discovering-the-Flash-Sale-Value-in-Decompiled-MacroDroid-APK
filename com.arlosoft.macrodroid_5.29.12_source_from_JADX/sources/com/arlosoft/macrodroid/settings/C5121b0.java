package com.arlosoft.macrodroid.settings;

import android.widget.EditText;
import androidx.preference.EditTextPreference;
import com.arlosoft.macrodroid.common.EncryptedEditTextPreference;

/* renamed from: com.arlosoft.macrodroid.settings.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5121b0 implements EditTextPreference.OnBindEditTextListener {

    /* renamed from: a */
    public final /* synthetic */ C5141f2 f12859a;

    /* renamed from: b */
    public final /* synthetic */ EncryptedEditTextPreference f12860b;

    public /* synthetic */ C5121b0(C5141f2 f2Var, EncryptedEditTextPreference encryptedEditTextPreference) {
        this.f12859a = f2Var;
        this.f12860b = encryptedEditTextPreference;
    }

    public final void onBindEditText(EditText editText) {
        this.f12859a.m19796A1(this.f12860b, editText);
    }
}
