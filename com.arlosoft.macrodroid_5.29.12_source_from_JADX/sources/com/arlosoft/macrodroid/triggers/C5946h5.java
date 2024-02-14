package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.h5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5946h5 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ModeEnterExitTrigger f14085a;

    /* renamed from: c */
    public final /* synthetic */ List f14086c;

    /* renamed from: d */
    public final /* synthetic */ String[] f14087d;

    public /* synthetic */ C5946h5(ModeEnterExitTrigger modeEnterExitTrigger, List list, String[] strArr) {
        this.f14085a = modeEnterExitTrigger;
        this.f14086c = list;
        this.f14087d = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14085a.m22722t3(this.f14086c, this.f14087d, dialogInterface, i);
    }
}
