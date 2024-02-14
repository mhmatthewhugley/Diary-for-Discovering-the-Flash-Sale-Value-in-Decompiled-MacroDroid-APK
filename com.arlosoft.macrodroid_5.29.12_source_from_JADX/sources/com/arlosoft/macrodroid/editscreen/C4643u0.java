package com.arlosoft.macrodroid.editscreen;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.arlosoft.macrodroid.common.SelectableItem;
import p216ba.C11113d;

/* renamed from: com.arlosoft.macrodroid.editscreen.u0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4643u0 implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ SelectableItemsViewHolder f11717a;

    /* renamed from: c */
    public final /* synthetic */ SelectableItem f11718c;

    /* renamed from: d */
    public final /* synthetic */ TextView f11719d;

    /* renamed from: f */
    public final /* synthetic */ ImageView f11720f;

    /* renamed from: g */
    public final /* synthetic */ ViewGroup f11721g;

    public /* synthetic */ C4643u0(SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem, TextView textView, ImageView imageView, ViewGroup viewGroup) {
        this.f11717a = selectableItemsViewHolder;
        this.f11718c = selectableItem;
        this.f11719d = textView;
        this.f11720f = imageView;
        this.f11721g = viewGroup;
    }

    public final void accept(Object obj) {
        SelectableItemsViewHolder.m18025J(this.f11717a, this.f11718c, this.f11719d, this.f11720f, this.f11721g, (Boolean) obj);
    }
}
