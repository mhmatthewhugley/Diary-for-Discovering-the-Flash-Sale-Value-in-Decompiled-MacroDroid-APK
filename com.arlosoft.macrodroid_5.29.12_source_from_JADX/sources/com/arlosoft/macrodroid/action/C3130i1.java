package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.action.i1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3130i1 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f8457a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f8458b;

    public /* synthetic */ C3130i1(C10351d dVar, SearchView searchView) {
        this.f8457a = dVar;
        this.f8458b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f8457a.getFilter().mo41019a(this.f8458b.getQuery().toString(), z);
    }
}
