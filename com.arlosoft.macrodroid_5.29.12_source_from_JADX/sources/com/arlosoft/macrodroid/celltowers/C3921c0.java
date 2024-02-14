package com.arlosoft.macrodroid.celltowers;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.celltowers.RecentCellTowersActivity;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.celltowers.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3921c0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f10204a;

    /* renamed from: c */
    public final /* synthetic */ List f10205c;

    /* renamed from: d */
    public final /* synthetic */ String f10206d;

    /* renamed from: f */
    public final /* synthetic */ RecentCellTowersActivity.RecentTowersAdapter f10207f;

    public /* synthetic */ C3921c0(boolean z, List list, String str, RecentCellTowersActivity.RecentTowersAdapter recentTowersAdapter) {
        this.f10204a = z;
        this.f10205c = list;
        this.f10206d = str;
        this.f10207f = recentTowersAdapter;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RecentCellTowersActivity.RecentTowersAdapter.m15296L(this.f10204a, this.f10205c, this.f10206d, this.f10207f, dialogInterface, i);
    }
}
