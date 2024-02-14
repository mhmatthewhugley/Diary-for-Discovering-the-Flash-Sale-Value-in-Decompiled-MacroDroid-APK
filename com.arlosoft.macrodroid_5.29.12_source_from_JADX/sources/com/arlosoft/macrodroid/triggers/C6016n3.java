package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.n3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6016n3 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IncomingSMSTrigger f14208a;

    /* renamed from: c */
    public final /* synthetic */ List f14209c;

    public /* synthetic */ C6016n3(IncomingSMSTrigger incomingSMSTrigger, List list) {
        this.f14208a = incomingSMSTrigger;
        this.f14209c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14208a.m22368W3(this.f14209c, dialogInterface, i);
    }
}
