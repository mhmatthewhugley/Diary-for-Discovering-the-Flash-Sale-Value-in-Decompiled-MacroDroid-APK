package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfan {
    /* renamed from: a */
    public static void m49791a(AtomicReference atomicReference, zzfam zzfam) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                zzfam.mo45393a(obj);
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                zzcgp.m45230h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}
