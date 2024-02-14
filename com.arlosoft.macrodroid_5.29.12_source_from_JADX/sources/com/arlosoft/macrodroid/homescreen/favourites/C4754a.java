package com.arlosoft.macrodroid.homescreen.favourites;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p247e6.C12147d;
import p247e6.C12154k;

/* renamed from: com.arlosoft.macrodroid.homescreen.favourites.a */
/* compiled from: FavouritesAdapter.kt */
public final class C4754a extends RecyclerView.Adapter<C4756c> implements C12147d<C4756c> {

    /* renamed from: a */
    private List<Macro> f11941a;

    /* renamed from: c */
    private boolean f11942c;

    /* renamed from: d */
    private C4758d f11943d;

    public C4754a(List<Macro> list) {
        C13706o.m87929f(list, "macros");
        this.f11941a = list;
        setHasStableIds(true);
    }

    /* renamed from: B */
    public void onBindViewHolder(C4756c cVar, int i) {
        C13706o.m87929f(cVar, "holder");
        cVar.mo29298u(this.f11941a.get(i), this.f11942c);
    }

    /* renamed from: C */
    public boolean mo29074x(C4756c cVar, int i, int i2, int i3) {
        C13706o.m87929f(cVar, "holder");
        return true;
    }

    /* renamed from: D */
    public C4756c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_favourites, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…avourites, parent, false)");
        return new C4756c(inflate, this.f11943d);
    }

    /* renamed from: E */
    public C12154k mo29073s(C4756c cVar, int i) {
        C13706o.m87929f(cVar, "holder");
        return null;
    }

    /* renamed from: F */
    public final void mo29296F(C4758d dVar) {
        C13706o.m87929f(dVar, "macroSelectedListener");
        this.f11943d = dVar;
    }

    /* renamed from: b */
    public void mo29069b(int i) {
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public void mo29070c(int i, int i2, boolean z) {
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f11941a.size();
    }

    public long getItemId(int i) {
        return this.f11941a.get(i).getGUID();
    }

    /* renamed from: h */
    public void mo29071h(int i, int i2) {
        this.f11941a.add(i2, this.f11941a.remove(i));
    }

    /* renamed from: q */
    public boolean mo29072q(int i, int i2) {
        return true;
    }
}
