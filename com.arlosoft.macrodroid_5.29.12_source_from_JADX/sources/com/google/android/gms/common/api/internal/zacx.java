package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zacx implements Continuation {
    zacx() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21119a(@NonNull Task task) throws Exception {
        if (((Boolean) task.mo23715p()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
