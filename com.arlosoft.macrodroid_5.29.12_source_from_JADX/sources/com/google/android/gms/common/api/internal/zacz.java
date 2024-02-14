package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zacz extends zau {

    /* renamed from: a */
    final /* synthetic */ zada f3438a;

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            PendingResult pendingResult = (PendingResult) message.obj;
            synchronized (this.f3438a.f3444g) {
                zada zada = (zada) Preconditions.m4488k(this.f3438a.f3441c);
                if (pendingResult == null) {
                    zada.m4198j(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacp) {
                    zada.m4198j(((zacp) pendingResult).mo21503h());
                } else {
                    zada.mo21516i(pendingResult);
                }
            }
        } else if (i != 1) {
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
    }
}
