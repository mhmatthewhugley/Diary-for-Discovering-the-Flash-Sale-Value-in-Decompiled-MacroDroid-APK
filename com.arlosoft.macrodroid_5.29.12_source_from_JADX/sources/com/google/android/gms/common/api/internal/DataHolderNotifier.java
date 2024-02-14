package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class DataHolderNotifier<L> implements ListenerHolder.Notifier<L> {

    /* renamed from: a */
    private final DataHolder f3174a;

    @KeepForSdk
    /* renamed from: a */
    public final void mo21337a(@NonNull L l) {
        mo21339c(l, this.f3174a);
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo21338b() {
        DataHolder dataHolder = this.f3174a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: c */
    public abstract void mo21339c(@NonNull L l, @NonNull DataHolder dataHolder);
}
