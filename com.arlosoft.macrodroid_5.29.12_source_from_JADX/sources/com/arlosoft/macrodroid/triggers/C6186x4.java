package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import android.content.pm.ResolveInfo;

/* renamed from: com.arlosoft.macrodroid.triggers.x4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6186x4 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MediaButtonPressedTrigger f14706a;

    /* renamed from: c */
    public final /* synthetic */ ResolveInfo f14707c;

    public /* synthetic */ C6186x4(MediaButtonPressedTrigger mediaButtonPressedTrigger, ResolveInfo resolveInfo) {
        this.f14706a = mediaButtonPressedTrigger;
        this.f14707c = resolveInfo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14706a.m22681r3(this.f14707c, dialogInterface, i);
    }
}
