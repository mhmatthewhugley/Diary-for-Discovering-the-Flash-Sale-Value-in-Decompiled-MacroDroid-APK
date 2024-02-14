package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zay extends GoogleApi implements ModuleInstallClient {

    /* renamed from: k */
    private static final Api.ClientKey f3846k;

    /* renamed from: l */
    private static final Api.AbstractClientBuilder f3847l;

    /* renamed from: m */
    private static final Api f3848m;

    /* renamed from: n */
    public static final /* synthetic */ int f3849n = 0;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f3846k = clientKey;
        zaq zaq = new zaq();
        f3847l = zaq;
        f3848m = new Api("ModuleInstall.API", zaq, clientKey);
    }
}
