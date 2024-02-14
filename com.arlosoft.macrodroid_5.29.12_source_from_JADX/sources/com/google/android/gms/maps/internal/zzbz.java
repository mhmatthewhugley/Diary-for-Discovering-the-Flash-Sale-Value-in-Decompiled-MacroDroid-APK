package com.google.android.gms.maps.internal;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;

public class zzbz {

    /* renamed from: a */
    private static final String f46215a = "zzbz";
    @Nullable

    /* renamed from: b */
    private static Context f46216b;

    /* renamed from: c */
    private static zze f46217c;

    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.maps.internal.zze m65134a(android.content.Context r3) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            com.google.android.gms.common.internal.Preconditions.m4488k(r3)
            com.google.android.gms.maps.internal.zze r0 = f46217c
            if (r0 == 0) goto L_0x0008
            return r0
        L_0x0008:
            r0 = 13400000(0xcc77c0, float:1.87774E-38)
            int r0 = com.google.android.gms.common.GooglePlayServicesUtil.m3559h(r3, r0)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = f46215a
            java.lang.String r1 = "Making Creator dynamically"
            android.util.Log.i(r0, r1)
            android.content.Context r0 = m65137d(r3)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = m65136c(r0, r1)
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x002c
            r0 = 0
            goto L_0x0040
        L_0x002c:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.zze
            if (r2 == 0) goto L_0x003a
            r0 = r1
            com.google.android.gms.maps.internal.zze r0 = (com.google.android.gms.maps.internal.zze) r0
            goto L_0x0040
        L_0x003a:
            com.google.android.gms.maps.internal.zzf r1 = new com.google.android.gms.maps.internal.zzf
            r1.<init>(r0)
            r0 = r1
        L_0x0040:
            f46217c = r0
            android.content.Context r3 = m65137d(r3)     // Catch:{ RemoteException -> 0x0056 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x0056 }
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.m5051g8(r3)     // Catch:{ RemoteException -> 0x0056 }
            int r1 = com.google.android.gms.common.GooglePlayServicesUtil.f3064f     // Catch:{ RemoteException -> 0x0056 }
            r0.mo54652Ja(r3, r1)     // Catch:{ RemoteException -> 0x0056 }
            com.google.android.gms.maps.internal.zze r3 = f46217c
            return r3
        L_0x0056:
            r3 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r0.<init>(r3)
            throw r0
        L_0x005d:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzbz.m65134a(android.content.Context):com.google.android.gms.maps.internal.zze");
    }

    /* renamed from: b */
    private static <T> T m65135b(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name) : new String("Unable to instantiate the dynamic class "));
        } catch (IllegalAccessException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to call the default constructor of ".concat(name2) : new String("Unable to call the default constructor of "));
        }
    }

    /* renamed from: c */
    private static <T> T m65136c(ClassLoader classLoader, String str) {
        try {
            return m65135b(((ClassLoader) Preconditions.m4488k(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to find dynamic class ".concat(valueOf) : new String("Unable to find dynamic class "));
        }
    }

    @Nullable
    /* renamed from: d */
    private static Context m65137d(Context context) {
        Context context2 = f46216b;
        if (context2 != null) {
            return context2;
        }
        Context e = m65138e(context);
        f46216b = e;
        return e;
    }

    @Nullable
    /* renamed from: e */
    private static Context m65138e(Context context) {
        try {
            return DynamiteModule.m5096e(context, DynamiteModule.f4040b, "com.google.android.gms.maps_dynamite").mo22053b();
        } catch (Exception e) {
            Log.e(f46215a, "Failed to load maps module, use legacy", e);
            return GooglePlayServicesUtil.m3557e(context);
        }
    }
}
