package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.common.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4078z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ List f10655a;

    /* renamed from: c */
    public final /* synthetic */ ListView f10656c;

    /* renamed from: d */
    public final /* synthetic */ Activity f10657d;

    /* renamed from: f */
    public final /* synthetic */ int f10658f;

    /* renamed from: g */
    public final /* synthetic */ C4023j0.C4028e f10659g;

    /* renamed from: o */
    public final /* synthetic */ Macro f10660o;

    /* renamed from: p */
    public final /* synthetic */ AppCompatDialog f10661p;

    public /* synthetic */ C4078z(List list, ListView listView, Activity activity, int i, C4023j0.C4028e eVar, Macro macro, AppCompatDialog appCompatDialog) {
        this.f10655a = list;
        this.f10656c = listView;
        this.f10657d = activity;
        this.f10658f = i;
        this.f10659g = eVar;
        this.f10660o = macro;
        this.f10661p = appCompatDialog;
    }

    public final void onClick(View view) {
        C4023j0.m15752p0(this.f10655a, this.f10656c, this.f10657d, this.f10658f, this.f10659g, this.f10660o, this.f10661p, view);
    }
}
