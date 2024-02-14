package com.arlosoft.macrodroid.action;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import java.util.ArrayList;

/* renamed from: com.arlosoft.macrodroid.action.he */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3115he implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ReadScreenContentsAction f8429a;

    /* renamed from: c */
    public final /* synthetic */ MacroDroidVariable f8430c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f8431d;

    /* renamed from: f */
    public final /* synthetic */ EditText f8432f;

    /* renamed from: g */
    public final /* synthetic */ AppCompatDialog f8433g;

    public /* synthetic */ C3115he(ReadScreenContentsAction readScreenContentsAction, MacroDroidVariable macroDroidVariable, ArrayList arrayList, EditText editText, AppCompatDialog appCompatDialog) {
        this.f8429a = readScreenContentsAction;
        this.f8430c = macroDroidVariable;
        this.f8431d = arrayList;
        this.f8432f = editText;
        this.f8433g = appCompatDialog;
    }

    public final void onClick(View view) {
        ReadScreenContentsAction.m11959v3(this.f8429a, this.f8430c, this.f8431d, this.f8432f, this.f8433g, view);
    }
}
