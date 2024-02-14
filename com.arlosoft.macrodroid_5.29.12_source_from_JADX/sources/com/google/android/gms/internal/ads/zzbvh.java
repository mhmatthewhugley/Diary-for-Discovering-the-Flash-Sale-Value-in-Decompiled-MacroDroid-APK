package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbvh extends zzbvj {

    /* renamed from: a */
    private static final zzbxh f27857a = new zzbxh();

    /* renamed from: f0 */
    public final zzbxd mo43028f0(String str) throws RemoteException {
        try {
            return new zzbxo((RtbAdapter) Class.forName(str, false, zzbxh.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    /* renamed from: h0 */
    public final boolean mo43029h0(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbvh.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcgp.m45229g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    /* renamed from: t */
    public final zzbvn mo43030t(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, zzbvh.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzbwj((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            if (Adapter.class.isAssignableFrom(cls)) {
                return new zzbwj((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            zzcgp.m45229g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
            throw new RemoteException();
        } catch (Throwable th) {
            zzcgp.m45230h("Could not instantiate mediation adapter: " + str + ". ", th);
        }
        throw new RemoteException();
    }

    /* renamed from: z */
    public final boolean mo43031z(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbvh.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcgp.m45229g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
