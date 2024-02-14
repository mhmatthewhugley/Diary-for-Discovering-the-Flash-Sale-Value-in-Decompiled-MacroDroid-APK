package com.arlosoft.macrodroid.constraint;

import android.view.View;
import android.widget.Spinner;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.constraint.f3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4254f3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Spinner f10840a;

    /* renamed from: c */
    public final /* synthetic */ SystemSettingConstraint f10841c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f10842d;

    public /* synthetic */ C4254f3(Spinner spinner, SystemSettingConstraint systemSettingConstraint, C4023j0.C4028e eVar) {
        this.f10840a = spinner;
        this.f10841c = systemSettingConstraint;
        this.f10842d = eVar;
    }

    public final void onClick(View view) {
        SystemSettingConstraint.m17073x3(this.f10840a, this.f10841c, this.f10842d, view);
    }
}
