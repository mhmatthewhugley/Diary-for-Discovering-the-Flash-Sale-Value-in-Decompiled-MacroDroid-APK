package com.arlosoft.macrodroid.homescreen.quickrun;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.macrolist.MacroListCategoryHeader;

/* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4775c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ QuickRunAddMacrosActivity f11971a;

    /* renamed from: c */
    public final /* synthetic */ EditText f11972c;

    /* renamed from: d */
    public final /* synthetic */ String f11973d;

    /* renamed from: f */
    public final /* synthetic */ String f11974f;

    /* renamed from: g */
    public final /* synthetic */ MacroListCategoryHeader f11975g;

    /* renamed from: o */
    public final /* synthetic */ Category f11976o;

    /* renamed from: p */
    public final /* synthetic */ Dialog f11977p;

    public /* synthetic */ C4775c(QuickRunAddMacrosActivity quickRunAddMacrosActivity, EditText editText, String str, String str2, MacroListCategoryHeader macroListCategoryHeader, Category category, Dialog dialog) {
        this.f11971a = quickRunAddMacrosActivity;
        this.f11972c = editText;
        this.f11973d = str;
        this.f11974f = str2;
        this.f11975g = macroListCategoryHeader;
        this.f11976o = category;
        this.f11977p = dialog;
    }

    public final void onClick(View view) {
        QuickRunAddMacrosActivity.m18485p2(this.f11971a, this.f11972c, this.f11973d, this.f11974f, this.f11975g, this.f11976o, this.f11977p, view);
    }
}
