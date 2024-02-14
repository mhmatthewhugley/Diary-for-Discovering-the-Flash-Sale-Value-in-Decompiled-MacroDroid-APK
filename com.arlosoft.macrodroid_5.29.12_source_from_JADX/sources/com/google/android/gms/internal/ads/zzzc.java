package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzzc {

    /* renamed from: a */
    private final zzzb f39030a;

    /* renamed from: b */
    private final AtomicBoolean f39031b = new AtomicBoolean(false);

    public zzzc(zzzb zzzb) {
        this.f39030a = zzzb;
    }

    @Nullable
    /* renamed from: a */
    public final zzzi mo48463a(Object... objArr) {
        Constructor constructor;
        synchronized (this.f39031b) {
            if (!this.f39031b.get()) {
                try {
                    constructor = this.f39030a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f39031b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (zzzi) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
