package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.e0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3016e0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidWearAction f8221a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f8222c;

    /* renamed from: d */
    public final /* synthetic */ int f8223d;

    /* renamed from: f */
    public final /* synthetic */ RadioButton f8224f;

    /* renamed from: g */
    public final /* synthetic */ EditText f8225g;

    /* renamed from: o */
    public final /* synthetic */ List f8226o;

    /* renamed from: p */
    public final /* synthetic */ Spinner f8227p;

    /* renamed from: s */
    public final /* synthetic */ ImageView f8228s;

    public /* synthetic */ C3016e0(AndroidWearAction androidWearAction, AppCompatDialog appCompatDialog, int i, RadioButton radioButton, EditText editText, List list, Spinner spinner, ImageView imageView) {
        this.f8221a = androidWearAction;
        this.f8222c = appCompatDialog;
        this.f8223d = i;
        this.f8224f = radioButton;
        this.f8225g = editText;
        this.f8226o = list;
        this.f8227p = spinner;
        this.f8228s = imageView;
    }

    public final void onClick(View view) {
        this.f8221a.m9779d4(this.f8222c, this.f8223d, this.f8224f, this.f8225g, this.f8226o, this.f8227p, this.f8228s, view);
    }
}
