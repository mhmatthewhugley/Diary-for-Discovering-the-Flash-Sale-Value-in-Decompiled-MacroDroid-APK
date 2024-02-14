package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.cn */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2982cn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextManipulationAction f8156a;

    /* renamed from: c */
    public final /* synthetic */ List f8157c;

    public /* synthetic */ C2982cn(TextManipulationAction textManipulationAction, List list) {
        this.f8156a = textManipulationAction;
        this.f8157c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8156a.m13348Q3(this.f8157c, dialogInterface, i);
    }
}
