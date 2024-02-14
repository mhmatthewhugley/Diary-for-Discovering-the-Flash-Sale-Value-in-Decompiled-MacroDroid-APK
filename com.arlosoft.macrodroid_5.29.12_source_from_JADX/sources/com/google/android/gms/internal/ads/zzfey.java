package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzcj;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfey {
    @GuardedBy("LiteSdkInfoRetriever.class")

    /* renamed from: d */
    private static zzfey f35667d;

    /* renamed from: a */
    private final Context f35668a;

    /* renamed from: b */
    private final zzcj f35669b;

    /* renamed from: c */
    private final AtomicReference f35670c = new AtomicReference();

    @VisibleForTesting
    zzfey(Context context, zzcj zzcj) {
        this.f35668a = context;
        this.f35669b = zzcj;
    }

    @VisibleForTesting
    /* renamed from: a */
    static zzcj m50036a(Context context) {
        try {
            return zzci.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzcgp.m45227e("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    /* renamed from: d */
    public static zzfey m50037d(Context context) {
        synchronized (zzfey.class) {
            zzfey zzfey = f35667d;
            if (zzfey != null) {
                return zzfey;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbku.f27467b.mo42728e()).longValue();
            zzcj zzcj = null;
            if (longValue > 0 && longValue <= 223104600) {
                zzcj = m50036a(applicationContext);
            }
            zzfey zzfey2 = new zzfey(applicationContext, zzcj);
            f35667d = zzfey2;
            return zzfey2;
        }
    }

    /* renamed from: b */
    public final zzbvk mo45633b() {
        return (zzbvk) this.f35670c.get();
    }

    /* renamed from: c */
    public final zzcgv mo45634c(int i, boolean z, int i2) {
        zzt.m2905r();
        boolean a = zzs.m2750a(this.f35668a);
        zzcgv zzcgv = new zzcgv(223104000, i2, true, a);
        if (!((Boolean) zzbku.f27468c.mo42728e()).booleanValue()) {
            return zzcgv;
        }
        zzcj zzcj = this.f35669b;
        zzeh zzeh = null;
        if (zzcj != null) {
            try {
                zzeh = zzcj.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        if (zzeh == null) {
            return zzcgv;
        }
        return new zzcgv(223104000, zzeh.zza(), true, a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45635e(com.google.android.gms.internal.ads.zzbvk r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbke r0 = com.google.android.gms.internal.ads.zzbku.f27466a
            java.lang.Object r0 = r0.mo42728e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.google.android.gms.ads.internal.client.zzcj r0 = r3.f35669b
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0019
        L_0x0015:
            com.google.android.gms.internal.ads.zzbvk r0 = r0.getAdapterCreator()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r2 = r3.f35670c
            if (r0 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r4 = r0
        L_0x001f:
            com.google.android.gms.internal.ads.zzfex.m50035a(r2, r1, r4)
            return
        L_0x0023:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f35670c
            com.google.android.gms.internal.ads.zzfex.m50035a(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfey.mo45635e(com.google.android.gms.internal.ads.zzbvk):void");
    }
}
