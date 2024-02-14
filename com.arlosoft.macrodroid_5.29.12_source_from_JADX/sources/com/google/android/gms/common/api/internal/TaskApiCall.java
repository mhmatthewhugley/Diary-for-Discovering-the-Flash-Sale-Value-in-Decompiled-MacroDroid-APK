package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    @Nullable

    /* renamed from: a */
    private final Feature[] f3235a;

    /* renamed from: b */
    private final boolean f3236b;

    /* renamed from: c */
    private final int f3237c;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class Builder<A extends Api.AnyClient, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public RemoteCall f3238a;

        /* renamed from: b */
        private boolean f3239b = true;

        /* renamed from: c */
        private Feature[] f3240c;

        /* renamed from: d */
        private int f3241d = 0;

        private Builder() {
        }

        /* synthetic */ Builder(zacw zacw) {
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public TaskApiCall<A, ResultT> mo21405a() {
            Preconditions.m4479b(this.f3238a != null, "execute parameter required");
            return new zacv(this, this.f3240c, this.f3239b, this.f3241d);
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: b */
        public Builder<A, ResultT> mo21406b(@NonNull RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.f3238a = remoteCall;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: c */
        public Builder<A, ResultT> mo21407c(boolean z) {
            this.f3239b = z;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: d */
        public Builder<A, ResultT> mo21408d(@NonNull Feature... featureArr) {
            this.f3240c = featureArr;
            return this;
        }

        @CanIgnoreReturnValue
        @NonNull
        @KeepForSdk
        /* renamed from: e */
        public Builder<A, ResultT> mo21409e(int i) {
            this.f3241d = i;
            return this;
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.f3235a = null;
        this.f3236b = false;
        this.f3237c = 0;
    }

    @KeepForSdk
    protected TaskApiCall(@Nullable Feature[] featureArr, boolean z, int i) {
        this.f3235a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f3236b = z2;
        this.f3237c = i;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> m3866c() {
        return new Builder<>((zacw) null);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: d */
    public abstract void mo20779d(@NonNull A a, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    /* renamed from: e */
    public boolean mo21402e() {
        return this.f3236b;
    }

    /* renamed from: f */
    public final int mo21403f() {
        return this.f3237c;
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo21404g() {
        return this.f3235a;
    }
}
