package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzr implements AppSetIdClient {

    /* renamed from: a */
    private final AppSetIdClient f39094a;

    /* renamed from: b */
    private final AppSetIdClient f39095b;

    public zzr(Context context) {
        this.f39094a = new zzp(context, GoogleApiAvailabilityLight.m3542h());
        this.f39095b = zzl.m55614c(context);
    }

    /* renamed from: a */
    public static /* synthetic */ Task m55626a(zzr zzr, Task task) {
        if (task.mo23719t() || task.mo23717r()) {
            return task;
        }
        Exception o = task.mo23714o();
        if (!(o instanceof ApiException)) {
            return task;
        }
        int b = ((ApiException) o).mo21210b();
        if (b == 43001 || b == 43002 || b == 43003 || b == 17) {
            return zzr.f39095b.mo20736h();
        }
        if (b == 43000) {
            return Tasks.m66666e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
        }
        if (b != 15) {
            return task;
        }
        return Tasks.m66666e(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    /* renamed from: h */
    public final Task<AppSetIdInfo> mo20736h() {
        return this.f39094a.mo20736h().mo23712m(new zzq(this));
    }
}
