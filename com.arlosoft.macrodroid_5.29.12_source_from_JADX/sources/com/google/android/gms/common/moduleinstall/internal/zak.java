package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class zak implements SuccessContinuation {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f3825a;

    /* renamed from: a */
    public final Task mo21121a(Object obj) {
        AtomicReference atomicReference = this.f3825a;
        Void voidR = (Void) obj;
        int i = zay.f3849n;
        if (atomicReference.get() != null) {
            return Tasks.m66667f((ModuleInstallResponse) atomicReference.get());
        }
        return Tasks.m66666e(new ApiException(Status.f3140z));
    }
}
