package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2802a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AccessibilityServiceAction f7708a;

    /* renamed from: c */
    public final /* synthetic */ String[] f7709c;

    /* renamed from: d */
    public final /* synthetic */ List f7710d;

    public /* synthetic */ C2802a(AccessibilityServiceAction accessibilityServiceAction, String[] strArr, List list) {
        this.f7708a = accessibilityServiceAction;
        this.f7709c = strArr;
        this.f7710d = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AccessibilityServiceAction.m9576s3(this.f7708a, this.f7709c, this.f7710d, dialogInterface, i);
    }
}
