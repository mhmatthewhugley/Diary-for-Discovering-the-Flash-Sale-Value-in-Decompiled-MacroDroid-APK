package com.arlosoft.macrodroid.troubleshooting.help;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.troubleshooting.help.C6225a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p154r0.C8184d;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.help.c */
/* compiled from: TroubleShootingHelpFragment.kt */
public final class C6251c extends C8184d {

    /* renamed from: d */
    private final List<C6225a> f14797d = C13614t.m87751m(new C6225a.C6228c(), new C6225a.C6236k(), new C6225a.C6232g(), new C6225a.C6230e(), new C6225a.C6238m(), new C6225a.C6226a(), new C6225a.C6227b(), new C6225a.C6235j(), new C6225a.C6243r(), new C6225a.C6241p(), new C6225a.C6234i(), new C6225a.C6240o(), new C6225a.C6237l(), new C6225a.C6242q(), new C6225a.C6233h(), new C6225a.C6231f(), new C6225a.C6229d(), new C6225a.C6239n());

    /* renamed from: f */
    public Map<Integer, View> f14798f = new LinkedHashMap();

    /* renamed from: W */
    private final void m24323W() {
        List<C6225a> list = this.f14797d;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (((C6225a) next).mo32251i()) {
                arrayList.add(next);
            }
        }
        ((RecyclerView) mo32261V(C17532R$id.recyclerView)).setAdapter(new C6244b(arrayList));
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f14798f.clear();
    }

    /* renamed from: V */
    public View mo32261V(int i) {
        View findViewById;
        Map<Integer, View> map = this.f14798f;
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

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m24323W();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17535R$layout.fragment_troubleshooting_help, viewGroup, false);
        C13706o.m87928e(inflate, "inflater.inflate(R.layou…g_help, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }
}
