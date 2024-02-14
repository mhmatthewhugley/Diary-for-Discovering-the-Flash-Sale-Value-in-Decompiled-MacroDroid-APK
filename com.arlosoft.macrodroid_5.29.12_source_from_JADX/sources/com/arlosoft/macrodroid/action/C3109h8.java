package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.h8 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3109h8 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LaunchShortcutAction f8413a;

    /* renamed from: c */
    public final /* synthetic */ List f8414c;

    /* renamed from: d */
    public final /* synthetic */ Activity f8415d;

    /* renamed from: f */
    public final /* synthetic */ String[] f8416f;

    public /* synthetic */ C3109h8(LaunchShortcutAction launchShortcutAction, List list, Activity activity, String[] strArr) {
        this.f8413a = launchShortcutAction;
        this.f8414c = list;
        this.f8415d = activity;
        this.f8416f = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8413a.m11245s3(this.f8414c, this.f8415d, this.f8416f, dialogInterface, i);
    }
}
