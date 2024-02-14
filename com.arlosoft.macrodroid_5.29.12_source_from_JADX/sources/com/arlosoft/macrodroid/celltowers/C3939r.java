package com.arlosoft.macrodroid.celltowers;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import p135n1.C7964a;

/* renamed from: com.arlosoft.macrodroid.celltowers.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3939r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CellTowerListActivity f10245a;

    /* renamed from: c */
    public final /* synthetic */ EditText f10246c;

    /* renamed from: d */
    public final /* synthetic */ C7964a f10247d;

    /* renamed from: f */
    public final /* synthetic */ String f10248f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f10249g;

    public /* synthetic */ C3939r(CellTowerListActivity cellTowerListActivity, EditText editText, C7964a aVar, String str, AppCompatDialog appCompatDialog) {
        this.f10245a = cellTowerListActivity;
        this.f10246c = editText;
        this.f10247d = aVar;
        this.f10248f = str;
        this.f10249g = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f10245a.m15243i2(this.f10246c, this.f10247d, this.f10248f, this.f10249g, view);
    }
}
