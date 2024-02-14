package com.arlosoft.macrodroid.selectableitemlist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager2;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.widget.AddSelectableItemInfoCard;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p286i9.C12454b;
import p316l9.C15604c;
import p316l9.C15608g;

/* renamed from: com.arlosoft.macrodroid.selectableitemlist.h */
/* compiled from: SelectableItemInfoCard.kt */
public final class C5100h extends C15604c<AddSelectableItemInfoCard.ViewHolder> {

    /* renamed from: f */
    private final Context f12798f;

    /* renamed from: g */
    private final int f12799g;

    /* renamed from: h */
    private final boolean f12800h;

    /* renamed from: i */
    private final AddSelectableItemInfoCard.C6628a f12801i;

    /* renamed from: j */
    private final boolean f12802j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5100h(Context context, int i, boolean z, AddSelectableItemInfoCard.C6628a aVar, boolean z2, int i2, C13695i iVar) {
        this(context, i, z, aVar, (i2 & 16) != 0 ? false : z2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5100h) || mo30074y() != ((C5100h) obj).mo30074y()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo30074y();
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.info_card;
    }

    /* renamed from: w */
    public void mo29469g(C12454b<C15608g<?>> bVar, AddSelectableItemInfoCard.ViewHolder viewHolder, int i, List<?> list) {
        C13706o.m87929f(bVar, "adapter");
        C13706o.m87929f(viewHolder, "holder");
        C13706o.m87929f(list, "payloads");
        AddSelectableItemInfoCard.m25103d(this.f12798f, viewHolder, this.f12799g, this.f12800h, this.f12801i);
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        C13706o.m87927d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager2.LayoutParams");
        StaggeredGridLayoutManager2.LayoutParams layoutParams2 = (StaggeredGridLayoutManager2.LayoutParams) layoutParams;
        layoutParams2.setFullSpan(true);
        if (this.f12802j) {
            layoutParams2.bottomMargin = 0;
        }
    }

    /* renamed from: x */
    public AddSelectableItemInfoCard.ViewHolder mo29472s(View view, C12454b<C15608g<?>> bVar) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(bVar, "adapter");
        return new AddSelectableItemInfoCard.ViewHolder(view);
    }

    /* renamed from: y */
    public final int mo30074y() {
        return -1;
    }

    public C5100h(Context context, int i, boolean z, AddSelectableItemInfoCard.C6628a aVar, boolean z2) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "dismissListener");
        this.f12798f = context;
        this.f12799g = i;
        this.f12800h = z;
        this.f12801i = aVar;
        this.f12802j = z2;
    }
}
