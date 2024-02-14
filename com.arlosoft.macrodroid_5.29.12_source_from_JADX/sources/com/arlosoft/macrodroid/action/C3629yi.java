package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import com.arlosoft.macrodroid.action.SetVolumeAction;

/* renamed from: com.arlosoft.macrodroid.action.yi */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3629yi implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SetVolumeAction.C2669c f9645a;

    /* renamed from: b */
    public final /* synthetic */ int f9646b;

    /* renamed from: c */
    public final /* synthetic */ SetVolumeAction.C2668b f9647c;

    public /* synthetic */ C3629yi(SetVolumeAction.C2669c cVar, int i, SetVolumeAction.C2668b bVar) {
        this.f9645a = cVar;
        this.f9646b = i;
        this.f9647c = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f9645a.m12795h(this.f9646b, this.f9647c, compoundButton, z);
    }
}
