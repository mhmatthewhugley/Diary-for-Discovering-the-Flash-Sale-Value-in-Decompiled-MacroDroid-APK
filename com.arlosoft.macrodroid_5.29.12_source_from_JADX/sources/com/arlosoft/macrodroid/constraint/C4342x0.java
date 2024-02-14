package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.view.View;
import com.arlosoft.macrodroid.common.C4023j0;

/* renamed from: com.arlosoft.macrodroid.constraint.x0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4342x0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f11062a;

    /* renamed from: c */
    public final /* synthetic */ C4023j0.C4028e f11063c;

    /* renamed from: d */
    public final /* synthetic */ IpAddressConstraint f11064d;

    public /* synthetic */ C4342x0(Activity activity, C4023j0.C4028e eVar, IpAddressConstraint ipAddressConstraint) {
        this.f11062a = activity;
        this.f11063c = eVar;
        this.f11064d = ipAddressConstraint;
    }

    public final void onClick(View view) {
        IpAddressConstraint.m16573n3(this.f11062a, this.f11063c, this.f11064d, view);
    }
}
