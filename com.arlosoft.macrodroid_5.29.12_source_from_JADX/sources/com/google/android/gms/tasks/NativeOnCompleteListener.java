package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* renamed from: a */
    private final long f47994a;

    @KeepForSdk
    /* renamed from: a */
    public void mo21120a(@NonNull Task<Object> task) {
        String str;
        Object obj;
        Exception o;
        if (task.mo23719t()) {
            obj = task.mo23715p();
            str = null;
        } else if (task.mo23717r() || (o = task.mo23714o()) == null) {
            obj = null;
            str = null;
        } else {
            str = o.getMessage();
            obj = null;
        }
        nativeOnComplete(this.f47994a, obj, task.mo23719t(), task.mo23717r(), str);
    }

    @KeepForSdk
    public native void nativeOnComplete(long j, @Nullable Object obj, boolean z, boolean z2, @Nullable String str);
}
