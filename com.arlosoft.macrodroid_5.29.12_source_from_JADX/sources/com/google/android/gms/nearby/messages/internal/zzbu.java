package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
abstract class zzbu extends BaseImplementation.ApiMethodImpl {

    /* renamed from: t */
    private final ListenerHolder f47775t;

    @KeepForSdk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        super.mo21329l((Result) obj);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        return status;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final ListenerHolder mo55981z() {
        return this.f47775t;
    }
}
