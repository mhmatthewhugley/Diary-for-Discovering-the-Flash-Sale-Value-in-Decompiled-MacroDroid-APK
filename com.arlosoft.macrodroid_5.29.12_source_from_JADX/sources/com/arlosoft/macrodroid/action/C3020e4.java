package com.arlosoft.macrodroid.action;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.action.e4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3020e4 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f8233a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f8234b;

    public /* synthetic */ C3020e4(C10351d dVar, SearchView searchView) {
        this.f8233a = dVar;
        this.f8234b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f8233a.getFilter().mo41019a(this.f8234b.getQuery().toString(), z);
    }
}
