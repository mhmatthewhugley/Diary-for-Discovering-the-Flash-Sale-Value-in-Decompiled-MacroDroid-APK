package com.arlosoft.macrodroid.actionblock.edit;

import androidx.lifecycle.Observer;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.actionblock.edit.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3723j implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ActionBlockEditActivity f9778a;

    public /* synthetic */ C3723j(ActionBlockEditActivity actionBlockEditActivity) {
        this.f9778a = actionBlockEditActivity;
    }

    public final void onChanged(Object obj) {
        ActionBlockEditActivity.m14551N2(this.f9778a, (ActionBlock) obj);
    }
}
