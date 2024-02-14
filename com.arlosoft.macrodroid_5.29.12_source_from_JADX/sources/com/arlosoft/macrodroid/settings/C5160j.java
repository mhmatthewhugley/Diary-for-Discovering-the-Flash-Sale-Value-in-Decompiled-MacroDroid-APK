package com.arlosoft.macrodroid.settings;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.settings.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5160j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditCategoriesActivity f12944a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f12945c;

    /* renamed from: d */
    public final /* synthetic */ EditText f12946d;

    public /* synthetic */ C5160j(EditCategoriesActivity editCategoriesActivity, AppCompatDialog appCompatDialog, EditText editText) {
        this.f12944a = editCategoriesActivity;
        this.f12945c = appCompatDialog;
        this.f12946d = editText;
    }

    public final void onClick(View view) {
        this.f12944a.m19714j2(this.f12945c, this.f12946d, view);
    }
}
