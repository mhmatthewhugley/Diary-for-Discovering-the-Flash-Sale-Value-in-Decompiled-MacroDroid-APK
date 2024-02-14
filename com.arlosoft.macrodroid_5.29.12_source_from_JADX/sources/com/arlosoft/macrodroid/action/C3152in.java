package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.in */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3152in implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextManipulationAction f8504a;

    /* renamed from: c */
    public final /* synthetic */ List f8505c;

    /* renamed from: d */
    public final /* synthetic */ TextManipulation f8506d;

    /* renamed from: f */
    public final /* synthetic */ EditText f8507f;

    public /* synthetic */ C3152in(TextManipulationAction textManipulationAction, List list, TextManipulation textManipulation, EditText editText) {
        this.f8504a = textManipulationAction;
        this.f8505c = list;
        this.f8506d = textManipulation;
        this.f8507f = editText;
    }

    public final void onClick(View view) {
        this.f8504a.m13346O3(this.f8505c, this.f8506d, this.f8507f, view);
    }
}
