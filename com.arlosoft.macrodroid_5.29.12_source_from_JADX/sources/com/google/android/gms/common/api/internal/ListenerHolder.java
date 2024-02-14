package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ListenerHolder<L> {

    /* renamed from: a */
    private final Executor f3201a;
    @Nullable

    /* renamed from: b */
    private volatile Object f3202b;
    @Nullable

    /* renamed from: c */
    private volatile ListenerKey f3203c;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class ListenerKey<L> {

        /* renamed from: a */
        private final Object f3204a;

        /* renamed from: b */
        private final String f3205b;

        @KeepForSdk
        ListenerKey(L l, String str) {
            this.f3204a = l;
            this.f3205b = str;
        }

        @KeepForSdk
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.f3204a == listenerKey.f3204a && this.f3205b.equals(listenerKey.f3205b);
        }

        @KeepForSdk
        public int hashCode() {
            return (System.identityHashCode(this.f3204a) * 31) + this.f3205b.hashCode();
        }
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface Notifier<L> {
        @KeepForSdk
        /* renamed from: a */
        void mo21337a(@NonNull L l);

        @KeepForSdk
        /* renamed from: b */
        void mo21338b();
    }

    @KeepForSdk
    ListenerHolder(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.f3201a = new HandlerExecutor(looper);
        this.f3202b = Preconditions.m4489l(l, "Listener must not be null");
        this.f3203c = new ListenerKey(l, Preconditions.m4484g(str));
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo21375a() {
        this.f3202b = null;
        this.f3203c = null;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public ListenerKey<L> mo21376b() {
        return this.f3203c;
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo21377c(@NonNull Notifier<? super L> notifier) {
        Preconditions.m4489l(notifier, "Notifier must not be null");
        this.f3201a.execute(new zacb(this, notifier));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo21378d(Notifier notifier) {
        Object obj = this.f3202b;
        if (obj == null) {
            notifier.mo21338b();
            return;
        }
        try {
            notifier.mo21337a(obj);
        } catch (RuntimeException e) {
            notifier.mo21338b();
            throw e;
        }
    }
}
