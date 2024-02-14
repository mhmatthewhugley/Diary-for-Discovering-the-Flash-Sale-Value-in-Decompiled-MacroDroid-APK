package com.arlosoft.macrodroid.troubleshooting.problem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p154r0.C8184d;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.g */
/* compiled from: ProblemListFragment.kt */
public final class C6279g extends C8184d {

    /* renamed from: d */
    public ProblemViewModel f14817d;

    /* renamed from: f */
    public Map<Integer, View> f14818f = new LinkedHashMap();

    /* renamed from: X */
    private final void m24391X() {
        mo32286a0().mo32262l().observe(getViewLifecycleOwner(), new C6278f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m24392Z(C6279g gVar, List list) {
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87928e(list, "it");
        gVar.m24393e0(list);
    }

    /* renamed from: e0 */
    private final void m24393e0(List<? extends C6255c> list) {
        if (list.isEmpty()) {
            LinearLayout linearLayout = (LinearLayout) mo32285W(C17532R$id.emptyView);
            C13706o.m87928e(linearLayout, "emptyView");
            linearLayout.setVisibility(0);
            RecyclerView recyclerView = (RecyclerView) mo32285W(C17532R$id.recyclerView);
            C13706o.m87928e(recyclerView, "recyclerView");
            recyclerView.setVisibility(8);
            return;
        }
        C6283k kVar = new C6283k(list);
        int i = C17532R$id.recyclerView;
        ((RecyclerView) mo32285W(i)).setAdapter(kVar);
        RecyclerView recyclerView2 = (RecyclerView) mo32285W(i);
        C13706o.m87928e(recyclerView2, "recyclerView");
        recyclerView2.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) mo32285W(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout2, "emptyView");
        linearLayout2.setVisibility(8);
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f14818f.clear();
    }

    /* renamed from: W */
    public View mo32285W(int i) {
        View findViewById;
        Map<Integer, View> map = this.f14818f;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a0 */
    public final ProblemViewModel mo32286a0() {
        ProblemViewModel problemViewModel = this.f14817d;
        if (problemViewModel != null) {
            return problemViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getLifecycle().addObserver(mo32286a0());
        m24391X();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_problem_list, viewGroup, false);
        C13706o.m87928e(inflate, "inflater.inflate(R.layou…m_list, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }
}
