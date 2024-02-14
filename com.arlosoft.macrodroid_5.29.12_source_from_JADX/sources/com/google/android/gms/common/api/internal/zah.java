package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zah extends zad {

    /* renamed from: c */
    public final ListenerHolder.ListenerKey f3458c;

    public zah(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f3458c = listenerKey;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo21513d(@NonNull zaad zaad, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo21496f(zabq zabq) {
        zaci zaci = (zaci) zabq.mo21486u().get(this.f3458c);
        return zaci != null && zaci.f3415a.mo21394f();
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo21497g(zabq zabq) {
        zaci zaci = (zaci) zabq.mo21486u().get(this.f3458c);
        if (zaci == null) {
            return null;
        }
        return zaci.f3415a.mo21391c();
    }

    /* renamed from: h */
    public final void mo21514h(zabq zabq) throws RemoteException {
        zaci zaci = (zaci) zabq.mo21486u().remove(this.f3458c);
        if (zaci != null) {
            zaci.f3416b.mo21411b(zabq.mo21485s(), this.f3439b);
            zaci.f3415a.mo21389a();
            return;
        }
        this.f3439b.mo56141e(Boolean.FALSE);
    }
}
