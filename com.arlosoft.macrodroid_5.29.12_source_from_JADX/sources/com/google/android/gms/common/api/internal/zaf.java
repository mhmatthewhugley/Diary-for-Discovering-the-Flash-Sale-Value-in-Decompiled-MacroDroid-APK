package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaf extends zad {

    /* renamed from: c */
    public final zaci f3454c;

    public zaf(zaci zaci, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f3454c = zaci;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo21513d(@NonNull zaad zaad, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo21496f(zabq zabq) {
        return this.f3454c.f3415a.mo21394f();
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo21497g(zabq zabq) {
        return this.f3454c.f3415a.mo21391c();
    }

    /* renamed from: h */
    public final void mo21514h(zabq zabq) throws RemoteException {
        this.f3454c.f3415a.mo21392d(zabq.mo21485s(), this.f3439b);
        ListenerHolder.ListenerKey b = this.f3454c.f3415a.mo21390b();
        if (b != null) {
            zabq.mo21486u().put(b, this.f3454c);
        }
    }
}
