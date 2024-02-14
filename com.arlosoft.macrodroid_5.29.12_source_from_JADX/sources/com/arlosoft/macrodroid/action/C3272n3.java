package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.concurrent.Callable;

/* renamed from: com.arlosoft.macrodroid.action.n3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3272n3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ ConnectivityCheckAction f8737a;

    /* renamed from: c */
    public final /* synthetic */ TriggerContextInfo f8738c;

    public /* synthetic */ C3272n3(ConnectivityCheckAction connectivityCheckAction, TriggerContextInfo triggerContextInfo) {
        this.f8737a = connectivityCheckAction;
        this.f8738c = triggerContextInfo;
    }

    public final Object call() {
        return ConnectivityCheckAction.m10239B3(this.f8737a, this.f8738c);
    }
}
