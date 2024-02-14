package com.arlosoft.macrodroid.triggers;

import com.google.android.gms.tasks.OnFailureListener;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.triggers.ba */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5879ba implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ C16265l f13955a;

    /* renamed from: b */
    public final /* synthetic */ WebHookTrigger f13956b;

    public /* synthetic */ C5879ba(C16265l lVar, WebHookTrigger webHookTrigger) {
        this.f13955a = lVar;
        this.f13956b = webHookTrigger;
    }

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        WebHookTrigger.m23644f4(this.f13955a, this.f13956b, exc);
    }
}
