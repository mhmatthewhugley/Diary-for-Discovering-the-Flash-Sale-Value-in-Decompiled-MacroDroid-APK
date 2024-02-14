package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzb {
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    @Nullable

    /* renamed from: a */
    private static volatile ClassLoader f4061a;
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    @Nullable

    /* renamed from: b */
    private static volatile Thread f4062b;

    @Nullable
    /* renamed from: a */
    public static synchronized ClassLoader m5109a() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (f4061a == null) {
                f4061a = m5110b();
            }
            classLoader = f4061a;
        }
        return classLoader;
    }

    @Nullable
    /* renamed from: b */
    private static synchronized ClassLoader m5110b() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (f4062b == null) {
                f4062b = m5111c();
                if (f4062b == null) {
                    return null;
                }
            }
            synchronized (f4062b) {
                try {
                    classLoader = f4062b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    @Nullable
    /* renamed from: c */
    private static synchronized Thread m5111c() {
        zza zza;
        zza zza2;
        SecurityException e;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            zza = null;
                            break;
                        }
                        zza = threadArr[i];
                        if ("GmsDynamite".equals(zza.getName())) {
                            break;
                        }
                        i++;
                    }
                    if (zza == null) {
                        try {
                            zza2 = new zza(threadGroup, "GmsDynamite");
                            try {
                                zza2.setContextClassLoader((ClassLoader) null);
                                zza2.start();
                            } catch (SecurityException e2) {
                                e = e2;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            zza2 = zza;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                            zza = zza2;
                            return zza;
                        }
                        zza = zza2;
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    zza2 = null;
                    Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                    zza = zza2;
                    return zza;
                }
            }
            return zza;
        }
    }
}
