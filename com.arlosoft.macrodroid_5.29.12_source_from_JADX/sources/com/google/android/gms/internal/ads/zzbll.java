package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbll {

    /* renamed from: a */
    private final Context f27507a;

    public zzbll(Context context) {
        this.f27507a = context;
    }

    /* renamed from: a */
    public final void mo42730a(zzcam zzcam) {
        try {
            ((zzblm) zzcgt.m45236b(this.f27507a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzblk.f27506a)).mo42731Z8(zzcam);
        } catch (zzcgs e) {
            zzcgp.m45229g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e.getMessage())));
        } catch (RemoteException e2) {
            zzcgp.m45229g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
