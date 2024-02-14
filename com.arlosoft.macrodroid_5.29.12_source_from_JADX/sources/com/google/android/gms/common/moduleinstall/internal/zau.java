package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zau extends zaa {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f3839a;

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f3840c;

    /* renamed from: d */
    final /* synthetic */ InstallStatusListener f3841d;

    /* renamed from: f */
    final /* synthetic */ zay f3842f;

    zau(zay zay, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, InstallStatusListener installStatusListener) {
        this.f3842f = zay;
        this.f3839a = atomicReference;
        this.f3840c = taskCompletionSource;
        this.f3841d = installStatusListener;
    }

    /* renamed from: D9 */
    public final void mo21864D9(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f3839a.set(moduleInstallResponse);
        }
        TaskUtil.m3880d(status, null, this.f3840c);
        if (!status.mo21297q2() || (moduleInstallResponse != null && moduleInstallResponse.mo21854m2())) {
            this.f3842f.mo21233s(ListenerHolders.m3812b(this.f3841d, InstallStatusListener.class.getSimpleName()), 27306);
        }
    }
}
