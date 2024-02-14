package com.arlosoft.macrodroid.settings;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.settings.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5156i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditCategoriesActivity f12937a;

    /* renamed from: c */
    public final /* synthetic */ EditText f12938c;

    /* renamed from: d */
    public final /* synthetic */ String f12939d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f12940f;

    public /* synthetic */ C5156i(EditCategoriesActivity editCategoriesActivity, EditText editText, String str, AppCompatDialog appCompatDialog) {
        this.f12937a = editCategoriesActivity;
        this.f12938c = editText;
        this.f12939d = str;
        this.f12940f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f12937a.m19716l2(this.f12938c, this.f12939d, this.f12940f, view);
    }
}
