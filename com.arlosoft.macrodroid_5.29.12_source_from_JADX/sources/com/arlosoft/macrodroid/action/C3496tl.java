package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.tl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3496tl implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ StopWatchAction f9305a;

    /* renamed from: c */
    public final /* synthetic */ List f9306c;

    public /* synthetic */ C3496tl(StopWatchAction stopWatchAction, List list) {
        this.f9305a = stopWatchAction;
        this.f9306c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9305a.m13163u3(this.f9306c, dialogInterface, i);
    }
}
