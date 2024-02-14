package com.arlosoft.macrodroid.actionblock.list;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.actionblock.list.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3759g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ActionBlockListActivity f9834a;

    /* renamed from: c */
    public final /* synthetic */ ActionBlock f9835c;

    public /* synthetic */ C3759g(ActionBlockListActivity actionBlockListActivity, ActionBlock actionBlock) {
        this.f9834a = actionBlockListActivity;
        this.f9835c = actionBlock;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActionBlockListActivity.m14697D2(this.f9834a, this.f9835c, dialogInterface, i);
    }
}
