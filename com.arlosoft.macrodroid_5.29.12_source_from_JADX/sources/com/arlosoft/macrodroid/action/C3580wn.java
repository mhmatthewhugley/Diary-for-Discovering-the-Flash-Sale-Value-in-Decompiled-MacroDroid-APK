package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.action.wn */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3580wn implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TweetAction f9513a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9514c;

    /* renamed from: d */
    public final /* synthetic */ C4023j0.C4028e f9515d;

    public /* synthetic */ C3580wn(TweetAction tweetAction, Activity activity, C4023j0.C4028e eVar) {
        this.f9513a = tweetAction;
        this.f9514c = activity;
        this.f9515d = eVar;
    }

    public final void onClick(View view) {
        this.f9513a.m13451q3(this.f9514c, this.f9515d, view);
    }
}
