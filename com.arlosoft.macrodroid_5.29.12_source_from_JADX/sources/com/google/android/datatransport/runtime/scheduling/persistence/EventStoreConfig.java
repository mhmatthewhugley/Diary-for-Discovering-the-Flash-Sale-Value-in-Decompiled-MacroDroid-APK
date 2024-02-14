package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.auto.value.AutoValue;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;

@AutoValue
abstract class EventStoreConfig {

    /* renamed from: a */
    static final EventStoreConfig f1571a = m1508a().mo19589f(10485760).mo19587d(200).mo19585b(SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE).mo19586c(604800000).mo19588e(81920).mo19584a();

    @AutoValue.Builder
    static abstract class Builder {
        Builder() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract EventStoreConfig mo19584a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Builder mo19585b(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Builder mo19586c(long j);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Builder mo19587d(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract Builder mo19588e(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract Builder mo19589f(long j);
    }

    EventStoreConfig() {
    }

    /* renamed from: a */
    static Builder m1508a() {
        return new AutoValue_EventStoreConfig.Builder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo19576b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract long mo19577c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo19578d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo19579e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract long mo19581f();
}
