package com.arlosoft.macrodroid.triggers;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.triggers.z9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6215z9 implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ WebHookTrigger f14779a;

    /* renamed from: c */
    public final /* synthetic */ C16265l f14780c;

    public /* synthetic */ C6215z9(WebHookTrigger webHookTrigger, C16265l lVar) {
        this.f14779a = webHookTrigger;
        this.f14780c = lVar;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        WebHookTrigger.m23636X3(this.f14779a, this.f14780c, task);
    }
}
