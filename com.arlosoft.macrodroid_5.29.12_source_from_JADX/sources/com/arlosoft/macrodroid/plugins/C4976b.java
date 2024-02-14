package com.arlosoft.macrodroid.plugins;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.plugins.data.AppBrainPackageInfo;

/* renamed from: com.arlosoft.macrodroid.plugins.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4976b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDialog f12548a;

    /* renamed from: c */
    public final /* synthetic */ AppBrainPackageInfo f12549c;

    /* renamed from: d */
    public final /* synthetic */ PluginsActivity f12550d;

    public /* synthetic */ C4976b(AppCompatDialog appCompatDialog, AppBrainPackageInfo appBrainPackageInfo, PluginsActivity pluginsActivity) {
        this.f12548a = appCompatDialog;
        this.f12549c = appBrainPackageInfo;
        this.f12550d = pluginsActivity;
    }

    public final void onClick(View view) {
        PluginsActivity.m19307r2(this.f12548a, this.f12549c, this.f12550d, view);
    }
}
