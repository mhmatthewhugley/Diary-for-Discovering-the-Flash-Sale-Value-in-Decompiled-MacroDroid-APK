package com.arlosoft.macrodroid.selectableitemlist;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager2;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.wizard.AddedItemViewHolder;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p286i9.C12454b;
import p316l9.C15604c;
import p316l9.C15608g;

/* renamed from: com.arlosoft.macrodroid.selectableitemlist.e */
/* compiled from: ChosenItemsListItem.kt */
public final class C5096e extends C15604c<AddedItemViewHolder> {

    /* renamed from: f */
    private final Activity f12794f;

    /* renamed from: g */
    private final Macro f12795g;

    /* renamed from: h */
    private final int f12796h;

    /* renamed from: i */
    private List<? extends SelectableItem> f12797i = C13614t.m87748j();

    public C5096e(Activity activity, Macro macro, int i) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(macro, "macro");
        this.f12794f = activity;
        this.f12795g = macro;
        this.f12796h = i;
    }

    public boolean equals(Object obj) {
        return obj instanceof C5096e;
    }

    public int hashCode() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.list_item_wizard_header;
    }

    /* renamed from: w */
    public void mo29469g(C12454b<C15608g<?>> bVar, AddedItemViewHolder addedItemViewHolder, int i, List<?> list) {
        C13706o.m87929f(bVar, "adapter");
        C13706o.m87929f(addedItemViewHolder, "holder");
        C13706o.m87929f(list, "payloads");
        addedItemViewHolder.mo32920w(this.f12797i);
        ViewGroup.LayoutParams layoutParams = addedItemViewHolder.itemView.getLayoutParams();
        C13706o.m87927d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager2.LayoutParams");
        ((StaggeredGridLayoutManager2.LayoutParams) layoutParams).setFullSpan(true);
    }

    /* renamed from: x */
    public AddedItemViewHolder mo29472s(View view, C12454b<C15608g<?>> bVar) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(bVar, "adapter");
        return new AddedItemViewHolder(this.f12794f, view, this.f12795g, this.f12796h);
    }

    /* renamed from: y */
    public final void mo30064y(List<? extends SelectableItem> list) {
        C13706o.m87929f(list, "items");
        this.f12797i = list;
    }
}
