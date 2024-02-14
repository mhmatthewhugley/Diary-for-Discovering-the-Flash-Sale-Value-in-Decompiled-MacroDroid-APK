package com.google.android.gms.wearable;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.google.android.gms.wearable.internal.zzdd;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class DataEventBuffer extends EntityBuffer<DataEvent> implements Result {

    /* renamed from: f */
    private final Status f48079f;

    public DataEventBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
        this.f48079f = new Status(dataHolder.mo21571p2());
    }

    @NonNull
    public Status getStatus() {
        return this.f48079f;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo21580h(int i, int i2) {
        return new zzdd(this.f3506a, i, i2);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: i */
    public final String mo21581i() {
        return ClientCookie.PATH_ATTR;
    }
}
