package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.ok */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3317ok implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f8870a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f8871c;

    /* renamed from: d */
    public final /* synthetic */ ShellScriptAction f8872d;

    public /* synthetic */ C3317ok(Activity activity, C4023j0.C4028e eVar, ShellScriptAction shellScriptAction) {
        this.f8870a = activity;
        this.f8871c = eVar;
        this.f8872d = shellScriptAction;
    }

    public final void onClick(View view) {
        ShellScriptAction.m13002F3(this.f8870a, this.f8871c, this.f8872d, view);
    }
}
