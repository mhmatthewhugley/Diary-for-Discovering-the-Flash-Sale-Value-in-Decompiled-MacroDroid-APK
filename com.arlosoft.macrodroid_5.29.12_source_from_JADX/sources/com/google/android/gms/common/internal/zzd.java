package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzd extends zzab {
    @Nullable

    /* renamed from: a */
    private BaseGmsClient f3753a;

    /* renamed from: c */
    private final int f3754c;

    public zzd(@NonNull BaseGmsClient baseGmsClient, int i) {
        this.f3753a = baseGmsClient;
        this.f3754c = i;
    }

    @BinderThread
    /* renamed from: R9 */
    public final void mo21712R9(int i, @NonNull IBinder iBinder, @NonNull zzj zzj) {
        BaseGmsClient baseGmsClient = this.f3753a;
        Preconditions.m4489l(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.m4488k(zzj);
        BaseGmsClient.m4353h0(baseGmsClient, zzj);
        mo21713S3(i, iBinder, zzj.f3760a);
    }

    @BinderThread
    /* renamed from: S3 */
    public final void mo21713S3(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        Preconditions.m4489l(this.f3753a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f3753a.mo21634S(i, iBinder, bundle, this.f3754c);
        this.f3753a = null;
    }

    @BinderThread
    /* renamed from: t0 */
    public final void mo21714t0(int i, @Nullable Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
