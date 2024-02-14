package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbev {
    @VisibleForTesting

    /* renamed from: a */
    zzase f26721a;
    @VisibleForTesting

    /* renamed from: b */
    boolean f26722b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f26723c;

    public zzbev() {
        this.f26723c = zzcge.f28418b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void mo42556b(Context context) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27066a4)).booleanValue()) {
            try {
                this.f26721a = (zzase) zzcgt.m45236b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzber.f26716a);
                this.f26721a.mo41875T4(ObjectWrapper.m5051g8(context), "GMA_SDK");
                this.f26722b = true;
            } catch (RemoteException | zzcgs | NullPointerException unused) {
                zzcgp.m45224b("Cannot dynamite load clearcut");
            }
        }
    }

    public zzbev(Context context) {
        ExecutorService executorService = zzcge.f28418b;
        this.f26723c = executorService;
        zzbjc.m43542c(context);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26875G8)).booleanValue()) {
            executorService.execute(new zzbeq(this, context));
        } else {
            mo42556b(context);
        }
    }
}
