package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.action.r2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3385r2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f9012a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f9013b;

    public /* synthetic */ C3385r2(C10351d dVar, SearchView searchView) {
        this.f9012a = dVar;
        this.f9013b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f9012a.getFilter().mo41019a(this.f9013b.getQuery().toString(), z);
    }
}
