package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class DataHolderResult implements Result, Releasable {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    protected final Status f3175a;
    @NonNull
    @KeepForSdk

    /* renamed from: c */
    protected final DataHolder f3176c;

    @NonNull
    @KeepForSdk
    public Status getStatus() {
        return this.f3175a;
    }

    @KeepForSdk
    public void release() {
        DataHolder dataHolder = this.f3176c;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
