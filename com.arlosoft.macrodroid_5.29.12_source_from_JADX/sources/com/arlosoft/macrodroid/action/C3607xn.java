package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.xn */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3607xn implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TweetAction f9593a;

    /* renamed from: c */
    public final /* synthetic */ EditText f9594c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f9595d;

    public /* synthetic */ C3607xn(TweetAction tweetAction, EditText editText, AppCompatDialog appCompatDialog) {
        this.f9593a = tweetAction;
        this.f9594c = editText;
        this.f9595d = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9593a.m13448n3(this.f9594c, this.f9595d, view);
    }
}
