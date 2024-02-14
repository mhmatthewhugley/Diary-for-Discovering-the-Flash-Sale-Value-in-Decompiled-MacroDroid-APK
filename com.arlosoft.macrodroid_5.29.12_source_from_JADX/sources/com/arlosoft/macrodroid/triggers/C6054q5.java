package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.triggers.q5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6054q5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f14317a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f14318b;

    public /* synthetic */ C6054q5(C10351d dVar, SearchView searchView) {
        this.f14317a = dVar;
        this.f14318b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f14317a.getFilter().mo41019a(this.f14318b.getQuery().toString(), z);
    }
}
