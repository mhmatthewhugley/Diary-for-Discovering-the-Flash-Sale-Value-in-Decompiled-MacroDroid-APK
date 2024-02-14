package com.arlosoft.macrodroid.actionblock.list;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.actionblock.list.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3760h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ActionBlockListActivity f9836a;

    /* renamed from: c */
    public final /* synthetic */ ActionBlock f9837c;

    public /* synthetic */ C3760h(ActionBlockListActivity actionBlockListActivity, ActionBlock actionBlock) {
        this.f9836a = actionBlockListActivity;
        this.f9837c = actionBlock;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActionBlockListActivity.m14703J2(this.f9836a, this.f9837c, dialogInterface, i);
    }
}
