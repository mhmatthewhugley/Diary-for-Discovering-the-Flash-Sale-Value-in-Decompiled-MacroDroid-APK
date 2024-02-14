package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzcnc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IObjectWrapper f29062a;

    public /* synthetic */ zzcnc(IObjectWrapper iObjectWrapper) {
        this.f29062a = iObjectWrapper;
    }

    public final void run() {
        IObjectWrapper iObjectWrapper = this.f29062a;
        zzt.m2888a();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27126g4)).booleanValue() && zzfkp.m50420b()) {
            Object A1 = ObjectWrapper.m5050A1(iObjectWrapper);
            if (A1 instanceof zzfkr) {
                ((zzfkr) A1).mo45867c();
            }
        }
    }
}
