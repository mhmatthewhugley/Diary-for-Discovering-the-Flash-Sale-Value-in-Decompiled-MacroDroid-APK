package com.arlosoft.macrodroid.plugins.comments;

import androidx.lifecycle.Observer;
import androidx.paging.PagedList;

/* renamed from: com.arlosoft.macrodroid.plugins.comments.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4988b implements Observer {

    /* renamed from: a */
    public final /* synthetic */ PluginCommentsActivity f12566a;

    public /* synthetic */ C4988b(PluginCommentsActivity pluginCommentsActivity) {
        this.f12566a = pluginCommentsActivity;
    }

    public final void onChanged(Object obj) {
        PluginCommentsActivity.m19342d2(this.f12566a, (PagedList) obj);
    }
}
