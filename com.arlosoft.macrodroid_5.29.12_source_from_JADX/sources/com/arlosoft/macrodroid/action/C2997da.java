package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.da */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2997da implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MakeCallAction f8185a;

    /* renamed from: c */
    public final /* synthetic */ List f8186c;

    public /* synthetic */ C2997da(MakeCallAction makeCallAction, List list) {
        this.f8185a = makeCallAction;
        this.f8186c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8185a.m11485v3(this.f8186c, dialogInterface, i);
    }
}
