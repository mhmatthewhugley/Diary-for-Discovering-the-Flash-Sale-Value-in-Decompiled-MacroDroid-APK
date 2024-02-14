package com.arlosoft.macrodroid.celltowers;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.celltowers.IgnoredCellTowersActivity;

/* renamed from: com.arlosoft.macrodroid.celltowers.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3947y implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IgnoredCellTowersActivity.IgnoredTowersAdapter f10263a;

    /* renamed from: c */
    public final /* synthetic */ String f10264c;

    public /* synthetic */ C3947y(IgnoredCellTowersActivity.IgnoredTowersAdapter ignoredTowersAdapter, String str) {
        this.f10263a = ignoredTowersAdapter;
        this.f10264c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10263a.m15269E(this.f10264c, dialogInterface, i);
    }
}
