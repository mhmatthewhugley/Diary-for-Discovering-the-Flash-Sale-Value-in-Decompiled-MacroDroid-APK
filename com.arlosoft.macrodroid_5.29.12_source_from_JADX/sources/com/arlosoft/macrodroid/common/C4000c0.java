package com.arlosoft.macrodroid.common;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.common.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4000c0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C4023j0.C4028e f10363a;

    /* renamed from: c */
    public final /* synthetic */ String f10364c;

    /* renamed from: d */
    public final /* synthetic */ String[] f10365d;

    public /* synthetic */ C4000c0(C4023j0.C4028e eVar, String str, String[] strArr) {
        this.f10363a = eVar;
        this.f10364c = str;
        this.f10365d = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10363a.mo25564a(new C4023j0.C4029f(this.f10364c.replace("%s", this.f10365d[((AlertDialog) dialogInterface).getListView().getCheckedItemPosition()]), ""));
    }
}
