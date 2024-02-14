package com.arlosoft.macrodroid.celltowers;

import android.widget.CompoundButton;
import com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity;

/* renamed from: com.arlosoft.macrodroid.celltowers.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3931k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CellTowerGroupActivity.C3902c f10231a;

    /* renamed from: b */
    public final /* synthetic */ String f10232b;

    /* renamed from: c */
    public final /* synthetic */ CellTowerGroupActivity.C3904e f10233c;

    public /* synthetic */ C3931k(CellTowerGroupActivity.C3902c cVar, String str, CellTowerGroupActivity.C3904e eVar) {
        this.f10231a = cVar;
        this.f10232b = str;
        this.f10233c = eVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f10231a.m15219h(this.f10232b, this.f10233c, compoundButton, z);
    }
}
