package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: com.arlosoft.macrodroid.triggers.p4 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6041p4 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ LocalePluginTrigger f14281a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f14282c;

    public /* synthetic */ C6041p4(LocalePluginTrigger localePluginTrigger, CheckBox checkBox) {
        this.f14281a = localePluginTrigger;
        this.f14282c = checkBox;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14281a.m22578y3(this.f14282c, dialogInterface, i);
    }
}
