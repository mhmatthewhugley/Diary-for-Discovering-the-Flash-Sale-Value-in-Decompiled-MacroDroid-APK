package com.arlosoft.macrodroid.plugins.comments;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.templatestore.model.Comment;

/* renamed from: com.arlosoft.macrodroid.plugins.comments.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4987a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f12563a;

    /* renamed from: c */
    public final /* synthetic */ PluginCommentsActivity f12564c;

    /* renamed from: d */
    public final /* synthetic */ Comment f12565d;

    public /* synthetic */ C4987a(String[] strArr, PluginCommentsActivity pluginCommentsActivity, Comment comment) {
        this.f12563a = strArr;
        this.f12564c = pluginCommentsActivity;
        this.f12565d = comment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PluginCommentsActivity.m19351n2(this.f12563a, this.f12564c, this.f12565d, dialogInterface, i);
    }
}
