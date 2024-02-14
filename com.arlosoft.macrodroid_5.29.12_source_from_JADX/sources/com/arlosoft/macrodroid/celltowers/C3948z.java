package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import com.arlosoft.macrodroid.celltowers.IgnoredCellTowersActivity;

/* renamed from: com.arlosoft.macrodroid.celltowers.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3948z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ IgnoredCellTowersActivity.IgnoredTowersAdapter f10265a;

    /* renamed from: c */
    public final /* synthetic */ String f10266c;

    public /* synthetic */ C3948z(IgnoredCellTowersActivity.IgnoredTowersAdapter ignoredTowersAdapter, String str) {
        this.f10265a = ignoredTowersAdapter;
        this.f10266c = str;
    }

    public final void onClick(View view) {
        this.f10265a.m15268D(this.f10266c, view);
    }
}
