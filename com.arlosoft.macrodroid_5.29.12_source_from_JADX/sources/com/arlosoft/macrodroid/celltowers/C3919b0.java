package com.arlosoft.macrodroid.celltowers;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.celltowers.RecentCellTowersActivity;

/* renamed from: com.arlosoft.macrodroid.celltowers.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3919b0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RecentCellTowersActivity.RecentTowersAdapter f10198a;

    /* renamed from: c */
    public final /* synthetic */ String f10199c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10200d;

    /* renamed from: f */
    public final /* synthetic */ boolean f10201f;

    public /* synthetic */ C3919b0(RecentCellTowersActivity.RecentTowersAdapter recentTowersAdapter, String str, boolean z, boolean z2) {
        this.f10198a = recentTowersAdapter;
        this.f10199c = str;
        this.f10200d = z;
        this.f10201f = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RecentCellTowersActivity.RecentTowersAdapter.m15298N(this.f10198a, this.f10199c, this.f10200d, this.f10201f, dialogInterface, i);
    }
}
