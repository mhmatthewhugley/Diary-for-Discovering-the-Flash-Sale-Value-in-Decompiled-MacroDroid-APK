package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import android.widget.Spinner;

/* renamed from: com.arlosoft.macrodroid.celltowers.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3926f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CellTowerGroupActivity f10216a;

    /* renamed from: c */
    public final /* synthetic */ String f10217c;

    /* renamed from: d */
    public final /* synthetic */ int[] f10218d;

    /* renamed from: f */
    public final /* synthetic */ Spinner f10219f;

    public /* synthetic */ C3926f(CellTowerGroupActivity cellTowerGroupActivity, String str, int[] iArr, Spinner spinner) {
        this.f10216a = cellTowerGroupActivity;
        this.f10217c = str;
        this.f10218d = iArr;
        this.f10219f = spinner;
    }

    public final void onClick(View view) {
        this.f10216a.m15203g2(this.f10217c, this.f10218d, this.f10219f, view);
    }
}
