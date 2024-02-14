package com.arlosoft.macrodroid.settings;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.settings.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5187r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditModesActivity f12981a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f12982c;

    /* renamed from: d */
    public final /* synthetic */ EditText f12983d;

    /* renamed from: f */
    public final /* synthetic */ int f12984f;

    /* renamed from: g */
    public final /* synthetic */ String f12985g;

    public /* synthetic */ C5187r(EditModesActivity editModesActivity, AppCompatDialog appCompatDialog, EditText editText, int i, String str) {
        this.f12981a = editModesActivity;
        this.f12982c = appCompatDialog;
        this.f12983d = editText;
        this.f12984f = i;
        this.f12985g = str;
    }

    public final void onClick(View view) {
        this.f12981a.m19740c2(this.f12982c, this.f12983d, this.f12984f, this.f12985g, view);
    }
}
