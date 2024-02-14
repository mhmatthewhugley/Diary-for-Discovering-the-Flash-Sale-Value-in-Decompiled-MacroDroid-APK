package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import com.arlosoft.macrodroid.celltowers.RecentCellTowersActivity;
import p135n1.C7965b;

/* renamed from: com.arlosoft.macrodroid.celltowers.e0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3925e0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RecentCellTowersActivity.RecentTowersAdapter f10212a;

    /* renamed from: c */
    public final /* synthetic */ C7965b f10213c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10214d;

    /* renamed from: f */
    public final /* synthetic */ boolean f10215f;

    public /* synthetic */ C3925e0(RecentCellTowersActivity.RecentTowersAdapter recentTowersAdapter, C7965b bVar, boolean z, boolean z2) {
        this.f10212a = recentTowersAdapter;
        this.f10213c = bVar;
        this.f10214d = z;
        this.f10215f = z2;
    }

    public final void onClick(View view) {
        RecentCellTowersActivity.RecentTowersAdapter.m15294H(this.f10212a, this.f10213c, this.f10214d, this.f10215f, view);
    }
}
