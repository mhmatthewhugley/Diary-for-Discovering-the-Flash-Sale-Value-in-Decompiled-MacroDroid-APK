package com.arlosoft.macrodroid.constraint;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.constraint.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4232c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f10799a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f10800b;

    public /* synthetic */ C4232c(C10351d dVar, SearchView searchView) {
        this.f10799a = dVar;
        this.f10800b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f10799a.getFilter().mo41019a(this.f10800b.getQuery().toString(), z);
    }
}
