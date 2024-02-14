package com.arlosoft.macrodroid.selectableitemlist;

import android.view.View;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem;

/* renamed from: com.arlosoft.macrodroid.selectableitemlist.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5101i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectableItemListItem.ViewHolder f12803a;

    /* renamed from: c */
    public final /* synthetic */ C4001c1 f12804c;

    public /* synthetic */ C5101i(SelectableItemListItem.ViewHolder viewHolder, C4001c1 c1Var) {
        this.f12803a = viewHolder;
        this.f12804c = c1Var;
    }

    public final void onClick(View view) {
        SelectableItemListItem.ViewHolder.m19649E(this.f12803a, this.f12804c, view);
    }
}
