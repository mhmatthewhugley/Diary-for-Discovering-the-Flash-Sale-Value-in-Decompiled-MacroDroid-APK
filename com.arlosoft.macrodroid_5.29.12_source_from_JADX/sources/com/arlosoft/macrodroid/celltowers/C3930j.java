package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity;

/* renamed from: com.arlosoft.macrodroid.celltowers.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3930j implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ CellTowerGroupActivity.C3902c f10228a;

    /* renamed from: c */
    public final /* synthetic */ String f10229c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10230d;

    public /* synthetic */ C3930j(CellTowerGroupActivity.C3902c cVar, String str, boolean z) {
        this.f10228a = cVar;
        this.f10229c = str;
        this.f10230d = z;
    }

    public final boolean onLongClick(View view) {
        return this.f10228a.m15221j(this.f10229c, this.f10230d, view);
    }
}
