package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.mh */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3258mh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetQuickSettingsStateAction f8706a;

    /* renamed from: c */
    public final /* synthetic */ Activity f8707c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f8708d;

    public /* synthetic */ C3258mh(SetQuickSettingsStateAction setQuickSettingsStateAction, Activity activity, C4023j0.C4028e eVar) {
        this.f8706a = setQuickSettingsStateAction;
        this.f8707c = activity;
        this.f8708d = eVar;
    }

    public final void onClick(View view) {
        this.f8706a.m12581F3(this.f8707c, this.f8708d, view);
    }
}
