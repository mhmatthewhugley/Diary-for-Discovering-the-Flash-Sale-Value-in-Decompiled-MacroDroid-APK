package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfoz {
    @VisibleForTesting

    /* renamed from: a */
    final zzfpc f36231a;
    @VisibleForTesting

    /* renamed from: b */
    final boolean f36232b;

    private zzfoz(zzfpc zzfpc) {
        this.f36231a = zzfpc;
        this.f36232b = zzfpc != null;
    }

    /* renamed from: b */
    public static zzfoz m50719b(Context context, String str, String str2) {
        zzfpc zzfpc;
        try {
            IBinder d = DynamiteModule.m5096e(context, DynamiteModule.f4040b, ModuleDescriptor.MODULE_ID).mo22054d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (d == null) {
                zzfpc = null;
            } else {
                IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfpc = queryLocalInterface instanceof zzfpc ? (zzfpc) queryLocalInterface : new zzfpa(d);
            }
            try {
                zzfpc.mo46068d6(ObjectWrapper.m5051g8(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new zzfoz(zzfpc);
            } catch (RemoteException | zzfob | NullPointerException | SecurityException unused) {
                return new zzfoz(new zzfpd());
            }
        } catch (Exception e) {
            throw new zzfob(e);
        } catch (Exception e2) {
            throw new zzfob(e2);
        }
    }

    /* renamed from: c */
    public static zzfoz m50720c() {
        return new zzfoz(new zzfpd());
    }

    /* renamed from: a */
    public final zzfoy mo46064a(byte[] bArr) {
        return new zzfoy(this, bArr, (zzfox) null);
    }
}
