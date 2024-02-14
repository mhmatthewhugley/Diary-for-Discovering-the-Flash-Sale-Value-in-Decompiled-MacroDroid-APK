package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.nb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3280nb implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpenFileAction f8758a;

    /* renamed from: c */
    public final /* synthetic */ List f8759c;

    /* renamed from: d */
    public final /* synthetic */ String[] f8760d;

    public /* synthetic */ C3280nb(OpenFileAction openFileAction, List list, String[] strArr) {
        this.f8758a = openFileAction;
        this.f8759c = list;
        this.f8760d = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8758a.m11648o3(this.f8759c, this.f8760d, dialogInterface, i);
    }
}
