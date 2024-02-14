package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzas extends IStatusCallback.Stub {

    /* renamed from: a */
    final /* synthetic */ List f44555a;

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f44556c;

    zzas(zzax zzax, List list, TaskCompletionSource taskCompletionSource) {
        this.f44555a = list;
        this.f44556c = taskCompletionSource;
    }

    /* renamed from: j8 */
    public final void mo21356j8(Status status) {
        for (ParcelFileDescriptor close : this.f44555a) {
            try {
                close.close();
            } catch (IOException e) {
                Log.w("ExposureNotification", "Failed to close file", e);
            }
        }
        TaskUtil.m3880d(status, null, this.f44556c);
    }
}
