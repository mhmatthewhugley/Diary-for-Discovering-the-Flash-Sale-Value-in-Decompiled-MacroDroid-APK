package com.arlosoft.macrodroid.settings;

import androidx.preference.Preference;
import com.arlosoft.macrodroid.settings.C5141f2;

/* renamed from: com.arlosoft.macrodroid.settings.q0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5185q0 implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C5141f2 f12977a;

    /* renamed from: b */
    public final /* synthetic */ String[] f12978b;

    /* renamed from: c */
    public final /* synthetic */ C5141f2.C5147f[] f12979c;

    public /* synthetic */ C5185q0(C5141f2 f2Var, String[] strArr, C5141f2.C5147f[] fVarArr) {
        this.f12977a = f2Var;
        this.f12978b = strArr;
        this.f12979c = fVarArr;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return this.f12977a.m19856Y1(this.f12978b, this.f12979c, preference, obj);
    }
}
