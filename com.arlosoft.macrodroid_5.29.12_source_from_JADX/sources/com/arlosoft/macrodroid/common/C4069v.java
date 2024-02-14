package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.common.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4069v implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f10645a;

    /* renamed from: c */
    public final /* synthetic */ Macro f10646c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f10647d;

    /* renamed from: f */
    public final /* synthetic */ int f10648f;

    public /* synthetic */ C4069v(Activity activity, Macro macro, C4023j0.C4028e eVar, int i) {
        this.f10645a = activity;
        this.f10646c = macro;
        this.f10647d = eVar;
        this.f10648f = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4023j0.m15744l0(this.f10645a, this.f10646c, this.f10647d, this.f10648f, dialogInterface, i);
    }
}
