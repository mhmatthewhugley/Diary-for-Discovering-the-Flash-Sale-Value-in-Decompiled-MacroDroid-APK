package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ListenerHolders {

    /* renamed from: a */
    private final Set f3206a = Collections.newSetFromMap(new WeakHashMap());

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <L> ListenerHolder<L> m3811a(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        Preconditions.m4489l(l, "Listener must not be null");
        Preconditions.m4489l(looper, "Looper must not be null");
        Preconditions.m4489l(str, "Listener type must not be null");
        return new ListenerHolder<>(looper, l, str);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static <L> ListenerHolder.ListenerKey<L> m3812b(@NonNull L l, @NonNull String str) {
        Preconditions.m4489l(l, "Listener must not be null");
        Preconditions.m4489l(str, "Listener type must not be null");
        Preconditions.m4485h(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey<>(l, str);
    }

    @NonNull
    /* renamed from: c */
    public final ListenerHolder mo21381c(@NonNull Object obj, @NonNull Looper looper, @NonNull String str) {
        ListenerHolder a = m3811a(obj, looper, "NO_TYPE");
        this.f3206a.add(a);
        return a;
    }

    /* renamed from: d */
    public final void mo21382d() {
        for (ListenerHolder a : this.f3206a) {
            a.mo21375a();
        }
        this.f3206a.clear();
    }
}
