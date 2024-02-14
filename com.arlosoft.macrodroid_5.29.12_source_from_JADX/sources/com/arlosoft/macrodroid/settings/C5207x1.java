package com.arlosoft.macrodroid.settings;

import android.widget.EditText;
import androidx.preference.Preference;

/* renamed from: com.arlosoft.macrodroid.settings.x1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5207x1 implements Preference.SummaryProvider {

    /* renamed from: a */
    public final /* synthetic */ C5141f2 f13014a;

    /* renamed from: b */
    public final /* synthetic */ EditText f13015b;

    public /* synthetic */ C5207x1(C5141f2 f2Var, EditText editText) {
        this.f13014a = f2Var;
        this.f13015b = editText;
    }

    public final CharSequence provideSummary(Preference preference) {
        return this.f13014a.m19816H1(this.f13015b, preference);
    }
}
