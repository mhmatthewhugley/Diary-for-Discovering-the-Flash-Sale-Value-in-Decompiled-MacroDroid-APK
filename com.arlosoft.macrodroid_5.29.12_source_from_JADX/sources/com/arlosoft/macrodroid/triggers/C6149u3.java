package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.u3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6149u3 implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    public final /* synthetic */ IncomingSMSTrigger f14615a;

    /* renamed from: b */
    public final /* synthetic */ List f14616b;

    public /* synthetic */ C6149u3(IncomingSMSTrigger incomingSMSTrigger, List list) {
        this.f14615a = incomingSMSTrigger;
        this.f14616b = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f14615a.m22367V3(this.f14616b, dialogInterface, i, z);
    }
}
