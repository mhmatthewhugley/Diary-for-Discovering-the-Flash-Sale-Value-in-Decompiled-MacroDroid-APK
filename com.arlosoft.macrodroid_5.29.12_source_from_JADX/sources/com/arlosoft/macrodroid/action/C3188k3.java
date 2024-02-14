package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p216ba.C11113d;

/* renamed from: com.arlosoft.macrodroid.action.k3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3188k3 implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ ConnectivityCheckAction f8575a;

    /* renamed from: c */
    public final /* synthetic */ TriggerContextInfo f8576c;

    public /* synthetic */ C3188k3(ConnectivityCheckAction connectivityCheckAction, TriggerContextInfo triggerContextInfo) {
        this.f8575a = connectivityCheckAction;
        this.f8576c = triggerContextInfo;
    }

    public final void accept(Object obj) {
        ConnectivityCheckAction.m10242E3(this.f8575a, this.f8576c, (Throwable) obj);
    }
}
