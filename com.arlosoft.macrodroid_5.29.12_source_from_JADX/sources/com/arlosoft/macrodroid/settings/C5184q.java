package com.arlosoft.macrodroid.settings;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.settings.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5184q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditModesActivity f12974a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f12975c;

    /* renamed from: d */
    public final /* synthetic */ EditText f12976d;

    public /* synthetic */ C5184q(EditModesActivity editModesActivity, AppCompatDialog appCompatDialog, EditText editText) {
        this.f12974a = editModesActivity;
        this.f12975c = appCompatDialog;
        this.f12976d = editText;
    }

    public final void onClick(View view) {
        this.f12974a.m19738a2(this.f12975c, this.f12976d, view);
    }
}
