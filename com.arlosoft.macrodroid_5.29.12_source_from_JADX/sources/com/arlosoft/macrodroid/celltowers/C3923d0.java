package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import com.arlosoft.macrodroid.celltowers.RecentCellTowersActivity;
import p135n1.C7964a;

/* renamed from: com.arlosoft.macrodroid.celltowers.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3923d0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RecentCellTowersActivity.RecentTowersAdapter f10209a;

    /* renamed from: c */
    public final /* synthetic */ C7964a f10210c;

    public /* synthetic */ C3923d0(RecentCellTowersActivity.RecentTowersAdapter recentTowersAdapter, C7964a aVar) {
        this.f10209a = recentTowersAdapter;
        this.f10210c = aVar;
    }

    public final void onClick(View view) {
        RecentCellTowersActivity.RecentTowersAdapter.m15293G(this.f10209a, this.f10210c, view);
    }
}
