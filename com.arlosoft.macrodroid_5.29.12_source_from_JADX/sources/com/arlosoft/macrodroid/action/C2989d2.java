package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.action.d2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2989d2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f8170a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f8171b;

    public /* synthetic */ C2989d2(C10351d dVar, SearchView searchView) {
        this.f8170a = dVar;
        this.f8171b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f8170a.getFilter().mo41019a(this.f8171b.getQuery().toString(), z);
    }
}
