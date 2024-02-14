package com.arlosoft.macrodroid.triggers.activities.selecticon;

import com.arlosoft.macrodroid.triggers.activities.selecticon.SelectIconAdapter;

/* renamed from: com.arlosoft.macrodroid.triggers.activities.selecticon.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5860c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SelectIconAdapter f13908a;

    /* renamed from: c */
    public final /* synthetic */ String f13909c;

    /* renamed from: d */
    public final /* synthetic */ String f13910d;

    /* renamed from: f */
    public final /* synthetic */ int f13911f;

    /* renamed from: g */
    public final /* synthetic */ SelectIconAdapter.ViewHolder f13912g;

    public /* synthetic */ C5860c(SelectIconAdapter selectIconAdapter, String str, String str2, int i, SelectIconAdapter.ViewHolder viewHolder) {
        this.f13908a = selectIconAdapter;
        this.f13909c = str;
        this.f13910d = str2;
        this.f13911f = i;
        this.f13912g = viewHolder;
    }

    public final void run() {
        this.f13908a.m23983G(this.f13909c, this.f13910d, this.f13911f, this.f13912g);
    }
}
