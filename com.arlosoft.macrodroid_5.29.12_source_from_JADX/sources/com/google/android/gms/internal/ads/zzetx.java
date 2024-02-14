package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzetx implements zzevd {

    /* renamed from: a */
    private final String f34907a;

    /* renamed from: b */
    private final String f34908b;

    public zzetx(String str, String str2) {
        this.f34907a = str;
        this.f34908b = str2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27058Z5)).booleanValue()) {
            bundle.putString("request_id", this.f34908b);
        } else {
            bundle.putString("request_id", this.f34907a);
        }
    }
}
