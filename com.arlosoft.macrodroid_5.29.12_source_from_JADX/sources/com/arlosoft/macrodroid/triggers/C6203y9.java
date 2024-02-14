package com.arlosoft.macrodroid.triggers;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.triggers.y9 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6203y9 implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ WebHookTrigger f14744a;

    /* renamed from: c */
    public final /* synthetic */ String f14745c;

    /* renamed from: d */
    public final /* synthetic */ String f14746d;

    /* renamed from: f */
    public final /* synthetic */ C16265l f14747f;

    public /* synthetic */ C6203y9(WebHookTrigger webHookTrigger, String str, String str2, C16265l lVar) {
        this.f14744a = webHookTrigger;
        this.f14745c = str;
        this.f14746d = str2;
        this.f14747f = lVar;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        WebHookTrigger.m23641c4(this.f14744a, this.f14745c, this.f14746d, this.f14747f, task);
    }
}
