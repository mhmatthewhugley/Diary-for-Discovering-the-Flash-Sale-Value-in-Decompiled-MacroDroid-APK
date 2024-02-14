package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaci {

    /* renamed from: a */
    public final RegisterListenerMethod f3415a;

    /* renamed from: b */
    public final UnregisterListenerMethod f3416b;

    /* renamed from: c */
    public final Runnable f3417c;

    public zaci(@NonNull RegisterListenerMethod registerListenerMethod, @NonNull UnregisterListenerMethod unregisterListenerMethod, @NonNull Runnable runnable) {
        this.f3415a = registerListenerMethod;
        this.f3416b = unregisterListenerMethod;
        this.f3417c = runnable;
    }
}
