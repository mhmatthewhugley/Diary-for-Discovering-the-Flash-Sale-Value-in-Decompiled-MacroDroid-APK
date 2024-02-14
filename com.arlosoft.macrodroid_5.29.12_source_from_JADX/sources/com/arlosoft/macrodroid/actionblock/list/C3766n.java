package com.arlosoft.macrodroid.actionblock.list;

import androidx.lifecycle.Observer;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.actionblock.list.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3766n implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ActionBlockListActivity f9847a;

    public /* synthetic */ C3766n(ActionBlockListActivity actionBlockListActivity) {
        this.f9847a = actionBlockListActivity;
    }

    public final void onChanged(Object obj) {
        ActionBlockListActivity.m14726n2(this.f9847a, (ActionBlock) obj);
    }
}
