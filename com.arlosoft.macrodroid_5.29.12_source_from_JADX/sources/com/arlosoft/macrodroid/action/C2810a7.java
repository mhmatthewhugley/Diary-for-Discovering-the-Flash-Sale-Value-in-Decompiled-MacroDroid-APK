package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.a7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2810a7 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ForwardSMSAction f7738a;

    /* renamed from: c */
    public final /* synthetic */ List f7739c;

    public /* synthetic */ C2810a7(ForwardSMSAction forwardSMSAction, List list) {
        this.f7738a = forwardSMSAction;
        this.f7739c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7738a.m10923o3(this.f7739c, dialogInterface, i);
    }
}
