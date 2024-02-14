package com.arlosoft.macrodroid.upgrade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.upgrade.h */
/* compiled from: UpgradeItemsAdapter.kt */
public final class C6338h extends RecyclerView.Adapter<C6339a> {

    /* renamed from: a */
    private final List<C6300b> f14905a;

    /* renamed from: com.arlosoft.macrodroid.upgrade.h$a */
    /* compiled from: UpgradeItemsAdapter.kt */
    public static final class C6339a extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6339a(View view) {
            super(view);
            C13706o.m87929f(view, "itemView");
        }

        /* renamed from: t */
        public final void mo32386t(C6300b bVar) {
            C13706o.m87929f(bVar, "blurbItem");
            ((TextView) this.itemView.findViewById(C17532R$id.title)).setText(this.itemView.getResources().getString(bVar.mo32345c()));
            ((TextView) this.itemView.findViewById(C17532R$id.description)).setText(this.itemView.getResources().getString(bVar.mo32343a()));
            ((ImageView) this.itemView.findViewById(C17532R$id.image)).setImageResource(bVar.mo32344b());
        }
    }

    public C6338h(List<C6300b> list) {
        C13706o.m87929f(list, "blurbList");
        this.f14905a = list;
    }

    /* renamed from: B */
    public void onBindViewHolder(C6339a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo32386t(this.f14905a.get(i));
    }

    /* renamed from: C */
    public C6339a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.item_upgrade, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…m_upgrade, parent, false)");
        return new C6339a(inflate);
    }

    public int getItemCount() {
        return this.f14905a.size();
    }
}
