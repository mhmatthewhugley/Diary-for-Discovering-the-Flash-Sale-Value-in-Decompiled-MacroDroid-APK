package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.action.t7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3473t7 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f9257a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f9258b;

    public /* synthetic */ C3473t7(C10351d dVar, SearchView searchView) {
        this.f9257a = dVar;
        this.f9258b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f9257a.getFilter().mo41019a(this.f9258b.getQuery().toString(), z);
    }
}
