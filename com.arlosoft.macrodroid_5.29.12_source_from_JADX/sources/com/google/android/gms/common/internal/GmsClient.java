package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {

    /* renamed from: W */
    private final ClientSettings f3645W;

    /* renamed from: X */
    private final Set f3646X;
    @Nullable

    /* renamed from: Y */
    private final Account f3647Y;

    @KeepForSdk
    @Deprecated
    protected GmsClient(@NonNull Context context, @NonNull Looper looper, int i, @NonNull ClientSettings clientSettings, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    /* renamed from: q0 */
    private final Set m4436q0(@NonNull Set set) {
        Set<Scope> p0 = mo21695p0(set);
        for (Scope contains : p0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return p0;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: B */
    public final Executor mo21619B() {
        return null;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: H */
    public final Set<Scope> mo21625H() {
        return this.f3646X;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: l */
    public Set<Scope> mo21203l() {
        return mo21648j() ? this.f3646X : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: o0 */
    public final ClientSettings mo21694o0() {
        return this.f3645W;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: p0 */
    public Set<Scope> mo21695p0(@NonNull Set<Scope> set) {
        return set;
    }

    @Nullable
    /* renamed from: z */
    public final Account mo21658z() {
        return this.f3647Y;
    }

    @KeepForSdk
    protected GmsClient(@NonNull Context context, @NonNull Looper looper, int i, @NonNull ClientSettings clientSettings, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.m4444c(context), GoogleApiAvailability.m3521q(), i, clientSettings, (ConnectionCallbacks) Preconditions.m4488k(connectionCallbacks), (OnConnectionFailedListener) Preconditions.m4488k(onConnectionFailedListener));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected GmsClient(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull android.os.Looper r12, @androidx.annotation.NonNull com.google.android.gms.common.internal.GmsClientSupervisor r13, @androidx.annotation.NonNull com.google.android.gms.common.GoogleApiAvailability r14, int r15, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r16, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.ConnectionCallbacks r17, @androidx.annotation.Nullable com.google.android.gms.common.api.internal.OnConnectionFailedListener r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.zah r3 = new com.google.android.gms.common.internal.zah
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.zai r0 = new com.google.android.gms.common.internal.zai
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo21677k()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f3645W = r0
            android.accounts.Account r1 = r16.mo21668b()
            r9.f3647Y = r1
            java.util.Set r0 = r16.mo21671e()
            java.util.Set r0 = r10.m4436q0(r0)
            r9.f3646X = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClient.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.GmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailability, int, com.google.android.gms.common.internal.ClientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }
}