package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.en */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3040en implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextManipulationAction f8294a;

    /* renamed from: c */
    public final /* synthetic */ Spinner f8295c;

    /* renamed from: d */
    public final /* synthetic */ TextManipulation f8296d;

    /* renamed from: f */
    public final /* synthetic */ AlertDialog f8297f;

    /* renamed from: g */
    public final /* synthetic */ EditText f8298g;

    /* renamed from: o */
    public final /* synthetic */ List f8299o;

    public /* synthetic */ C3040en(TextManipulationAction textManipulationAction, Spinner spinner, TextManipulation textManipulation, AlertDialog alertDialog, EditText editText, List list) {
        this.f8294a = textManipulationAction;
        this.f8295c = spinner;
        this.f8296d = textManipulation;
        this.f8297f = alertDialog;
        this.f8298g = editText;
        this.f8299o = list;
    }

    public final void onClick(View view) {
        this.f8294a.m13339H3(this.f8295c, this.f8296d, this.f8297f, this.f8298g, this.f8299o, view);
    }
}
