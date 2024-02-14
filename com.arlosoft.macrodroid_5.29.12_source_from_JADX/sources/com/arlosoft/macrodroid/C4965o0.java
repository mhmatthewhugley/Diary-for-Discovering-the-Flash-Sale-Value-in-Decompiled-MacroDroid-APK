package com.arlosoft.macrodroid;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.o0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4965o0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShortcutActivity f12525a;

    /* renamed from: c */
    public final /* synthetic */ AppCompatDialog f12526c;

    /* renamed from: d */
    public final /* synthetic */ Macro f12527d;

    public /* synthetic */ C4965o0(ShortcutActivity shortcutActivity, AppCompatDialog appCompatDialog, Macro macro) {
        this.f12525a = shortcutActivity;
        this.f12526c = appCompatDialog;
        this.f12527d = macro;
    }

    public final void onClick(View view) {
        this.f12525a.m9530Y1(this.f12526c, this.f12527d, view);
    }
}
