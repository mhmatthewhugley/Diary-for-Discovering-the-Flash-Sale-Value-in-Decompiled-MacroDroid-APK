package com.arlosoft.macrodroid.triggers;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SearchView;
import p187x0.C10351d;

/* renamed from: com.arlosoft.macrodroid.triggers.c7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5888c7 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10351d f13982a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f13983b;

    public /* synthetic */ C5888c7(C10351d dVar, SearchView searchView) {
        this.f13982a = dVar;
        this.f13983b = searchView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ScreenContentTrigger.m23098s3(this.f13982a, this.f13983b, compoundButton, z);
    }
}
