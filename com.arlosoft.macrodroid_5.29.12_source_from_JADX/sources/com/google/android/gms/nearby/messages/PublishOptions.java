package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class PublishOptions {
    @NonNull

    /* renamed from: c */
    public static final PublishOptions f47646c = new Builder().mo55902a();

    /* renamed from: a */
    private final Strategy f47647a;
    @Nullable

    /* renamed from: b */
    private final PublishCallback f47648b;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {

        /* renamed from: a */
        private Strategy f47649a = Strategy.f47653z;
        @Nullable

        /* renamed from: b */
        private PublishCallback f47650b;

        @NonNull
        /* renamed from: a */
        public PublishOptions mo55902a() {
            return new PublishOptions(this.f47649a, this.f47650b, (zze) null);
        }
    }

    /* synthetic */ PublishOptions(Strategy strategy, PublishCallback publishCallback, zze zze) {
        this.f47647a = strategy;
        this.f47648b = publishCallback;
    }

    @NonNull
    /* renamed from: a */
    public Strategy mo55901a() {
        return this.f47647a;
    }
}
