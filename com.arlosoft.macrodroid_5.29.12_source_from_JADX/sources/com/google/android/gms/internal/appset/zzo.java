package com.google.android.gms.internal.appset;

import androidx.annotation.Nullable;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
final class zzo extends zze {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f39087a;

    zzo(zzp zzp, TaskCompletionSource taskCompletionSource) {
        this.f39087a = taskCompletionSource;
    }

    /* renamed from: e4 */
    public final void mo48488e4(Status status, @Nullable zzc zzc) {
        TaskUtil.m3878b(status, zzc != null ? new AppSetIdInfo(zzc.mo20742l2(), zzc.zza()) : null, this.f39087a);
    }
}
