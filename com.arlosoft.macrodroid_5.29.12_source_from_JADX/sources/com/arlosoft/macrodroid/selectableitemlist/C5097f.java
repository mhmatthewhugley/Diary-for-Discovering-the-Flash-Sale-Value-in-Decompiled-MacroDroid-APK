package com.arlosoft.macrodroid.selectableitemlist;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager2;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p286i9.C12454b;
import p316l9.C15605d;
import p316l9.C15608g;
import p334n9.C15763c;

/* renamed from: com.arlosoft.macrodroid.selectableitemlist.f */
/* compiled from: SelectableItemBlank.kt */
public final class C5097f extends C15605d<C15763c, SelectableItemCategoryHeader> {

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.f$a */
    /* compiled from: SelectableItemBlank.kt */
    public static final class C5098a extends C15763c {
        C5098a(View view, C12454b<C15608g<?>> bVar) {
            super(view, bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5097f(SelectableItemCategoryHeader selectableItemCategoryHeader) {
        super(selectableItemCategoryHeader);
        C13706o.m87929f(selectableItemCategoryHeader, "header");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5097f) || mo30069y() != ((C5097f) obj).mo30069y()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo30069y();
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.selectableitem_blank;
    }

    /* renamed from: w */
    public void mo29469g(C12454b<C15608g<?>> bVar, C15763c cVar, int i, List<?> list) {
        C13706o.m87929f(bVar, "adapter");
        C13706o.m87929f(cVar, "holder");
        C13706o.m87929f(list, "payloads");
        ViewGroup.LayoutParams layoutParams = cVar.itemView.getLayoutParams();
        C13706o.m87927d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager2.LayoutParams");
        ((StaggeredGridLayoutManager2.LayoutParams) layoutParams).setFullSpan(true);
    }

    /* renamed from: x */
    public C15763c mo29472s(View view, C12454b<C15608g<?>> bVar) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(bVar, "adapter");
        return new C5098a(view, bVar);
    }

    /* renamed from: y */
    public final int mo30069y() {
        return -2;
    }
}
