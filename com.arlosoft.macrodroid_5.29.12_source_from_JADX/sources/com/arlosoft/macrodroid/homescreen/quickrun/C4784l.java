package com.arlosoft.macrodroid.homescreen.quickrun;

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

/* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.l */
/* compiled from: QuickRunMacroAdapter.kt */
public final class C4784l extends RecyclerView.Adapter<C4786n> implements C12147d<C4786n> {

    /* renamed from: a */
    private List<Macro> f11986a;

    /* renamed from: c */
    private boolean f11987c;

    /* renamed from: d */
    private C4773a f11988d;

    public C4784l(List<Macro> list) {
        C13706o.m87929f(list, "macros");
        this.f11986a = list;
        setHasStableIds(true);
    }

    /* renamed from: B */
    public final List<Macro> mo29318B() {
        return this.f11986a;
    }

    /* renamed from: C */
    public final boolean mo29319C() {
        return this.f11987c;
    }

    /* renamed from: D */
    public void onBindViewHolder(C4786n nVar, int i) {
        C13706o.m87929f(nVar, "holder");
        nVar.mo29328u(this.f11986a.get(i), this.f11987c);
    }

    /* renamed from: E */
    public boolean mo29074x(C4786n nVar, int i, int i2, int i3) {
        C13706o.m87929f(nVar, "holder");
        return true;
    }

    /* renamed from: F */
    public C4786n onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_quick_run_macro, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…run_macro, parent, false)");
        return new C4786n(inflate, this.f11988d);
    }

    /* renamed from: G */
    public C12154k mo29073s(C4786n nVar, int i) {
        C13706o.m87929f(nVar, "holder");
        return null;
    }

    /* renamed from: H */
    public final void mo29324H(Macro macro) {
        C13706o.m87929f(macro, "macro");
        int indexOf = this.f11986a.indexOf(macro);
        this.f11986a.remove(macro);
        notifyItemRemoved(indexOf);
    }

    /* renamed from: I */
    public final void mo29325I(C4773a aVar) {
        C13706o.m87929f(aVar, "macroSelectedListener");
        this.f11988d = aVar;
    }

    /* renamed from: J */
    public final void mo29326J(boolean z) {
        this.f11987c = z;
        notifyDataSetChanged();
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
        return this.f11986a.size();
    }

    public long getItemId(int i) {
        return this.f11986a.get(i).getGUID();
    }

    /* renamed from: h */
    public void mo29071h(int i, int i2) {
        this.f11986a.add(i2, this.f11986a.remove(i));
    }

    /* renamed from: q */
    public boolean mo29072q(int i, int i2) {
        return true;
    }
}
