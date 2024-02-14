package com.arlosoft.macrodroid.logging.systemlog.variablefilter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p139o1.C8026s0;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.variablefilter.a */
/* compiled from: VariableLogFilterAdapter.kt */
public final class C4907a extends RecyclerView.Adapter<C4909b> {

    /* renamed from: a */
    private List<C4911c> f12341a;

    /* renamed from: b */
    private final C4908a f12342b;

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.variablefilter.a$a */
    /* compiled from: VariableLogFilterAdapter.kt */
    public interface C4908a {
        /* renamed from: a */
        void mo29498a(String str, boolean z);
    }

    public C4907a(List<C4911c> list, C4908a aVar) {
        C13706o.m87929f(list, "variables");
        C13706o.m87929f(aVar, "filterChangeListener");
        this.f12341a = list;
        this.f12342b = aVar;
    }

    /* renamed from: B */
    public void onBindViewHolder(C4909b bVar, int i) {
        C13706o.m87929f(bVar, "holder");
        bVar.mo29502t(this.f12341a.get(i), this.f12342b);
    }

    /* renamed from: C */
    public C4909b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8026s0 c = C8026s0.m33414c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C4909b(c);
    }

    /* renamed from: D */
    public final void mo29501D(List<C4911c> list) {
        C13706o.m87929f(list, "variables");
        this.f12341a = list;
    }

    public int getItemCount() {
        return this.f12341a.size();
    }
}
