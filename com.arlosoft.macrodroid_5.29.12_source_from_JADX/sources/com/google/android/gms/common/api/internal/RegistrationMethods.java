package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class RegistrationMethods<A extends Api.AnyClient, L> {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    public final RegisterListenerMethod<A, L> f3224a;
    @NonNull

    /* renamed from: b */
    public final UnregisterListenerMethod f3225b;
    @NonNull

    /* renamed from: c */
    public final Runnable f3226c;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class Builder<A extends Api.AnyClient, L> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public RemoteCall f3227a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public RemoteCall f3228b;

        /* renamed from: c */
        private Runnable f3229c = zacj.f3418a;

        /* renamed from: d */
        private ListenerHolder f3230d;

        /* renamed from: e */
        private Feature[] f3231e;

        /* renamed from: f */
        private boolean f3232f = true;

        /* renamed from: g */
        private int f3233g;

        private Builder() {
        }

        /* synthetic */ Builder(zacm zacm) {
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public RegistrationMethods<A, L> mo21395a() {
            boolean z = true;
            Preconditions.m4479b(this.f3227a != null, "Must set register function");
            Preconditions.m4479b(this.f3228b != null, "Must set unregister function");
            if (this.f3230d == null) {
                z = false;
            }
            Preconditions.m4479b(z, "Must set holder");
            return new RegistrationMethods<>(new zack(this, this.f3230d, this.f3231e, this.f3232f, this.f3233g), new zacl(this, (ListenerHolder.ListenerKey) Preconditions.m4489l(this.f3230d.mo21376b(), "Key must not be null")), this.f3229c, (zacn) null);
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: b */
        public Builder<A, L> mo21396b(@NonNull RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.f3227a = remoteCall;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: c */
        public Builder<A, L> mo21397c(@NonNull Feature... featureArr) {
            this.f3231e = featureArr;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: d */
        public Builder<A, L> mo21398d(int i) {
            this.f3233g = i;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: e */
        public Builder<A, L> mo21399e(@NonNull RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.f3228b = remoteCall;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: f */
        public Builder<A, L> mo21400f(@NonNull ListenerHolder<L> listenerHolder) {
            this.f3230d = listenerHolder;
            return this;
        }
    }

    /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, zacn zacn) {
        this.f3224a = registerListenerMethod;
        this.f3225b = unregisterListenerMethod;
        this.f3226c = runnable;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <A extends Api.AnyClient, L> Builder<A, L> m3853a() {
        return new Builder<>((zacm) null);
    }
}
