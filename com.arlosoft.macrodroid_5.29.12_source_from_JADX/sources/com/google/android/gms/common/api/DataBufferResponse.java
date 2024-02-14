package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    public final void close() {
        ((AbstractDataBuffer) mo21278c()).close();
    }

    @NonNull
    public final T get(int i) {
        return ((AbstractDataBuffer) mo21278c()).get(i);
    }

    public final int getCount() {
        return ((AbstractDataBuffer) mo21278c()).getCount();
    }

    @NonNull
    public final Iterator<T> iterator() {
        return ((AbstractDataBuffer) mo21278c()).iterator();
    }

    public final void release() {
        ((AbstractDataBuffer) mo21278c()).release();
    }
}
