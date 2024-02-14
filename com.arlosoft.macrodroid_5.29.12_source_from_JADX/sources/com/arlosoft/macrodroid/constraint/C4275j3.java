package com.arlosoft.macrodroid.constraint;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.widget.C6638f;

/* renamed from: com.arlosoft.macrodroid.constraint.j3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4275j3 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TimeOfDayConstraint f10880a;

    /* renamed from: c */
    public final /* synthetic */ C6638f f10881c;

    public /* synthetic */ C4275j3(TimeOfDayConstraint timeOfDayConstraint, C6638f fVar) {
        this.f10880a = timeOfDayConstraint;
        this.f10881c = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10880a.m17099l3(this.f10881c, dialogInterface, i);
    }
}
