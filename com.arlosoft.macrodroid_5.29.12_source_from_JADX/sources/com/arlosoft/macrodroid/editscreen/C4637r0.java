package com.arlosoft.macrodroid.editscreen;

import android.view.View;
import com.arlosoft.macrodroid.common.SelectableItem;

/* renamed from: com.arlosoft.macrodroid.editscreen.r0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4637r0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectableItem f11704a;

    /* renamed from: c */
    public final /* synthetic */ SelectableItemsViewHolder f11705c;

    public /* synthetic */ C4637r0(SelectableItem selectableItem, SelectableItemsViewHolder selectableItemsViewHolder) {
        this.f11704a = selectableItem;
        this.f11705c = selectableItemsViewHolder;
    }

    public final void onClick(View view) {
        SelectableItemsViewHolder.m18024I(this.f11704a, this.f11705c, view);
    }
}
