package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: com.arlosoft.macrodroid.triggers.k5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5982k5 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NFCTrigger f14153a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14154c;

    /* renamed from: d */
    public final /* synthetic */ Activity f14155d;

    public /* synthetic */ C5982k5(NFCTrigger nFCTrigger, EditText editText, Activity activity) {
        this.f14153a = nFCTrigger;
        this.f14154c = editText;
        this.f14155d = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14153a.m22774q3(this.f14154c, this.f14155d, dialogInterface, i);
    }
}
