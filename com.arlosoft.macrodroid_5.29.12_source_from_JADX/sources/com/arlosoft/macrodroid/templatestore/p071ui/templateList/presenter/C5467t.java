package com.arlosoft.macrodroid.templatestore.p071ui.templateList.presenter;

import androidx.lifecycle.Observer;
import androidx.paging.PagedList;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5489v;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.presenter.C5457s;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.presenter.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5467t implements Observer {

    /* renamed from: a */
    public final /* synthetic */ C5489v f13404a;

    public /* synthetic */ C5467t(C5489v vVar) {
        this.f13404a = vVar;
    }

    public final void onChanged(Object obj) {
        C5457s.C5460c.C5461a.m20999r(this.f13404a, (PagedList) obj);
    }
}
