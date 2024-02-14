package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.widget.C6638f;

/* renamed from: com.arlosoft.macrodroid.constraint.k3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4280k3 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TimeOfDayConstraint f10896a;

    /* renamed from: c */
    public final /* synthetic */ C6638f f10897c;

    public /* synthetic */ C4280k3(TimeOfDayConstraint timeOfDayConstraint, C6638f fVar) {
        this.f10896a = timeOfDayConstraint;
        this.f10897c = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10896a.m17101n3(this.f10897c, dialogInterface, i);
    }
}
