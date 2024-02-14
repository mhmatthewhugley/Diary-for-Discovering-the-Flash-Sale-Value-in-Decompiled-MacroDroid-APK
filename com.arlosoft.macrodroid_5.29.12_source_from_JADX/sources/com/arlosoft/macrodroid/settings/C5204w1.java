package com.arlosoft.macrodroid.settings;

import android.widget.EditText;
import androidx.preference.Preference;

/* renamed from: com.arlosoft.macrodroid.settings.w1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5204w1 implements Preference.SummaryProvider {

    /* renamed from: a */
    public final /* synthetic */ C5141f2 f13011a;

    /* renamed from: b */
    public final /* synthetic */ EditText f13012b;

    public /* synthetic */ C5204w1(C5141f2 f2Var, EditText editText) {
        this.f13011a = f2Var;
        this.f13012b = editText;
    }

    public final CharSequence provideSummary(Preference preference) {
        return this.f13011a.m19917z1(this.f13012b, preference);
    }
}
