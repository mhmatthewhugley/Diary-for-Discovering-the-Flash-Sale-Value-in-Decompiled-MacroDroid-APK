package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.triggers.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5940h implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f14071a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f14072b;

    public /* synthetic */ C5940h(C10351d dVar, SearchView searchView) {
        this.f14071a = dVar;
        this.f14072b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14071a.getFilter().mo41019a(this.f14072b.getQuery().toString(), z);
    }
}
