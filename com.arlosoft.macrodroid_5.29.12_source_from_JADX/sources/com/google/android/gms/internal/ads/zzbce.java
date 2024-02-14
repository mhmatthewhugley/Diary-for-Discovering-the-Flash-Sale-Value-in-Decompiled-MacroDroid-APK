package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzby;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbce extends zzby {

    /* renamed from: a */
    private final AppEventListener f26560a;

    public zzbce(AppEventListener appEventListener) {
        this.f26560a = appEventListener;
    }

    /* renamed from: Kb */
    public final AppEventListener mo42423Kb() {
        return this.f26560a;
    }

    /* renamed from: y1 */
    public final void mo19964y1(String str, String str2) {
        this.f26560a.onAppEvent(str, str2);
    }
}
