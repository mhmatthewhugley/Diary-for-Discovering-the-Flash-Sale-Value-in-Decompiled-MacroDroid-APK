package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.w7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3564w7 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LaunchActivityAction f9471a;

    /* renamed from: c */
    public final /* synthetic */ String f9472c;

    /* renamed from: d */
    public final /* synthetic */ String f9473d;

    /* renamed from: f */
    public final /* synthetic */ List f9474f;

    /* renamed from: g */
    public final /* synthetic */ String[] f9475g;

    public /* synthetic */ C3564w7(LaunchActivityAction launchActivityAction, String str, String str2, List list, String[] strArr) {
        this.f9471a = launchActivityAction;
        this.f9472c = str;
        this.f9473d = str2;
        this.f9474f = list;
        this.f9475g = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9471a.m11193w3(this.f9472c, this.f9473d, this.f9474f, this.f9475g, dialogInterface, i);
    }
}
