package com.arlosoft.macrodroid.actionblock.list;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;

/* renamed from: com.arlosoft.macrodroid.actionblock.list.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3763k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f9840a;

    /* renamed from: c */
    public final /* synthetic */ ActionBlockListActivity f9841c;

    /* renamed from: d */
    public final /* synthetic */ ActionBlock f9842d;

    /* renamed from: f */
    public final /* synthetic */ EditText f9843f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f9844g;

    public /* synthetic */ C3763k(EditText editText, ActionBlockListActivity actionBlockListActivity, ActionBlock actionBlock, EditText editText2, AppCompatDialog appCompatDialog) {
        this.f9840a = editText;
        this.f9841c = actionBlockListActivity;
        this.f9842d = actionBlock;
        this.f9843f = editText2;
        this.f9844g = appCompatDialog;
    }

    public final void onClick(View view) {
        ActionBlockListActivity.m14730u2(this.f9840a, this.f9841c, this.f9842d, this.f9843f, this.f9844g, view);
    }
}
