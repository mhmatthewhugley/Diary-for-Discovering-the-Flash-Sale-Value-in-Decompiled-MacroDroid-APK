package com.arlosoft.macrodroid.action.activities.httprequest;

import android.app.Dialog;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.action.HttpParam;
import com.arlosoft.macrodroid.action.activities.httprequest.C2868q;

/* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2864m implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2868q f7938a;

    /* renamed from: c */
    public final /* synthetic */ C2868q.C2873c f7939c;

    /* renamed from: d */
    public final /* synthetic */ HttpParam f7940d;

    /* renamed from: f */
    public final /* synthetic */ Dialog f7941f;

    public /* synthetic */ C2864m(C2868q qVar, C2868q.C2873c cVar, HttpParam httpParam, Dialog dialog) {
        this.f7938a = qVar;
        this.f7939c = cVar;
        this.f7940d = httpParam;
        this.f7941f = dialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C2868q.m14105n0(this.f7938a, this.f7939c, this.f7940d, this.f7941f, dialogInterface, i);
    }
}
