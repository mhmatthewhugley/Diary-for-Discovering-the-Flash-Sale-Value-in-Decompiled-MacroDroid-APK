package com.arlosoft.macrodroid.action;

import com.arlosoft.macrodroid.action.HttpRequestAction;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: com.arlosoft.macrodroid.action.b7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2938b7 implements HostnameVerifier {

    /* renamed from: a */
    public static final /* synthetic */ C2938b7 f8035a = new C2938b7();

    private /* synthetic */ C2938b7() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return HttpRequestAction.C2479d.m10973p(str, sSLSession);
    }
}
