package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ProviderInstaller {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final GoogleApiAvailabilityLight f47931a = GoogleApiAvailabilityLight.m3542h();

    /* renamed from: b */
    private static final Object f47932b = new Object();
    @GuardedBy("ProviderInstaller.lock")

    /* renamed from: c */
    private static Method f47933c = null;
    @GuardedBy("ProviderInstaller.lock")

    /* renamed from: d */
    private static Method f47934d = null;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface ProviderInstallListener {
        /* renamed from: a */
        void mo56098a();

        /* renamed from: b */
        void mo56099b(int i, @Nullable Intent intent);
    }

    /* renamed from: a */
    public static void m66581a(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        Preconditions.m4489l(context, "Context must not be null");
        f47931a.mo21176n(context, 11925000);
        synchronized (f47932b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m5096e(context, DynamiteModule.f4044f, "com.google.android.gms.providerinstaller.dynamite").mo22053b();
            } catch (DynamiteModule.LoadingException e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context e2 = GooglePlayServicesUtilLight.m3564e(context);
                if (e2 != null) {
                    try {
                        if (f47934d == null) {
                            Class cls = Long.TYPE;
                            f47934d = m66583c(e2, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f47934d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e3) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e3.getMessage())));
                    }
                }
                if (e2 != null) {
                    m66584d(e2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            } else {
                m66584d(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    /* renamed from: c */
    private static Method m66583c(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @GuardedBy("ProviderInstaller.lock")
    /* renamed from: d */
    private static void m66584d(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f47933c == null) {
                f47933c = m66583c(context, str, "insertProvider", new Class[]{Context.class});
            }
            f47933c.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.getMessage() : cause.getMessage())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
