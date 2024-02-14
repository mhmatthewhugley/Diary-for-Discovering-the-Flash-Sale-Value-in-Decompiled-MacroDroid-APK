package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.C4023j0;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.common.f0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4011f0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ List f10390a;

    /* renamed from: c */
    public final /* synthetic */ Activity f10391c;

    /* renamed from: d */
    public final /* synthetic */ String f10392d;

    /* renamed from: f */
    public final /* synthetic */ C4023j0.C4028e f10393f;

    /* renamed from: g */
    public final /* synthetic */ int f10394g;

    public /* synthetic */ C4011f0(List list, Activity activity, String str, C4023j0.C4028e eVar, int i) {
        this.f10390a = list;
        this.f10391c = activity;
        this.f10392d = str;
        this.f10393f = eVar;
        this.f10394g = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4023j0.m15756r0(this.f10390a, this.f10391c, this.f10392d, this.f10393f, this.f10394g, dialogInterface, i);
    }
}
