package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: a */
    private final String f3960a;

    /* renamed from: c */
    private final AtomicInteger f3961c = new AtomicInteger();

    /* renamed from: d */
    private final ThreadFactory f3962d = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String str) {
        Preconditions.m4489l(str, "Name must not be null");
        this.f3960a = str;
    }

    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f3962d.newThread(new zza(runnable, 0));
        String str = this.f3960a;
        int andIncrement = this.f3961c.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}
