package com.arlosoft.macrodroid.templatestore.p071ui.userlist;

import androidx.lifecycle.Observer;
import androidx.paging.PagedList;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.userlist.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5569e implements Observer {

    /* renamed from: a */
    public final /* synthetic */ C5571g f13531a;

    /* renamed from: b */
    public final /* synthetic */ C5572h f13532b;

    public /* synthetic */ C5569e(C5571g gVar, C5572h hVar) {
        this.f13531a = gVar;
        this.f13532b = hVar;
    }

    public final void onChanged(Object obj) {
        C5571g.m21364t(this.f13531a, this.f13532b, (PagedList) obj);
    }
}
