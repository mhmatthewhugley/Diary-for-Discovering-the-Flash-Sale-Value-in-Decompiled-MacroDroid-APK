package com.arlosoft.macrodroid.selectableitemlist;

import android.view.View;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem;

/* renamed from: com.arlosoft.macrodroid.selectableitemlist.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5102j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectableItemListItem.ViewHolder f12805a;

    /* renamed from: c */
    public final /* synthetic */ C4001c1 f12806c;

    public /* synthetic */ C5102j(SelectableItemListItem.ViewHolder viewHolder, C4001c1 c1Var) {
        this.f12805a = viewHolder;
        this.f12806c = c1Var;
    }

    public final void onClick(View view) {
        SelectableItemListItem.ViewHolder.m19651G(this.f12805a, this.f12806c, view);
    }
}
