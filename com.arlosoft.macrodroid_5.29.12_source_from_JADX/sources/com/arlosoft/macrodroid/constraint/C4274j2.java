package com.arlosoft.macrodroid.constraint;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.constraint.j2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4274j2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f10878a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f10879b;

    public /* synthetic */ C4274j2(C10351d dVar, SearchView searchView) {
        this.f10878a = dVar;
        this.f10879b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f10878a.getFilter().mo41019a(this.f10879b.getQuery().toString(), z);
    }
}
