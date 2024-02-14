package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.rj */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3403rj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShareLocationAction f9052a;

    /* renamed from: c */
    public final /* synthetic */ List f9053c;

    public /* synthetic */ C3403rj(ShareLocationAction shareLocationAction, List list) {
        this.f9052a = shareLocationAction;
        this.f9053c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9052a.m12889F4(this.f9053c, dialogInterface, i);
    }
}
