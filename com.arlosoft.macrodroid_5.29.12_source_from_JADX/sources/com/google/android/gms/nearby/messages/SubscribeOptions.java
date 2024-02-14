package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class SubscribeOptions {
    @NonNull

    /* renamed from: f */
    public static final SubscribeOptions f47666f = new Builder().mo55915a();

    /* renamed from: a */
    private final Strategy f47667a;

    /* renamed from: b */
    private final MessageFilter f47668b;
    @Nullable

    /* renamed from: c */
    private final SubscribeCallback f47669c;

    /* renamed from: d */
    public final boolean f47670d = false;

    /* renamed from: e */
    public final int f47671e = 0;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {

        /* renamed from: a */
        private Strategy f47672a = Strategy.f47653z;

        /* renamed from: b */
        private MessageFilter f47673b = MessageFilter.f47630p;
        @Nullable

        /* renamed from: c */
        private SubscribeCallback f47674c;

        @NonNull
        /* renamed from: a */
        public SubscribeOptions mo55915a() {
            return new SubscribeOptions(this.f47672a, this.f47673b, this.f47674c, false, 0, (zzg) null);
        }
    }

    /* synthetic */ SubscribeOptions(Strategy strategy, MessageFilter messageFilter, SubscribeCallback subscribeCallback, boolean z, int i, zzg zzg) {
        this.f47667a = strategy;
        this.f47668b = messageFilter;
        this.f47669c = subscribeCallback;
    }

    @NonNull
    /* renamed from: a */
    public MessageFilter mo55912a() {
        return this.f47668b;
    }

    @NonNull
    /* renamed from: b */
    public Strategy mo55913b() {
        return this.f47667a;
    }

    @NonNull
    public String toString() {
        String valueOf = String.valueOf(this.f47667a);
        String valueOf2 = String.valueOf(this.f47668b);
        return "SubscribeOptions{strategy=" + valueOf + ", filter=" + valueOf2 + "}";
    }
}
