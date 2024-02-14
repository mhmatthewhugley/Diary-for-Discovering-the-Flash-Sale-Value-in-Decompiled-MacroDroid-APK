package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.action.SetVolumeAction;

/* renamed from: com.arlosoft.macrodroid.action.vi */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3547vi implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SetVolumeAction f9430a;

    /* renamed from: c */
    public final /* synthetic */ SetVolumeAction.C2669c f9431c;

    /* renamed from: d */
    public final /* synthetic */ CheckBox f9432d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f9433f;

    public /* synthetic */ C3547vi(SetVolumeAction setVolumeAction, SetVolumeAction.C2669c cVar, CheckBox checkBox, AppCompatDialog appCompatDialog) {
        this.f9430a = setVolumeAction;
        this.f9431c = cVar;
        this.f9432d = checkBox;
        this.f9433f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9430a.m12776s3(this.f9431c, this.f9432d, this.f9433f, view);
    }
}
