package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbyh extends NativeAd.AdChoicesInfo {

    /* renamed from: a */
    private final List f27996a = new ArrayList();

    /* renamed from: b */
    private String f27997b;

    public zzbyh(zzblw zzblw) {
        try {
            this.f27997b = zzblw.mo42738f();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            this.f27997b = "";
        }
        try {
            for (Object next : zzblw.mo42737e()) {
                zzbme Jb = next instanceof IBinder ? zzbmd.m43695Jb((IBinder) next) : null;
                if (Jb != null) {
                    this.f27996a.add(new zzbyj(Jb));
                }
            }
        } catch (RemoteException e2) {
            zzcgp.m45227e("", e2);
        }
    }
}
