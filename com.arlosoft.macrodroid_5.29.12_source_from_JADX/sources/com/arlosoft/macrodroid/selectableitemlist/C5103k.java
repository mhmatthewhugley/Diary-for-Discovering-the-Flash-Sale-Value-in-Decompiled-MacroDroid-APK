package com.arlosoft.macrodroid.selectableitemlist;

import android.view.View;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem;

/* renamed from: com.arlosoft.macrodroid.selectableitemlist.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5103k implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectableItemListItem.ViewHolder f12807a;

    /* renamed from: c */
    public final /* synthetic */ C4001c1 f12808c;

    public /* synthetic */ C5103k(SelectableItemListItem.ViewHolder viewHolder, C4001c1 c1Var) {
        this.f12807a = viewHolder;
        this.f12808c = c1Var;
    }

    public final boolean onLongClick(View view) {
        return SelectableItemListItem.ViewHolder.m19650F(this.f12807a, this.f12808c, view);
    }
}
