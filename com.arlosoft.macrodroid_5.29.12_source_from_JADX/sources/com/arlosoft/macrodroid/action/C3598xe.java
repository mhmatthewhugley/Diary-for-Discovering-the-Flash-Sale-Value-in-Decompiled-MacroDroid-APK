package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.action.xe */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3598xe implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f9578a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f9579b;

    public /* synthetic */ C3598xe(C10351d dVar, SearchView searchView) {
        this.f9578a = dVar;
        this.f9579b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f9578a.getFilter().mo41019a(this.f9579b.getQuery().toString(), z);
    }
}
