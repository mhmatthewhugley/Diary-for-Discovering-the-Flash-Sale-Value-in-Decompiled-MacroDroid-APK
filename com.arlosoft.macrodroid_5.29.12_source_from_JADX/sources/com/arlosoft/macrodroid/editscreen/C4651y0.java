package com.arlosoft.macrodroid.editscreen;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.common.SelectableItem;

/* renamed from: com.arlosoft.macrodroid.editscreen.y0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4651y0 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C4653z0 f11733a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f11734c;

    /* renamed from: d */
    public final /* synthetic */ SelectableItem f11735d;

    /* renamed from: f */
    public final /* synthetic */ EditText f11736f;

    public /* synthetic */ C4651y0(C4653z0 z0Var, AppCompatDialog appCompatDialog, SelectableItem selectableItem, EditText editText) {
        this.f11733a = z0Var;
        this.f11734c = appCompatDialog;
        this.f11735d = selectableItem;
        this.f11736f = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return C4653z0.m18098h(this.f11733a, this.f11734c, this.f11735d, this.f11736f, textView, i, keyEvent);
    }
}
