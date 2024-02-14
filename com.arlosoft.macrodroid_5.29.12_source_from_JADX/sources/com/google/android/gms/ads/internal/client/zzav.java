package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
abstract class zzav {
    @Nullable

    /* renamed from: a */
    private static final zzcc f1852a;

    static {
        zzcc zzcc = null;
        try {
            Object newInstance = zzau.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcgp.m45229g("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcc = queryLocalInterface instanceof zzcc ? (zzcc) queryLocalInterface : new zzca(iBinder);
                }
            }
        } catch (Exception unused) {
            zzcgp.m45229g("Failed to instantiate ClientApi class.");
        }
        f1852a = zzcc;
    }

    zzav() {
    }

    @Nullable
    /* renamed from: e */
    private final Object m1910e() {
        zzcc zzcc = f1852a;
        if (zzcc != null) {
            try {
                return mo19872b(zzcc);
            } catch (RemoteException e) {
                zzcgp.m45230h("Cannot invoke local loader using ClientApi class.", e);
                return null;
            }
        } else {
            zzcgp.m45229g("ClientApi class cannot be loaded.");
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    private final Object m1911f() {
        try {
            return mo19873c();
        } catch (RemoteException e) {
            zzcgp.m45230h("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: a */
    public abstract Object mo19871a();

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: b */
    public abstract Object mo19872b(zzcc zzcc) throws RemoteException;

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: c */
    public abstract Object mo19873c() throws RemoteException;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo19884d(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L_0x0015
            com.google.android.gms.ads.internal.client.zzaw.m1917b()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r1 = com.google.android.gms.internal.ads.zzcgi.m45182r(r9, r1)
            if (r1 != 0) goto L_0x0015
            java.lang.String r10 = "Google Play Services is not available."
            com.google.android.gms.internal.ads.zzcgp.m45224b(r10)
            r10 = 1
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.m5094a(r9, r1)
            int r1 = com.google.android.gms.dynamite.DynamiteModule.m5095c(r9, r1)
            r3 = 0
            if (r2 <= r1) goto L_0x0024
            r1 = 0
            goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            r1 = r1 ^ r0
            r10 = r10 | r1
            com.google.android.gms.internal.ads.zzbjc.m43542c(r9)
            com.google.android.gms.internal.ads.zzbke r1 = com.google.android.gms.internal.ads.zzbkn.f27414a
            java.lang.Object r1 = r1.mo42728e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x003a
        L_0x0038:
            r10 = 0
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.internal.ads.zzbke r1 = com.google.android.gms.internal.ads.zzbkn.f27415b
            java.lang.Object r1 = r1.mo42728e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x004b
            r10 = 1
            r3 = 1
            goto L_0x004d
        L_0x004b:
            r3 = r10
            goto L_0x0038
        L_0x004d:
            if (r3 == 0) goto L_0x005c
            java.lang.Object r9 = r8.m1910e()
            if (r9 != 0) goto L_0x00a2
            if (r10 != 0) goto L_0x00a2
            java.lang.Object r9 = r8.m1911f()
            goto L_0x00a2
        L_0x005c:
            java.lang.Object r10 = r8.m1911f()
            if (r10 != 0) goto L_0x009a
            com.google.android.gms.internal.ads.zzbke r1 = com.google.android.gms.internal.ads.zzbla.f27483a
            java.lang.Object r1 = r1.mo42728e()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            java.util.Random r2 = com.google.android.gms.ads.internal.client.zzaw.m1920e()
            int r1 = r2.nextInt(r1)
            if (r1 != 0) goto L_0x009a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r1 = "action"
            java.lang.String r2 = "dynamite_load"
            r6.putString(r1, r2)
            java.lang.String r1 = "is_missing"
            r6.putInt(r1, r0)
            com.google.android.gms.internal.ads.zzcgi r2 = com.google.android.gms.ads.internal.client.zzaw.m1917b()
            com.google.android.gms.internal.ads.zzcgv r0 = com.google.android.gms.ads.internal.client.zzaw.m1918c()
            java.lang.String r4 = r0.f28446a
            r7 = 1
            java.lang.String r5 = "gmob-apps"
            r3 = r9
            r2.mo43554m(r3, r4, r5, r6, r7)
        L_0x009a:
            if (r10 != 0) goto L_0x00a1
            java.lang.Object r9 = r8.m1910e()
            goto L_0x00a2
        L_0x00a1:
            r9 = r10
        L_0x00a2:
            if (r9 != 0) goto L_0x00a8
            java.lang.Object r9 = r8.mo19871a()
        L_0x00a8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzav.mo19884d(android.content.Context, boolean):java.lang.Object");
    }
}
