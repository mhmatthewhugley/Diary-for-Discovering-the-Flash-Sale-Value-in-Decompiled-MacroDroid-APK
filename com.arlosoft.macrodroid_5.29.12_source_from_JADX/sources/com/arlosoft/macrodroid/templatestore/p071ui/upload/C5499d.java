package com.arlosoft.macrodroid.templatestore.p071ui.upload;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.macrolist.MacroListCategoryHeader;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5499d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TemplateUploadActivity f13445a;

    /* renamed from: c */
    public final /* synthetic */ EditText f13446c;

    /* renamed from: d */
    public final /* synthetic */ String f13447d;

    /* renamed from: f */
    public final /* synthetic */ String f13448f;

    /* renamed from: g */
    public final /* synthetic */ MacroListCategoryHeader f13449g;

    /* renamed from: o */
    public final /* synthetic */ Category f13450o;

    /* renamed from: p */
    public final /* synthetic */ Dialog f13451p;

    public /* synthetic */ C5499d(TemplateUploadActivity templateUploadActivity, EditText editText, String str, String str2, MacroListCategoryHeader macroListCategoryHeader, Category category, Dialog dialog) {
        this.f13445a = templateUploadActivity;
        this.f13446c = editText;
        this.f13447d = str;
        this.f13448f = str2;
        this.f13449g = macroListCategoryHeader;
        this.f13450o = category;
        this.f13451p = dialog;
    }

    public final void onClick(View view) {
        TemplateUploadActivity.m21141u2(this.f13445a, this.f13446c, this.f13447d, this.f13448f, this.f13449g, this.f13450o, this.f13451p, view);
    }
}
