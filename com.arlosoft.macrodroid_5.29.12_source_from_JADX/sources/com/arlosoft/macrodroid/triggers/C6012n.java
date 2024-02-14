package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.triggers.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6012n implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f14203a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f14204b;

    public /* synthetic */ C6012n(C10351d dVar, SearchView searchView) {
        this.f14203a = dVar;
        this.f14204b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14203a.getFilter().mo41019a(this.f14204b.getQuery().toString(), z);
    }
}
