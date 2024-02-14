package com.arlosoft.macrodroid.templatestore.p071ui.comments;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.templatestore.model.Comment;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.comments.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5289a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f13126a;

    /* renamed from: c */
    public final /* synthetic */ TemplateCommentsActivity f13127c;

    /* renamed from: d */
    public final /* synthetic */ Comment f13128d;

    public /* synthetic */ C5289a(String[] strArr, TemplateCommentsActivity templateCommentsActivity, Comment comment) {
        this.f13126a = strArr;
        this.f13127c = templateCommentsActivity;
        this.f13128d = comment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TemplateCommentsActivity.m20524q2(this.f13126a, this.f13127c, this.f13128d, dialogInterface, i);
    }
}
