package com.arlosoft.macrodroid.actionblock.edit;

import androidx.lifecycle.Observer;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.actionblock.edit.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3722i implements Observer {

    /* renamed from: a */
    public final /* synthetic */ ActionBlockEditActivity f9777a;

    public /* synthetic */ C3722i(ActionBlockEditActivity actionBlockEditActivity) {
        this.f9777a = actionBlockEditActivity;
    }

    public final void onChanged(Object obj) {
        ActionBlockEditActivity.m14555P2(this.f9777a, (ActionBlock) obj);
    }
}
