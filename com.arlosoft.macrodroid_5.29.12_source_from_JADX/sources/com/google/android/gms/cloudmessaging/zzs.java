package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class zzs {
    @Nullable

    /* renamed from: e */
    private static zzs f3004e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f3005a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f3006b;

    /* renamed from: c */
    private zzm f3007c = new zzm(this, (zzl) null);

    /* renamed from: d */
    private int f3008d = 1;

    @VisibleForTesting
    zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f3006b = scheduledExecutorService;
        this.f3005a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized zzs m3463b(Context context) {
        zzs zzs;
        synchronized (zzs.class) {
            if (f3004e == null) {
                zze.m55870a();
                f3004e = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            zzs = f3004e;
        }
        return zzs;
    }

    /* renamed from: f */
    private final synchronized int m3465f() {
        int i;
        i = this.f3008d;
        this.f3008d = i + 1;
        return i;
    }

    /* renamed from: g */
    private final synchronized <T> Task<T> m3466g(zzp<T> zzp) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(zzp);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
        }
        if (!this.f3007c.mo21106g(zzp)) {
            zzm zzm = new zzm(this, (zzl) null);
            this.f3007c = zzm;
            zzm.mo21106g(zzp);
        }
        return zzp.f3001b.mo56137a();
    }

    /* renamed from: c */
    public final Task<Void> mo21115c(int i, Bundle bundle) {
        return m3466g(new zzo(m3465f(), 2, bundle));
    }

    /* renamed from: d */
    public final Task<Bundle> mo21116d(int i, Bundle bundle) {
        return m3466g(new zzr(m3465f(), 1, bundle));
    }
}
