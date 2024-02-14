package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.zzm;

public abstract class zzg<A extends Api.Client> extends zzm.zzb<PlacePhotoMetadataResult, A> {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public /* synthetic */ Result mo21036h(Status status) {
        return new PlacePhotoMetadataResult(status, (DataHolder) null);
    }
}
