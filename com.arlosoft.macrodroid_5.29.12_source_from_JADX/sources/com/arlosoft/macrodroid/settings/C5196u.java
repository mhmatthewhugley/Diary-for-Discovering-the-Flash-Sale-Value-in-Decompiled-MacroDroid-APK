package com.arlosoft.macrodroid.settings;

import android.content.DialogInterface;
import p106i2.C7395a;

/* renamed from: com.arlosoft.macrodroid.settings.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5196u implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f12995a;

    /* renamed from: c */
    public final /* synthetic */ EditNotificationChannelsActivity f12996c;

    /* renamed from: d */
    public final /* synthetic */ C7395a f12997d;

    public /* synthetic */ C5196u(String[] strArr, EditNotificationChannelsActivity editNotificationChannelsActivity, C7395a aVar) {
        this.f12995a = strArr;
        this.f12996c = editNotificationChannelsActivity;
        this.f12997d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditNotificationChannelsActivity.m19753X1(this.f12995a, this.f12996c, this.f12997d, dialogInterface, i);
    }
}
