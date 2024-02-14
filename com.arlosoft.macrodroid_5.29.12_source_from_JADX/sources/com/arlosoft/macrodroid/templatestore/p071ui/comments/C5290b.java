package com.arlosoft.macrodroid.templatestore.p071ui.comments;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.templatestore.model.Comment;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5290b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f13129a;

    /* renamed from: c */
    public final /* synthetic */ TemplateCommentsActivity f13130c;

    /* renamed from: d */
    public final /* synthetic */ Comment f13131d;

    public /* synthetic */ C5290b(String[] strArr, TemplateCommentsActivity templateCommentsActivity, Comment comment) {
        this.f13129a = strArr;
        this.f13130c = templateCommentsActivity;
        this.f13131d = comment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TemplateCommentsActivity.m20523p2(this.f13129a, this.f13130c, this.f13131d, dialogInterface, i);
    }
}
