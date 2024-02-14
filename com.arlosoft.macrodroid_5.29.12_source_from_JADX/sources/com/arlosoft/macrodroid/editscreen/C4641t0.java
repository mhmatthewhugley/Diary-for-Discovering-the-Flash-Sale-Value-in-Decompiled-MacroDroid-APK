package com.arlosoft.macrodroid.editscreen;

import android.view.View;
import com.arlosoft.macrodroid.common.SelectableItem;
import kotlin.jvm.internal.C13682c0;

/* renamed from: com.arlosoft.macrodroid.editscreen.t0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4641t0 implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C13682c0 f11713a;

    /* renamed from: c */
    public final /* synthetic */ SelectableItemsViewHolder f11714c;

    /* renamed from: d */
    public final /* synthetic */ SelectableItem f11715d;

    public /* synthetic */ C4641t0(C13682c0 c0Var, SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem) {
        this.f11713a = c0Var;
        this.f11714c = selectableItemsViewHolder;
        this.f11715d = selectableItem;
    }

    public final boolean onLongClick(View view) {
        return SelectableItemsViewHolder.m18026K(this.f11713a, this.f11714c, this.f11715d, view);
    }
}
