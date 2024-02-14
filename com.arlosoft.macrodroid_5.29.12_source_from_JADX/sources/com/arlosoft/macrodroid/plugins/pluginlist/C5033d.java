package com.arlosoft.macrodroid.plugins.pluginlist;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;

/* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5033d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f12624a;

    /* renamed from: c */
    public final /* synthetic */ C5039j f12625c;

    /* renamed from: d */
    public final /* synthetic */ PluginDetail f12626d;

    public /* synthetic */ C5033d(String[] strArr, C5039j jVar, PluginDetail pluginDetail) {
        this.f12624a = strArr;
        this.f12625c = jVar;
        this.f12626d = pluginDetail;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5039j.m19440G0(this.f12624a, this.f12625c, this.f12626d, dialogInterface, i);
    }
}
