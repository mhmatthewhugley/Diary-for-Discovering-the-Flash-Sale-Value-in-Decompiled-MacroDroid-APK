package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.C4023j0;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.common.e0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4006e0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ List f10376a;

    /* renamed from: c */
    public final /* synthetic */ Activity f10377c;

    /* renamed from: d */
    public final /* synthetic */ String f10378d;

    /* renamed from: f */
    public final /* synthetic */ C4023j0.C4028e f10379f;

    /* renamed from: g */
    public final /* synthetic */ int f10380g;

    public /* synthetic */ C4006e0(List list, Activity activity, String str, C4023j0.C4028e eVar, int i) {
        this.f10376a = list;
        this.f10377c = activity;
        this.f10378d = str;
        this.f10379f = eVar;
        this.f10380g = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4023j0.m15736h0(this.f10376a, this.f10377c, this.f10378d, this.f10379f, this.f10380g, dialogInterface, i);
    }
}
