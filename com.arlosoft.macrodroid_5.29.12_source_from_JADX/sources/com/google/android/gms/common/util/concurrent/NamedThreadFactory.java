package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: a */
    private final String f3958a;

    /* renamed from: c */
    private final ThreadFactory f3959c = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(@NonNull String str) {
        Preconditions.m4489l(str, "Name must not be null");
        this.f3958a = str;
    }

    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f3959c.newThread(new zza(runnable, 0));
        newThread.setName(this.f3958a);
        return newThread;
    }
}
