package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class GmsClientSupervisor {

    /* renamed from: a */
    private static int f3648a = 4225;

    /* renamed from: b */
    private static final Object f3649b = new Object();
    @Nullable

    /* renamed from: c */
    private static zzr f3650c = null;
    @Nullable
    @VisibleForTesting

    /* renamed from: d */
    static HandlerThread f3651d = null;

    /* renamed from: e */
    private static boolean f3652e = false;

    @KeepForSdk
    /* renamed from: b */
    public static int m4443b() {
        return f3648a;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static GmsClientSupervisor m4444c(@NonNull Context context) {
        Looper looper;
        synchronized (f3649b) {
            if (f3650c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f3652e) {
                    looper = m4445d().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f3650c = new zzr(applicationContext, looper);
            }
        }
        return f3650c;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public static HandlerThread m4445d() {
        synchronized (f3649b) {
            HandlerThread handlerThread = f3651d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f3651d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f3651d;
            return handlerThread3;
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo21696a(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        return mo21700h(new zzn(componentName, m4443b()), serviceConnection, str, (Executor) null);
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo21697e(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        mo21698f(new zzn(componentName, m4443b()), serviceConnection, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo21698f(zzn zzn, ServiceConnection serviceConnection, String str);

    /* renamed from: g */
    public final void mo21699g(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z) {
        mo21698f(new zzn(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo21700h(zzn zzn, ServiceConnection serviceConnection, String str, @Nullable Executor executor);
}
