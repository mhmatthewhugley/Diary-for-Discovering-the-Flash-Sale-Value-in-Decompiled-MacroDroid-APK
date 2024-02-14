package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.constraint.e2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4247e2 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ModeConstraint f10830a;

    /* renamed from: c */
    public final /* synthetic */ List f10831c;

    /* renamed from: d */
    public final /* synthetic */ String[] f10832d;

    public /* synthetic */ C4247e2(ModeConstraint modeConstraint, List list, String[] strArr) {
        this.f10830a = modeConstraint;
        this.f10831c = list;
        this.f10832d = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10830a.m16801p3(this.f10831c, this.f10832d, dialogInterface, i);
    }
}
