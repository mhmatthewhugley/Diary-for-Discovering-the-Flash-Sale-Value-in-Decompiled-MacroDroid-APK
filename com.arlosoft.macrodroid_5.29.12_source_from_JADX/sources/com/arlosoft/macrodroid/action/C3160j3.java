package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p216ba.C11113d;

/* renamed from: com.arlosoft.macrodroid.action.j3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3160j3 implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ ConnectivityCheckAction f8518a;

    /* renamed from: c */
    public final /* synthetic */ TriggerContextInfo f8519c;

    public /* synthetic */ C3160j3(ConnectivityCheckAction connectivityCheckAction, TriggerContextInfo triggerContextInfo) {
        this.f8518a = connectivityCheckAction;
        this.f8519c = triggerContextInfo;
    }

    public final void accept(Object obj) {
        ConnectivityCheckAction.m10241D3(this.f8518a, this.f8519c, (Boolean) obj);
    }
}
